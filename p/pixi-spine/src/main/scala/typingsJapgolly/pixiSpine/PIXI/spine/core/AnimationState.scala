package typingsJapgolly.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.AnimationState")
@js.native
class AnimationState protected () extends js.Object {
  def this(data: AnimationStateData) = this()
  var animationsChanged: Boolean = js.native
  var data: AnimationStateData = js.native
  var events: js.Array[Event] = js.native
  var listeners: js.Array[AnimationStateListener] = js.native
  var propertyIDs: IntSet = js.native
  var queue: EventQueue = js.native
  var timeScale: Double = js.native
  var trackEntryPool: Pool[TrackEntry] = js.native
  var tracks: js.Array[TrackEntry] = js.native
  def _animationsChanged(): Unit = js.native
  def addAnimation(trackIndex: Double, animationName: String, loop: Boolean, delay: Double): TrackEntry = js.native
  def addAnimationByName(trackIndex: Double, animationName: String, loop: Boolean, delay: Double): Unit = js.native
  def addAnimationWith(trackIndex: Double, animation: Animation, loop: Boolean, delay: Double): TrackEntry = js.native
  def addEmptyAnimation(trackIndex: Double, mixDuration: Double, delay: Double): TrackEntry = js.native
  def addListener(listener: AnimationStateListener): Unit = js.native
  @JSName("apply")
  def apply(skeleton: Skeleton): Boolean = js.native
  def applyMixingFrom(to: TrackEntry, skeleton: Skeleton, blend: MixBlend): Double = js.native
  def applyRotateTimeline(
    timeline: Timeline,
    skeleton: Skeleton,
    time: Double,
    alpha: Double,
    blend: MixBlend,
    timelinesRotation: js.Array[Double],
    i: Double,
    firstFrame: Boolean
  ): Unit = js.native
  def clearListenerNotifications(): Unit = js.native
  def clearListeners(): Unit = js.native
  def clearTrack(trackIndex: Double): Unit = js.native
  def clearTracks(): Unit = js.native
  def computeHold(entry: TrackEntry): Unit = js.native
  def computeNotLast(entry: TrackEntry): Unit = js.native
  def disposeNext(entry: TrackEntry): Unit = js.native
  def expandToIndex(index: Double): TrackEntry = js.native
  def getCurrent(trackIndex: Double): TrackEntry = js.native
  def hasAnimation(animationName: String): Boolean = js.native
  def hasAnimationByName(animationName: String): Boolean = js.native
  def onComplete(trackIndex: Double, loopCount: Double): js.Any = js.native
  def onEnd(trackIndex: Double): js.Any = js.native
  def onEvent(trackIndex: Double, event: Event): js.Any = js.native
  def onStart(trackIndex: Double): js.Any = js.native
  def queueEvents(entry: TrackEntry, animationTime: Double): Unit = js.native
  def removeListener(listener: AnimationStateListener): Unit = js.native
  def setAnimation(trackIndex: Double, animationName: String, loop: Boolean): TrackEntry = js.native
  def setAnimationByName(trackIndex: Double, animationName: String, loop: Boolean): Unit = js.native
  def setAnimationWith(trackIndex: Double, animation: Animation, loop: Boolean): TrackEntry = js.native
  def setCurrent(index: Double, current: TrackEntry, interrupt: Boolean): Unit = js.native
  def setEmptyAnimation(trackIndex: Double, mixDuration: Double): TrackEntry = js.native
  def setEmptyAnimations(mixDuration: Double): Unit = js.native
  def trackEntry(trackIndex: Double, animation: Animation, loop: Boolean, last: TrackEntry): TrackEntry = js.native
  def update(delta: Double): Unit = js.native
  def updateMixingFrom(to: TrackEntry, delta: Double): Boolean = js.native
}

/* static members */
@JSGlobal("PIXI.spine.core.AnimationState")
@js.native
object AnimationState extends js.Object {
  var FIRST: Double = js.native
  var HOLD: Double = js.native
  var HOLD_MIX: Double = js.native
  var NOT_LAST: Double = js.native
  var SUBSEQUENT: Double = js.native
  var deprecatedWarning1: js.Any = js.native
  var deprecatedWarning2: js.Any = js.native
  var deprecatedWarning3: js.Any = js.native
  var emptyAnimation: Animation = js.native
}

