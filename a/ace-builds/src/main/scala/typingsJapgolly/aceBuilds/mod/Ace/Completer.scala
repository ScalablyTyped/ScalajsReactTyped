package typingsJapgolly.aceBuilds.mod.Ace

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Completer extends StObject {
  
  def getCompletions(editor: Editor, session: EditSession, position: Point, prefix: String, callback: CompleterCallback): Unit
  
  var identifierRegexps: js.UndefOr[js.Array[js.RegExp]] = js.undefined
}
object Completer {
  
  inline def apply(getCompletions: (Editor, EditSession, Point, String, CompleterCallback) => Callback): Completer = {
    val __obj = js.Dynamic.literal(getCompletions = js.Any.fromFunction5((t0: Editor, t1: EditSession, t2: Point, t3: String, t4: CompleterCallback) => (getCompletions(t0, t1, t2, t3, t4)).runNow()))
    __obj.asInstanceOf[Completer]
  }
  
  extension [Self <: Completer](x: Self) {
    
    inline def setGetCompletions(value: (Editor, EditSession, Point, String, CompleterCallback) => Callback): Self = StObject.set(x, "getCompletions", js.Any.fromFunction5((t0: Editor, t1: EditSession, t2: Point, t3: String, t4: CompleterCallback) => (value(t0, t1, t2, t3, t4)).runNow()))
    
    inline def setIdentifierRegexps(value: js.Array[js.RegExp]): Self = StObject.set(x, "identifierRegexps", value.asInstanceOf[js.Any])
    
    inline def setIdentifierRegexpsUndefined: Self = StObject.set(x, "identifierRegexps", js.undefined)
    
    inline def setIdentifierRegexpsVarargs(value: js.RegExp*): Self = StObject.set(x, "identifierRegexps", js.Array(value*))
  }
}
