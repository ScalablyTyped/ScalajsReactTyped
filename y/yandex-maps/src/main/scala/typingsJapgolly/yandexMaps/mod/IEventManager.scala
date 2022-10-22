package typingsJapgolly.yandexMaps.mod

import org.scalajs.dom.AnimationEvent
import org.scalajs.dom.CompositionEvent
import org.scalajs.dom.DragEvent
import org.scalajs.dom.ErrorEvent
import org.scalajs.dom.Event
import org.scalajs.dom.FocusEvent
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.PointerEvent
import org.scalajs.dom.ProgressEvent
import org.scalajs.dom.TouchEvent
import org.scalajs.dom.TransitionEvent
import org.scalajs.dom.UIEvent
import org.scalajs.dom.WheelEvent
import typingsJapgolly.std.FormDataEvent
import typingsJapgolly.std.InputEvent
import typingsJapgolly.std.SecurityPolicyViolationEvent
import typingsJapgolly.std.SubmitEvent
import typingsJapgolly.yandexMaps.yandexMapsStrings.abort
import typingsJapgolly.yandexMaps.yandexMapsStrings.animationcancel
import typingsJapgolly.yandexMaps.yandexMapsStrings.animationend
import typingsJapgolly.yandexMaps.yandexMapsStrings.animationiteration
import typingsJapgolly.yandexMaps.yandexMapsStrings.animationstart
import typingsJapgolly.yandexMaps.yandexMapsStrings.auxclick
import typingsJapgolly.yandexMaps.yandexMapsStrings.beforeinput
import typingsJapgolly.yandexMaps.yandexMapsStrings.blur
import typingsJapgolly.yandexMaps.yandexMapsStrings.canplay
import typingsJapgolly.yandexMaps.yandexMapsStrings.canplaythrough
import typingsJapgolly.yandexMaps.yandexMapsStrings.change
import typingsJapgolly.yandexMaps.yandexMapsStrings.click
import typingsJapgolly.yandexMaps.yandexMapsStrings.close
import typingsJapgolly.yandexMaps.yandexMapsStrings.compositionend
import typingsJapgolly.yandexMaps.yandexMapsStrings.compositionstart
import typingsJapgolly.yandexMaps.yandexMapsStrings.compositionupdate
import typingsJapgolly.yandexMaps.yandexMapsStrings.contextmenu
import typingsJapgolly.yandexMaps.yandexMapsStrings.cuechange
import typingsJapgolly.yandexMaps.yandexMapsStrings.dblclick
import typingsJapgolly.yandexMaps.yandexMapsStrings.drag
import typingsJapgolly.yandexMaps.yandexMapsStrings.dragend
import typingsJapgolly.yandexMaps.yandexMapsStrings.dragenter
import typingsJapgolly.yandexMaps.yandexMapsStrings.dragleave
import typingsJapgolly.yandexMaps.yandexMapsStrings.dragover
import typingsJapgolly.yandexMaps.yandexMapsStrings.dragstart
import typingsJapgolly.yandexMaps.yandexMapsStrings.drop
import typingsJapgolly.yandexMaps.yandexMapsStrings.durationchange
import typingsJapgolly.yandexMaps.yandexMapsStrings.emptied
import typingsJapgolly.yandexMaps.yandexMapsStrings.ended
import typingsJapgolly.yandexMaps.yandexMapsStrings.error
import typingsJapgolly.yandexMaps.yandexMapsStrings.focus
import typingsJapgolly.yandexMaps.yandexMapsStrings.focusin
import typingsJapgolly.yandexMaps.yandexMapsStrings.focusout
import typingsJapgolly.yandexMaps.yandexMapsStrings.formdata
import typingsJapgolly.yandexMaps.yandexMapsStrings.gotpointercapture
import typingsJapgolly.yandexMaps.yandexMapsStrings.input
import typingsJapgolly.yandexMaps.yandexMapsStrings.invalid
import typingsJapgolly.yandexMaps.yandexMapsStrings.keydown
import typingsJapgolly.yandexMaps.yandexMapsStrings.keypress
import typingsJapgolly.yandexMaps.yandexMapsStrings.keyup
import typingsJapgolly.yandexMaps.yandexMapsStrings.load
import typingsJapgolly.yandexMaps.yandexMapsStrings.loadeddata
import typingsJapgolly.yandexMaps.yandexMapsStrings.loadedmetadata
import typingsJapgolly.yandexMaps.yandexMapsStrings.loadstart
import typingsJapgolly.yandexMaps.yandexMapsStrings.lostpointercapture
import typingsJapgolly.yandexMaps.yandexMapsStrings.mousedown
import typingsJapgolly.yandexMaps.yandexMapsStrings.mouseenter
import typingsJapgolly.yandexMaps.yandexMapsStrings.mouseleave
import typingsJapgolly.yandexMaps.yandexMapsStrings.mousemove
import typingsJapgolly.yandexMaps.yandexMapsStrings.mouseout
import typingsJapgolly.yandexMaps.yandexMapsStrings.mouseover
import typingsJapgolly.yandexMaps.yandexMapsStrings.mouseup
import typingsJapgolly.yandexMaps.yandexMapsStrings.pause
import typingsJapgolly.yandexMaps.yandexMapsStrings.play
import typingsJapgolly.yandexMaps.yandexMapsStrings.playing
import typingsJapgolly.yandexMaps.yandexMapsStrings.pointercancel
import typingsJapgolly.yandexMaps.yandexMapsStrings.pointerdown
import typingsJapgolly.yandexMaps.yandexMapsStrings.pointerenter
import typingsJapgolly.yandexMaps.yandexMapsStrings.pointerleave
import typingsJapgolly.yandexMaps.yandexMapsStrings.pointermove
import typingsJapgolly.yandexMaps.yandexMapsStrings.pointerout
import typingsJapgolly.yandexMaps.yandexMapsStrings.pointerover
import typingsJapgolly.yandexMaps.yandexMapsStrings.pointerup
import typingsJapgolly.yandexMaps.yandexMapsStrings.progress
import typingsJapgolly.yandexMaps.yandexMapsStrings.ratechange
import typingsJapgolly.yandexMaps.yandexMapsStrings.reset
import typingsJapgolly.yandexMaps.yandexMapsStrings.resize
import typingsJapgolly.yandexMaps.yandexMapsStrings.scroll
import typingsJapgolly.yandexMaps.yandexMapsStrings.securitypolicyviolation
import typingsJapgolly.yandexMaps.yandexMapsStrings.seeked
import typingsJapgolly.yandexMaps.yandexMapsStrings.seeking
import typingsJapgolly.yandexMaps.yandexMapsStrings.select
import typingsJapgolly.yandexMaps.yandexMapsStrings.selectionchange
import typingsJapgolly.yandexMaps.yandexMapsStrings.selectstart
import typingsJapgolly.yandexMaps.yandexMapsStrings.slotchange
import typingsJapgolly.yandexMaps.yandexMapsStrings.stalled
import typingsJapgolly.yandexMaps.yandexMapsStrings.submit
import typingsJapgolly.yandexMaps.yandexMapsStrings.suspend
import typingsJapgolly.yandexMaps.yandexMapsStrings.timeupdate
import typingsJapgolly.yandexMaps.yandexMapsStrings.toggle
import typingsJapgolly.yandexMaps.yandexMapsStrings.touchcancel
import typingsJapgolly.yandexMaps.yandexMapsStrings.touchend
import typingsJapgolly.yandexMaps.yandexMapsStrings.touchmove
import typingsJapgolly.yandexMaps.yandexMapsStrings.touchstart
import typingsJapgolly.yandexMaps.yandexMapsStrings.transitioncancel
import typingsJapgolly.yandexMaps.yandexMapsStrings.transitionend
import typingsJapgolly.yandexMaps.yandexMapsStrings.transitionrun
import typingsJapgolly.yandexMaps.yandexMapsStrings.transitionstart
import typingsJapgolly.yandexMaps.yandexMapsStrings.volumechange
import typingsJapgolly.yandexMaps.yandexMapsStrings.waiting
import typingsJapgolly.yandexMaps.yandexMapsStrings.webkitanimationend
import typingsJapgolly.yandexMaps.yandexMapsStrings.webkitanimationiteration
import typingsJapgolly.yandexMaps.yandexMapsStrings.webkitanimationstart
import typingsJapgolly.yandexMaps.yandexMapsStrings.webkittransitionend
import typingsJapgolly.yandexMaps.yandexMapsStrings.wheel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEventManager[TargetGeometry]
  extends StObject
     with IEventTrigger {
  
  def add(types: String, callback: js.Function1[/* event */ IEvent[js.Object, js.Object], Unit]): this.type = js.native
  def add(
    types: String,
    callback: js.Function1[/* event */ IEvent[js.Object, js.Object], Unit],
    context: js.Object
  ): this.type = js.native
  def add(
    types: String,
    callback: js.Function1[/* event */ IEvent[js.Object, js.Object], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  def add(
    types: String,
    callback: js.Function1[/* event */ IEvent[js.Object, js.Object], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  def add(
    types: js.Array[js.Array[String] | String],
    callback: js.Function1[/* event */ IEvent[js.Object, js.Object], Unit]
  ): this.type = js.native
  def add(
    types: js.Array[js.Array[String] | String],
    callback: js.Function1[/* event */ IEvent[js.Object, js.Object], Unit],
    context: js.Object
  ): this.type = js.native
  def add(
    types: js.Array[js.Array[String] | String],
    callback: js.Function1[/* event */ IEvent[js.Object, js.Object], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  def add(
    types: js.Array[js.Array[String] | String],
    callback: js.Function1[/* event */ IEvent[js.Object, js.Object], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_abort(types: abort, callback: js.Function1[/* event */ IEvent[UIEvent, TargetGeometry], Unit]): this.type = js.native
  @JSName("add")
  def add_abort(
    types: abort,
    callback: js.Function1[/* event */ IEvent[UIEvent, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_abort(
    types: abort,
    callback: js.Function1[/* event */ IEvent[UIEvent, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_abort(
    types: abort,
    callback: js.Function1[/* event */ IEvent[UIEvent, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_animationcancel(
    types: animationcancel,
    callback: js.Function1[/* event */ IEvent[AnimationEvent, TargetGeometry], Unit]
  ): this.type = js.native
  @JSName("add")
  def add_animationcancel(
    types: animationcancel,
    callback: js.Function1[/* event */ IEvent[AnimationEvent, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_animationcancel(
    types: animationcancel,
    callback: js.Function1[/* event */ IEvent[AnimationEvent, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_animationcancel(
    types: animationcancel,
    callback: js.Function1[/* event */ IEvent[AnimationEvent, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_animationend(
    types: animationend,
    callback: js.Function1[/* event */ IEvent[AnimationEvent, TargetGeometry], Unit]
  ): this.type = js.native
  @JSName("add")
  def add_animationend(
    types: animationend,
    callback: js.Function1[/* event */ IEvent[AnimationEvent, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_animationend(
    types: animationend,
    callback: js.Function1[/* event */ IEvent[AnimationEvent, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_animationend(
    types: animationend,
    callback: js.Function1[/* event */ IEvent[AnimationEvent, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_animationiteration(
    types: animationiteration,
    callback: js.Function1[/* event */ IEvent[AnimationEvent, TargetGeometry], Unit]
  ): this.type = js.native
  @JSName("add")
  def add_animationiteration(
    types: animationiteration,
    callback: js.Function1[/* event */ IEvent[AnimationEvent, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_animationiteration(
    types: animationiteration,
    callback: js.Function1[/* event */ IEvent[AnimationEvent, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_animationiteration(
    types: animationiteration,
    callback: js.Function1[/* event */ IEvent[AnimationEvent, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_animationstart(
    types: animationstart,
    callback: js.Function1[/* event */ IEvent[AnimationEvent, TargetGeometry], Unit]
  ): this.type = js.native
  @JSName("add")
  def add_animationstart(
    types: animationstart,
    callback: js.Function1[/* event */ IEvent[AnimationEvent, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_animationstart(
    types: animationstart,
    callback: js.Function1[/* event */ IEvent[AnimationEvent, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_animationstart(
    types: animationstart,
    callback: js.Function1[/* event */ IEvent[AnimationEvent, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_auxclick(types: auxclick, callback: js.Function1[/* event */ IEvent[MouseEvent, TargetGeometry], Unit]): this.type = js.native
  @JSName("add")
  def add_auxclick(
    types: auxclick,
    callback: js.Function1[/* event */ IEvent[MouseEvent, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_auxclick(
    types: auxclick,
    callback: js.Function1[/* event */ IEvent[MouseEvent, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_auxclick(
    types: auxclick,
    callback: js.Function1[/* event */ IEvent[MouseEvent, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_beforeinput(types: beforeinput, callback: js.Function1[/* event */ IEvent[InputEvent, TargetGeometry], Unit]): this.type = js.native
  @JSName("add")
  def add_beforeinput(
    types: beforeinput,
    callback: js.Function1[/* event */ IEvent[InputEvent, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_beforeinput(
    types: beforeinput,
    callback: js.Function1[/* event */ IEvent[InputEvent, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_beforeinput(
    types: beforeinput,
    callback: js.Function1[/* event */ IEvent[InputEvent, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_blur(types: blur, callback: js.Function1[/* event */ IEvent[FocusEvent, TargetGeometry], Unit]): this.type = js.native
  @JSName("add")
  def add_blur(
    types: blur,
    callback: js.Function1[/* event */ IEvent[FocusEvent, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_blur(
    types: blur,
    callback: js.Function1[/* event */ IEvent[FocusEvent, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_blur(
    types: blur,
    callback: js.Function1[/* event */ IEvent[FocusEvent, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_canplay(types: canplay, callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit]): this.type = js.native
  @JSName("add")
  def add_canplay(
    types: canplay,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_canplay(
    types: canplay,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_canplay(
    types: canplay,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_canplaythrough(types: canplaythrough, callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit]): this.type = js.native
  @JSName("add")
  def add_canplaythrough(
    types: canplaythrough,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_canplaythrough(
    types: canplaythrough,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_canplaythrough(
    types: canplaythrough,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_change(types: change, callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit]): this.type = js.native
  @JSName("add")
  def add_change(
    types: change,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_change(
    types: change,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_change(
    types: change,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_click(types: click, callback: js.Function1[/* event */ IEvent[MouseEvent, TargetGeometry], Unit]): this.type = js.native
  @JSName("add")
  def add_click(
    types: click,
    callback: js.Function1[/* event */ IEvent[MouseEvent, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_click(
    types: click,
    callback: js.Function1[/* event */ IEvent[MouseEvent, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_click(
    types: click,
    callback: js.Function1[/* event */ IEvent[MouseEvent, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_close(types: close, callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit]): this.type = js.native
  @JSName("add")
  def add_close(
    types: close,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_close(
    types: close,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_close(
    types: close,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_compositionend(
    types: compositionend,
    callback: js.Function1[/* event */ IEvent[CompositionEvent, TargetGeometry], Unit]
  ): this.type = js.native
  @JSName("add")
  def add_compositionend(
    types: compositionend,
    callback: js.Function1[/* event */ IEvent[CompositionEvent, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_compositionend(
    types: compositionend,
    callback: js.Function1[/* event */ IEvent[CompositionEvent, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_compositionend(
    types: compositionend,
    callback: js.Function1[/* event */ IEvent[CompositionEvent, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_compositionstart(
    types: compositionstart,
    callback: js.Function1[/* event */ IEvent[CompositionEvent, TargetGeometry], Unit]
  ): this.type = js.native
  @JSName("add")
  def add_compositionstart(
    types: compositionstart,
    callback: js.Function1[/* event */ IEvent[CompositionEvent, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_compositionstart(
    types: compositionstart,
    callback: js.Function1[/* event */ IEvent[CompositionEvent, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_compositionstart(
    types: compositionstart,
    callback: js.Function1[/* event */ IEvent[CompositionEvent, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_compositionupdate(
    types: compositionupdate,
    callback: js.Function1[/* event */ IEvent[CompositionEvent, TargetGeometry], Unit]
  ): this.type = js.native
  @JSName("add")
  def add_compositionupdate(
    types: compositionupdate,
    callback: js.Function1[/* event */ IEvent[CompositionEvent, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_compositionupdate(
    types: compositionupdate,
    callback: js.Function1[/* event */ IEvent[CompositionEvent, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_compositionupdate(
    types: compositionupdate,
    callback: js.Function1[/* event */ IEvent[CompositionEvent, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_contextmenu(types: contextmenu, callback: js.Function1[/* event */ IEvent[MouseEvent, TargetGeometry], Unit]): this.type = js.native
  @JSName("add")
  def add_contextmenu(
    types: contextmenu,
    callback: js.Function1[/* event */ IEvent[MouseEvent, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_contextmenu(
    types: contextmenu,
    callback: js.Function1[/* event */ IEvent[MouseEvent, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_contextmenu(
    types: contextmenu,
    callback: js.Function1[/* event */ IEvent[MouseEvent, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_cuechange(types: cuechange, callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit]): this.type = js.native
  @JSName("add")
  def add_cuechange(
    types: cuechange,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_cuechange(
    types: cuechange,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_cuechange(
    types: cuechange,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_dblclick(types: dblclick, callback: js.Function1[/* event */ IEvent[MouseEvent, TargetGeometry], Unit]): this.type = js.native
  @JSName("add")
  def add_dblclick(
    types: dblclick,
    callback: js.Function1[/* event */ IEvent[MouseEvent, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_dblclick(
    types: dblclick,
    callback: js.Function1[/* event */ IEvent[MouseEvent, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_dblclick(
    types: dblclick,
    callback: js.Function1[/* event */ IEvent[MouseEvent, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_drag(types: drag, callback: js.Function1[/* event */ IEvent[DragEvent, TargetGeometry], Unit]): this.type = js.native
  @JSName("add")
  def add_drag(
    types: drag,
    callback: js.Function1[/* event */ IEvent[DragEvent, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_drag(
    types: drag,
    callback: js.Function1[/* event */ IEvent[DragEvent, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_drag(
    types: drag,
    callback: js.Function1[/* event */ IEvent[DragEvent, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_dragend(types: dragend, callback: js.Function1[/* event */ IEvent[DragEvent, TargetGeometry], Unit]): this.type = js.native
  @JSName("add")
  def add_dragend(
    types: dragend,
    callback: js.Function1[/* event */ IEvent[DragEvent, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_dragend(
    types: dragend,
    callback: js.Function1[/* event */ IEvent[DragEvent, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_dragend(
    types: dragend,
    callback: js.Function1[/* event */ IEvent[DragEvent, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_dragenter(types: dragenter, callback: js.Function1[/* event */ IEvent[DragEvent, TargetGeometry], Unit]): this.type = js.native
  @JSName("add")
  def add_dragenter(
    types: dragenter,
    callback: js.Function1[/* event */ IEvent[DragEvent, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_dragenter(
    types: dragenter,
    callback: js.Function1[/* event */ IEvent[DragEvent, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_dragenter(
    types: dragenter,
    callback: js.Function1[/* event */ IEvent[DragEvent, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_dragleave(types: dragleave, callback: js.Function1[/* event */ IEvent[DragEvent, TargetGeometry], Unit]): this.type = js.native
  @JSName("add")
  def add_dragleave(
    types: dragleave,
    callback: js.Function1[/* event */ IEvent[DragEvent, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_dragleave(
    types: dragleave,
    callback: js.Function1[/* event */ IEvent[DragEvent, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_dragleave(
    types: dragleave,
    callback: js.Function1[/* event */ IEvent[DragEvent, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_dragover(types: dragover, callback: js.Function1[/* event */ IEvent[DragEvent, TargetGeometry], Unit]): this.type = js.native
  @JSName("add")
  def add_dragover(
    types: dragover,
    callback: js.Function1[/* event */ IEvent[DragEvent, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_dragover(
    types: dragover,
    callback: js.Function1[/* event */ IEvent[DragEvent, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_dragover(
    types: dragover,
    callback: js.Function1[/* event */ IEvent[DragEvent, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_dragstart(types: dragstart, callback: js.Function1[/* event */ IEvent[DragEvent, TargetGeometry], Unit]): this.type = js.native
  @JSName("add")
  def add_dragstart(
    types: dragstart,
    callback: js.Function1[/* event */ IEvent[DragEvent, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_dragstart(
    types: dragstart,
    callback: js.Function1[/* event */ IEvent[DragEvent, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_dragstart(
    types: dragstart,
    callback: js.Function1[/* event */ IEvent[DragEvent, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_drop(types: drop, callback: js.Function1[/* event */ IEvent[DragEvent, TargetGeometry], Unit]): this.type = js.native
  @JSName("add")
  def add_drop(
    types: drop,
    callback: js.Function1[/* event */ IEvent[DragEvent, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_drop(
    types: drop,
    callback: js.Function1[/* event */ IEvent[DragEvent, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_drop(
    types: drop,
    callback: js.Function1[/* event */ IEvent[DragEvent, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_durationchange(types: durationchange, callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit]): this.type = js.native
  @JSName("add")
  def add_durationchange(
    types: durationchange,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_durationchange(
    types: durationchange,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_durationchange(
    types: durationchange,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_emptied(types: emptied, callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit]): this.type = js.native
  @JSName("add")
  def add_emptied(
    types: emptied,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_emptied(
    types: emptied,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_emptied(
    types: emptied,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_ended(types: ended, callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit]): this.type = js.native
  @JSName("add")
  def add_ended(
    types: ended,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_ended(
    types: ended,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_ended(
    types: ended,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_error(types: error, callback: js.Function1[/* event */ IEvent[ErrorEvent, TargetGeometry], Unit]): this.type = js.native
  @JSName("add")
  def add_error(
    types: error,
    callback: js.Function1[/* event */ IEvent[ErrorEvent, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_error(
    types: error,
    callback: js.Function1[/* event */ IEvent[ErrorEvent, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_error(
    types: error,
    callback: js.Function1[/* event */ IEvent[ErrorEvent, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_focus(types: focus, callback: js.Function1[/* event */ IEvent[FocusEvent, TargetGeometry], Unit]): this.type = js.native
  @JSName("add")
  def add_focus(
    types: focus,
    callback: js.Function1[/* event */ IEvent[FocusEvent, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_focus(
    types: focus,
    callback: js.Function1[/* event */ IEvent[FocusEvent, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_focus(
    types: focus,
    callback: js.Function1[/* event */ IEvent[FocusEvent, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_focusin(types: focusin, callback: js.Function1[/* event */ IEvent[FocusEvent, TargetGeometry], Unit]): this.type = js.native
  @JSName("add")
  def add_focusin(
    types: focusin,
    callback: js.Function1[/* event */ IEvent[FocusEvent, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_focusin(
    types: focusin,
    callback: js.Function1[/* event */ IEvent[FocusEvent, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_focusin(
    types: focusin,
    callback: js.Function1[/* event */ IEvent[FocusEvent, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_focusout(types: focusout, callback: js.Function1[/* event */ IEvent[FocusEvent, TargetGeometry], Unit]): this.type = js.native
  @JSName("add")
  def add_focusout(
    types: focusout,
    callback: js.Function1[/* event */ IEvent[FocusEvent, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_focusout(
    types: focusout,
    callback: js.Function1[/* event */ IEvent[FocusEvent, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_focusout(
    types: focusout,
    callback: js.Function1[/* event */ IEvent[FocusEvent, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_formdata(types: formdata, callback: js.Function1[/* event */ IEvent[FormDataEvent, TargetGeometry], Unit]): this.type = js.native
  @JSName("add")
  def add_formdata(
    types: formdata,
    callback: js.Function1[/* event */ IEvent[FormDataEvent, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_formdata(
    types: formdata,
    callback: js.Function1[/* event */ IEvent[FormDataEvent, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_formdata(
    types: formdata,
    callback: js.Function1[/* event */ IEvent[FormDataEvent, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_gotpointercapture(
    types: gotpointercapture,
    callback: js.Function1[/* event */ IEvent[PointerEvent, TargetGeometry], Unit]
  ): this.type = js.native
  @JSName("add")
  def add_gotpointercapture(
    types: gotpointercapture,
    callback: js.Function1[/* event */ IEvent[PointerEvent, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_gotpointercapture(
    types: gotpointercapture,
    callback: js.Function1[/* event */ IEvent[PointerEvent, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_gotpointercapture(
    types: gotpointercapture,
    callback: js.Function1[/* event */ IEvent[PointerEvent, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_input(types: input, callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit]): this.type = js.native
  @JSName("add")
  def add_input(
    types: input,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_input(
    types: input,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_input(
    types: input,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_invalid(types: invalid, callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit]): this.type = js.native
  @JSName("add")
  def add_invalid(
    types: invalid,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_invalid(
    types: invalid,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_invalid(
    types: invalid,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_keydown(types: keydown, callback: js.Function1[/* event */ IEvent[KeyboardEvent, TargetGeometry], Unit]): this.type = js.native
  @JSName("add")
  def add_keydown(
    types: keydown,
    callback: js.Function1[/* event */ IEvent[KeyboardEvent, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_keydown(
    types: keydown,
    callback: js.Function1[/* event */ IEvent[KeyboardEvent, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_keydown(
    types: keydown,
    callback: js.Function1[/* event */ IEvent[KeyboardEvent, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_keypress(types: keypress, callback: js.Function1[/* event */ IEvent[KeyboardEvent, TargetGeometry], Unit]): this.type = js.native
  @JSName("add")
  def add_keypress(
    types: keypress,
    callback: js.Function1[/* event */ IEvent[KeyboardEvent, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_keypress(
    types: keypress,
    callback: js.Function1[/* event */ IEvent[KeyboardEvent, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_keypress(
    types: keypress,
    callback: js.Function1[/* event */ IEvent[KeyboardEvent, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_keyup(types: keyup, callback: js.Function1[/* event */ IEvent[KeyboardEvent, TargetGeometry], Unit]): this.type = js.native
  @JSName("add")
  def add_keyup(
    types: keyup,
    callback: js.Function1[/* event */ IEvent[KeyboardEvent, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_keyup(
    types: keyup,
    callback: js.Function1[/* event */ IEvent[KeyboardEvent, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_keyup(
    types: keyup,
    callback: js.Function1[/* event */ IEvent[KeyboardEvent, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_load(types: load, callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit]): this.type = js.native
  @JSName("add")
  def add_load(
    types: load,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_load(
    types: load,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_load(
    types: load,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_loadeddata(types: loadeddata, callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit]): this.type = js.native
  @JSName("add")
  def add_loadeddata(
    types: loadeddata,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_loadeddata(
    types: loadeddata,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_loadeddata(
    types: loadeddata,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_loadedmetadata(types: loadedmetadata, callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit]): this.type = js.native
  @JSName("add")
  def add_loadedmetadata(
    types: loadedmetadata,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_loadedmetadata(
    types: loadedmetadata,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_loadedmetadata(
    types: loadedmetadata,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_loadstart(types: loadstart, callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit]): this.type = js.native
  @JSName("add")
  def add_loadstart(
    types: loadstart,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_loadstart(
    types: loadstart,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_loadstart(
    types: loadstart,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_lostpointercapture(
    types: lostpointercapture,
    callback: js.Function1[/* event */ IEvent[PointerEvent, TargetGeometry], Unit]
  ): this.type = js.native
  @JSName("add")
  def add_lostpointercapture(
    types: lostpointercapture,
    callback: js.Function1[/* event */ IEvent[PointerEvent, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_lostpointercapture(
    types: lostpointercapture,
    callback: js.Function1[/* event */ IEvent[PointerEvent, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_lostpointercapture(
    types: lostpointercapture,
    callback: js.Function1[/* event */ IEvent[PointerEvent, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_mousedown(types: mousedown, callback: js.Function1[/* event */ IEvent[MouseEvent, TargetGeometry], Unit]): this.type = js.native
  @JSName("add")
  def add_mousedown(
    types: mousedown,
    callback: js.Function1[/* event */ IEvent[MouseEvent, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_mousedown(
    types: mousedown,
    callback: js.Function1[/* event */ IEvent[MouseEvent, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_mousedown(
    types: mousedown,
    callback: js.Function1[/* event */ IEvent[MouseEvent, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_mouseenter(types: mouseenter, callback: js.Function1[/* event */ IEvent[MouseEvent, TargetGeometry], Unit]): this.type = js.native
  @JSName("add")
  def add_mouseenter(
    types: mouseenter,
    callback: js.Function1[/* event */ IEvent[MouseEvent, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_mouseenter(
    types: mouseenter,
    callback: js.Function1[/* event */ IEvent[MouseEvent, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_mouseenter(
    types: mouseenter,
    callback: js.Function1[/* event */ IEvent[MouseEvent, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_mouseleave(types: mouseleave, callback: js.Function1[/* event */ IEvent[MouseEvent, TargetGeometry], Unit]): this.type = js.native
  @JSName("add")
  def add_mouseleave(
    types: mouseleave,
    callback: js.Function1[/* event */ IEvent[MouseEvent, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_mouseleave(
    types: mouseleave,
    callback: js.Function1[/* event */ IEvent[MouseEvent, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_mouseleave(
    types: mouseleave,
    callback: js.Function1[/* event */ IEvent[MouseEvent, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_mousemove(types: mousemove, callback: js.Function1[/* event */ IEvent[MouseEvent, TargetGeometry], Unit]): this.type = js.native
  @JSName("add")
  def add_mousemove(
    types: mousemove,
    callback: js.Function1[/* event */ IEvent[MouseEvent, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_mousemove(
    types: mousemove,
    callback: js.Function1[/* event */ IEvent[MouseEvent, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_mousemove(
    types: mousemove,
    callback: js.Function1[/* event */ IEvent[MouseEvent, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_mouseout(types: mouseout, callback: js.Function1[/* event */ IEvent[MouseEvent, TargetGeometry], Unit]): this.type = js.native
  @JSName("add")
  def add_mouseout(
    types: mouseout,
    callback: js.Function1[/* event */ IEvent[MouseEvent, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_mouseout(
    types: mouseout,
    callback: js.Function1[/* event */ IEvent[MouseEvent, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_mouseout(
    types: mouseout,
    callback: js.Function1[/* event */ IEvent[MouseEvent, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_mouseover(types: mouseover, callback: js.Function1[/* event */ IEvent[MouseEvent, TargetGeometry], Unit]): this.type = js.native
  @JSName("add")
  def add_mouseover(
    types: mouseover,
    callback: js.Function1[/* event */ IEvent[MouseEvent, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_mouseover(
    types: mouseover,
    callback: js.Function1[/* event */ IEvent[MouseEvent, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_mouseover(
    types: mouseover,
    callback: js.Function1[/* event */ IEvent[MouseEvent, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_mouseup(types: mouseup, callback: js.Function1[/* event */ IEvent[MouseEvent, TargetGeometry], Unit]): this.type = js.native
  @JSName("add")
  def add_mouseup(
    types: mouseup,
    callback: js.Function1[/* event */ IEvent[MouseEvent, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_mouseup(
    types: mouseup,
    callback: js.Function1[/* event */ IEvent[MouseEvent, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_mouseup(
    types: mouseup,
    callback: js.Function1[/* event */ IEvent[MouseEvent, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_pause(types: pause, callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit]): this.type = js.native
  @JSName("add")
  def add_pause(
    types: pause,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_pause(
    types: pause,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_pause(
    types: pause,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_play(types: play, callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit]): this.type = js.native
  @JSName("add")
  def add_play(
    types: play,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_play(
    types: play,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_play(
    types: play,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_playing(types: playing, callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit]): this.type = js.native
  @JSName("add")
  def add_playing(
    types: playing,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_playing(
    types: playing,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_playing(
    types: playing,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_pointercancel(
    types: pointercancel,
    callback: js.Function1[/* event */ IEvent[PointerEvent, TargetGeometry], Unit]
  ): this.type = js.native
  @JSName("add")
  def add_pointercancel(
    types: pointercancel,
    callback: js.Function1[/* event */ IEvent[PointerEvent, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_pointercancel(
    types: pointercancel,
    callback: js.Function1[/* event */ IEvent[PointerEvent, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_pointercancel(
    types: pointercancel,
    callback: js.Function1[/* event */ IEvent[PointerEvent, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_pointerdown(types: pointerdown, callback: js.Function1[/* event */ IEvent[PointerEvent, TargetGeometry], Unit]): this.type = js.native
  @JSName("add")
  def add_pointerdown(
    types: pointerdown,
    callback: js.Function1[/* event */ IEvent[PointerEvent, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_pointerdown(
    types: pointerdown,
    callback: js.Function1[/* event */ IEvent[PointerEvent, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_pointerdown(
    types: pointerdown,
    callback: js.Function1[/* event */ IEvent[PointerEvent, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_pointerenter(
    types: pointerenter,
    callback: js.Function1[/* event */ IEvent[PointerEvent, TargetGeometry], Unit]
  ): this.type = js.native
  @JSName("add")
  def add_pointerenter(
    types: pointerenter,
    callback: js.Function1[/* event */ IEvent[PointerEvent, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_pointerenter(
    types: pointerenter,
    callback: js.Function1[/* event */ IEvent[PointerEvent, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_pointerenter(
    types: pointerenter,
    callback: js.Function1[/* event */ IEvent[PointerEvent, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_pointerleave(
    types: pointerleave,
    callback: js.Function1[/* event */ IEvent[PointerEvent, TargetGeometry], Unit]
  ): this.type = js.native
  @JSName("add")
  def add_pointerleave(
    types: pointerleave,
    callback: js.Function1[/* event */ IEvent[PointerEvent, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_pointerleave(
    types: pointerleave,
    callback: js.Function1[/* event */ IEvent[PointerEvent, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_pointerleave(
    types: pointerleave,
    callback: js.Function1[/* event */ IEvent[PointerEvent, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_pointermove(types: pointermove, callback: js.Function1[/* event */ IEvent[PointerEvent, TargetGeometry], Unit]): this.type = js.native
  @JSName("add")
  def add_pointermove(
    types: pointermove,
    callback: js.Function1[/* event */ IEvent[PointerEvent, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_pointermove(
    types: pointermove,
    callback: js.Function1[/* event */ IEvent[PointerEvent, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_pointermove(
    types: pointermove,
    callback: js.Function1[/* event */ IEvent[PointerEvent, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_pointerout(types: pointerout, callback: js.Function1[/* event */ IEvent[PointerEvent, TargetGeometry], Unit]): this.type = js.native
  @JSName("add")
  def add_pointerout(
    types: pointerout,
    callback: js.Function1[/* event */ IEvent[PointerEvent, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_pointerout(
    types: pointerout,
    callback: js.Function1[/* event */ IEvent[PointerEvent, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_pointerout(
    types: pointerout,
    callback: js.Function1[/* event */ IEvent[PointerEvent, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_pointerover(types: pointerover, callback: js.Function1[/* event */ IEvent[PointerEvent, TargetGeometry], Unit]): this.type = js.native
  @JSName("add")
  def add_pointerover(
    types: pointerover,
    callback: js.Function1[/* event */ IEvent[PointerEvent, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_pointerover(
    types: pointerover,
    callback: js.Function1[/* event */ IEvent[PointerEvent, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_pointerover(
    types: pointerover,
    callback: js.Function1[/* event */ IEvent[PointerEvent, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_pointerup(types: pointerup, callback: js.Function1[/* event */ IEvent[PointerEvent, TargetGeometry], Unit]): this.type = js.native
  @JSName("add")
  def add_pointerup(
    types: pointerup,
    callback: js.Function1[/* event */ IEvent[PointerEvent, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_pointerup(
    types: pointerup,
    callback: js.Function1[/* event */ IEvent[PointerEvent, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_pointerup(
    types: pointerup,
    callback: js.Function1[/* event */ IEvent[PointerEvent, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_progress(types: progress, callback: js.Function1[/* event */ IEvent[ProgressEvent, TargetGeometry], Unit]): this.type = js.native
  @JSName("add")
  def add_progress(
    types: progress,
    callback: js.Function1[/* event */ IEvent[ProgressEvent, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_progress(
    types: progress,
    callback: js.Function1[/* event */ IEvent[ProgressEvent, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_progress(
    types: progress,
    callback: js.Function1[/* event */ IEvent[ProgressEvent, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_ratechange(types: ratechange, callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit]): this.type = js.native
  @JSName("add")
  def add_ratechange(
    types: ratechange,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_ratechange(
    types: ratechange,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_ratechange(
    types: ratechange,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_reset(types: reset, callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit]): this.type = js.native
  @JSName("add")
  def add_reset(
    types: reset,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_reset(
    types: reset,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_reset(
    types: reset,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_resize(types: resize, callback: js.Function1[/* event */ IEvent[UIEvent, TargetGeometry], Unit]): this.type = js.native
  @JSName("add")
  def add_resize(
    types: resize,
    callback: js.Function1[/* event */ IEvent[UIEvent, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_resize(
    types: resize,
    callback: js.Function1[/* event */ IEvent[UIEvent, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_resize(
    types: resize,
    callback: js.Function1[/* event */ IEvent[UIEvent, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_scroll(types: scroll, callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit]): this.type = js.native
  @JSName("add")
  def add_scroll(
    types: scroll,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_scroll(
    types: scroll,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_scroll(
    types: scroll,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_securitypolicyviolation(
    types: securitypolicyviolation,
    callback: js.Function1[/* event */ IEvent[SecurityPolicyViolationEvent, TargetGeometry], Unit]
  ): this.type = js.native
  @JSName("add")
  def add_securitypolicyviolation(
    types: securitypolicyviolation,
    callback: js.Function1[/* event */ IEvent[SecurityPolicyViolationEvent, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_securitypolicyviolation(
    types: securitypolicyviolation,
    callback: js.Function1[/* event */ IEvent[SecurityPolicyViolationEvent, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_securitypolicyviolation(
    types: securitypolicyviolation,
    callback: js.Function1[/* event */ IEvent[SecurityPolicyViolationEvent, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_seeked(types: seeked, callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit]): this.type = js.native
  @JSName("add")
  def add_seeked(
    types: seeked,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_seeked(
    types: seeked,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_seeked(
    types: seeked,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_seeking(types: seeking, callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit]): this.type = js.native
  @JSName("add")
  def add_seeking(
    types: seeking,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_seeking(
    types: seeking,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_seeking(
    types: seeking,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_select(types: select, callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit]): this.type = js.native
  @JSName("add")
  def add_select(
    types: select,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_select(
    types: select,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_select(
    types: select,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_selectionchange(types: selectionchange, callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit]): this.type = js.native
  @JSName("add")
  def add_selectionchange(
    types: selectionchange,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_selectionchange(
    types: selectionchange,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_selectionchange(
    types: selectionchange,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_selectstart(types: selectstart, callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit]): this.type = js.native
  @JSName("add")
  def add_selectstart(
    types: selectstart,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_selectstart(
    types: selectstart,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_selectstart(
    types: selectstart,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_slotchange(types: slotchange, callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit]): this.type = js.native
  @JSName("add")
  def add_slotchange(
    types: slotchange,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_slotchange(
    types: slotchange,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_slotchange(
    types: slotchange,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_stalled(types: stalled, callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit]): this.type = js.native
  @JSName("add")
  def add_stalled(
    types: stalled,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_stalled(
    types: stalled,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_stalled(
    types: stalled,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_submit(types: submit, callback: js.Function1[/* event */ IEvent[SubmitEvent, TargetGeometry], Unit]): this.type = js.native
  @JSName("add")
  def add_submit(
    types: submit,
    callback: js.Function1[/* event */ IEvent[SubmitEvent, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_submit(
    types: submit,
    callback: js.Function1[/* event */ IEvent[SubmitEvent, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_submit(
    types: submit,
    callback: js.Function1[/* event */ IEvent[SubmitEvent, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_suspend(types: suspend, callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit]): this.type = js.native
  @JSName("add")
  def add_suspend(
    types: suspend,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_suspend(
    types: suspend,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_suspend(
    types: suspend,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_timeupdate(types: timeupdate, callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit]): this.type = js.native
  @JSName("add")
  def add_timeupdate(
    types: timeupdate,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_timeupdate(
    types: timeupdate,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_timeupdate(
    types: timeupdate,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_toggle(types: toggle, callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit]): this.type = js.native
  @JSName("add")
  def add_toggle(
    types: toggle,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_toggle(
    types: toggle,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_toggle(
    types: toggle,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_touchcancel(types: touchcancel, callback: js.Function1[/* event */ IEvent[TouchEvent, TargetGeometry], Unit]): this.type = js.native
  @JSName("add")
  def add_touchcancel(
    types: touchcancel,
    callback: js.Function1[/* event */ IEvent[TouchEvent, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_touchcancel(
    types: touchcancel,
    callback: js.Function1[/* event */ IEvent[TouchEvent, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_touchcancel(
    types: touchcancel,
    callback: js.Function1[/* event */ IEvent[TouchEvent, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_touchend(types: touchend, callback: js.Function1[/* event */ IEvent[TouchEvent, TargetGeometry], Unit]): this.type = js.native
  @JSName("add")
  def add_touchend(
    types: touchend,
    callback: js.Function1[/* event */ IEvent[TouchEvent, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_touchend(
    types: touchend,
    callback: js.Function1[/* event */ IEvent[TouchEvent, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_touchend(
    types: touchend,
    callback: js.Function1[/* event */ IEvent[TouchEvent, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_touchmove(types: touchmove, callback: js.Function1[/* event */ IEvent[TouchEvent, TargetGeometry], Unit]): this.type = js.native
  @JSName("add")
  def add_touchmove(
    types: touchmove,
    callback: js.Function1[/* event */ IEvent[TouchEvent, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_touchmove(
    types: touchmove,
    callback: js.Function1[/* event */ IEvent[TouchEvent, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_touchmove(
    types: touchmove,
    callback: js.Function1[/* event */ IEvent[TouchEvent, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_touchstart(types: touchstart, callback: js.Function1[/* event */ IEvent[TouchEvent, TargetGeometry], Unit]): this.type = js.native
  @JSName("add")
  def add_touchstart(
    types: touchstart,
    callback: js.Function1[/* event */ IEvent[TouchEvent, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_touchstart(
    types: touchstart,
    callback: js.Function1[/* event */ IEvent[TouchEvent, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_touchstart(
    types: touchstart,
    callback: js.Function1[/* event */ IEvent[TouchEvent, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_transitioncancel(
    types: transitioncancel,
    callback: js.Function1[/* event */ IEvent[TransitionEvent, TargetGeometry], Unit]
  ): this.type = js.native
  @JSName("add")
  def add_transitioncancel(
    types: transitioncancel,
    callback: js.Function1[/* event */ IEvent[TransitionEvent, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_transitioncancel(
    types: transitioncancel,
    callback: js.Function1[/* event */ IEvent[TransitionEvent, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_transitioncancel(
    types: transitioncancel,
    callback: js.Function1[/* event */ IEvent[TransitionEvent, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_transitionend(
    types: transitionend,
    callback: js.Function1[/* event */ IEvent[TransitionEvent, TargetGeometry], Unit]
  ): this.type = js.native
  @JSName("add")
  def add_transitionend(
    types: transitionend,
    callback: js.Function1[/* event */ IEvent[TransitionEvent, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_transitionend(
    types: transitionend,
    callback: js.Function1[/* event */ IEvent[TransitionEvent, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_transitionend(
    types: transitionend,
    callback: js.Function1[/* event */ IEvent[TransitionEvent, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_transitionrun(
    types: transitionrun,
    callback: js.Function1[/* event */ IEvent[TransitionEvent, TargetGeometry], Unit]
  ): this.type = js.native
  @JSName("add")
  def add_transitionrun(
    types: transitionrun,
    callback: js.Function1[/* event */ IEvent[TransitionEvent, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_transitionrun(
    types: transitionrun,
    callback: js.Function1[/* event */ IEvent[TransitionEvent, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_transitionrun(
    types: transitionrun,
    callback: js.Function1[/* event */ IEvent[TransitionEvent, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_transitionstart(
    types: transitionstart,
    callback: js.Function1[/* event */ IEvent[TransitionEvent, TargetGeometry], Unit]
  ): this.type = js.native
  @JSName("add")
  def add_transitionstart(
    types: transitionstart,
    callback: js.Function1[/* event */ IEvent[TransitionEvent, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_transitionstart(
    types: transitionstart,
    callback: js.Function1[/* event */ IEvent[TransitionEvent, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_transitionstart(
    types: transitionstart,
    callback: js.Function1[/* event */ IEvent[TransitionEvent, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_volumechange(types: volumechange, callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit]): this.type = js.native
  @JSName("add")
  def add_volumechange(
    types: volumechange,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_volumechange(
    types: volumechange,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_volumechange(
    types: volumechange,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_waiting(types: waiting, callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit]): this.type = js.native
  @JSName("add")
  def add_waiting(
    types: waiting,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_waiting(
    types: waiting,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_waiting(
    types: waiting,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_webkitanimationend(types: webkitanimationend, callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit]): this.type = js.native
  @JSName("add")
  def add_webkitanimationend(
    types: webkitanimationend,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_webkitanimationend(
    types: webkitanimationend,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_webkitanimationend(
    types: webkitanimationend,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_webkitanimationiteration(
    types: webkitanimationiteration,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit]
  ): this.type = js.native
  @JSName("add")
  def add_webkitanimationiteration(
    types: webkitanimationiteration,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_webkitanimationiteration(
    types: webkitanimationiteration,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_webkitanimationiteration(
    types: webkitanimationiteration,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_webkitanimationstart(
    types: webkitanimationstart,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit]
  ): this.type = js.native
  @JSName("add")
  def add_webkitanimationstart(
    types: webkitanimationstart,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_webkitanimationstart(
    types: webkitanimationstart,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_webkitanimationstart(
    types: webkitanimationstart,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_webkittransitionend(
    types: webkittransitionend,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit]
  ): this.type = js.native
  @JSName("add")
  def add_webkittransitionend(
    types: webkittransitionend,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_webkittransitionend(
    types: webkittransitionend,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_webkittransitionend(
    types: webkittransitionend,
    callback: js.Function1[/* event */ IEvent[Event, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_wheel(types: wheel, callback: js.Function1[/* event */ IEvent[WheelEvent, TargetGeometry], Unit]): this.type = js.native
  @JSName("add")
  def add_wheel(
    types: wheel,
    callback: js.Function1[/* event */ IEvent[WheelEvent, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_wheel(
    types: wheel,
    callback: js.Function1[/* event */ IEvent[WheelEvent, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_wheel(
    types: wheel,
    callback: js.Function1[/* event */ IEvent[WheelEvent, TargetGeometry], Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  
  def getParent(): js.Object | Null = js.native
  
  def group(): IEventGroup = js.native
  
  def remove(
    types: String,
    callback: js.Function1[/* event */ js.Object | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  def remove(
    types: String,
    callback: js.Function1[/* event */ js.Object | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  def remove(
    types: String,
    callback: js.Function1[/* event */ js.Object | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  def remove(
    types: String,
    callback: js.Function1[/* event */ js.Object | (IEvent[js.Object, js.Object]), Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  def remove(
    types: js.Array[js.Array[String] | String],
    callback: js.Function1[(IEvent[js.Object, js.Object]) | js.Object, Unit]
  ): this.type = js.native
  def remove(
    types: js.Array[js.Array[String] | String],
    callback: js.Function1[(IEvent[js.Object, js.Object]) | js.Object, Unit],
    context: js.Object
  ): this.type = js.native
  def remove(
    types: js.Array[js.Array[String] | String],
    callback: js.Function1[(IEvent[js.Object, js.Object]) | js.Object, Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  def remove(
    types: js.Array[js.Array[String] | String],
    callback: js.Function1[(IEvent[js.Object, js.Object]) | js.Object, Unit],
    context: Unit,
    priority: Double
  ): this.type = js.native
  
  def setParent(): this.type = js.native
  def setParent(parent: js.Object): this.type = js.native
}
