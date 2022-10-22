package typingsJapgolly.phaser.spine

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationState extends StObject {
  
  def _animationsChanged(): Unit
  
  def addAnimation(trackIndex: Double, animationName: String, loop: Boolean, delay: Double): TrackEntry
  
  def addAnimationWith(trackIndex: Double, animation: Animation, loop: Boolean, delay: Double): TrackEntry
  
  def addEmptyAnimation(trackIndex: Double, mixDuration: Double, delay: Double): TrackEntry
  
  def addListener(listener: AnimationStateListener2): Unit
  
  var animationsChanged: Boolean
  
  @JSName("apply")
  def apply(skeleton: Skeleton): Boolean
  
  def applyMixingFrom(to: TrackEntry, skeleton: Skeleton, blend: MixBlend): Double
  
  def applyRotateTimeline(
    timeline: Timeline,
    skeleton: Skeleton,
    time: Double,
    alpha: Double,
    blend: MixBlend,
    timelinesRotation: js.Array[Double],
    i: Double,
    firstFrame: Boolean
  ): Unit
  
  def clearListenerNotifications(): Unit
  
  def clearListeners(): Unit
  
  def clearTrack(trackIndex: Double): Unit
  
  def clearTracks(): Unit
  
  def computeHold(entry: TrackEntry): Unit
  
  def computeNotLast(entry: TrackEntry): Unit
  
  var data: AnimationStateData
  
  def disposeNext(entry: TrackEntry): Unit
  
  var events: js.Array[Event]
  
  def expandToIndex(index: Double): TrackEntry
  
  def getCurrent(trackIndex: Double): TrackEntry
  
  var listeners: js.Array[AnimationStateListener2]
  
  var propertyIDs: IntSet
  
  var queue: EventQueue
  
  def queueEvents(entry: TrackEntry, animationTime: Double): Unit
  
  def removeListener(listener: AnimationStateListener2): Unit
  
  def setAnimation(trackIndex: Double, animationName: String, loop: Boolean): TrackEntry
  
  def setAnimationWith(trackIndex: Double, animation: Animation, loop: Boolean): TrackEntry
  
  def setCurrent(index: Double, current: TrackEntry, interrupt: Boolean): Unit
  
  def setEmptyAnimation(trackIndex: Double, mixDuration: Double): TrackEntry
  
  def setEmptyAnimations(mixDuration: Double): Unit
  
  var timeScale: Double
  
  def trackEntry(trackIndex: Double, animation: Animation, loop: Boolean, last: TrackEntry): TrackEntry
  
  var trackEntryPool: Pool[TrackEntry]
  
  var tracks: js.Array[TrackEntry]
  
  def update(delta: Double): Unit
  
  def updateMixingFrom(to: TrackEntry, delta: Double): Boolean
}
object AnimationState {
  
  inline def apply(
    _animationsChanged: Callback,
    addAnimation: (Double, String, Boolean, Double) => TrackEntry,
    addAnimationWith: (Double, Animation, Boolean, Double) => TrackEntry,
    addEmptyAnimation: (Double, Double, Double) => TrackEntry,
    addListener: AnimationStateListener2 => Callback,
    animationsChanged: Boolean,
    apply: Skeleton => Boolean,
    applyMixingFrom: (TrackEntry, Skeleton, MixBlend) => Double,
    applyRotateTimeline: (Timeline, Skeleton, Double, Double, MixBlend, js.Array[Double], Double, Boolean) => Callback,
    clearListenerNotifications: Callback,
    clearListeners: Callback,
    clearTrack: Double => Callback,
    clearTracks: Callback,
    computeHold: TrackEntry => Callback,
    computeNotLast: TrackEntry => Callback,
    data: AnimationStateData,
    disposeNext: TrackEntry => Callback,
    events: js.Array[Event],
    expandToIndex: Double => TrackEntry,
    getCurrent: Double => TrackEntry,
    listeners: js.Array[AnimationStateListener2],
    propertyIDs: IntSet,
    queue: EventQueue,
    queueEvents: (TrackEntry, Double) => Callback,
    removeListener: AnimationStateListener2 => Callback,
    setAnimation: (Double, String, Boolean) => TrackEntry,
    setAnimationWith: (Double, Animation, Boolean) => TrackEntry,
    setCurrent: (Double, TrackEntry, Boolean) => Callback,
    setEmptyAnimation: (Double, Double) => TrackEntry,
    setEmptyAnimations: Double => Callback,
    timeScale: Double,
    trackEntry: (Double, Animation, Boolean, TrackEntry) => TrackEntry,
    trackEntryPool: Pool[TrackEntry],
    tracks: js.Array[TrackEntry],
    update: Double => Callback,
    updateMixingFrom: (TrackEntry, Double) => Boolean
  ): AnimationState = {
    val __obj = js.Dynamic.literal(_animationsChanged = _animationsChanged.toJsFn, addAnimation = js.Any.fromFunction4(addAnimation), addAnimationWith = js.Any.fromFunction4(addAnimationWith), addEmptyAnimation = js.Any.fromFunction3(addEmptyAnimation), addListener = js.Any.fromFunction1((t0: AnimationStateListener2) => addListener(t0).runNow()), animationsChanged = animationsChanged.asInstanceOf[js.Any], apply = js.Any.fromFunction1(apply), applyMixingFrom = js.Any.fromFunction3(applyMixingFrom), applyRotateTimeline = js.Any.fromFunction8((t0: Timeline, t1: Skeleton, t2: Double, t3: Double, t4: MixBlend, t5: js.Array[Double], t6: Double, t7: Boolean) => (applyRotateTimeline(t0, t1, t2, t3, t4, t5, t6, t7)).runNow()), clearListenerNotifications = clearListenerNotifications.toJsFn, clearListeners = clearListeners.toJsFn, clearTrack = js.Any.fromFunction1((t0: Double) => clearTrack(t0).runNow()), clearTracks = clearTracks.toJsFn, computeHold = js.Any.fromFunction1((t0: TrackEntry) => computeHold(t0).runNow()), computeNotLast = js.Any.fromFunction1((t0: TrackEntry) => computeNotLast(t0).runNow()), data = data.asInstanceOf[js.Any], disposeNext = js.Any.fromFunction1((t0: TrackEntry) => disposeNext(t0).runNow()), events = events.asInstanceOf[js.Any], expandToIndex = js.Any.fromFunction1(expandToIndex), getCurrent = js.Any.fromFunction1(getCurrent), listeners = listeners.asInstanceOf[js.Any], propertyIDs = propertyIDs.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], queueEvents = js.Any.fromFunction2((t0: TrackEntry, t1: Double) => (queueEvents(t0, t1)).runNow()), removeListener = js.Any.fromFunction1((t0: AnimationStateListener2) => removeListener(t0).runNow()), setAnimation = js.Any.fromFunction3(setAnimation), setAnimationWith = js.Any.fromFunction3(setAnimationWith), setCurrent = js.Any.fromFunction3((t0: Double, t1: TrackEntry, t2: Boolean) => (setCurrent(t0, t1, t2)).runNow()), setEmptyAnimation = js.Any.fromFunction2(setEmptyAnimation), setEmptyAnimations = js.Any.fromFunction1((t0: Double) => setEmptyAnimations(t0).runNow()), timeScale = timeScale.asInstanceOf[js.Any], trackEntry = js.Any.fromFunction4(trackEntry), trackEntryPool = trackEntryPool.asInstanceOf[js.Any], tracks = tracks.asInstanceOf[js.Any], update = js.Any.fromFunction1((t0: Double) => update(t0).runNow()), updateMixingFrom = js.Any.fromFunction2(updateMixingFrom))
    __obj.asInstanceOf[AnimationState]
  }
  
  extension [Self <: AnimationState](x: Self) {
    
    inline def setAddAnimation(value: (Double, String, Boolean, Double) => TrackEntry): Self = StObject.set(x, "addAnimation", js.Any.fromFunction4(value))
    
    inline def setAddAnimationWith(value: (Double, Animation, Boolean, Double) => TrackEntry): Self = StObject.set(x, "addAnimationWith", js.Any.fromFunction4(value))
    
    inline def setAddEmptyAnimation(value: (Double, Double, Double) => TrackEntry): Self = StObject.set(x, "addEmptyAnimation", js.Any.fromFunction3(value))
    
    inline def setAddListener(value: AnimationStateListener2 => Callback): Self = StObject.set(x, "addListener", js.Any.fromFunction1((t0: AnimationStateListener2) => value(t0).runNow()))
    
    inline def setAnimationsChanged(value: Boolean): Self = StObject.set(x, "animationsChanged", value.asInstanceOf[js.Any])
    
    inline def setApply(value: Skeleton => Boolean): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
    
    inline def setApplyMixingFrom(value: (TrackEntry, Skeleton, MixBlend) => Double): Self = StObject.set(x, "applyMixingFrom", js.Any.fromFunction3(value))
    
    inline def setApplyRotateTimeline(
      value: (Timeline, Skeleton, Double, Double, MixBlend, js.Array[Double], Double, Boolean) => Callback
    ): Self = StObject.set(x, "applyRotateTimeline", js.Any.fromFunction8((t0: Timeline, t1: Skeleton, t2: Double, t3: Double, t4: MixBlend, t5: js.Array[Double], t6: Double, t7: Boolean) => (value(t0, t1, t2, t3, t4, t5, t6, t7)).runNow()))
    
    inline def setClearListenerNotifications(value: Callback): Self = StObject.set(x, "clearListenerNotifications", value.toJsFn)
    
    inline def setClearListeners(value: Callback): Self = StObject.set(x, "clearListeners", value.toJsFn)
    
    inline def setClearTrack(value: Double => Callback): Self = StObject.set(x, "clearTrack", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setClearTracks(value: Callback): Self = StObject.set(x, "clearTracks", value.toJsFn)
    
    inline def setComputeHold(value: TrackEntry => Callback): Self = StObject.set(x, "computeHold", js.Any.fromFunction1((t0: TrackEntry) => value(t0).runNow()))
    
    inline def setComputeNotLast(value: TrackEntry => Callback): Self = StObject.set(x, "computeNotLast", js.Any.fromFunction1((t0: TrackEntry) => value(t0).runNow()))
    
    inline def setData(value: AnimationStateData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDisposeNext(value: TrackEntry => Callback): Self = StObject.set(x, "disposeNext", js.Any.fromFunction1((t0: TrackEntry) => value(t0).runNow()))
    
    inline def setEvents(value: js.Array[Event]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsVarargs(value: Event*): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setExpandToIndex(value: Double => TrackEntry): Self = StObject.set(x, "expandToIndex", js.Any.fromFunction1(value))
    
    inline def setGetCurrent(value: Double => TrackEntry): Self = StObject.set(x, "getCurrent", js.Any.fromFunction1(value))
    
    inline def setListeners(value: js.Array[AnimationStateListener2]): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
    
    inline def setListenersVarargs(value: AnimationStateListener2*): Self = StObject.set(x, "listeners", js.Array(value*))
    
    inline def setPropertyIDs(value: IntSet): Self = StObject.set(x, "propertyIDs", value.asInstanceOf[js.Any])
    
    inline def setQueue(value: EventQueue): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
    
    inline def setQueueEvents(value: (TrackEntry, Double) => Callback): Self = StObject.set(x, "queueEvents", js.Any.fromFunction2((t0: TrackEntry, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setRemoveListener(value: AnimationStateListener2 => Callback): Self = StObject.set(x, "removeListener", js.Any.fromFunction1((t0: AnimationStateListener2) => value(t0).runNow()))
    
    inline def setSetAnimation(value: (Double, String, Boolean) => TrackEntry): Self = StObject.set(x, "setAnimation", js.Any.fromFunction3(value))
    
    inline def setSetAnimationWith(value: (Double, Animation, Boolean) => TrackEntry): Self = StObject.set(x, "setAnimationWith", js.Any.fromFunction3(value))
    
    inline def setSetCurrent(value: (Double, TrackEntry, Boolean) => Callback): Self = StObject.set(x, "setCurrent", js.Any.fromFunction3((t0: Double, t1: TrackEntry, t2: Boolean) => (value(t0, t1, t2)).runNow()))
    
    inline def setSetEmptyAnimation(value: (Double, Double) => TrackEntry): Self = StObject.set(x, "setEmptyAnimation", js.Any.fromFunction2(value))
    
    inline def setSetEmptyAnimations(value: Double => Callback): Self = StObject.set(x, "setEmptyAnimations", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setTimeScale(value: Double): Self = StObject.set(x, "timeScale", value.asInstanceOf[js.Any])
    
    inline def setTrackEntry(value: (Double, Animation, Boolean, TrackEntry) => TrackEntry): Self = StObject.set(x, "trackEntry", js.Any.fromFunction4(value))
    
    inline def setTrackEntryPool(value: Pool[TrackEntry]): Self = StObject.set(x, "trackEntryPool", value.asInstanceOf[js.Any])
    
    inline def setTracks(value: js.Array[TrackEntry]): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
    
    inline def setTracksVarargs(value: TrackEntry*): Self = StObject.set(x, "tracks", js.Array(value*))
    
    inline def setUpdate(value: Double => Callback): Self = StObject.set(x, "update", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setUpdateMixingFrom(value: (TrackEntry, Double) => Boolean): Self = StObject.set(x, "updateMixingFrom", js.Any.fromFunction2(value))
    
    inline def set_animationsChanged(value: Callback): Self = StObject.set(x, "_animationsChanged", value.toJsFn)
  }
}
