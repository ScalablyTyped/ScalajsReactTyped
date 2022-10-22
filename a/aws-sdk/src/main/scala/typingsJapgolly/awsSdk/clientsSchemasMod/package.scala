package typingsJapgolly.awsSdk.clientsSchemasMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Body = Buffer | js.typedarray.Uint8Array | Blob | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_COMPLETE
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_FAILED
  - java.lang.String
*/
type CodeGenerationStatus = _CodeGenerationStatus | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.STARTED
  - typingsJapgolly.awsSdk.awsSdkStrings.STOPPED
  - java.lang.String
*/
type DiscovererState = _DiscovererState | String

type GetDiscoveredSchemaVersionItemInput = String

type Tags = StringDictionary[string]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.OpenApi3
  - typingsJapgolly.awsSdk.awsSdkStrings.JSONSchemaDraft4
  - java.lang.String
*/
type Type = _Type | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2019-12-02`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String

type boolean = Boolean

type integer = Double

type listOfDiscovererSummary = js.Array[DiscovererSummary]

type listOfGetDiscoveredSchemaVersionItemInput = js.Array[GetDiscoveredSchemaVersionItemInput]

type listOfRegistrySummary = js.Array[RegistrySummary]

type listOfSchemaSummary = js.Array[SchemaSummary]

type listOfSchemaVersionSummary = js.Array[SchemaVersionSummary]

type listOfSearchSchemaSummary = js.Array[SearchSchemaSummary]

type listOfSearchSchemaVersionSummary = js.Array[SearchSchemaVersionSummary]

type listOfString = js.Array[string]

type long = Double

type string = String

type stringMin0Max256 = String

type stringMin0Max36 = String

type stringMin1Max100000 = String

type stringMin20Max1600 = String

type timestampIso8601 = js.Date
