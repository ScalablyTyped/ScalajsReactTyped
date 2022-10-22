package typingsJapgolly.onsenui.mod

import org.scalajs.dom.EventListenerOptions
import typingsJapgolly.std.AddEventListenerOptions
import typingsJapgolly.std.EventListenerOrEventListenerObject
import typingsJapgolly.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @description Component that adds "pull-to-refresh" to an <ons-page> element
  */
//later should be updated
@js.native
trait OnsPullHookElement
  extends StObject
     with HTMLElement {
  
  /* standard dom */
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
  
  /**
    * @description A boolean value that specifies whether the element is disabled or not.
    */
  var disabled: Boolean = js.native
  
  /**
    * @description If this property is set the content of the page will not move when pulling.
    */
  var fixedContent: Boolean = js.native
  
  /**
    * @description The height of the pull hook in pixels. The default value is `64px`.
    */
  var height: String = js.native
  
  /**
    * @description Define the function that will be called in the `"action"` state.
    */
  var onAction: js.UndefOr[js.Function] = js.native
  
  /**
    * @param {Number} ratio Pulled ratio (scroll / height).
    * @param {Object} animationOptions Object containing duration and timing.
    * @description Hook called whenever the user pulls the element.
    **/
  var onPull: js.UndefOr[js.Function] = js.native
  
  /**
    * @description The current number of pixels the pull hook has moved.
    */
  var pullDistance: Double = js.native
  
  /* standard dom */
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  
  /**
    * @description The current number of pixels the pull hook has moved.
    */
  var state: String = js.native
  
  /**
    * @param {Number} thresholdHeight Desired threshold height
    * @description The thresholdHeight of the pull hook in pixels. The default value is `96px`.
    */
  var thresholdHeight: String = js.native
}
