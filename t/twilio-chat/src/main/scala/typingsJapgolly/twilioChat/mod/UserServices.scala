package typingsJapgolly.twilioChat.mod

import typingsJapgolly.twilioSync.mod.SyncClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserServices extends StObject {
  
  var commandExecutor: CommandExecutor
  
  var syncClient: SyncClient
}
object UserServices {
  
  inline def apply(commandExecutor: CommandExecutor, syncClient: SyncClient): UserServices = {
    val __obj = js.Dynamic.literal(commandExecutor = commandExecutor.asInstanceOf[js.Any], syncClient = syncClient.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserServices]
  }
  
  extension [Self <: UserServices](x: Self) {
    
    inline def setCommandExecutor(value: CommandExecutor): Self = StObject.set(x, "commandExecutor", value.asInstanceOf[js.Any])
    
    inline def setSyncClient(value: SyncClient): Self = StObject.set(x, "syncClient", value.asInstanceOf[js.Any])
  }
}
