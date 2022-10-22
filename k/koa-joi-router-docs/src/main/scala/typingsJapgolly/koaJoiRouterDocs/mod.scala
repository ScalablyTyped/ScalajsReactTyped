package typingsJapgolly.koaJoiRouterDocs

import japgolly.scalajs.react.Callback
import typingsJapgolly.koaJoiRouter.mod.Router
import typingsJapgolly.koaJoiRouterDocs.anon.Description
import typingsJapgolly.koaJoiRouterDocs.anon.Name
import typingsJapgolly.koaJoiRouterDocs.mod.koaJoiRouterDocs.RouterOptions
import typingsJapgolly.koaJoiRouterDocs.mod.koaJoiRouterDocs.SpecConfig
import typingsJapgolly.koaJoiRouterDocs.mod.koaJoiRouterDocs.SpecOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("koa-joi-router-docs", "SwaggerAPI")
  @js.native
  open class SwaggerAPI () extends StObject {
    
    def addJoiRouter(router: Router): Any = js.native
    def addJoiRouter(router: Router, options: RouterOptions): Any = js.native
    
    def generateSpec(config: SpecConfig): js.Object = js.native
    def generateSpec(config: SpecConfig, options: SpecOptions): js.Object = js.native
  }
  
  object koaJoiRouterDocs {
    
    type RouterOptions = js.Object | String
    
    trait SpecConfig extends StObject {
      
      var basePath: String
      
      var info: Description
      
      var tags: js.Array[Name]
    }
    object SpecConfig {
      
      inline def apply(basePath: String, info: Description, tags: js.Array[Name]): SpecConfig = {
        val __obj = js.Dynamic.literal(basePath = basePath.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
        __obj.asInstanceOf[SpecConfig]
      }
      
      extension [Self <: SpecConfig](x: Self) {
        
        inline def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
        
        inline def setInfo(value: Description): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
        
        inline def setTags(value: js.Array[Name]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
        
        inline def setTagsVarargs(value: Name*): Self = StObject.set(x, "tags", js.Array(value*))
      }
    }
    
    trait SpecOptions extends StObject {
      
      var defaultResponses: js.UndefOr[js.Object] = js.undefined
      
      var warnFunc: js.UndefOr[js.Function0[Unit]] = js.undefined
    }
    object SpecOptions {
      
      inline def apply(): SpecOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SpecOptions]
      }
      
      extension [Self <: SpecOptions](x: Self) {
        
        inline def setDefaultResponses(value: js.Object): Self = StObject.set(x, "defaultResponses", value.asInstanceOf[js.Any])
        
        inline def setDefaultResponsesUndefined: Self = StObject.set(x, "defaultResponses", js.undefined)
        
        inline def setWarnFunc(value: Callback): Self = StObject.set(x, "warnFunc", value.toJsFn)
        
        inline def setWarnFuncUndefined: Self = StObject.set(x, "warnFunc", js.undefined)
      }
    }
  }
}
