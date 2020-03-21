package typingsJapgolly.fhirJsClient.FHIR

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SMART {
  /**
    * Indexable type used to represent Observation FHIR resources indexed based on codes.
    */
  type ObservationsByCode = org.scalablytyped.runtime.StringDictionary[js.Array[typingsJapgolly.fhirJsClient.FHIR.SMART.Resource]]
  /**
    * Funtion type returned by the fetchAllWithReferences method
    */
  type ResolveFn = js.Function2[
    /* resource */ typingsJapgolly.fhirJsClient.FHIR.SMART.Resource, 
    /* reference */ typingsJapgolly.fhirJsClient.FHIR.SMART.Reference, 
    typingsJapgolly.fhirJsClient.FHIR.SMART.Resource
  ]
}
