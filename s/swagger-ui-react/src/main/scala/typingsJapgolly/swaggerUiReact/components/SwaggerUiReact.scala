package typingsJapgolly.swaggerUiReact.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.swaggerUiReact.mod.Plugin
import typingsJapgolly.swaggerUiReact.mod.Preset
import typingsJapgolly.swaggerUiReact.mod.Request
import typingsJapgolly.swaggerUiReact.mod.Response
import typingsJapgolly.swaggerUiReact.mod.SwaggerUIProps
import typingsJapgolly.swaggerUiReact.mod.System
import typingsJapgolly.swaggerUiReact.mod.default
import typingsJapgolly.swaggerUiReact.swaggerUiReactStrings.example
import typingsJapgolly.swaggerUiReact.swaggerUiReactStrings.full
import typingsJapgolly.swaggerUiReact.swaggerUiReactStrings.list
import typingsJapgolly.swaggerUiReact.swaggerUiReactStrings.model
import typingsJapgolly.swaggerUiReact.swaggerUiReactStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SwaggerUiReact {
  
  @JSImport("swagger-ui-react", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def deepLinking(value: Boolean): this.type = set("deepLinking", value.asInstanceOf[js.Any])
    
    inline def defaultModelExpandDepth(value: Double): this.type = set("defaultModelExpandDepth", value.asInstanceOf[js.Any])
    
    inline def defaultModelRendering(value: example | model): this.type = set("defaultModelRendering", value.asInstanceOf[js.Any])
    
    inline def defaultModelsExpandDepth(value: Double): this.type = set("defaultModelsExpandDepth", value.asInstanceOf[js.Any])
    
    inline def displayOperationId(value: Boolean): this.type = set("displayOperationId", value.asInstanceOf[js.Any])
    
    inline def displayRequestDuration(value: Boolean): this.type = set("displayRequestDuration", value.asInstanceOf[js.Any])
    
    inline def docExpansion(value: list | full | none): this.type = set("docExpansion", value.asInstanceOf[js.Any])
    
    inline def filter(value: String | Boolean): this.type = set("filter", value.asInstanceOf[js.Any])
    
    inline def layout(value: String): this.type = set("layout", value.asInstanceOf[js.Any])
    
    inline def onComplete(value: /* system */ System => Callback): this.type = set("onComplete", js.Any.fromFunction1((t0: /* system */ System) => value(t0).runNow()))
    
    inline def persistAuthorization(value: Boolean): this.type = set("persistAuthorization", value.asInstanceOf[js.Any])
    
    inline def plugins(value: js.Array[Plugin]): this.type = set("plugins", value.asInstanceOf[js.Any])
    
    inline def pluginsVarargs(value: Plugin*): this.type = set("plugins", js.Array(value*))
    
    inline def presets(value: js.Array[Preset]): this.type = set("presets", value.asInstanceOf[js.Any])
    
    inline def presetsVarargs(value: Preset*): this.type = set("presets", js.Array(value*))
    
    inline def queryConfigEnabled(value: Boolean): this.type = set("queryConfigEnabled", value.asInstanceOf[js.Any])
    
    inline def requestInterceptor(value: /* req */ Request => Request | js.Promise[Request]): this.type = set("requestInterceptor", js.Any.fromFunction1(value))
    
    inline def requestSnippets(value: js.Object): this.type = set("requestSnippets", value.asInstanceOf[js.Any])
    
    inline def requestSnippetsEnabled(value: Boolean): this.type = set("requestSnippetsEnabled", value.asInstanceOf[js.Any])
    
    inline def responseInterceptor(value: /* res */ Response => Response | js.Promise[Response]): this.type = set("responseInterceptor", js.Any.fromFunction1(value))
    
    inline def showExtensions(value: Boolean): this.type = set("showExtensions", value.asInstanceOf[js.Any])
    
    inline def showMutatedRequest(value: Boolean): this.type = set("showMutatedRequest", value.asInstanceOf[js.Any])
    
    inline def spec(value: js.Object | String): this.type = set("spec", value.asInstanceOf[js.Any])
    
    inline def supportedSubmitMethods(value: js.Array[String]): this.type = set("supportedSubmitMethods", value.asInstanceOf[js.Any])
    
    inline def supportedSubmitMethodsVarargs(value: String*): this.type = set("supportedSubmitMethods", js.Array(value*))
    
    inline def tryItOutEnabled(value: Boolean): this.type = set("tryItOutEnabled", value.asInstanceOf[js.Any])
    
    inline def url(value: String): this.type = set("url", value.asInstanceOf[js.Any])
    
    inline def withCredentials(value: Boolean): this.type = set("withCredentials", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: SwaggerUiReact.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SwaggerUIProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
