package typingsJapgolly.ionicCore.distTypesComponentsMod.global

import org.scalajs.dom.EventListenerOptions
import typingsJapgolly.ionicCore.distTypesComponentsMod.Components.IonSlides
import typingsJapgolly.std.AddEventListenerOptions
import typingsJapgolly.std.DocumentAndElementEventHandlers
import typingsJapgolly.std.Element
import typingsJapgolly.std.ElementCSSInlineStyle
import typingsJapgolly.std.ElementContentEditable
import typingsJapgolly.std.ElementInternals
import typingsJapgolly.std.EventListenerOrEventListenerObject
import typingsJapgolly.std.GlobalEventHandlers
import typingsJapgolly.std.HTMLOrSVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- scala.Any because Inheritance from two classes. Inlined getClass, hashCode, eq, equals, toString, ne, notify, notifyAll, wait, wait, wait, clone, finalize
- scala.AnyRef because Inheritance from two classes. Inlined 
- js.Any because Inheritance from two classes. Inlined 
- js.Object because Inheritance from two classes. Inlined hasOwnProperty, propertyIsEnumerable, valueOf, toLocaleString, isPrototypeOf
- typingsJapgolly.std.HTMLElement because Inheritance from two classes. Inlined accessKeyLabel, offsetWidth, accessKey, spellcheck, offsetTop, innerText, offsetLeft, offsetParent, lang, translate, autocapitalize, dir, outerText, draggable, hidden, inert, title, offsetHeight, attachInternals, click, addEventListener, addEventListener, removeEventListener, removeEventListener, removeEventListener, addEventListener
- typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.HTMLStencilElement because Inheritance from two classes. Inlined componentOnReady */ @js.native
trait HTMLIonSlidesElement
  extends StObject
     with IonSlides
     with Element
     with DocumentAndElementEventHandlers
     with ElementCSSInlineStyle
     with ElementContentEditable
     with GlobalEventHandlers
     with HTMLOrSVGElement {
  
  /* standard dom */
  var accessKey: String = js.native
  
  /* standard dom */
  val accessKeyLabel: String = js.native
  
  /* standard dom */
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
  
  /* standard dom */
  def attachInternals(): ElementInternals = js.native
  
  /* standard dom */
  var autocapitalize: String = js.native
  
  /* standard dom */
  def click(): Unit = js.native
  
  def componentOnReady(): js.Promise[this.type] = js.native
  
  /* standard dom */
  var dir: String = js.native
  
  /* standard dom */
  var draggable: Boolean = js.native
  
  /* standard dom */
  var hidden: Boolean = js.native
  
  /* standard dom */
  var inert: Boolean = js.native
  
  /* standard dom */
  var innerText: String = js.native
  
  /* standard dom */
  var lang: String = js.native
  
  /* standard dom */
  val offsetHeight: Double = js.native
  
  /* standard dom */
  val offsetLeft: Double = js.native
  
  /* standard dom */
  val offsetParent: org.scalajs.dom.Element | Null = js.native
  
  /* standard dom */
  val offsetTop: Double = js.native
  
  /* standard dom */
  val offsetWidth: Double = js.native
  
  /* standard dom */
  var outerText: String = js.native
  
  /* standard dom */
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  
  /* standard dom */
  var spellcheck: Boolean = js.native
  
  /* standard dom */
  var title: String = js.native
  
  /* standard dom */
  var translate: Boolean = js.native
}
