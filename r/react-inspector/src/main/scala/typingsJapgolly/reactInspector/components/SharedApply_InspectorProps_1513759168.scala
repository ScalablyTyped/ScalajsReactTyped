package typingsJapgolly.reactInspector.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactInspector.mod.InspectorNodeParams
import typingsJapgolly.reactInspector.mod.InspectorTheme
import typingsJapgolly.reactInspector.reactInspectorBooleans.`false`
import typingsJapgolly.reactInspector.reactInspectorBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_InspectorProps_1513759168 () {
  val componentImport: js.Any
  def InspectorAsTableProps(
    table: `true`,
    columns: js.Array[String] = null,
    data: js.Any = null,
    theme: InspectorTheme = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    typingsJapgolly.reactInspector.mod.InspectorAsTableProps, 
    MountedWithRawType[
      typingsJapgolly.reactInspector.mod.InspectorAsTableProps, 
      js.Object, 
      RawMounted[typingsJapgolly.reactInspector.mod.InspectorAsTableProps, js.Object]
    ]
  ] = {
    val __obj = js.Dynamic.literal(table = table.asInstanceOf[js.Any])
  
      if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.reactInspector.mod.InspectorAsTableProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactInspector.mod.InspectorAsTableProps])(children: _*)
  }
  def InspectorAsTreeProps(
    data: js.Any = null,
    expandLevel: Int | Double = null,
    expandPaths: String | js.Array[String] = null,
    name: String = null,
    nodeRenderer: /* params */ InspectorNodeParams => CallbackTo[Node] = null,
    showNonenumerable: js.UndefOr[Boolean] = js.undefined,
    sortObjectKeys: Boolean | (js.Function2[/* a */ js.Any, /* b */ js.Any, Double]) = null,
    table: `false` = null,
    theme: InspectorTheme = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    typingsJapgolly.reactInspector.mod.InspectorAsTreeProps, 
    MountedWithRawType[
      typingsJapgolly.reactInspector.mod.InspectorAsTreeProps, 
      js.Object, 
      RawMounted[typingsJapgolly.reactInspector.mod.InspectorAsTreeProps, js.Object]
    ]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (expandLevel != null) __obj.updateDynamic("expandLevel")(expandLevel.asInstanceOf[js.Any])
    if (expandPaths != null) __obj.updateDynamic("expandPaths")(expandPaths.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (nodeRenderer != null) __obj.updateDynamic("nodeRenderer")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.reactInspector.mod.InspectorNodeParams) => nodeRenderer(t0).runNow()))
    if (!js.isUndefined(showNonenumerable)) __obj.updateDynamic("showNonenumerable")(showNonenumerable.asInstanceOf[js.Any])
    if (sortObjectKeys != null) __obj.updateDynamic("sortObjectKeys")(sortObjectKeys.asInstanceOf[js.Any])
    if (table != null) __obj.updateDynamic("table")(table.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.reactInspector.mod.InspectorAsTreeProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactInspector.mod.InspectorAsTreeProps])(children: _*)
  }
}

