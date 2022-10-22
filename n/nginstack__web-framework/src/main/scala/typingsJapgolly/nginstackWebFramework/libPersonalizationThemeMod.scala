package typingsJapgolly.nginstackWebFramework

import typingsJapgolly.nginstackWebFramework.anon.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPersonalizationThemeMod {
  
  inline def apply(themeKey: Any): Unit = ^.asInstanceOf[js.Dynamic].apply(themeKey.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/personalization/Theme", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Theme {
    def this(themeKey: Any) = this()
    
    /* CompleteClass */
    var directory: typingsJapgolly.nginstackEngine.libDbkeyDbkeyMod.^ = js.native
    
    /* CompleteClass */
    var environmentCssFileKeys: js.Array[Any] = js.native
    
    /* CompleteClass */
    var favIconFileKey: typingsJapgolly.nginstackEngine.libDbkeyDbkeyMod.^ = js.native
    
    /* CompleteClass */
    var highchartsOptionsFileKeys: js.Array[typingsJapgolly.nginstackEngine.libDbkeyDbkeyMod.^] = js.native
    
    /* CompleteClass */
    var key: typingsJapgolly.nginstackEngine.libDbkeyDbkeyMod.^ = js.native
    
    /* CompleteClass */
    var simpleLayoutCssFileKeys: js.Array[typingsJapgolly.nginstackEngine.libDbkeyDbkeyMod.^] = js.native
  }
  @JSImport("@nginstack/web-framework/lib/personalization/Theme", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCurrent(): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrent")().asInstanceOf[Theme]
  
  inline def getDirectories(): js.Array[Value] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDirectories")().asInstanceOf[js.Array[Value]]
  
  inline def getInstance(userAgent: Double, userKey: Double): Theme = (^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(userAgent.asInstanceOf[js.Any], userKey.asInstanceOf[js.Any])).asInstanceOf[Theme]
  
  trait Theme extends StObject {
    
    var directory: typingsJapgolly.nginstackEngine.libDbkeyDbkeyMod.^
    
    var environmentCssFileKeys: js.Array[Any]
    
    var favIconFileKey: typingsJapgolly.nginstackEngine.libDbkeyDbkeyMod.^
    
    var highchartsOptionsFileKeys: js.Array[typingsJapgolly.nginstackEngine.libDbkeyDbkeyMod.^]
    
    var key: typingsJapgolly.nginstackEngine.libDbkeyDbkeyMod.^
    
    var simpleLayoutCssFileKeys: js.Array[typingsJapgolly.nginstackEngine.libDbkeyDbkeyMod.^]
  }
  object Theme {
    
    inline def apply(
      directory: typingsJapgolly.nginstackEngine.libDbkeyDbkeyMod.^,
      environmentCssFileKeys: js.Array[Any],
      favIconFileKey: typingsJapgolly.nginstackEngine.libDbkeyDbkeyMod.^,
      highchartsOptionsFileKeys: js.Array[typingsJapgolly.nginstackEngine.libDbkeyDbkeyMod.^],
      key: typingsJapgolly.nginstackEngine.libDbkeyDbkeyMod.^,
      simpleLayoutCssFileKeys: js.Array[typingsJapgolly.nginstackEngine.libDbkeyDbkeyMod.^]
    ): Theme = {
      val __obj = js.Dynamic.literal(directory = directory.asInstanceOf[js.Any], environmentCssFileKeys = environmentCssFileKeys.asInstanceOf[js.Any], favIconFileKey = favIconFileKey.asInstanceOf[js.Any], highchartsOptionsFileKeys = highchartsOptionsFileKeys.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], simpleLayoutCssFileKeys = simpleLayoutCssFileKeys.asInstanceOf[js.Any])
      __obj.asInstanceOf[Theme]
    }
    
    extension [Self <: Theme](x: Self) {
      
      inline def setDirectory(value: typingsJapgolly.nginstackEngine.libDbkeyDbkeyMod.^): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
      
      inline def setEnvironmentCssFileKeys(value: js.Array[Any]): Self = StObject.set(x, "environmentCssFileKeys", value.asInstanceOf[js.Any])
      
      inline def setEnvironmentCssFileKeysVarargs(value: Any*): Self = StObject.set(x, "environmentCssFileKeys", js.Array(value*))
      
      inline def setFavIconFileKey(value: typingsJapgolly.nginstackEngine.libDbkeyDbkeyMod.^): Self = StObject.set(x, "favIconFileKey", value.asInstanceOf[js.Any])
      
      inline def setHighchartsOptionsFileKeys(value: js.Array[typingsJapgolly.nginstackEngine.libDbkeyDbkeyMod.^]): Self = StObject.set(x, "highchartsOptionsFileKeys", value.asInstanceOf[js.Any])
      
      inline def setHighchartsOptionsFileKeysVarargs(value: typingsJapgolly.nginstackEngine.libDbkeyDbkeyMod.^ *): Self = StObject.set(x, "highchartsOptionsFileKeys", js.Array(value*))
      
      inline def setKey(value: typingsJapgolly.nginstackEngine.libDbkeyDbkeyMod.^): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setSimpleLayoutCssFileKeys(value: js.Array[typingsJapgolly.nginstackEngine.libDbkeyDbkeyMod.^]): Self = StObject.set(x, "simpleLayoutCssFileKeys", value.asInstanceOf[js.Any])
      
      inline def setSimpleLayoutCssFileKeysVarargs(value: typingsJapgolly.nginstackEngine.libDbkeyDbkeyMod.^ *): Self = StObject.set(x, "simpleLayoutCssFileKeys", js.Array(value*))
    }
  }
}
