package typingsJapgolly.cypress.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.cypress.Cypress.ConfigHandler
import typingsJapgolly.cypress.Cypress.DevServerConfigOptions
import typingsJapgolly.cypress.Cypress.Omit
import typingsJapgolly.cypress.Cypress.PickConfigOpt
import typingsJapgolly.cypress.cypressStrings.base_
import typingsJapgolly.cypress.cypressStrings.react
import typingsJapgolly.cypress.cypressStrings.root
import typingsJapgolly.cypress.cypressStrings.svelte
import typingsJapgolly.cypress.cypressStrings.vite
import typingsJapgolly.cypress.cypressStrings.viteConfig
import typingsJapgolly.cypress.cypressStrings.vue
import typingsJapgolly.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Framework
  extends StObject
     with DevServerConfigOptions {
  
  var bundler: vite
  
  var framework: react | vue | svelte
  
  var viteConfig: js.UndefOr[
    ConfigHandler[
      Omit[
        Exclude[PickConfigOpt[typingsJapgolly.cypress.cypressStrings.viteConfig], Unit], 
        base_ | root
      ]
    ]
  ] = js.undefined
}
object Framework {
  
  inline def apply(framework: react | vue | svelte): Framework = {
    val __obj = js.Dynamic.literal(bundler = "vite", framework = framework.asInstanceOf[js.Any])
    __obj.asInstanceOf[Framework]
  }
  
  extension [Self <: Framework](x: Self) {
    
    inline def setBundler(value: vite): Self = StObject.set(x, "bundler", value.asInstanceOf[js.Any])
    
    inline def setFramework(value: react | vue | svelte): Self = StObject.set(x, "framework", value.asInstanceOf[js.Any])
    
    inline def setViteConfig(value: ConfigHandler[Omit[Exclude[PickConfigOpt[viteConfig], Unit], base_ | root]]): Self = StObject.set(x, "viteConfig", value.asInstanceOf[js.Any])
    
    inline def setViteConfigCallbackTo(
      value: CallbackTo[
          (Omit[Exclude[PickConfigOpt[viteConfig], Unit], base_ | root]) | (js.Promise[Omit[Exclude[PickConfigOpt[viteConfig], Unit], base_ | root]])
        ]
    ): Self = StObject.set(x, "viteConfig", value.toJsFn)
    
    inline def setViteConfigUndefined: Self = StObject.set(x, "viteConfig", js.undefined)
  }
}
