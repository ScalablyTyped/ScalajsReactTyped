package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object comprehendmedicalMod {
  type AnyLengthString = java.lang.String
  type AttributeList = js.Array[typingsJapgolly.awsSdk.comprehendmedicalMod.Attribute]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SIGN
    - typingsJapgolly.awsSdk.awsSdkStrings.SYMPTOM
    - typingsJapgolly.awsSdk.awsSdkStrings.DIAGNOSIS
    - typingsJapgolly.awsSdk.awsSdkStrings.NEGATION
    - java.lang.String
  */
  type AttributeName = typingsJapgolly.awsSdk.comprehendmedicalMod._AttributeName | java.lang.String
  type BoundedLengthString = java.lang.String
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.comprehendmedicalMod.ClientApiVersions
  type ClientRequestTokenString = java.lang.String
  type ComprehendMedicalAsyncJobPropertiesList = js.Array[typingsJapgolly.awsSdk.comprehendmedicalMod.ComprehendMedicalAsyncJobProperties]
  type EntityList = js.Array[typingsJapgolly.awsSdk.comprehendmedicalMod.Entity]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.NAME
    - typingsJapgolly.awsSdk.awsSdkStrings.DOSAGE
    - typingsJapgolly.awsSdk.awsSdkStrings.ROUTE_OR_MODE
    - typingsJapgolly.awsSdk.awsSdkStrings.FORM
    - typingsJapgolly.awsSdk.awsSdkStrings.FREQUENCY
    - typingsJapgolly.awsSdk.awsSdkStrings.DURATION
    - typingsJapgolly.awsSdk.awsSdkStrings.GENERIC_NAME
    - typingsJapgolly.awsSdk.awsSdkStrings.BRAND_NAME
    - typingsJapgolly.awsSdk.awsSdkStrings.STRENGTH
    - typingsJapgolly.awsSdk.awsSdkStrings.RATE
    - typingsJapgolly.awsSdk.awsSdkStrings.ACUITY
    - typingsJapgolly.awsSdk.awsSdkStrings.TEST_NAME
    - typingsJapgolly.awsSdk.awsSdkStrings.TEST_VALUE
    - typingsJapgolly.awsSdk.awsSdkStrings.TEST_UNITS
    - typingsJapgolly.awsSdk.awsSdkStrings.PROCEDURE_NAME
    - typingsJapgolly.awsSdk.awsSdkStrings.TREATMENT_NAME
    - typingsJapgolly.awsSdk.awsSdkStrings.DATE
    - typingsJapgolly.awsSdk.awsSdkStrings.AGE
    - typingsJapgolly.awsSdk.awsSdkStrings.CONTACT_POINT
    - typingsJapgolly.awsSdk.awsSdkStrings.EMAIL
    - typingsJapgolly.awsSdk.awsSdkStrings.IDENTIFIER
    - typingsJapgolly.awsSdk.awsSdkStrings.URL
    - typingsJapgolly.awsSdk.awsSdkStrings.ADDRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.PROFESSION
    - typingsJapgolly.awsSdk.awsSdkStrings.SYSTEM_ORGAN_SITE
    - typingsJapgolly.awsSdk.awsSdkStrings.DIRECTION
    - typingsJapgolly.awsSdk.awsSdkStrings.QUALITY
    - typingsJapgolly.awsSdk.awsSdkStrings.QUANTITY
    - java.lang.String
  */
  type EntitySubType = typingsJapgolly.awsSdk.comprehendmedicalMod._EntitySubType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.MEDICATION
    - typingsJapgolly.awsSdk.awsSdkStrings.MEDICAL_CONDITION
    - typingsJapgolly.awsSdk.awsSdkStrings.PROTECTED_HEALTH_INFORMATION
    - typingsJapgolly.awsSdk.awsSdkStrings.TEST_TREATMENT_PROCEDURE
    - typingsJapgolly.awsSdk.awsSdkStrings.ANATOMY
    - java.lang.String
  */
  type EntityType = typingsJapgolly.awsSdk.comprehendmedicalMod._EntityType | java.lang.String
  type Float = scala.Double
  type ICD10CMAttributeList = js.Array[typingsJapgolly.awsSdk.comprehendmedicalMod.ICD10CMAttribute]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ACUITY
    - typingsJapgolly.awsSdk.awsSdkStrings.DIRECTION
    - typingsJapgolly.awsSdk.awsSdkStrings.SYSTEM_ORGAN_SITE
    - typingsJapgolly.awsSdk.awsSdkStrings.QUALITY
    - typingsJapgolly.awsSdk.awsSdkStrings.QUANTITY
    - java.lang.String
  */
  type ICD10CMAttributeType = typingsJapgolly.awsSdk.comprehendmedicalMod._ICD10CMAttributeType | java.lang.String
  type ICD10CMConceptList = js.Array[typingsJapgolly.awsSdk.comprehendmedicalMod.ICD10CMConcept]
  type ICD10CMEntityCategory = typingsJapgolly.awsSdk.awsSdkStrings.MEDICAL_CONDITION | java.lang.String
  type ICD10CMEntityList = js.Array[typingsJapgolly.awsSdk.comprehendmedicalMod.ICD10CMEntity]
  type ICD10CMEntityType = typingsJapgolly.awsSdk.awsSdkStrings.DX_NAME | java.lang.String
  type ICD10CMTraitList = js.Array[typingsJapgolly.awsSdk.comprehendmedicalMod.ICD10CMTrait]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.NEGATION
    - typingsJapgolly.awsSdk.awsSdkStrings.DIAGNOSIS
    - typingsJapgolly.awsSdk.awsSdkStrings.SIGN
    - typingsJapgolly.awsSdk.awsSdkStrings.SYMPTOM
    - java.lang.String
  */
  type ICD10CMTraitName = typingsJapgolly.awsSdk.comprehendmedicalMod._ICD10CMTraitName | java.lang.String
  type IamRoleArn = java.lang.String
  type Integer = scala.Double
  type JobId = java.lang.String
  type JobName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SUBMITTED
    - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
    - typingsJapgolly.awsSdk.awsSdkStrings.PARTIAL_SUCCESS
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.STOP_REQUESTED
    - typingsJapgolly.awsSdk.awsSdkStrings.STOPPED
    - java.lang.String
  */
  type JobStatus = typingsJapgolly.awsSdk.comprehendmedicalMod._JobStatus | java.lang.String
  type KMSKey = java.lang.String
  type LanguageCode = typingsJapgolly.awsSdk.awsSdkStrings.en | java.lang.String
  type ManifestFilePath = java.lang.String
  type MaxResultsInteger = scala.Double
  type ModelVersion = java.lang.String
  type OntologyLinkingBoundedLengthString = java.lang.String
  type RxNormAttributeList = js.Array[typingsJapgolly.awsSdk.comprehendmedicalMod.RxNormAttribute]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.DOSAGE
    - typingsJapgolly.awsSdk.awsSdkStrings.DURATION
    - typingsJapgolly.awsSdk.awsSdkStrings.FORM
    - typingsJapgolly.awsSdk.awsSdkStrings.FREQUENCY
    - typingsJapgolly.awsSdk.awsSdkStrings.RATE
    - typingsJapgolly.awsSdk.awsSdkStrings.ROUTE_OR_MODE
    - typingsJapgolly.awsSdk.awsSdkStrings.STRENGTH
    - java.lang.String
  */
  type RxNormAttributeType = typingsJapgolly.awsSdk.comprehendmedicalMod._RxNormAttributeType | java.lang.String
  type RxNormConceptList = js.Array[typingsJapgolly.awsSdk.comprehendmedicalMod.RxNormConcept]
  type RxNormEntityCategory = typingsJapgolly.awsSdk.awsSdkStrings.MEDICATION | java.lang.String
  type RxNormEntityList = js.Array[typingsJapgolly.awsSdk.comprehendmedicalMod.RxNormEntity]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.BRAND_NAME
    - typingsJapgolly.awsSdk.awsSdkStrings.GENERIC_NAME
    - java.lang.String
  */
  type RxNormEntityType = typingsJapgolly.awsSdk.comprehendmedicalMod._RxNormEntityType | java.lang.String
  type RxNormTraitList = js.Array[typingsJapgolly.awsSdk.comprehendmedicalMod.RxNormTrait]
  type RxNormTraitName = typingsJapgolly.awsSdk.awsSdkStrings.NEGATION | java.lang.String
  type S3Bucket = java.lang.String
  type S3Key = java.lang.String
  type String = java.lang.String
  type Timestamp = js.Date
  type TraitList = js.Array[typingsJapgolly.awsSdk.comprehendmedicalMod.Trait]
  type UnmappedAttributeList = js.Array[typingsJapgolly.awsSdk.comprehendmedicalMod.UnmappedAttribute]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2018-10-30`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.comprehendmedicalMod._apiVersion | java.lang.String
}
