package typingsJapgolly.paypalPaypalJs.anon

import typingsJapgolly.paypalPaypalJs.paypalPaypalJsStrings.A
import typingsJapgolly.paypalPaypalJs.paypalPaypalJsStrings.B
import typingsJapgolly.paypalPaypalJs.paypalPaypalJsStrings.C
import typingsJapgolly.paypalPaypalJs.paypalPaypalJsStrings.D
import typingsJapgolly.paypalPaypalJs.paypalPaypalJsStrings.I
import typingsJapgolly.paypalPaypalJs.paypalPaypalJsStrings.N
import typingsJapgolly.paypalPaypalJs.paypalPaypalJsStrings.R
import typingsJapgolly.paypalPaypalJs.paypalPaypalJsStrings.U
import typingsJapgolly.paypalPaypalJs.paypalPaypalJsStrings.Y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  authentication_status :'Y' | 'N' | 'U' | 'A' | 'C' | 'R' | 'D' | 'I',   enrollment_status :'Y' | 'N' | 'U' | 'B'}> */
trait Partialauthenticationstat extends StObject {
  
  var authentication_status: js.UndefOr[Y | N | U | A | C | R | D | I] = js.undefined
  
  var enrollment_status: js.UndefOr[Y | N | U | B] = js.undefined
}
object Partialauthenticationstat {
  
  inline def apply(): Partialauthenticationstat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partialauthenticationstat]
  }
  
  extension [Self <: Partialauthenticationstat](x: Self) {
    
    inline def setAuthentication_status(value: Y | N | U | A | C | R | D | I): Self = StObject.set(x, "authentication_status", value.asInstanceOf[js.Any])
    
    inline def setAuthentication_statusUndefined: Self = StObject.set(x, "authentication_status", js.undefined)
    
    inline def setEnrollment_status(value: Y | N | U | B): Self = StObject.set(x, "enrollment_status", value.asInstanceOf[js.Any])
    
    inline def setEnrollment_statusUndefined: Self = StObject.set(x, "enrollment_status", js.undefined)
  }
}
