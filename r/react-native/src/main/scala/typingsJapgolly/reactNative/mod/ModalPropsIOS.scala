package typingsJapgolly.reactNative.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.raw.Element
import typingsJapgolly.reactNative.reactNativeStrings.`landscape-left`
import typingsJapgolly.reactNative.reactNativeStrings.`landscape-right`
import typingsJapgolly.reactNative.reactNativeStrings.`portrait-upside-down`
import typingsJapgolly.reactNative.reactNativeStrings.formSheet
import typingsJapgolly.reactNative.reactNativeStrings.fullScreen
import typingsJapgolly.reactNative.reactNativeStrings.landscape
import typingsJapgolly.reactNative.reactNativeStrings.overFullScreen
import typingsJapgolly.reactNative.reactNativeStrings.pageSheet
import typingsJapgolly.reactNative.reactNativeStrings.portrait
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalPropsIOS extends js.Object {
  /**
    * The `onDismiss` prop allows passing a function that will be called once the modal has been dismissed.
    */
  var onDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * The `onOrientationChange` callback is called when the orientation changes while the modal is being displayed.
    * The orientation provided is only 'portrait' or 'landscape'. This callback is also called on initial render, regardless of the current orientation.
    */
  var onOrientationChange: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with Element], Unit]] = js.undefined
  /**
    * The `presentationStyle` determines the style of modal to show
    */
  var presentationStyle: js.UndefOr[fullScreen | pageSheet | formSheet | overFullScreen] = js.undefined
  /**
    * The `supportedOrientations` prop allows the modal to be rotated to any of the specified orientations.
    * On iOS, the modal is still restricted by what's specified in your app's Info.plist's UISupportedInterfaceOrientations field.
    */
  var supportedOrientations: js.UndefOr[
    js.Array[
      portrait | `portrait-upside-down` | landscape | `landscape-left` | `landscape-right`
    ]
  ] = js.undefined
}

object ModalPropsIOS {
  @scala.inline
  def apply(
    onDismiss: js.UndefOr[Callback] = js.undefined,
    onOrientationChange: ReactEventFrom[NodeHandle with Element] => Callback = null,
    presentationStyle: fullScreen | pageSheet | formSheet | overFullScreen = null,
    supportedOrientations: js.Array[
      portrait | `portrait-upside-down` | landscape | `landscape-left` | `landscape-right`
    ] = null
  ): ModalPropsIOS = {
    val __obj = js.Dynamic.literal()
    onDismiss.foreach(p => __obj.updateDynamic("onDismiss")(p.toJsFn))
    if (onOrientationChange != null) __obj.updateDynamic("onOrientationChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onOrientationChange(t0).runNow()))
    if (presentationStyle != null) __obj.updateDynamic("presentationStyle")(presentationStyle.asInstanceOf[js.Any])
    if (supportedOrientations != null) __obj.updateDynamic("supportedOrientations")(supportedOrientations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalPropsIOS]
  }
}

