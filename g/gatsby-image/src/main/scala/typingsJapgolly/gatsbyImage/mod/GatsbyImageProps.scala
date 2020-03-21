package typingsJapgolly.gatsbyImage.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.gatsbyImage.AnonWasCached
import typingsJapgolly.gatsbyImage.gatsbyImageStrings.`lazy`
import typingsJapgolly.gatsbyImage.gatsbyImageStrings.auto
import typingsJapgolly.gatsbyImage.gatsbyImageStrings.eager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GatsbyImageProps extends js.Object {
  var Tag: js.UndefOr[String] = js.undefined
  var alt: js.UndefOr[String] = js.undefined
  var backgroundColor: js.UndefOr[String | Boolean] = js.undefined
  var className: js.UndefOr[String | js.Object] = js.undefined
  var critical: js.UndefOr[Boolean] = js.undefined
  var crossOrigin: js.UndefOr[String | Boolean] = js.undefined
  var draggable: js.UndefOr[Boolean] = js.undefined
  var durationFadeIn: js.UndefOr[Double] = js.undefined
  var fadeIn: js.UndefOr[Boolean] = js.undefined
  var fixed: js.UndefOr[FixedObject | js.Array[FixedObject]] = js.undefined
  var fluid: js.UndefOr[FluidObject | js.Array[FluidObject]] = js.undefined
  var imgStyle: js.UndefOr[js.Object] = js.undefined
  var itemProp: js.UndefOr[String] = js.undefined
  var loading: js.UndefOr[auto | `lazy` | eager] = js.undefined
  var onError: js.UndefOr[js.Function1[/* event */ js.Any, Unit]] = js.undefined
  var onLoad: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onStartLoad: js.UndefOr[js.Function1[/* param */ AnonWasCached, Unit]] = js.undefined
  var placeholderClassName: js.UndefOr[String] = js.undefined
  var placeholderStyle: js.UndefOr[js.Object] = js.undefined
  var resolutions: js.UndefOr[FixedObject] = js.undefined
  var sizes: js.UndefOr[FluidObject] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object GatsbyImageProps {
  @scala.inline
  def apply(
    Tag: String = null,
    alt: String = null,
    backgroundColor: String | Boolean = null,
    className: String | js.Object = null,
    critical: js.UndefOr[Boolean] = js.undefined,
    crossOrigin: String | Boolean = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    durationFadeIn: Int | Double = null,
    fadeIn: js.UndefOr[Boolean] = js.undefined,
    fixed: FixedObject | js.Array[FixedObject] = null,
    fluid: FluidObject | js.Array[FluidObject] = null,
    imgStyle: js.Object = null,
    itemProp: String = null,
    loading: auto | `lazy` | eager = null,
    onError: /* event */ js.Any => Callback = null,
    onLoad: js.UndefOr[Callback] = js.undefined,
    onStartLoad: /* param */ AnonWasCached => Callback = null,
    placeholderClassName: String = null,
    placeholderStyle: js.Object = null,
    resolutions: FixedObject = null,
    sizes: FluidObject = null,
    style: js.Object = null,
    title: String = null
  ): GatsbyImageProps = {
    val __obj = js.Dynamic.literal()
    if (Tag != null) __obj.updateDynamic("Tag")(Tag.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(critical)) __obj.updateDynamic("critical")(critical.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (durationFadeIn != null) __obj.updateDynamic("durationFadeIn")(durationFadeIn.asInstanceOf[js.Any])
    if (!js.isUndefined(fadeIn)) __obj.updateDynamic("fadeIn")(fadeIn.asInstanceOf[js.Any])
    if (fixed != null) __obj.updateDynamic("fixed")(fixed.asInstanceOf[js.Any])
    if (fluid != null) __obj.updateDynamic("fluid")(fluid.asInstanceOf[js.Any])
    if (imgStyle != null) __obj.updateDynamic("imgStyle")(imgStyle.asInstanceOf[js.Any])
    if (itemProp != null) __obj.updateDynamic("itemProp")(itemProp.asInstanceOf[js.Any])
    if (loading != null) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: /* event */ js.Any) => onError(t0).runNow()))
    onLoad.foreach(p => __obj.updateDynamic("onLoad")(p.toJsFn))
    if (onStartLoad != null) __obj.updateDynamic("onStartLoad")(js.Any.fromFunction1((t0: /* param */ typingsJapgolly.gatsbyImage.AnonWasCached) => onStartLoad(t0).runNow()))
    if (placeholderClassName != null) __obj.updateDynamic("placeholderClassName")(placeholderClassName.asInstanceOf[js.Any])
    if (placeholderStyle != null) __obj.updateDynamic("placeholderStyle")(placeholderStyle.asInstanceOf[js.Any])
    if (resolutions != null) __obj.updateDynamic("resolutions")(resolutions.asInstanceOf[js.Any])
    if (sizes != null) __obj.updateDynamic("sizes")(sizes.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatsbyImageProps]
  }
}

