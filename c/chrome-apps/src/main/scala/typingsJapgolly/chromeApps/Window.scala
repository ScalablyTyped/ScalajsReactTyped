package typingsJapgolly.chromeApps

import typingsJapgolly.chromeApps.anon.TypeofAppView
import typingsJapgolly.chromeApps.anon.TypeofWebView
import typingsJapgolly.chromeApps.anon.Typeofchrome
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////
// GLOBAL //
////////////
@js.native
trait Window
  extends StObject
     with ChromeWindow {
  
  var AppView: TypeofAppView = js.native
  
  var WebView: TypeofWebView = js.native
  
  var chrome: Typeofchrome = js.native
}
