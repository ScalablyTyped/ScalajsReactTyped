package typingsJapgolly.rotJs.mod

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.rotJs.PartialDisplayOptions
import typingsJapgolly.rotJs.TypeofRect
import typingsJapgolly.rotJs.TypeofTileGL
import typingsJapgolly.rotJs.displayMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js", "Display")
@js.native
class Display () extends default {
  def this(options: PartialDisplayOptions) = this()
}

/* static members */
@JSImport("rot-js", "Display")
@js.native
object Display extends js.Object {
  var Hex: Instantiable0[typingsJapgolly.rotJs.hexMod.default] = js.native
  var Rect: TypeofRect = js.native
  var Term: Instantiable0[typingsJapgolly.rotJs.termMod.default] = js.native
  var Tile: Instantiable0[typingsJapgolly.rotJs.tileMod.default] = js.native
  var TileGL: TypeofTileGL = js.native
}

