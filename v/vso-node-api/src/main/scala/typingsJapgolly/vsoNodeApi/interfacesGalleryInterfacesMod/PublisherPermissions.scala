package typingsJapgolly.vsoNodeApi.interfacesGalleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PublisherPermissions extends StObject
@JSImport("vso-node-api/interfaces/GalleryInterfaces", "PublisherPermissions")
@js.native
object PublisherPermissions extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PublisherPermissions & Double] = js.native
  
  /**
    * Admin gives the bearer the rights to manage restricted attributes of Publishers and Extensions.
    */
  @js.native
  sealed trait Admin
    extends StObject
       with PublisherPermissions
  /* 16 */ val Admin: typingsJapgolly.vsoNodeApi.interfacesGalleryInterfacesMod.PublisherPermissions.Admin & Double = js.native
  
  /**
    * This gives the bearer the rights to create new Publishers at the root of the namespace.
    */
  @js.native
  sealed trait CreatePublisher
    extends StObject
       with PublisherPermissions
  /* 4 */ val CreatePublisher: typingsJapgolly.vsoNodeApi.interfacesGalleryInterfacesMod.PublisherPermissions.CreatePublisher & Double = js.native
  
  /**
    * This gives the bearer the rights to delete any extension.
    */
  @js.native
  sealed trait DeleteExtension
    extends StObject
       with PublisherPermissions
  /* 128 */ val DeleteExtension: typingsJapgolly.vsoNodeApi.interfacesGalleryInterfacesMod.PublisherPermissions.DeleteExtension & Double = js.native
  
  /**
    * This gives the bearer the rights to delete the publisher.
    */
  @js.native
  sealed trait DeletePublisher
    extends StObject
       with PublisherPermissions
  /* 2048 */ val DeletePublisher: typingsJapgolly.vsoNodeApi.interfacesGalleryInterfacesMod.PublisherPermissions.DeletePublisher & Double = js.native
  
  /**
    * This gives the bearer the rights edit the publisher settings.
    */
  @js.native
  sealed trait EditSettings
    extends StObject
       with PublisherPermissions
  /* 256 */ val EditSettings: typingsJapgolly.vsoNodeApi.interfacesGalleryInterfacesMod.PublisherPermissions.EditSettings & Double = js.native
  
  /**
    * This gives the bearer the rights to assign permissions on the publisher.
    */
  @js.native
  sealed trait ManagePermissions
    extends StObject
       with PublisherPermissions
  /* 1024 */ val ManagePermissions: typingsJapgolly.vsoNodeApi.interfacesGalleryInterfacesMod.PublisherPermissions.ManagePermissions & Double = js.native
  
  /**
    * PrivateRead is another form of read designed to allow higher privilege accessors the ability to read private extensions.
    */
  @js.native
  sealed trait PrivateRead
    extends StObject
       with PublisherPermissions
  /* 64 */ val PrivateRead: typingsJapgolly.vsoNodeApi.interfacesGalleryInterfacesMod.PublisherPermissions.PrivateRead & Double = js.native
  
  /**
    * This gives the bearer the rights to create new Extensions within a publisher.
    */
  @js.native
  sealed trait PublishExtension
    extends StObject
       with PublisherPermissions
  /* 8 */ val PublishExtension: typingsJapgolly.vsoNodeApi.interfacesGalleryInterfacesMod.PublisherPermissions.PublishExtension & Double = js.native
  
  /**
    * This gives the bearer the rights to read Publishers and Extensions.
    */
  @js.native
  sealed trait Read
    extends StObject
       with PublisherPermissions
  /* 1 */ val Read: typingsJapgolly.vsoNodeApi.interfacesGalleryInterfacesMod.PublisherPermissions.Read & Double = js.native
  
  /**
    * TrustedPartner gives the bearer the rights to publish a extensions with restricted capabilities.
    */
  @js.native
  sealed trait TrustedPartner
    extends StObject
       with PublisherPermissions
  /* 32 */ val TrustedPartner: typingsJapgolly.vsoNodeApi.interfacesGalleryInterfacesMod.PublisherPermissions.TrustedPartner & Double = js.native
  
  /**
    * This gives the bearer the rights to update, delete, and share Extensions (but not the ability to create them).
    */
  @js.native
  sealed trait UpdateExtension
    extends StObject
       with PublisherPermissions
  /* 2 */ val UpdateExtension: typingsJapgolly.vsoNodeApi.interfacesGalleryInterfacesMod.PublisherPermissions.UpdateExtension & Double = js.native
  
  /**
    * This gives the bearer the rights to see all permissions on the publisher.
    */
  @js.native
  sealed trait ViewPermissions
    extends StObject
       with PublisherPermissions
  /* 512 */ val ViewPermissions: typingsJapgolly.vsoNodeApi.interfacesGalleryInterfacesMod.PublisherPermissions.ViewPermissions & Double = js.native
}
