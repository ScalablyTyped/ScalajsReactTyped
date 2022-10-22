package typingsJapgolly.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsageDataSourceResult extends StObject {
  
  /**
    * The data source type that generated usage.
    */
  var DataSource: js.UndefOr[typingsJapgolly.awsSdk.clientsGuarddutyMod.DataSource] = js.undefined
  
  /**
    * Represents the total of usage for the specified data source.
    */
  var Total: js.UndefOr[typingsJapgolly.awsSdk.clientsGuarddutyMod.Total] = js.undefined
}
object UsageDataSourceResult {
  
  inline def apply(): UsageDataSourceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsageDataSourceResult]
  }
  
  extension [Self <: UsageDataSourceResult](x: Self) {
    
    inline def setDataSource(value: DataSource): Self = StObject.set(x, "DataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "DataSource", js.undefined)
    
    inline def setTotal(value: Total): Self = StObject.set(x, "Total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "Total", js.undefined)
  }
}
