package typingsJapgolly.nwJs.mod.global.NWJSHelpers

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * nw.Window.get().on('navigation') callback policy argument object
  */
trait WinNavigationPolicy extends StObject {
  
  /**
    * Ignore the request, navigation won’t happen.
    */
  def ignore(): Unit
}
object WinNavigationPolicy {
  
  inline def apply(ignore: Callback): WinNavigationPolicy = {
    val __obj = js.Dynamic.literal(ignore = ignore.toJsFn)
    __obj.asInstanceOf[WinNavigationPolicy]
  }
  
  extension [Self <: WinNavigationPolicy](x: Self) {
    
    inline def setIgnore(value: Callback): Self = StObject.set(x, "ignore", value.toJsFn)
  }
}
