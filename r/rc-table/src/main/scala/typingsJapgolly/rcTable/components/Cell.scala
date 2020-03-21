package typingsJapgolly.rcTable.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.rcTable.cellMod.CellProps
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.react.mod.WeakValidationMap
import typingsJapgolly.std.Partial
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Cell {
  def apply(
    DollarDollartypeof: js.Symbol,
    defaultProps: Partial[(CellProps[Record[String, js.Any]]) with RefAttributes[js.Any]] = null,
    displayName: String = null,
    propTypes: WeakValidationMap[(CellProps[Record[String, js.Any]]) with RefAttributes[js.Any]] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    ForwardRefExoticComponent[(CellProps[Record[String, js.Any]]) with RefAttributes[js.Any]], 
    MountedWithRawType[
      ForwardRefExoticComponent[(CellProps[Record[String, js.Any]]) with RefAttributes[js.Any]], 
      js.Object, 
      RawMounted[
        ForwardRefExoticComponent[(CellProps[Record[String, js.Any]]) with RefAttributes[js.Any]], 
        js.Object
      ]
    ]
  ] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("$$typeof")(DollarDollartypeof.asInstanceOf[js.Any])
    if (defaultProps != null) __obj.updateDynamic("defaultProps")(defaultProps.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (propTypes != null) __obj.updateDynamic("propTypes")(propTypes.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.react.mod.ForwardRefExoticComponent[
    (typingsJapgolly.rcTable.cellMod.CellProps[typingsJapgolly.std.Record[java.lang.String, js.Any]]) with typingsJapgolly.react.mod.RefAttributes[js.Any]
  ], 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.react.mod.ForwardRefExoticComponent[
  (typingsJapgolly.rcTable.cellMod.CellProps[typingsJapgolly.std.Record[java.lang.String, js.Any]]) with typingsJapgolly.react.mod.RefAttributes[js.Any]]])(children: _*)
  }
  @JSImport("rc-table/lib/Cell", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

