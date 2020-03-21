package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object datapipelineMod {
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.datapipelineMod.ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.EQ
    - typingsJapgolly.awsSdk.awsSdkStrings.REF_EQ
    - typingsJapgolly.awsSdk.awsSdkStrings.LE
    - typingsJapgolly.awsSdk.awsSdkStrings.GE
    - typingsJapgolly.awsSdk.awsSdkStrings.BETWEEN
    - java.lang.String
  */
  type OperatorType = typingsJapgolly.awsSdk.datapipelineMod._OperatorType | java.lang.String
  type ParameterAttributeList = js.Array[typingsJapgolly.awsSdk.datapipelineMod.ParameterAttribute]
  type ParameterObjectList = js.Array[typingsJapgolly.awsSdk.datapipelineMod.ParameterObject]
  type ParameterValueList = js.Array[typingsJapgolly.awsSdk.datapipelineMod.ParameterValue]
  type PipelineDescriptionList = js.Array[typingsJapgolly.awsSdk.datapipelineMod.PipelineDescription]
  type PipelineObjectList = js.Array[typingsJapgolly.awsSdk.datapipelineMod.PipelineObject]
  type PipelineObjectMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.datapipelineMod.PipelineObject]
  type SelectorList = js.Array[typingsJapgolly.awsSdk.datapipelineMod.Selector]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.FINISHED
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.FALSE
    - java.lang.String
  */
  type TaskStatus = typingsJapgolly.awsSdk.datapipelineMod._TaskStatus | java.lang.String
  type ValidationErrors = js.Array[typingsJapgolly.awsSdk.datapipelineMod.ValidationError]
  type ValidationWarnings = js.Array[typingsJapgolly.awsSdk.datapipelineMod.ValidationWarning]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2012-10-29`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.datapipelineMod._apiVersion | java.lang.String
  type attributeNameString = java.lang.String
  type attributeValueString = java.lang.String
  type cancelActive = scala.Boolean
  type errorMessage = java.lang.String
  type fieldList = js.Array[typingsJapgolly.awsSdk.datapipelineMod.Field]
  type fieldNameString = java.lang.String
  type fieldStringValue = java.lang.String
  type id = java.lang.String
  type idList = js.Array[typingsJapgolly.awsSdk.datapipelineMod.id]
  type int = scala.Double
  type longString = java.lang.String
  type pipelineList = js.Array[typingsJapgolly.awsSdk.datapipelineMod.PipelineIdName]
  type stringList = js.Array[java.lang.String]
  type tagKey = java.lang.String
  type tagList = js.Array[typingsJapgolly.awsSdk.datapipelineMod.Tag]
  type tagValue = java.lang.String
  type taskId = java.lang.String
  type timestamp = js.Date
  type validationMessage = java.lang.String
  type validationMessages = js.Array[typingsJapgolly.awsSdk.datapipelineMod.validationMessage]
}
