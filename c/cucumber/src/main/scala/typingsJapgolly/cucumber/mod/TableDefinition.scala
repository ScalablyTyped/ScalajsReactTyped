package typingsJapgolly.cucumber.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableDefinition[Type] extends js.Object {
  /** Returns an array of objects where each row is converted to an object (column header is the key). */
  def hashes(): js.Array[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ columnName in keyof Type ]: string}
    */ typingsJapgolly.cucumber.cucumberStrings.TableDefinition with js.Any
  ]
  /** Returns the table as a 2-D array. */
  def raw(): js.Array[js.Array[String]]
  /** Returns the table as a 2-D array, without the first row. */
  def rows(): js.Array[js.Array[String]]
  /** Returns an object where each row corresponds to an entry (first column is the key, second column is the value). */
  def rowsHash(): StringDictionary[String]
}

object TableDefinition {
  @scala.inline
  def apply[Type](
    hashes: CallbackTo[
      js.Array[
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ columnName in keyof Type ]: string}
    */ typingsJapgolly.cucumber.cucumberStrings.TableDefinition with js.Any
      ]
    ],
    raw: CallbackTo[js.Array[js.Array[String]]],
    rows: CallbackTo[js.Array[js.Array[String]]],
    rowsHash: CallbackTo[StringDictionary[String]]
  ): TableDefinition[Type] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hashes")(hashes.toJsFn)
    __obj.updateDynamic("raw")(raw.toJsFn)
    __obj.updateDynamic("rows")(rows.toJsFn)
    __obj.updateDynamic("rowsHash")(rowsHash.toJsFn)
    __obj.asInstanceOf[TableDefinition[Type]]
  }
}

