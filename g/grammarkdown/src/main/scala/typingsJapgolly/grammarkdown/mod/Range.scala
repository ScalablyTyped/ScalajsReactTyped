package typingsJapgolly.grammarkdown.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "Range")
@js.native
object Range extends js.Object {
  def clone(range: typingsJapgolly.grammarkdown.coreMod.Range): typingsJapgolly.grammarkdown.coreMod.Range = js.native
  def collapseToEnd(range: typingsJapgolly.grammarkdown.coreMod.Range): typingsJapgolly.grammarkdown.coreMod.Range = js.native
  def collapseToStart(range: typingsJapgolly.grammarkdown.coreMod.Range): typingsJapgolly.grammarkdown.coreMod.Range = js.native
  def contains(
    left: typingsJapgolly.grammarkdown.coreMod.Range,
    right: typingsJapgolly.grammarkdown.coreMod.Range
  ): Boolean = js.native
  def containsPosition(
    range: typingsJapgolly.grammarkdown.coreMod.Range,
    position: typingsJapgolly.grammarkdown.coreMod.Position
  ): Boolean = js.native
  def create(
    start: typingsJapgolly.grammarkdown.coreMod.Position,
    end: typingsJapgolly.grammarkdown.coreMod.Position
  ): typingsJapgolly.grammarkdown.coreMod.Range = js.native
  def equals(
    left: typingsJapgolly.grammarkdown.coreMod.Range,
    right: typingsJapgolly.grammarkdown.coreMod.Range
  ): Boolean = js.native
  def intersects(
    left: typingsJapgolly.grammarkdown.coreMod.Range,
    right: typingsJapgolly.grammarkdown.coreMod.Range
  ): Boolean = js.native
  def isCollapsed(range: typingsJapgolly.grammarkdown.coreMod.Range): Boolean = js.native
}

