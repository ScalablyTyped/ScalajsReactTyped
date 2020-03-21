package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object schemasMod {
  type Body = typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | typingsJapgolly.awsSdk.schemasMod.Blob | java.lang.String
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.schemasMod.ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_COMPLETE
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_FAILED
    - java.lang.String
  */
  type CodeGenerationStatus = typingsJapgolly.awsSdk.schemasMod._CodeGenerationStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.STARTED
    - typingsJapgolly.awsSdk.awsSdkStrings.STOPPED
    - java.lang.String
  */
  type DiscovererState = typingsJapgolly.awsSdk.schemasMod._DiscovererState | java.lang.String
  type GetDiscoveredSchemaVersionItemInput = java.lang.String
  type Tags = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.schemasMod.string]
  type Type = typingsJapgolly.awsSdk.awsSdkStrings.OpenApi3 | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2019-12-02`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.schemasMod._apiVersion | java.lang.String
  type boolean = scala.Boolean
  type integer = scala.Double
  type integerMin1Max29000 = scala.Double
  type listOfDiscovererSummary = js.Array[typingsJapgolly.awsSdk.schemasMod.DiscovererSummary]
  type listOfGetDiscoveredSchemaVersionItemInput = js.Array[typingsJapgolly.awsSdk.schemasMod.GetDiscoveredSchemaVersionItemInput]
  type listOfRegistrySummary = js.Array[typingsJapgolly.awsSdk.schemasMod.RegistrySummary]
  type listOfSchemaSummary = js.Array[typingsJapgolly.awsSdk.schemasMod.SchemaSummary]
  type listOfSchemaVersionSummary = js.Array[typingsJapgolly.awsSdk.schemasMod.SchemaVersionSummary]
  type listOfSearchSchemaSummary = js.Array[typingsJapgolly.awsSdk.schemasMod.SearchSchemaSummary]
  type listOfSearchSchemaVersionSummary = js.Array[typingsJapgolly.awsSdk.schemasMod.SearchSchemaVersionSummary]
  type listOfString = js.Array[typingsJapgolly.awsSdk.schemasMod.string]
  type long = scala.Double
  type string = java.lang.String
  type stringMin0Max256 = java.lang.String
  type stringMin0Max36 = java.lang.String
  type stringMin1Max100000 = java.lang.String
  type stringMin1Max1600 = java.lang.String
  type stringMin20Max1600 = java.lang.String
  type timestampIso8601 = js.Date
}
