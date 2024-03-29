package typingsJapgolly.reactNativeWindows.rntypesMod

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.reactNativeWindows.anon.Commands
import typingsJapgolly.reactNativeWindows.anon.Format
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UIManagerStatic extends StObject {
  
  def dispatchViewManagerCommand(reactTag: Double, commandID: String): Unit = js.native
  def dispatchViewManagerCommand(reactTag: Double, commandID: String, commandArgs: js.Array[Any]): Unit = js.native
  /**
    * Used to call a native view method from JavaScript
    *
    * reactTag - Id of react view.
    * commandID - Id of the native method that should be called.
    * commandArgs - Args of the native method that we can pass from JS to native.
    */
  def dispatchViewManagerCommand(reactTag: Double, commandID: Double): Unit = js.native
  def dispatchViewManagerCommand(reactTag: Double, commandID: Double, commandArgs: js.Array[Any]): Unit = js.native
  def dispatchViewManagerCommand(reactTag: Null, commandID: String): Unit = js.native
  def dispatchViewManagerCommand(reactTag: Null, commandID: String, commandArgs: js.Array[Any]): Unit = js.native
  def dispatchViewManagerCommand(reactTag: Null, commandID: Double): Unit = js.native
  def dispatchViewManagerCommand(reactTag: Null, commandID: Double, commandArgs: js.Array[Any]): Unit = js.native
  
  def getViewManagerConfig(name: String): Commands = js.native
  
  def hasViewManagerConfig(name: String): Boolean = js.native
  
  /**
    * Determines the location on screen, width, and height of the given view and
    * returns the values via an async callback. If successful, the callback will
    * be called with the following arguments:
    *
    *  - x
    *  - y
    *  - width
    *  - height
    *  - pageX
    *  - pageY
    *
    * Note that these measurements are not available until after the rendering
    * has been completed in native. If you need the measurements as soon as
    * possible, consider using the [`onLayout`
    * prop](docs/view.html#onlayout) instead.
    *
    * @deprecated Use `ref.measure` instead.
    */
  def measure(node: Double, callback: MeasureOnSuccessCallback): Unit = js.native
  
  /**
    * Determines the location of the given view in the window and returns the
    * values via an async callback. If the React root view is embedded in
    * another native view, this will give you the absolute coordinates. If
    * successful, the callback will be called with the following
    * arguments:
    *
    *  - x
    *  - y
    *  - width
    *  - height
    *
    * Note that these measurements are not available until after the rendering
    * has been completed in native.
    *
    * @deprecated Use `ref.measureInWindow` instead.
    */
  def measureInWindow(node: Double, callback: MeasureInWindowOnSuccessCallback): Unit = js.native
  
  /**
    * Like [`measure()`](#measure), but measures the view relative an ancestor,
    * specified as `relativeToNativeNode`. This means that the returned x, y
    * are relative to the origin x, y of the ancestor view.
    *
    * As always, to obtain a native node handle for a component, you can use
    * `React.findNodeHandle(component)`.
    *
    * @deprecated Use `ref.measureLayout` instead.
    */
  def measureLayout(
    node: Double,
    relativeToNativeNode: Double,
    onFail: js.Function0[Unit],
    onSuccess: MeasureLayoutOnSuccessCallback
  ): Unit = js.native
  
  /**
    * Automatically animates views to their new positions when the
    * next layout happens.
    *
    * A common way to use this API is to call it before calling `setState`.
    *
    * Note that in order to get this to work on **Android** you need to set the following flags via `UIManager`:
    *
    *     UIManager.setLayoutAnimationEnabledExperimental && UIManager.setLayoutAnimationEnabledExperimental(true);
    */
  def setLayoutAnimationEnabledExperimental(value: Boolean): Unit = js.native
  
  /**
    * Used to display an Android PopupMenu. If a menu item is pressed, the success callback will
    * be called with the following arguments:
    *
    *  - item - the menu item.
    *  - index - index of the pressed item in array. Returns `undefined` if cancelled.
    *
    * To obtain a native node handle for a component, you can use
    * `React.findNodeHandle(component)`.
    *
    * Note that this works only on Android
    */
  def showPopupMenu(
    node: Double,
    items: js.Array[String],
    error: js.Function0[Unit],
    success: js.Function2[/* item */ String, /* index */ js.UndefOr[Double], Unit]
  ): Unit = js.native
  
  /**
    * Capture an image of the screen, window or an individual view. The image
    * will be stored in a temporary file that will only exist for as long as the
    * app is running.
    *
    * The `view` argument can be the literal string `window` if you want to
    * capture the entire window, or it can be a reference to a specific
    * React Native component.
    *
    * The `options` argument may include:
    * - width/height (number) - the width and height of the image to capture.
    * - format (string) - either 'png' or 'jpeg'. Defaults to 'png'.
    * - quality (number) - the quality when using jpeg. 0.0 - 1.0 (default).
    *
    * Returns a Promise<string> (tempFilePath)
    * @platform ios
    */
  def takeSnapshot(): js.Promise[String] = js.native
  def takeSnapshot(view: Element): js.Promise[String] = js.native
  def takeSnapshot(view: Element, options: Format): js.Promise[String] = js.native
  def takeSnapshot(view: Double): js.Promise[String] = js.native
  def takeSnapshot(view: Double, options: Format): js.Promise[String] = js.native
  def takeSnapshot(view: Unit, options: Format): js.Promise[String] = js.native
  @JSName("takeSnapshot")
  def takeSnapshot_window(view: window): js.Promise[String] = js.native
  @JSName("takeSnapshot")
  def takeSnapshot_window(view: window, options: Format): js.Promise[String] = js.native
}
