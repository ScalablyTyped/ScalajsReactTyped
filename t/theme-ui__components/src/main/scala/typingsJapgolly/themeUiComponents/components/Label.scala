package typingsJapgolly.themeUiComponents.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLLabelElement
import typingsJapgolly.react.mod.PropsWithoutRef
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.themeUiComponents.mod.LabelProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. */
object Label {
  def apply(
    props: PropsWithoutRef[LabelProps] with RefAttributes[HTMLLabelElement] with js.Object,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    PropsWithoutRef[LabelProps] with RefAttributes[HTMLLabelElement] with js.Object, 
    MountedWithRawType[
      PropsWithoutRef[LabelProps] with RefAttributes[HTMLLabelElement] with js.Object, 
      js.Object, 
      RawMounted[
        PropsWithoutRef[LabelProps] with RefAttributes[HTMLLabelElement] with js.Object, 
        js.Object
      ]
    ]
  ] = {
    val __obj = js.Dynamic.literal()
  
      js.Dynamic.global.Object.assign(__obj, props)
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.react.mod.PropsWithoutRef[typingsJapgolly.themeUiComponents.mod.LabelProps] with typingsJapgolly.react.mod.RefAttributes[org.scalajs.dom.raw.HTMLLabelElement] with js.Object, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.react.mod.PropsWithoutRef[typingsJapgolly.themeUiComponents.mod.LabelProps] with typingsJapgolly.react.mod.RefAttributes[org.scalajs.dom.raw.HTMLLabelElement] with js.Object])(children: _*)
  }
  @JSImport("@theme-ui/components", "Label")
  @js.native
  object componentImport extends js.Object
  
}

