package typingsJapgolly.winrt.Windows.UI.Core

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICoreWindowResizeManagerStatics extends StObject {
  
  def getForCurrentView(): CoreWindowResizeManager
}
object ICoreWindowResizeManagerStatics {
  
  inline def apply(getForCurrentView: CallbackTo[CoreWindowResizeManager]): ICoreWindowResizeManagerStatics = {
    val __obj = js.Dynamic.literal(getForCurrentView = getForCurrentView.toJsFn)
    __obj.asInstanceOf[ICoreWindowResizeManagerStatics]
  }
  
  extension [Self <: ICoreWindowResizeManagerStatics](x: Self) {
    
    inline def setGetForCurrentView(value: CallbackTo[CoreWindowResizeManager]): Self = StObject.set(x, "getForCurrentView", value.toJsFn)
  }
}
