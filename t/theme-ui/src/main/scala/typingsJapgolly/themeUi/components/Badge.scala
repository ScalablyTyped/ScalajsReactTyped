package typingsJapgolly.themeUi.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import typingsJapgolly.react.mod.PropsWithoutRef
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.themeUiComponents.mod.BadgeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. */
object Badge {
  def apply(
    props: PropsWithoutRef[BadgeProps] with RefAttributes[HTMLDivElement] with js.Object,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    PropsWithoutRef[BadgeProps] with RefAttributes[HTMLDivElement] with js.Object, 
    MountedWithRawType[
      PropsWithoutRef[BadgeProps] with RefAttributes[HTMLDivElement] with js.Object, 
      js.Object, 
      RawMounted[
        PropsWithoutRef[BadgeProps] with RefAttributes[HTMLDivElement] with js.Object, 
        js.Object
      ]
    ]
  ] = {
    val __obj = js.Dynamic.literal()
  
      js.Dynamic.global.Object.assign(__obj, props)
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.react.mod.PropsWithoutRef[typingsJapgolly.themeUiComponents.mod.BadgeProps] with typingsJapgolly.react.mod.RefAttributes[org.scalajs.dom.raw.HTMLDivElement] with js.Object, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.react.mod.PropsWithoutRef[typingsJapgolly.themeUiComponents.mod.BadgeProps] with typingsJapgolly.react.mod.RefAttributes[org.scalajs.dom.raw.HTMLDivElement] with js.Object])(children: _*)
  }
  @JSImport("theme-ui", "Badge")
  @js.native
  object componentImport extends js.Object
  
}

