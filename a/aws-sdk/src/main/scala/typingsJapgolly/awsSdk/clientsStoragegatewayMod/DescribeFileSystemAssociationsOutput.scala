package typingsJapgolly.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFileSystemAssociationsOutput extends StObject {
  
  /**
    * An array containing the FileSystemAssociationInfo data type of each file system association to be described. 
    */
  var FileSystemAssociationInfoList: js.UndefOr[typingsJapgolly.awsSdk.clientsStoragegatewayMod.FileSystemAssociationInfoList] = js.undefined
}
object DescribeFileSystemAssociationsOutput {
  
  inline def apply(): DescribeFileSystemAssociationsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFileSystemAssociationsOutput]
  }
  
  extension [Self <: DescribeFileSystemAssociationsOutput](x: Self) {
    
    inline def setFileSystemAssociationInfoList(value: FileSystemAssociationInfoList): Self = StObject.set(x, "FileSystemAssociationInfoList", value.asInstanceOf[js.Any])
    
    inline def setFileSystemAssociationInfoListUndefined: Self = StObject.set(x, "FileSystemAssociationInfoList", js.undefined)
    
    inline def setFileSystemAssociationInfoListVarargs(value: FileSystemAssociationInfo*): Self = StObject.set(x, "FileSystemAssociationInfoList", js.Array(value*))
  }
}
