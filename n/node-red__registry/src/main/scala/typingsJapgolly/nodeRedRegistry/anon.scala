package typingsJapgolly.nodeRedRegistry

import typingsJapgolly.nodeRedRegistry.mod.NodeCredentials
import typingsJapgolly.nodeRedRegistry.mod.NodeSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Credentials[TCreds /* <: js.Object */, TSets] extends StObject {
    
    var credentials: js.UndefOr[NodeCredentials[TCreds]] = js.undefined
    
    var settings: js.UndefOr[NodeSettings[TSets]] = js.undefined
  }
  object Credentials {
    
    inline def apply[TCreds /* <: js.Object */, TSets](): Credentials[TCreds, TSets] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Credentials[TCreds, TSets]]
    }
    
    extension [Self <: Credentials[?, ?], TCreds /* <: js.Object */, TSets](x: Self & (Credentials[TCreds, TSets])) {
      
      inline def setCredentials(value: NodeCredentials[TCreds]): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
      
      inline def setSettings(value: NodeSettings[TSets]): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      
      inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    }
  }
}
