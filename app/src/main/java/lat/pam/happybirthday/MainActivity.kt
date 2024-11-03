package lat.pam.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import lat.pam.happybirthday.ui.theme.HappyBirthdayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BirthdayCard(
                        message = "Happy Birthday Herdin!",
                        from = "From Kaisya",
                        modifier = Modifier.padding(16.dp)
                    )
                }
            }
        }
    }
}

@Composable
fun BirthdayCard(message: String, from: String, modifier: Modifier = Modifier) {
    Surface(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp),
        shape = RoundedCornerShape(16.dp),
        color = Color(0xFFE3F2FD) // Background warna biru muda
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(24.dp)
        ) {
            Text(
                text = message,
                fontSize = 36.sp, // Ukuran font lebih kecil
                fontWeight = FontWeight.Bold,
                color = Color(0xFF1E88E5), // Warna biru untuk teks
                textAlign = TextAlign.Center,
                lineHeight = 42.sp, // Memberikan jarak antar-baris
                modifier = Modifier.padding(bottom = 16.dp) // Menambahkan jarak di bawah teks
            )
            Text(
                text = from,
                fontSize = 20.sp, // Ukuran font lebih kecil untuk pengirim
                fontWeight = FontWeight.SemiBold,
                color = Color(0xFF757575), // Warna abu-abu gelap
                textAlign = TextAlign.End,
                modifier = Modifier.align(alignment = Alignment.End)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    HappyBirthdayTheme {
        BirthdayCard(
            message = "Happy Birthday Herdin!",
            from = "From Kaisya"
        )
    }
}
