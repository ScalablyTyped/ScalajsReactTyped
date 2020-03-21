package typingsJapgolly.dojo.dijit.base

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.dojo.dijit.WidgetBase
import typingsJapgolly.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/_base/focus.html
  *
  * Deprecated module to monitor currently focused node and stack of currently focused widgets.
  * New code should access dijit/focus directly.
  * 
  */
trait focus extends js.Object {
  /**
    * Retrieves a bookmark that can be used with moveToBookmark to return to the same range
    * 
    */
  def getBookmark(): js.Any
  /**
    * Called as getFocus(), this returns an Object showing the current focus
    * and selected text.
    * 
    * Called as getFocus(widget), where widget is a (widget representing) a button
    * that was just pressed, it returns where focus was before that button
    * was pressed.   (Pressing the button may have either shifted focus to the button,
    * or removed focus altogether.)   In this case the selected text is not returned,
    * since it can't be accurately determined.
    * 
    * @param menu               OptionalThe button that was just pressed.  If focus has disappeared or movedto this button, returns the previous focus.  In this case the bookmarkinformation is already lost, and null is returned.             
    * @param openedForWindow               Optionaliframe in which menu was opened             
    */
  def getFocus(menu: WidgetBase, openedForWindow: Window_): js.Any
  /**
    * Returns true if there is no text selected
    * 
    */
  def isCollapsed(): js.Any
  /**
    * Moves current selection to a bookmark
    * 
    * @param bookmark This should be a returned object from dijit.getBookmark()             
    */
  def moveToBookmark(bookmark: js.Object): js.Any
  /**
    * Registers listeners on the specified iframe so that any click
    * or focus event on that iframe (or anything in it) is reported
    * as a focus/click event on the <iframe> itself.
    * Currently only used by editor.
    * 
    * @param iframe             
    */
  def registerIframe(iframe: HTMLElement): js.Any
  /**
    * Registers listeners on the specified window (either the main
    * window or an iframe's window) to detect when the user has clicked somewhere
    * or focused somewhere.
    * Users should call registerIframe() instead of this method.
    * 
    * @param targetWindow               OptionalIf specified this is the window associated with the iframe,i.e. iframe.contentWindow.             
    * @param effectiveNode               OptionalIf specified, report any focus events inside targetWindow asan event on effectiveNode, rather than on evt.target.             
    */
  def registerWin(targetWindow: Window_, effectiveNode: HTMLElement): js.Any
  /**
    * Unregisters listeners on the specified iframe created by registerIframe.
    * After calling be sure to delete or null out the handle itself.
    * 
    * @param handle Handle returned by registerIframe()             
    */
  def unregisterIframe(handle: js.Object): Unit
  /**
    * Unregisters listeners on the specified window (either the main
    * window or an iframe's window) according to handle returned from registerWin().
    * After calling be sure to delete or null out the handle itself.
    * 
    * @param handle             
    */
  def unregisterWin(handle: js.Object): Unit
}

object focus {
  @scala.inline
  def apply(
    getBookmark: CallbackTo[js.Any],
    getFocus: (WidgetBase, Window_) => CallbackTo[js.Any],
    isCollapsed: CallbackTo[js.Any],
    moveToBookmark: js.Object => CallbackTo[js.Any],
    registerIframe: HTMLElement => CallbackTo[js.Any],
    registerWin: (Window_, HTMLElement) => CallbackTo[js.Any],
    unregisterIframe: js.Object => Callback,
    unregisterWin: js.Object => Callback
  ): focus = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getBookmark")(getBookmark.toJsFn)
    __obj.updateDynamic("getFocus")(js.Any.fromFunction2((t0: typingsJapgolly.dojo.dijit.WidgetBase, t1: typingsJapgolly.std.Window_) => getFocus(t0, t1).runNow()))
    __obj.updateDynamic("isCollapsed")(isCollapsed.toJsFn)
    __obj.updateDynamic("moveToBookmark")(js.Any.fromFunction1((t0: js.Object) => moveToBookmark(t0).runNow()))
    __obj.updateDynamic("registerIframe")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.HTMLElement) => registerIframe(t0).runNow()))
    __obj.updateDynamic("registerWin")(js.Any.fromFunction2((t0: typingsJapgolly.std.Window_, t1: org.scalajs.dom.raw.HTMLElement) => registerWin(t0, t1).runNow()))
    __obj.updateDynamic("unregisterIframe")(js.Any.fromFunction1((t0: js.Object) => unregisterIframe(t0).runNow()))
    __obj.updateDynamic("unregisterWin")(js.Any.fromFunction1((t0: js.Object) => unregisterWin(t0).runNow()))
    __obj.asInstanceOf[focus]
  }
}

