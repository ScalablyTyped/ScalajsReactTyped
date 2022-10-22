package typingsJapgolly.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSMBFileSharesInput extends StObject {
  
  /**
    * An array containing the Amazon Resource Name (ARN) of each file share to be described.
    */
  var FileShareARNList: typingsJapgolly.awsSdk.clientsStoragegatewayMod.FileShareARNList
}
object DescribeSMBFileSharesInput {
  
  inline def apply(FileShareARNList: FileShareARNList): DescribeSMBFileSharesInput = {
    val __obj = js.Dynamic.literal(FileShareARNList = FileShareARNList.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSMBFileSharesInput]
  }
  
  extension [Self <: DescribeSMBFileSharesInput](x: Self) {
    
    inline def setFileShareARNList(value: FileShareARNList): Self = StObject.set(x, "FileShareARNList", value.asInstanceOf[js.Any])
    
    inline def setFileShareARNListVarargs(value: FileShareARN*): Self = StObject.set(x, "FileShareARNList", js.Array(value*))
  }
}
