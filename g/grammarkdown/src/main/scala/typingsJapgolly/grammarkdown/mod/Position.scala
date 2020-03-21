package typingsJapgolly.grammarkdown.mod

import typingsJapgolly.grammarkdown.grammarkdownNumbers.`-1`
import typingsJapgolly.grammarkdown.grammarkdownNumbers.`0`
import typingsJapgolly.grammarkdown.grammarkdownNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "Position")
@js.native
object Position extends js.Object {
  def clone(position: typingsJapgolly.grammarkdown.coreMod.Position): typingsJapgolly.grammarkdown.coreMod.Position = js.native
  def compare(
    left: typingsJapgolly.grammarkdown.coreMod.Position,
    right: typingsJapgolly.grammarkdown.coreMod.Position
  ): `1` | `0` | `-1` = js.native
  def create(line: Double, character: Double): typingsJapgolly.grammarkdown.coreMod.Position = js.native
  def equals(
    left: typingsJapgolly.grammarkdown.coreMod.Position,
    right: typingsJapgolly.grammarkdown.coreMod.Position
  ): Boolean = js.native
}

