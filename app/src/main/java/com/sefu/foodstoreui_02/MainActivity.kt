package com.sefu.foodstoreui_02

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.KeyboardArrowLeft
import androidx.compose.material.icons.rounded.LocationOn
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.material.icons.rounded.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
    Column(
        horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
            .padding(top = 16.dp)
    ) {
        TopBar()
        CartContent()
    }
}

@Composable
fun TopBar(modifier: Modifier = Modifier) {

    Row(
        modifier = Modifier.fillMaxWidth().padding(horizontal = 36.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .clip(shape = RoundedCornerShape(20.dp))
                .size(36.dp)
                .background(colorResource(id = R.color.light_white)),
            contentAlignment = Alignment.Center
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
            modifier = Modifier
                .clip(shape = RoundedCornerShape(20.dp))
                .size(36.dp)
                .background(colorResource(id = R.color.orange)),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                Icons.Rounded.ShoppingCart,
                contentDescription = "cart",
                modifier = Modifier.padding(8.dp),
                tint = Color.White
            )
        }
    }
    Image(
        modifier = Modifier.size(300.dp),
        painter = painterResource(id = R.drawable.bugger),
        contentDescription = "burger"
    )


}

@Composable
fun CartContent(modifier: Modifier = Modifier) {
    Box(
        modifier
            .clip(shape = RoundedCornerShape(topStart = 60.dp))
            .fillMaxWidth()
            .background(colorResource(id = R.color.light_white))
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(vertical = 32.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier.fillMaxWidth()
            ) {
                Column() {
                    Text(text = "Cafe Raybin Wolf", fontSize = 28.sp, fontWeight = FontWeight.Bold)
                    Row(
                        horizontalArrangement = Arrangement.Start,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            Icons.Rounded.LocationOn,
                            contentDescription = "location",
                            tint = Color.Gray,
                            modifier = Modifier.size(16.dp)
                        )
                        Text(
                            text = "Portugal Street View",
                            fontSize = 16.sp,
                            style = TextStyle(color = Color.Gray),
                            modifier = Modifier.padding(8.dp)
                        )
                    }

                }
                Box(
                    modifier = Modifier
                        .clip(shape = RoundedCornerShape(12.dp))
                        .size(52.dp)
                        .background(colorResource(id = R.color.orange)),
                    contentAlignment = Alignment.Center
                )
                {
                    Row(
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.fillMaxSize()
                    ) {
                        Text(
                            text = "5",
                            style = TextStyle(color = Color.White),
                            fontWeight = FontWeight.Bold,
                            fontSize = 24.sp
                        )
                        Icon(
                            Icons.Rounded.Star, tint = Color.White, modifier = Modifier
                                .size(24.dp)
                                .padding(4.dp), contentDescription = ""
                        )
                    }
                }

            }
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier.fillMaxWidth()
            ) {
                Box(
                    modifier = Modifier
                        .clip(shape = RoundedCornerShape(8.dp))
                        .background(color = Color.White)
                        .size(width = 120.dp, height = 32.dp), contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "03483468282",
                        style = TextStyle(colorResource(id = R.color.orange))
                    )
                }
                Box(
                    modifier = Modifier
                        .clip(shape = RoundedCornerShape(8.dp))
                        .background(color = Color.White)
                        .size(width = 170.dp, height = 32.dp), contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "11:00 AM - 10.30 PM",
                        style = TextStyle(colorResource(id = R.color.orange))
                    )
                }
            }
            Spacer(modifier = Modifier.height(24.dp))
            Category()
        }
    }
}

@Composable
fun Category(modifier: Modifier = Modifier) {
    Column (modifier = modifier
        .fillMaxWidth()
        .padding(24.dp), horizontalAlignment = Alignment.CenterHorizontally){
        Box(
            modifier = Modifier
                .border(width = 0.5.dp, color = Color.Gray, shape = RoundedCornerShape(8.dp))
                .size(width = 300.dp, height = 32.dp),
            contentAlignment = Alignment.Center
        ) {
            Row(horizontalArrangement = Arrangement.SpaceAround, modifier = Modifier.fillMaxWidth()) {

                Text(
                    text = "Breakfast ",
                    modifier = Modifier.clickable { },
                    style = TextStyle(color = Color.Gray)
                )
                Text(
                    text = "Dinner ",
                    modifier = Modifier.clickable { },
                    style = TextStyle(color = Color.Gray)
                )
                Text(
                    text = "Lunch ",
                    modifier = Modifier.clickable { },
                    style = TextStyle(color = Color.Gray)
                )
                Text(
                    text = "Others ",
                    modifier = Modifier.clickable { },
                    style = TextStyle(color = Color.Gray)
                )

            }
        }
Spacer(modifier = Modifier.height(28.dp))
        ProductItem()
    }
}


    @Composable
    fun ProductItem() {
        Box(
            modifier = Modifier
                .clip(shape = RoundedCornerShape(16.dp))
                .fillMaxWidth()
                .background(color = Color.White)

        )  {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    modifier = Modifier
                        .clip(shape = RoundedCornerShape(50.dp))
                        .size(100.dp),
                    painter = painterResource(id = R.drawable.meat),

                    contentDescription = "chips"
                )
                Column() {
                    Text(text = "Beef With Salad")
                    Text(
                        text = "$25.00",
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        style = TextStyle(colorResource(id = R.color.orange))
                    )
                }
                Box(
                    modifier = Modifier
                        .clip(shape = RoundedCornerShape(8.dp))
                        .size(width = 80.dp, height = 52.dp)
                        .background(colorResource(id = R.color.light_orange)),
                    contentAlignment = Alignment.Center

                ) {
                    Text(text = "+ Add -", fontWeight = FontWeight.Bold)
                }


            }

        }
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

@Preview(showBackground = true)
@Composable
fun CartContentPreview() {
    FoodStoreUi02Theme {
        CartContent()
    }
}

@Preview(showBackground = true)
@Composable
fun CategoryPreview() {
    FoodStoreUi02Theme {
        Category()
    }
}

@Preview
@Composable
fun ProductItemPreview() {
    FoodStoreUi02Theme {
        ProductItem()
    }
}