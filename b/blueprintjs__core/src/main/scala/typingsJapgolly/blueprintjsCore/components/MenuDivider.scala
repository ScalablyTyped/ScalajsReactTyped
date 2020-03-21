package typingsJapgolly.blueprintjsCore.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.blueprintjsCore.menuDividerMod.IMenuDividerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MenuDivider {
  def apply(
    className: String = null,
    title: VdomNode = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    IMenuDividerProps, 
    typingsJapgolly.blueprintjsCore.mod.MenuDivider, 
    Unit, 
    IMenuDividerProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.blueprintjsCore.menuDividerMod.IMenuDividerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.blueprintjsCore.mod.MenuDivider](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.blueprintjsCore.menuDividerMod.IMenuDividerProps])(children: _*)
  }
  @JSImport("@blueprintjs/core", "MenuDivider")
  @js.native
  object componentImport extends js.Object
  
}

