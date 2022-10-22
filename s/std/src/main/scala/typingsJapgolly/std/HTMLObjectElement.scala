package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides special properties and methods (beyond those on the HTMLElement interface it also has available to it by inheritance) for manipulating the layout and presentation of <object> element, representing external resources. */
@js.native
trait HTMLObjectElement
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
  
  /** @deprecated */
  /* standard dom */
  var align: java.lang.String = js.native
  
  /**
    * Sets or retrieves a character string that can be used to implement your own archive functionality for the object.
    * @deprecated
    */
  /* standard dom */
  var archive: java.lang.String = js.native
  
  /** @deprecated */
  /* standard dom */
  var border: java.lang.String = js.native
  
  /** Returns whether a form will validate when it is submitted, without having to submit it. */
  /* standard dom */
  def checkValidity(): scala.Boolean = js.native
  
  /**
    * Sets or retrieves the URL of the file containing the compiled Java class.
    * @deprecated
    */
  /* standard dom */
  var code: java.lang.String = js.native
  
  /**
    * Sets or retrieves the URL of the component.
    * @deprecated
    */
  /* standard dom */
  var codeBase: java.lang.String = js.native
  
  /**
    * Sets or retrieves the Internet media type for the code associated with the object.
    * @deprecated
    */
  /* standard dom */
  var codeType: java.lang.String = js.native
  
  /** Retrieves the document object of the page or frame. */
  /* standard dom */
  val contentDocument: org.scalajs.dom.Document | Null = js.native
  
  /* standard dom */
  val contentWindow: org.scalajs.dom.Window | Null = js.native
  
  /** Sets or retrieves the URL that references the data of the object. */
  /* standard dom */
  var data: java.lang.String = js.native
  
  /** @deprecated */
  /* standard dom */
  var declare: scala.Boolean = js.native
  
  /** Retrieves a reference to the form that the object is embedded in. */
  /* standard dom */
  val form: org.scalajs.dom.HTMLFormElement | Null = js.native
  
  /* standard dom */
  def getSVGDocument(): org.scalajs.dom.Document | Null = js.native
  
  /** Sets or retrieves the height of the object. */
  /* standard dom */
  var height: java.lang.String = js.native
  
  /** @deprecated */
  /* standard dom */
  var hspace: Double = js.native
  
  /** Sets or retrieves the name of the object. */
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
  
  /**
    * Sets or retrieves a message to be displayed while an object is loading.
    * @deprecated
    */
  /* standard dom */
  var standby: java.lang.String = js.native
  
  /** Sets or retrieves the MIME type of the object. */
  /* standard dom */
  var `type`: java.lang.String = js.native
  
  /** Sets or retrieves the URL, often with a bookmark extension (#name), to use as a client-side image map. */
  /* standard dom */
  var useMap: java.lang.String = js.native
  
  /** Returns the error message that would be displayed if the user submits the form, or an empty string if no error message. It also triggers the standard error message, such as "this is a required field". The result is that the user sees validation messages without actually submitting. */
  /* standard dom */
  val validationMessage: java.lang.String = js.native
  
  /** Returns a  ValidityState object that represents the validity states of an element. */
  /* standard dom */
  val validity: org.scalajs.dom.ValidityState = js.native
  
  /** @deprecated */
  /* standard dom */
  var vspace: Double = js.native
  
  /** Sets or retrieves the width of the object. */
  /* standard dom */
  var width: java.lang.String = js.native
  
  /** Returns whether an element will successfully validate based on forms validation rules and constraints. */
  /* standard dom */
  val willValidate: scala.Boolean = js.native
}
