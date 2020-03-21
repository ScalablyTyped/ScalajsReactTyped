package typingsJapgolly.blueprintjsCore.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.blueprintjsCore.nonIdealStateMod.INonIdealStateProps
import typingsJapgolly.blueprintjsCore.propsMod.MaybeElement
import typingsJapgolly.blueprintjsIcons.iconNameMod.IconName
import typingsJapgolly.react.mod.ReactChild
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object NonIdealState {
  def apply(
    action: VdomElement = null,
    className: String = null,
    description: ReactChild = null,
    icon: IconName | MaybeElement = null,
    title: VdomNode = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    INonIdealStateProps, 
    typingsJapgolly.blueprintjsCore.mod.NonIdealState, 
    Unit, 
    INonIdealStateProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (action != null) __obj.updateDynamic("action")(action.rawElement.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.blueprintjsCore.nonIdealStateMod.INonIdealStateProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.blueprintjsCore.mod.NonIdealState](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.blueprintjsCore.nonIdealStateMod.INonIdealStateProps])(children: _*)
  }
  @JSImport("@blueprintjs/core", "NonIdealState")
  @js.native
  object componentImport extends js.Object
  
}

