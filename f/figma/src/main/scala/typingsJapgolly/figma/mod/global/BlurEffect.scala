package typingsJapgolly.figma.mod.global

import typingsJapgolly.figma.figmaStrings.BACKGROUND_BLUR
import typingsJapgolly.figma.figmaStrings.LAYER_BLUR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlurEffect
  extends StObject
     with Effect {
  
  val radius: Double
  
  val `type`: LAYER_BLUR | BACKGROUND_BLUR
  
  val visible: Boolean
}
object BlurEffect {
  
  inline def apply(radius: Double, `type`: LAYER_BLUR | BACKGROUND_BLUR, visible: Boolean): BlurEffect = {
    val __obj = js.Dynamic.literal(radius = radius.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlurEffect]
  }
  
  extension [Self <: BlurEffect](x: Self) {
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setType(value: LAYER_BLUR | BACKGROUND_BLUR): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
