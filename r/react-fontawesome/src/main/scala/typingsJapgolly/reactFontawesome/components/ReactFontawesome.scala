package typingsJapgolly.reactFontawesome.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactFontawesome.mod.FontAwesomeFlip
import typingsJapgolly.reactFontawesome.mod.FontAwesomeProps
import typingsJapgolly.reactFontawesome.mod.FontAwesomeSize
import typingsJapgolly.reactFontawesome.mod.FontAwesomeStack
import typingsJapgolly.reactFontawesome.mod.Intermediate
import typingsJapgolly.reactFontawesome.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactFontawesome {
  def apply(
    name: String,
    Intermediate: Intermediate = null,
    ariaLabel: String = null,
    border: js.UndefOr[Boolean] = js.undefined,
    cssModule: js.Any = null,
    fixedWidth: js.UndefOr[Boolean] = js.undefined,
    flip: FontAwesomeFlip = null,
    inverse: js.UndefOr[Boolean] = js.undefined,
    pulse: js.UndefOr[Boolean] = js.undefined,
    rotate: Int | Double = null,
    size: FontAwesomeSize = null,
    spin: js.UndefOr[Boolean] = js.undefined,
    stack: FontAwesomeStack = null,
    tag: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[FontAwesomeProps, ^, Unit, FontAwesomeProps] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
  
      if (Intermediate != null) js.Dynamic.global.Object.assign(__obj, Intermediate)
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(border)) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedWidth)) __obj.updateDynamic("fixedWidth")(fixedWidth.asInstanceOf[js.Any])
    if (flip != null) __obj.updateDynamic("flip")(flip.asInstanceOf[js.Any])
    if (!js.isUndefined(inverse)) __obj.updateDynamic("inverse")(inverse.asInstanceOf[js.Any])
    if (!js.isUndefined(pulse)) __obj.updateDynamic("pulse")(pulse.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(spin)) __obj.updateDynamic("spin")(spin.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactFontawesome.mod.FontAwesomeProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactFontawesome.mod.^](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactFontawesome.mod.FontAwesomeProps])(children: _*)
  }
  @JSImport("react-fontawesome", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
}

