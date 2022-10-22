package typingsJapgolly.cypress.anon

import typingsJapgolly.cypress.cypressBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined cypress.Cypress.CommandOptions & {  prevSubject :true} */
trait CommandOptionsprevSubjectPrevSubject extends StObject {
  
  var prevSubject: (Boolean | typingsJapgolly.cypress.Cypress.PrevSubject | js.Array[typingsJapgolly.cypress.Cypress.PrevSubject]) & `true`
}
object CommandOptionsprevSubjectPrevSubject {
  
  inline def apply(
    prevSubject: (Boolean | typingsJapgolly.cypress.Cypress.PrevSubject | js.Array[typingsJapgolly.cypress.Cypress.PrevSubject]) & `true`
  ): CommandOptionsprevSubjectPrevSubject = {
    val __obj = js.Dynamic.literal(prevSubject = prevSubject.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandOptionsprevSubjectPrevSubject]
  }
  
  extension [Self <: CommandOptionsprevSubjectPrevSubject](x: Self) {
    
    inline def setPrevSubject(
      value: (Boolean | typingsJapgolly.cypress.Cypress.PrevSubject | js.Array[typingsJapgolly.cypress.Cypress.PrevSubject]) & `true`
    ): Self = StObject.set(x, "prevSubject", value.asInstanceOf[js.Any])
  }
}
