package typingsJapgolly.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DBProxyTargetGroup extends StObject {
  
  /**
    * The settings that determine the size and behavior of the connection pool for the target group.
    */
  var ConnectionPoolConfig: js.UndefOr[ConnectionPoolConfigurationInfo] = js.undefined
  
  /**
    * The date and time when the target group was first created.
    */
  var CreatedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The identifier for the RDS proxy associated with this target group.
    */
  var DBProxyName: js.UndefOr[String] = js.undefined
  
  /**
    * Whether this target group is the first one used for connection requests by the associated proxy. Because each proxy is currently associated with a single target group, currently this setting is always true.
    */
  var IsDefault: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The current status of this target group. A status of available means the target group is correctly associated with a database. Other values indicate that you must wait for the target group to be ready, or take some action to resolve an issue.
    */
  var Status: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) representing the target group.
    */
  var TargetGroupArn: js.UndefOr[String] = js.undefined
  
  /**
    * The identifier for the target group. This name must be unique for all target groups owned by your Amazon Web Services account in the specified Amazon Web Services Region.
    */
  var TargetGroupName: js.UndefOr[String] = js.undefined
  
  /**
    * The date and time when the target group was last updated.
    */
  var UpdatedDate: js.UndefOr[js.Date] = js.undefined
}
object DBProxyTargetGroup {
  
  inline def apply(): DBProxyTargetGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBProxyTargetGroup]
  }
  
  extension [Self <: DBProxyTargetGroup](x: Self) {
    
    inline def setConnectionPoolConfig(value: ConnectionPoolConfigurationInfo): Self = StObject.set(x, "ConnectionPoolConfig", value.asInstanceOf[js.Any])
    
    inline def setConnectionPoolConfigUndefined: Self = StObject.set(x, "ConnectionPoolConfig", js.undefined)
    
    inline def setCreatedDate(value: js.Date): Self = StObject.set(x, "CreatedDate", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateUndefined: Self = StObject.set(x, "CreatedDate", js.undefined)
    
    inline def setDBProxyName(value: String): Self = StObject.set(x, "DBProxyName", value.asInstanceOf[js.Any])
    
    inline def setDBProxyNameUndefined: Self = StObject.set(x, "DBProxyName", js.undefined)
    
    inline def setIsDefault(value: Boolean): Self = StObject.set(x, "IsDefault", value.asInstanceOf[js.Any])
    
    inline def setIsDefaultUndefined: Self = StObject.set(x, "IsDefault", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTargetGroupArn(value: String): Self = StObject.set(x, "TargetGroupArn", value.asInstanceOf[js.Any])
    
    inline def setTargetGroupArnUndefined: Self = StObject.set(x, "TargetGroupArn", js.undefined)
    
    inline def setTargetGroupName(value: String): Self = StObject.set(x, "TargetGroupName", value.asInstanceOf[js.Any])
    
    inline def setTargetGroupNameUndefined: Self = StObject.set(x, "TargetGroupName", js.undefined)
    
    inline def setUpdatedDate(value: js.Date): Self = StObject.set(x, "UpdatedDate", value.asInstanceOf[js.Any])
    
    inline def setUpdatedDateUndefined: Self = StObject.set(x, "UpdatedDate", js.undefined)
  }
}
