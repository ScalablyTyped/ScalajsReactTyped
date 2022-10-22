package typingsJapgolly.azdata.mod.nb

import typingsJapgolly.azdata.azdataStrings.shell
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IShellMessage
  extends StObject
     with IMessage {
  
  var channel: shell
}
object IShellMessage {
  
  inline def apply(content: Any, `type`: Channel): IShellMessage = {
    val __obj = js.Dynamic.literal(channel = "shell", content = content.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShellMessage]
  }
  
  extension [Self <: IShellMessage](x: Self) {
    
    inline def setChannel(value: shell): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
  }
}
