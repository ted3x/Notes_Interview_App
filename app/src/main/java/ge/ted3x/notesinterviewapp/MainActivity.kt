package ge.ted3x.notesinterviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/**
 * Note Model
 *
 * id - String
 * title - String
 * type - [ImageNote, TextNote]
 *
 * Image Note Model
 *
 * image - String(url)
 *
 * Text Note
 *
 * text - String
 *
 * https://run.mocky.io/v3/f9976553-941e-482e-9659-9deb70694610
 *
 *
 * Note custom view
 *
 * Image with rectangle shape around
 * Text inside circle shape
 *
 * Create CRUD generic repository with next functions
 *
 * Create(Add),
 * Get(Read)
 * Update,
 * Delete
 */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}