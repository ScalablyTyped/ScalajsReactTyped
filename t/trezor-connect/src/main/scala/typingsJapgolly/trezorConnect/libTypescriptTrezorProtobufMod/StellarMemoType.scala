package typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StellarMemoType extends StObject
@JSImport("trezor-connect/lib/typescript/trezor/protobuf", "StellarMemoType")
@js.native
object StellarMemoType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StellarMemoType & Double] = js.native
  
  @js.native
  sealed trait HASH
    extends StObject
       with StellarMemoType
  /* 3 */ val HASH: typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod.StellarMemoType.HASH & Double = js.native
  
  @js.native
  sealed trait ID
    extends StObject
       with StellarMemoType
  /* 2 */ val ID: typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod.StellarMemoType.ID & Double = js.native
  
  @js.native
  sealed trait NONE
    extends StObject
       with StellarMemoType
  /* 0 */ val NONE: typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod.StellarMemoType.NONE & Double = js.native
  
  @js.native
  sealed trait RETURN
    extends StObject
       with StellarMemoType
  /* 4 */ val RETURN: typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod.StellarMemoType.RETURN & Double = js.native
  
  @js.native
  sealed trait TEXT
    extends StObject
       with StellarMemoType
  /* 1 */ val TEXT: typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod.StellarMemoType.TEXT & Double = js.native
}
