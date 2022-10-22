package typingsJapgolly.nginstackWebFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPersonalizationEnvironmentMod {
  
  inline def apply(environmentKey: Any): Unit = ^.asInstanceOf[js.Dynamic].apply(environmentKey.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/personalization/Environment", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Environment {
    def this(environmentKey: Any) = this()
    
    /* CompleteClass */
    var key: typingsJapgolly.nginstackEngine.libDbkeyDbkeyMod.^ = js.native
    
    /* CompleteClass */
    var menuBar: typingsJapgolly.nginstackWebFramework.libPersonalizationMenuBarMod.^ = js.native
    
    /* CompleteClass */
    var titleLogon: String = js.native
  }
  @JSImport("@nginstack/web-framework/lib/personalization/Environment", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getInstance(userAgent: Double, userKey: Double): Environment = (^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(userAgent.asInstanceOf[js.Any], userKey.asInstanceOf[js.Any])).asInstanceOf[Environment]
  
  trait Environment extends StObject {
    
    var key: typingsJapgolly.nginstackEngine.libDbkeyDbkeyMod.^
    
    var menuBar: typingsJapgolly.nginstackWebFramework.libPersonalizationMenuBarMod.^
    
    var titleLogon: String
  }
  object Environment {
    
    inline def apply(
      key: typingsJapgolly.nginstackEngine.libDbkeyDbkeyMod.^,
      menuBar: typingsJapgolly.nginstackWebFramework.libPersonalizationMenuBarMod.^,
      titleLogon: String
    ): Environment = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], menuBar = menuBar.asInstanceOf[js.Any], titleLogon = titleLogon.asInstanceOf[js.Any])
      __obj.asInstanceOf[Environment]
    }
    
    extension [Self <: Environment](x: Self) {
      
      inline def setKey(value: typingsJapgolly.nginstackEngine.libDbkeyDbkeyMod.^): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setMenuBar(value: typingsJapgolly.nginstackWebFramework.libPersonalizationMenuBarMod.^): Self = StObject.set(x, "menuBar", value.asInstanceOf[js.Any])
      
      inline def setTitleLogon(value: String): Self = StObject.set(x, "titleLogon", value.asInstanceOf[js.Any])
    }
  }
}
