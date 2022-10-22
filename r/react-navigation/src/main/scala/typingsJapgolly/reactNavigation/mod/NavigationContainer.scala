package typingsJapgolly.reactNavigation.mod

import typingsJapgolly.react.mod.ComponentClass
import typingsJapgolly.reactNavigation.anon.Nav
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationContainer
  extends StObject
     with ComponentClass[
      (NavigationContainerProps[js.Object, js.Object, Any]) & (NavigationNavigatorProps[Any, js.Object, Any]), 
      js.Object
    ] {
  
  var navigationOptions: Any = js.native
  
  var router: NavigationRouter[Any, Any] = js.native
  
  var screenProps: Any = js.native
  
  var state: Nav = js.native
}
