package typingsJapgolly.rcMotion

import org.scalajs.dom.HTMLElement
import typingsJapgolly.rcMotion.esCssmotionMod.CSSMotionProps
import typingsJapgolly.rcMotion.esInterfaceMod.MotionStatus
import typingsJapgolly.rcMotion.esInterfaceMod.StepStatus
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esHooksUseStatusMod {
  
  @JSImport("rc-motion/es/hooks/useStatus", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    supportMotion: Boolean,
    visible: Boolean,
    getElement: js.Function0[HTMLElement],
    hasMotionEnterMotionAppearMotionLeaveMotionDeadlineMotionLeaveImmediatelyOnAppearPrepareOnEnterPrepareOnLeavePrepareOnAppearStartOnEnterStartOnLeaveStartOnAppearActiveOnEnterActiveOnLeaveActiveOnAppearEndOnEnterEndOnLeaveEndOnVisibleChanged: CSSMotionProps
  ): js.Tuple4[MotionStatus, StepStatus, CSSProperties, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(supportMotion.asInstanceOf[js.Any], visible.asInstanceOf[js.Any], getElement.asInstanceOf[js.Any], hasMotionEnterMotionAppearMotionLeaveMotionDeadlineMotionLeaveImmediatelyOnAppearPrepareOnEnterPrepareOnLeavePrepareOnAppearStartOnEnterStartOnLeaveStartOnAppearActiveOnEnterActiveOnLeaveActiveOnAppearEndOnEnterEndOnLeaveEndOnVisibleChanged.asInstanceOf[js.Any])).asInstanceOf[js.Tuple4[MotionStatus, StepStatus, CSSProperties, Boolean]]
}
