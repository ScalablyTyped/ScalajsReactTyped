package typingsJapgolly.orientjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BinaryRecord = typingsJapgolly.orientjs.mod.ORecord with typingsJapgolly.node.Buffer
  type ODocument = typingsJapgolly.orientjs.mod.ORecord
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsJapgolly.orientjs.mod.ORawExpression
    - typingsJapgolly.orientjs.mod.OSqlFunction
  */
  type OSqlExpression = typingsJapgolly.orientjs.mod._OSqlExpression | java.lang.String
  type Version = scala.Double | java.lang.String
}
