package typingsJapgolly.expressActuator

import japgolly.scalajs.react.Callback
import typingsJapgolly.express.mod.RequestHandler
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ]]
  inline def apply(options: Options): RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ]]
  
  @JSImport("express-actuator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type CustomControllerMethod = js.Function2[/* req */ js.UndefOr[Any], /* res */ js.UndefOr[Any], Unit]
  
  trait CustomEndpoint extends StObject {
    
    /**
      * @summary Controller to be called when accessing this endpoint
      */
    def controller(): Unit
    def controller(req: Any): Unit
    def controller(req: Any, res: Any): Unit
    def controller(req: Unit, res: Any): Unit
    /**
      * @summary Controller to be called when accessing this endpoint
      */
    @JSName("controller")
    var controller_Original: CustomControllerMethod
    
    /**
      * @summary Used as endpoint `/id` or `${basePath}/id`
      */
    var id: String
  }
  object CustomEndpoint {
    
    inline def apply(controller: (/* req */ js.UndefOr[Any], /* res */ js.UndefOr[Any]) => Callback, id: String): CustomEndpoint = {
      val __obj = js.Dynamic.literal(controller = js.Any.fromFunction2((t0: /* req */ js.UndefOr[Any], t1: /* res */ js.UndefOr[Any]) => (controller(t0, t1)).runNow()), id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomEndpoint]
    }
    
    extension [Self <: CustomEndpoint](x: Self) {
      
      inline def setController(value: (/* req */ js.UndefOr[Any], /* res */ js.UndefOr[Any]) => Callback): Self = StObject.set(x, "controller", js.Any.fromFunction2((t0: /* req */ js.UndefOr[Any], t1: /* res */ js.UndefOr[Any]) => (value(t0, t1)).runNow()))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.expressActuator.expressActuatorStrings.simple
    - typingsJapgolly.expressActuator.expressActuatorStrings.full
  */
  trait InfoGitMode extends StObject
  object InfoGitMode {
    
    inline def full: typingsJapgolly.expressActuator.expressActuatorStrings.full = "full".asInstanceOf[typingsJapgolly.expressActuator.expressActuatorStrings.full]
    
    inline def simple: typingsJapgolly.expressActuator.expressActuatorStrings.simple = "simple".asInstanceOf[typingsJapgolly.expressActuator.expressActuatorStrings.simple]
  }
  
  /**
    * @summary Options for {@link Actuator} function.
    */
  trait Options extends StObject {
    
    /**
      * @summary BasePath of Actuator.
      */
    var basePath: js.UndefOr[String] = js.undefined
    
    /**
      * @summary Custom endpoints
      */
    var customEndpoints: js.UndefOr[js.Array[CustomEndpoint]] = js.undefined
    
    /**
      * @summary Extra Options to pass to info build output.
      */
    var infoBuildOptions: js.UndefOr[Record[String, Any]] = js.undefined
    
    /**
      * @summary DateFormat for info git.time output.
      */
    var infoDateFormat: js.UndefOr[String] = js.undefined
    
    /**
      * @summary infoGitMode.
      */
    var infoGitMode: js.UndefOr[InfoGitMode] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
      
      inline def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
      
      inline def setCustomEndpoints(value: js.Array[CustomEndpoint]): Self = StObject.set(x, "customEndpoints", value.asInstanceOf[js.Any])
      
      inline def setCustomEndpointsUndefined: Self = StObject.set(x, "customEndpoints", js.undefined)
      
      inline def setCustomEndpointsVarargs(value: CustomEndpoint*): Self = StObject.set(x, "customEndpoints", js.Array(value*))
      
      inline def setInfoBuildOptions(value: Record[String, Any]): Self = StObject.set(x, "infoBuildOptions", value.asInstanceOf[js.Any])
      
      inline def setInfoBuildOptionsUndefined: Self = StObject.set(x, "infoBuildOptions", js.undefined)
      
      inline def setInfoDateFormat(value: String): Self = StObject.set(x, "infoDateFormat", value.asInstanceOf[js.Any])
      
      inline def setInfoDateFormatUndefined: Self = StObject.set(x, "infoDateFormat", js.undefined)
      
      inline def setInfoGitMode(value: InfoGitMode): Self = StObject.set(x, "infoGitMode", value.asInstanceOf[js.Any])
      
      inline def setInfoGitModeUndefined: Self = StObject.set(x, "infoGitMode", js.undefined)
    }
  }
}
