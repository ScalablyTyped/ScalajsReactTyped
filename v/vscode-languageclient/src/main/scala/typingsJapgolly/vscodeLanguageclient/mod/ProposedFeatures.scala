package typingsJapgolly.vscodeLanguageclient.mod

import typingsJapgolly.vscodeLanguageclient.clientMod.DynamicFeature
import typingsJapgolly.vscodeLanguageclient.clientMod.StaticFeature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "ProposedFeatures")
@js.native
object ProposedFeatures extends js.Object {
  def createAll(_client: typingsJapgolly.vscodeLanguageclient.clientMod.BaseLanguageClient): js.Array[StaticFeature | DynamicFeature[_]] = js.native
}

