package typingsJapgolly.mobxReactLite

import japgolly.scalajs.react.Callback
import typingsJapgolly.mobx.mod.Reaction_
import typingsJapgolly.react.mod.MutableRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsReactionCleanupTrackingCommonMod {
  
  @JSImport("mobx-react-lite/dist/utils/reactionCleanupTrackingCommon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mobx-react-lite/dist/utils/reactionCleanupTrackingCommon", "CLEANUP_LEAKED_REACTIONS_AFTER_MILLIS")
  @js.native
  val CLEANUP_LEAKED_REACTIONS_AFTER_MILLIS: /* 10000 */ Double = js.native
  
  @JSImport("mobx-react-lite/dist/utils/reactionCleanupTrackingCommon", "CLEANUP_TIMER_LOOP_MILLIS")
  @js.native
  val CLEANUP_TIMER_LOOP_MILLIS: /* 10000 */ Double = js.native
  
  inline def createTrackingData(reaction: Reaction_): IReactionTracking = ^.asInstanceOf[js.Dynamic].applyDynamic("createTrackingData")(reaction.asInstanceOf[js.Any]).asInstanceOf[IReactionTracking]
  
  trait IReactionTracking extends StObject {
    
    /**
      * Whether the observables that the component is tracking changed between
      * the first render and the first useEffect.
      */
    var changedBeforeMount: Boolean
    
    /**
      * The time (in ticks) at which point we should dispose of the reaction
      * if this component hasn't yet been fully mounted.
      */
    var cleanAt: Double
    
    /**
      * In case we are using finalization registry based cleanup,
      * this will hold the cleanup token associated with this reaction
      */
    var finalizationRegistryCleanupToken: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether the component has yet completed mounting (for us, whether
      * its useEffect has run)
      */
    var mounted: Boolean
    
    /** The Reaction created during first render, which may be leaked */
    var reaction: Reaction_
  }
  object IReactionTracking {
    
    inline def apply(changedBeforeMount: Boolean, cleanAt: Double, mounted: Boolean, reaction: Reaction_): IReactionTracking = {
      val __obj = js.Dynamic.literal(changedBeforeMount = changedBeforeMount.asInstanceOf[js.Any], cleanAt = cleanAt.asInstanceOf[js.Any], mounted = mounted.asInstanceOf[js.Any], reaction = reaction.asInstanceOf[js.Any])
      __obj.asInstanceOf[IReactionTracking]
    }
    
    extension [Self <: IReactionTracking](x: Self) {
      
      inline def setChangedBeforeMount(value: Boolean): Self = StObject.set(x, "changedBeforeMount", value.asInstanceOf[js.Any])
      
      inline def setCleanAt(value: Double): Self = StObject.set(x, "cleanAt", value.asInstanceOf[js.Any])
      
      inline def setFinalizationRegistryCleanupToken(value: Double): Self = StObject.set(x, "finalizationRegistryCleanupToken", value.asInstanceOf[js.Any])
      
      inline def setFinalizationRegistryCleanupTokenUndefined: Self = StObject.set(x, "finalizationRegistryCleanupToken", js.undefined)
      
      inline def setMounted(value: Boolean): Self = StObject.set(x, "mounted", value.asInstanceOf[js.Any])
      
      inline def setReaction(value: Reaction_): Self = StObject.set(x, "reaction", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReactionCleanupTracking extends StObject {
    
    /**
      *
      * @param reaction The reaction to cleanup
      * @param objectRetainedByReact This will be in actual use only when FinalizationRegister is in use
      */
    def addReactionToTrack(
      reactionTrackingRef: MutableRefObject[IReactionTracking | Null],
      reaction: Reaction_,
      objectRetainedByReact: js.Object
    ): IReactionTracking
    
    def forceCleanupTimerToRunNowForTests(): Unit
    
    def recordReactionAsCommitted(reactionRef: MutableRefObject[IReactionTracking | Null]): Unit
    
    def resetCleanupScheduleForTests(): Unit
  }
  object ReactionCleanupTracking {
    
    inline def apply(
      addReactionToTrack: (MutableRefObject[IReactionTracking | Null], Reaction_, js.Object) => IReactionTracking,
      forceCleanupTimerToRunNowForTests: Callback,
      recordReactionAsCommitted: MutableRefObject[IReactionTracking | Null] => Callback,
      resetCleanupScheduleForTests: Callback
    ): ReactionCleanupTracking = {
      val __obj = js.Dynamic.literal(addReactionToTrack = js.Any.fromFunction3(addReactionToTrack), forceCleanupTimerToRunNowForTests = forceCleanupTimerToRunNowForTests.toJsFn, recordReactionAsCommitted = js.Any.fromFunction1((t0: MutableRefObject[IReactionTracking | Null]) => recordReactionAsCommitted(t0).runNow()), resetCleanupScheduleForTests = resetCleanupScheduleForTests.toJsFn)
      __obj.asInstanceOf[ReactionCleanupTracking]
    }
    
    extension [Self <: ReactionCleanupTracking](x: Self) {
      
      inline def setAddReactionToTrack(value: (MutableRefObject[IReactionTracking | Null], Reaction_, js.Object) => IReactionTracking): Self = StObject.set(x, "addReactionToTrack", js.Any.fromFunction3(value))
      
      inline def setForceCleanupTimerToRunNowForTests(value: Callback): Self = StObject.set(x, "forceCleanupTimerToRunNowForTests", value.toJsFn)
      
      inline def setRecordReactionAsCommitted(value: MutableRefObject[IReactionTracking | Null] => Callback): Self = StObject.set(x, "recordReactionAsCommitted", js.Any.fromFunction1((t0: MutableRefObject[IReactionTracking | Null]) => value(t0).runNow()))
      
      inline def setResetCleanupScheduleForTests(value: Callback): Self = StObject.set(x, "resetCleanupScheduleForTests", value.toJsFn)
    }
  }
}
