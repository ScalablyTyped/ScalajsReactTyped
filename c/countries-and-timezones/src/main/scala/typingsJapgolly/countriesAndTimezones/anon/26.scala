package typingsJapgolly.countriesAndTimezones.anon

import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.BI
import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.BW
import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.MW
import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.MZ
import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.RW
import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.ZM
import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.ZW
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `26` extends StObject {
  
  var c: js.Tuple8[
    MZ, 
    BI, 
    BW, 
    typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.CD, 
    MW, 
    RW, 
    ZM, 
    ZW
  ]
  
  var u: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`120`
}
object `26` {
  
  inline def apply(
    c: js.Tuple8[
      MZ, 
      BI, 
      BW, 
      typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.CD, 
      MW, 
      RW, 
      ZM, 
      ZW
    ]
  ): `26` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 120)
    __obj.asInstanceOf[`26`]
  }
  
  extension [Self <: `26`](x: Self) {
    
    inline def setC(
      value: js.Tuple8[
          MZ, 
          BI, 
          BW, 
          typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.CD, 
          MW, 
          RW, 
          ZM, 
          ZW
        ]
    ): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setU(value: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`120`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
