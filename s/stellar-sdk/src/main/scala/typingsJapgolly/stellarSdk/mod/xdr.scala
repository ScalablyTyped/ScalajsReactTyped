package typingsJapgolly.stellarSdk.mod

import typingsJapgolly.node.Buffer
import typingsJapgolly.stellarBase.AnonHint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "xdr")
@js.native
object xdr extends js.Object {
  @js.native
  class Asset ()
    extends typingsJapgolly.stellarBase.mod.xdr.Asset
  
  @js.native
  class DecoratedSignature protected ()
    extends typingsJapgolly.stellarBase.mod.xdr.DecoratedSignature {
    def this(keys: AnonHint) = this()
  }
  
  @js.native
  class Memo ()
    extends typingsJapgolly.stellarBase.mod.xdr.Memo
  
  // tslint:disable-line:strict-export-declare-modifiers
  @js.native
  class Operation[T /* <: typingsJapgolly.stellarBase.mod.Operation */] ()
    extends typingsJapgolly.stellarBase.mod.xdr.Operation[T]
  
  @js.native
  class TransactionEnvelope ()
    extends typingsJapgolly.stellarBase.mod.xdr.TransactionEnvelope
  
  @js.native
  class TransactionResult ()
    extends typingsJapgolly.stellarBase.mod.xdr.TransactionResult
  
  @js.native
  class XDRStruct ()
    extends typingsJapgolly.stellarBase.mod.xdr.XDRStruct
  
  /* static members */
  @js.native
  object Asset extends js.Object {
    def fromXDR(xdr: Buffer): typingsJapgolly.stellarBase.mod.xdr.Asset = js.native
  }
  
  /* static members */
  @js.native
  object DecoratedSignature extends js.Object {
    def fromXDR(xdr: Buffer): typingsJapgolly.stellarBase.mod.xdr.DecoratedSignature = js.native
  }
  
  /* static members */
  @js.native
  object Memo extends js.Object {
    def fromXDR(xdr: Buffer): typingsJapgolly.stellarBase.mod.xdr.Memo = js.native
  }
  
  /* static members */
  @js.native
  object Operation extends js.Object {
    def fromXDR(xdr: Buffer): typingsJapgolly.stellarBase.mod.xdr.Operation[typingsJapgolly.stellarBase.mod.Operation] = js.native
  }
  
  /* static members */
  @js.native
  object TransactionEnvelope extends js.Object {
    def fromXDR(xdr: Buffer): typingsJapgolly.stellarBase.mod.xdr.TransactionEnvelope = js.native
  }
  
  /* static members */
  @js.native
  object TransactionResult extends js.Object {
    def fromXDR(xdr: Buffer): typingsJapgolly.stellarBase.mod.xdr.TransactionResult = js.native
  }
  
  /* static members */
  @js.native
  object XDRStruct extends js.Object {
    def fromXDR(xdr: Buffer): typingsJapgolly.stellarBase.mod.xdr.XDRStruct = js.native
  }
  
}

