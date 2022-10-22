package typingsJapgolly.jpm

import typingsJapgolly.jpm.FFAddonSDK.BrowserWindow
import typingsJapgolly.jpm.anon.IsPrivate
import typingsJapgolly.jpm.jpmStrings.activate
import typingsJapgolly.jpm.jpmStrings.close
import typingsJapgolly.jpm.jpmStrings.deactivate
import typingsJapgolly.jpm.jpmStrings.open
import typingsJapgolly.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Enumerate and examine open browser windows, open new windows, and listen for window events
  */
object sdkWindowsMod {
  
  @JSImport("sdk/windows", "browserWindows")
  @js.native
  val browserWindows: BrowserWindows_ = js.native
  
  @js.native
  trait BrowserWindows_
    extends StObject
       with Array[BrowserWindow] {
    
    var activeWindow: BrowserWindow = js.native
    
    def on(
      event: open | close | activate | deactivate,
      handler: js.Function1[/* window */ BrowserWindow, Any]
    ): Unit = js.native
    
    /**
      * Open a new window
      * @param options.isPrivate determines whether the new window should be private or not
      */
    def open(options: String): BrowserWindow = js.native
    def open(options: IsPrivate): BrowserWindow = js.native
  }
}
