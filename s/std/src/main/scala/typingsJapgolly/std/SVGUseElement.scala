package typingsJapgolly.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Corresponds to the <use> element. */
@js.native
trait SVGUseElement
  extends SVGGraphicsElement
     with SVGURIReference {
  val animatedInstanceRoot: org.scalajs.dom.raw.SVGElementInstance | Null = js.native
  val height: org.scalajs.dom.raw.SVGAnimatedLength = js.native
  val instanceRoot: org.scalajs.dom.raw.SVGElementInstance | Null = js.native
  val width: org.scalajs.dom.raw.SVGAnimatedLength = js.native
  val x: org.scalajs.dom.raw.SVGAnimatedLength = js.native
  val y: org.scalajs.dom.raw.SVGAnimatedLength = js.native
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

@JSGlobal("SVGUseElement")
@js.native
object SVGUseElement extends Instantiable0[SVGUseElement]

