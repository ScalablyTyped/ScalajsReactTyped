package typingsJapgolly.maximMazurokGapiClientGames.gapi.client.games

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceAndroidDetails extends StObject {
  
  /** Flag indicating whether the anti-piracy check is enabled. */
  var enablePiracyCheck: js.UndefOr[Boolean] = js.undefined
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `games#instanceAndroidDetails`. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Android package name which maps to Google Play URL. */
  var packageName: js.UndefOr[String] = js.undefined
  
  /** Indicates that this instance is the default for new installations. */
  var preferred: js.UndefOr[Boolean] = js.undefined
}
object InstanceAndroidDetails {
  
  inline def apply(): InstanceAndroidDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceAndroidDetails]
  }
  
  extension [Self <: InstanceAndroidDetails](x: Self) {
    
    inline def setEnablePiracyCheck(value: Boolean): Self = StObject.set(x, "enablePiracyCheck", value.asInstanceOf[js.Any])
    
    inline def setEnablePiracyCheckUndefined: Self = StObject.set(x, "enablePiracyCheck", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    
    inline def setPreferred(value: Boolean): Self = StObject.set(x, "preferred", value.asInstanceOf[js.Any])
    
    inline def setPreferredUndefined: Self = StObject.set(x, "preferred", js.undefined)
  }
}
