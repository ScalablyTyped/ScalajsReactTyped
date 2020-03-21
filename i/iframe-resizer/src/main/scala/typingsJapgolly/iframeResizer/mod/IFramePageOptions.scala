package typingsJapgolly.iframeResizer.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line:interface-name
trait IFramePageOptions extends js.Object {
  /**
    * These option can be used to override the option set in the parent page
    */
  var heightCalculationMethod: js.UndefOr[HeightCalculationMethod | js.Function0[Double]] = js.undefined
  /**
    * Receive message posted from the parent page with the iframe.iFrameResizer.sendMessage() method.
    */
  var messageCallback: js.UndefOr[js.Function1[/* message */ js.Any, Unit]] = js.undefined
  /**
    * This function is called once iFrame-Resizer has been initialized after receiving a call from the parent page.
    */
  var readyCallback: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * This option allows you to restrict the domain of the parent page,
    * to prevent other sites mimicking your parent page.
    */
  var targetOrigin: js.UndefOr[String] = js.undefined
  /**
    * These option can be used to override the option set in the parent page
    */
  var widthCalculationMethod: js.UndefOr[WidthCalculationMethod | js.Function0[Double]] = js.undefined
}

object IFramePageOptions {
  @scala.inline
  def apply(
    heightCalculationMethod: HeightCalculationMethod | js.Function0[Double] = null,
    messageCallback: /* message */ js.Any => Callback = null,
    readyCallback: js.UndefOr[Callback] = js.undefined,
    targetOrigin: String = null,
    widthCalculationMethod: WidthCalculationMethod | js.Function0[Double] = null
  ): IFramePageOptions = {
    val __obj = js.Dynamic.literal()
    if (heightCalculationMethod != null) __obj.updateDynamic("heightCalculationMethod")(heightCalculationMethod.asInstanceOf[js.Any])
    if (messageCallback != null) __obj.updateDynamic("messageCallback")(js.Any.fromFunction1((t0: /* message */ js.Any) => messageCallback(t0).runNow()))
    readyCallback.foreach(p => __obj.updateDynamic("readyCallback")(p.toJsFn))
    if (targetOrigin != null) __obj.updateDynamic("targetOrigin")(targetOrigin.asInstanceOf[js.Any])
    if (widthCalculationMethod != null) __obj.updateDynamic("widthCalculationMethod")(widthCalculationMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFramePageOptions]
  }
}

