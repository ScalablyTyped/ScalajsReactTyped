package typingsJapgolly.ol

import typingsJapgolly.ol.baseTileMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/layer/Tile", JSImport.Namespace)
@js.native
object tileMod extends js.Object {
  @js.native
  trait TileLayer
    extends typingsJapgolly.ol.baseTileMod.default
  
  @js.native
  class default () extends TileLayer {
    def this(opt_options: Options) = this()
  }
  
}

