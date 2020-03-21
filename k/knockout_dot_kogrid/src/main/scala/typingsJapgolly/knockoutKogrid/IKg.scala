package typingsJapgolly.knockoutKogrid

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.knockoutKogrid.kg.DomUtilityService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKg extends js.Object {
  var domUtilityService: DomUtilityService
  /** Default aggregate template */
  def aggregateTemplate(): String
  /** Default cell template. Can be overriden in GridOptions.cellTemplate */
  def defaultCellTemplate(): String
  /** Default grid template */
  def defaultGridTemplate(): String
  /** Default headercell template. Can be overriden in GridOptions.headerCellTemplate */
  def defaultHeaderCellTemplate(): String
  /** Default headerrow template. Can be overriden in GridOptions.headerRowTemplate */
  def defaultHeaderRowTemplate(): String
  /** Default row template. Can be overriden in GridOptions.rowTemplate */
  def defaultRowTemplate(): String
}

object IKg {
  @scala.inline
  def apply(
    aggregateTemplate: CallbackTo[String],
    defaultCellTemplate: CallbackTo[String],
    defaultGridTemplate: CallbackTo[String],
    defaultHeaderCellTemplate: CallbackTo[String],
    defaultHeaderRowTemplate: CallbackTo[String],
    defaultRowTemplate: CallbackTo[String],
    domUtilityService: DomUtilityService
  ): IKg = {
    val __obj = js.Dynamic.literal(domUtilityService = domUtilityService.asInstanceOf[js.Any])
    __obj.updateDynamic("aggregateTemplate")(aggregateTemplate.toJsFn)
    __obj.updateDynamic("defaultCellTemplate")(defaultCellTemplate.toJsFn)
    __obj.updateDynamic("defaultGridTemplate")(defaultGridTemplate.toJsFn)
    __obj.updateDynamic("defaultHeaderCellTemplate")(defaultHeaderCellTemplate.toJsFn)
    __obj.updateDynamic("defaultHeaderRowTemplate")(defaultHeaderRowTemplate.toJsFn)
    __obj.updateDynamic("defaultRowTemplate")(defaultRowTemplate.toJsFn)
    __obj.asInstanceOf[IKg]
  }
}

