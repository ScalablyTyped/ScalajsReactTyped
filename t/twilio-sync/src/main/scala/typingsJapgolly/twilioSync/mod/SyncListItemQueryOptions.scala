package typingsJapgolly.twilioSync.mod

import typingsJapgolly.twilioSync.twilioSyncStrings.asc
import typingsJapgolly.twilioSync.twilioSyncStrings.desc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * List item query options.
  */
trait SyncListItemQueryOptions extends StObject {
  
  /**
    * Item index, which should be used as the offset.
    * If undefined, starts from the beginning or end depending on queryOptions.order.
    */
  var from: js.UndefOr[Double] = js.undefined
  
  /**
    * Query limit.
    */
  var limit: Double
  
  /**
    * Numeric order of results. Default is "asc".
    */
  var order: js.UndefOr[asc | desc] = js.undefined
  
  /**
    * Results page size. Default is 50.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
}
object SyncListItemQueryOptions {
  
  inline def apply(limit: Double): SyncListItemQueryOptions = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyncListItemQueryOptions]
  }
  
  extension [Self <: SyncListItemQueryOptions](x: Self) {
    
    inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setOrder(value: asc | desc): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
  }
}
