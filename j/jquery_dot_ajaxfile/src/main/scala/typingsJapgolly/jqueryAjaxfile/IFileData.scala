package typingsJapgolly.jqueryAjaxfile

import org.scalajs.dom.raw.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileData extends js.Object {
  var element: HTMLInputElement
  var name: String
}

object IFileData {
  @scala.inline
  def apply(element: HTMLInputElement, name: String): IFileData = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IFileData]
  }
}

