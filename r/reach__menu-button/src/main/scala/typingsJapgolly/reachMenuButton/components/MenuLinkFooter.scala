package typingsJapgolly.reachMenuButton.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reachMenuButton.mod.MenuLinkProps
import typingsJapgolly.reachMenuButton.reachMenuButtonStrings.footer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. */
object MenuLinkFooter {
  def apply(
    props: MenuLinkProps[footer] with js.Object,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    MenuLinkProps[footer] with js.Object, 
    MountedWithRawType[
      MenuLinkProps[footer] with js.Object, 
      js.Object, 
      RawMounted[MenuLinkProps[footer] with js.Object, js.Object]
    ]
  ] = {
    val __obj = js.Dynamic.literal()
  
      js.Dynamic.global.Object.assign(__obj, props)
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.reachMenuButton.mod.MenuLinkProps[typingsJapgolly.reachMenuButton.reachMenuButtonStrings.footer] with js.Object, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reachMenuButton.mod.MenuLinkProps[typingsJapgolly.reachMenuButton.reachMenuButtonStrings.footer] with js.Object])(children: _*)
  }
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  object componentImport extends js.Object
  
}

