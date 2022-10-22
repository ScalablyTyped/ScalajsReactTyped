package typingsJapgolly.ethereumjsTx

import typingsJapgolly.ethereumjsTx.distTypesMod.BufferLike
import typingsJapgolly.ethereumjsTx.distTypesMod.FakeTxData
import typingsJapgolly.ethereumjsTx.distTypesMod.PrefixedHexString
import typingsJapgolly.ethereumjsTx.distTypesMod.TransactionOptions
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFakeMod {
  
  @JSImport("ethereumjs-tx/dist/fake", JSImport.Default)
  @js.native
  open class default () extends FakeTransaction {
    def this(data: js.Array[BufferLike]) = this()
    def this(data: FakeTxData) = this()
    def this(data: PrefixedHexString) = this()
    def this(data: Buffer) = this()
    def this(data: js.Array[BufferLike], opts: TransactionOptions) = this()
    def this(data: Unit, opts: TransactionOptions) = this()
    def this(data: FakeTxData, opts: TransactionOptions) = this()
    def this(data: PrefixedHexString, opts: TransactionOptions) = this()
    def this(data: Buffer, opts: TransactionOptions) = this()
  }
  
  @js.native
  trait FakeTransaction
    extends typingsJapgolly.ethereumjsTx.distTransactionMod.default {
    
    /**
      * Set from address to bypass transaction signing.
      * This is not an optional property, as its getter never returns undefined.
      */
    var from: Buffer = js.native
  }
}
