package typingsJapgolly.winrt.Windows.Graphics.Printing

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrintTaskRequestedDeferral
  extends StObject
     with IPrintTaskRequestedDeferral
object PrintTaskRequestedDeferral {
  
  inline def apply(complete: Callback): PrintTaskRequestedDeferral = {
    val __obj = js.Dynamic.literal(complete = complete.toJsFn)
    __obj.asInstanceOf[PrintTaskRequestedDeferral]
  }
}
