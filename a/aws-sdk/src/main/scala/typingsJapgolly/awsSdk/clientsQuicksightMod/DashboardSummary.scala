package typingsJapgolly.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DashboardSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var Arn: js.UndefOr[typingsJapgolly.awsSdk.clientsQuicksightMod.Arn] = js.undefined
  
  /**
    * The time that this dashboard was created.
    */
  var CreatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Dashboard ID.
    */
  var DashboardId: js.UndefOr[RestrictiveResourceId] = js.undefined
  
  /**
    * The last time that this dashboard was published.
    */
  var LastPublishedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The last time that this dashboard was updated.
    */
  var LastUpdatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A display name for the dashboard.
    */
  var Name: js.UndefOr[DashboardName] = js.undefined
  
  /**
    * Published version number.
    */
  var PublishedVersionNumber: js.UndefOr[VersionNumber] = js.undefined
}
object DashboardSummary {
  
  inline def apply(): DashboardSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DashboardSummary]
  }
  
  extension [Self <: DashboardSummary](x: Self) {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCreatedTime(value: js.Date): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    inline def setDashboardId(value: RestrictiveResourceId): Self = StObject.set(x, "DashboardId", value.asInstanceOf[js.Any])
    
    inline def setDashboardIdUndefined: Self = StObject.set(x, "DashboardId", js.undefined)
    
    inline def setLastPublishedTime(value: js.Date): Self = StObject.set(x, "LastPublishedTime", value.asInstanceOf[js.Any])
    
    inline def setLastPublishedTimeUndefined: Self = StObject.set(x, "LastPublishedTime", js.undefined)
    
    inline def setLastUpdatedTime(value: js.Date): Self = StObject.set(x, "LastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimeUndefined: Self = StObject.set(x, "LastUpdatedTime", js.undefined)
    
    inline def setName(value: DashboardName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setPublishedVersionNumber(value: VersionNumber): Self = StObject.set(x, "PublishedVersionNumber", value.asInstanceOf[js.Any])
    
    inline def setPublishedVersionNumberUndefined: Self = StObject.set(x, "PublishedVersionNumber", js.undefined)
  }
}
