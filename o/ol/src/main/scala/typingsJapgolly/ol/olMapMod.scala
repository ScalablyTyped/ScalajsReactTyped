package typingsJapgolly.ol

import typingsJapgolly.ol.pluggableMapMod.MapOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/Map", JSImport.Namespace)
@js.native
object olMapMod extends js.Object {
  @js.native
  trait Map
    extends typingsJapgolly.ol.pluggableMapMod.default
  
  @js.native
  class default protected () extends Map {
    def this(options: MapOptions) = this()
  }
  
}

