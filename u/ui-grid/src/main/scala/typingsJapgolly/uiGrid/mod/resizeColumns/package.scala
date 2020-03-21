package typingsJapgolly.uiGrid.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object resizeColumns {
  type columnSizeChangedHandler = js.Function2[
    /* colDef */ typingsJapgolly.uiGrid.mod.resizeColumns.IColumnDef, 
    /* delta */ scala.Double, 
    scala.Unit
  ]
}
