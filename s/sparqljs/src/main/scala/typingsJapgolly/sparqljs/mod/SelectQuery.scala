package typingsJapgolly.sparqljs.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.sparqljs.AnonDefault
import typingsJapgolly.sparqljs.sparqljsStrings.Asterisk
import typingsJapgolly.sparqljs.sparqljsStrings.SELECT
import typingsJapgolly.sparqljs.sparqljsStrings.query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectQuery
  extends Query
     with BaseQuery
     with Pattern {
  var distinct: js.UndefOr[Boolean] = js.undefined
  var from: js.UndefOr[AnonDefault] = js.undefined
  var group: js.UndefOr[js.Array[Grouping]] = js.undefined
  var having: js.UndefOr[js.Array[Expression]] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var order: js.UndefOr[js.Array[Ordering]] = js.undefined
  var queryType: SELECT
  var reduced: js.UndefOr[Boolean] = js.undefined
  var variables: js.Array[Asterisk | Variable]
}

object SelectQuery {
  @scala.inline
  def apply(
    prefixes: StringDictionary[String],
    queryType: SELECT,
    `type`: query,
    variables: js.Array[Asterisk | Variable],
    base: String = null,
    distinct: js.UndefOr[Boolean] = js.undefined,
    from: AnonDefault = null,
    group: js.Array[Grouping] = null,
    having: js.Array[Expression] = null,
    limit: Int | Double = null,
    offset: Int | Double = null,
    order: js.Array[Ordering] = null,
    reduced: js.UndefOr[Boolean] = js.undefined,
    values: js.Array[ValuePatternRow] = null,
    where: js.Array[Pattern] = null
  ): SelectQuery = {
    val __obj = js.Dynamic.literal(prefixes = prefixes.asInstanceOf[js.Any], queryType = queryType.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (!js.isUndefined(distinct)) __obj.updateDynamic("distinct")(distinct.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (having != null) __obj.updateDynamic("having")(having.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (!js.isUndefined(reduced)) __obj.updateDynamic("reduced")(reduced.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    if (where != null) __obj.updateDynamic("where")(where.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectQuery]
  }
}

