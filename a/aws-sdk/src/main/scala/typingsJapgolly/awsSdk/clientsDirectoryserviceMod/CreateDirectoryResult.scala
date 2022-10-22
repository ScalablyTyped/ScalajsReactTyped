package typingsJapgolly.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDirectoryResult extends StObject {
  
  /**
    * The identifier of the directory that was created.
    */
  var DirectoryId: js.UndefOr[typingsJapgolly.awsSdk.clientsDirectoryserviceMod.DirectoryId] = js.undefined
}
object CreateDirectoryResult {
  
  inline def apply(): CreateDirectoryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDirectoryResult]
  }
  
  extension [Self <: CreateDirectoryResult](x: Self) {
    
    inline def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    inline def setDirectoryIdUndefined: Self = StObject.set(x, "DirectoryId", js.undefined)
  }
}
