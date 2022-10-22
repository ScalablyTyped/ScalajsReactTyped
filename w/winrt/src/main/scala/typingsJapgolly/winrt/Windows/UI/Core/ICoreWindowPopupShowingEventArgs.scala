package typingsJapgolly.winrt.Windows.UI.Core

import japgolly.scalajs.react.Callback
import typingsJapgolly.winrt.Windows.Foundation.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICoreWindowPopupShowingEventArgs extends StObject {
  
  def setDesiredSize(value: Size): Unit
}
object ICoreWindowPopupShowingEventArgs {
  
  inline def apply(setDesiredSize: Size => Callback): ICoreWindowPopupShowingEventArgs = {
    val __obj = js.Dynamic.literal(setDesiredSize = js.Any.fromFunction1((t0: Size) => setDesiredSize(t0).runNow()))
    __obj.asInstanceOf[ICoreWindowPopupShowingEventArgs]
  }
  
  extension [Self <: ICoreWindowPopupShowingEventArgs](x: Self) {
    
    inline def setSetDesiredSize(value: Size => Callback): Self = StObject.set(x, "setDesiredSize", js.Any.fromFunction1((t0: Size) => value(t0).runNow()))
  }
}
