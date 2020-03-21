package typingsJapgolly.reactDataGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object AdazzleReactDataGrid {
  type ColumnEventCallback = js.Function2[
    /* ev */ japgolly.scalajs.react.ReactEventFrom[js.Any with org.scalajs.dom.raw.Element], 
    /* args */ typingsJapgolly.reactDataGrid.AnonName, 
    scala.Unit
  ]
  type ReactDataGrid[T] = typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid_[T]
}
