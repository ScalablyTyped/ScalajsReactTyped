package typingsJapgolly.ionicCore.componentsMod.LocalJSX

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonImg extends js.Object {
  /**
    * This attribute defines the alternative text describing the image. Users will see this text displayed if the image URL is wrong, the image is not in one of the supported formats, or if the image is not yet downloaded.
    */
  var alt: js.UndefOr[String] = js.undefined
  /**
    * Emitted when the img fails to load
    */
  var onIonError: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.undefined
  /**
    * Emitted when the image has finished loading
    */
  var onIonImgDidLoad: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.undefined
  /**
    * Emitted when the img src has been set
    */
  var onIonImgWillLoad: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.undefined
  /**
    * The image URL. This attribute is mandatory for the `<img>` element.
    */
  var src: js.UndefOr[String] = js.undefined
}

object IonImg {
  @scala.inline
  def apply(
    alt: String = null,
    onIonError: /* event */ CustomEvent => Callback = null,
    onIonImgDidLoad: /* event */ CustomEvent => Callback = null,
    onIonImgWillLoad: /* event */ CustomEvent => Callback = null,
    src: String = null
  ): IonImg = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (onIonError != null) __obj.updateDynamic("onIonError")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => onIonError(t0).runNow()))
    if (onIonImgDidLoad != null) __obj.updateDynamic("onIonImgDidLoad")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => onIonImgDidLoad(t0).runNow()))
    if (onIonImgWillLoad != null) __obj.updateDynamic("onIonImgWillLoad")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => onIonImgWillLoad(t0).runNow()))
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonImg]
  }
}

