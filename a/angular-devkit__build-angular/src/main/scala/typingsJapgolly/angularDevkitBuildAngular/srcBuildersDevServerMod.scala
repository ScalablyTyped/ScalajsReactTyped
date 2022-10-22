package typingsJapgolly.angularDevkitBuildAngular

import typingsJapgolly.angularDevkitArchitect.srcApiMod.BuilderContext
import typingsJapgolly.angularDevkitArchitect.srcInternalMod.Builder
import typingsJapgolly.angularDevkitBuildAngular.anon.IndexHtml
import typingsJapgolly.angularDevkitBuildAngular.srcBuildersDevServerSchemaMod.Schema
import typingsJapgolly.angularDevkitBuildWebpack.srcWebpackDevServerMod.DevServerBuildOutput
import typingsJapgolly.angularDevkitCore.srcJsonUtilsMod.JsonObject
import typingsJapgolly.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcBuildersDevServerMod {
  
  @JSImport("@angular-devkit/build-angular/src/builders/dev-server", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular-devkit/build-angular/src/builders/dev-server", JSImport.Default)
  @js.native
  val default: Builder[Schema & JsonObject] = js.native
  
  inline def serveWebpackBrowser(options: DevServerBuilderOptions, context: BuilderContext): Observable_[DevServerBuilderOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("serveWebpackBrowser")(options.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Observable_[DevServerBuilderOutput]]
  inline def serveWebpackBrowser(options: DevServerBuilderOptions, context: BuilderContext, transforms: IndexHtml): Observable_[DevServerBuilderOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("serveWebpackBrowser")(options.asInstanceOf[js.Any], context.asInstanceOf[js.Any], transforms.asInstanceOf[js.Any])).asInstanceOf[Observable_[DevServerBuilderOutput]]
  
  type DevServerBuilderOptions = Schema
  
  trait DevServerBuilderOutput
    extends StObject
       with DevServerBuildOutput {
    
    var baseUrl: String
  }
  object DevServerBuilderOutput {
    
    inline def apply(
      address: String,
      baseUrl: String,
      family: String,
      outputPath: String,
      port: Double,
      success: Boolean
    ): DevServerBuilderOutput = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], baseUrl = baseUrl.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any], outputPath = outputPath.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
      __obj.asInstanceOf[DevServerBuilderOutput]
    }
    
    extension [Self <: DevServerBuilderOutput](x: Self) {
      
      inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
    }
  }
}
