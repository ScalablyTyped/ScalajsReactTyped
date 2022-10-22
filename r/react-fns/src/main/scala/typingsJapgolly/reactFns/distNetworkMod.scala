package typingsJapgolly.reactFns

import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactFns.distNetworkNetworkMod.NetworkProps
import typingsJapgolly.reactFns.distTypesMod.SharedRenderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNetworkMod {
  
  @JSImport("react-fns/dist/Network", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-fns/dist/Network", "Network")
  @js.native
  open class Network protected ()
    extends typingsJapgolly.reactFns.distNetworkNetworkMod.Network {
    def this(props: SharedRenderProps[NetworkProps]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SharedRenderProps[NetworkProps], context: Any) = this()
  }
  
  inline def withNetwork[Props](Component: ComponentType[Props & NetworkProps]): ComponentType[Props] = ^.asInstanceOf[js.Dynamic].applyDynamic("withNetwork")(Component.asInstanceOf[js.Any]).asInstanceOf[ComponentType[Props]]
}
