package typingsJapgolly.serverless

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.serverless.anon.Create
import typingsJapgolly.serverless.anon.Debug
import typingsJapgolly.serverless.anon.IsDisabledAtPrepopulation
import typingsJapgolly.serverless.anon.Resolver
import typingsJapgolly.serverless.mod.Options
import typingsJapgolly.serverless.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object classesPluginMod {
  
  type Commands = StringDictionary[typingsJapgolly.serverless.anon.Commands]
  
  type ConfigurationVariablesSource = js.Function1[/* variableSource */ Any, js.Promise[Any]]
  
  type ConfigurationVariablesSources = StringDictionary[ConfigurationVariablesSource | IsDisabledAtPrepopulation]
  
  type Hooks = StringDictionary[js.Function1[/* repeated */ Any, Any]]
  
  @js.native
  trait Logging extends StObject {
    
    var log: Debug = js.native
    
    var progress: Create = js.native
    
    def writeText(text: String): Unit = js.native
    def writeText(text: js.Array[String]): Unit = js.native
  }
  
  trait Plugin extends StObject {
    
    var commands: js.UndefOr[Commands] = js.undefined
    
    var configurationVariablesSources: js.UndefOr[ConfigurationVariablesSources] = js.undefined
    
    var hooks: Hooks
    
    var variableResolvers: js.UndefOr[VariableResolvers] = js.undefined
  }
  object Plugin {
    
    inline def apply(hooks: Hooks): Plugin = {
      val __obj = js.Dynamic.literal(hooks = hooks.asInstanceOf[js.Any])
      __obj.asInstanceOf[Plugin]
    }
    
    extension [Self <: Plugin](x: Self) {
      
      inline def setCommands(value: Commands): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
      
      inline def setCommandsUndefined: Self = StObject.set(x, "commands", js.undefined)
      
      inline def setConfigurationVariablesSources(value: ConfigurationVariablesSources): Self = StObject.set(x, "configurationVariablesSources", value.asInstanceOf[js.Any])
      
      inline def setConfigurationVariablesSourcesUndefined: Self = StObject.set(x, "configurationVariablesSources", js.undefined)
      
      inline def setHooks(value: Hooks): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
      
      inline def setVariableResolvers(value: VariableResolvers): Self = StObject.set(x, "variableResolvers", value.asInstanceOf[js.Any])
      
      inline def setVariableResolversUndefined: Self = StObject.set(x, "variableResolvers", js.undefined)
    }
  }
  
  @js.native
  trait PluginStatic
    extends StObject
       with Instantiable3[/* serverless */ ^, /* options */ Options, /* logging */ Logging, Plugin]
  
  trait Progress extends StObject {
    
    def info(message: String): Unit
    
    var name: String
    
    var namespace: String
    
    def notice(message: String): Unit
    
    def remove(): Unit
    
    def update(message: String): Unit
  }
  object Progress {
    
    inline def apply(
      info: String => Callback,
      name: String,
      namespace: String,
      notice: String => Callback,
      remove: Callback,
      update: String => Callback
    ): Progress = {
      val __obj = js.Dynamic.literal(info = js.Any.fromFunction1((t0: String) => info(t0).runNow()), name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], notice = js.Any.fromFunction1((t0: String) => notice(t0).runNow()), remove = remove.toJsFn, update = js.Any.fromFunction1((t0: String) => update(t0).runNow()))
      __obj.asInstanceOf[Progress]
    }
    
    extension [Self <: Progress](x: Self) {
      
      inline def setInfo(value: String => Callback): Self = StObject.set(x, "info", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setNotice(value: String => Callback): Self = StObject.set(x, "notice", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
      
      inline def setUpdate(value: String => Callback): Self = StObject.set(x, "update", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    }
  }
  
  type VariableResolver = js.Function1[/* variableSource */ String, js.Promise[Any]]
  
  type VariableResolvers = StringDictionary[VariableResolver | Resolver]
}
