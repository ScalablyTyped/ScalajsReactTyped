package typingsJapgolly.reactMdTransition

import org.scalajs.dom.HTMLElement
import typingsJapgolly.reactMdTransition.typesTypesMod.TransitionHookOptions
import typingsJapgolly.reactMdTransition.typesTypesMod.TransitionHookReturnValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUseTransitionMod {
  
  @JSImport("@react-md/transition/types/useTransition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useTransition[E /* <: HTMLElement */](
    hasNodeRefTimeoutTransitionInReflowTemporaryAppearEnterExitOnEnterOnEnteringOnEnteredOnExitOnExitingOnExited: TransitionHookOptions[E]
  ): TransitionHookReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTransition")(hasNodeRefTimeoutTransitionInReflowTemporaryAppearEnterExitOnEnterOnEnteringOnEnteredOnExitOnExitingOnExited.asInstanceOf[js.Any]).asInstanceOf[TransitionHookReturnValue[E]]
}
