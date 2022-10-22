package typingsJapgolly.electron.Electron

import typingsJapgolly.electron.electronStrings.`background-tab`
import typingsJapgolly.electron.electronStrings.`foreground-tab`
import typingsJapgolly.electron.electronStrings.`new-window`
import typingsJapgolly.electron.electronStrings.`save-to-disk`
import typingsJapgolly.electron.electronStrings.default
import typingsJapgolly.electron.electronStrings.other
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DidCreateWindowDetails extends StObject {
  
  /**
    * Can be `default`, `foreground-tab`, `background-tab`, `new-window`,
    * `save-to-disk` and `other`.
    */
  var disposition: default | `foreground-tab` | `background-tab` | `new-window` | `save-to-disk` | other
  
  /**
    * Name given to the created window in the `window.open()` call.
    */
  var frameName: String
  
  /**
    * The options used to create the BrowserWindow. They are merged in increasing
    * precedence: parsed options from the `features` string from `window.open()`,
    * security-related webPreferences inherited from the parent, and options given by
    * `webContents.setWindowOpenHandler`. Unrecognized options are not filtered out.
    */
  var options: BrowserWindowConstructorOptions
  
  /**
    * The post data that will be sent to the new window, along with the appropriate
    * headers that will be set. If no post data is to be sent, the value will be
    * `null`. Only defined when the window is being created by a form that set
    * `target=_blank`.
    */
  var postBody: js.UndefOr[PostBody] = js.undefined
  
  /**
    * The referrer that will be passed to the new window. May or may not result in the
    * `Referer` header being sent, depending on the referrer policy.
    */
  var referrer: Referrer
  
  /**
    * URL for the created window.
    */
  var url: String
}
object DidCreateWindowDetails {
  
  inline def apply(
    disposition: default | `foreground-tab` | `background-tab` | `new-window` | `save-to-disk` | other,
    frameName: String,
    options: BrowserWindowConstructorOptions,
    referrer: Referrer,
    url: String
  ): DidCreateWindowDetails = {
    val __obj = js.Dynamic.literal(disposition = disposition.asInstanceOf[js.Any], frameName = frameName.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], referrer = referrer.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[DidCreateWindowDetails]
  }
  
  extension [Self <: DidCreateWindowDetails](x: Self) {
    
    inline def setDisposition(value: default | `foreground-tab` | `background-tab` | `new-window` | `save-to-disk` | other): Self = StObject.set(x, "disposition", value.asInstanceOf[js.Any])
    
    inline def setFrameName(value: String): Self = StObject.set(x, "frameName", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: BrowserWindowConstructorOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setPostBody(value: PostBody): Self = StObject.set(x, "postBody", value.asInstanceOf[js.Any])
    
    inline def setPostBodyUndefined: Self = StObject.set(x, "postBody", js.undefined)
    
    inline def setReferrer(value: Referrer): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
