package typingsJapgolly.nginstackWebFramework

import typingsJapgolly.nginstackWebFramework.anon.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPersonalizationLoginMod {
  
  inline def apply(loginKey: Any): Unit = ^.asInstanceOf[js.Dynamic].apply(loginKey.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/personalization/Login", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Login {
    def this(loginKey: Any) = this()
    
    /* CompleteClass */
    var cssFileKey: typingsJapgolly.nginstackEngine.libDbkeyDbkeyMod.^ = js.native
    
    /* CompleteClass */
    var cssFileKeys: js.Array[typingsJapgolly.nginstackEngine.libDbkeyDbkeyMod.^] = js.native
    
    /* CompleteClass */
    var directory: typingsJapgolly.nginstackEngine.libDbkeyDbkeyMod.^ = js.native
    
    /* CompleteClass */
    var favIconFileKey: typingsJapgolly.nginstackEngine.libDbkeyDbkeyMod.^ = js.native
    
    /* CompleteClass */
    var indexFileKey: typingsJapgolly.nginstackEngine.libDbkeyDbkeyMod.^ = js.native
    
    /* CompleteClass */
    var key: typingsJapgolly.nginstackEngine.libDbkeyDbkeyMod.^ = js.native
    
    /* CompleteClass */
    var loginFileKey: typingsJapgolly.nginstackEngine.libDbkeyDbkeyMod.^ = js.native
    
    /* CompleteClass */
    var titleLogoff: String = js.native
  }
  @JSImport("@nginstack/web-framework/lib/personalization/Login", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDirectories(): js.Array[Value] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDirectories")().asInstanceOf[js.Array[Value]]
  
  inline def getInstance(userAgent: Double): Login = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(userAgent.asInstanceOf[js.Any]).asInstanceOf[Login]
  inline def getInstance(userAgent: typingsJapgolly.nginstackEngine.libDbkeyDbkeyMod.^): Login = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(userAgent.asInstanceOf[js.Any]).asInstanceOf[Login]
  
  trait Login extends StObject {
    
    var cssFileKey: typingsJapgolly.nginstackEngine.libDbkeyDbkeyMod.^
    
    var cssFileKeys: js.Array[typingsJapgolly.nginstackEngine.libDbkeyDbkeyMod.^]
    
    var directory: typingsJapgolly.nginstackEngine.libDbkeyDbkeyMod.^
    
    var favIconFileKey: typingsJapgolly.nginstackEngine.libDbkeyDbkeyMod.^
    
    var indexFileKey: typingsJapgolly.nginstackEngine.libDbkeyDbkeyMod.^
    
    var key: typingsJapgolly.nginstackEngine.libDbkeyDbkeyMod.^
    
    var loginFileKey: typingsJapgolly.nginstackEngine.libDbkeyDbkeyMod.^
    
    var titleLogoff: String
  }
  object Login {
    
    inline def apply(
      cssFileKey: typingsJapgolly.nginstackEngine.libDbkeyDbkeyMod.^,
      cssFileKeys: js.Array[typingsJapgolly.nginstackEngine.libDbkeyDbkeyMod.^],
      directory: typingsJapgolly.nginstackEngine.libDbkeyDbkeyMod.^,
      favIconFileKey: typingsJapgolly.nginstackEngine.libDbkeyDbkeyMod.^,
      indexFileKey: typingsJapgolly.nginstackEngine.libDbkeyDbkeyMod.^,
      key: typingsJapgolly.nginstackEngine.libDbkeyDbkeyMod.^,
      loginFileKey: typingsJapgolly.nginstackEngine.libDbkeyDbkeyMod.^,
      titleLogoff: String
    ): Login = {
      val __obj = js.Dynamic.literal(cssFileKey = cssFileKey.asInstanceOf[js.Any], cssFileKeys = cssFileKeys.asInstanceOf[js.Any], directory = directory.asInstanceOf[js.Any], favIconFileKey = favIconFileKey.asInstanceOf[js.Any], indexFileKey = indexFileKey.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], loginFileKey = loginFileKey.asInstanceOf[js.Any], titleLogoff = titleLogoff.asInstanceOf[js.Any])
      __obj.asInstanceOf[Login]
    }
    
    extension [Self <: Login](x: Self) {
      
      inline def setCssFileKey(value: typingsJapgolly.nginstackEngine.libDbkeyDbkeyMod.^): Self = StObject.set(x, "cssFileKey", value.asInstanceOf[js.Any])
      
      inline def setCssFileKeys(value: js.Array[typingsJapgolly.nginstackEngine.libDbkeyDbkeyMod.^]): Self = StObject.set(x, "cssFileKeys", value.asInstanceOf[js.Any])
      
      inline def setCssFileKeysVarargs(value: typingsJapgolly.nginstackEngine.libDbkeyDbkeyMod.^ *): Self = StObject.set(x, "cssFileKeys", js.Array(value*))
      
      inline def setDirectory(value: typingsJapgolly.nginstackEngine.libDbkeyDbkeyMod.^): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
      
      inline def setFavIconFileKey(value: typingsJapgolly.nginstackEngine.libDbkeyDbkeyMod.^): Self = StObject.set(x, "favIconFileKey", value.asInstanceOf[js.Any])
      
      inline def setIndexFileKey(value: typingsJapgolly.nginstackEngine.libDbkeyDbkeyMod.^): Self = StObject.set(x, "indexFileKey", value.asInstanceOf[js.Any])
      
      inline def setKey(value: typingsJapgolly.nginstackEngine.libDbkeyDbkeyMod.^): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setLoginFileKey(value: typingsJapgolly.nginstackEngine.libDbkeyDbkeyMod.^): Self = StObject.set(x, "loginFileKey", value.asInstanceOf[js.Any])
      
      inline def setTitleLogoff(value: String): Self = StObject.set(x, "titleLogoff", value.asInstanceOf[js.Any])
    }
  }
}
