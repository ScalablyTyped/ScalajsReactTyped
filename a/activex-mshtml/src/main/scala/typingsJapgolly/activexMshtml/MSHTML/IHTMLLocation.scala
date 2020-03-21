package typingsJapgolly.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.IHTMLLocation")
@js.native
class IHTMLLocation protected () extends js.Object {
  @JSName("MSHTML.IHTMLLocation_typekey")
  var MSHTMLDotIHTMLLocation_typekey: IHTMLLocation = js.native
  var hash: String = js.native
  var host: String = js.native
  var hostname: String = js.native
  var href: String = js.native
  var pathname: String = js.native
  var port: String = js.native
  var protocol: String = js.native
  var search: String = js.native
  def assign(bstr: String): Unit = js.native
  /** @param flag [flag=false] */
  def reload(): Unit = js.native
  def reload(flag: Boolean): Unit = js.native
  def replace(bstr: String): Unit = js.native
}

