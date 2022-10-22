package typingsJapgolly.ace.AceAjax

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Completer extends StObject {
  
  /**
    * Provides possible completion results asynchronously using the given callback.
    * @param editor The editor to associate with
    * @param session The `EditSession` to refer to
    * @param pos An object containing the row and column
    * @param prefix The prefixing string before the current position
    * @param callback Function to provide the results or error
    */
  def getCompletions(editor: Editor, session: IEditSession, pos: Position, prefix: String, callback: CompletionCallback): Unit
  
  /**
    * Provides tooltip information about a completion result.
    * @param item The completion result
    */
  var getDocTooltip: js.UndefOr[js.Function1[/* item */ Completion, Unit]] = js.undefined
}
object Completer {
  
  inline def apply(getCompletions: (Editor, IEditSession, Position, String, CompletionCallback) => Callback): Completer = {
    val __obj = js.Dynamic.literal(getCompletions = js.Any.fromFunction5((t0: Editor, t1: IEditSession, t2: Position, t3: String, t4: CompletionCallback) => (getCompletions(t0, t1, t2, t3, t4)).runNow()))
    __obj.asInstanceOf[Completer]
  }
  
  extension [Self <: Completer](x: Self) {
    
    inline def setGetCompletions(value: (Editor, IEditSession, Position, String, CompletionCallback) => Callback): Self = StObject.set(x, "getCompletions", js.Any.fromFunction5((t0: Editor, t1: IEditSession, t2: Position, t3: String, t4: CompletionCallback) => (value(t0, t1, t2, t3, t4)).runNow()))
    
    inline def setGetDocTooltip(value: /* item */ Completion => Callback): Self = StObject.set(x, "getDocTooltip", js.Any.fromFunction1((t0: /* item */ Completion) => value(t0).runNow()))
    
    inline def setGetDocTooltipUndefined: Self = StObject.set(x, "getDocTooltip", js.undefined)
  }
}
