package typingsJapgolly.countriesAndTimezones.anon

import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashArgentinaSlashCatamarca
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AR extends StObject {
  
  var a: AmericaSlashArgentinaSlashCatamarca
  
  var r: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object AR {
  
  inline def apply(): AR = {
    val __obj = js.Dynamic.literal(a = "America/Argentina/Catamarca", r = 1)
    __obj.asInstanceOf[AR]
  }
  
  extension [Self <: AR](x: Self) {
    
    inline def setA(value: AmericaSlashArgentinaSlashCatamarca): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
