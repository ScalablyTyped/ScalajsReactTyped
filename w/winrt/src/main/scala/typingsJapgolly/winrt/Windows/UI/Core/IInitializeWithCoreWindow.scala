package typingsJapgolly.winrt.Windows.UI.Core

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IInitializeWithCoreWindow extends StObject {
  
  def initialize(window: CoreWindow): Unit
}
object IInitializeWithCoreWindow {
  
  inline def apply(initialize: CoreWindow => Callback): IInitializeWithCoreWindow = {
    val __obj = js.Dynamic.literal(initialize = js.Any.fromFunction1((t0: CoreWindow) => initialize(t0).runNow()))
    __obj.asInstanceOf[IInitializeWithCoreWindow]
  }
  
  extension [Self <: IInitializeWithCoreWindow](x: Self) {
    
    inline def setInitialize(value: CoreWindow => Callback): Self = StObject.set(x, "initialize", js.Any.fromFunction1((t0: CoreWindow) => value(t0).runNow()))
  }
}
