package typingsJapgolly.nwJs.mod.global.NWJSHelpers

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * nw.Window.get().on('new-win-policy') callback policy argument object
  */
trait WinPolicy extends StObject {
  
  /**
    * Force the link to be opened in the same frame
    */
  def forceCurrent(): Unit
  
  /**
    * Force the link to be a downloadable, or open by external program
    */
  def forceDownload(): Unit
  
  /**
    * Force the link to be opened in a new popup window
    */
  def forceNewPopup(): Unit
  
  /**
    * Force the link to be opened in a new window
    */
  def forceNewWindow(): Unit
  
  /**
    * Ignore the request, navigation won’t happen.
    */
  def ignore(): Unit
  
  /**
    * Control the options for the new popup window.
    *
    *@param m {Object} The object is in the same format as the Window subfields in manifest format.
    */
  def setNewWindowManifest(m: WindowOption): Unit
}
object WinPolicy {
  
  inline def apply(
    forceCurrent: Callback,
    forceDownload: Callback,
    forceNewPopup: Callback,
    forceNewWindow: Callback,
    ignore: Callback,
    setNewWindowManifest: WindowOption => Callback
  ): WinPolicy = {
    val __obj = js.Dynamic.literal(forceCurrent = forceCurrent.toJsFn, forceDownload = forceDownload.toJsFn, forceNewPopup = forceNewPopup.toJsFn, forceNewWindow = forceNewWindow.toJsFn, ignore = ignore.toJsFn, setNewWindowManifest = js.Any.fromFunction1((t0: WindowOption) => setNewWindowManifest(t0).runNow()))
    __obj.asInstanceOf[WinPolicy]
  }
  
  extension [Self <: WinPolicy](x: Self) {
    
    inline def setForceCurrent(value: Callback): Self = StObject.set(x, "forceCurrent", value.toJsFn)
    
    inline def setForceDownload(value: Callback): Self = StObject.set(x, "forceDownload", value.toJsFn)
    
    inline def setForceNewPopup(value: Callback): Self = StObject.set(x, "forceNewPopup", value.toJsFn)
    
    inline def setForceNewWindow(value: Callback): Self = StObject.set(x, "forceNewWindow", value.toJsFn)
    
    inline def setIgnore(value: Callback): Self = StObject.set(x, "ignore", value.toJsFn)
    
    inline def setSetNewWindowManifest(value: WindowOption => Callback): Self = StObject.set(x, "setNewWindowManifest", js.Any.fromFunction1((t0: WindowOption) => value(t0).runNow()))
  }
}
