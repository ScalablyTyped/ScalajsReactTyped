package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides special properties and methods (beyond the regular HTMLElement interface it also has available to it by inheritance) for manipulating the layout and presentation of <fieldset> elements. */
@js.native
trait HTMLFieldSetElement
  extends StObject
     with HTMLElement {
  
  /* standard dom */
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
  
  /** Returns whether a form will validate when it is submitted, without having to submit it. */
  /* standard dom */
  def checkValidity(): scala.Boolean = js.native
  
  /* standard dom */
  var disabled: scala.Boolean = js.native
  
  /** Returns an HTMLCollection of the form controls in the element. */
  /* standard dom */
  val elements: org.scalajs.dom.HTMLCollection[Any] = js.native
  
  /** Retrieves a reference to the form that the object is embedded in. */
  /* standard dom */
  val form: org.scalajs.dom.HTMLFormElement | Null = js.native
  
  /* standard dom */
  var name: java.lang.String = js.native
  
  /* standard dom */
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  
  /* standard dom */
  def reportValidity(): scala.Boolean = js.native
  
  /**
    * Sets a custom error message that is displayed when a form is submitted.
    * @param error Sets a custom error message that is displayed when a form is submitted.
    */
  /* standard dom */
  def setCustomValidity(error: java.lang.String): Unit = js.native
  
  /** Returns the string "fieldset". */
  /* standard dom */
  val `type`: java.lang.String = js.native
  
  /** Returns the error message that would be displayed if the user submits the form, or an empty string if no error message. It also triggers the standard error message, such as "this is a required field". The result is that the user sees validation messages without actually submitting. */
  /* standard dom */
  val validationMessage: java.lang.String = js.native
  
  /** Returns a  ValidityState object that represents the validity states of an element. */
  /* standard dom */
  val validity: org.scalajs.dom.ValidityState = js.native
  
  /** Returns whether an element will successfully validate based on forms validation rules and constraints. */
  /* standard dom */
  val willValidate: scala.Boolean = js.native
}
