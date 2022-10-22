package typingsJapgolly.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IClientBlockGetByIdRequest extends StObject {
  
  /** ClientBlockGetByIdRequest blockId */
  var blockId: js.UndefOr[String | Null] = js.undefined
}
object IClientBlockGetByIdRequest {
  
  inline def apply(): IClientBlockGetByIdRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientBlockGetByIdRequest]
  }
  
  extension [Self <: IClientBlockGetByIdRequest](x: Self) {
    
    inline def setBlockId(value: String): Self = StObject.set(x, "blockId", value.asInstanceOf[js.Any])
    
    inline def setBlockIdNull: Self = StObject.set(x, "blockId", null)
    
    inline def setBlockIdUndefined: Self = StObject.set(x, "blockId", js.undefined)
  }
}
