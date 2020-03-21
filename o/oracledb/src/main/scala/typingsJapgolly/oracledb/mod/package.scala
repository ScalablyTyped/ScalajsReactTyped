package typingsJapgolly.oracledb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /**
    * Used with connection.execute() to associate values or JavaScript variables to a statement’s bind variables by name.
    *
    * @see https://oracle.github.io/node-oracledb/doc/api.html#executebindParams
    */
  type BindParameters = (typingsJapgolly.std.Record[
    java.lang.String, 
    js.UndefOr[
      typingsJapgolly.oracledb.mod.BindParameter | java.lang.String | scala.Double | js.Date | typingsJapgolly.oracledb.mod.DBObject | typingsJapgolly.node.Buffer | scala.Null
    ]
  ]) | (js.Array[js.Any | typingsJapgolly.oracledb.mod.BindParameter])
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsJapgolly.node.Buffer
    - typingsJapgolly.oracledb.mod.DBObject
    - typingsJapgolly.oracledb.AnonCorrelation
  */
  type EnqueueMessage = typingsJapgolly.oracledb.mod._EnqueueMessage | java.lang.String | typingsJapgolly.node.Buffer
}
