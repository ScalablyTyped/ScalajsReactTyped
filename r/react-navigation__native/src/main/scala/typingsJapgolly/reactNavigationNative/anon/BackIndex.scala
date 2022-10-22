package typingsJapgolly.reactNavigationNative.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactNavigationNative.libTypescriptSrcCreateMemoryHistoryMod.HistoryRecord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackIndex extends StObject {
  
  def backIndex(hasPath: Path): Double
  
  def get(index: Double): HistoryRecord
  
  def go(n: Double): js.UndefOr[js.Promise[Unit]]
  
  val index: Double
  
  def listen(listener: js.Function0[Unit]): js.Function0[Unit]
  
  def push(hasPathState: State): Unit
  
  def replace(hasPathState: State): Unit
}
object BackIndex {
  
  inline def apply(
    backIndex: Path => Double,
    get: Double => HistoryRecord,
    go: Double => js.UndefOr[js.Promise[Unit]],
    index: Double,
    listen: js.Function0[Unit] => js.Function0[Unit],
    push: State => Callback,
    replace: State => Callback
  ): BackIndex = {
    val __obj = js.Dynamic.literal(backIndex = js.Any.fromFunction1(backIndex), get = js.Any.fromFunction1(get), go = js.Any.fromFunction1(go), index = index.asInstanceOf[js.Any], listen = js.Any.fromFunction1(listen), push = js.Any.fromFunction1((t0: State) => push(t0).runNow()), replace = js.Any.fromFunction1((t0: State) => replace(t0).runNow()))
    __obj.asInstanceOf[BackIndex]
  }
  
  extension [Self <: BackIndex](x: Self) {
    
    inline def setBackIndex(value: Path => Double): Self = StObject.set(x, "backIndex", js.Any.fromFunction1(value))
    
    inline def setGet(value: Double => HistoryRecord): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setGo(value: Double => js.UndefOr[js.Promise[Unit]]): Self = StObject.set(x, "go", js.Any.fromFunction1(value))
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setListen(value: js.Function0[Unit] => js.Function0[Unit]): Self = StObject.set(x, "listen", js.Any.fromFunction1(value))
    
    inline def setPush(value: State => Callback): Self = StObject.set(x, "push", js.Any.fromFunction1((t0: State) => value(t0).runNow()))
    
    inline def setReplace(value: State => Callback): Self = StObject.set(x, "replace", js.Any.fromFunction1((t0: State) => value(t0).runNow()))
  }
}
