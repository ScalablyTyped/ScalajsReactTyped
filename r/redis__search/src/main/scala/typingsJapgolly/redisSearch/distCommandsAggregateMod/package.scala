package typingsJapgolly.redisSearch.distCommandsAggregateMod

import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArgument
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArguments
import typingsJapgolly.redisSearch.anon.AS
import typingsJapgolly.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers.COUNT
import typingsJapgolly.redisSearch.distCommandsAggregateMod.^
import typingsJapgolly.redisSearch.distCommandsMod.PropertyName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def FIRST_KEY_INDEX: /* 1 */ Double = ^.asInstanceOf[js.Dynamic].selectDynamic("FIRST_KEY_INDEX").asInstanceOf[/* 1 */ Double]

inline def IS_READ_ONLY: /* true */ Boolean = ^.asInstanceOf[js.Dynamic].selectDynamic("IS_READ_ONLY").asInstanceOf[/* true */ Boolean]

inline def pushAggregatehOptions(args: RedisCommandArguments): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("pushAggregatehOptions")(args.asInstanceOf[js.Any]).asInstanceOf[RedisCommandArguments]
inline def pushAggregatehOptions(args: RedisCommandArguments, options: AggregateOptions): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("pushAggregatehOptions")(args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]

inline def transformArguments(index: String, query: String): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(index.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
inline def transformArguments(index: String, query: String, options: AggregateOptions): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(index.asInstanceOf[js.Any], query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]

inline def transformReply(rawReply: AggregateRawReply): AggregateReply = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(rawReply.asInstanceOf[js.Any]).asInstanceOf[AggregateReply]

type AggregateRawReply = /* results */ Array[Double | js.Array[RedisCommandArgument]]

type CountReducer = GroupByReducer[COUNT]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.redisSearch.distCommandsAggregateMod.CountReducer
  - typingsJapgolly.redisSearch.distCommandsAggregateMod.CountDistinctReducer
  - typingsJapgolly.redisSearch.distCommandsAggregateMod.CountDistinctishReducer
  - typingsJapgolly.redisSearch.distCommandsAggregateMod.SumReducer
  - typingsJapgolly.redisSearch.distCommandsAggregateMod.MinReducer
  - typingsJapgolly.redisSearch.distCommandsAggregateMod.MaxReducer
  - typingsJapgolly.redisSearch.distCommandsAggregateMod.AvgReducer
  - typingsJapgolly.redisSearch.distCommandsAggregateMod.StdDevReducer
  - typingsJapgolly.redisSearch.distCommandsAggregateMod.QuantileReducer
  - typingsJapgolly.redisSearch.distCommandsAggregateMod.ToListReducer
  - typingsJapgolly.redisSearch.distCommandsAggregateMod.FirstValueReducer
  - typingsJapgolly.redisSearch.distCommandsAggregateMod.RandomSampleReducer
*/
type GroupByReducers = _GroupByReducers | CountReducer

type LoadField = PropertyName | AS
