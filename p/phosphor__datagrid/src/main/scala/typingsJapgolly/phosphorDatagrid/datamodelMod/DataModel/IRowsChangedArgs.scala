package typingsJapgolly.phosphorDatagrid.datamodelMod.DataModel

import typingsJapgolly.phosphorDatagrid.phosphorDatagridStrings.`rows-inserted`
import typingsJapgolly.phosphorDatagrid.phosphorDatagridStrings.`rows-removed`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An arguments object for the `changed` signal.
  *
  * #### Notes
  * Data models should emit the `changed` signal with this args object
  * type when rows are inserted or removed.
  */
trait IRowsChangedArgs extends ChangedArgs {
  /**
    * The index of the first modified row.
    */
  val index: Double
  /**
    * The region which contains the modified rows.
    */
  val region: RowRegion
  /**
    * The number of modified rows.
    */
  val span: Double
  /**
    * The discriminated type of the args object.
    */
  val `type`: `rows-inserted` | `rows-removed`
}

object IRowsChangedArgs {
  @scala.inline
  def apply(index: Double, region: RowRegion, span: Double, `type`: `rows-inserted` | `rows-removed`): IRowsChangedArgs = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRowsChangedArgs]
  }
}

