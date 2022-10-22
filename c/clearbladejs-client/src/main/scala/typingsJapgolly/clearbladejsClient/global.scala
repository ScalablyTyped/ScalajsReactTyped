package typingsJapgolly.clearbladejsClient

import typingsJapgolly.clearbladejsClient.CbClient.ClearBladeGlobal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object CbClient {
    
    @JSGlobal("CbClient")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("CbClient.ClearBlade")
    @js.native
    def ClearBlade: ClearBladeGlobal = js.native
    inline def ClearBlade_=(x: ClearBladeGlobal): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ClearBlade")(x.asInstanceOf[js.Any])
    
    @JSGlobal("CbClient.MessagingQOS")
    @js.native
    object MessagingQOS extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.clearbladejsClient.CbClient.MessagingQOS & Double] = js.native
      
      /* 1 */ val MESSAGING_QOS_AT_LEAST_ONCE: typingsJapgolly.clearbladejsClient.CbClient.MessagingQOS.MESSAGING_QOS_AT_LEAST_ONCE & Double = js.native
      
      /* 0 */ val MESSAGING_QOS_AT_MOST_ONCE: typingsJapgolly.clearbladejsClient.CbClient.MessagingQOS.MESSAGING_QOS_AT_MOST_ONCE & Double = js.native
      
      /* 2 */ val MESSAGING_QOS_EXACTLY_ONCE: typingsJapgolly.clearbladejsClient.CbClient.MessagingQOS.MESSAGING_QOS_EXACTLY_ONCE & Double = js.native
    }
    
    @JSGlobal("CbClient.QueryConditions")
    @js.native
    object QueryConditions extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsJapgolly.clearbladejsClient.CbClient.QueryConditions & String] = js.native
      
      /* "EQ" */ val QUERY_EQUAL: typingsJapgolly.clearbladejsClient.CbClient.QueryConditions.QUERY_EQUAL & String = js.native
      
      /* "GT" */ val QUERY_GREATERTHAN: typingsJapgolly.clearbladejsClient.CbClient.QueryConditions.QUERY_GREATERTHAN & String = js.native
      
      /* "GTE" */ val QUERY_GREATERTHAN_EQUAL: typingsJapgolly.clearbladejsClient.CbClient.QueryConditions.QUERY_GREATERTHAN_EQUAL & String = js.native
      
      /* "LT" */ val QUERY_LESSTHAN: typingsJapgolly.clearbladejsClient.CbClient.QueryConditions.QUERY_LESSTHAN & String = js.native
      
      /* "LTE" */ val QUERY_LESSTHAN_EQUAL: typingsJapgolly.clearbladejsClient.CbClient.QueryConditions.QUERY_LESSTHAN_EQUAL & String = js.native
      
      /* "RE" */ val QUERY_MATCHES: typingsJapgolly.clearbladejsClient.CbClient.QueryConditions.QUERY_MATCHES & String = js.native
      
      /* "NEQ" */ val QUERY_NOTEQUAL: typingsJapgolly.clearbladejsClient.CbClient.QueryConditions.QUERY_NOTEQUAL & String = js.native
    }
    
    @JSGlobal("CbClient.QuerySortDirections")
    @js.native
    object QuerySortDirections extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsJapgolly.clearbladejsClient.CbClient.QuerySortDirections & String] = js.native
      
      /* "ASC" */ val QUERY_SORT_ASCENDING: typingsJapgolly.clearbladejsClient.CbClient.QuerySortDirections.QUERY_SORT_ASCENDING & String = js.native
      
      /* "DESC" */ val QUERY_SORT_DESCENDING: typingsJapgolly.clearbladejsClient.CbClient.QuerySortDirections.QUERY_SORT_DESCENDING & String = js.native
    }
  }
  
  @JSGlobal("ClearBlade")
  @js.native
  def ClearBlade: ClearBladeGlobal = js.native
  inline def ClearBlade_=(x: ClearBladeGlobal): Unit = js.Dynamic.global.updateDynamic("ClearBlade")(x.asInstanceOf[js.Any])
}
