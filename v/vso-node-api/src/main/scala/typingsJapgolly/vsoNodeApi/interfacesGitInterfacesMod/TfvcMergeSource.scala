package typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TfvcMergeSource extends StObject {
  
  /**
    * Indicates if this a rename source. If false, it is a merge source.
    */
  var isRename: Boolean
  
  /**
    * The server item of the merge source
    */
  var serverItem: String
  
  /**
    * Start of the version range
    */
  var versionFrom: Double
  
  /**
    * End of the version range
    */
  var versionTo: Double
}
object TfvcMergeSource {
  
  inline def apply(isRename: Boolean, serverItem: String, versionFrom: Double, versionTo: Double): TfvcMergeSource = {
    val __obj = js.Dynamic.literal(isRename = isRename.asInstanceOf[js.Any], serverItem = serverItem.asInstanceOf[js.Any], versionFrom = versionFrom.asInstanceOf[js.Any], versionTo = versionTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[TfvcMergeSource]
  }
  
  extension [Self <: TfvcMergeSource](x: Self) {
    
    inline def setIsRename(value: Boolean): Self = StObject.set(x, "isRename", value.asInstanceOf[js.Any])
    
    inline def setServerItem(value: String): Self = StObject.set(x, "serverItem", value.asInstanceOf[js.Any])
    
    inline def setVersionFrom(value: Double): Self = StObject.set(x, "versionFrom", value.asInstanceOf[js.Any])
    
    inline def setVersionTo(value: Double): Self = StObject.set(x, "versionTo", value.asInstanceOf[js.Any])
  }
}
