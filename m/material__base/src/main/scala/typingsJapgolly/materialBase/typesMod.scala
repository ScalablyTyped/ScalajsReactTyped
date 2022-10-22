package typingsJapgolly.materialBase

import org.scalablytyped.runtime.Instantiable1
import org.scalajs.dom.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait Constructor[T]
    extends StObject
       with Instantiable1[/* args (repeated) */ Any, T]
  
  type CustomEventListener[E /* <: Event */] = js.Function1[/* evt */ E, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.materialBase.materialBaseStrings.abort
    - typingsJapgolly.materialBase.materialBaseStrings.animationcancel
    - typingsJapgolly.materialBase.materialBaseStrings.animationend
    - typingsJapgolly.materialBase.materialBaseStrings.animationiteration
    - typingsJapgolly.materialBase.materialBaseStrings.animationstart
    - typingsJapgolly.materialBase.materialBaseStrings.auxclick
    - typingsJapgolly.materialBase.materialBaseStrings.beforeinput
    - typingsJapgolly.materialBase.materialBaseStrings.blur
    - typingsJapgolly.materialBase.materialBaseStrings.canplay
    - typingsJapgolly.materialBase.materialBaseStrings.canplaythrough
    - typingsJapgolly.materialBase.materialBaseStrings.change
    - typingsJapgolly.materialBase.materialBaseStrings.click
    - typingsJapgolly.materialBase.materialBaseStrings.close
    - typingsJapgolly.materialBase.materialBaseStrings.compositionend
    - typingsJapgolly.materialBase.materialBaseStrings.compositionstart
    - typingsJapgolly.materialBase.materialBaseStrings.compositionupdate
    - typingsJapgolly.materialBase.materialBaseStrings.contextmenu
    - typingsJapgolly.materialBase.materialBaseStrings.cuechange
    - typingsJapgolly.materialBase.materialBaseStrings.dblclick
    - typingsJapgolly.materialBase.materialBaseStrings.drag
    - typingsJapgolly.materialBase.materialBaseStrings.dragend
    - typingsJapgolly.materialBase.materialBaseStrings.dragenter
    - typingsJapgolly.materialBase.materialBaseStrings.dragleave
    - typingsJapgolly.materialBase.materialBaseStrings.dragover
    - typingsJapgolly.materialBase.materialBaseStrings.dragstart
    - typingsJapgolly.materialBase.materialBaseStrings.drop
    - typingsJapgolly.materialBase.materialBaseStrings.durationchange
    - typingsJapgolly.materialBase.materialBaseStrings.emptied
    - typingsJapgolly.materialBase.materialBaseStrings.ended
    - typingsJapgolly.materialBase.materialBaseStrings.error
    - typingsJapgolly.materialBase.materialBaseStrings.focus
    - typingsJapgolly.materialBase.materialBaseStrings.focusin
    - typingsJapgolly.materialBase.materialBaseStrings.focusout
    - typingsJapgolly.materialBase.materialBaseStrings.formdata
    - typingsJapgolly.materialBase.materialBaseStrings.gotpointercapture
    - typingsJapgolly.materialBase.materialBaseStrings.input
    - typingsJapgolly.materialBase.materialBaseStrings.invalid
    - typingsJapgolly.materialBase.materialBaseStrings.keydown
    - typingsJapgolly.materialBase.materialBaseStrings.keypress
    - typingsJapgolly.materialBase.materialBaseStrings.keyup
    - typingsJapgolly.materialBase.materialBaseStrings.load
    - typingsJapgolly.materialBase.materialBaseStrings.loadeddata
    - typingsJapgolly.materialBase.materialBaseStrings.loadedmetadata
    - typingsJapgolly.materialBase.materialBaseStrings.loadstart
    - typingsJapgolly.materialBase.materialBaseStrings.lostpointercapture
    - typingsJapgolly.materialBase.materialBaseStrings.mousedown
    - typingsJapgolly.materialBase.materialBaseStrings.mouseenter
    - typingsJapgolly.materialBase.materialBaseStrings.mouseleave
    - typingsJapgolly.materialBase.materialBaseStrings.mousemove
    - typingsJapgolly.materialBase.materialBaseStrings.mouseout
    - typingsJapgolly.materialBase.materialBaseStrings.mouseover
    - typingsJapgolly.materialBase.materialBaseStrings.mouseup
    - typingsJapgolly.materialBase.materialBaseStrings.pause
    - typingsJapgolly.materialBase.materialBaseStrings.play
    - typingsJapgolly.materialBase.materialBaseStrings.playing
    - typingsJapgolly.materialBase.materialBaseStrings.pointercancel
    - typingsJapgolly.materialBase.materialBaseStrings.pointerdown
    - typingsJapgolly.materialBase.materialBaseStrings.pointerenter
    - typingsJapgolly.materialBase.materialBaseStrings.pointerleave
    - typingsJapgolly.materialBase.materialBaseStrings.pointermove
    - typingsJapgolly.materialBase.materialBaseStrings.pointerout
    - typingsJapgolly.materialBase.materialBaseStrings.pointerover
    - typingsJapgolly.materialBase.materialBaseStrings.pointerup
    - typingsJapgolly.materialBase.materialBaseStrings.progress
    - typingsJapgolly.materialBase.materialBaseStrings.ratechange
    - typingsJapgolly.materialBase.materialBaseStrings.reset
    - typingsJapgolly.materialBase.materialBaseStrings.resize
    - typingsJapgolly.materialBase.materialBaseStrings.scroll
    - typingsJapgolly.materialBase.materialBaseStrings.securitypolicyviolation
    - typingsJapgolly.materialBase.materialBaseStrings.seeked
    - typingsJapgolly.materialBase.materialBaseStrings.seeking
    - typingsJapgolly.materialBase.materialBaseStrings.select
    - typingsJapgolly.materialBase.materialBaseStrings.selectionchange
    - typingsJapgolly.materialBase.materialBaseStrings.selectstart
    - typingsJapgolly.materialBase.materialBaseStrings.slotchange
    - typingsJapgolly.materialBase.materialBaseStrings.stalled
    - typingsJapgolly.materialBase.materialBaseStrings.submit
    - typingsJapgolly.materialBase.materialBaseStrings.suspend
    - typingsJapgolly.materialBase.materialBaseStrings.timeupdate
    - typingsJapgolly.materialBase.materialBaseStrings.toggle
    - typingsJapgolly.materialBase.materialBaseStrings.touchcancel
    - typingsJapgolly.materialBase.materialBaseStrings.touchend
    - typingsJapgolly.materialBase.materialBaseStrings.touchmove
    - typingsJapgolly.materialBase.materialBaseStrings.touchstart
    - typingsJapgolly.materialBase.materialBaseStrings.transitioncancel
    - typingsJapgolly.materialBase.materialBaseStrings.transitionend
    - typingsJapgolly.materialBase.materialBaseStrings.transitionrun
    - typingsJapgolly.materialBase.materialBaseStrings.transitionstart
    - typingsJapgolly.materialBase.materialBaseStrings.volumechange
    - typingsJapgolly.materialBase.materialBaseStrings.waiting
    - typingsJapgolly.materialBase.materialBaseStrings.webkitanimationend
    - typingsJapgolly.materialBase.materialBaseStrings.webkitanimationiteration
    - typingsJapgolly.materialBase.materialBaseStrings.webkitanimationstart
    - typingsJapgolly.materialBase.materialBaseStrings.webkittransitionend
    - typingsJapgolly.materialBase.materialBaseStrings.wheel
  */
  trait EventType extends StObject
  
  type SpecificEventListener[K /* <: EventType */] = js.Function1[
    /* import warning: importer.ImportType#apply Failed type conversion: std.GlobalEventHandlersEventMap[K] */ /* evt */ js.Any, 
    Unit
  ]
  
  type SpecificWindowEventListener[K /* <: WindowEventType */] = js.Function1[
    /* import warning: importer.ImportType#apply Failed type conversion: std.WindowEventMap[K] */ /* evt */ js.Any, 
    Unit
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.materialBase.materialBaseStrings.DOMContentLoaded
    - typingsJapgolly.materialBase.materialBaseStrings.devicemotion
    - typingsJapgolly.materialBase.materialBaseStrings.deviceorientation
    - typingsJapgolly.materialBase.materialBaseStrings.gamepadconnected
    - typingsJapgolly.materialBase.materialBaseStrings.gamepaddisconnected
    - typingsJapgolly.materialBase.materialBaseStrings.orientationchange
  */
  trait WindowEventType extends StObject
}
