package typingsJapgolly.pkijs.ecccmssharedinfoMod

import typingsJapgolly.asn1js.mod.OctetString
import typingsJapgolly.std.AlgorithmIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pkijs/src/ECCCMSSharedInfo", JSImport.Default)
@js.native
class default () extends ECCCMSSharedInfo {
  def this(params: js.Any) = this()
  /* CompleteClass */
  override var keyInfo: AlgorithmIdentifier = js.native
  /* CompleteClass */
  override var suppPubInfo: OctetString = js.native
  /* CompleteClass */
  override def fromSchema(schema: js.Any): Unit = js.native
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
  /* CompleteClass */
  override def toSchema(): js.Any = js.native
}

/* static members */
@JSImport("pkijs/src/ECCCMSSharedInfo", JSImport.Default)
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

