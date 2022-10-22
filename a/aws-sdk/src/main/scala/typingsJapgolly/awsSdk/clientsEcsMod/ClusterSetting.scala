package typingsJapgolly.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterSetting extends StObject {
  
  /**
    * The name of the cluster setting. The only supported value is containerInsights.
    */
  var name: js.UndefOr[ClusterSettingName] = js.undefined
  
  /**
    * The value to set for the cluster setting. The supported values are enabled and disabled. If enabled is specified, CloudWatch Container Insights will be enabled for the cluster, otherwise it will be disabled unless the containerInsights account setting is enabled. If a cluster value is specified, it will override the containerInsights value set with PutAccountSetting or PutAccountSettingDefault.
    */
  var value: js.UndefOr[String] = js.undefined
}
object ClusterSetting {
  
  inline def apply(): ClusterSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterSetting]
  }
  
  extension [Self <: ClusterSetting](x: Self) {
    
    inline def setName(value: ClusterSettingName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
