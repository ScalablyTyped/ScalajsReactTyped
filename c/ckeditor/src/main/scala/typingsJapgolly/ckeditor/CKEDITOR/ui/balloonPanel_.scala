package typingsJapgolly.ckeditor.CKEDITOR.ui

import org.scalablytyped.runtime.NumberDictionary
import typingsJapgolly.ckeditor.AnonFocusElement
import typingsJapgolly.ckeditor.AnonRemoveListenerListenerRegistration
import typingsJapgolly.ckeditor.CKEDITOR.dom.element
import typingsJapgolly.ckeditor.CKEDITOR.listenerRegistration
import typingsJapgolly.ckeditor.CKEDITOR.ui.balloonPanel.parts
import typingsJapgolly.ckeditor.CKEDITOR.ui.balloonPanel.rect
import typingsJapgolly.ckeditor.CKEDITOR.ui.balloonPanel.templateDefinitions
import typingsJapgolly.ckeditor.CKEDITOR.ui.balloonPanel.templates
import typingsJapgolly.ckeditor.ckeditorStrings.bottom
import typingsJapgolly.ckeditor.ckeditorStrings.left
import typingsJapgolly.ckeditor.ckeditorStrings.right
import typingsJapgolly.ckeditor.ckeditorStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.ui.balloonPanel")
@js.native
class balloonPanel_ () extends js.Object {
  var activeShowListeners: NumberDictionary[AnonRemoveListenerListenerRegistration] = js.native
  var editor: typingsJapgolly.ckeditor.CKEDITOR.editor = js.native
  var focusables: NumberDictionary[element] = js.native
  var height: String = js.native
  var parts: parts = js.native
  var rect: rect = js.native
  var showListeners: NumberDictionary[js.Function0[listenerRegistration]] = js.native
  var templateDefinitions: templateDefinitions = js.native
  var templates: templates = js.native
  var triangleHeight: Double = js.native
  var triangleMinDistance: Double = js.native
  var triangleWidth: Double = js.native
  var width: Double = js.native
  def activateShowListeners(): Unit = js.native
  def activeShowListener(id: Double): Unit = js.native
  def addShowListener(listener: js.Function0[listenerRegistration]): listenerRegistration = js.native
  def attach(element: element): Unit = js.native
  def attach(element: element, options: Boolean): Unit = js.native
  def attach(element: element, options: AnonFocusElement): Unit = js.native
  def attach(element: element, options: element): Unit = js.native
  def blur(): Unit = js.native
  def build(): Unit = js.native
  def deactivateShowListener(id: Double): Unit = js.native
  def deregisterFocusable(element: element): Unit = js.native
  def destroy(): Unit = js.native
  def getHeight(): Double = js.native
  def getWidth(): Double = js.native
  def hide(): Unit = js.native
  def move(top: Double, left: Double): Unit = js.native
  def registerFocusable(element: element): Unit = js.native
  def removeShowListener(id: Double): Unit = js.native
  def resize(width: Double, height: Double): Unit = js.native
  def setTitle(title: String): Unit = js.native
  @JSName("setTriangle")
  def setTriangle_bottom(side: bottom): Unit = js.native
  @JSName("setTriangle")
  def setTriangle_left(side: left): Unit = js.native
  @JSName("setTriangle")
  def setTriangle_right(side: right): Unit = js.native
  @JSName("setTriangle")
  def setTriangle_top(side: top): Unit = js.native
  def show(): Unit = js.native
}

