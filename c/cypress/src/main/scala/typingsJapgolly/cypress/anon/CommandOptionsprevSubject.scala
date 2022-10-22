package typingsJapgolly.cypress.anon

import typingsJapgolly.cypress.cypressBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined cypress.Cypress.CommandOptions & {  prevSubject :false} */
trait CommandOptionsprevSubject extends StObject {
  
  var prevSubject: (Boolean | typingsJapgolly.cypress.Cypress.PrevSubject | js.Array[typingsJapgolly.cypress.Cypress.PrevSubject]) & `false`
}
object CommandOptionsprevSubject {
  
  inline def apply(
    prevSubject: (Boolean | typingsJapgolly.cypress.Cypress.PrevSubject | js.Array[typingsJapgolly.cypress.Cypress.PrevSubject]) & `false`
  ): CommandOptionsprevSubject = {
    val __obj = js.Dynamic.literal(prevSubject = prevSubject.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandOptionsprevSubject]
  }
  
  extension [Self <: CommandOptionsprevSubject](x: Self) {
    
    inline def setPrevSubject(
      value: (Boolean | typingsJapgolly.cypress.Cypress.PrevSubject | js.Array[typingsJapgolly.cypress.Cypress.PrevSubject]) & `false`
    ): Self = StObject.set(x, "prevSubject", value.asInstanceOf[js.Any])
  }
}
