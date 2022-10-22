package typingsJapgolly.p2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContactMaterialOptions extends StObject {
  
  var friction: js.UndefOr[Double] = js.undefined
  
  var frictionRelaxation: js.UndefOr[Double] = js.undefined
  
  var frictionStiffness: js.UndefOr[Double] = js.undefined
  
  var relaxation: js.UndefOr[Double] = js.undefined
  
  var restitution: js.UndefOr[Double] = js.undefined
  
  var stiffness: js.UndefOr[Double] = js.undefined
  
  var surfaceVelocity: js.UndefOr[Double] = js.undefined
}
object ContactMaterialOptions {
  
  inline def apply(): ContactMaterialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactMaterialOptions]
  }
  
  extension [Self <: ContactMaterialOptions](x: Self) {
    
    inline def setFriction(value: Double): Self = StObject.set(x, "friction", value.asInstanceOf[js.Any])
    
    inline def setFrictionRelaxation(value: Double): Self = StObject.set(x, "frictionRelaxation", value.asInstanceOf[js.Any])
    
    inline def setFrictionRelaxationUndefined: Self = StObject.set(x, "frictionRelaxation", js.undefined)
    
    inline def setFrictionStiffness(value: Double): Self = StObject.set(x, "frictionStiffness", value.asInstanceOf[js.Any])
    
    inline def setFrictionStiffnessUndefined: Self = StObject.set(x, "frictionStiffness", js.undefined)
    
    inline def setFrictionUndefined: Self = StObject.set(x, "friction", js.undefined)
    
    inline def setRelaxation(value: Double): Self = StObject.set(x, "relaxation", value.asInstanceOf[js.Any])
    
    inline def setRelaxationUndefined: Self = StObject.set(x, "relaxation", js.undefined)
    
    inline def setRestitution(value: Double): Self = StObject.set(x, "restitution", value.asInstanceOf[js.Any])
    
    inline def setRestitutionUndefined: Self = StObject.set(x, "restitution", js.undefined)
    
    inline def setStiffness(value: Double): Self = StObject.set(x, "stiffness", value.asInstanceOf[js.Any])
    
    inline def setStiffnessUndefined: Self = StObject.set(x, "stiffness", js.undefined)
    
    inline def setSurfaceVelocity(value: Double): Self = StObject.set(x, "surfaceVelocity", value.asInstanceOf[js.Any])
    
    inline def setSurfaceVelocityUndefined: Self = StObject.set(x, "surfaceVelocity", js.undefined)
  }
}
