package typingsJapgolly.onsenui.mod

import org.scalajs.dom.EventListenerOptions
import typingsJapgolly.std.AddEventListenerOptions
import typingsJapgolly.std.EventListenerOrEventListenerObject
import typingsJapgolly.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @description Dialog that is displayed on top of current screen
  */
@js.native
trait OnsDialogElement
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
    * @description Destroy the dialog and remove it from the DOM tree
    */
  def destroy(): Unit = js.native
  
  /**
    * @description A boolean value that specifies whether the dialog is disabled or not.
    */
  var disabled: Boolean = js.native
  
  /**
    * @param {Object} [options] Parameter object
    * @param {String} [options.animation] Animation name. Available animations are "none", "fade" and "slide"
    * @param {Function} [options.callback] This functions is called after the dialog has been hidden
    * @description Hide the dialog
    */
  def hide(): js.Promise[org.scalajs.dom.HTMLElement] = js.native
  def hide(options: DialogOptions): js.Promise[org.scalajs.dom.HTMLElement] = js.native
  
  var maskColor: js.UndefOr[String] = js.native
  
  /**
    * @return {Object} Device back button handler
    * @description Retrieve the back button handler for overriding the default behavior
    */
  def onDeviceBackButton(): Any = js.native
  
  /* standard dom */
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  
  /**
    * @param {Object} [options] Parameter object
    * @param {String} [options.animation] Animation name. Available animations are "none", "fade" and "slide"
    * @param {Function} [options.callback] This function is called after the dialog has been revealed
    * @description Show the dialog
    */
  def show(): js.Promise[org.scalajs.dom.HTMLElement] = js.native
  def show(options: DialogOptions): js.Promise[org.scalajs.dom.HTMLElement] = js.native
  
  var visible: Any = js.native
}
