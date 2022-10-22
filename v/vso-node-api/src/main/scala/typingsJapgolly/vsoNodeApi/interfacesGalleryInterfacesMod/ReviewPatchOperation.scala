package typingsJapgolly.vsoNodeApi.interfacesGalleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReviewPatchOperation extends StObject
@JSImport("vso-node-api/interfaces/GalleryInterfaces", "ReviewPatchOperation")
@js.native
object ReviewPatchOperation extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReviewPatchOperation & Double] = js.native
  
  /**
    * Submit an admin response
    */
  @js.native
  sealed trait AdminResponseForReview
    extends StObject
       with ReviewPatchOperation
  /* 4 */ val AdminResponseForReview: typingsJapgolly.vsoNodeApi.interfacesGalleryInterfacesMod.ReviewPatchOperation.AdminResponseForReview & Double = js.native
  
  /**
    * Delete an Admin Reply
    */
  @js.native
  sealed trait DeleteAdminReply
    extends StObject
       with ReviewPatchOperation
  /* 5 */ val DeleteAdminReply: typingsJapgolly.vsoNodeApi.interfacesGalleryInterfacesMod.ReviewPatchOperation.DeleteAdminReply & Double = js.native
  
  /**
    * Delete Publisher Reply
    */
  @js.native
  sealed trait DeletePublisherReply
    extends StObject
       with ReviewPatchOperation
  /* 6 */ val DeletePublisherReply: typingsJapgolly.vsoNodeApi.interfacesGalleryInterfacesMod.ReviewPatchOperation.DeletePublisherReply & Double = js.native
  
  /**
    * Flag a review
    */
  @js.native
  sealed trait FlagReview
    extends StObject
       with ReviewPatchOperation
  /* 1 */ val FlagReview: typingsJapgolly.vsoNodeApi.interfacesGalleryInterfacesMod.ReviewPatchOperation.FlagReview & Double = js.native
  
  /**
    * Submit a reply for a review
    */
  @js.native
  sealed trait ReplyToReview
    extends StObject
       with ReviewPatchOperation
  /* 3 */ val ReplyToReview: typingsJapgolly.vsoNodeApi.interfacesGalleryInterfacesMod.ReviewPatchOperation.ReplyToReview & Double = js.native
  
  /**
    * Update an existing review
    */
  @js.native
  sealed trait UpdateReview
    extends StObject
       with ReviewPatchOperation
  /* 2 */ val UpdateReview: typingsJapgolly.vsoNodeApi.interfacesGalleryInterfacesMod.ReviewPatchOperation.UpdateReview & Double = js.native
}
