package typingsJapgolly.reactSpringCore

import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactSpringCore.anon.Children
import typingsJapgolly.reactSpringCore.anon.To
import typingsJapgolly.reactSpringCore.anon.ToState
import typingsJapgolly.reactSpringCore.distDeclarationsSrcHooksUseSpringMod.UseSpringProps
import typingsJapgolly.reactSpringCore.reactSpringCoreStrings.from
import typingsJapgolly.reactSpringCore.reactSpringCoreStrings.to
import typingsJapgolly.reactSpringTypes.utilMod.NoInfer
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcComponentsSpringMod {
  
  @JSImport("@react-spring/core/dist/declarations/src/components/Spring", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Spring[State /* <: js.Object */](props: To[State] & (Omit[SpringComponentProps[NoInfer[State]], from | to])): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Spring")(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  inline def Spring_to[State /* <: js.Object */](props: ToState[State] & (Omit[SpringComponentProps[NoInfer[State]], to])): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Spring")(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  type SpringComponentProps[State /* <: js.Object */] = Any & UseSpringProps[State] & Children[State]
}
