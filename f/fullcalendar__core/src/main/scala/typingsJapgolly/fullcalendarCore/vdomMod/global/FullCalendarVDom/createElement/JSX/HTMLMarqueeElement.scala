package typingsJapgolly.fullcalendarCore.vdomMod.global.FullCalendarVDom.createElement.JSX

import org.scalajs.dom.EventListenerOptions
import typingsJapgolly.fullcalendarCore.fullcalendarCoreStrings.alternate
import typingsJapgolly.fullcalendarCore.fullcalendarCoreStrings.down
import typingsJapgolly.fullcalendarCore.fullcalendarCoreStrings.left
import typingsJapgolly.fullcalendarCore.fullcalendarCoreStrings.right
import typingsJapgolly.fullcalendarCore.fullcalendarCoreStrings.scroll
import typingsJapgolly.fullcalendarCore.fullcalendarCoreStrings.slide
import typingsJapgolly.fullcalendarCore.fullcalendarCoreStrings.up
import typingsJapgolly.std.AddEventListenerOptions
import typingsJapgolly.std.EventListenerOrEventListenerObject
import typingsJapgolly.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLMarqueeElement
  extends StObject
     with HTMLElement {
  
  /* standard dom */
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
  
  var behavior: js.UndefOr[
    scroll | slide | alternate | (typingsJapgolly.preact.srcJsxMod.JSXInternal.SignalLike[scroll | slide | alternate])
  ] = js.native
  
  var bgColor: js.UndefOr[String | typingsJapgolly.preact.srcJsxMod.JSXInternal.SignalLike[String]] = js.native
  
  var direction: js.UndefOr[
    left | right | up | down | (typingsJapgolly.preact.srcJsxMod.JSXInternal.SignalLike[left | right | up | down])
  ] = js.native
  
  var height: js.UndefOr[
    Double | String | (typingsJapgolly.preact.srcJsxMod.JSXInternal.SignalLike[Double | String])
  ] = js.native
  
  var hspace: js.UndefOr[
    Double | String | (typingsJapgolly.preact.srcJsxMod.JSXInternal.SignalLike[Double | String])
  ] = js.native
  
  var loop: js.UndefOr[
    Double | String | (typingsJapgolly.preact.srcJsxMod.JSXInternal.SignalLike[Double | String])
  ] = js.native
  
  /* standard dom */
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  
  var scrollAmount: js.UndefOr[
    Double | String | (typingsJapgolly.preact.srcJsxMod.JSXInternal.SignalLike[Double | String])
  ] = js.native
  
  var scrollDelay: js.UndefOr[
    Double | String | (typingsJapgolly.preact.srcJsxMod.JSXInternal.SignalLike[Double | String])
  ] = js.native
  
  var trueSpeed: js.UndefOr[Boolean | typingsJapgolly.preact.srcJsxMod.JSXInternal.SignalLike[Boolean]] = js.native
  
  var vspace: js.UndefOr[
    Double | String | (typingsJapgolly.preact.srcJsxMod.JSXInternal.SignalLike[Double | String])
  ] = js.native
  
  var width: js.UndefOr[
    Double | String | (typingsJapgolly.preact.srcJsxMod.JSXInternal.SignalLike[Double | String])
  ] = js.native
}
