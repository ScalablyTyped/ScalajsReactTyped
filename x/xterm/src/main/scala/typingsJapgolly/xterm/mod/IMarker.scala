package typingsJapgolly.xterm.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMarker
  extends StObject
     with IDisposableWithEvent {
  
  /**
    * A unique identifier for this marker.
    */
  val id: Double
  
  /**
    * The actual line index in the buffer at this point in time. This is set to
    * -1 if the marker has been disposed.
    */
  val line: Double
}
object IMarker {
  
  inline def apply(
    dispose: Callback,
    id: Double,
    isDisposed: Boolean,
    line: Double,
    onDispose: /* listener */ js.Function2[Unit, Unit, Any] => IDisposable
  ): IMarker = {
    val __obj = js.Dynamic.literal(dispose = dispose.toJsFn, id = id.asInstanceOf[js.Any], isDisposed = isDisposed.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], onDispose = js.Any.fromFunction1(onDispose))
    __obj.asInstanceOf[IMarker]
  }
  
  extension [Self <: IMarker](x: Self) {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
  }
}
