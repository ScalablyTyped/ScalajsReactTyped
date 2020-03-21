package typingsJapgolly.pkijs.authorityKeyIdentifierMod

import typingsJapgolly.asn1js.mod.Integer
import typingsJapgolly.asn1js.mod.OctetString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pkijs/src/AuthorityKeyIdentifier", JSImport.Default)
@js.native
class default () extends AuthorityKeyIdentifier {
  def this(params: js.Any) = this()
  /* CompleteClass */
  override var authorityCertIssuer: js.Array[typingsJapgolly.pkijs.accessDescriptionMod.default] = js.native
  /* CompleteClass */
  override var authorityCertSerialNumber: Integer = js.native
  /* CompleteClass */
  override var keyIdentifier: OctetString = js.native
  /* CompleteClass */
  override def fromSchema(schema: js.Any): Unit = js.native
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
  /* CompleteClass */
  override def toSchema(): js.Any = js.native
}

/* static members */
@JSImport("pkijs/src/AuthorityKeyIdentifier", JSImport.Default)
@js.native
object default extends js.Object {
  def defaultValues(memberName: String): js.Any = js.native
  def schema(): js.Any = js.native
  def schema(parameters: js.Any): js.Any = js.native
}

