package typingsJapgolly.cypress.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.cypress.Cypress.ConfigHandler
import typingsJapgolly.cypress.Cypress.DevServerConfigOptions
import typingsJapgolly.cypress.Cypress.PickConfigOpt
import typingsJapgolly.cypress.cypressStrings.`create-react-app`
import typingsJapgolly.cypress.cypressStrings.`vue-cli`
import typingsJapgolly.cypress.cypressStrings.next
import typingsJapgolly.cypress.cypressStrings.nuxt
import typingsJapgolly.cypress.cypressStrings.react
import typingsJapgolly.cypress.cypressStrings.svelte
import typingsJapgolly.cypress.cypressStrings.vue
import typingsJapgolly.cypress.cypressStrings.webpack
import typingsJapgolly.cypress.cypressStrings.webpackConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bundler
  extends StObject
     with DevServerConfigOptions {
  
  var bundler: webpack
  
  var framework: react | vue | `vue-cli` | nuxt | `create-react-app` | next | svelte
  
  var webpackConfig: js.UndefOr[
    ConfigHandler[PickConfigOpt[typingsJapgolly.cypress.cypressStrings.webpackConfig]]
  ] = js.undefined
}
object Bundler {
  
  inline def apply(framework: react | vue | `vue-cli` | nuxt | `create-react-app` | next | svelte): Bundler = {
    val __obj = js.Dynamic.literal(bundler = "webpack", framework = framework.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bundler]
  }
  
  extension [Self <: Bundler](x: Self) {
    
    inline def setBundler(value: webpack): Self = StObject.set(x, "bundler", value.asInstanceOf[js.Any])
    
    inline def setFramework(value: react | vue | `vue-cli` | nuxt | `create-react-app` | next | svelte): Self = StObject.set(x, "framework", value.asInstanceOf[js.Any])
    
    inline def setWebpackConfig(value: ConfigHandler[PickConfigOpt[webpackConfig]]): Self = StObject.set(x, "webpackConfig", value.asInstanceOf[js.Any])
    
    inline def setWebpackConfigCallbackTo(value: CallbackTo[PickConfigOpt[webpackConfig] | js.Promise[PickConfigOpt[webpackConfig]]]): Self = StObject.set(x, "webpackConfig", value.toJsFn)
    
    inline def setWebpackConfigUndefined: Self = StObject.set(x, "webpackConfig", js.undefined)
  }
}
