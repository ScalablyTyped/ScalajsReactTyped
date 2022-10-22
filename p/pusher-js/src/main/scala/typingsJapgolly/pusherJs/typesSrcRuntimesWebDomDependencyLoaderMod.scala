package typingsJapgolly.pusherJs

import japgolly.scalajs.react.Callback
import typingsJapgolly.pusherJs.typesSrcRuntimesWebDomScriptReceiverFactoryMod.ScriptReceiverFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcRuntimesWebDomDependencyLoaderMod {
  
  @JSImport("pusher-js/types/src/runtimes/web/dom/dependency_loader", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with DependencyLoader {
    def this(options: Any) = this()
    
    /* CompleteClass */
    override def getPath(name: String, options: Any): String = js.native
    
    /* CompleteClass */
    override def getRoot(options: Any): String = js.native
    
    /* CompleteClass */
    override def load(name: String, options: Any, callback: js.Function): Unit = js.native
    
    /* CompleteClass */
    var loading: Any = js.native
    
    /* CompleteClass */
    var options: Any = js.native
    
    /* CompleteClass */
    var receivers: ScriptReceiverFactory = js.native
  }
  
  trait DependencyLoader extends StObject {
    
    def getPath(name: String, options: Any): String
    
    def getRoot(options: Any): String
    
    def load(name: String, options: Any, callback: js.Function): Unit
    
    var loading: Any
    
    var options: Any
    
    var receivers: ScriptReceiverFactory
  }
  object DependencyLoader {
    
    inline def apply(
      getPath: (String, Any) => String,
      getRoot: Any => String,
      load: (String, Any, js.Function) => Callback,
      loading: Any,
      options: Any,
      receivers: ScriptReceiverFactory
    ): DependencyLoader = {
      val __obj = js.Dynamic.literal(getPath = js.Any.fromFunction2(getPath), getRoot = js.Any.fromFunction1(getRoot), load = js.Any.fromFunction3((t0: String, t1: Any, t2: js.Function) => (load(t0, t1, t2)).runNow()), loading = loading.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], receivers = receivers.asInstanceOf[js.Any])
      __obj.asInstanceOf[DependencyLoader]
    }
    
    extension [Self <: DependencyLoader](x: Self) {
      
      inline def setGetPath(value: (String, Any) => String): Self = StObject.set(x, "getPath", js.Any.fromFunction2(value))
      
      inline def setGetRoot(value: Any => String): Self = StObject.set(x, "getRoot", js.Any.fromFunction1(value))
      
      inline def setLoad(value: (String, Any, js.Function) => Callback): Self = StObject.set(x, "load", js.Any.fromFunction3((t0: String, t1: Any, t2: js.Function) => (value(t0, t1, t2)).runNow()))
      
      inline def setLoading(value: Any): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setReceivers(value: ScriptReceiverFactory): Self = StObject.set(x, "receivers", value.asInstanceOf[js.Any])
    }
  }
}
