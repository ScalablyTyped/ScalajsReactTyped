package typingsJapgolly.atlassianConnectJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AtlassianAccountId extends StObject {
  
  var atlassianAccountId: String
}
object AtlassianAccountId {
  
  inline def apply(atlassianAccountId: String): AtlassianAccountId = {
    val __obj = js.Dynamic.literal(atlassianAccountId = atlassianAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AtlassianAccountId]
  }
  
  extension [Self <: AtlassianAccountId](x: Self) {
    
    inline def setAtlassianAccountId(value: String): Self = StObject.set(x, "atlassianAccountId", value.asInstanceOf[js.Any])
  }
}
