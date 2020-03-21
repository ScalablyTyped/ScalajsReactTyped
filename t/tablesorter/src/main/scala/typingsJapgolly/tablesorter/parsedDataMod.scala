package typingsJapgolly.tablesorter

import typingsJapgolly.tablesorter.mod._Global_.HTMLElement
import typingsJapgolly.tablesorter.mod._Global_.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tablesorter/Parsing/ParsedData", JSImport.Namespace)
@js.native
object parsedDataMod extends js.Object {
  @js.native
  trait ParsedData extends js.Object {
    /**
      * The jQuery-objects containing the cells of the rows.
      */
    @JSName("$cells")
    var $cells: js.Array[JQuery[HTMLElement]] = js.native
    /**
      * The parsed values of the rows.
      */
    var parsed: js.Array[_] = js.native
    /**
      * The raw values of the rows.
      */
    var raw: js.Array[String] = js.native
  }
  
}

