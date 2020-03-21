package typingsJapgolly.jupyterlabCoreutils.nbformatMod.nbformat

import typingsJapgolly.phosphorCoreutils.jsonMod.JSONObject
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The base cell interface.
  */
trait IBaseCell extends JSONObject {
  /**
    * String identifying the type of cell.
    */
  var cell_type: String
  /**
    * Cell-level metadata.
    */
  var metadata: Partial[ICellMetadata]
  /**
    * Contents of the cell, represented as an array of lines.
    */
  var source: MultilineString
}

object IBaseCell {
  @scala.inline
  def apply(cell_type: String, metadata: Partial[ICellMetadata], source: MultilineString): IBaseCell = {
    val __obj = js.Dynamic.literal(cell_type = cell_type.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IBaseCell]
  }
}

