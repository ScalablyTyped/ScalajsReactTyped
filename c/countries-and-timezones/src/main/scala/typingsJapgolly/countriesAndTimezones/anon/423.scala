package typingsJapgolly.countriesAndTimezones.anon

import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashHonolulu
import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.US
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `423` extends StObject {
  
  var a: PacificSlashHonolulu
  
  var c: js.Array[US]
  
  var r: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `423` {
  
  inline def apply(c: js.Array[US]): `423` = {
    val __obj = js.Dynamic.literal(a = "Pacific/Honolulu", c = c.asInstanceOf[js.Any], r = 1)
    __obj.asInstanceOf[`423`]
  }
  
  extension [Self <: `423`](x: Self) {
    
    inline def setA(value: PacificSlashHonolulu): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setC(value: js.Array[US]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: US*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setR(value: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
