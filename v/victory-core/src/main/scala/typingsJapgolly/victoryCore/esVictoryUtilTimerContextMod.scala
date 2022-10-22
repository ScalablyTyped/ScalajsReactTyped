package typingsJapgolly.victoryCore

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.Context
import typingsJapgolly.victoryCore.anon.AnimationTimer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esVictoryUtilTimerContextMod extends Shortcut {
  
  /**
    * The React context object consumers may use to access or override the global
    * timer.
    */
  @JSImport("victory-core/es/victory-util/timer-context", JSImport.Default)
  @js.native
  val default: Context[AnimationTimer] = js.native
  
  type _To = Context[AnimationTimer]
  
  /* This means you don't have to write `default`, but can instead just say `esVictoryUtilTimerContextMod.foo` */
  override def _to: Context[AnimationTimer] = default
}
