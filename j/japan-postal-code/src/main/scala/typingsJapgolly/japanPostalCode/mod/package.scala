package typingsJapgolly.japanPostalCode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback = js.Function1[/* addressData */ typingsJapgolly.japanPostalCode.mod.AddressData, scala.Unit]
  type FetchPostalCodeMethod = js.Function2[
    /* stringifiedPostalCode */ java.lang.String, 
    /* callback */ typingsJapgolly.japanPostalCode.mod.Callback, 
    scala.Unit
  ]
}
