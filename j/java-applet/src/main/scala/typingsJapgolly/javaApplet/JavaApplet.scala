package typingsJapgolly.javaApplet

import org.scalajs.dom.EventListenerOptions
import typingsJapgolly.std.AddEventListenerOptions
import typingsJapgolly.std.EventListenerOrEventListenerObject
import typingsJapgolly.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @summary Interface for Java applet object.
  * @author  Cyril Schumacher
  * @version 1.0
  */
@js.native
trait JavaApplet
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
    * @summary Handler if the applet status is {@link JavaAppletStatus#Error}. An error has occurred while loading the applet.
    */
  var onError: js.UndefOr[js.Function] = js.native
  
  /**
    * @summary Handler if the applet status is {@link JavaAppletStatus#Ready}. Applet has finished loading and is ready to receive JavaScript calls.
    */
  var onLoad: js.UndefOr[js.Function] = js.native
  
  /**
    * @summary Handler if the applet has stopped.
    */
  var onStop: js.UndefOr[js.Function] = js.native
  
  /* standard dom */
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  
  /**
    * @summary Java applet Status.
    */
  var status: js.UndefOr[JavaAppletStatus] = js.native
}
