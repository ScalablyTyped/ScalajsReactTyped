package typingsJapgolly.sequelizeCursorPagination.mod.SequelizeCursorPagination

import typingsJapgolly.sequelize.AnonExclude
import typingsJapgolly.sequelize.mod.FindOptionsAttributesArray
import typingsJapgolly.sequelize.mod.IncludeOptions
import typingsJapgolly.sequelize.mod.Model
import typingsJapgolly.sequelize.mod.WhereOptions
import typingsJapgolly.sequelize.mod.and
import typingsJapgolly.sequelize.mod.col
import typingsJapgolly.sequelize.mod.fn
import typingsJapgolly.sequelize.mod.or
import typingsJapgolly.sequelize.mod.where
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasicPaginateOptions[T] extends js.Object {
   // the before cursor
  var after: js.UndefOr[String] = js.undefined
  var attributes: js.UndefOr[FindOptionsAttributesArray | AnonExclude] = js.undefined
   // [default: false]
  var before: js.UndefOr[String] = js.undefined
   // limit the number of records returned
  var desc: js.UndefOr[Boolean] = js.undefined
  var include: js.UndefOr[js.Array[(Model[_, _, _]) | IncludeOptions]] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
   // the after cursor
  var paginationField: js.UndefOr[String] = js.undefined
   // [default: primaryKeyField]
  var subQuery: js.UndefOr[Boolean] = js.undefined
  var where: js.UndefOr[
    WhereOptions[T] | typingsJapgolly.sequelize.mod.where | fn | (js.Array[col | and | or | String])
  ] = js.undefined
}

object BasicPaginateOptions {
  @scala.inline
  def apply[T](
    after: String = null,
    attributes: FindOptionsAttributesArray | AnonExclude = null,
    before: String = null,
    desc: js.UndefOr[Boolean] = js.undefined,
    include: js.Array[(Model[_, _, _]) | IncludeOptions] = null,
    limit: Int | Double = null,
    paginationField: String = null,
    subQuery: js.UndefOr[Boolean] = js.undefined,
    where: WhereOptions[T] | where | fn | (js.Array[col | and | or | String]) = null
  ): BasicPaginateOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (!js.isUndefined(desc)) __obj.updateDynamic("desc")(desc.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (paginationField != null) __obj.updateDynamic("paginationField")(paginationField.asInstanceOf[js.Any])
    if (!js.isUndefined(subQuery)) __obj.updateDynamic("subQuery")(subQuery.asInstanceOf[js.Any])
    if (where != null) __obj.updateDynamic("where")(where.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasicPaginateOptions[T]]
  }
}

