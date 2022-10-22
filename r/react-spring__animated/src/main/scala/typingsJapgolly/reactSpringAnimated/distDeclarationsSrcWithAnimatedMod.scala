package typingsJapgolly.reactSpringAnimated

import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactSpringAnimated.distDeclarationsSrcCreateHostMod.HostConfig
import typingsJapgolly.reactSpringTypes.utilMod.ElementType
import typingsJapgolly.std.Exclude
import typingsJapgolly.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcWithAnimatedMod {
  
  @JSImport("@react-spring/animated/dist/declarations/src/withAnimated", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def withAnimated(Component: Any, host: HostConfig): ForwardRefExoticComponent[(Pick[Any, String | Double | js.Symbol]) & RefAttributes[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("withAnimated")(Component.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[(Pick[Any, String | Double | js.Symbol]) & RefAttributes[Any]]]
  
  type AnimatableComponent = String | (Exclude[ElementType[Any], String])
}
