package typingsJapgolly.shasum

import typingsJapgolly.shasum.shasumStrings.base64
import typingsJapgolly.shasum.shasumStrings.hex
import typingsJapgolly.shasum.shasumStrings.latin1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shasum", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(str: js.Any): String = js.native
  def apply(str: js.Any, alg: String): String = js.native
  def apply(str: js.Any, alg: String, format: base64): String = js.native
  def apply(str: js.Any, alg: String, format: hex): String = js.native
  def apply(str: js.Any, alg: String, format: latin1): String = js.native
  def apply(str: js.Any, alg: Null, format: base64): String = js.native
  def apply(str: js.Any, alg: Null, format: hex): String = js.native
  def apply(str: js.Any, alg: Null, format: latin1): String = js.native
}

