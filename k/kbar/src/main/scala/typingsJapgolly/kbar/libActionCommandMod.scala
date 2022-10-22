package typingsJapgolly.kbar

import typingsJapgolly.kbar.anon.Perform
import typingsJapgolly.kbar.anon.Redo
import typingsJapgolly.kbar.libTypesMod.History
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libActionCommandMod {
  
  @JSImport("kbar/lib/action/Command", "Command")
  @js.native
  open class Command protected () extends StObject {
    def this(command: Perform) = this()
    def this(command: Perform, options: CommandOptions) = this()
    
    var history: js.UndefOr[Redo] = js.native
    
    /* private */ var historyItem: Any = js.native
    
    def perform(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
    ): Any = js.native
  }
  
  trait CommandOptions extends StObject {
    
    var history: js.UndefOr[History] = js.undefined
  }
  object CommandOptions {
    
    inline def apply(): CommandOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommandOptions]
    }
    
    extension [Self <: CommandOptions](x: Self) {
      
      inline def setHistory(value: History): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      inline def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
    }
  }
}
