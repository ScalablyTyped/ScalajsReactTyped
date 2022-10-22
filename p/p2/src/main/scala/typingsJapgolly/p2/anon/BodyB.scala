package typingsJapgolly.p2.anon

import typingsJapgolly.p2.mod.ContactEquation
import typingsJapgolly.p2.mod.Shape
import typingsJapgolly.p2.p2Strings.beginContact
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BodyB extends StObject {
  
  var bodyA: typingsJapgolly.p2.mod.Body
  
  var bodyB: typingsJapgolly.p2.mod.Body
  
  var contactEquations: js.Array[ContactEquation]
  
  var shapeA: Shape
  
  var shapeB: Shape
  
  var `type`: beginContact
}
object BodyB {
  
  inline def apply(
    bodyA: typingsJapgolly.p2.mod.Body,
    bodyB: typingsJapgolly.p2.mod.Body,
    contactEquations: js.Array[ContactEquation],
    shapeA: Shape,
    shapeB: Shape
  ): BodyB = {
    val __obj = js.Dynamic.literal(bodyA = bodyA.asInstanceOf[js.Any], bodyB = bodyB.asInstanceOf[js.Any], contactEquations = contactEquations.asInstanceOf[js.Any], shapeA = shapeA.asInstanceOf[js.Any], shapeB = shapeB.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("beginContact")
    __obj.asInstanceOf[BodyB]
  }
  
  extension [Self <: BodyB](x: Self) {
    
    inline def setBodyA(value: typingsJapgolly.p2.mod.Body): Self = StObject.set(x, "bodyA", value.asInstanceOf[js.Any])
    
    inline def setBodyB(value: typingsJapgolly.p2.mod.Body): Self = StObject.set(x, "bodyB", value.asInstanceOf[js.Any])
    
    inline def setContactEquations(value: js.Array[ContactEquation]): Self = StObject.set(x, "contactEquations", value.asInstanceOf[js.Any])
    
    inline def setContactEquationsVarargs(value: ContactEquation*): Self = StObject.set(x, "contactEquations", js.Array(value*))
    
    inline def setShapeA(value: Shape): Self = StObject.set(x, "shapeA", value.asInstanceOf[js.Any])
    
    inline def setShapeB(value: Shape): Self = StObject.set(x, "shapeB", value.asInstanceOf[js.Any])
    
    inline def setType(value: beginContact): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
