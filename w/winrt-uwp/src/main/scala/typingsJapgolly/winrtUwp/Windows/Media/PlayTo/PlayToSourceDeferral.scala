package typingsJapgolly.winrtUwp.Windows.Media.PlayTo

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a deferred operation when you're supplying a source media element for Play To. */
trait PlayToSourceDeferral extends StObject {
  
  /** Ends the deferral. */
  def complete(): Unit
}
object PlayToSourceDeferral {
  
  inline def apply(complete: Callback): PlayToSourceDeferral = {
    val __obj = js.Dynamic.literal(complete = complete.toJsFn)
    __obj.asInstanceOf[PlayToSourceDeferral]
  }
  
  extension [Self <: PlayToSourceDeferral](x: Self) {
    
    inline def setComplete(value: Callback): Self = StObject.set(x, "complete", value.toJsFn)
  }
}
