package typingsJapgolly.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tier extends StObject {
  
  /** The maximum disk size of this tier in bytes. */
  var DiskQuota: js.UndefOr[String] = js.undefined
  
  /** The maximum RAM usage of this tier in bytes. */
  var RAM: js.UndefOr[String] = js.undefined
  
  /** This is always `sql#tier`. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The applicable regions for this tier. */
  var region: js.UndefOr[js.Array[String]] = js.undefined
  
  /** An identifier for the machine type, for example, `db-custom-1-3840`. For related information, see [Pricing](/sql/pricing). */
  var tier: js.UndefOr[String] = js.undefined
}
object Tier {
  
  inline def apply(): Tier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Tier]
  }
  
  extension [Self <: Tier](x: Self) {
    
    inline def setDiskQuota(value: String): Self = StObject.set(x, "DiskQuota", value.asInstanceOf[js.Any])
    
    inline def setDiskQuotaUndefined: Self = StObject.set(x, "DiskQuota", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setRAM(value: String): Self = StObject.set(x, "RAM", value.asInstanceOf[js.Any])
    
    inline def setRAMUndefined: Self = StObject.set(x, "RAM", js.undefined)
    
    inline def setRegion(value: js.Array[String]): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setRegionVarargs(value: String*): Self = StObject.set(x, "region", js.Array(value*))
    
    inline def setTier(value: String): Self = StObject.set(x, "tier", value.asInstanceOf[js.Any])
    
    inline def setTierUndefined: Self = StObject.set(x, "tier", js.undefined)
  }
}
