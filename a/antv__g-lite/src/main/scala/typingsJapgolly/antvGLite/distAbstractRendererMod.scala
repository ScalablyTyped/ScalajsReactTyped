package typingsJapgolly.antvGLite

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.antvGLite.anon.PartialRendererConfig
import typingsJapgolly.antvGLite.distTypesMod.RendererConfig
import typingsJapgolly.manaSyringe.libCoreMod.Syringe.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAbstractRendererMod {
  
  @JSImport("@antv/g-lite/dist/AbstractRenderer", "AbstractRenderer")
  @js.native
  open class AbstractRenderer ()
    extends StObject
       with IRenderer {
    def this(config: PartialRendererConfig) = this()
    
    /* private */ var config: Any = js.native
    
    /* CompleteClass */
    override def getConfig(): RendererConfig = js.native
    
    /**
      * get plugin by name
      */
    /* CompleteClass */
    override def getPlugin(name: String): RendererPlugin = js.native
    
    /**
      * return all registered plugins
      */
    /* CompleteClass */
    override def getPlugins(): js.Array[RendererPlugin] = js.native
    
    /* private */ var plugins: Any = js.native
    
    /**
      * register plugin at runtime
      */
    /* CompleteClass */
    override def registerPlugin(plugin: RendererPlugin): Unit = js.native
    
    def setConfig(config: PartialRendererConfig): Unit = js.native
    
    /**
      * unregister plugin at runtime
      */
    /* CompleteClass */
    override def unregisterPlugin(plugin: RendererPlugin): Unit = js.native
  }
  
  /* note: abstract class */ @JSImport("@antv/g-lite/dist/AbstractRenderer", "AbstractRendererPlugin")
  @js.native
  open class AbstractRendererPlugin ()
    extends StObject
       with RendererPlugin {
    
    /* CompleteClass */
    var container: Container = js.native
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def init(): Unit = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  trait IRenderer extends StObject {
    
    def getConfig(): RendererConfig
    
    /**
      * get plugin by name
      */
    def getPlugin(name: String): RendererPlugin
    
    /**
      * return all registered plugins
      */
    def getPlugins(): js.Array[RendererPlugin]
    
    /**
      * register plugin at runtime
      */
    def registerPlugin(plugin: RendererPlugin): Unit
    
    /**
      * unregister plugin at runtime
      */
    def unregisterPlugin(plugin: RendererPlugin): Unit
  }
  object IRenderer {
    
    inline def apply(
      getConfig: CallbackTo[RendererConfig],
      getPlugin: String => RendererPlugin,
      getPlugins: CallbackTo[js.Array[RendererPlugin]],
      registerPlugin: RendererPlugin => Callback,
      unregisterPlugin: RendererPlugin => Callback
    ): IRenderer = {
      val __obj = js.Dynamic.literal(getConfig = getConfig.toJsFn, getPlugin = js.Any.fromFunction1(getPlugin), getPlugins = getPlugins.toJsFn, registerPlugin = js.Any.fromFunction1((t0: RendererPlugin) => registerPlugin(t0).runNow()), unregisterPlugin = js.Any.fromFunction1((t0: RendererPlugin) => unregisterPlugin(t0).runNow()))
      __obj.asInstanceOf[IRenderer]
    }
    
    extension [Self <: IRenderer](x: Self) {
      
      inline def setGetConfig(value: CallbackTo[RendererConfig]): Self = StObject.set(x, "getConfig", value.toJsFn)
      
      inline def setGetPlugin(value: String => RendererPlugin): Self = StObject.set(x, "getPlugin", js.Any.fromFunction1(value))
      
      inline def setGetPlugins(value: CallbackTo[js.Array[RendererPlugin]]): Self = StObject.set(x, "getPlugins", value.toJsFn)
      
      inline def setRegisterPlugin(value: RendererPlugin => Callback): Self = StObject.set(x, "registerPlugin", js.Any.fromFunction1((t0: RendererPlugin) => value(t0).runNow()))
      
      inline def setUnregisterPlugin(value: RendererPlugin => Callback): Self = StObject.set(x, "unregisterPlugin", js.Any.fromFunction1((t0: RendererPlugin) => value(t0).runNow()))
    }
  }
  
  trait RendererPlugin extends StObject {
    
    var container: Container
    
    def destroy(): Unit
    
    def init(): Unit
    
    var name: String
  }
  object RendererPlugin {
    
    inline def apply(container: Container, destroy: Callback, init: Callback, name: String): RendererPlugin = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], destroy = destroy.toJsFn, init = init.toJsFn, name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[RendererPlugin]
    }
    
    extension [Self <: RendererPlugin](x: Self) {
      
      inline def setContainer(value: Container): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setInit(value: Callback): Self = StObject.set(x, "init", value.toJsFn)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
