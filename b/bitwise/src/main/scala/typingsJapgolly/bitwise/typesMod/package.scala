package typingsJapgolly.bitwise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type Bits = js.Array[typingsJapgolly.bitwise.typesMod.Bit]
  type BooleanBits = js.Array[scala.Boolean]
  type Byte = js.Tuple8[
    typingsJapgolly.bitwise.typesMod.Bit, 
    typingsJapgolly.bitwise.typesMod.Bit, 
    typingsJapgolly.bitwise.typesMod.Bit, 
    typingsJapgolly.bitwise.typesMod.Bit, 
    typingsJapgolly.bitwise.typesMod.Bit, 
    typingsJapgolly.bitwise.typesMod.Bit, 
    typingsJapgolly.bitwise.typesMod.Bit, 
    typingsJapgolly.bitwise.typesMod.Bit
  ]
  type Nibble = js.Tuple4[
    typingsJapgolly.bitwise.typesMod.Bit, 
    typingsJapgolly.bitwise.typesMod.Bit, 
    typingsJapgolly.bitwise.typesMod.Bit, 
    typingsJapgolly.bitwise.typesMod.Bit
  ]
}
