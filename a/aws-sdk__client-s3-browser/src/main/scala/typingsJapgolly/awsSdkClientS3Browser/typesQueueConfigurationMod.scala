package typingsJapgolly.awsSdkClientS3Browser

import typingsJapgolly.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.s3ColonObjectCreatedColonAsterisk
import typingsJapgolly.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.s3ColonObjectCreatedColonCompleteMultipartUpload
import typingsJapgolly.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.s3ColonObjectCreatedColonCopy
import typingsJapgolly.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.s3ColonObjectCreatedColonPost
import typingsJapgolly.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.s3ColonObjectCreatedColonPut
import typingsJapgolly.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.s3ColonObjectRemovedColonAsterisk
import typingsJapgolly.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.s3ColonObjectRemovedColonDelete
import typingsJapgolly.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.s3ColonObjectRemovedColonDeleteMarkerCreated
import typingsJapgolly.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.s3ColonReducedRedundancyLostObject
import typingsJapgolly.awsSdkClientS3Browser.typesNotificationConfigurationFilterMod.NotificationConfigurationFilter
import typingsJapgolly.awsSdkClientS3Browser.typesNotificationConfigurationFilterMod.UnmarshalledNotificationConfigurationFilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesQueueConfigurationMod {
  
  trait QueueConfiguration extends StObject {
    
    /**
      * _EventList shape
      */
    var Events: (js.Array[
        s3ColonReducedRedundancyLostObject | s3ColonObjectCreatedColonAsterisk | s3ColonObjectCreatedColonPut | s3ColonObjectCreatedColonPost | s3ColonObjectCreatedColonCopy | s3ColonObjectCreatedColonCompleteMultipartUpload | s3ColonObjectRemovedColonAsterisk | s3ColonObjectRemovedColonDelete | s3ColonObjectRemovedColonDeleteMarkerCreated | String
      ]) | (js.Iterable[
        s3ColonReducedRedundancyLostObject | s3ColonObjectCreatedColonAsterisk | s3ColonObjectCreatedColonPut | s3ColonObjectCreatedColonPost | s3ColonObjectCreatedColonCopy | s3ColonObjectCreatedColonCompleteMultipartUpload | s3ColonObjectRemovedColonAsterisk | s3ColonObjectRemovedColonDelete | s3ColonObjectRemovedColonDeleteMarkerCreated | String
      ])
    
    /**
      * <p>Container for object key name filtering rules. For information about key name filtering, go to <a href="http://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html">Configuring Event Notifications</a> in the Amazon Simple Storage Service Developer Guide.</p>
      */
    var Filter: js.UndefOr[NotificationConfigurationFilter] = js.undefined
    
    /**
      * <p>Optional unique identifier for configurations in a notification configuration. If you don't provide one, Amazon S3 will assign an ID.</p>
      */
    var Id: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Amazon SQS queue ARN to which Amazon S3 will publish a message when it detects events of specified type.</p>
      */
    var QueueArn: String
  }
  object QueueConfiguration {
    
    inline def apply(
      Events: (js.Array[
          s3ColonReducedRedundancyLostObject | s3ColonObjectCreatedColonAsterisk | s3ColonObjectCreatedColonPut | s3ColonObjectCreatedColonPost | s3ColonObjectCreatedColonCopy | s3ColonObjectCreatedColonCompleteMultipartUpload | s3ColonObjectRemovedColonAsterisk | s3ColonObjectRemovedColonDelete | s3ColonObjectRemovedColonDeleteMarkerCreated | String
        ]) | (js.Iterable[
          s3ColonReducedRedundancyLostObject | s3ColonObjectCreatedColonAsterisk | s3ColonObjectCreatedColonPut | s3ColonObjectCreatedColonPost | s3ColonObjectCreatedColonCopy | s3ColonObjectCreatedColonCompleteMultipartUpload | s3ColonObjectRemovedColonAsterisk | s3ColonObjectRemovedColonDelete | s3ColonObjectRemovedColonDeleteMarkerCreated | String
        ]),
      QueueArn: String
    ): QueueConfiguration = {
      val __obj = js.Dynamic.literal(Events = Events.asInstanceOf[js.Any], QueueArn = QueueArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueueConfiguration]
    }
    
    extension [Self <: QueueConfiguration](x: Self) {
      
      inline def setEvents(
        value: (js.Array[
              s3ColonReducedRedundancyLostObject | s3ColonObjectCreatedColonAsterisk | s3ColonObjectCreatedColonPut | s3ColonObjectCreatedColonPost | s3ColonObjectCreatedColonCopy | s3ColonObjectCreatedColonCompleteMultipartUpload | s3ColonObjectRemovedColonAsterisk | s3ColonObjectRemovedColonDelete | s3ColonObjectRemovedColonDeleteMarkerCreated | String
            ]) | (js.Iterable[
              s3ColonReducedRedundancyLostObject | s3ColonObjectCreatedColonAsterisk | s3ColonObjectCreatedColonPut | s3ColonObjectCreatedColonPost | s3ColonObjectCreatedColonCopy | s3ColonObjectCreatedColonCompleteMultipartUpload | s3ColonObjectRemovedColonAsterisk | s3ColonObjectRemovedColonDelete | s3ColonObjectRemovedColonDeleteMarkerCreated | String
            ])
      ): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
      
      inline def setEventsVarargs(
        value: (s3ColonReducedRedundancyLostObject | s3ColonObjectCreatedColonAsterisk | s3ColonObjectCreatedColonPut | s3ColonObjectCreatedColonPost | s3ColonObjectCreatedColonCopy | s3ColonObjectCreatedColonCompleteMultipartUpload | s3ColonObjectRemovedColonAsterisk | s3ColonObjectRemovedColonDelete | s3ColonObjectRemovedColonDeleteMarkerCreated | String)*
      ): Self = StObject.set(x, "Events", js.Array(value*))
      
      inline def setFilter(value: NotificationConfigurationFilter): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
      
      inline def setQueueArn(value: String): Self = StObject.set(x, "QueueArn", value.asInstanceOf[js.Any])
    }
  }
  
  trait UnmarshalledQueueConfiguration
    extends StObject
       with QueueConfiguration {
    
    /**
      * _EventList shape
      */
    @JSName("Events")
    var Events_UnmarshalledQueueConfiguration: js.Array[
        s3ColonReducedRedundancyLostObject | s3ColonObjectCreatedColonAsterisk | s3ColonObjectCreatedColonPut | s3ColonObjectCreatedColonPost | s3ColonObjectCreatedColonCopy | s3ColonObjectCreatedColonCompleteMultipartUpload | s3ColonObjectRemovedColonAsterisk | s3ColonObjectRemovedColonDelete | s3ColonObjectRemovedColonDeleteMarkerCreated | String
      ]
    
    /**
      * <p>Container for object key name filtering rules. For information about key name filtering, go to <a href="http://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html">Configuring Event Notifications</a> in the Amazon Simple Storage Service Developer Guide.</p>
      */
    @JSName("Filter")
    var Filter_UnmarshalledQueueConfiguration: js.UndefOr[UnmarshalledNotificationConfigurationFilter] = js.undefined
  }
  object UnmarshalledQueueConfiguration {
    
    inline def apply(
      Events: js.Array[
          s3ColonReducedRedundancyLostObject | s3ColonObjectCreatedColonAsterisk | s3ColonObjectCreatedColonPut | s3ColonObjectCreatedColonPost | s3ColonObjectCreatedColonCopy | s3ColonObjectCreatedColonCompleteMultipartUpload | s3ColonObjectRemovedColonAsterisk | s3ColonObjectRemovedColonDelete | s3ColonObjectRemovedColonDeleteMarkerCreated | String
        ],
      QueueArn: String
    ): UnmarshalledQueueConfiguration = {
      val __obj = js.Dynamic.literal(Events = Events.asInstanceOf[js.Any], QueueArn = QueueArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledQueueConfiguration]
    }
    
    extension [Self <: UnmarshalledQueueConfiguration](x: Self) {
      
      inline def setEvents(
        value: js.Array[
              s3ColonReducedRedundancyLostObject | s3ColonObjectCreatedColonAsterisk | s3ColonObjectCreatedColonPut | s3ColonObjectCreatedColonPost | s3ColonObjectCreatedColonCopy | s3ColonObjectCreatedColonCompleteMultipartUpload | s3ColonObjectRemovedColonAsterisk | s3ColonObjectRemovedColonDelete | s3ColonObjectRemovedColonDeleteMarkerCreated | String
            ]
      ): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
      
      inline def setEventsVarargs(
        value: (s3ColonReducedRedundancyLostObject | s3ColonObjectCreatedColonAsterisk | s3ColonObjectCreatedColonPut | s3ColonObjectCreatedColonPost | s3ColonObjectCreatedColonCopy | s3ColonObjectCreatedColonCompleteMultipartUpload | s3ColonObjectRemovedColonAsterisk | s3ColonObjectRemovedColonDelete | s3ColonObjectRemovedColonDeleteMarkerCreated | String)*
      ): Self = StObject.set(x, "Events", js.Array(value*))
      
      inline def setFilter(value: UnmarshalledNotificationConfigurationFilter): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
    }
  }
}
