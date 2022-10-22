package typingsJapgolly.angularRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Identifies the call or event that triggered a navigation.
  *
  * * 'imperative': Triggered by `router.navigateByUrl()` or `router.navigate()`.
  * * 'popstate' : Triggered by a `popstate` event.
  * * 'hashchange'-: Triggered by a `hashchange` event.
  *
  * @publicApi
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.angularRouter.angularRouterStrings.imperative
  - typingsJapgolly.angularRouter.angularRouterStrings.popstate
  - typingsJapgolly.angularRouter.angularRouterStrings.hashchange
*/
trait NavigationTrigger extends StObject
object NavigationTrigger {
  
  inline def hashchange: typingsJapgolly.angularRouter.angularRouterStrings.hashchange = "hashchange".asInstanceOf[typingsJapgolly.angularRouter.angularRouterStrings.hashchange]
  
  inline def imperative: typingsJapgolly.angularRouter.angularRouterStrings.imperative = "imperative".asInstanceOf[typingsJapgolly.angularRouter.angularRouterStrings.imperative]
  
  inline def popstate: typingsJapgolly.angularRouter.angularRouterStrings.popstate = "popstate".asInstanceOf[typingsJapgolly.angularRouter.angularRouterStrings.popstate]
}
