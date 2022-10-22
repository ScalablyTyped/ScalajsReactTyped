package typingsJapgolly.monacoEditor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Command extends StObject {
  
  val command: typingsJapgolly.monacoEditor.mod.languages.Command
  
  val kind: String
}
object Command {
  
  inline def apply(command: typingsJapgolly.monacoEditor.mod.languages.Command, kind: String): Command = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Command]
  }
  
  extension [Self <: Command](x: Self) {
    
    inline def setCommand(value: typingsJapgolly.monacoEditor.mod.languages.Command): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
