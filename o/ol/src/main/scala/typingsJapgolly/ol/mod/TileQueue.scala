package typingsJapgolly.ol.mod

import typingsJapgolly.ol.tileQueueMod.PriorityFunction
import typingsJapgolly.ol.tileQueueMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol", "TileQueue")
@js.native
class TileQueue protected () extends default {
  def this(tilePriorityFunction: PriorityFunction, tileChangeCallback: js.Function0[_]) = this()
}

