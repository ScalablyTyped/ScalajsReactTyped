package typingsJapgolly.reactInspector.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactInspector.mod.ObjectValueProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ObjectValue {
  def apply(
    `object`: js.Any = null,
    styles: js.Object = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    ObjectValueProps, 
    MountedWithRawType[ObjectValueProps, js.Object, RawMounted[ObjectValueProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (`object` != null) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.reactInspector.mod.ObjectValueProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactInspector.mod.ObjectValueProps])(children: _*)
  }
  @JSImport("react-inspector", "ObjectValue")
  @js.native
  object componentImport extends js.Object
  
}

