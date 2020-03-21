package typingsJapgolly.instagramPrivateApi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<instagram-private-api.instagram-private-api/dist/sticker-builder/stickers.AttachmentSticker> */
trait PartialAttachmentSticker extends js.Object {
  var additionalConfigureProperties: js.UndefOr[js.Function0[_]] = js.undefined
  var bottom: js.UndefOr[js.Function0[this.type]] = js.undefined
  var center: js.UndefOr[js.Function0[this.type]] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var id: js.UndefOr[js.Function0[String]] = js.undefined
  var isSticker: js.UndefOr[Boolean] = js.undefined
  var key: js.UndefOr[js.Function0[String]] = js.undefined
  var left: js.UndefOr[js.Function0[this.type]] = js.undefined
  var mediaId: js.UndefOr[String] = js.undefined
  var mediaOwnerId: js.UndefOr[String] = js.undefined
  var moveBackwards: js.UndefOr[js.Function1[/* layers */ js.UndefOr[Double], this.type]] = js.undefined
  var moveForward: js.UndefOr[js.Function1[/* layers */ js.UndefOr[Double], this.type]] = js.undefined
  var right: js.UndefOr[js.Function0[this.type]] = js.undefined
  var rotateDeg: js.UndefOr[js.Function1[/* deg */ Double, this.type]] = js.undefined
  var rotation: js.UndefOr[Double] = js.undefined
  var scale: js.UndefOr[js.Function1[/* factor */ Double, this.type]] = js.undefined
  var toJSON: js.UndefOr[js.Function0[_]] = js.undefined
  var top: js.UndefOr[js.Function0[this.type]] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
  var x: js.UndefOr[Double] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
  var z: js.UndefOr[Double] = js.undefined
}

object PartialAttachmentSticker {
  @scala.inline
  def apply(
    additionalConfigureProperties: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    bottom: js.UndefOr[CallbackTo[PartialAttachmentSticker]] = js.undefined,
    center: js.UndefOr[CallbackTo[PartialAttachmentSticker]] = js.undefined,
    height: Int | Double = null,
    id: js.UndefOr[CallbackTo[String]] = js.undefined,
    isSticker: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[CallbackTo[String]] = js.undefined,
    left: js.UndefOr[CallbackTo[PartialAttachmentSticker]] = js.undefined,
    mediaId: String = null,
    mediaOwnerId: String = null,
    moveBackwards: /* layers */ js.UndefOr[Double] => CallbackTo[PartialAttachmentSticker] = null,
    moveForward: /* layers */ js.UndefOr[Double] => CallbackTo[PartialAttachmentSticker] = null,
    right: js.UndefOr[CallbackTo[PartialAttachmentSticker]] = js.undefined,
    rotateDeg: /* deg */ Double => CallbackTo[PartialAttachmentSticker] = null,
    rotation: Int | Double = null,
    scale: /* factor */ Double => CallbackTo[PartialAttachmentSticker] = null,
    toJSON: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    top: js.UndefOr[CallbackTo[PartialAttachmentSticker]] = js.undefined,
    width: Int | Double = null,
    x: Int | Double = null,
    y: Int | Double = null,
    z: Int | Double = null
  ): PartialAttachmentSticker = {
    val __obj = js.Dynamic.literal()
    additionalConfigureProperties.foreach(p => __obj.updateDynamic("additionalConfigureProperties")(p.toJsFn))
    bottom.foreach(p => __obj.updateDynamic("bottom")(p.toJsFn))
    center.foreach(p => __obj.updateDynamic("center")(p.toJsFn))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    id.foreach(p => __obj.updateDynamic("id")(p.toJsFn))
    if (!js.isUndefined(isSticker)) __obj.updateDynamic("isSticker")(isSticker.asInstanceOf[js.Any])
    key.foreach(p => __obj.updateDynamic("key")(p.toJsFn))
    left.foreach(p => __obj.updateDynamic("left")(p.toJsFn))
    if (mediaId != null) __obj.updateDynamic("mediaId")(mediaId.asInstanceOf[js.Any])
    if (mediaOwnerId != null) __obj.updateDynamic("mediaOwnerId")(mediaOwnerId.asInstanceOf[js.Any])
    if (moveBackwards != null) __obj.updateDynamic("moveBackwards")(js.Any.fromFunction1((t0: /* layers */ js.UndefOr[scala.Double]) => moveBackwards(t0).runNow()))
    if (moveForward != null) __obj.updateDynamic("moveForward")(js.Any.fromFunction1((t0: /* layers */ js.UndefOr[scala.Double]) => moveForward(t0).runNow()))
    right.foreach(p => __obj.updateDynamic("right")(p.toJsFn))
    if (rotateDeg != null) __obj.updateDynamic("rotateDeg")(js.Any.fromFunction1((t0: /* deg */ scala.Double) => rotateDeg(t0).runNow()))
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(js.Any.fromFunction1((t0: /* factor */ scala.Double) => scale(t0).runNow()))
    toJSON.foreach(p => __obj.updateDynamic("toJSON")(p.toJsFn))
    top.foreach(p => __obj.updateDynamic("top")(p.toJsFn))
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (z != null) __obj.updateDynamic("z")(z.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialAttachmentSticker]
  }
}

