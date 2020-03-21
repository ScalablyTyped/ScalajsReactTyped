package typingsJapgolly.ionicCore.componentsMod._Global_

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.ionicCore.componentsMod.Components.IonAlert
import typingsJapgolly.ionicCore.overlaysInterfaceMod.OverlaySelect
import typingsJapgolly.ionicCore.stencilCoreMod.HTMLStencilElement
import typingsJapgolly.std.AddEventListenerOptions
import typingsJapgolly.std.EventListenerOptions
import typingsJapgolly.std.EventListenerOrEventListenerObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLIonAlertElement
  extends HTMLStencilElement
     with IonAlert
     with OverlaySelect {
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
}

@JSGlobal("HTMLIonAlertElement")
@js.native
object HTMLIonAlertElement extends Instantiable0[HTMLIonAlertElement]

