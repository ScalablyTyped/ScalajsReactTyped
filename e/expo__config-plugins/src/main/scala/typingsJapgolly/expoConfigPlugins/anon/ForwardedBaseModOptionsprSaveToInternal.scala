package typingsJapgolly.expoConfigPlugins.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @expo/config-plugins.@expo/config-plugins/build/plugins/createBaseMod.ForwardedBaseModOptions & {  providers :std.Partial<@expo/config-plugins.@expo/config-plugins/build/plugins/withAndroidBaseMods.AndroidDefaultProviders> | undefined} */
trait ForwardedBaseModOptionsprSaveToInternal extends StObject {
  
  var providers: js.UndefOr[PartialAndroidDefaultProvAppBuildGradle] = js.undefined
  
  var saveToInternal: js.UndefOr[Boolean] = js.undefined
  
  var skipEmptyMod: js.UndefOr[Boolean] = js.undefined
}
object ForwardedBaseModOptionsprSaveToInternal {
  
  inline def apply(): ForwardedBaseModOptionsprSaveToInternal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForwardedBaseModOptionsprSaveToInternal]
  }
  
  extension [Self <: ForwardedBaseModOptionsprSaveToInternal](x: Self) {
    
    inline def setProviders(value: PartialAndroidDefaultProvAppBuildGradle): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
    
    inline def setProvidersUndefined: Self = StObject.set(x, "providers", js.undefined)
    
    inline def setSaveToInternal(value: Boolean): Self = StObject.set(x, "saveToInternal", value.asInstanceOf[js.Any])
    
    inline def setSaveToInternalUndefined: Self = StObject.set(x, "saveToInternal", js.undefined)
    
    inline def setSkipEmptyMod(value: Boolean): Self = StObject.set(x, "skipEmptyMod", value.asInstanceOf[js.Any])
    
    inline def setSkipEmptyModUndefined: Self = StObject.set(x, "skipEmptyMod", js.undefined)
  }
}
