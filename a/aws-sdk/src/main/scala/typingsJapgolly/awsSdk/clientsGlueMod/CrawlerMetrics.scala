package typingsJapgolly.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CrawlerMetrics extends StObject {
  
  /**
    * The name of the crawler.
    */
  var CrawlerName: js.UndefOr[NameString] = js.undefined
  
  /**
    * The duration of the crawler's most recent run, in seconds.
    */
  var LastRuntimeSeconds: js.UndefOr[NonNegativeDouble] = js.undefined
  
  /**
    * The median duration of this crawler's runs, in seconds.
    */
  var MedianRuntimeSeconds: js.UndefOr[NonNegativeDouble] = js.undefined
  
  /**
    * True if the crawler is still estimating how long it will take to complete this run.
    */
  var StillEstimating: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The number of tables created by this crawler.
    */
  var TablesCreated: js.UndefOr[NonNegativeInteger] = js.undefined
  
  /**
    * The number of tables deleted by this crawler.
    */
  var TablesDeleted: js.UndefOr[NonNegativeInteger] = js.undefined
  
  /**
    * The number of tables updated by this crawler.
    */
  var TablesUpdated: js.UndefOr[NonNegativeInteger] = js.undefined
  
  /**
    * The estimated time left to complete a running crawl.
    */
  var TimeLeftSeconds: js.UndefOr[NonNegativeDouble] = js.undefined
}
object CrawlerMetrics {
  
  inline def apply(): CrawlerMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CrawlerMetrics]
  }
  
  extension [Self <: CrawlerMetrics](x: Self) {
    
    inline def setCrawlerName(value: NameString): Self = StObject.set(x, "CrawlerName", value.asInstanceOf[js.Any])
    
    inline def setCrawlerNameUndefined: Self = StObject.set(x, "CrawlerName", js.undefined)
    
    inline def setLastRuntimeSeconds(value: NonNegativeDouble): Self = StObject.set(x, "LastRuntimeSeconds", value.asInstanceOf[js.Any])
    
    inline def setLastRuntimeSecondsUndefined: Self = StObject.set(x, "LastRuntimeSeconds", js.undefined)
    
    inline def setMedianRuntimeSeconds(value: NonNegativeDouble): Self = StObject.set(x, "MedianRuntimeSeconds", value.asInstanceOf[js.Any])
    
    inline def setMedianRuntimeSecondsUndefined: Self = StObject.set(x, "MedianRuntimeSeconds", js.undefined)
    
    inline def setStillEstimating(value: Boolean): Self = StObject.set(x, "StillEstimating", value.asInstanceOf[js.Any])
    
    inline def setStillEstimatingUndefined: Self = StObject.set(x, "StillEstimating", js.undefined)
    
    inline def setTablesCreated(value: NonNegativeInteger): Self = StObject.set(x, "TablesCreated", value.asInstanceOf[js.Any])
    
    inline def setTablesCreatedUndefined: Self = StObject.set(x, "TablesCreated", js.undefined)
    
    inline def setTablesDeleted(value: NonNegativeInteger): Self = StObject.set(x, "TablesDeleted", value.asInstanceOf[js.Any])
    
    inline def setTablesDeletedUndefined: Self = StObject.set(x, "TablesDeleted", js.undefined)
    
    inline def setTablesUpdated(value: NonNegativeInteger): Self = StObject.set(x, "TablesUpdated", value.asInstanceOf[js.Any])
    
    inline def setTablesUpdatedUndefined: Self = StObject.set(x, "TablesUpdated", js.undefined)
    
    inline def setTimeLeftSeconds(value: NonNegativeDouble): Self = StObject.set(x, "TimeLeftSeconds", value.asInstanceOf[js.Any])
    
    inline def setTimeLeftSecondsUndefined: Self = StObject.set(x, "TimeLeftSeconds", js.undefined)
  }
}
