package typingsJapgolly.winrt.Windows.ApplicationModel

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuspendingDeferral
  extends StObject
     with ISuspendingDeferral
object SuspendingDeferral {
  
  inline def apply(complete: Callback): SuspendingDeferral = {
    val __obj = js.Dynamic.literal(complete = complete.toJsFn)
    __obj.asInstanceOf[SuspendingDeferral]
  }
}
