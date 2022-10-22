package typingsJapgolly.wepy

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.wepy.anon.Pages
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appMod {
  
  @JSImport("wepy/app", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with app
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wepy.wepyStrings.requestfix
    - typingsJapgolly.wepy.wepyStrings.promisify
  */
  trait AddOn extends StObject
  object AddOn {
    
    inline def promisify: typingsJapgolly.wepy.wepyStrings.promisify = "promisify".asInstanceOf[typingsJapgolly.wepy.wepyStrings.promisify]
    
    inline def requestfix: typingsJapgolly.wepy.wepyStrings.requestfix = "requestfix".asInstanceOf[typingsJapgolly.wepy.wepyStrings.requestfix]
  }
  
  trait AppConfig extends StObject {
    
    var appEvents: js.UndefOr[js.Array[String]] = js.undefined
    
    var noPromiseAPI: js.UndefOr[js.Array[String] | StringDictionary[Boolean]] = js.undefined
    
    var pageEvents: js.UndefOr[js.Array[String]] = js.undefined
  }
  object AppConfig {
    
    inline def apply(): AppConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppConfig]
    }
    
    extension [Self <: AppConfig](x: Self) {
      
      inline def setAppEvents(value: js.Array[String]): Self = StObject.set(x, "appEvents", value.asInstanceOf[js.Any])
      
      inline def setAppEventsUndefined: Self = StObject.set(x, "appEvents", js.undefined)
      
      inline def setAppEventsVarargs(value: String*): Self = StObject.set(x, "appEvents", js.Array(value*))
      
      inline def setNoPromiseAPI(value: js.Array[String] | StringDictionary[Boolean]): Self = StObject.set(x, "noPromiseAPI", value.asInstanceOf[js.Any])
      
      inline def setNoPromiseAPIUndefined: Self = StObject.set(x, "noPromiseAPI", js.undefined)
      
      inline def setNoPromiseAPIVarargs(value: String*): Self = StObject.set(x, "noPromiseAPI", js.Array(value*))
      
      inline def setPageEvents(value: js.Array[String]): Self = StObject.set(x, "pageEvents", value.asInstanceOf[js.Any])
      
      inline def setPageEventsUndefined: Self = StObject.set(x, "pageEvents", js.undefined)
      
      inline def setPageEventsVarargs(value: String*): Self = StObject.set(x, "pageEvents", js.Array(value*))
    }
  }
  
  @js.native
  trait AppConstructor
    extends StObject
       with Instantiable0[app]
  
  @js.native
  trait app extends StObject {
    
    @JSName("$init")
    def $init(wepy: Any, config: AppConfig): Unit = js.native
    
    @JSName("$initAPI")
    def $initAPI(wepy: Any, noPromiseAPI: js.Array[String]): Unit = js.native
    @JSName("$initAPI")
    def $initAPI(wepy: Any, noPromiseAPI: StringDictionary[Boolean]): Unit = js.native
    
    var config: Pages = js.native
    
    def use(addonName: AddOn, args: Any*): Unit = js.native
  }
}
