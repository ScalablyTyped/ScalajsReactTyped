package typingsJapgolly.reduxPersistTransformEncrypt.asyncMod

import typingsJapgolly.reduxPersist.typesMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-persist-transform-encrypt/async", JSImport.Default)
@js.native
object default extends js.Object {
  def apply[State, Raw](config: AsyncEncryptorConfig): Transform[State, Raw, _, _] = js.native
}

