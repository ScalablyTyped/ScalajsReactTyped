package typingsJapgolly.uiGrid.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object edit {
  type afterCellEditHandler[TEntity] = js.Function4[
    /* rowEntity */ TEntity, 
    /* colDef */ typingsJapgolly.uiGrid.mod.IColumnDefOf[TEntity], 
    /* newValue */ js.Any, 
    /* oldValue */ js.Any, 
    scala.Unit
  ]
  type beginCellEditHandler[TEntity] = js.Function3[
    /* rowEntity */ TEntity, 
    /* colDef */ typingsJapgolly.uiGrid.mod.IColumnDefOf[TEntity], 
    /* triggerEvent */ typingsJapgolly.angular.JQueryEventObject, 
    scala.Unit
  ]
  type cancelCellEditHandler[TEntity] = js.Function2[
    /* rowEntity */ TEntity, 
    /* colDef */ typingsJapgolly.uiGrid.mod.IColumnDefOf[TEntity], 
    scala.Unit
  ]
}
