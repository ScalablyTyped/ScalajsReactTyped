package typingsJapgolly.pkijs.privateKeyInfoMod

import org.scalajs.dom.crypto.JsonWebKey
import typingsJapgolly.asn1js.mod.OctetString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pkijs/src/PrivateKeyInfo", JSImport.Default)
@js.native
class default () extends PrivateKeyInfo {
  def this(params: js.Any) = this()
  /* CompleteClass */
  override var privateKey: OctetString = js.native
  /* CompleteClass */
  override var privateKeyAlgorithm: typingsJapgolly.pkijs.algorithmIdentifierMod.default = js.native
  /* CompleteClass */
  override var version: Double = js.native
  /**
    * Convert JSON value into current object
    * @param {JsonWebKey} json
    */
  /* CompleteClass */
  override def fromJSON(json: JsonWebKey): Unit = js.native
  /* CompleteClass */
  override def fromSchema(schema: js.Any): Unit = js.native
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
  /* CompleteClass */
  override def toSchema(): js.Any = js.native
}

/* static members */
@JSImport("pkijs/src/PrivateKeyInfo", JSImport.Default)
@js.native
object default extends js.Object {
  def defaultValues(memberName: String): js.Any = js.native
  def schema(): js.Any = js.native
  def schema(parameters: js.Any): js.Any = js.native
}

