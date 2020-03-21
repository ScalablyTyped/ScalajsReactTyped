package typingsJapgolly.reactBootstrap.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactBootstrap.mod.Sizes
import typingsJapgolly.reactBootstrap.splitButtonMod.SplitButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SplitButton {
  def apply(
    id: String,
    bsSize: Sizes = null,
    bsStyle: String = null,
    dropdownTitle: js.Any = null,
    dropup: js.UndefOr[Boolean] = js.undefined,
    pullRight: js.UndefOr[Boolean] = js.undefined,
    title: VdomNode = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    SplitButtonProps, 
    typingsJapgolly.reactBootstrap.mod.SplitButton, 
    Unit, 
    SplitButtonProps
  ] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
  
      if (bsSize != null) __obj.updateDynamic("bsSize")(bsSize.asInstanceOf[js.Any])
    if (bsStyle != null) __obj.updateDynamic("bsStyle")(bsStyle.asInstanceOf[js.Any])
    if (dropdownTitle != null) __obj.updateDynamic("dropdownTitle")(dropdownTitle.asInstanceOf[js.Any])
    if (!js.isUndefined(dropup)) __obj.updateDynamic("dropup")(dropup.asInstanceOf[js.Any])
    if (!js.isUndefined(pullRight)) __obj.updateDynamic("pullRight")(pullRight.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactBootstrap.splitButtonMod.SplitButtonProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactBootstrap.mod.SplitButton](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactBootstrap.splitButtonMod.SplitButtonProps])(children: _*)
  }
  @JSImport("react-bootstrap", "SplitButton")
  @js.native
  object componentImport extends js.Object
  
}

