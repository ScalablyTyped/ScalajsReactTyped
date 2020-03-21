package typingsJapgolly.ol

import typingsJapgolly.ol.baseVectorMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/layer/Vector", JSImport.Namespace)
@js.native
object vectorMod extends js.Object {
  @js.native
  trait VectorLayer
    extends typingsJapgolly.ol.baseVectorMod.default[
          typingsJapgolly.ol.sourceVectorMod.default[typingsJapgolly.ol.geometryMod.default]
        ]
  
  @js.native
  class default () extends VectorLayer {
    def this(opt_options: Options) = this()
  }
  
}

