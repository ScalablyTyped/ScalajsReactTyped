package typingsJapgolly.winrt.Windows.UI.Core

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoreWindowResizeManager
  extends StObject
     with ICoreWindowResizeManager
object CoreWindowResizeManager {
  
  inline def apply(notifyLayoutCompleted: Callback): CoreWindowResizeManager = {
    val __obj = js.Dynamic.literal(notifyLayoutCompleted = notifyLayoutCompleted.toJsFn)
    __obj.asInstanceOf[CoreWindowResizeManager]
  }
}
