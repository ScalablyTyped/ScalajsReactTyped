package typingsJapgolly.pkijs.pbes2paramsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pkijs/src/PBES2Params", JSImport.Default)
@js.native
class default () extends PBES2Params {
  def this(params: js.Any) = this()
  /* CompleteClass */
  override var encryptionScheme: typingsJapgolly.pkijs.algorithmIdentifierMod.default = js.native
  /* CompleteClass */
  override var keyDerivationFunc: typingsJapgolly.pkijs.algorithmIdentifierMod.default = js.native
  /* CompleteClass */
  override def fromSchema(schema: js.Any): Unit = js.native
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
  /* CompleteClass */
  override def toSchema(): js.Any = js.native
}

/* static members */
@JSImport("pkijs/src/PBES2Params", JSImport.Default)
@js.native
object default extends js.Object {
  def defaultValues(memberName: String): js.Any = js.native
  def schema(): js.Any = js.native
  def schema(parameters: js.Any): js.Any = js.native
}

