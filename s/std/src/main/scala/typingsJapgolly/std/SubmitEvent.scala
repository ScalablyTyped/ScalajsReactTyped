package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubmitEvent
  extends StObject
     with Event {
  
  /** Returns the element representing the submit button that triggered the form submission, or null if the submission was not triggered by a button. */
  /* standard dom */
  val submitter: org.scalajs.dom.HTMLElement | Null = js.native
}
