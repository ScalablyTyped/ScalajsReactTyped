package typingsJapgolly.winrt.Windows.Graphics.Printing

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrintTaskSourceRequestedDeferral
  extends StObject
     with IPrintTaskSourceRequestedDeferral
object PrintTaskSourceRequestedDeferral {
  
  inline def apply(complete: Callback): PrintTaskSourceRequestedDeferral = {
    val __obj = js.Dynamic.literal(complete = complete.toJsFn)
    __obj.asInstanceOf[PrintTaskSourceRequestedDeferral]
  }
}
