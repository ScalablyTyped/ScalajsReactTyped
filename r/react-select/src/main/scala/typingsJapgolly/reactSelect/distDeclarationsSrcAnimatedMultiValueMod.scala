package typingsJapgolly.reactSelect

import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactSelect.distDeclarationsSrcComponentsMultiValueMod.MultiValueProps
import typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.GroupBase
import typingsJapgolly.reactTransitionGroup.transitionMod.TransitionProps
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcAnimatedMultiValueMod {
  
  @JSImport("react-select/dist/declarations/src/animated/MultiValue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(WrappedComponent: MultiValueComponent): js.Function1[
    /* hasInPropOnExitedProps */ AnimatedMultiValueProps[Any, Boolean, GroupBase[Any]], 
    Element
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(WrappedComponent.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* hasInPropOnExitedProps */ AnimatedMultiValueProps[Any, Boolean, GroupBase[Any]], 
    Element
  ]]
  
  type AnimatedMultiValueProps[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */] = (MultiValueProps[Option, IsMulti, Group]) & Partial[TransitionProps[Unit]]
  
  type MultiValueComponent = js.Function1[
    /* props */ MultiValueProps[Any, Boolean, GroupBase[Any]], 
    japgolly.scalajs.react.facade.React.Element
  ]
}
