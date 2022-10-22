package typingsJapgolly.figma.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConstraintMixin extends StObject {
  
  var constraints: Constraints
}
object ConstraintMixin {
  
  inline def apply(constraints: Constraints): ConstraintMixin = {
    val __obj = js.Dynamic.literal(constraints = constraints.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstraintMixin]
  }
  
  extension [Self <: ConstraintMixin](x: Self) {
    
    inline def setConstraints(value: Constraints): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
  }
}
