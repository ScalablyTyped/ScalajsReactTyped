package typingsJapgolly.naverWhale

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.chrome.chrome.declarativeContent.PageChangedEvent
import typingsJapgolly.chrome.chrome.declarativeContent.PageStateMatcherProperties
import typingsJapgolly.naverWhale.whale.declarativeContent.PageStateMatcher
import typingsJapgolly.naverWhale.whale.declarativeContent.ShowPageAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofdeclarativeContent extends js.Object {
  var PageStateMatcher: Instantiable1[
    /* options */ PageStateMatcherProperties, 
    typingsJapgolly.naverWhale.whale.declarativeContent.PageStateMatcher
  ]
  var PageStateMatcherProperties: Instantiable0[typingsJapgolly.naverWhale.whale.declarativeContent.PageStateMatcherProperties]
  var ShowPageAction: Instantiable0[typingsJapgolly.naverWhale.whale.declarativeContent.ShowPageAction]
  var onPageChanged: PageChangedEvent
}

object TypeofdeclarativeContent {
  @scala.inline
  def apply(
    PageStateMatcher: Instantiable1[/* options */ PageStateMatcherProperties, PageStateMatcher],
    PageStateMatcherProperties: Instantiable0[typingsJapgolly.naverWhale.whale.declarativeContent.PageStateMatcherProperties],
    ShowPageAction: Instantiable0[ShowPageAction],
    onPageChanged: PageChangedEvent
  ): TypeofdeclarativeContent = {
    val __obj = js.Dynamic.literal(PageStateMatcher = PageStateMatcher.asInstanceOf[js.Any], PageStateMatcherProperties = PageStateMatcherProperties.asInstanceOf[js.Any], ShowPageAction = ShowPageAction.asInstanceOf[js.Any], onPageChanged = onPageChanged.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TypeofdeclarativeContent]
  }
}

