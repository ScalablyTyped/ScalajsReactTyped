package typingsJapgolly.nodeSql2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Columns[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ Name in keyof T ]: node-sql-2.sql.Column<Name, T[Name]>}
    */ typingsJapgolly.nodeSql2.nodeSql2Strings.Columns with T
  type Table[Name /* <: java.lang.String */, T] = typingsJapgolly.nodeSql2.mod.TableNode with typingsJapgolly.nodeSql2.mod.Queryable[T] with typingsJapgolly.nodeSql2.mod.Named[Name] with typingsJapgolly.nodeSql2.mod.Columns[T] with typingsJapgolly.nodeSql2.AnonAlter[T]
}
