package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** contains a reference to a cell range. */
trait ComplexReference extends StObject {
  
  /** is the first reference. */
  var Reference1: SingleReference
  
  /** is the second reference. */
  var Reference2: SingleReference
}
object ComplexReference {
  
  inline def apply(Reference1: SingleReference, Reference2: SingleReference): ComplexReference = {
    val __obj = js.Dynamic.literal(Reference1 = Reference1.asInstanceOf[js.Any], Reference2 = Reference2.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComplexReference]
  }
  
  extension [Self <: ComplexReference](x: Self) {
    
    inline def setReference1(value: SingleReference): Self = StObject.set(x, "Reference1", value.asInstanceOf[js.Any])
    
    inline def setReference2(value: SingleReference): Self = StObject.set(x, "Reference2", value.asInstanceOf[js.Any])
  }
}
