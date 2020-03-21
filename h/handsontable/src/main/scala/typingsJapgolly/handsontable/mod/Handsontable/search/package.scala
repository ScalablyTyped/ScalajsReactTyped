package typingsJapgolly.handsontable.mod.Handsontable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object search {
  type SearchCallback = js.Function5[
    /* instance */ typingsJapgolly.handsontable.mod.Handsontable, 
    /* row */ scala.Double, 
    /* column */ scala.Double, 
    /* value */ typingsJapgolly.handsontable.mod.Handsontable.CellValue, 
    /* result */ scala.Boolean, 
    scala.Unit
  ]
  type SearchQueryMethod = js.Function3[
    /* queryStr */ java.lang.String, 
    /* value */ typingsJapgolly.handsontable.mod.Handsontable.CellValue, 
    /* cellProperties */ typingsJapgolly.handsontable.mod.Handsontable.CellProperties, 
    scala.Boolean
  ]
}
