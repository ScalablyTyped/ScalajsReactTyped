package typingsJapgolly.angularDevkitBuildAngular.anon

import typingsJapgolly.angularDevkitBuildAngular.srcBuildersKarmaMod.KarmaConfigOptions
import typingsJapgolly.angularDevkitBuildAngular.srcTransformsMod.ExecutionTransformer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KarmaOptions extends StObject {
  
  var karmaOptions: js.UndefOr[js.Function1[/* options */ KarmaConfigOptions, KarmaConfigOptions]] = js.undefined
  
  var webpackConfiguration: js.UndefOr[ExecutionTransformer[typingsJapgolly.webpack.mod.Configuration]] = js.undefined
}
object KarmaOptions {
  
  inline def apply(): KarmaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KarmaOptions]
  }
  
  extension [Self <: KarmaOptions](x: Self) {
    
    inline def setKarmaOptions(value: /* options */ KarmaConfigOptions => KarmaConfigOptions): Self = StObject.set(x, "karmaOptions", js.Any.fromFunction1(value))
    
    inline def setKarmaOptionsUndefined: Self = StObject.set(x, "karmaOptions", js.undefined)
    
    inline def setWebpackConfiguration(
      value: typingsJapgolly.webpack.mod.Configuration => typingsJapgolly.webpack.mod.Configuration | js.Promise[typingsJapgolly.webpack.mod.Configuration]
    ): Self = StObject.set(x, "webpackConfiguration", js.Any.fromFunction1(value))
    
    inline def setWebpackConfigurationUndefined: Self = StObject.set(x, "webpackConfiguration", js.undefined)
  }
}
