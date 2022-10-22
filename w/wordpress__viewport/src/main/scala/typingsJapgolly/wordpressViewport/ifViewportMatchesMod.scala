package typingsJapgolly.wordpressViewport

import typingsJapgolly.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ifViewportMatchesMod {
  
  @JSImport("@wordpress/viewport/if-viewport-matches", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Higher-order component creator, creating a new component which renders if
    * the viewport query is satisfied.
    *
    * @param query - Viewport query.
    *
    * @example
    * ```jsx
    * function MyMobileComponent() {
    *     return <div>I'm only rendered on mobile viewports!</div>;
    * }
    *
    * MyMobileComponent = ifViewportMatches( '< small' )( MyMobileComponent );
    * ```
    */
  // prettier-ignore
  inline def default(query: String): js.Function1[
    /* component */ ComponentType[Any], 
    /* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentType<any> extends react.react.ComponentType<infer U> ? react.react.ComponentType<U> : never */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(query.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* component */ ComponentType[Any], 
    /* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentType<any> extends react.react.ComponentType<infer U> ? react.react.ComponentType<U> : never */ js.Any
  ]]
}
