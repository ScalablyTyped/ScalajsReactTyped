package typingsJapgolly.winrt.Windows.UI.Core

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICoreWindowStatic extends StObject {
  
  def getForCurrentThread(): CoreWindow
}
object ICoreWindowStatic {
  
  inline def apply(getForCurrentThread: CallbackTo[CoreWindow]): ICoreWindowStatic = {
    val __obj = js.Dynamic.literal(getForCurrentThread = getForCurrentThread.toJsFn)
    __obj.asInstanceOf[ICoreWindowStatic]
  }
  
  extension [Self <: ICoreWindowStatic](x: Self) {
    
    inline def setGetForCurrentThread(value: CallbackTo[CoreWindow]): Self = StObject.set(x, "getForCurrentThread", value.toJsFn)
  }
}
