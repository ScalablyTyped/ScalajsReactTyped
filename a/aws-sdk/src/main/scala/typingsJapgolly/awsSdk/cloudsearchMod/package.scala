package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cloudsearchMod {
  type APIVersion_ = java.lang.String
  type ARN = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.none__
    - typingsJapgolly.awsSdk.awsSdkStrings.minimal
    - typingsJapgolly.awsSdk.awsSdkStrings.light
    - typingsJapgolly.awsSdk.awsSdkStrings.full_
    - java.lang.String
  */
  type AlgorithmicStemming = typingsJapgolly.awsSdk.cloudsearchMod._AlgorithmicStemming | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ar_
    - typingsJapgolly.awsSdk.awsSdkStrings.bg_
    - typingsJapgolly.awsSdk.awsSdkStrings.ca_
    - typingsJapgolly.awsSdk.awsSdkStrings.cs
    - typingsJapgolly.awsSdk.awsSdkStrings.da
    - typingsJapgolly.awsSdk.awsSdkStrings.de_
    - typingsJapgolly.awsSdk.awsSdkStrings.el
    - typingsJapgolly.awsSdk.awsSdkStrings.en
    - typingsJapgolly.awsSdk.awsSdkStrings.es_
    - typingsJapgolly.awsSdk.awsSdkStrings.eu_
    - typingsJapgolly.awsSdk.awsSdkStrings.fa
    - typingsJapgolly.awsSdk.awsSdkStrings.fi_
    - typingsJapgolly.awsSdk.awsSdkStrings.fr_
    - typingsJapgolly.awsSdk.awsSdkStrings.ga_
    - typingsJapgolly.awsSdk.awsSdkStrings.gl_
    - typingsJapgolly.awsSdk.awsSdkStrings.he
    - typingsJapgolly.awsSdk.awsSdkStrings.hi
    - typingsJapgolly.awsSdk.awsSdkStrings.hu_
    - typingsJapgolly.awsSdk.awsSdkStrings.hy
    - typingsJapgolly.awsSdk.awsSdkStrings.id__
    - typingsJapgolly.awsSdk.awsSdkStrings.it_
    - typingsJapgolly.awsSdk.awsSdkStrings.ja
    - typingsJapgolly.awsSdk.awsSdkStrings.ko
    - typingsJapgolly.awsSdk.awsSdkStrings.lv_
    - typingsJapgolly.awsSdk.awsSdkStrings.mul
    - typingsJapgolly.awsSdk.awsSdkStrings.nl_
    - typingsJapgolly.awsSdk.awsSdkStrings.no_
    - typingsJapgolly.awsSdk.awsSdkStrings.pt_
    - typingsJapgolly.awsSdk.awsSdkStrings.ro_
    - typingsJapgolly.awsSdk.awsSdkStrings.ru_
    - typingsJapgolly.awsSdk.awsSdkStrings.sv_
    - typingsJapgolly.awsSdk.awsSdkStrings.th_
    - typingsJapgolly.awsSdk.awsSdkStrings.tr_
    - typingsJapgolly.awsSdk.awsSdkStrings.`zh-Hans`
    - typingsJapgolly.awsSdk.awsSdkStrings.`zh-Hant`
    - java.lang.String
  */
  type AnalysisSchemeLanguage = typingsJapgolly.awsSdk.cloudsearchMod._AnalysisSchemeLanguage | java.lang.String
  type AnalysisSchemeStatusList = js.Array[typingsJapgolly.awsSdk.cloudsearchMod.AnalysisSchemeStatus]
  type Boolean = scala.Boolean
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.cloudsearchMod.ClientApiVersions
  type DomainId = java.lang.String
  type DomainName = java.lang.String
  type DomainNameList = js.Array[typingsJapgolly.awsSdk.cloudsearchMod.DomainName]
  type DomainNameMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.cloudsearchMod.APIVersion_]
  type DomainStatusList = js.Array[typingsJapgolly.awsSdk.cloudsearchMod.DomainStatus]
  type Double = scala.Double
  type DynamicFieldName = java.lang.String
  type DynamicFieldNameList = js.Array[typingsJapgolly.awsSdk.cloudsearchMod.DynamicFieldName]
  type ExpressionStatusList = js.Array[typingsJapgolly.awsSdk.cloudsearchMod.ExpressionStatus]
  type ExpressionValue = java.lang.String
  type FieldName = java.lang.String
  type FieldNameCommaList = java.lang.String
  type FieldNameList = js.Array[typingsJapgolly.awsSdk.cloudsearchMod.FieldName]
  type FieldValue = java.lang.String
  type IndexFieldStatusList = js.Array[typingsJapgolly.awsSdk.cloudsearchMod.IndexFieldStatus]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.int
    - typingsJapgolly.awsSdk.awsSdkStrings.double
    - typingsJapgolly.awsSdk.awsSdkStrings.literal
    - typingsJapgolly.awsSdk.awsSdkStrings.text_
    - typingsJapgolly.awsSdk.awsSdkStrings.date_
    - typingsJapgolly.awsSdk.awsSdkStrings.latlon
    - typingsJapgolly.awsSdk.awsSdkStrings.`int-array`
    - typingsJapgolly.awsSdk.awsSdkStrings.`double-array`
    - typingsJapgolly.awsSdk.awsSdkStrings.`literal-array`
    - typingsJapgolly.awsSdk.awsSdkStrings.`text-array`
    - typingsJapgolly.awsSdk.awsSdkStrings.`date-array`
    - java.lang.String
  */
  type IndexFieldType = typingsJapgolly.awsSdk.cloudsearchMod._IndexFieldType | java.lang.String
  type InstanceCount = scala.Double
  type Long = scala.Double
  type MaximumPartitionCount = scala.Double
  type MaximumReplicationCount = scala.Double
  type MultiAZ = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.RequiresIndexDocuments
    - typingsJapgolly.awsSdk.awsSdkStrings.Processing_
    - typingsJapgolly.awsSdk.awsSdkStrings.Active_
    - typingsJapgolly.awsSdk.awsSdkStrings.FailedToValidate
    - java.lang.String
  */
  type OptionState = typingsJapgolly.awsSdk.cloudsearchMod._OptionState | java.lang.String
  type PartitionCount = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.searchDotm1Dotsmall
    - typingsJapgolly.awsSdk.awsSdkStrings.searchDotm1Dotlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.searchDotm2Dotxlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.searchDotm2Dot2xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.searchDotm3Dotmedium
    - typingsJapgolly.awsSdk.awsSdkStrings.searchDotm3Dotlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.searchDotm3Dotxlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.searchDotm3Dot2xlarge
    - java.lang.String
  */
  type PartitionInstanceType = typingsJapgolly.awsSdk.cloudsearchMod._PartitionInstanceType | java.lang.String
  type PolicyDocument = java.lang.String
  type SearchInstanceType = java.lang.String
  type ServiceUrl = java.lang.String
  type StandardName = java.lang.String
  type StandardNameList = js.Array[typingsJapgolly.awsSdk.cloudsearchMod.StandardName]
  type String = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.none__
    - typingsJapgolly.awsSdk.awsSdkStrings.low__
    - typingsJapgolly.awsSdk.awsSdkStrings.high__
    - java.lang.String
  */
  type SuggesterFuzzyMatching = typingsJapgolly.awsSdk.cloudsearchMod._SuggesterFuzzyMatching | java.lang.String
  type SuggesterStatusList = js.Array[typingsJapgolly.awsSdk.cloudsearchMod.SuggesterStatus]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`Policy-Min-TLS-1-0-2019-07`
    - typingsJapgolly.awsSdk.awsSdkStrings.`Policy-Min-TLS-1-2-2019-07`
    - java.lang.String
  */
  type TLSSecurityPolicy = typingsJapgolly.awsSdk.cloudsearchMod._TLSSecurityPolicy | java.lang.String
  type UIntValue = scala.Double
  type UpdateTimestamp = js.Date
  type Word = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2011-02-01`
    - typingsJapgolly.awsSdk.awsSdkStrings.`2013-01-01`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.cloudsearchMod._apiVersion | java.lang.String
}
