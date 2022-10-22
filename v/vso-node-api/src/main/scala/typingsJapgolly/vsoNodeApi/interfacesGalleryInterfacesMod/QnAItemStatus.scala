package typingsJapgolly.vsoNodeApi.interfacesGalleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait QnAItemStatus extends StObject
@JSImport("vso-node-api/interfaces/GalleryInterfaces", "QnAItemStatus")
@js.native
object QnAItemStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[QnAItemStatus & Double] = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with QnAItemStatus
  /* 0 */ val None: typingsJapgolly.vsoNodeApi.interfacesGalleryInterfacesMod.QnAItemStatus.None & Double = js.native
  
  /**
    * The PublisherCreated flag indicates whether the item has been created by extension publisher.
    */
  @js.native
  sealed trait PublisherCreated
    extends StObject
       with QnAItemStatus
  /* 2 */ val PublisherCreated: typingsJapgolly.vsoNodeApi.interfacesGalleryInterfacesMod.QnAItemStatus.PublisherCreated & Double = js.native
  
  /**
    * The UserEditable flag indicates whether the item is editable by the logged in user.
    */
  @js.native
  sealed trait UserEditable
    extends StObject
       with QnAItemStatus
  /* 1 */ val UserEditable: typingsJapgolly.vsoNodeApi.interfacesGalleryInterfacesMod.QnAItemStatus.UserEditable & Double = js.native
}
