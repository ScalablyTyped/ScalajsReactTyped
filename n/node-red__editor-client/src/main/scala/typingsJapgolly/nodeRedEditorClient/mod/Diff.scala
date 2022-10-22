package typingsJapgolly.nodeRedEditorClient.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Diff extends StObject {
  
  def getRemoteDiff(callback: js.Function1[/* diff */ js.Object, Unit]): Unit
  
  def init(): Unit
  
  def mergeDiff(diff: js.Object): Unit
  
  def showCommitDiff(options: js.Object): Unit
  
  def showRemoteDiff(diff: js.Object): Unit
  
  def showUnifiedDiff(options: js.Object): Unit
}
object Diff {
  
  inline def apply(
    getRemoteDiff: js.Function1[/* diff */ js.Object, Unit] => Callback,
    init: Callback,
    mergeDiff: js.Object => Callback,
    showCommitDiff: js.Object => Callback,
    showRemoteDiff: js.Object => Callback,
    showUnifiedDiff: js.Object => Callback
  ): Diff = {
    val __obj = js.Dynamic.literal(getRemoteDiff = js.Any.fromFunction1((t0: js.Function1[/* diff */ js.Object, Unit]) => getRemoteDiff(t0).runNow()), init = init.toJsFn, mergeDiff = js.Any.fromFunction1((t0: js.Object) => mergeDiff(t0).runNow()), showCommitDiff = js.Any.fromFunction1((t0: js.Object) => showCommitDiff(t0).runNow()), showRemoteDiff = js.Any.fromFunction1((t0: js.Object) => showRemoteDiff(t0).runNow()), showUnifiedDiff = js.Any.fromFunction1((t0: js.Object) => showUnifiedDiff(t0).runNow()))
    __obj.asInstanceOf[Diff]
  }
  
  extension [Self <: Diff](x: Self) {
    
    inline def setGetRemoteDiff(value: js.Function1[/* diff */ js.Object, Unit] => Callback): Self = StObject.set(x, "getRemoteDiff", js.Any.fromFunction1((t0: js.Function1[/* diff */ js.Object, Unit]) => value(t0).runNow()))
    
    inline def setInit(value: Callback): Self = StObject.set(x, "init", value.toJsFn)
    
    inline def setMergeDiff(value: js.Object => Callback): Self = StObject.set(x, "mergeDiff", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    
    inline def setShowCommitDiff(value: js.Object => Callback): Self = StObject.set(x, "showCommitDiff", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    
    inline def setShowRemoteDiff(value: js.Object => Callback): Self = StObject.set(x, "showRemoteDiff", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    
    inline def setShowUnifiedDiff(value: js.Object => Callback): Self = StObject.set(x, "showUnifiedDiff", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
  }
}
