package typingsJapgolly.reactInspector.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactInspector.mod.InspectorTheme
import typingsJapgolly.reactInspector.mod.TableInspectorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TableInspector {
  def apply(
    columns: js.Array[String] = null,
    data: js.Any = null,
    theme: InspectorTheme = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    TableInspectorProps, 
    MountedWithRawType[TableInspectorProps, js.Object, RawMounted[TableInspectorProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.reactInspector.mod.TableInspectorProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactInspector.mod.TableInspectorProps])(children: _*)
  }
  @JSImport("react-inspector", "TableInspector")
  @js.native
  object componentImport extends js.Object
  
}

