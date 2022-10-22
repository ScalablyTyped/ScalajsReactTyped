package typingsJapgolly.nodeRedEditorClient.mod

import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.nodeRedEditorClient.anon.Buttons
import typingsJapgolly.nodeRedEditorClient.mod.global.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Notifications extends StObject {
  
  def init(): Unit = js.native
  
  def notify(msg: String): HTMLDivElement = js.native
  def notify(msg: String, options: Buttons): HTMLDivElement = js.native
  def notify(msg: String, `type`: Unit, fixed: Boolean): HTMLDivElement = js.native
  def notify(msg: String, `type`: Unit, fixed: Boolean, timeout: Double): HTMLDivElement = js.native
  def notify(msg: String, `type`: Unit, fixed: Unit, timeout: Double): HTMLDivElement = js.native
  def notify(msg: String, `type`: NotificationType): HTMLDivElement = js.native
  def notify(msg: String, `type`: NotificationType, fixed: Boolean): HTMLDivElement = js.native
  def notify(msg: String, `type`: NotificationType, fixed: Boolean, timeout: Double): HTMLDivElement = js.native
  def notify(msg: String, `type`: NotificationType, fixed: Unit, timeout: Double): HTMLDivElement = js.native
  def notify(msg: JQuery[HTMLElement]): HTMLDivElement = js.native
  def notify(msg: JQuery[HTMLElement], options: Buttons): HTMLDivElement = js.native
  def notify(msg: JQuery[HTMLElement], `type`: Unit, fixed: Boolean): HTMLDivElement = js.native
  def notify(msg: JQuery[HTMLElement], `type`: Unit, fixed: Boolean, timeout: Double): HTMLDivElement = js.native
  def notify(msg: JQuery[HTMLElement], `type`: Unit, fixed: Unit, timeout: Double): HTMLDivElement = js.native
  def notify(msg: JQuery[HTMLElement], `type`: NotificationType): HTMLDivElement = js.native
  def notify(msg: JQuery[HTMLElement], `type`: NotificationType, fixed: Boolean): HTMLDivElement = js.native
  def notify(msg: JQuery[HTMLElement], `type`: NotificationType, fixed: Boolean, timeout: Double): HTMLDivElement = js.native
  def notify(msg: JQuery[HTMLElement], `type`: NotificationType, fixed: Unit, timeout: Double): HTMLDivElement = js.native
}
