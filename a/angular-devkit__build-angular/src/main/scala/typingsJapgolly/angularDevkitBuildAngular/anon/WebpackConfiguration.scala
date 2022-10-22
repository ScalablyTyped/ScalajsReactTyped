package typingsJapgolly.angularDevkitBuildAngular.anon

import typingsJapgolly.angularDevkitBuildAngular.srcTransformsMod.ExecutionTransformer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebpackConfiguration extends StObject {
  
  var webpackConfiguration: js.UndefOr[ExecutionTransformer[typingsJapgolly.webpack.mod.Configuration]] = js.undefined
}
object WebpackConfiguration {
  
  inline def apply(): WebpackConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebpackConfiguration]
  }
  
  extension [Self <: WebpackConfiguration](x: Self) {
    
    inline def setWebpackConfiguration(
      value: typingsJapgolly.webpack.mod.Configuration => typingsJapgolly.webpack.mod.Configuration | js.Promise[typingsJapgolly.webpack.mod.Configuration]
    ): Self = StObject.set(x, "webpackConfiguration", js.Any.fromFunction1(value))
    
    inline def setWebpackConfigurationUndefined: Self = StObject.set(x, "webpackConfiguration", js.undefined)
  }
}
