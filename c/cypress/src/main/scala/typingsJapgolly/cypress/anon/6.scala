package typingsJapgolly.cypress.anon

import typingsJapgolly.cypress.cypressStrings.optional
import typingsJapgolly.cypress.cypressStrings.window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `6` extends StObject {
  
  var prevSubject: window | js.Array[optional]
}
object `6` {
  
  inline def apply(prevSubject: window | js.Array[optional]): `6` = {
    val __obj = js.Dynamic.literal(prevSubject = prevSubject.asInstanceOf[js.Any])
    __obj.asInstanceOf[`6`]
  }
  
  extension [Self <: `6`](x: Self) {
    
    inline def setPrevSubject(value: window | js.Array[optional]): Self = StObject.set(x, "prevSubject", value.asInstanceOf[js.Any])
    
    inline def setPrevSubjectVarargs(value: optional*): Self = StObject.set(x, "prevSubject", js.Array(value*))
  }
}
