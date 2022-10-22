package typingsJapgolly.dynatable.JQueryDynatable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Params extends StObject {
  
  /**
    * @default 'dynatable'
    */
  var dynatable: js.UndefOr[String] = js.undefined
  
  /**
    * @default 'offset'
    */
  var offset: js.UndefOr[String] = js.undefined
  
  /**
    * @default 'page'
    */
  var page: js.UndefOr[String] = js.undefined
  
  /**
    * @default 'perPage'
    */
  var perPage: js.UndefOr[String] = js.undefined
  
  /**
    * @default 'queries'
    */
  var queries: js.UndefOr[String] = js.undefined
  
  /**
    * @default 'queryRecordCount'
    */
  var queryRecordCount: js.UndefOr[String] = js.undefined
  
  /**
    * @default null
    */
  var record: js.UndefOr[js.Object] = js.undefined
  
  /**
    * @default 'records'
    */
  var records: js.UndefOr[String] = js.undefined
  
  /**
    * @default 'sorts'
    */
  var sorts: js.UndefOr[String] = js.undefined
  
  /**
    * @default 'totalRecordCount'
    */
  var totalRecordCount: js.UndefOr[String] = js.undefined
}
object Params {
  
  inline def apply(): Params = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Params]
  }
  
  extension [Self <: Params](x: Self) {
    
    inline def setDynatable(value: String): Self = StObject.set(x, "dynatable", value.asInstanceOf[js.Any])
    
    inline def setDynatableUndefined: Self = StObject.set(x, "dynatable", js.undefined)
    
    inline def setOffset(value: String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setPage(value: String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPerPage(value: String): Self = StObject.set(x, "perPage", value.asInstanceOf[js.Any])
    
    inline def setPerPageUndefined: Self = StObject.set(x, "perPage", js.undefined)
    
    inline def setQueries(value: String): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
    
    inline def setQueriesUndefined: Self = StObject.set(x, "queries", js.undefined)
    
    inline def setQueryRecordCount(value: String): Self = StObject.set(x, "queryRecordCount", value.asInstanceOf[js.Any])
    
    inline def setQueryRecordCountUndefined: Self = StObject.set(x, "queryRecordCount", js.undefined)
    
    inline def setRecord(value: js.Object): Self = StObject.set(x, "record", value.asInstanceOf[js.Any])
    
    inline def setRecordUndefined: Self = StObject.set(x, "record", js.undefined)
    
    inline def setRecords(value: String): Self = StObject.set(x, "records", value.asInstanceOf[js.Any])
    
    inline def setRecordsUndefined: Self = StObject.set(x, "records", js.undefined)
    
    inline def setSorts(value: String): Self = StObject.set(x, "sorts", value.asInstanceOf[js.Any])
    
    inline def setSortsUndefined: Self = StObject.set(x, "sorts", js.undefined)
    
    inline def setTotalRecordCount(value: String): Self = StObject.set(x, "totalRecordCount", value.asInstanceOf[js.Any])
    
    inline def setTotalRecordCountUndefined: Self = StObject.set(x, "totalRecordCount", js.undefined)
  }
}
