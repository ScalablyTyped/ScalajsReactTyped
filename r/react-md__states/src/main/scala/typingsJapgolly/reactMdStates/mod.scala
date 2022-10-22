package typingsJapgolly.reactMdStates

import japgolly.scalajs.react.facade.React.Element
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.Context
import typingsJapgolly.reactMdStates.typesStatesConfigMod.StatesConfigContextType
import typingsJapgolly.reactMdStates.typesStatesConfigMod.StatesConfigProps
import typingsJapgolly.reactMdStates.typesUseInteractionStatesMod.InteractionStatesOptions
import typingsJapgolly.reactMdStates.typesUseInteractionStatesMod.ReturnValue
import typingsJapgolly.reactMdTransition.typesTypesMod.CSSTransitionClassNames
import typingsJapgolly.reactMdTransition.typesTypesMod.TransitionTimeout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-md/states", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-md/states", "DEFAULT_RIPPLE_CLASSNAMES")
  @js.native
  val DEFAULT_RIPPLE_CLASSNAMES: CSSTransitionClassNames = js.native
  
  @JSImport("@react-md/states", "DEFAULT_RIPPLE_TIMEOUT")
  @js.native
  val DEFAULT_RIPPLE_TIMEOUT: TransitionTimeout = js.native
  
  inline def StatesConfig(hasRippleTimeoutRippleClassNamesDisableRippleDisableProgrammaticRippleChildren: StatesConfigProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("StatesConfig")(hasRippleTimeoutRippleClassNamesDisableRippleDisableProgrammaticRippleChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@react-md/states", "StatesConfigContext")
  @js.native
  val StatesConfigContext: Context[StatesConfigContextType] = js.native
  
  inline def useInteractionStates[E /* <: HTMLElement */](): ReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useInteractionStates")().asInstanceOf[ReturnValue[E]]
  inline def useInteractionStates[E /* <: HTMLElement */](options: InteractionStatesOptions[E]): ReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useInteractionStates")(options.asInstanceOf[js.Any]).asInstanceOf[ReturnValue[E]]
  
  inline def useStatesConfigContext(): StatesConfigContextType = ^.asInstanceOf[js.Dynamic].applyDynamic("useStatesConfigContext")().asInstanceOf[StatesConfigContextType]
}
