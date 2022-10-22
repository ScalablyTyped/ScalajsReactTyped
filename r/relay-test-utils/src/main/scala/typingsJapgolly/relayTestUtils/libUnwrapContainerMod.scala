package typingsJapgolly.relayTestUtils

import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactRelay.reactRelayTypesMod.RelayPaginationProp
import typingsJapgolly.reactRelay.reactRelayTypesMod.RelayProp
import typingsJapgolly.reactRelay.reactRelayTypesMod.RelayRefetchProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUnwrapContainerMod {
  
  /**
    * Returns original component class wrapped by e.g. createFragmentContainer
    */
  inline def apply[Props](ComponentClass: ComponentType[Props | RelayProp | RelayPaginationProp | RelayRefetchProp]): ComponentType[Props] = ^.asInstanceOf[js.Dynamic].apply(ComponentClass.asInstanceOf[js.Any]).asInstanceOf[ComponentType[Props]]
  
  @JSImport("relay-test-utils/lib/unwrapContainer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
