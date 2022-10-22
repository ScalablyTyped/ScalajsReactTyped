package typingsJapgolly.reactThreeFiber.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactThreeFiber.anon.Children
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ErrorBoundary {
  
  inline def apply(set: js.UndefOr[js.Error] => Callback): Default[typingsJapgolly.reactThreeFiber.distDeclarationsSrcCoreUtilsMod.ErrorBoundary] = {
    val __props = js.Dynamic.literal(set = js.Any.fromFunction1((t0: js.UndefOr[js.Error]) => set(t0).runNow()))
    new Default[typingsJapgolly.reactThreeFiber.distDeclarationsSrcCoreUtilsMod.ErrorBoundary](js.Array(this.component, __props.asInstanceOf[Children]))
  }
  
  @JSImport("@react-three/fiber/dist/declarations/src/core/utils", "ErrorBoundary")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Children): Default[typingsJapgolly.reactThreeFiber.distDeclarationsSrcCoreUtilsMod.ErrorBoundary] = new Default[typingsJapgolly.reactThreeFiber.distDeclarationsSrcCoreUtilsMod.ErrorBoundary](js.Array(this.component, p.asInstanceOf[js.Any]))
}
