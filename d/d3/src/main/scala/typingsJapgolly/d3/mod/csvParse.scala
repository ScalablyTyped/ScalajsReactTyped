package typingsJapgolly.d3.mod

import typingsJapgolly.d3Dsv.mod.DSVParsedArray
import typingsJapgolly.d3Dsv.mod.DSVRowArray
import typingsJapgolly.d3Dsv.mod.DSVRowString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "csvParse")
@js.native
object csvParse extends js.Object {
  def apply[Columns /* <: String */](csvString: String): DSVRowArray[Columns] = js.native
  def apply[ParsedRow /* <: js.Object */, Columns /* <: String */](
    csvString: String,
    row: js.Function3[
      /* rawRow */ DSVRowString[Columns], 
      /* index */ Double, 
      /* columns */ js.Array[Columns], 
      js.UndefOr[ParsedRow | Null]
    ]
  ): DSVParsedArray[ParsedRow] = js.native
}

