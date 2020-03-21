package typingsJapgolly.webix.mod

import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait html extends js.Object {
  def addCss(node: HTMLElement, name: String): Unit = js.native
  def addMeta(name: String, value: String): Unit = js.native
  def addStyle(css: String): Unit = js.native
  def allowSelect(): Unit = js.native
  def create(name: String, attrs: js.Any): HTMLElement = js.native
  def create(name: String, attrs: js.Any, html: String): HTMLElement = js.native
  def createCss(data: js.Any): String = js.native
  def denySelect(): Unit = js.native
  def getTextSize(text: String): SizeInfo = js.native
  def getTextSize(text: String, css: String): SizeInfo = js.native
  def getTextSize(text: String, css: String, width: Double): SizeInfo = js.native
  def getTextSize(text: js.Array[String]): SizeInfo = js.native
  def getTextSize(text: js.Array[String], css: String): SizeInfo = js.native
  def getTextSize(text: js.Array[String], css: String, width: Double): SizeInfo = js.native
  def getValue(node: HTMLElement): String = js.native
  def index(node: HTMLElement): Double = js.native
  def insertBefore(node: HTMLElement, before: HTMLElement): Unit = js.native
  def insertBefore(node: HTMLElement, before: HTMLElement, rescue: HTMLElement): Unit = js.native
  def locate(ev: Event_, name: String): String = js.native
  def locate(ev: typingsJapgolly.std.HTMLElement, name: String): String = js.native
  def offset(node: HTMLElement): js.Any = js.native
  def pos(ev: Event_): js.Any = js.native
  def posRelative(ev: Event_): js.Any = js.native
  def preventEvent(ev: Event_): Boolean = js.native
  def remove(node: js.Array[typingsJapgolly.std.HTMLElement]): Unit = js.native
  def remove(node: typingsJapgolly.std.HTMLElement): Unit = js.native
  def removeCss(node: HTMLElement, name: String): Unit = js.native
  def stopEvent(ev: Event_): Boolean = js.native
  def triggerEvent(node: HTMLElement, `type`: String, name: String): Unit = js.native
}

@JSImport("webix", "html")
@js.native
object html
  extends TopLevel[typingsJapgolly.webix.webix.html]

