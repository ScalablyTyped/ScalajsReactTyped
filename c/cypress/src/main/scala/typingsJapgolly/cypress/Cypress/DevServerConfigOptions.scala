package typingsJapgolly.cypress.Cypress

import typingsJapgolly.cypress.cypressStrings.`create-react-app`
import typingsJapgolly.cypress.cypressStrings.`vue-cli`
import typingsJapgolly.cypress.cypressStrings.next
import typingsJapgolly.cypress.cypressStrings.nuxt
import typingsJapgolly.cypress.cypressStrings.react
import typingsJapgolly.cypress.cypressStrings.svelte
import typingsJapgolly.cypress.cypressStrings.vue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.cypress.anon.Bundler
  - typingsJapgolly.cypress.anon.Framework
  - typingsJapgolly.cypress.anon.Options
*/
trait DevServerConfigOptions extends StObject
object DevServerConfigOptions {
  
  inline def Bundler(framework: react | vue | `vue-cli` | nuxt | `create-react-app` | next | svelte): typingsJapgolly.cypress.anon.Bundler = {
    val __obj = js.Dynamic.literal(bundler = "webpack", framework = framework.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.cypress.anon.Bundler]
  }
  
  inline def Framework(framework: react | vue | svelte): typingsJapgolly.cypress.anon.Framework = {
    val __obj = js.Dynamic.literal(bundler = "vite", framework = framework.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.cypress.anon.Framework]
  }
  
  inline def Options(): typingsJapgolly.cypress.anon.Options = {
    val __obj = js.Dynamic.literal(bundler = "webpack", framework = "angular")
    __obj.asInstanceOf[typingsJapgolly.cypress.anon.Options]
  }
}
