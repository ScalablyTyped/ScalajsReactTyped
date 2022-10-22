package typingsJapgolly.trezorConnect.libTypescriptNetworksStellarMod

import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.trezorConnect.trezorConnectStrings.manageData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StellarManageDataOperation
  extends StObject
     with StellarOperation {
  
  // Proto: "source_account"
  var name: String
  
  // Proto: "StellarManageDataOp"
  var source: js.UndefOr[String] = js.undefined
  
  var `type`: manageData
  
  // Proto: "key"
  var value: js.UndefOr[String | Buffer] = js.undefined
}
object StellarManageDataOperation {
  
  inline def apply(name: String): StellarManageDataOperation = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("manageData")
    __obj.asInstanceOf[StellarManageDataOperation]
  }
  
  extension [Self <: StellarManageDataOperation](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setType(value: manageData): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String | Buffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
