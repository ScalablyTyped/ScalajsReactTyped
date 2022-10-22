package typingsJapgolly.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFileSharesOutput extends StObject {
  
  /**
    * An array of information about the S3 File Gateway's file shares.
    */
  var FileShareInfoList: js.UndefOr[typingsJapgolly.awsSdk.clientsStoragegatewayMod.FileShareInfoList] = js.undefined
  
  /**
    * If the request includes Marker, the response returns that value in this field.
    */
  var Marker: js.UndefOr[typingsJapgolly.awsSdk.clientsStoragegatewayMod.Marker] = js.undefined
  
  /**
    * If a value is present, there are more file shares to return. In a subsequent request, use NextMarker as the value for Marker to retrieve the next set of file shares.
    */
  var NextMarker: js.UndefOr[Marker] = js.undefined
}
object ListFileSharesOutput {
  
  inline def apply(): ListFileSharesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFileSharesOutput]
  }
  
  extension [Self <: ListFileSharesOutput](x: Self) {
    
    inline def setFileShareInfoList(value: FileShareInfoList): Self = StObject.set(x, "FileShareInfoList", value.asInstanceOf[js.Any])
    
    inline def setFileShareInfoListUndefined: Self = StObject.set(x, "FileShareInfoList", js.undefined)
    
    inline def setFileShareInfoListVarargs(value: FileShareInfo*): Self = StObject.set(x, "FileShareInfoList", js.Array(value*))
    
    inline def setMarker(value: Marker): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setNextMarker(value: Marker): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    inline def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
  }
}
