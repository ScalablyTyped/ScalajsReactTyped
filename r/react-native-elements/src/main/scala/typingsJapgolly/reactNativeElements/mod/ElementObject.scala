package typingsJapgolly.reactNativeElements.mod

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.react.mod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementObject extends js.Object {
  var element: Element | ReactType[_]
}

object ElementObject {
  @scala.inline
  def apply(element: Element | ReactType[_]): ElementObject = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ElementObject]
  }
}

