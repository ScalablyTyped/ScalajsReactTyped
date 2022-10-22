package typingsJapgolly.reactNavigation.anon

import typingsJapgolly.reactNavigation.mod.NavigationComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Screen[Options, NavigationScreenPropType] extends StObject {
  
  var screen: NavigationComponent[Options, NavigationScreenPropType]
}
object Screen {
  
  inline def apply[Options, NavigationScreenPropType](screen: NavigationComponent[Options, NavigationScreenPropType]): Screen[Options, NavigationScreenPropType] = {
    val __obj = js.Dynamic.literal(screen = screen.asInstanceOf[js.Any])
    __obj.asInstanceOf[Screen[Options, NavigationScreenPropType]]
  }
  
  extension [Self <: Screen[?, ?], Options, NavigationScreenPropType](x: Self & (Screen[Options, NavigationScreenPropType])) {
    
    inline def setScreen(value: NavigationComponent[Options, NavigationScreenPropType]): Self = StObject.set(x, "screen", value.asInstanceOf[js.Any])
  }
}
