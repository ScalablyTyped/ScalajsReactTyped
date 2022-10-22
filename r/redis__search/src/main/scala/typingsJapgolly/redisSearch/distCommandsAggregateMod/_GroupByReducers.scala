package typingsJapgolly.redisSearch.distCommandsAggregateMod

import typingsJapgolly.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers.AVG
import typingsJapgolly.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers.COUNT_DISTINCT
import typingsJapgolly.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers.COUNT_DISTINCTISH
import typingsJapgolly.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers.FIRST_VALUE
import typingsJapgolly.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers.MAX
import typingsJapgolly.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers.MIN
import typingsJapgolly.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers.QUANTILE
import typingsJapgolly.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers.RANDOM_SAMPLE
import typingsJapgolly.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers.STDDEV
import typingsJapgolly.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers.SUM
import typingsJapgolly.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers.TOLIST
import typingsJapgolly.redisSearch.distCommandsMod.PropertyName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _GroupByReducers extends StObject
object _GroupByReducers {
  
  inline def AvgReducer(property: PropertyName, `type`: AVG): typingsJapgolly.redisSearch.distCommandsAggregateMod.AvgReducer = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.redisSearch.distCommandsAggregateMod.AvgReducer]
  }
  
  inline def CountDistinctReducer(property: PropertyName, `type`: COUNT_DISTINCT): typingsJapgolly.redisSearch.distCommandsAggregateMod.CountDistinctReducer = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.redisSearch.distCommandsAggregateMod.CountDistinctReducer]
  }
  
  inline def CountDistinctishReducer(property: PropertyName, `type`: COUNT_DISTINCTISH): typingsJapgolly.redisSearch.distCommandsAggregateMod.CountDistinctishReducer = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.redisSearch.distCommandsAggregateMod.CountDistinctishReducer]
  }
  
  inline def FirstValueReducer(property: PropertyName, `type`: FIRST_VALUE): typingsJapgolly.redisSearch.distCommandsAggregateMod.FirstValueReducer = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.redisSearch.distCommandsAggregateMod.FirstValueReducer]
  }
  
  inline def MaxReducer(property: PropertyName, `type`: MAX): typingsJapgolly.redisSearch.distCommandsAggregateMod.MaxReducer = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.redisSearch.distCommandsAggregateMod.MaxReducer]
  }
  
  inline def MinReducer(property: PropertyName, `type`: MIN): typingsJapgolly.redisSearch.distCommandsAggregateMod.MinReducer = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.redisSearch.distCommandsAggregateMod.MinReducer]
  }
  
  inline def QuantileReducer(property: PropertyName, quantile: Double, `type`: QUANTILE): typingsJapgolly.redisSearch.distCommandsAggregateMod.QuantileReducer = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any], quantile = quantile.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.redisSearch.distCommandsAggregateMod.QuantileReducer]
  }
  
  inline def RandomSampleReducer(property: PropertyName, sampleSize: Double, `type`: RANDOM_SAMPLE): typingsJapgolly.redisSearch.distCommandsAggregateMod.RandomSampleReducer = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any], sampleSize = sampleSize.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.redisSearch.distCommandsAggregateMod.RandomSampleReducer]
  }
  
  inline def StdDevReducer(property: PropertyName, `type`: STDDEV): typingsJapgolly.redisSearch.distCommandsAggregateMod.StdDevReducer = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.redisSearch.distCommandsAggregateMod.StdDevReducer]
  }
  
  inline def SumReducer(property: PropertyName, `type`: SUM): typingsJapgolly.redisSearch.distCommandsAggregateMod.SumReducer = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.redisSearch.distCommandsAggregateMod.SumReducer]
  }
  
  inline def ToListReducer(property: PropertyName, `type`: TOLIST): typingsJapgolly.redisSearch.distCommandsAggregateMod.ToListReducer = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.redisSearch.distCommandsAggregateMod.ToListReducer]
  }
}
