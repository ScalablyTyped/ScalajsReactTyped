package typingsJapgolly.ol

import typingsJapgolly.ol.baseImageMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/layer/Image", JSImport.Namespace)
@js.native
object imageMod extends js.Object {
  @js.native
  trait ImageLayer
    extends typingsJapgolly.ol.baseImageMod.default
  
  @js.native
  class default () extends ImageLayer {
    def this(opt_options: Options) = this()
  }
  
}

