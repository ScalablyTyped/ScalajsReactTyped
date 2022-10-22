package typingsJapgolly.maximMazurokGapiClientGames.gapi.client.games

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Instance extends StObject {
  
  /** URI which shows where a user can acquire this instance. */
  var acquisitionUri: js.UndefOr[String] = js.undefined
  
  /** Platform dependent details for Android. */
  var androidInstance: js.UndefOr[InstanceAndroidDetails] = js.undefined
  
  /** Platform dependent details for iOS. */
  var iosInstance: js.UndefOr[InstanceIosDetails] = js.undefined
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `games#instance`. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Localized display name. */
  var name: js.UndefOr[String] = js.undefined
  
  /** The platform type. */
  var platformType: js.UndefOr[String] = js.undefined
  
  /** Flag to show if this game instance supports realtime play. */
  var realtimePlay: js.UndefOr[Boolean] = js.undefined
  
  /** Flag to show if this game instance supports turn based play. */
  var turnBasedPlay: js.UndefOr[Boolean] = js.undefined
  
  /** Platform dependent details for Web. */
  var webInstance: js.UndefOr[InstanceWebDetails] = js.undefined
}
object Instance {
  
  inline def apply(): Instance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Instance]
  }
  
  extension [Self <: Instance](x: Self) {
    
    inline def setAcquisitionUri(value: String): Self = StObject.set(x, "acquisitionUri", value.asInstanceOf[js.Any])
    
    inline def setAcquisitionUriUndefined: Self = StObject.set(x, "acquisitionUri", js.undefined)
    
    inline def setAndroidInstance(value: InstanceAndroidDetails): Self = StObject.set(x, "androidInstance", value.asInstanceOf[js.Any])
    
    inline def setAndroidInstanceUndefined: Self = StObject.set(x, "androidInstance", js.undefined)
    
    inline def setIosInstance(value: InstanceIosDetails): Self = StObject.set(x, "iosInstance", value.asInstanceOf[js.Any])
    
    inline def setIosInstanceUndefined: Self = StObject.set(x, "iosInstance", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPlatformType(value: String): Self = StObject.set(x, "platformType", value.asInstanceOf[js.Any])
    
    inline def setPlatformTypeUndefined: Self = StObject.set(x, "platformType", js.undefined)
    
    inline def setRealtimePlay(value: Boolean): Self = StObject.set(x, "realtimePlay", value.asInstanceOf[js.Any])
    
    inline def setRealtimePlayUndefined: Self = StObject.set(x, "realtimePlay", js.undefined)
    
    inline def setTurnBasedPlay(value: Boolean): Self = StObject.set(x, "turnBasedPlay", value.asInstanceOf[js.Any])
    
    inline def setTurnBasedPlayUndefined: Self = StObject.set(x, "turnBasedPlay", js.undefined)
    
    inline def setWebInstance(value: InstanceWebDetails): Self = StObject.set(x, "webInstance", value.asInstanceOf[js.Any])
    
    inline def setWebInstanceUndefined: Self = StObject.set(x, "webInstance", js.undefined)
  }
}
