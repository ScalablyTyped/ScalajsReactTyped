package typingsJapgolly.pkijs.generalNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pkijs/src/GeneralNames", JSImport.Default)
@js.native
class default () extends GeneralNames {
  def this(params: js.Any) = this()
  /* CompleteClass */
  override var names: js.Array[typingsJapgolly.pkijs.generalNameMod.default] = js.native
  /* CompleteClass */
  override def fromSchema(schema: js.Any): Unit = js.native
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
  /* CompleteClass */
  override def toSchema(): js.Any = js.native
}

/* static members */
@JSImport("pkijs/src/GeneralNames", JSImport.Default)
@js.native
object default extends js.Object {
  def defaultValues(memberName: String): js.Any = js.native
  def schema(): js.Any = js.native
  def schema(parameters: js.Any): js.Any = js.native
}

