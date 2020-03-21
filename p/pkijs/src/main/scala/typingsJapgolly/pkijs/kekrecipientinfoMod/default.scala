package typingsJapgolly.pkijs.kekrecipientinfoMod

import typingsJapgolly.asn1js.mod.OctetString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pkijs/src/KEKRecipientInfo", JSImport.Default)
@js.native
class default () extends KEKRecipientInfo {
  def this(params: js.Any) = this()
  /* CompleteClass */
  override var encryptedKey: OctetString = js.native
  /* CompleteClass */
  override var kekid: typingsJapgolly.pkijs.kekidentifierMod.default = js.native
  /* CompleteClass */
  override var keyEncryptionAlgorithm: typingsJapgolly.pkijs.algorithmIdentifierMod.default = js.native
  /* CompleteClass */
  override var preDefinedKEK: scala.scalajs.js.typedarray.ArrayBuffer = js.native
  /* CompleteClass */
  override var version: Double = js.native
  /* CompleteClass */
  override def fromSchema(schema: js.Any): Unit = js.native
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
  /* CompleteClass */
  override def toSchema(): js.Any = js.native
}

/* static members */
@JSImport("pkijs/src/KEKRecipientInfo", JSImport.Default)
@js.native
object default extends js.Object {
  /**
    * Compare values with default values for all class members
    * @param {string} memberName String name for a class member
    * @param {*} memberValue Value to compare with default value
    */
  def compareWithDefault(memberName: String, memberValue: js.Any): Boolean = js.native
  def defaultValues(memberName: String): js.Any = js.native
  def schema(): js.Any = js.native
  def schema(parameters: js.Any): js.Any = js.native
}

