package typingsJapgolly.apolloEngineReportingProtobuf.protobufMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IQueryStats extends js.Object {
  /** QueryStats perClientName */
  var perClientName: js.UndefOr[StringDictionary[IClientNameStats] | Null] = js.undefined
  /** QueryStats perType */
  var perType: js.UndefOr[js.Array[ITypeStat] | Null] = js.undefined
  /** QueryStats perTypeStat */
  var perTypeStat: js.UndefOr[StringDictionary[ITypeStat] | Null] = js.undefined
  /** QueryStats queryStatsWithContext */
  var queryStatsWithContext: js.UndefOr[js.Array[IContextualizedQueryLatencyStats] | Null] = js.undefined
  /** QueryStats typeStatsWithContext */
  var typeStatsWithContext: js.UndefOr[js.Array[IContextualizedTypeStats] | Null] = js.undefined
}

object IQueryStats {
  @scala.inline
  def apply(
    perClientName: StringDictionary[IClientNameStats] = null,
    perType: js.Array[ITypeStat] = null,
    perTypeStat: StringDictionary[ITypeStat] = null,
    queryStatsWithContext: js.Array[IContextualizedQueryLatencyStats] = null,
    typeStatsWithContext: js.Array[IContextualizedTypeStats] = null
  ): IQueryStats = {
    val __obj = js.Dynamic.literal()
    if (perClientName != null) __obj.updateDynamic("perClientName")(perClientName.asInstanceOf[js.Any])
    if (perType != null) __obj.updateDynamic("perType")(perType.asInstanceOf[js.Any])
    if (perTypeStat != null) __obj.updateDynamic("perTypeStat")(perTypeStat.asInstanceOf[js.Any])
    if (queryStatsWithContext != null) __obj.updateDynamic("queryStatsWithContext")(queryStatsWithContext.asInstanceOf[js.Any])
    if (typeStatsWithContext != null) __obj.updateDynamic("typeStatsWithContext")(typeStatsWithContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[IQueryStats]
  }
}

