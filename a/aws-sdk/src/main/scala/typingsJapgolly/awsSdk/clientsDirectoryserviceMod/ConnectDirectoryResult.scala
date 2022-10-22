package typingsJapgolly.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectDirectoryResult extends StObject {
  
  /**
    * The identifier of the new directory.
    */
  var DirectoryId: js.UndefOr[typingsJapgolly.awsSdk.clientsDirectoryserviceMod.DirectoryId] = js.undefined
}
object ConnectDirectoryResult {
  
  inline def apply(): ConnectDirectoryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectDirectoryResult]
  }
  
  extension [Self <: ConnectDirectoryResult](x: Self) {
    
    inline def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    inline def setDirectoryIdUndefined: Self = StObject.set(x, "DirectoryId", js.undefined)
  }
}
