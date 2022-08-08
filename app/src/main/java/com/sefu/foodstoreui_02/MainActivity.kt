package com.sefu.foodstoreui_02

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.KeyboardArrowLeft
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sefu.foodstoreui_02.ui.theme.FoodStoreUi02Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FoodStoreUi02Theme {
            MainScreen()
            }
        }
    }
}


@Composable
fun MainScreen() {
    Column(horizontalAlignment = Alignment.CenterHorizontally,modifier = Modifier.fillMaxSize().background(color = Color.White).padding(horizontal = 24.dp, vertical = 16.dp)) {
TopBar()
    }
}

@Composable
fun TopBar(modifier: Modifier = Modifier) {

        Row(
            modifier=Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier= Modifier
                    .clip(shape = RoundedCornerShape(30.dp))
                    .size(24.dp)
                    .background(colorResource(id = R.color.light_white))
            ) {
                Icon(
                    Icons.Rounded.KeyboardArrowLeft,
                    contentDescription = "Arrow",
                    tint = colorResource(
                        id = R.color.orange
                    )
                )
            }

            Box(
                modifier= Modifier
                    .clip(shape = RoundedCornerShape(30.dp))
                    .size(24.dp)
                    .background(colorResource(id = R.color.orange))
            ) {
                Icon(
                    Icons.Rounded.ShoppingCart,
                    contentDescription = "cart",
                    modifier=Modifier.padding(4.dp),
                    tint = Color.White
                )
            }
        }
        Spacer(modifier.height(16.dp))
        Image(
            modifier = Modifier.size(200.dp),
            painter = painterResource(id = R.drawable.bugger),
            contentDescription = "burger"
        )


}

@Preview
@Composable
fun MainScreenPreview() {
    FoodStoreUi02Theme {
        MainScreen()
    }
}

@Preview(showBackground = true)
@Composable
fun TopBarPreview() {
    FoodStoreUi02Theme {
        TopBar()
    }
}