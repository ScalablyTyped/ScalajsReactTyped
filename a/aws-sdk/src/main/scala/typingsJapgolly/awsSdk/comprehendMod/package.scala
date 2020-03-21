package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object comprehendMod {
  type AnyLengthString = java.lang.String
  type BatchItemErrorList = js.Array[typingsJapgolly.awsSdk.comprehendMod.BatchItemError]
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.comprehendMod.ClientApiVersions
  type ClientRequestTokenString = java.lang.String
  type ComprehendArn = java.lang.String
  type ComprehendArnName = java.lang.String
  type ComprehendEndpointArn = java.lang.String
  type ComprehendEndpointName = java.lang.String
  type ComprehendModelArn = java.lang.String
  type DocumentClassificationJobPropertiesList = js.Array[typingsJapgolly.awsSdk.comprehendMod.DocumentClassificationJobProperties]
  type DocumentClassifierArn = java.lang.String
  type DocumentClassifierEndpointArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.MULTI_CLASS
    - typingsJapgolly.awsSdk.awsSdkStrings.MULTI_LABEL
    - java.lang.String
  */
  type DocumentClassifierMode = typingsJapgolly.awsSdk.comprehendMod._DocumentClassifierMode | java.lang.String
  type DocumentClassifierPropertiesList = js.Array[typingsJapgolly.awsSdk.comprehendMod.DocumentClassifierProperties]
  type DominantLanguageDetectionJobPropertiesList = js.Array[typingsJapgolly.awsSdk.comprehendMod.DominantLanguageDetectionJobProperties]
  type Double = scala.Double
  type EndpointPropertiesList = js.Array[typingsJapgolly.awsSdk.comprehendMod.EndpointProperties]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.IN_SERVICE
    - typingsJapgolly.awsSdk.awsSdkStrings.UPDATING
    - java.lang.String
  */
  type EndpointStatus = typingsJapgolly.awsSdk.comprehendMod._EndpointStatus | java.lang.String
  type EntitiesDetectionJobPropertiesList = js.Array[typingsJapgolly.awsSdk.comprehendMod.EntitiesDetectionJobProperties]
  type EntityRecognizerArn = java.lang.String
  type EntityRecognizerMetadataEntityTypesList = js.Array[typingsJapgolly.awsSdk.comprehendMod.EntityRecognizerMetadataEntityTypesListItem]
  type EntityRecognizerPropertiesList = js.Array[typingsJapgolly.awsSdk.comprehendMod.EntityRecognizerProperties]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PERSON
    - typingsJapgolly.awsSdk.awsSdkStrings.LOCATION
    - typingsJapgolly.awsSdk.awsSdkStrings.ORGANIZATION
    - typingsJapgolly.awsSdk.awsSdkStrings.COMMERCIAL_ITEM
    - typingsJapgolly.awsSdk.awsSdkStrings.EVENT
    - typingsJapgolly.awsSdk.awsSdkStrings.DATE
    - typingsJapgolly.awsSdk.awsSdkStrings.QUANTITY
    - typingsJapgolly.awsSdk.awsSdkStrings.TITLE
    - typingsJapgolly.awsSdk.awsSdkStrings.OTHER
    - java.lang.String
  */
  type EntityType = typingsJapgolly.awsSdk.comprehendMod._EntityType | java.lang.String
  type EntityTypeName = java.lang.String
  type EntityTypesList = js.Array[typingsJapgolly.awsSdk.comprehendMod.EntityTypesListItem]
  type Float = scala.Double
  type IamRoleArn = java.lang.String
  type InferenceUnitsInteger = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ONE_DOC_PER_FILE
    - typingsJapgolly.awsSdk.awsSdkStrings.ONE_DOC_PER_LINE
    - java.lang.String
  */
  type InputFormat = typingsJapgolly.awsSdk.comprehendMod._InputFormat | java.lang.String
  type Integer = scala.Double
  type JobId = java.lang.String
  type JobName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SUBMITTED
    - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.STOP_REQUESTED
    - typingsJapgolly.awsSdk.awsSdkStrings.STOPPED
    - java.lang.String
  */
  type JobStatus = typingsJapgolly.awsSdk.comprehendMod._JobStatus | java.lang.String
  type KeyPhrasesDetectionJobPropertiesList = js.Array[typingsJapgolly.awsSdk.comprehendMod.KeyPhrasesDetectionJobProperties]
  type KmsKeyId = java.lang.String
  type LabelDelimiter = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.en
    - typingsJapgolly.awsSdk.awsSdkStrings.es_
    - typingsJapgolly.awsSdk.awsSdkStrings.fr_
    - typingsJapgolly.awsSdk.awsSdkStrings.de_
    - typingsJapgolly.awsSdk.awsSdkStrings.it_
    - typingsJapgolly.awsSdk.awsSdkStrings.pt_
    - typingsJapgolly.awsSdk.awsSdkStrings.ar_
    - typingsJapgolly.awsSdk.awsSdkStrings.hi
    - typingsJapgolly.awsSdk.awsSdkStrings.ja
    - typingsJapgolly.awsSdk.awsSdkStrings.ko
    - typingsJapgolly.awsSdk.awsSdkStrings.zh
    - typingsJapgolly.awsSdk.awsSdkStrings.`zh-TW`
    - java.lang.String
  */
  type LanguageCode = typingsJapgolly.awsSdk.comprehendMod._LanguageCode | java.lang.String
  type ListOfClasses = js.Array[typingsJapgolly.awsSdk.comprehendMod.DocumentClass]
  type ListOfDetectDominantLanguageResult = js.Array[typingsJapgolly.awsSdk.comprehendMod.BatchDetectDominantLanguageItemResult]
  type ListOfDetectEntitiesResult = js.Array[typingsJapgolly.awsSdk.comprehendMod.BatchDetectEntitiesItemResult]
  type ListOfDetectKeyPhrasesResult = js.Array[typingsJapgolly.awsSdk.comprehendMod.BatchDetectKeyPhrasesItemResult]
  type ListOfDetectSentimentResult = js.Array[typingsJapgolly.awsSdk.comprehendMod.BatchDetectSentimentItemResult]
  type ListOfDetectSyntaxResult = js.Array[typingsJapgolly.awsSdk.comprehendMod.BatchDetectSyntaxItemResult]
  type ListOfDominantLanguages = js.Array[typingsJapgolly.awsSdk.comprehendMod.DominantLanguage]
  type ListOfEntities = js.Array[typingsJapgolly.awsSdk.comprehendMod.Entity]
  type ListOfKeyPhrases = js.Array[typingsJapgolly.awsSdk.comprehendMod.KeyPhrase]
  type ListOfLabels = js.Array[typingsJapgolly.awsSdk.comprehendMod.DocumentLabel]
  type ListOfSyntaxTokens = js.Array[typingsJapgolly.awsSdk.comprehendMod.SyntaxToken]
  type MaxResultsInteger = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SUBMITTED
    - typingsJapgolly.awsSdk.awsSdkStrings.TRAINING
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
    - typingsJapgolly.awsSdk.awsSdkStrings.STOP_REQUESTED
    - typingsJapgolly.awsSdk.awsSdkStrings.STOPPED
    - typingsJapgolly.awsSdk.awsSdkStrings.IN_ERROR
    - typingsJapgolly.awsSdk.awsSdkStrings.TRAINED
    - java.lang.String
  */
  type ModelStatus = typingsJapgolly.awsSdk.comprehendMod._ModelStatus | java.lang.String
  type NumberOfTopicsInteger = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ADJ
    - typingsJapgolly.awsSdk.awsSdkStrings.ADP
    - typingsJapgolly.awsSdk.awsSdkStrings.ADV
    - typingsJapgolly.awsSdk.awsSdkStrings.AUX
    - typingsJapgolly.awsSdk.awsSdkStrings.CONJ
    - typingsJapgolly.awsSdk.awsSdkStrings.CCONJ
    - typingsJapgolly.awsSdk.awsSdkStrings.DET
    - typingsJapgolly.awsSdk.awsSdkStrings.INTJ
    - typingsJapgolly.awsSdk.awsSdkStrings.NOUN
    - typingsJapgolly.awsSdk.awsSdkStrings.NUM
    - typingsJapgolly.awsSdk.awsSdkStrings.O
    - typingsJapgolly.awsSdk.awsSdkStrings.PART
    - typingsJapgolly.awsSdk.awsSdkStrings.PRON
    - typingsJapgolly.awsSdk.awsSdkStrings.PROPN
    - typingsJapgolly.awsSdk.awsSdkStrings.PUNCT
    - typingsJapgolly.awsSdk.awsSdkStrings.SCONJ
    - typingsJapgolly.awsSdk.awsSdkStrings.SYM
    - typingsJapgolly.awsSdk.awsSdkStrings.VERB
    - java.lang.String
  */
  type PartOfSpeechTagType = typingsJapgolly.awsSdk.comprehendMod._PartOfSpeechTagType | java.lang.String
  type S3Uri = java.lang.String
  type SecurityGroupId = java.lang.String
  type SecurityGroupIds = js.Array[typingsJapgolly.awsSdk.comprehendMod.SecurityGroupId]
  type SentimentDetectionJobPropertiesList = js.Array[typingsJapgolly.awsSdk.comprehendMod.SentimentDetectionJobProperties]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.POSITIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.NEGATIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.NEUTRAL
    - typingsJapgolly.awsSdk.awsSdkStrings.MIXED
    - java.lang.String
  */
  type SentimentType = typingsJapgolly.awsSdk.comprehendMod._SentimentType | java.lang.String
  type String = java.lang.String
  type StringList = js.Array[typingsJapgolly.awsSdk.comprehendMod.String]
  type SubnetId = java.lang.String
  type Subnets = js.Array[typingsJapgolly.awsSdk.comprehendMod.SubnetId]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.en
    - typingsJapgolly.awsSdk.awsSdkStrings.es_
    - typingsJapgolly.awsSdk.awsSdkStrings.fr_
    - typingsJapgolly.awsSdk.awsSdkStrings.de_
    - typingsJapgolly.awsSdk.awsSdkStrings.it_
    - typingsJapgolly.awsSdk.awsSdkStrings.pt_
    - java.lang.String
  */
  type SyntaxLanguageCode = typingsJapgolly.awsSdk.comprehendMod._SyntaxLanguageCode | java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsJapgolly.awsSdk.comprehendMod.TagKey]
  type TagList = js.Array[typingsJapgolly.awsSdk.comprehendMod.Tag]
  type TagValue = java.lang.String
  type Timestamp = js.Date
  type TopicsDetectionJobPropertiesList = js.Array[typingsJapgolly.awsSdk.comprehendMod.TopicsDetectionJobProperties]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2017-11-27`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.comprehendMod._apiVersion | java.lang.String
}
