package typingsJapgolly.csvParse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object es5Mod {
  type Callback = js.Function3[
    /* err */ js.UndefOr[js.Error], 
    /* records */ js.UndefOr[js.Any], 
    /* info */ typingsJapgolly.csvParse.es5Mod.Info, 
    scala.Unit
  ]
  type CastingDateFunction = js.Function2[
    /* value */ java.lang.String, 
    /* context */ typingsJapgolly.csvParse.es5Mod.CastingContext, 
    js.Date
  ]
  type CastingFunction = js.Function2[
    /* value */ java.lang.String, 
    /* context */ typingsJapgolly.csvParse.es5Mod.CastingContext, 
    js.Any
  ]
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - `js.undefined`
    - scala.Null
    - typingsJapgolly.csvParse.csvParseBooleans.`false`
    - typingsJapgolly.csvParse.AnonName
  */
  type ColumnOption = js.UndefOr[typingsJapgolly.csvParse.es5Mod._ColumnOption | java.lang.String | scala.Null]
}
