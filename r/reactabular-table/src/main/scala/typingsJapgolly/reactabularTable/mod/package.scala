package typingsJapgolly.reactabularTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CellFormatter = js.Function2[
    /* value */ js.Any, 
    /* props */ typingsJapgolly.reactabularTable.AnonRowIndex, 
    java.lang.String | japgolly.scalajs.react.raw.React.Element
  ]
  type CellTransform = js.Function2[
    /* value */ js.Any, 
    /* props */ typingsJapgolly.reactabularTable.AnonColumnIndex, 
    js.Any
  ]
  type ColumnFormatter = js.Function2[
    /* label */ java.lang.String | japgolly.scalajs.react.raw.React.Element, 
    /* props */ typingsJapgolly.reactabularTable.AnonRowData, 
    java.lang.String | japgolly.scalajs.react.raw.React.Element
  ]
  type ColumnTransform = js.Function2[
    /* label */ java.lang.String | japgolly.scalajs.react.raw.React.Element | typingsJapgolly.react.mod.ReactInstance, 
    /* props */ typingsJapgolly.reactabularTable.AnonColumn, 
    js.Any
  ]
}
