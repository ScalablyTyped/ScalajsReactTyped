package typingsJapgolly.themeUi.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLAnchorElement
import typingsJapgolly.react.mod.PropsWithoutRef
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.themeUiComponents.mod.LinkProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. */
object Link {
  def apply(
    props: PropsWithoutRef[LinkProps] with RefAttributes[HTMLAnchorElement] with js.Object,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    PropsWithoutRef[LinkProps] with RefAttributes[HTMLAnchorElement] with js.Object, 
    MountedWithRawType[
      PropsWithoutRef[LinkProps] with RefAttributes[HTMLAnchorElement] with js.Object, 
      js.Object, 
      RawMounted[
        PropsWithoutRef[LinkProps] with RefAttributes[HTMLAnchorElement] with js.Object, 
        js.Object
      ]
    ]
  ] = {
    val __obj = js.Dynamic.literal()
  
      js.Dynamic.global.Object.assign(__obj, props)
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.react.mod.PropsWithoutRef[typingsJapgolly.themeUiComponents.mod.LinkProps] with typingsJapgolly.react.mod.RefAttributes[org.scalajs.dom.raw.HTMLAnchorElement] with js.Object, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.react.mod.PropsWithoutRef[typingsJapgolly.themeUiComponents.mod.LinkProps] with typingsJapgolly.react.mod.RefAttributes[org.scalajs.dom.raw.HTMLAnchorElement] with js.Object])(children: _*)
  }
  @JSImport("theme-ui", "Link")
  @js.native
  object componentImport extends js.Object
  
}

