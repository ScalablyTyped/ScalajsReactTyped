package typingsJapgolly.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTableInterfaceMod {
  import org.scalablytyped.runtime.StringDictionary
  import typingsJapgolly.antd.Anon_CurrentDataSource
  import typingsJapgolly.std.Event
  import typingsJapgolly.std.HTMLElement

  type CheckboxPropsCache = StringDictionary[js.Any]
  type CompareFn[T] = js.Function3[/* a */ T, /* b */ T, /* sortOrder */ js.UndefOr[SortOrder], Double]
  type GetPopupContainer = js.Function1[/* triggerNode */ js.UndefOr[HTMLElement], HTMLElement]
  type PrepareParamsArgumentsReturn[T] = js.Tuple4[js.Any, js.Array[String], js.Object, Anon_CurrentDataSource[T]]
  type SelectionItemSelectFn = js.Function1[/* key */ js.Array[String], Unit]
  type SelectionSelectFn[T] = js.Function4[
    /* record */ T, 
    /* selected */ Boolean, 
    /* selectedRows */ js.Array[js.Object], 
    /* nativeEvent */ Event, 
    Unit
  ]
  type TableStateFilters = StringDictionary[js.Array[String]]
}
