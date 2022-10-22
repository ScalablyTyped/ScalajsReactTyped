package typingsJapgolly.reactSelect

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.reactSelect.distDeclarationsSrcComponentsInputMod.InputProps
import typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.GroupBase
import typingsJapgolly.reactTransitionGroup.transitionMod.TransitionProps
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcAnimatedInputMod {
  
  @JSImport("react-select/dist/declarations/src/animated/Input", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(WrappedComponent: InputComponent): InputComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(WrappedComponent.asInstanceOf[js.Any]).asInstanceOf[InputComponent]
  
  type AnimatedInputProps[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */] = (InputProps[Option, IsMulti, Group]) & Partial[TransitionProps[Unit]]
  
  type InputComponent = js.Function1[/* props */ InputProps[Any, Boolean, GroupBase[Any]], Element]
}
