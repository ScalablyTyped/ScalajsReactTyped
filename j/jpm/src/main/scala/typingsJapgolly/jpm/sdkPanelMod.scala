package typingsJapgolly.jpm

import org.scalajs.dom.URL
import typingsJapgolly.jpm.FFAddonSDK.Port
import typingsJapgolly.jpm.anon.ContentScriptFile
import typingsJapgolly.jpm.anon.Focus
import typingsJapgolly.jpm.anon.Script
import typingsJapgolly.jpm.jpmStrings.end
import typingsJapgolly.jpm.jpmStrings.error
import typingsJapgolly.jpm.jpmStrings.hide
import typingsJapgolly.jpm.jpmStrings.message
import typingsJapgolly.jpm.jpmStrings.ready
import typingsJapgolly.jpm.jpmStrings.show
import typingsJapgolly.jpm.jpmStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creates transient dialogs to implement part of an add-on's user interface
  */
object sdkPanelMod {
  
  @js.native
  trait Panel extends StObject {
    
    var allow: js.UndefOr[Script] = js.native
    
    var contentScript: js.UndefOr[String | js.Array[String]] = js.native
    
    var contentScriptFile: js.UndefOr[String | js.Array[String]] = js.native
    
    var contentScriptOptions: js.UndefOr[Any] = js.native
    
    var contentScriptWhen: start | ready | end = js.native
    
    var contentURL: js.UndefOr[String | URL] = js.native
    
    def destroy(): Unit = js.native
    
    var focus: Boolean = js.native
    
    var height: Double = js.native
    
    def hide(): Unit = js.native
    
    var isShowing: Boolean = js.native
    
    def on(
      event: show | hide | message | error,
      handler: js.Function1[/* arg */ js.UndefOr[js.Error | Any], Any]
    ): Unit = js.native
    
    var port: Port = js.native
    
    def postMessage(message: String): Unit = js.native
    
    def removeListener(event: String, listener: js.Function): Unit = js.native
    
    def resize(width: Double, height: Double): Unit = js.native
    
    def show(): Unit = js.native
    def show(options: Focus): Unit = js.native
    
    var width: Double = js.native
  }
  object Panel {
    
    @JSImport("sdk/panel", "Panel")
    @js.native
    def apply(options: ContentScriptFile): Panel = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.jpm.FFAddonSDK.ToggleButton
    - typingsJapgolly.jpm.FFAddonSDK.Widget
    - typingsJapgolly.jpm.anon.Bottom
  */
  trait PanelPosition extends StObject
}
