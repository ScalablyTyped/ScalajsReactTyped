package typingsJapgolly.ramda

import typingsJapgolly.ramda.toolsMod.ValueOfRecord
import typingsJapgolly.std.Parameters
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/applySpec", JSImport.Namespace)
@js.native
object applySpecMod extends js.Object {
  def default[Obj /* <: Record[String, js.Function1[/* repeated */ _, _]] */](obj: Obj): js.Function1[
    /* args */ Parameters[ValueOfRecord[Obj]], 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ Key in keyof Obj ]: std.ReturnType<Obj[Key]>}
    */ typingsJapgolly.ramda.ramdaStrings.default with Obj
  ] = js.native
  def default[T](obj: js.Any): js.Function1[/* repeated */ js.Any, T] = js.native
}

