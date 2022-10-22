package typingsJapgolly.awsSdk.clientsSnowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataTransfer extends StObject {
  
  /**
    * The number of bytes transferred between a Snow device and Amazon S3.
    */
  var BytesTransferred: js.UndefOr[Long] = js.undefined
  
  /**
    * The number of objects transferred between a Snow device and Amazon S3.
    */
  var ObjectsTransferred: js.UndefOr[Long] = js.undefined
  
  /**
    * The total bytes of data for a transfer between a Snow device and Amazon S3. This value is set to 0 (zero) until all the keys that will be transferred have been listed.
    */
  var TotalBytes: js.UndefOr[Long] = js.undefined
  
  /**
    * The total number of objects for a transfer between a Snow device and Amazon S3. This value is set to 0 (zero) until all the keys that will be transferred have been listed.
    */
  var TotalObjects: js.UndefOr[Long] = js.undefined
}
object DataTransfer {
  
  inline def apply(): DataTransfer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataTransfer]
  }
  
  extension [Self <: DataTransfer](x: Self) {
    
    inline def setBytesTransferred(value: Long): Self = StObject.set(x, "BytesTransferred", value.asInstanceOf[js.Any])
    
    inline def setBytesTransferredUndefined: Self = StObject.set(x, "BytesTransferred", js.undefined)
    
    inline def setObjectsTransferred(value: Long): Self = StObject.set(x, "ObjectsTransferred", value.asInstanceOf[js.Any])
    
    inline def setObjectsTransferredUndefined: Self = StObject.set(x, "ObjectsTransferred", js.undefined)
    
    inline def setTotalBytes(value: Long): Self = StObject.set(x, "TotalBytes", value.asInstanceOf[js.Any])
    
    inline def setTotalBytesUndefined: Self = StObject.set(x, "TotalBytes", js.undefined)
    
    inline def setTotalObjects(value: Long): Self = StObject.set(x, "TotalObjects", value.asInstanceOf[js.Any])
    
    inline def setTotalObjectsUndefined: Self = StObject.set(x, "TotalObjects", js.undefined)
  }
}
