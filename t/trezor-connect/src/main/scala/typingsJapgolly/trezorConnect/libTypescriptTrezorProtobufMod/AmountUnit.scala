package typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AmountUnit extends StObject
@JSImport("trezor-connect/lib/typescript/trezor/protobuf", "AmountUnit")
@js.native
object AmountUnit extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AmountUnit & Double] = js.native
  
  @js.native
  sealed trait BITCOIN
    extends StObject
       with AmountUnit
  /* 0 */ val BITCOIN: typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod.AmountUnit.BITCOIN & Double = js.native
  
  @js.native
  sealed trait MICROBITCOIN
    extends StObject
       with AmountUnit
  /* 2 */ val MICROBITCOIN: typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod.AmountUnit.MICROBITCOIN & Double = js.native
  
  @js.native
  sealed trait MILLIBITCOIN
    extends StObject
       with AmountUnit
  /* 1 */ val MILLIBITCOIN: typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod.AmountUnit.MILLIBITCOIN & Double = js.native
  
  @js.native
  sealed trait SATOSHI
    extends StObject
       with AmountUnit
  /* 3 */ val SATOSHI: typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod.AmountUnit.SATOSHI & Double = js.native
}
