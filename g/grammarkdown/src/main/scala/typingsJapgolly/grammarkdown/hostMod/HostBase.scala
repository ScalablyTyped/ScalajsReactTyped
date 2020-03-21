package typingsJapgolly.grammarkdown.hostMod

import typingsJapgolly.grammarkdown.nodesMod.SourceFile
import typingsJapgolly.grammarkdown.parserMod.Parser
import typingsJapgolly.prex.mod.CancellationToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/host", "HostBase")
@js.native
abstract class HostBase () extends js.Object {
  def this(hasIgnoreCaseKnownGrammarsUseBuiltinGrammars: HostBaseOptions) = this()
  val ignoreCase: Boolean = js.native
  var innerParser: js.Any = js.native
  var knownGrammars: js.Any = js.native
  val parser: Parser = js.native
  var useBuiltinGrammars: js.Any = js.native
  /* protected */ def createParser(): Parser = js.native
  def normalizeFile(file: String): String = js.native
  def parseSourceFile(file: String, text: String): SourceFile = js.native
  def parseSourceFile(file: String, text: String, cancellationToken: CancellationToken): SourceFile = js.native
  def registerKnownGrammar(name: String, file: String): Unit = js.native
  /* protected */ def resolveBuiltInGrammar(name: String): js.UndefOr[String] = js.native
  def resolveFile(file: String): String = js.native
  def resolveFile(file: String, referer: String): String = js.native
  def resolveKnownGrammar(name: String): js.UndefOr[String] = js.native
}

