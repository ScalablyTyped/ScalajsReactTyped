package typingsJapgolly.onsenui.mod

import org.scalajs.dom.EventListenerOptions
import typingsJapgolly.std.AddEventListenerOptions
import typingsJapgolly.std.EventListenerOrEventListenerObject
import typingsJapgolly.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnsSegmentElement
  extends StObject
     with HTMLElement {
  
  var activeIndex: Double = js.native
  
  /* standard dom */
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
  
  /**
    * @description Whether the element is disabled or not.
    */
  var disabled: Boolean = js.native
  
  /**
    * @return {Number} The index of the currently active button
    * @description Returns button index of current active button. If active button is not found, returns -1
    */
  def getActiveButtonIndex(): Double = js.native
  
  /* standard dom */
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  
  /**
    * @param {Number} index Button index
    * @param {Object} [options] Parameter object passed to the tabbar, if any.
    * @return Resolves to the selected index or to the new page element if there is a connected tabbar.
    * @description Make button with the specified index active. If there is a connected tabbar it shows the corresponding tab page. In this case animations and other options can be specified by the second parameter.
    */
  def setActiveButton(index: Double): js.Promise[org.scalajs.dom.HTMLElement] = js.native
  def setActiveButton(index: Double, options: TabbarOptions): js.Promise[org.scalajs.dom.HTMLElement] = js.native
}
