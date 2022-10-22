package typingsJapgolly.winrtUwp.Windows.ApplicationModel.Contacts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ContactAnnotationOperations extends StObject
/** Specifies the types of operations you can perform with a Contact . */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactAnnotationOperations")
@js.native
object ContactAnnotationOperations extends StObject {
  
  /** Make and audio call. */
  @js.native
  sealed trait audioCall
    extends StObject
       with ContactAnnotationOperations
  
  /** Get the contact profile. */
  @js.native
  sealed trait contactProfile
    extends StObject
       with ContactAnnotationOperations
  
  /** Send an SMS/MMS message. */
  @js.native
  sealed trait message
    extends StObject
       with ContactAnnotationOperations
  
  /** None */
  @js.native
  sealed trait none
    extends StObject
       with ContactAnnotationOperations
  
  /** Access social media feeds. */
  @js.native
  sealed trait socialFeeds
    extends StObject
       with ContactAnnotationOperations
  
  /** Make a video call. */
  @js.native
  sealed trait videoCall
    extends StObject
       with ContactAnnotationOperations
}
