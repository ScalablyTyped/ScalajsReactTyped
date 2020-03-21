package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object rekognitionMod {
  type Assets = js.Array[typingsJapgolly.awsSdk.rekognitionMod.Asset]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.DEFAULT
    - typingsJapgolly.awsSdk.awsSdkStrings.ALL
    - java.lang.String
  */
  type Attribute = typingsJapgolly.awsSdk.rekognitionMod._Attribute | java.lang.String
  type Attributes = js.Array[typingsJapgolly.awsSdk.rekognitionMod.Attribute]
  type Boolean = scala.Boolean
  type CelebrityList = js.Array[typingsJapgolly.awsSdk.rekognitionMod.Celebrity]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ID
    - typingsJapgolly.awsSdk.awsSdkStrings.TIMESTAMP
    - java.lang.String
  */
  type CelebrityRecognitionSortBy = typingsJapgolly.awsSdk.rekognitionMod._CelebrityRecognitionSortBy | java.lang.String
  type CelebrityRecognitions = js.Array[typingsJapgolly.awsSdk.rekognitionMod.CelebrityRecognition]
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.rekognitionMod.ClientApiVersions
  type ClientRequestToken = java.lang.String
  type CollectionId = java.lang.String
  type CollectionIdList = js.Array[typingsJapgolly.awsSdk.rekognitionMod.CollectionId]
  type CompareFacesMatchList = js.Array[typingsJapgolly.awsSdk.rekognitionMod.CompareFacesMatch]
  type CompareFacesUnmatchList = js.Array[typingsJapgolly.awsSdk.rekognitionMod.ComparedFace]
  type ComparedFaceList = js.Array[typingsJapgolly.awsSdk.rekognitionMod.ComparedFace]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.FreeOfPersonallyIdentifiableInformation
    - typingsJapgolly.awsSdk.awsSdkStrings.FreeOfAdultContent
    - java.lang.String
  */
  type ContentClassifier = typingsJapgolly.awsSdk.rekognitionMod._ContentClassifier | java.lang.String
  type ContentClassifiers = js.Array[typingsJapgolly.awsSdk.rekognitionMod.ContentClassifier]
  type ContentModerationDetections = js.Array[typingsJapgolly.awsSdk.rekognitionMod.ContentModerationDetection]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.NAME
    - typingsJapgolly.awsSdk.awsSdkStrings.TIMESTAMP
    - java.lang.String
  */
  type ContentModerationSortBy = typingsJapgolly.awsSdk.rekognitionMod._ContentModerationSortBy | java.lang.String
  type CustomLabels = js.Array[typingsJapgolly.awsSdk.rekognitionMod.CustomLabel]
  type DateTime = js.Date
  type Degree = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.HAPPY
    - typingsJapgolly.awsSdk.awsSdkStrings.SAD
    - typingsJapgolly.awsSdk.awsSdkStrings.ANGRY
    - typingsJapgolly.awsSdk.awsSdkStrings.CONFUSED
    - typingsJapgolly.awsSdk.awsSdkStrings.DISGUSTED
    - typingsJapgolly.awsSdk.awsSdkStrings.SURPRISED
    - typingsJapgolly.awsSdk.awsSdkStrings.CALM
    - typingsJapgolly.awsSdk.awsSdkStrings.UNKNOWN
    - typingsJapgolly.awsSdk.awsSdkStrings.FEAR
    - java.lang.String
  */
  type EmotionName = typingsJapgolly.awsSdk.rekognitionMod._EmotionName | java.lang.String
  type Emotions = js.Array[typingsJapgolly.awsSdk.rekognitionMod.Emotion]
  type ExtendedPaginationToken = java.lang.String
  type ExternalImageId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.DEFAULT
    - typingsJapgolly.awsSdk.awsSdkStrings.ALL
    - java.lang.String
  */
  type FaceAttributes = typingsJapgolly.awsSdk.rekognitionMod._FaceAttributes | java.lang.String
  type FaceDetailList = js.Array[typingsJapgolly.awsSdk.rekognitionMod.FaceDetail]
  type FaceDetections = js.Array[typingsJapgolly.awsSdk.rekognitionMod.FaceDetection]
  type FaceId = java.lang.String
  type FaceIdList = js.Array[typingsJapgolly.awsSdk.rekognitionMod.FaceId]
  type FaceList = js.Array[typingsJapgolly.awsSdk.rekognitionMod.Face]
  type FaceMatchList = js.Array[typingsJapgolly.awsSdk.rekognitionMod.FaceMatch]
  type FaceModelVersionList = js.Array[typingsJapgolly.awsSdk.rekognitionMod.String]
  type FaceRecordList = js.Array[typingsJapgolly.awsSdk.rekognitionMod.FaceRecord]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.INDEX
    - typingsJapgolly.awsSdk.awsSdkStrings.TIMESTAMP
    - java.lang.String
  */
  type FaceSearchSortBy = typingsJapgolly.awsSdk.rekognitionMod._FaceSearchSortBy | java.lang.String
  type Float = scala.Double
  type FlowDefinitionArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Male
    - typingsJapgolly.awsSdk.awsSdkStrings.Female
    - java.lang.String
  */
  type GenderType = typingsJapgolly.awsSdk.rekognitionMod._GenderType | java.lang.String
  type HumanLoopActivationConditionsEvaluationResults = java.lang.String
  type HumanLoopActivationReason = java.lang.String
  type HumanLoopActivationReasons = js.Array[typingsJapgolly.awsSdk.rekognitionMod.HumanLoopActivationReason]
  type HumanLoopArn = java.lang.String
  type HumanLoopName = java.lang.String
  type ImageBlob = typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | typingsJapgolly.awsSdk.rekognitionMod.Blob | java.lang.String
  type ImageId = java.lang.String
  type InferenceUnits = scala.Double
  type Instances = js.Array[typingsJapgolly.awsSdk.rekognitionMod.Instance]
  type JobId = java.lang.String
  type JobTag = java.lang.String
  type KinesisDataArn = java.lang.String
  type KinesisVideoArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.NAME
    - typingsJapgolly.awsSdk.awsSdkStrings.TIMESTAMP
    - java.lang.String
  */
  type LabelDetectionSortBy = typingsJapgolly.awsSdk.rekognitionMod._LabelDetectionSortBy | java.lang.String
  type LabelDetections = js.Array[typingsJapgolly.awsSdk.rekognitionMod.LabelDetection]
  type Labels = js.Array[typingsJapgolly.awsSdk.rekognitionMod.Label]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.eyeLeft
    - typingsJapgolly.awsSdk.awsSdkStrings.eyeRight
    - typingsJapgolly.awsSdk.awsSdkStrings.nose
    - typingsJapgolly.awsSdk.awsSdkStrings.mouthLeft
    - typingsJapgolly.awsSdk.awsSdkStrings.mouthRight
    - typingsJapgolly.awsSdk.awsSdkStrings.leftEyeBrowLeft
    - typingsJapgolly.awsSdk.awsSdkStrings.leftEyeBrowRight
    - typingsJapgolly.awsSdk.awsSdkStrings.leftEyeBrowUp
    - typingsJapgolly.awsSdk.awsSdkStrings.rightEyeBrowLeft
    - typingsJapgolly.awsSdk.awsSdkStrings.rightEyeBrowRight
    - typingsJapgolly.awsSdk.awsSdkStrings.rightEyeBrowUp
    - typingsJapgolly.awsSdk.awsSdkStrings.leftEyeLeft
    - typingsJapgolly.awsSdk.awsSdkStrings.leftEyeRight
    - typingsJapgolly.awsSdk.awsSdkStrings.leftEyeUp
    - typingsJapgolly.awsSdk.awsSdkStrings.leftEyeDown
    - typingsJapgolly.awsSdk.awsSdkStrings.rightEyeLeft
    - typingsJapgolly.awsSdk.awsSdkStrings.rightEyeRight
    - typingsJapgolly.awsSdk.awsSdkStrings.rightEyeUp
    - typingsJapgolly.awsSdk.awsSdkStrings.rightEyeDown
    - typingsJapgolly.awsSdk.awsSdkStrings.noseLeft
    - typingsJapgolly.awsSdk.awsSdkStrings.noseRight
    - typingsJapgolly.awsSdk.awsSdkStrings.mouthUp
    - typingsJapgolly.awsSdk.awsSdkStrings.mouthDown
    - typingsJapgolly.awsSdk.awsSdkStrings.leftPupil
    - typingsJapgolly.awsSdk.awsSdkStrings.rightPupil
    - typingsJapgolly.awsSdk.awsSdkStrings.upperJawlineLeft
    - typingsJapgolly.awsSdk.awsSdkStrings.midJawlineLeft
    - typingsJapgolly.awsSdk.awsSdkStrings.chinBottom
    - typingsJapgolly.awsSdk.awsSdkStrings.midJawlineRight
    - typingsJapgolly.awsSdk.awsSdkStrings.upperJawlineRight
    - java.lang.String
  */
  type LandmarkType = typingsJapgolly.awsSdk.rekognitionMod._LandmarkType | java.lang.String
  type Landmarks = js.Array[typingsJapgolly.awsSdk.rekognitionMod.Landmark]
  type MaxFaces = scala.Double
  type MaxFacesToIndex = scala.Double
  type MaxResults = scala.Double
  type ModerationLabels = js.Array[typingsJapgolly.awsSdk.rekognitionMod.ModerationLabel]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ROTATE_0
    - typingsJapgolly.awsSdk.awsSdkStrings.ROTATE_90
    - typingsJapgolly.awsSdk.awsSdkStrings.ROTATE_180
    - typingsJapgolly.awsSdk.awsSdkStrings.ROTATE_270
    - java.lang.String
  */
  type OrientationCorrection = typingsJapgolly.awsSdk.rekognitionMod._OrientationCorrection | java.lang.String
  type PageSize = scala.Double
  type PaginationToken = java.lang.String
  type Parents = js.Array[typingsJapgolly.awsSdk.rekognitionMod.Parent]
  type Percent = scala.Double
  type PersonDetections = js.Array[typingsJapgolly.awsSdk.rekognitionMod.PersonDetection]
  type PersonIndex = scala.Double
  type PersonMatches = js.Array[typingsJapgolly.awsSdk.rekognitionMod.PersonMatch]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.INDEX
    - typingsJapgolly.awsSdk.awsSdkStrings.TIMESTAMP
    - java.lang.String
  */
  type PersonTrackingSortBy = typingsJapgolly.awsSdk.rekognitionMod._PersonTrackingSortBy | java.lang.String
  type Polygon = js.Array[typingsJapgolly.awsSdk.rekognitionMod.Point]
  type ProjectArn = java.lang.String
  type ProjectDescriptions = js.Array[typingsJapgolly.awsSdk.rekognitionMod.ProjectDescription]
  type ProjectName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATED
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
    - java.lang.String
  */
  type ProjectStatus = typingsJapgolly.awsSdk.rekognitionMod._ProjectStatus | java.lang.String
  type ProjectVersionArn = java.lang.String
  type ProjectVersionDescriptions = js.Array[typingsJapgolly.awsSdk.rekognitionMod.ProjectVersionDescription]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.TRAINING_IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.TRAINING_COMPLETED
    - typingsJapgolly.awsSdk.awsSdkStrings.TRAINING_FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.STARTING
    - typingsJapgolly.awsSdk.awsSdkStrings.RUNNING
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.STOPPING
    - typingsJapgolly.awsSdk.awsSdkStrings.STOPPED
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
    - java.lang.String
  */
  type ProjectVersionStatus = typingsJapgolly.awsSdk.rekognitionMod._ProjectVersionStatus | java.lang.String
  type ProjectVersionsPageSize = scala.Double
  type ProjectsPageSize = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.NONE
    - typingsJapgolly.awsSdk.awsSdkStrings.AUTO
    - typingsJapgolly.awsSdk.awsSdkStrings.LOW
    - typingsJapgolly.awsSdk.awsSdkStrings.MEDIUM
    - typingsJapgolly.awsSdk.awsSdkStrings.HIGH
    - java.lang.String
  */
  type QualityFilter = typingsJapgolly.awsSdk.rekognitionMod._QualityFilter | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.EXCEEDS_MAX_FACES
    - typingsJapgolly.awsSdk.awsSdkStrings.EXTREME_POSE
    - typingsJapgolly.awsSdk.awsSdkStrings.LOW_BRIGHTNESS
    - typingsJapgolly.awsSdk.awsSdkStrings.LOW_SHARPNESS
    - typingsJapgolly.awsSdk.awsSdkStrings.LOW_CONFIDENCE
    - typingsJapgolly.awsSdk.awsSdkStrings.SMALL_BOUNDING_BOX
    - typingsJapgolly.awsSdk.awsSdkStrings.LOW_FACE_QUALITY
    - java.lang.String
  */
  type Reason = typingsJapgolly.awsSdk.rekognitionMod._Reason | java.lang.String
  type Reasons = js.Array[typingsJapgolly.awsSdk.rekognitionMod.Reason]
  type RekognitionUniqueId = java.lang.String
  type RoleArn = java.lang.String
  type S3Bucket = java.lang.String
  type S3KeyPrefix = java.lang.String
  type S3ObjectName = java.lang.String
  type S3ObjectVersion = java.lang.String
  type SNSTopicArn = java.lang.String
  type StatusMessage = java.lang.String
  type StreamProcessorArn = java.lang.String
  type StreamProcessorList = js.Array[typingsJapgolly.awsSdk.rekognitionMod.StreamProcessor]
  type StreamProcessorName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.STOPPED
    - typingsJapgolly.awsSdk.awsSdkStrings.STARTING
    - typingsJapgolly.awsSdk.awsSdkStrings.RUNNING
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.STOPPING
    - java.lang.String
  */
  type StreamProcessorStatus = typingsJapgolly.awsSdk.rekognitionMod._StreamProcessorStatus | java.lang.String
  type String = java.lang.String
  type TextDetectionList = js.Array[typingsJapgolly.awsSdk.rekognitionMod.TextDetection]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.LINE
    - typingsJapgolly.awsSdk.awsSdkStrings.WORD
    - java.lang.String
  */
  type TextTypes = typingsJapgolly.awsSdk.rekognitionMod._TextTypes | java.lang.String
  type Timestamp = scala.Double
  type UInteger = scala.Double
  type ULong = scala.Double
  type UnindexedFaces = js.Array[typingsJapgolly.awsSdk.rekognitionMod.UnindexedFace]
  type Url = java.lang.String
  type Urls = js.Array[typingsJapgolly.awsSdk.rekognitionMod.Url]
  type VersionName = java.lang.String
  type VersionNames = js.Array[typingsJapgolly.awsSdk.rekognitionMod.VersionName]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEEDED
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type VideoJobStatus = typingsJapgolly.awsSdk.rekognitionMod._VideoJobStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2016-06-27`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.rekognitionMod._apiVersion | java.lang.String
}
