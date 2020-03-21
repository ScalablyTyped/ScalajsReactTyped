package typingsJapgolly.d3Chord.mod

import typingsJapgolly.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Chords extends Array[Chord_] {
  /**
    * An array of length n, where each group represents the combined outflow for node i,
    * corresponding to the elements matrix[i][0 … n - 1]
    */
  var groups: js.Array[ChordGroup] = js.native
}

