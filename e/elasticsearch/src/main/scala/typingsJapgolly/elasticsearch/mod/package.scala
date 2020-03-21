package typingsJapgolly.elasticsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DeleteDocumentByQueryResponse = typingsJapgolly.elasticsearch.mod.ReindexResponse
  type InfoParams = typingsJapgolly.elasticsearch.mod.GenericParams
  type NameList = java.lang.String | js.Array[java.lang.String] | scala.Boolean
  type PingParams = typingsJapgolly.elasticsearch.mod.GenericParams
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - typingsJapgolly.elasticsearch.elasticsearchStrings.wait_for
    - typingsJapgolly.elasticsearch.elasticsearchStrings._empty
  */
  type Refresh = typingsJapgolly.elasticsearch.mod._Refresh | scala.Boolean
  type TimeSpan = java.lang.String
  type UpdateDocumentByQueryResponse = typingsJapgolly.elasticsearch.mod.ReindexResponse
}
