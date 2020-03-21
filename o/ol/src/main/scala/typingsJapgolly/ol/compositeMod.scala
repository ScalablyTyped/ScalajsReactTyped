package typingsJapgolly.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/renderer/Composite", JSImport.Namespace)
@js.native
object compositeMod extends js.Object {
  @js.native
  trait CompositeMapRenderer
    extends typingsJapgolly.ol.mapMod.default
  
  @js.native
  class default protected () extends CompositeMapRenderer {
    def this(map: typingsJapgolly.ol.pluggableMapMod.default) = this()
  }
  
}

