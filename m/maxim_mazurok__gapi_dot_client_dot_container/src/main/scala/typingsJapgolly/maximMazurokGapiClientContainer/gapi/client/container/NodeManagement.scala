package typingsJapgolly.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeManagement extends StObject {
  
  /**
    * A flag that specifies whether the node auto-repair is enabled for the node pool. If enabled, the nodes in this node pool will be monitored and, if they fail health checks too many
    * times, an automatic repair action will be triggered.
    */
  var autoRepair: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A flag that specifies whether node auto-upgrade is enabled for the node pool. If enabled, node auto-upgrade helps keep the nodes in your node pool up to date with the latest release
    * version of Kubernetes.
    */
  var autoUpgrade: js.UndefOr[Boolean] = js.undefined
  
  /** Specifies the Auto Upgrade knobs for the node pool. */
  var upgradeOptions: js.UndefOr[AutoUpgradeOptions] = js.undefined
}
object NodeManagement {
  
  inline def apply(): NodeManagement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeManagement]
  }
  
  extension [Self <: NodeManagement](x: Self) {
    
    inline def setAutoRepair(value: Boolean): Self = StObject.set(x, "autoRepair", value.asInstanceOf[js.Any])
    
    inline def setAutoRepairUndefined: Self = StObject.set(x, "autoRepair", js.undefined)
    
    inline def setAutoUpgrade(value: Boolean): Self = StObject.set(x, "autoUpgrade", value.asInstanceOf[js.Any])
    
    inline def setAutoUpgradeUndefined: Self = StObject.set(x, "autoUpgrade", js.undefined)
    
    inline def setUpgradeOptions(value: AutoUpgradeOptions): Self = StObject.set(x, "upgradeOptions", value.asInstanceOf[js.Any])
    
    inline def setUpgradeOptionsUndefined: Self = StObject.set(x, "upgradeOptions", js.undefined)
  }
}
