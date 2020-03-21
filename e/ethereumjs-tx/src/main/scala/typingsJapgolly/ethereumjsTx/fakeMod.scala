package typingsJapgolly.ethereumjsTx

import typingsJapgolly.ethereumjsTx.typesMod.BufferLike
import typingsJapgolly.ethereumjsTx.typesMod.FakeTxData
import typingsJapgolly.ethereumjsTx.typesMod.PrefixedHexString
import typingsJapgolly.ethereumjsTx.typesMod.TransactionOptions
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethereumjs-tx/dist/fake", JSImport.Namespace)
@js.native
object fakeMod extends js.Object {
  @js.native
  trait FakeTransaction
    extends typingsJapgolly.ethereumjsTx.transactionMod.default {
    /**
      * Set from address to bypass transaction signing.
      * This is not an optional property, as its getter never returns undefined.
      */
    var from: Buffer = js.native
  }
  
  @js.native
  class default () extends FakeTransaction {
    def this(data: js.Array[BufferLike]) = this()
    def this(data: FakeTxData) = this()
    def this(data: PrefixedHexString) = this()
    def this(data: Buffer) = this()
    def this(data: js.Array[BufferLike], opts: TransactionOptions) = this()
    def this(data: FakeTxData, opts: TransactionOptions) = this()
    def this(data: PrefixedHexString, opts: TransactionOptions) = this()
    def this(data: Buffer, opts: TransactionOptions) = this()
  }
  
}

