package typingsJapgolly.expo

import japgolly.scalajs.react.facade.React.ComponentClassP
import typingsJapgolly.expo.buildLaunchWithExpoRootDottypesMod.InitialProps
import typingsJapgolly.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildLaunchWithExpoRootDotwebMod {
  
  @JSImport("expo/build/launch/withExpoRoot.web", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[P /* <: InitialProps */](AppRootComponent: ComponentType[P]): ComponentClassP[P & js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(AppRootComponent.asInstanceOf[js.Any]).asInstanceOf[ComponentClassP[P & js.Object]]
}
