package typingsJapgolly.jqueryElang

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.jquery.JQuery_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ELangCommonStatic extends js.Object {
  var resource: IPageResource = js.native
  def getLabel(labelid: String): String = js.native
  def getLabel(labelid: String, langid: String): String = js.native
  def setLang(langid: String): Unit = js.native
  def setLang(langid: String, node: JQuery_[HTMLElement]): Unit = js.native
}

