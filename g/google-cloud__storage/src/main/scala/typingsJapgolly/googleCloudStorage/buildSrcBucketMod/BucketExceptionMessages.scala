package typingsJapgolly.googleCloudStorage.buildSrcBucketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BucketExceptionMessages extends StObject
@JSImport("@google-cloud/storage/build/src/bucket", "BucketExceptionMessages")
@js.native
object BucketExceptionMessages extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BucketExceptionMessages & String] = js.native
  
  @js.native
  sealed trait CHANNEL_ADDRESS_REQUIRED
    extends StObject
       with BucketExceptionMessages
  /* "An address is required to create a channel." */ val CHANNEL_ADDRESS_REQUIRED: typingsJapgolly.googleCloudStorage.buildSrcBucketMod.BucketExceptionMessages.CHANNEL_ADDRESS_REQUIRED & String = js.native
  
  @js.native
  sealed trait CHANNEL_ID_REQUIRED
    extends StObject
       with BucketExceptionMessages
  /* "An ID is required to create a channel." */ val CHANNEL_ID_REQUIRED: typingsJapgolly.googleCloudStorage.buildSrcBucketMod.BucketExceptionMessages.CHANNEL_ID_REQUIRED & String = js.native
  
  @js.native
  sealed trait CONFIGURATION_OBJECT_PREFIX_REQUIRED
    extends StObject
       with BucketExceptionMessages
  /* "A configuration object with a prefix is required." */ val CONFIGURATION_OBJECT_PREFIX_REQUIRED: typingsJapgolly.googleCloudStorage.buildSrcBucketMod.BucketExceptionMessages.CONFIGURATION_OBJECT_PREFIX_REQUIRED & String = js.native
  
  @js.native
  sealed trait DESTINATION_FILE_NOT_SPECIFIED
    extends StObject
       with BucketExceptionMessages
  /* "A destination file must be specified." */ val DESTINATION_FILE_NOT_SPECIFIED: typingsJapgolly.googleCloudStorage.buildSrcBucketMod.BucketExceptionMessages.DESTINATION_FILE_NOT_SPECIFIED & String = js.native
  
  @js.native
  sealed trait METAGENERATION_NOT_PROVIDED
    extends StObject
       with BucketExceptionMessages
  /* "A metageneration must be provided." */ val METAGENERATION_NOT_PROVIDED: typingsJapgolly.googleCloudStorage.buildSrcBucketMod.BucketExceptionMessages.METAGENERATION_NOT_PROVIDED & String = js.native
  
  @js.native
  sealed trait PROVIDE_SOURCE_FILE
    extends StObject
       with BucketExceptionMessages
  /* "You must provide at least one source file." */ val PROVIDE_SOURCE_FILE: typingsJapgolly.googleCloudStorage.buildSrcBucketMod.BucketExceptionMessages.PROVIDE_SOURCE_FILE & String = js.native
  
  @js.native
  sealed trait SPECIFY_FILE_NAME
    extends StObject
       with BucketExceptionMessages
  /* "A file name must be specified." */ val SPECIFY_FILE_NAME: typingsJapgolly.googleCloudStorage.buildSrcBucketMod.BucketExceptionMessages.SPECIFY_FILE_NAME & String = js.native
  
  @js.native
  sealed trait SUPPLY_NOTIFICATION_ID
    extends StObject
       with BucketExceptionMessages
  /* "You must supply a notification ID." */ val SUPPLY_NOTIFICATION_ID: typingsJapgolly.googleCloudStorage.buildSrcBucketMod.BucketExceptionMessages.SUPPLY_NOTIFICATION_ID & String = js.native
  
  @js.native
  sealed trait TOPIC_NAME_REQUIRED
    extends StObject
       with BucketExceptionMessages
  /* "A valid topic name is required." */ val TOPIC_NAME_REQUIRED: typingsJapgolly.googleCloudStorage.buildSrcBucketMod.BucketExceptionMessages.TOPIC_NAME_REQUIRED & String = js.native
}
