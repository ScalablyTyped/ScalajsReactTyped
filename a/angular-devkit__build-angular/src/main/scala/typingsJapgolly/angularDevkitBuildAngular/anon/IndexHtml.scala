package typingsJapgolly.angularDevkitBuildAngular.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.angularDevkitBuildAngular.srcTransformsMod.ExecutionTransformer
import typingsJapgolly.angularDevkitBuildAngular.srcUtilsIndexFileIndexHtmlGeneratorMod.IndexHtmlTransform
import typingsJapgolly.angularDevkitBuildWebpack.srcWebpackMod.WebpackLoggingCallback
import typingsJapgolly.webpack.mod.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexHtml extends StObject {
  
  var indexHtml: js.UndefOr[IndexHtmlTransform] = js.undefined
  
  var logging: js.UndefOr[WebpackLoggingCallback] = js.undefined
  
  var webpackConfiguration: js.UndefOr[ExecutionTransformer[typingsJapgolly.webpack.mod.Configuration]] = js.undefined
}
object IndexHtml {
  
  inline def apply(): IndexHtml = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndexHtml]
  }
  
  extension [Self <: IndexHtml](x: Self) {
    
    inline def setIndexHtml(value: /* content */ String => js.Promise[String]): Self = StObject.set(x, "indexHtml", js.Any.fromFunction1(value))
    
    inline def setIndexHtmlUndefined: Self = StObject.set(x, "indexHtml", js.undefined)
    
    inline def setLogging(value: (/* stats */ Stats, /* config */ typingsJapgolly.webpack.mod.Configuration) => Callback): Self = StObject.set(x, "logging", js.Any.fromFunction2((t0: /* stats */ Stats, t1: /* config */ typingsJapgolly.webpack.mod.Configuration) => (value(t0, t1)).runNow()))
    
    inline def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
    
    inline def setWebpackConfiguration(
      value: typingsJapgolly.webpack.mod.Configuration => typingsJapgolly.webpack.mod.Configuration | js.Promise[typingsJapgolly.webpack.mod.Configuration]
    ): Self = StObject.set(x, "webpackConfiguration", js.Any.fromFunction1(value))
    
    inline def setWebpackConfigurationUndefined: Self = StObject.set(x, "webpackConfiguration", js.undefined)
  }
}
