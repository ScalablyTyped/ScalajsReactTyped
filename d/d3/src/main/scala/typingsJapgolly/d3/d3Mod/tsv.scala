package typingsJapgolly.d3.d3Mod

import typingsJapgolly.d3DashDsv.d3DashDsvMod.DSVParsedArray
import typingsJapgolly.d3DashDsv.d3DashDsvMod.DSVRowArray
import typingsJapgolly.d3DashDsv.d3DashDsvMod.DSVRowString
import typingsJapgolly.std.RequestInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "tsv")
@js.native
object tsv extends js.Object {
  def apply[Columns /* <: String */](url: String): js.Promise[DSVRowArray[Columns]] = js.native
  def apply[Columns /* <: String */](url: String, init: RequestInit): js.Promise[DSVRowArray[Columns]] = js.native
  def apply[ParsedRow /* <: js.Object */, Columns /* <: String */](
    url: String,
    init: RequestInit,
    row: js.Function3[
      /* rawRow */ DSVRowString[Columns], 
      /* index */ Double, 
      /* columns */ js.Array[Columns], 
      js.UndefOr[ParsedRow | Null]
    ]
  ): js.Promise[DSVParsedArray[ParsedRow]] = js.native
  def apply[ParsedRow /* <: js.Object */, Columns /* <: String */](
    url: String,
    row: js.Function3[
      /* rawRow */ DSVRowString[Columns], 
      /* index */ Double, 
      /* columns */ js.Array[Columns], 
      js.UndefOr[ParsedRow | Null]
    ]
  ): js.Promise[DSVParsedArray[ParsedRow]] = js.native
}

