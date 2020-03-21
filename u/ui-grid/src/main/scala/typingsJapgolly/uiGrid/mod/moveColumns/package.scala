package typingsJapgolly.uiGrid.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object moveColumns {
  type columnPositionChangedHandler = js.Function3[
    /* colDef */ typingsJapgolly.uiGrid.mod.moveColumns.IColumnDef, 
    /* originalPosition */ scala.Double, 
    /* finalPosition */ scala.Double, 
    scala.Unit
  ]
}
