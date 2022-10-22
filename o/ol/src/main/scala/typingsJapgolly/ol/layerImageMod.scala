package typingsJapgolly.ol

import typingsJapgolly.ol.layerBaseImageMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layerImageMod {
  
  @JSImport("ol/layer/Image", JSImport.Default)
  @js.native
  open class default () extends ImageLayer {
    def this(opt_options: Options) = this()
  }
  
  @js.native
  trait ImageLayer
    extends typingsJapgolly.ol.layerBaseImageMod.default
}
