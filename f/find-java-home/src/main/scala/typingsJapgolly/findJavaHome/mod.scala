package typingsJapgolly.findJavaHome

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(optionsOrCb: Callback): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].apply(optionsOrCb.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def apply(optionsOrCb: Callback, optional: Callback): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].apply(optionsOrCb.asInstanceOf[js.Any], optional.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def apply(optionsOrCb: IOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].apply(optionsOrCb.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def apply(optionsOrCb: IOptions, optional: Callback): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].apply(optionsOrCb.asInstanceOf[js.Any], optional.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @JSImport("find-java-home", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("find-java-home", "promise")
  @js.native
  def promise: js.Promise[String | Null] = js.native
  inline def promise_=(x: js.Promise[String | Null]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("promise")(x.asInstanceOf[js.Any])
  
  type Callback = js.Function2[/* err */ js.Error, /* res */ Any, Unit]
  
  trait IOptions extends StObject {
    
    var allowJre: Boolean
    
    var registry: js.UndefOr[RegArch] = js.undefined
  }
  object IOptions {
    
    inline def apply(allowJre: Boolean): IOptions = {
      val __obj = js.Dynamic.literal(allowJre = allowJre.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOptions]
    }
    
    extension [Self <: IOptions](x: Self) {
      
      inline def setAllowJre(value: Boolean): Self = StObject.set(x, "allowJre", value.asInstanceOf[js.Any])
      
      inline def setRegistry(value: RegArch): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
      
      inline def setRegistryUndefined: Self = StObject.set(x, "registry", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.findJavaHome.findJavaHomeStrings.x86
    - typingsJapgolly.findJavaHome.findJavaHomeStrings.x64
  */
  trait RegArch extends StObject
  object RegArch {
    
    inline def x64: typingsJapgolly.findJavaHome.findJavaHomeStrings.x64 = "x64".asInstanceOf[typingsJapgolly.findJavaHome.findJavaHomeStrings.x64]
    
    inline def x86: typingsJapgolly.findJavaHome.findJavaHomeStrings.x86 = "x86".asInstanceOf[typingsJapgolly.findJavaHome.findJavaHomeStrings.x86]
  }
}
