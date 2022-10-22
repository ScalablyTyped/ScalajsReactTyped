package typingsJapgolly.confit

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(optionsOrBaseDir: String): ConfigFactory = ^.asInstanceOf[js.Dynamic].apply(optionsOrBaseDir.asInstanceOf[js.Any]).asInstanceOf[ConfigFactory]
  inline def apply(optionsOrBaseDir: options): ConfigFactory = ^.asInstanceOf[js.Dynamic].apply(optionsOrBaseDir.asInstanceOf[js.Any]).asInstanceOf[ConfigFactory]
  
  @JSImport("confit", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait ConfigFactory extends StObject {
    
    def addDefault(filepathOrSettingsObj: String): this.type = js.native
    def addDefault(filepathOrSettingsObj: js.Object): this.type = js.native
    
    def addOverride(filepathOrSettingsObj: String): this.type = js.native
    def addOverride(filepathOrSettingsObj: js.Object): this.type = js.native
    
    def create(callback: js.Function2[/* err */ Any, /* config */ ConfigStore, Any]): Unit = js.native
  }
  
  trait ConfigStore extends StObject {
    
    def get(name: String): Any
    
    def set[T](name: String, newValue: T): T
    
    def use(newSettings: js.Object): Unit
  }
  object ConfigStore {
    
    inline def apply(get: String => Any, set: (String, Any) => Any, use: js.Object => Callback): ConfigStore = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set), use = js.Any.fromFunction1((t0: js.Object) => use(t0).runNow()))
      __obj.asInstanceOf[ConfigStore]
    }
    
    extension [Self <: ConfigStore](x: Self) {
      
      inline def setGet(value: String => Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setSet(value: (String, Any) => Any): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
      
      inline def setUse(value: js.Object => Callback): Self = StObject.set(x, "use", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    }
  }
  
  type ProtocolsSet = ProtocolsSetPrivate
  
  type ProtocolsSetPrivate = StringDictionary[js.Function2[/* value */ Any, /* callback */ js.UndefOr[Any], Unit]]
  
  trait options extends StObject {
    
    var basedir: String
    
    var protocols: ProtocolsSetPrivate
  }
  object options {
    
    inline def apply(basedir: String, protocols: ProtocolsSetPrivate): options = {
      val __obj = js.Dynamic.literal(basedir = basedir.asInstanceOf[js.Any], protocols = protocols.asInstanceOf[js.Any])
      __obj.asInstanceOf[options]
    }
    
    extension [Self <: options](x: Self) {
      
      inline def setBasedir(value: String): Self = StObject.set(x, "basedir", value.asInstanceOf[js.Any])
      
      inline def setProtocols(value: ProtocolsSetPrivate): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
    }
  }
}
