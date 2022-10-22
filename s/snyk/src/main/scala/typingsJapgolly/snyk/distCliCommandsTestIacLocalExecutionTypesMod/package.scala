package typingsJapgolly.snyk.distCliCommandsTestIacLocalExecutionTypesMod

import typingsJapgolly.snyk.anon.Severity
import typingsJapgolly.snyk.distCliCommandsTestIacLocalExecutionTypesMod.^
import typingsJapgolly.snyk.snykStrings.`no-op`
import typingsJapgolly.snyk.snykStrings.create
import typingsJapgolly.snyk.snykStrings.delete
import typingsJapgolly.snyk.snykStrings.engineType
import typingsJapgolly.snyk.snykStrings.fileContent
import typingsJapgolly.snyk.snykStrings.jsonContent
import typingsJapgolly.snyk.snykStrings.read
import typingsJapgolly.snyk.snykStrings.update
import typingsJapgolly.std.Omit
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def VALID_FILE_TYPES: js.Array[String] = ^.asInstanceOf[js.Dynamic].selectDynamic("VALID_FILE_TYPES").asInstanceOf[js.Array[String]]

inline def VALID_RESOURCE_ACTIONS_FOR_DELTA_SCAN: js.Array[ResourceActions] = ^.asInstanceOf[js.Dynamic].selectDynamic("VALID_RESOURCE_ACTIONS_FOR_DELTA_SCAN").asInstanceOf[js.Array[ResourceActions]]

inline def VALID_RESOURCE_ACTIONS_FOR_FULL_SCAN: js.Array[ResourceActions] = ^.asInstanceOf[js.Dynamic].selectDynamic("VALID_RESOURCE_ACTIONS_FOR_FULL_SCAN").asInstanceOf[js.Array[ResourceActions]]

inline def VALID_TERRAFORM_FILE_TYPES: js.Array[String] = ^.asInstanceOf[js.Dynamic].selectDynamic("VALID_TERRAFORM_FILE_TYPES").asInstanceOf[js.Array[String]]

type IacCustomPolicies = Record[String, Severity]

type ResourceActions = (js.Array[`no-op` | create | read | update | delete]) | (js.Tuple2[delete | create, create | delete])

type SafeAnalyticsOutput = Omit[IacFileParsed | IacFileParseFailure, fileContent | jsonContent | engineType]
