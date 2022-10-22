package typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StellarAssetType extends StObject
@JSImport("trezor-connect/lib/typescript/trezor/protobuf", "StellarAssetType")
@js.native
object StellarAssetType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StellarAssetType & Double] = js.native
  
  @js.native
  sealed trait ALPHANUM12
    extends StObject
       with StellarAssetType
  /* 2 */ val ALPHANUM12: typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod.StellarAssetType.ALPHANUM12 & Double = js.native
  
  @js.native
  sealed trait ALPHANUM4
    extends StObject
       with StellarAssetType
  /* 1 */ val ALPHANUM4: typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod.StellarAssetType.ALPHANUM4 & Double = js.native
  
  @js.native
  sealed trait NATIVE
    extends StObject
       with StellarAssetType
  /* 0 */ val NATIVE: typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod.StellarAssetType.NATIVE & Double = js.native
}
