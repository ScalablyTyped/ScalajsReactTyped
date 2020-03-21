package typingsJapgolly.reactNative.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImagePropsIOS extends js.Object {
  /**
    * blurRadius: the blur radius of the blur filter added to the image
    * @platform ios
    */
  var blurRadius: js.UndefOr[Double] = js.undefined
  /**
    * When the image is resized, the corners of the size specified by capInsets will stay a fixed size,
    * but the center content and borders of the image will be stretched.
    * This is useful for creating resizable rounded buttons, shadows, and other resizable assets.
    * More info on Apple documentation
    */
  var capInsets: js.UndefOr[Insets] = js.undefined
  /**
    * Invoked when a partial load of the image is complete. The definition of
    * what constitutes a "partial load" is loader specific though this is meant
    * for progressive JPEG loads.
    * @platform ios
    */
  var onPartialLoad: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Invoked on download progress with {nativeEvent: {loaded, total}}
    */
  var onProgress: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with Element], Unit]] = js.undefined
}

object ImagePropsIOS {
  @scala.inline
  def apply(
    blurRadius: Int | Double = null,
    capInsets: Insets = null,
    onPartialLoad: js.UndefOr[Callback] = js.undefined,
    onProgress: ReactEventFrom[NodeHandle with Element] => Callback = null
  ): ImagePropsIOS = {
    val __obj = js.Dynamic.literal()
    if (blurRadius != null) __obj.updateDynamic("blurRadius")(blurRadius.asInstanceOf[js.Any])
    if (capInsets != null) __obj.updateDynamic("capInsets")(capInsets.asInstanceOf[js.Any])
    onPartialLoad.foreach(p => __obj.updateDynamic("onPartialLoad")(p.toJsFn))
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onProgress(t0).runNow()))
    __obj.asInstanceOf[ImagePropsIOS]
  }
}

