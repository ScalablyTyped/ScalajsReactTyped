package typingsJapgolly.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cryptoMod {
  type BinaryLike = java.lang.String | typingsJapgolly.node.NodeJS.ArrayBufferView
  type CipherKey = typingsJapgolly.node.cryptoMod.BinaryLike | typingsJapgolly.node.cryptoMod.KeyObject
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsJapgolly.node.Buffer
    - typingsJapgolly.node.cryptoMod.KeyObject
  */
  type KeyLike = typingsJapgolly.node.cryptoMod._KeyLike | java.lang.String
}
