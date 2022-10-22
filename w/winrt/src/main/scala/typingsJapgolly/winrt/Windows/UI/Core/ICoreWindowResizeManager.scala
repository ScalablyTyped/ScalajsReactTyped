package typingsJapgolly.winrt.Windows.UI.Core

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICoreWindowResizeManager extends StObject {
  
  def notifyLayoutCompleted(): Unit
}
object ICoreWindowResizeManager {
  
  inline def apply(notifyLayoutCompleted: Callback): ICoreWindowResizeManager = {
    val __obj = js.Dynamic.literal(notifyLayoutCompleted = notifyLayoutCompleted.toJsFn)
    __obj.asInstanceOf[ICoreWindowResizeManager]
  }
  
  extension [Self <: ICoreWindowResizeManager](x: Self) {
    
    inline def setNotifyLayoutCompleted(value: Callback): Self = StObject.set(x, "notifyLayoutCompleted", value.toJsFn)
  }
}
