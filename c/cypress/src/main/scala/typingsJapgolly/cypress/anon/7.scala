package typingsJapgolly.cypress.anon

import typingsJapgolly.cypress.cypressStrings.element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `7` extends StObject {
  
  var prevSubject: js.Array[element]
}
object `7` {
  
  inline def apply(prevSubject: js.Array[element]): `7` = {
    val __obj = js.Dynamic.literal(prevSubject = prevSubject.asInstanceOf[js.Any])
    __obj.asInstanceOf[`7`]
  }
  
  extension [Self <: `7`](x: Self) {
    
    inline def setPrevSubject(value: js.Array[element]): Self = StObject.set(x, "prevSubject", value.asInstanceOf[js.Any])
    
    inline def setPrevSubjectVarargs(value: element*): Self = StObject.set(x, "prevSubject", js.Array(value*))
  }
}
