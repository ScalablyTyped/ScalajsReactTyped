package typingsJapgolly.spectacle.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.spectacle.mod.CSSProperties
import typingsJapgolly.spectacle.mod.SlideProps
import typingsJapgolly.spectacle.mod.alignType
import typingsJapgolly.spectacle.mod.transitionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Slide {
  def apply(
    align: alignType = null,
    bgColor: String = null,
    bgDarken: Int | Double = null,
    bgImage: String = null,
    bold: js.UndefOr[Boolean] = js.undefined,
    caps: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    contentStyles: CSSProperties = null,
    controlColor: String = null,
    dispatch: js.UndefOr[Callback] = js.undefined,
    hash: Double | String = null,
    history: js.Any = null,
    id: String = null,
    italic: js.UndefOr[Boolean] = js.undefined,
    lastSlideIndex: Int | Double = null,
    margin: Double | String = null,
    notes: String = null,
    onActive: /* slideIndex */ String | Double => Callback = null,
    padding: Double | String = null,
    progressColor: String = null,
    slideIndex: Int | Double = null,
    state: String = null,
    style: CSSProperties = null,
    textAlign: String = null,
    textColor: String = null,
    textFont: String = null,
    textSize: String = null,
    transition: js.Array[transitionType] = null,
    transitionDuration: Int | Double = null,
    transitionIn: js.Array[transitionType] = null,
    transitionOut: js.Array[transitionType] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[SlideProps, typingsJapgolly.spectacle.mod.Slide, Unit, SlideProps] = {
    val __obj = js.Dynamic.literal()
  
      if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (bgColor != null) __obj.updateDynamic("bgColor")(bgColor.asInstanceOf[js.Any])
    if (bgDarken != null) __obj.updateDynamic("bgDarken")(bgDarken.asInstanceOf[js.Any])
    if (bgImage != null) __obj.updateDynamic("bgImage")(bgImage.asInstanceOf[js.Any])
    if (!js.isUndefined(bold)) __obj.updateDynamic("bold")(bold.asInstanceOf[js.Any])
    if (!js.isUndefined(caps)) __obj.updateDynamic("caps")(caps.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (contentStyles != null) __obj.updateDynamic("contentStyles")(contentStyles.asInstanceOf[js.Any])
    if (controlColor != null) __obj.updateDynamic("controlColor")(controlColor.asInstanceOf[js.Any])
    dispatch.foreach(p => __obj.updateDynamic("dispatch")(p.toJsFn))
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (history != null) __obj.updateDynamic("history")(history.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(italic)) __obj.updateDynamic("italic")(italic.asInstanceOf[js.Any])
    if (lastSlideIndex != null) __obj.updateDynamic("lastSlideIndex")(lastSlideIndex.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (notes != null) __obj.updateDynamic("notes")(notes.asInstanceOf[js.Any])
    if (onActive != null) __obj.updateDynamic("onActive")(js.Any.fromFunction1((t0: /* slideIndex */ java.lang.String | scala.Double) => onActive(t0).runNow()))
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (progressColor != null) __obj.updateDynamic("progressColor")(progressColor.asInstanceOf[js.Any])
    if (slideIndex != null) __obj.updateDynamic("slideIndex")(slideIndex.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor.asInstanceOf[js.Any])
    if (textFont != null) __obj.updateDynamic("textFont")(textFont.asInstanceOf[js.Any])
    if (textSize != null) __obj.updateDynamic("textSize")(textSize.asInstanceOf[js.Any])
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    if (transitionIn != null) __obj.updateDynamic("transitionIn")(transitionIn.asInstanceOf[js.Any])
    if (transitionOut != null) __obj.updateDynamic("transitionOut")(transitionOut.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.spectacle.mod.SlideProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.spectacle.mod.Slide](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.spectacle.mod.SlideProps])(children: _*)
  }
  @JSImport("spectacle", "Slide")
  @js.native
  object componentImport extends js.Object
  
}

