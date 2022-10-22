package typingsJapgolly.ol

import typingsJapgolly.ol.layerBaseVectorMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layerVectorMod {
  
  @JSImport("ol/layer/Vector", JSImport.Default)
  @js.native
  open class default () extends VectorLayer {
    def this(opt_options: Options) = this()
  }
  
  @js.native
  trait VectorLayer
    extends typingsJapgolly.ol.layerBaseVectorMod.default[
          typingsJapgolly.ol.sourceVectorMod.default[typingsJapgolly.ol.geomGeometryMod.default]
        ]
}
