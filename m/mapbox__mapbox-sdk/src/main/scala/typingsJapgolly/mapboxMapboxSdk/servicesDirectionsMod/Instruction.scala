package typingsJapgolly.mapboxMapboxSdk.servicesDirectionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Instruction extends StObject {
  
  /**
    * Objects that, together, make up what should be displayed in the banner.
    * Includes additional information intended to be used to aid in visual layout
    */
  var components: js.Array[Component]
  
  /**
    * The degrees at which you will be exiting a roundabout, assuming 180 indicates going straight through the roundabout.
    */
  var degrees: js.UndefOr[Double] = js.undefined
  
  /**
    * A string representing which side the of the street people drive on in that location. Can be 'left' or 'right'.
    */
  var driving_side: DirectionsSide
  
  /**
    * The modifier for the maneuver. Can be used in combination with the type (and, if it is a roundabout, the degrees)
    * to for an icon to display. Possible values: 'left', 'right', 'slight left', 'slight right', 'sharp left', 'sharp right', 'straight', 'uturn'
    */
  var modifier: js.UndefOr[ManeuverModifier] = js.undefined
  
  /**
    * String that contains all the text that should be displayed.
    */
  var text: String
  
  /**
    * The type of maneuver. May be used in combination with the modifier (and, if it is a roundabout, the degrees) to for an icon to
    * display. Possible values: 'turn', 'merge', 'depart', 'arrive', 'fork', 'off ramp', 'roundabout'
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object Instruction {
  
  inline def apply(components: js.Array[Component], driving_side: DirectionsSide, text: String): Instruction = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], driving_side = driving_side.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Instruction]
  }
  
  extension [Self <: Instruction](x: Self) {
    
    inline def setComponents(value: js.Array[Component]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setComponentsVarargs(value: Component*): Self = StObject.set(x, "components", js.Array(value*))
    
    inline def setDegrees(value: Double): Self = StObject.set(x, "degrees", value.asInstanceOf[js.Any])
    
    inline def setDegreesUndefined: Self = StObject.set(x, "degrees", js.undefined)
    
    inline def setDriving_side(value: DirectionsSide): Self = StObject.set(x, "driving_side", value.asInstanceOf[js.Any])
    
    inline def setModifier(value: ManeuverModifier): Self = StObject.set(x, "modifier", value.asInstanceOf[js.Any])
    
    inline def setModifierUndefined: Self = StObject.set(x, "modifier", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
