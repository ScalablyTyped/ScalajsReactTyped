package typingsJapgolly.reactTooltip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /**
    * Adding `| string` seems strange but multiple events joined by a space are allowable, i.e. "click focus", so
    * at least using *EventMap will give developers some type hinting, but there's no way we can reliably
    * type this.
    */
  type ElementEvents = java.lang.String
  type GetContent = typingsJapgolly.reactTooltip.mod.GetContentCallback | (js.Tuple2[typingsJapgolly.reactTooltip.mod.GetContentCallback, scala.Double])
  type GetContentCallback = js.Function1[/* dataTip */ java.lang.String, japgolly.scalajs.react.raw.React.Node]
  type ReactTooltip = japgolly.scalajs.react.raw.React.Component[typingsJapgolly.reactTooltip.mod.Props with js.Object, js.Object]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactTooltip.reactTooltipStrings.abort
    - typingsJapgolly.reactTooltip.reactTooltipStrings.afterprint
    - typingsJapgolly.reactTooltip.reactTooltipStrings.beforeprint
    - typingsJapgolly.reactTooltip.reactTooltipStrings.beforeunload
    - typingsJapgolly.reactTooltip.reactTooltipStrings.blur
    - typingsJapgolly.reactTooltip.reactTooltipStrings.canplay
    - typingsJapgolly.reactTooltip.reactTooltipStrings.canplaythrough
    - typingsJapgolly.reactTooltip.reactTooltipStrings.change
    - typingsJapgolly.reactTooltip.reactTooltipStrings.click
    - typingsJapgolly.reactTooltip.reactTooltipStrings.compassneedscalibration
    - typingsJapgolly.reactTooltip.reactTooltipStrings.contextmenu
    - typingsJapgolly.reactTooltip.reactTooltipStrings.dblclick
    - typingsJapgolly.reactTooltip.reactTooltipStrings.devicelight
    - typingsJapgolly.reactTooltip.reactTooltipStrings.devicemotion
    - typingsJapgolly.reactTooltip.reactTooltipStrings.deviceorientation
    - typingsJapgolly.reactTooltip.reactTooltipStrings.deviceorientationabsolute
    - typingsJapgolly.reactTooltip.reactTooltipStrings.drag
    - typingsJapgolly.reactTooltip.reactTooltipStrings.dragend
    - typingsJapgolly.reactTooltip.reactTooltipStrings.dragenter
    - typingsJapgolly.reactTooltip.reactTooltipStrings.dragleave
    - typingsJapgolly.reactTooltip.reactTooltipStrings.dragover
    - typingsJapgolly.reactTooltip.reactTooltipStrings.dragstart
    - typingsJapgolly.reactTooltip.reactTooltipStrings.drop
    - typingsJapgolly.reactTooltip.reactTooltipStrings.durationchange
    - typingsJapgolly.reactTooltip.reactTooltipStrings.emptied
    - typingsJapgolly.reactTooltip.reactTooltipStrings.ended
    - typingsJapgolly.reactTooltip.reactTooltipStrings.error
    - typingsJapgolly.reactTooltip.reactTooltipStrings.focus
    - typingsJapgolly.reactTooltip.reactTooltipStrings.hashchange
    - typingsJapgolly.reactTooltip.reactTooltipStrings.input
    - typingsJapgolly.reactTooltip.reactTooltipStrings.invalid
    - typingsJapgolly.reactTooltip.reactTooltipStrings.keydown
    - typingsJapgolly.reactTooltip.reactTooltipStrings.keypress
    - typingsJapgolly.reactTooltip.reactTooltipStrings.keyup
    - typingsJapgolly.reactTooltip.reactTooltipStrings.load
    - typingsJapgolly.reactTooltip.reactTooltipStrings.loadeddata
    - typingsJapgolly.reactTooltip.reactTooltipStrings.loadedmetadata
    - typingsJapgolly.reactTooltip.reactTooltipStrings.loadstart
    - typingsJapgolly.reactTooltip.reactTooltipStrings.message
    - typingsJapgolly.reactTooltip.reactTooltipStrings.mousedown
    - typingsJapgolly.reactTooltip.reactTooltipStrings.mouseenter
    - typingsJapgolly.reactTooltip.reactTooltipStrings.mouseleave
    - typingsJapgolly.reactTooltip.reactTooltipStrings.mousemove
    - typingsJapgolly.reactTooltip.reactTooltipStrings.mouseout
    - typingsJapgolly.reactTooltip.reactTooltipStrings.mouseover
    - typingsJapgolly.reactTooltip.reactTooltipStrings.mouseup
    - typingsJapgolly.reactTooltip.reactTooltipStrings.mousewheel
    - typingsJapgolly.reactTooltip.reactTooltipStrings.MSGestureChange
    - typingsJapgolly.reactTooltip.reactTooltipStrings.MSGestureDoubleTap
    - typingsJapgolly.reactTooltip.reactTooltipStrings.MSGestureEnd
    - typingsJapgolly.reactTooltip.reactTooltipStrings.MSGestureHold
    - typingsJapgolly.reactTooltip.reactTooltipStrings.MSGestureStart
    - typingsJapgolly.reactTooltip.reactTooltipStrings.MSGestureTap
    - typingsJapgolly.reactTooltip.reactTooltipStrings.MSInertiaStart
    - typingsJapgolly.reactTooltip.reactTooltipStrings.MSPointerCancel
    - typingsJapgolly.reactTooltip.reactTooltipStrings.MSPointerDown
    - typingsJapgolly.reactTooltip.reactTooltipStrings.MSPointerEnter
    - typingsJapgolly.reactTooltip.reactTooltipStrings.MSPointerLeave
    - typingsJapgolly.reactTooltip.reactTooltipStrings.MSPointerMove
    - typingsJapgolly.reactTooltip.reactTooltipStrings.MSPointerOut
    - typingsJapgolly.reactTooltip.reactTooltipStrings.MSPointerOver
    - typingsJapgolly.reactTooltip.reactTooltipStrings.MSPointerUp
    - typingsJapgolly.reactTooltip.reactTooltipStrings.offline
    - typingsJapgolly.reactTooltip.reactTooltipStrings.online
    - typingsJapgolly.reactTooltip.reactTooltipStrings.orientationchange
    - typingsJapgolly.reactTooltip.reactTooltipStrings.pagehide
    - typingsJapgolly.reactTooltip.reactTooltipStrings.pageshow
    - typingsJapgolly.reactTooltip.reactTooltipStrings.pause
    - typingsJapgolly.reactTooltip.reactTooltipStrings.play
    - typingsJapgolly.reactTooltip.reactTooltipStrings.playing
    - typingsJapgolly.reactTooltip.reactTooltipStrings.popstate
    - typingsJapgolly.reactTooltip.reactTooltipStrings.progress
    - typingsJapgolly.reactTooltip.reactTooltipStrings.ratechange
    - typingsJapgolly.reactTooltip.reactTooltipStrings.readystatechange
    - typingsJapgolly.reactTooltip.reactTooltipStrings.reset
    - typingsJapgolly.reactTooltip.reactTooltipStrings.resize
    - typingsJapgolly.reactTooltip.reactTooltipStrings.scroll
    - typingsJapgolly.reactTooltip.reactTooltipStrings.seeked
    - typingsJapgolly.reactTooltip.reactTooltipStrings.seeking
    - typingsJapgolly.reactTooltip.reactTooltipStrings.select
    - typingsJapgolly.reactTooltip.reactTooltipStrings.stalled
    - typingsJapgolly.reactTooltip.reactTooltipStrings.storage
    - typingsJapgolly.reactTooltip.reactTooltipStrings.submit
    - typingsJapgolly.reactTooltip.reactTooltipStrings.suspend
    - typingsJapgolly.reactTooltip.reactTooltipStrings.timeupdate
    - typingsJapgolly.reactTooltip.reactTooltipStrings.unload
    - typingsJapgolly.reactTooltip.reactTooltipStrings.volumechange
    - typingsJapgolly.reactTooltip.reactTooltipStrings.vrdisplayactivate
    - typingsJapgolly.reactTooltip.reactTooltipStrings.vrdisplayblur
    - typingsJapgolly.reactTooltip.reactTooltipStrings.vrdisplayconnect
    - typingsJapgolly.reactTooltip.reactTooltipStrings.vrdisplaydeactivate
    - typingsJapgolly.reactTooltip.reactTooltipStrings.vrdisplaydisconnect
    - typingsJapgolly.reactTooltip.reactTooltipStrings.vrdisplayfocus
    - typingsJapgolly.reactTooltip.reactTooltipStrings.vrdisplaypointerrestricted
    - typingsJapgolly.reactTooltip.reactTooltipStrings.vrdisplaypointerunrestricted
    - typingsJapgolly.reactTooltip.reactTooltipStrings.vrdisplaypresentchange
    - typingsJapgolly.reactTooltip.reactTooltipStrings.waiting
    - java.lang.String
  */
  type WindowEvents = typingsJapgolly.reactTooltip.mod._WindowEvents | java.lang.String
}
