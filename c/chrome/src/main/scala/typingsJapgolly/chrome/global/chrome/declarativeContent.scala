package typingsJapgolly.chrome.global.chrome

import typingsJapgolly.chrome.anon.ImageData
import typingsJapgolly.chrome.chrome.declarativeContent.PageChangedEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Declarative Content
////////////////////
/**
  * Use the chrome.declarativeContent API to take actions depending on the content of a page, without requiring permission to read the page's content.
  * Availability: Since Chrome 33.
  * Permissions:  "declarativeContent"
  */
object declarativeContent {
  
  @JSGlobal("chrome.declarativeContent")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("chrome.declarativeContent.PageStateMatcher")
  @js.native
  open class PageStateMatcher protected ()
    extends StObject
       with typingsJapgolly.chrome.chrome.declarativeContent.PageStateMatcher {
    def this(options: typingsJapgolly.chrome.chrome.declarativeContent.PageStateMatcherProperties) = this()
  }
  
  @JSGlobal("chrome.declarativeContent.PageStateMatcherProperties")
  @js.native
  open class PageStateMatcherProperties ()
    extends StObject
       with typingsJapgolly.chrome.chrome.declarativeContent.PageStateMatcherProperties
  
  @JSGlobal("chrome.declarativeContent.SetIcon")
  @js.native
  open class SetIcon ()
    extends StObject
       with typingsJapgolly.chrome.chrome.declarativeContent.SetIcon {
    def this(options: ImageData) = this()
  }
  
  @JSGlobal("chrome.declarativeContent.ShowAction")
  @js.native
  open class ShowAction ()
    extends StObject
       with typingsJapgolly.chrome.chrome.declarativeContent.ShowAction
  
  @JSGlobal("chrome.declarativeContent.ShowPageAction")
  @js.native
  open class ShowPageAction ()
    extends StObject
       with typingsJapgolly.chrome.chrome.declarativeContent.ShowPageAction
  
  @JSGlobal("chrome.declarativeContent.onPageChanged")
  @js.native
  def onPageChanged: PageChangedEvent = js.native
  inline def onPageChanged_=(x: PageChangedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onPageChanged")(x.asInstanceOf[js.Any])
}
