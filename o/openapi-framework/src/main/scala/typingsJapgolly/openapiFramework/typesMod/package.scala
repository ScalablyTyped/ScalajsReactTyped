package typingsJapgolly.openapiFramework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type OpenAPIErrorTransformer = js.Function2[/* has0 */ js.Object, /* has1 */ js.Object, js.Object]
  type PathSecurityTuple = js.Tuple2[js.RegExp, js.Array[typingsJapgolly.openapiFramework.typesMod.SecurityRequirement]]
  type SecurityRequirement = org.scalablytyped.runtime.StringDictionary[js.Array[typingsJapgolly.openapiFramework.typesMod.SecurityScope]]
  type SecurityScope = java.lang.String
}
