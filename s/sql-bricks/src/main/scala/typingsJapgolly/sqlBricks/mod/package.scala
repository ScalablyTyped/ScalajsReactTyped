package typingsJapgolly.sqlBricks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type OnCriteria = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type TableName = java.lang.String | typingsJapgolly.sqlBricks.mod.SelectStatement
  /**
    * When a non-expression object is passed somewhere a whereExpression is expected,
    * each key/value pair will be ANDed together:
    */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.sqlBricks.mod.WhereGroup
    - typingsJapgolly.sqlBricks.mod.WhereBinary
    - typingsJapgolly.sqlBricks.mod.WhereObject
    - java.lang.String
  */
  type WhereExpression = typingsJapgolly.sqlBricks.mod._WhereExpression | typingsJapgolly.sqlBricks.mod.WhereObject | java.lang.String
  type WhereObject = org.scalablytyped.runtime.StringDictionary[js.Any]
}
