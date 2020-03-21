package typingsJapgolly.betterSqlite3.mod.BetterSqlite3

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.betterSqlite3.TypeofInteger
import typingsJapgolly.betterSqlite3.mod.Options
import typingsJapgolly.integer.mod.IntClass
import typingsJapgolly.integer.mod.IntLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatabaseConstructor
  extends Instantiable1[/* filename */ String, Database]
     with Instantiable2[/* filename */ String, /* options */ Options, Database] {
  @JSName("Integer")
  var Integer_Original: (js.Function1[/* val */ IntLike, IntClass]) with TypeofInteger = js.native
  var SqliteError: Instantiable2[
    /* message */ String, 
    /* code */ String, 
    typingsJapgolly.betterSqlite3.mod.SqliteError
  ] = js.native
  def apply(filename: String): Database = js.native
  def apply(filename: String, options: Options): Database = js.native
  def Integer(`val`: IntLike): IntClass = js.native
}

