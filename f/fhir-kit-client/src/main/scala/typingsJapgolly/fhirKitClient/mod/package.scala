package typingsJapgolly.fhirKitClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CustomResourceType = typingsJapgolly.std.Exclude[
    typingsJapgolly.fhirKitClient.mod.ResourceType, 
    typingsJapgolly.fhirKitClient.mod.KnownResourceType
  ]
  type FhirResource = typingsJapgolly.fhirKitClient.mod.CustomResource | typingsJapgolly.fhir.fhir.Resource
  type ResourceType = java.lang.String
  type SearchParams = org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean]
}
