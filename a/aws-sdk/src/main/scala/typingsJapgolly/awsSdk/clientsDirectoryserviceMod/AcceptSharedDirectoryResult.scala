package typingsJapgolly.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcceptSharedDirectoryResult extends StObject {
  
  /**
    * The shared directory in the directory consumer account.
    */
  var SharedDirectory: js.UndefOr[typingsJapgolly.awsSdk.clientsDirectoryserviceMod.SharedDirectory] = js.undefined
}
object AcceptSharedDirectoryResult {
  
  inline def apply(): AcceptSharedDirectoryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcceptSharedDirectoryResult]
  }
  
  extension [Self <: AcceptSharedDirectoryResult](x: Self) {
    
    inline def setSharedDirectory(value: SharedDirectory): Self = StObject.set(x, "SharedDirectory", value.asInstanceOf[js.Any])
    
    inline def setSharedDirectoryUndefined: Self = StObject.set(x, "SharedDirectory", js.undefined)
  }
}
