package typingsJapgolly.winrt.Windows.UI.Core

import japgolly.scalajs.react.Callback
import typingsJapgolly.winrt.Windows.Foundation.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoreWindowPopupShowingEventArgs
  extends StObject
     with ICoreWindowPopupShowingEventArgs
object CoreWindowPopupShowingEventArgs {
  
  inline def apply(setDesiredSize: Size => Callback): CoreWindowPopupShowingEventArgs = {
    val __obj = js.Dynamic.literal(setDesiredSize = js.Any.fromFunction1((t0: Size) => setDesiredSize(t0).runNow()))
    __obj.asInstanceOf[CoreWindowPopupShowingEventArgs]
  }
}
