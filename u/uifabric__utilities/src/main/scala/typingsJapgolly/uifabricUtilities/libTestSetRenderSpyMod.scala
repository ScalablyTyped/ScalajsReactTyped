package typingsJapgolly.uifabricUtilities

import japgolly.scalajs.react.facade.React.Component
import typingsJapgolly.enzyme.mod.ReactWrapper
import typingsJapgolly.sinon.mod.SinonSpy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTestSetRenderSpyMod {
  
  @JSImport("@uifabric/utilities/lib/test/setRenderSpy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setRenderSpy(wrapper: ReactWrapper[js.Object, js.Object, Component[js.Object, js.Object]]): SinonSpy[js.Array[Any], Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("setRenderSpy")(wrapper.asInstanceOf[js.Any]).asInstanceOf[SinonSpy[js.Array[Any], Any]]
}
