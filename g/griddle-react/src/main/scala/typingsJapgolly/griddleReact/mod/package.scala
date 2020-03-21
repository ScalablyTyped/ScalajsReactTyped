package typingsJapgolly.griddleReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ColumnRenderProperties = typingsJapgolly.griddleReact.mod.components.ColumnDefinitionProps
  type Griddle[T] = japgolly.scalajs.react.raw.React.Component[typingsJapgolly.griddleReact.mod.GriddleProps[T] with js.Object, js.Object]
  type GriddleComponent[T] = (japgolly.scalajs.react.raw.React.ComponentClassP[T with js.Object]) | typingsJapgolly.react.mod.StatelessComponent[T]
  type GriddleFilter = java.lang.String | typingsJapgolly.griddleReact.mod.RowFilter | (typingsJapgolly.griddleReact.mod.PropertyBag[java.lang.String | typingsJapgolly.griddleReact.mod.RowFilter])
  type Listener = js.Function3[
    /* prevState */ js.Any, 
    /* nextState */ js.Any, 
    /* otherArgs */ js.UndefOr[js.Any], 
    js.Any
  ]
  type PropertyBag[T] = org.scalablytyped.runtime.StringDictionary[T]
  type Reducer = js.Function2[/* state */ js.Any, /* action */ js.UndefOr[js.Any], scala.Unit]
  type RowFilter = js.Function3[
    /* row */ js.Any, 
    /* index */ scala.Double, 
    /* data */ typingsJapgolly.immutable.Immutable.List[js.Any], 
    scala.Boolean
  ]
  type RowRenderProperties = typingsJapgolly.griddleReact.mod.components.RowDefinitionProps
  type Selector = js.Function2[/* state */ js.Any, /* props */ js.UndefOr[js.Any], js.Any]
}
