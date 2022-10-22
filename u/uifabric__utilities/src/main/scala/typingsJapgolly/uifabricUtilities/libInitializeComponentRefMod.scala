package typingsJapgolly.uifabricUtilities

import japgolly.scalajs.react.facade.React.Component
import typingsJapgolly.uifabricUtilities.libBaseComponentDottypesMod.IBaseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInitializeComponentRefMod {
  
  @JSImport("@uifabric/utilities/lib/initializeComponentRef", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def initializeComponentRef[TProps /* <: IBaseProps[Any] */, TState](obj: Component[TProps & js.Object, js.Object]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initializeComponentRef")(obj.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
