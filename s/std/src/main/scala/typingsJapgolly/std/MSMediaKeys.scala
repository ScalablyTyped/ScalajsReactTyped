package typingsJapgolly.std

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MSMediaKeys extends js.Object {
  val keySystem: java.lang.String = js.native
  def createSession(`type`: java.lang.String, initData: scala.scalajs.js.typedarray.Uint8Array): MSMediaKeySession = js.native
  def createSession(
    `type`: java.lang.String,
    initData: scala.scalajs.js.typedarray.Uint8Array,
    cdmData: scala.scalajs.js.typedarray.Uint8Array
  ): MSMediaKeySession = js.native
}

@JSGlobal("MSMediaKeys")
@js.native
object MSMediaKeys
  extends Instantiable1[/* keySystem */ java.lang.String, MSMediaKeys] {
  def isTypeSupported(keySystem: java.lang.String): scala.Boolean = js.native
  def isTypeSupported(keySystem: java.lang.String, `type`: java.lang.String): scala.Boolean = js.native
  def isTypeSupportedWithFeatures(keySystem: java.lang.String): java.lang.String = js.native
  def isTypeSupportedWithFeatures(keySystem: java.lang.String, `type`: java.lang.String): java.lang.String = js.native
}

