package typingsJapgolly.editly.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * Special layers that can be used f.e. in the 'title-background' layer.
	 */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.editly.mod.RadialGradientLayer
  - typingsJapgolly.editly.mod.LinearGradientLayer
  - typingsJapgolly.editly.mod.FillColorLayer
*/
trait BackgroundLayer extends StObject
object BackgroundLayer {
  
  inline def FillColorLayer(): typingsJapgolly.editly.mod.FillColorLayer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("fill-color")
    __obj.asInstanceOf[typingsJapgolly.editly.mod.FillColorLayer]
  }
  
  inline def LinearGradientLayer(): typingsJapgolly.editly.mod.LinearGradientLayer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("linear-gradient")
    __obj.asInstanceOf[typingsJapgolly.editly.mod.LinearGradientLayer]
  }
  
  inline def RadialGradientLayer(): typingsJapgolly.editly.mod.RadialGradientLayer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("radial-gradient")
    __obj.asInstanceOf[typingsJapgolly.editly.mod.RadialGradientLayer]
  }
}
