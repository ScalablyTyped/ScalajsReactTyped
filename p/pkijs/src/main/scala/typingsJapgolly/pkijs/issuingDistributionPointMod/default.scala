package typingsJapgolly.pkijs.issuingDistributionPointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pkijs/src/IssuingDistributionPoint", JSImport.Default)
@js.native
class default () extends IssuingDistributionPoint {
  def this(params: js.Any) = this()
  /* CompleteClass */
  override var indirectCRL: Boolean = js.native
  /* CompleteClass */
  override var onlyContainsAttributeCerts: Boolean = js.native
  /* CompleteClass */
  override var onlyContainsUserCerts: Boolean = js.native
  /* CompleteClass */
  override var onlySomeReasons: Double = js.native
  /* CompleteClass */
  override def fromSchema(schema: js.Any): Unit = js.native
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
  /* CompleteClass */
  override def toSchema(): js.Any = js.native
}

/* static members */
@JSImport("pkijs/src/IssuingDistributionPoint", JSImport.Default)
@js.native
object default extends js.Object {
  def defaultValues(memberName: String): js.Any = js.native
  def schema(): js.Any = js.native
  def schema(parameters: js.Any): js.Any = js.native
}

