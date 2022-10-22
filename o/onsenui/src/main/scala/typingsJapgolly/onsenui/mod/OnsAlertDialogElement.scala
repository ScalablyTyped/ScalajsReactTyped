package typingsJapgolly.onsenui.mod

import org.scalajs.dom.EventListenerOptions
import typingsJapgolly.std.AddEventListenerOptions
import typingsJapgolly.std.EventListenerOrEventListenerObject
import typingsJapgolly.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @modifier android Display an Android style alert dialog
  * @description Alert dialog that is displayed on top of the current screen
  */
@js.native
trait OnsAlertDialogElement
  extends StObject
     with HTMLElement {
  
  /* standard dom */
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
  
  var animationOptions: js.UndefOr[js.Object] = js.native
  
  /**
    * @description A boolean value that specifies whether the dialog is cancelable or not. When the dialog is cancelable it can be closed by tapping the background or by pressing the back button on Android devices.
    */
  var cancelable: Boolean = js.native
  
  /**
    * @description A boolean value that specifies whether the dialog is disabled or not.
    */
  var disabled: Boolean = js.native
  
  /**
    * @param {Object} [options] Parameter object
    * @param {String} [options.animation] Animation name. Available animations are "fade", "slide" and "none"
    * @param {Function} [options.callback] Function to execute after the dialog has been hidden
    * @description Hide the alert dialog
    */
  def hide(): js.Promise[org.scalajs.dom.HTMLElement] = js.native
  def hide(options: DialogOptions): js.Promise[org.scalajs.dom.HTMLElement] = js.native
  
  var maskColor: js.UndefOr[String] = js.native
  
  var onDeviceBackButton: Any = js.native
  
  /* standard dom */
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  
  /**
    * @param {Object} [options] Parameter object
    * @param {String} [options.animation] Animation name. Available animations are "fade", "slide" and "none"
    * @param {Function} [options.callback] Function to execute after the dialog has been revealed
    * @description Show the alert dialog
    */
  def show(): js.Promise[org.scalajs.dom.HTMLElement] = js.native
  def show(options: DialogOptions): js.Promise[org.scalajs.dom.HTMLElement] = js.native
  
  var visible: Any = js.native
}
