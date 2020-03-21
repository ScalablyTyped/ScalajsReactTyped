package typingsJapgolly.bitwise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object bitwiseTypesMod {
  type Bits = js.Array[typingsJapgolly.bitwise.bitwiseTypesMod.Bit]
  type BooleanBits = js.Array[scala.Boolean]
  type Byte = js.Tuple8[
    typingsJapgolly.bitwise.bitwiseTypesMod.Bit, 
    typingsJapgolly.bitwise.bitwiseTypesMod.Bit, 
    typingsJapgolly.bitwise.bitwiseTypesMod.Bit, 
    typingsJapgolly.bitwise.bitwiseTypesMod.Bit, 
    typingsJapgolly.bitwise.bitwiseTypesMod.Bit, 
    typingsJapgolly.bitwise.bitwiseTypesMod.Bit, 
    typingsJapgolly.bitwise.bitwiseTypesMod.Bit, 
    typingsJapgolly.bitwise.bitwiseTypesMod.Bit
  ]
  type Nibble = js.Tuple4[
    typingsJapgolly.bitwise.bitwiseTypesMod.Bit, 
    typingsJapgolly.bitwise.bitwiseTypesMod.Bit, 
    typingsJapgolly.bitwise.bitwiseTypesMod.Bit, 
    typingsJapgolly.bitwise.bitwiseTypesMod.Bit
  ]
}
