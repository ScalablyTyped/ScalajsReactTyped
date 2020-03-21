package typingsJapgolly.grammarkdown.mod

import typingsJapgolly.grammarkdown.optionsMod.CompilerOptions
import typingsJapgolly.prex.mod.CancellationToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "Grammar")
@js.native
class Grammar protected ()
  extends typingsJapgolly.grammarkdown.grammarMod.Grammar {
  def this(rootNames: js.Iterable[String]) = this()
  def this(rootNames: js.Iterable[String], options: CompilerOptions) = this()
  def this(
    rootNames: js.Iterable[String],
    options: CompilerOptions,
    host: typingsJapgolly.grammarkdown.hostMod.AsyncHost
  ) = this()
  def this(
    rootNames: js.Iterable[String],
    options: CompilerOptions,
    host: typingsJapgolly.grammarkdown.hostMod.Host
  ) = this()
  def this(
    rootNames: js.Iterable[String],
    options: CompilerOptions,
    host: typingsJapgolly.grammarkdown.hostMod.SyncHost
  ) = this()
}

/* static members */
@JSImport("grammarkdown", "Grammar")
@js.native
object Grammar extends js.Object {
  def convert(content: String): String = js.native
  def convert(content: String, options: CompilerOptions): String = js.native
  def convert(
    content: String,
    options: CompilerOptions,
    hostFallback: typingsJapgolly.grammarkdown.hostMod.AsyncHost
  ): String = js.native
  def convert(
    content: String,
    options: CompilerOptions,
    hostFallback: typingsJapgolly.grammarkdown.hostMod.AsyncHost,
    cancellationToken: CancellationToken
  ): String = js.native
  def convert(content: String, options: CompilerOptions, hostFallback: typingsJapgolly.grammarkdown.hostMod.Host): String = js.native
  def convert(
    content: String,
    options: CompilerOptions,
    hostFallback: typingsJapgolly.grammarkdown.hostMod.Host,
    cancellationToken: CancellationToken
  ): String = js.native
  def convert(
    content: String,
    options: CompilerOptions,
    hostFallback: typingsJapgolly.grammarkdown.hostMod.SyncHost
  ): String = js.native
  def convert(
    content: String,
    options: CompilerOptions,
    hostFallback: typingsJapgolly.grammarkdown.hostMod.SyncHost,
    cancellationToken: CancellationToken
  ): String = js.native
}

