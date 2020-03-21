package typingsJapgolly.reactElemental.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactElemental.mod.LabelProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Label {
  def apply(
    label: String = null,
    sublabel: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    LabelProps, 
    MountedWithRawType[LabelProps, js.Object, RawMounted[LabelProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (sublabel != null) __obj.updateDynamic("sublabel")(sublabel.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.reactElemental.mod.LabelProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactElemental.mod.LabelProps])(children: _*)
  }
  @JSImport("react-elemental", "Label")
  @js.native
  object componentImport extends js.Object
  
}

