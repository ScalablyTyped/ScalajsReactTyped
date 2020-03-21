package typingsJapgolly.address

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AddressCallback = js.Function2[/* err */ js.Error, /* addr */ typingsJapgolly.address.mod.Address, scala.Unit]
  type DnsCallback = js.Function2[/* err */ js.Error, /* servers */ js.Array[java.lang.String], scala.Unit]
  type MacCallback = js.Function2[/* err */ js.Error, /* addr */ java.lang.String, scala.Unit]
}
