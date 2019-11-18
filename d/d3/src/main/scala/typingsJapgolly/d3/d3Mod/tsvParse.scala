package typingsJapgolly.d3.d3Mod

import typingsJapgolly.d3DashDsv.d3DashDsvMod.DSVParsedArray
import typingsJapgolly.d3DashDsv.d3DashDsvMod.DSVRowArray
import typingsJapgolly.d3DashDsv.d3DashDsvMod.DSVRowString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "tsvParse")
@js.native
object tsvParse extends js.Object {
  def apply[Columns /* <: String */](tsvString: String): DSVRowArray[Columns] = js.native
  def apply[ParsedRow /* <: js.Object */, Columns /* <: String */](
    tsvString: String,
    row: js.Function3[
      /* rawRow */ DSVRowString[Columns], 
      /* index */ Double, 
      /* columns */ js.Array[Columns], 
      js.UndefOr[ParsedRow | Null]
    ]
  ): DSVParsedArray[ParsedRow] = js.native
}

