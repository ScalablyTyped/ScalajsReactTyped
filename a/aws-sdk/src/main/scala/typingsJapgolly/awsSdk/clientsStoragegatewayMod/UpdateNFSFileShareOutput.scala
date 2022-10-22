package typingsJapgolly.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateNFSFileShareOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the updated file share.
    */
  var FileShareARN: js.UndefOr[typingsJapgolly.awsSdk.clientsStoragegatewayMod.FileShareARN] = js.undefined
}
object UpdateNFSFileShareOutput {
  
  inline def apply(): UpdateNFSFileShareOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateNFSFileShareOutput]
  }
  
  extension [Self <: UpdateNFSFileShareOutput](x: Self) {
    
    inline def setFileShareARN(value: FileShareARN): Self = StObject.set(x, "FileShareARN", value.asInstanceOf[js.Any])
    
    inline def setFileShareARNUndefined: Self = StObject.set(x, "FileShareARN", js.undefined)
  }
}
