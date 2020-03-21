package typingsJapgolly.chrome

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.chrome.chrome.declarativeContent.PageChangedEvent
import typingsJapgolly.chrome.chrome.declarativeContent.PageStateMatcher
import typingsJapgolly.chrome.chrome.declarativeContent.PageStateMatcherProperties
import typingsJapgolly.chrome.chrome.declarativeContent.ShowPageAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofdeclarativeContent extends js.Object {
  var PageStateMatcher: Instantiable1[
    /* options */ PageStateMatcherProperties, 
    typingsJapgolly.chrome.chrome.declarativeContent.PageStateMatcher
  ]
  var PageStateMatcherProperties: Instantiable0[typingsJapgolly.chrome.chrome.declarativeContent.PageStateMatcherProperties]
  var ShowPageAction: Instantiable0[typingsJapgolly.chrome.chrome.declarativeContent.ShowPageAction]
  var onPageChanged: PageChangedEvent
}

object TypeofdeclarativeContent {
  @scala.inline
  def apply(
    PageStateMatcher: Instantiable1[/* options */ PageStateMatcherProperties, PageStateMatcher],
    PageStateMatcherProperties: Instantiable0[PageStateMatcherProperties],
    ShowPageAction: Instantiable0[ShowPageAction],
    onPageChanged: PageChangedEvent
  ): TypeofdeclarativeContent = {
    val __obj = js.Dynamic.literal(PageStateMatcher = PageStateMatcher.asInstanceOf[js.Any], PageStateMatcherProperties = PageStateMatcherProperties.asInstanceOf[js.Any], ShowPageAction = ShowPageAction.asInstanceOf[js.Any], onPageChanged = onPageChanged.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TypeofdeclarativeContent]
  }
}

