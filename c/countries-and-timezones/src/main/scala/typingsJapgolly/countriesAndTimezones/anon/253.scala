package typingsJapgolly.countriesAndTimezones.anon

import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashWinnipeg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `253` extends StObject {
  
  var a: AmericaSlashWinnipeg
  
  var r: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `253` {
  
  inline def apply(): `253` = {
    val __obj = js.Dynamic.literal(a = "America/Winnipeg", r = 1)
    __obj.asInstanceOf[`253`]
  }
  
  extension [Self <: `253`](x: Self) {
    
    inline def setA(value: AmericaSlashWinnipeg): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setR(value: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
