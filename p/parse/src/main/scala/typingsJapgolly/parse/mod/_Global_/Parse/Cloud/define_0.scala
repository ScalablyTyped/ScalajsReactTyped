package typingsJapgolly.parse.mod._Global_.Parse.Cloud

import typingsJapgolly.std.Parameters
import typingsJapgolly.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Parse.Cloud.define")
@js.native
object define_0 extends js.Object {
  def apply[T /* <: js.Function1[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof std.Parameters<T>[0] ]: std.Parameters<T>[0][P]}
    */ /* param */ typingsJapgolly.parse.parseStrings.define with Parameters[T], 
    _
  ] */](
    name: String,
    func: js.Function1[
      /* request */ FunctionRequest[
        /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<T>[0] */ js.Any
      ], 
      js.Promise[ReturnType[T]] | ReturnType[T]
    ]
  ): Unit = js.native
}

