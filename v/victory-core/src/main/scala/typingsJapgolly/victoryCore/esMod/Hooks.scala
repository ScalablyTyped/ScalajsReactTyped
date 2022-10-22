package typingsJapgolly.victoryCore.esMod

import typingsJapgolly.victoryCore.anon.GetAnimationProps
import typingsJapgolly.victoryCore.esVictoryUtilHooksUseAnimationStateMod.AnimationState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Hooks {
  
  @JSImport("victory-core/es", "Hooks")
  @js.native
  val ^ : js.Any = js.native
  
  inline def useAnimationState(): GetAnimationProps = ^.asInstanceOf[js.Dynamic].applyDynamic("useAnimationState")().asInstanceOf[GetAnimationProps]
  inline def useAnimationState(initialState: AnimationState): GetAnimationProps = ^.asInstanceOf[js.Dynamic].applyDynamic("useAnimationState")(initialState.asInstanceOf[js.Any]).asInstanceOf[GetAnimationProps]
  
  inline def usePreviousProps[T](props: T): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("usePreviousProps")(props.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
}
