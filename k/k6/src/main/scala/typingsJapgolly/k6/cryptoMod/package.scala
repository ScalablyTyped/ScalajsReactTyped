package typingsJapgolly.k6

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cryptoMod {
  type BinaryEncoding = typingsJapgolly.k6.k6Strings.binary
  type Output[OE /* <: typingsJapgolly.k6.cryptoMod.OutputEncoding */] = typingsJapgolly.k6.mod.bytes | java.lang.String
  type OutputEncoding = typingsJapgolly.k6.cryptoMod.StringEncoding | typingsJapgolly.k6.cryptoMod.BinaryEncoding
}
