package typingsJapgolly.awsSdk.clientsComprehendmedicalMod

import typingsJapgolly.awsSdk.awsSdkStrings.MEDICAL_CONDITION
import typingsJapgolly.awsSdk.awsSdkStrings.MEDICATION
import typingsJapgolly.awsSdk.awsSdkStrings.NEGATION
import typingsJapgolly.awsSdk.awsSdkStrings.en_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AnyLengthString = java.lang.String

type AttributeList = js.Array[Attribute]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SIGN
  - typingsJapgolly.awsSdk.awsSdkStrings.SYMPTOM
  - typingsJapgolly.awsSdk.awsSdkStrings.DIAGNOSIS
  - typingsJapgolly.awsSdk.awsSdkStrings.NEGATION
  - java.lang.String
*/
type AttributeName = _AttributeName | java.lang.String

type BoundedLengthString = java.lang.String

type ClientRequestTokenString = java.lang.String

type ComprehendMedicalAsyncJobPropertiesList = js.Array[ComprehendMedicalAsyncJobProperties]

type EntityList = js.Array[Entity]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NAME
  - typingsJapgolly.awsSdk.awsSdkStrings.DX_NAME
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
  - typingsJapgolly.awsSdk.awsSdkStrings.TEST_UNIT
  - typingsJapgolly.awsSdk.awsSdkStrings.PROCEDURE_NAME
  - typingsJapgolly.awsSdk.awsSdkStrings.TREATMENT_NAME
  - typingsJapgolly.awsSdk.awsSdkStrings.DATE
  - typingsJapgolly.awsSdk.awsSdkStrings.AGE
  - typingsJapgolly.awsSdk.awsSdkStrings.CONTACT_POINT
  - typingsJapgolly.awsSdk.awsSdkStrings.PHONE_OR_FAX
  - typingsJapgolly.awsSdk.awsSdkStrings.EMAIL
  - typingsJapgolly.awsSdk.awsSdkStrings.IDENTIFIER
  - typingsJapgolly.awsSdk.awsSdkStrings.ID
  - typingsJapgolly.awsSdk.awsSdkStrings.URL
  - typingsJapgolly.awsSdk.awsSdkStrings.ADDRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.PROFESSION
  - typingsJapgolly.awsSdk.awsSdkStrings.SYSTEM_ORGAN_SITE
  - typingsJapgolly.awsSdk.awsSdkStrings.DIRECTION
  - typingsJapgolly.awsSdk.awsSdkStrings.QUALITY
  - typingsJapgolly.awsSdk.awsSdkStrings.QUANTITY
  - typingsJapgolly.awsSdk.awsSdkStrings.TIME_EXPRESSION
  - typingsJapgolly.awsSdk.awsSdkStrings.TIME_TO_MEDICATION_NAME
  - typingsJapgolly.awsSdk.awsSdkStrings.TIME_TO_DX_NAME
  - typingsJapgolly.awsSdk.awsSdkStrings.TIME_TO_TEST_NAME
  - typingsJapgolly.awsSdk.awsSdkStrings.TIME_TO_PROCEDURE_NAME
  - typingsJapgolly.awsSdk.awsSdkStrings.TIME_TO_TREATMENT_NAME
  - java.lang.String
*/
type EntitySubType = _EntitySubType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.MEDICATION
  - typingsJapgolly.awsSdk.awsSdkStrings.MEDICAL_CONDITION
  - typingsJapgolly.awsSdk.awsSdkStrings.PROTECTED_HEALTH_INFORMATION
  - typingsJapgolly.awsSdk.awsSdkStrings.TEST_TREATMENT_PROCEDURE
  - typingsJapgolly.awsSdk.awsSdkStrings.ANATOMY
  - typingsJapgolly.awsSdk.awsSdkStrings.TIME_EXPRESSION
  - java.lang.String
*/
type EntityType = _EntityType | java.lang.String

type Float = Double

type ICD10CMAttributeList = js.Array[ICD10CMAttribute]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACUITY
  - typingsJapgolly.awsSdk.awsSdkStrings.DIRECTION
  - typingsJapgolly.awsSdk.awsSdkStrings.SYSTEM_ORGAN_SITE
  - typingsJapgolly.awsSdk.awsSdkStrings.QUALITY
  - typingsJapgolly.awsSdk.awsSdkStrings.QUANTITY
  - typingsJapgolly.awsSdk.awsSdkStrings.TIME_TO_DX_NAME
  - typingsJapgolly.awsSdk.awsSdkStrings.TIME_EXPRESSION
  - java.lang.String
*/
type ICD10CMAttributeType = _ICD10CMAttributeType | java.lang.String

type ICD10CMConceptList = js.Array[ICD10CMConcept]

type ICD10CMEntityCategory = MEDICAL_CONDITION | java.lang.String

type ICD10CMEntityList = js.Array[ICD10CMEntity]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DX_NAME
  - typingsJapgolly.awsSdk.awsSdkStrings.TIME_EXPRESSION
  - java.lang.String
*/
type ICD10CMEntityType = _ICD10CMEntityType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.OVERLAP
  - typingsJapgolly.awsSdk.awsSdkStrings.SYSTEM_ORGAN_SITE
  - java.lang.String
*/
type ICD10CMRelationshipType = _ICD10CMRelationshipType | java.lang.String

type ICD10CMTraitList = js.Array[ICD10CMTrait]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NEGATION
  - typingsJapgolly.awsSdk.awsSdkStrings.DIAGNOSIS
  - typingsJapgolly.awsSdk.awsSdkStrings.SIGN
  - typingsJapgolly.awsSdk.awsSdkStrings.SYMPTOM
  - java.lang.String
*/
type ICD10CMTraitName = _ICD10CMTraitName | java.lang.String

type IamRoleArn = java.lang.String

type Integer = Double

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
type JobStatus = _JobStatus | java.lang.String

type KMSKey = java.lang.String

type LanguageCode = en_ | java.lang.String

type ManifestFilePath = java.lang.String

type MaxResultsInteger = Double

type ModelVersion = java.lang.String

type OntologyLinkingBoundedLengthString = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.EVERY
  - typingsJapgolly.awsSdk.awsSdkStrings.WITH_DOSAGE
  - typingsJapgolly.awsSdk.awsSdkStrings.ADMINISTERED_VIA
  - typingsJapgolly.awsSdk.awsSdkStrings.FOR
  - typingsJapgolly.awsSdk.awsSdkStrings.NEGATIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.OVERLAP
  - typingsJapgolly.awsSdk.awsSdkStrings.DOSAGE
  - typingsJapgolly.awsSdk.awsSdkStrings.ROUTE_OR_MODE
  - typingsJapgolly.awsSdk.awsSdkStrings.FORM
  - typingsJapgolly.awsSdk.awsSdkStrings.FREQUENCY
  - typingsJapgolly.awsSdk.awsSdkStrings.DURATION
  - typingsJapgolly.awsSdk.awsSdkStrings.STRENGTH
  - typingsJapgolly.awsSdk.awsSdkStrings.RATE
  - typingsJapgolly.awsSdk.awsSdkStrings.ACUITY
  - typingsJapgolly.awsSdk.awsSdkStrings.TEST_VALUE
  - typingsJapgolly.awsSdk.awsSdkStrings.TEST_UNITS
  - typingsJapgolly.awsSdk.awsSdkStrings.TEST_UNIT
  - typingsJapgolly.awsSdk.awsSdkStrings.DIRECTION
  - typingsJapgolly.awsSdk.awsSdkStrings.SYSTEM_ORGAN_SITE
  - java.lang.String
*/
type RelationshipType = _RelationshipType | java.lang.String

type RxNormAttributeList = js.Array[RxNormAttribute]

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
type RxNormAttributeType = _RxNormAttributeType | java.lang.String

type RxNormConceptList = js.Array[RxNormConcept]

type RxNormEntityCategory = MEDICATION | java.lang.String

type RxNormEntityList = js.Array[RxNormEntity]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.BRAND_NAME
  - typingsJapgolly.awsSdk.awsSdkStrings.GENERIC_NAME
  - java.lang.String
*/
type RxNormEntityType = _RxNormEntityType | java.lang.String

type RxNormTraitList = js.Array[RxNormTrait]

type RxNormTraitName = NEGATION | java.lang.String

type S3Bucket = java.lang.String

type S3Key = java.lang.String

type SNOMEDCTAttributeList = js.Array[SNOMEDCTAttribute]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACUITY
  - typingsJapgolly.awsSdk.awsSdkStrings.QUALITY
  - typingsJapgolly.awsSdk.awsSdkStrings.DIRECTION
  - typingsJapgolly.awsSdk.awsSdkStrings.SYSTEM_ORGAN_SITE
  - typingsJapgolly.awsSdk.awsSdkStrings.TEST_VALUE
  - typingsJapgolly.awsSdk.awsSdkStrings.TEST_UNIT
  - java.lang.String
*/
type SNOMEDCTAttributeType = _SNOMEDCTAttributeType | java.lang.String

type SNOMEDCTConceptList = js.Array[SNOMEDCTConcept]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.MEDICAL_CONDITION
  - typingsJapgolly.awsSdk.awsSdkStrings.ANATOMY
  - typingsJapgolly.awsSdk.awsSdkStrings.TEST_TREATMENT_PROCEDURE
  - java.lang.String
*/
type SNOMEDCTEntityCategory = _SNOMEDCTEntityCategory | java.lang.String

type SNOMEDCTEntityList = js.Array[SNOMEDCTEntity]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DX_NAME
  - typingsJapgolly.awsSdk.awsSdkStrings.TEST_NAME
  - typingsJapgolly.awsSdk.awsSdkStrings.PROCEDURE_NAME
  - typingsJapgolly.awsSdk.awsSdkStrings.TREATMENT_NAME
  - java.lang.String
*/
type SNOMEDCTEntityType = _SNOMEDCTEntityType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACUITY
  - typingsJapgolly.awsSdk.awsSdkStrings.QUALITY
  - typingsJapgolly.awsSdk.awsSdkStrings.TEST_VALUE
  - typingsJapgolly.awsSdk.awsSdkStrings.TEST_UNITS
  - typingsJapgolly.awsSdk.awsSdkStrings.DIRECTION
  - typingsJapgolly.awsSdk.awsSdkStrings.SYSTEM_ORGAN_SITE
  - java.lang.String
*/
type SNOMEDCTRelationshipType = _SNOMEDCTRelationshipType | java.lang.String

type SNOMEDCTTraitList = js.Array[SNOMEDCTTrait]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NEGATION
  - typingsJapgolly.awsSdk.awsSdkStrings.DIAGNOSIS
  - typingsJapgolly.awsSdk.awsSdkStrings.SIGN
  - typingsJapgolly.awsSdk.awsSdkStrings.SYMPTOM
  - java.lang.String
*/
type SNOMEDCTTraitName = _SNOMEDCTTraitName | java.lang.String

type String = java.lang.String

type Timestamp = js.Date

type TraitList = js.Array[Trait]

type UnmappedAttributeList = js.Array[UnmappedAttribute]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2018-10-30`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
