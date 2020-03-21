package typingsJapgolly.eventTargetShim.mod.EventTarget

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Exclude<keyof event-target-shim.event-target-shim.Event, 'type'> */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.eventTargetShim.eventTargetShimStrings.BUBBLING_PHASE
  - typingsJapgolly.eventTargetShim.eventTargetShimStrings.currentTarget
  - typingsJapgolly.eventTargetShim.eventTargetShimStrings.NONE
  - typingsJapgolly.eventTargetShim.eventTargetShimStrings.initEvent
  - typingsJapgolly.eventTargetShim.eventTargetShimStrings.cancelBubble
  - typingsJapgolly.eventTargetShim.eventTargetShimStrings.target
  - typingsJapgolly.eventTargetShim.eventTargetShimStrings.composed
  - typingsJapgolly.eventTargetShim.eventTargetShimStrings.composedPath
  - typingsJapgolly.eventTargetShim.eventTargetShimStrings.preventDefault
  - typingsJapgolly.eventTargetShim.eventTargetShimStrings.eventPhase
  - typingsJapgolly.eventTargetShim.eventTargetShimStrings.cancelable
  - typingsJapgolly.eventTargetShim.eventTargetShimStrings.isTrusted
  - typingsJapgolly.eventTargetShim.eventTargetShimStrings.returnValue
  - typingsJapgolly.eventTargetShim.eventTargetShimStrings.AT_TARGET
  - typingsJapgolly.eventTargetShim.eventTargetShimStrings.bubbles
  - typingsJapgolly.eventTargetShim.eventTargetShimStrings.stopPropagation
  - typingsJapgolly.eventTargetShim.eventTargetShimStrings.stopImmediatePropagation
  - typingsJapgolly.eventTargetShim.eventTargetShimStrings.CAPTURING_PHASE
  - typingsJapgolly.eventTargetShim.eventTargetShimStrings.srcElement
  - typingsJapgolly.eventTargetShim.eventTargetShimStrings.defaultPrevented
  - typingsJapgolly.eventTargetShim.eventTargetShimStrings.timeStamp
*/
trait OmittableEventKeys extends js.Object

object OmittableEventKeys {
  @scala.inline
  def AT_TARGET: typingsJapgolly.eventTargetShim.eventTargetShimStrings.AT_TARGET = this.cast("AT_TARGET")
  @scala.inline
  def BUBBLING_PHASE: typingsJapgolly.eventTargetShim.eventTargetShimStrings.BUBBLING_PHASE = this.cast("BUBBLING_PHASE")
  @scala.inline
  def CAPTURING_PHASE: typingsJapgolly.eventTargetShim.eventTargetShimStrings.CAPTURING_PHASE = this.cast("CAPTURING_PHASE")
  @scala.inline
  def NONE: typingsJapgolly.eventTargetShim.eventTargetShimStrings.NONE = this.cast("NONE")
  @scala.inline
  def bubbles: typingsJapgolly.eventTargetShim.eventTargetShimStrings.bubbles = this.cast("bubbles")
  @scala.inline
  def cancelBubble: typingsJapgolly.eventTargetShim.eventTargetShimStrings.cancelBubble = this.cast("cancelBubble")
  @scala.inline
  def cancelable: typingsJapgolly.eventTargetShim.eventTargetShimStrings.cancelable = this.cast("cancelable")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def composed: typingsJapgolly.eventTargetShim.eventTargetShimStrings.composed = this.cast("composed")
  @scala.inline
  def composedPath: typingsJapgolly.eventTargetShim.eventTargetShimStrings.composedPath = this.cast("composedPath")
  @scala.inline
  def currentTarget: typingsJapgolly.eventTargetShim.eventTargetShimStrings.currentTarget = this.cast("currentTarget")
  @scala.inline
  def defaultPrevented: typingsJapgolly.eventTargetShim.eventTargetShimStrings.defaultPrevented = this.cast("defaultPrevented")
  @scala.inline
  def eventPhase: typingsJapgolly.eventTargetShim.eventTargetShimStrings.eventPhase = this.cast("eventPhase")
  @scala.inline
  def initEvent: typingsJapgolly.eventTargetShim.eventTargetShimStrings.initEvent = this.cast("initEvent")
  @scala.inline
  def isTrusted: typingsJapgolly.eventTargetShim.eventTargetShimStrings.isTrusted = this.cast("isTrusted")
  @scala.inline
  def preventDefault: typingsJapgolly.eventTargetShim.eventTargetShimStrings.preventDefault = this.cast("preventDefault")
  @scala.inline
  def returnValue: typingsJapgolly.eventTargetShim.eventTargetShimStrings.returnValue = this.cast("returnValue")
  @scala.inline
  def srcElement: typingsJapgolly.eventTargetShim.eventTargetShimStrings.srcElement = this.cast("srcElement")
  @scala.inline
  def stopImmediatePropagation: typingsJapgolly.eventTargetShim.eventTargetShimStrings.stopImmediatePropagation = this.cast("stopImmediatePropagation")
  @scala.inline
  def stopPropagation: typingsJapgolly.eventTargetShim.eventTargetShimStrings.stopPropagation = this.cast("stopPropagation")
  @scala.inline
  def target: typingsJapgolly.eventTargetShim.eventTargetShimStrings.target = this.cast("target")
  @scala.inline
  def timeStamp: typingsJapgolly.eventTargetShim.eventTargetShimStrings.timeStamp = this.cast("timeStamp")
}

