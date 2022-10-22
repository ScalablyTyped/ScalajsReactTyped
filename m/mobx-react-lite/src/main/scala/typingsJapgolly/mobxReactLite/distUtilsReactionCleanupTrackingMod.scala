package typingsJapgolly.mobxReactLite

import typingsJapgolly.mobx.mod.Reaction_
import typingsJapgolly.mobxReactLite.distUtilsReactionCleanupTrackingCommonMod.IReactionTracking
import typingsJapgolly.react.mod.MutableRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsReactionCleanupTrackingMod {
  
  @JSImport("mobx-react-lite/dist/utils/reactionCleanupTracking", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* import warning: parser.TsParser#tsDeclVar Dropped IArray(recordReactionAsCommitted, resetCleanupScheduleForTests, forceCleanupTimerToRunNowForTests) */ inline def addReactionToTrack(
    reactionTrackingRef: MutableRefObject[IReactionTracking | Null],
    reaction: Reaction_,
    objectRetainedByReact: js.Object
  ): IReactionTracking = (^.asInstanceOf[js.Dynamic].applyDynamic("addReactionToTrack")(reactionTrackingRef.asInstanceOf[js.Any], reaction.asInstanceOf[js.Any], objectRetainedByReact.asInstanceOf[js.Any])).asInstanceOf[IReactionTracking]
}
