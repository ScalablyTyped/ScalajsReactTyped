package typingsJapgolly.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides special properties and methods (beyond those of the regular object HTMLElement interface it also has available to it by inheritance) for manipulating the layout and presentation of <area> elements. */
@js.native
trait HTMLAreaElement
  extends HTMLElement
     with HTMLHyperlinkElementUtils {
  /**
    * Sets or retrieves a text alternative to the graphic.
    */
  var alt: java.lang.String = js.native
  /**
    * Sets or retrieves the coordinates of the object.
    */
  var coords: java.lang.String = js.native
  var download: java.lang.String = js.native
  /**
    * Sets or gets whether clicks in this region cause action.
    */
  /** @deprecated */
  var noHref: scala.Boolean = js.native
  var ping: java.lang.String = js.native
  var referrerPolicy: java.lang.String = js.native
  var rel: java.lang.String = js.native
  val relList: org.scalajs.dom.raw.DOMTokenList = js.native
  /**
    * Sets or retrieves the shape of the object.
    */
  var shape: java.lang.String = js.native
  /**
    * Sets or retrieves the window or frame at which to target content.
    */
  var target: java.lang.String = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: EventListenerOptions
  ): Unit = js.native
}

@JSGlobal("HTMLAreaElement")
@js.native
object HTMLAreaElement extends Instantiable0[HTMLAreaElement]

