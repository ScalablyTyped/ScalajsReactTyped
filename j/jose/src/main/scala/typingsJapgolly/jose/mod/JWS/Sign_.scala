package typingsJapgolly.jose.mod.JWS

import typingsJapgolly.jose.joseStrings.compact
import typingsJapgolly.jose.joseStrings.flattened
import typingsJapgolly.jose.joseStrings.general
import typingsJapgolly.jose.mod.ProduceKeyInputWithNone
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jose", "JWS.Sign")
@js.native
class Sign_ protected () extends js.Object {
  def this(payload: String) = this()
  def this(payload: js.Object) = this()
  def this(payload: Buffer) = this()
  def recipient(key: ProduceKeyInputWithNone): Unit = js.native
  def recipient(key: ProduceKeyInputWithNone, `protected`: js.Object): Unit = js.native
  def recipient(key: ProduceKeyInputWithNone, `protected`: js.Object, header: js.Object): Unit = js.native
  @JSName("sign")
  def sign_compact(serialization: compact): String = js.native
  @JSName("sign")
  def sign_flattened(serialization: flattened): FlattenedJWS = js.native
  @JSName("sign")
  def sign_general(serialization: general): GeneralJWS = js.native
}

