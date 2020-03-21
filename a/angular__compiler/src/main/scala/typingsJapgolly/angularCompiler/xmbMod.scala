package typingsJapgolly.angularCompiler

import typingsJapgolly.angularCompiler.i18nAstMod.Message
import typingsJapgolly.angularCompiler.serializerMod.Serializer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/i18n/serializers/xmb", JSImport.Namespace)
@js.native
object xmbMod extends js.Object {
  @js.native
  class Xmb () extends Serializer
  
  def digest(message: Message): String = js.native
  def toPublicName(internalName: String): String = js.native
}

