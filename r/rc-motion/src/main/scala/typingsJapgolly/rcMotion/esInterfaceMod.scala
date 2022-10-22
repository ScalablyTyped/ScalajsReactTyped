package typingsJapgolly.rcMotion

import org.scalajs.dom.HTMLElement
import typingsJapgolly.rcMotion.rcMotionStrings.active
import typingsJapgolly.rcMotion.rcMotionStrings.appear
import typingsJapgolly.rcMotion.rcMotionStrings.end
import typingsJapgolly.rcMotion.rcMotionStrings.enter
import typingsJapgolly.rcMotion.rcMotionStrings.leave
import typingsJapgolly.rcMotion.rcMotionStrings.none
import typingsJapgolly.rcMotion.rcMotionStrings.prepare
import typingsJapgolly.rcMotion.rcMotionStrings.start
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esInterfaceMod {
  
  @JSImport("rc-motion/es/interface", "STATUS_APPEAR")
  @js.native
  val STATUS_APPEAR: appear = js.native
  
  @JSImport("rc-motion/es/interface", "STATUS_ENTER")
  @js.native
  val STATUS_ENTER: enter = js.native
  
  @JSImport("rc-motion/es/interface", "STATUS_LEAVE")
  @js.native
  val STATUS_LEAVE: leave = js.native
  
  @JSImport("rc-motion/es/interface", "STATUS_NONE")
  @js.native
  val STATUS_NONE: none = js.native
  
  @JSImport("rc-motion/es/interface", "STEP_ACTIVATED")
  @js.native
  val STEP_ACTIVATED: end = js.native
  
  @JSImport("rc-motion/es/interface", "STEP_ACTIVE")
  @js.native
  val STEP_ACTIVE: active = js.native
  
  @JSImport("rc-motion/es/interface", "STEP_NONE")
  @js.native
  val STEP_NONE: none = js.native
  
  @JSImport("rc-motion/es/interface", "STEP_PREPARE")
  @js.native
  val STEP_PREPARE: prepare = js.native
  
  @JSImport("rc-motion/es/interface", "STEP_START")
  @js.native
  val STEP_START: start = js.native
  
  type MotionEndEventHandler = js.Function2[/* element */ HTMLElement, /* event */ MotionEvent, Boolean | Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.rcMotion.anon.TransitionEventdeadlinebo
    - typingsJapgolly.rcMotion.anon.AnimationEventdeadlineboo
  */
  trait MotionEvent extends StObject
  
  type MotionEventHandler = js.Function2[/* element */ HTMLElement, /* event */ MotionEvent, CSSProperties | Unit]
  
  type MotionPrepareEventHandler = js.Function1[/* element */ HTMLElement, js.Promise[Any] | Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.rcMotion.rcMotionStrings.none
    - typingsJapgolly.rcMotion.rcMotionStrings.appear
    - typingsJapgolly.rcMotion.rcMotionStrings.enter
    - typingsJapgolly.rcMotion.rcMotionStrings.leave
  */
  trait MotionStatus extends StObject
  object MotionStatus {
    
    inline def appear: typingsJapgolly.rcMotion.rcMotionStrings.appear = "appear".asInstanceOf[typingsJapgolly.rcMotion.rcMotionStrings.appear]
    
    inline def enter: typingsJapgolly.rcMotion.rcMotionStrings.enter = "enter".asInstanceOf[typingsJapgolly.rcMotion.rcMotionStrings.enter]
    
    inline def leave: typingsJapgolly.rcMotion.rcMotionStrings.leave = "leave".asInstanceOf[typingsJapgolly.rcMotion.rcMotionStrings.leave]
    
    inline def none: typingsJapgolly.rcMotion.rcMotionStrings.none = "none".asInstanceOf[typingsJapgolly.rcMotion.rcMotionStrings.none]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.rcMotion.rcMotionStrings.none
    - typingsJapgolly.rcMotion.rcMotionStrings.prepare
    - typingsJapgolly.rcMotion.rcMotionStrings.start
    - typingsJapgolly.rcMotion.rcMotionStrings.active
    - typingsJapgolly.rcMotion.rcMotionStrings.end
  */
  trait StepStatus extends StObject
  object StepStatus {
    
    inline def active: typingsJapgolly.rcMotion.rcMotionStrings.active = "active".asInstanceOf[typingsJapgolly.rcMotion.rcMotionStrings.active]
    
    inline def end: typingsJapgolly.rcMotion.rcMotionStrings.end = "end".asInstanceOf[typingsJapgolly.rcMotion.rcMotionStrings.end]
    
    inline def none: typingsJapgolly.rcMotion.rcMotionStrings.none = "none".asInstanceOf[typingsJapgolly.rcMotion.rcMotionStrings.none]
    
    inline def prepare: typingsJapgolly.rcMotion.rcMotionStrings.prepare = "prepare".asInstanceOf[typingsJapgolly.rcMotion.rcMotionStrings.prepare]
    
    inline def start: typingsJapgolly.rcMotion.rcMotionStrings.start = "start".asInstanceOf[typingsJapgolly.rcMotion.rcMotionStrings.start]
  }
}
