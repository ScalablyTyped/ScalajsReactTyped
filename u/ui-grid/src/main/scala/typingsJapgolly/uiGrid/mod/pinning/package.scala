package typingsJapgolly.uiGrid.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pinning {
  type columnPinHandler = js.Function2[
    /* colDef */ typingsJapgolly.uiGrid.mod.pinning.IColumnDef, 
    /* container */ java.lang.String, 
    scala.Unit
  ]
}
