package typingsJapgolly.trezorConnect.libTypescriptNetworksCardanoMod

import typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod.CardanoDerivationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardanoGetNativeScriptHash extends StObject {
  
  var derivationType: js.UndefOr[CardanoDerivationType] = js.undefined
  
  var displayFormat: typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod.CardanoNativeScriptHashDisplayFormat
  
  var script: CardanoNativeScript
}
object CardanoGetNativeScriptHash {
  
  inline def apply(
    displayFormat: typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod.CardanoNativeScriptHashDisplayFormat,
    script: CardanoNativeScript
  ): CardanoGetNativeScriptHash = {
    val __obj = js.Dynamic.literal(displayFormat = displayFormat.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardanoGetNativeScriptHash]
  }
  
  extension [Self <: CardanoGetNativeScriptHash](x: Self) {
    
    inline def setDerivationType(value: CardanoDerivationType): Self = StObject.set(x, "derivationType", value.asInstanceOf[js.Any])
    
    inline def setDerivationTypeUndefined: Self = StObject.set(x, "derivationType", js.undefined)
    
    inline def setDisplayFormat(
      value: typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod.CardanoNativeScriptHashDisplayFormat
    ): Self = StObject.set(x, "displayFormat", value.asInstanceOf[js.Any])
    
    inline def setScript(value: CardanoNativeScript): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
  }
}
