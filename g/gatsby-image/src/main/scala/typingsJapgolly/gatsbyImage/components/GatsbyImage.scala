package typingsJapgolly.gatsbyImage.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.gatsbyImage.AnonWasCached
import typingsJapgolly.gatsbyImage.gatsbyImageStrings.`lazy`
import typingsJapgolly.gatsbyImage.gatsbyImageStrings.auto
import typingsJapgolly.gatsbyImage.gatsbyImageStrings.eager
import typingsJapgolly.gatsbyImage.mod.FixedObject
import typingsJapgolly.gatsbyImage.mod.FluidObject
import typingsJapgolly.gatsbyImage.mod.GatsbyImageProps
import typingsJapgolly.gatsbyImage.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object GatsbyImage {
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
    title: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[GatsbyImageProps, default, Unit, GatsbyImageProps] = {
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
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.gatsbyImage.mod.GatsbyImageProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.gatsbyImage.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.gatsbyImage.mod.GatsbyImageProps])(children: _*)
  }
  @JSImport("gatsby-image", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

