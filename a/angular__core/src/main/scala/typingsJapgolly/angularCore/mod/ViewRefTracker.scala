package typingsJapgolly.angularCore.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for tracking root `ViewRef`s in `ApplicationRef`.
  *
  * NOTE: Importing `ApplicationRef` here directly creates circular dependency, which is why we have
  * a subset of the `ApplicationRef` interface `ViewRefTracker` here.
  */
trait ViewRefTracker extends StObject {
  
  def detachView(viewRef: ViewRef): Unit
}
object ViewRefTracker {
  
  inline def apply(detachView: ViewRef => Callback): ViewRefTracker = {
    val __obj = js.Dynamic.literal(detachView = js.Any.fromFunction1((t0: ViewRef) => detachView(t0).runNow()))
    __obj.asInstanceOf[ViewRefTracker]
  }
  
  extension [Self <: ViewRefTracker](x: Self) {
    
    inline def setDetachView(value: ViewRef => Callback): Self = StObject.set(x, "detachView", js.Any.fromFunction1((t0: ViewRef) => value(t0).runNow()))
  }
}
