package typingsJapgolly.grammarkdown.mod

import typingsJapgolly.esfxCancelable.mod.Cancelable
import typingsJapgolly.grammarkdown.anon.CompilerOptionsfilestring
import typingsJapgolly.grammarkdown.distOptionsMod.CompilerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown", "Grammar")
@js.native
open class Grammar protected ()
  extends typingsJapgolly.grammarkdown.distGrammarMod.Grammar {
  /**
    * @param rootNames The names of the root files used by the grammar.
    * @param options The {@link CompilerOptions} used by the grammar.
    * @param host The [Host](xref:hosts) the grammar uses to interact with the file system.
    */
  def this(rootNames: js.Iterable[String]) = this()
  def this(rootNames: js.Iterable[String], options: CompilerOptions) = this()
  def this(
    rootNames: js.Iterable[String],
    options: Unit,
    host: typingsJapgolly.grammarkdown.distHostMod.CoreAsyncHost
  ) = this()
  def this(
    rootNames: js.Iterable[String],
    options: CompilerOptions,
    host: typingsJapgolly.grammarkdown.distHostMod.CoreAsyncHost
  ) = this()
}
/* static members */
object Grammar {
  
  @JSImport("grammarkdown", "Grammar")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Converts a string containing Grammarkdown syntax into output based on the provided options.
    * @param content The Grammarkdown source text to convert.
    * @param options The {@link CompilerOptions} used by the grammar.
    * @param hostFallback An optional host to use as a fallback for file system operations.
    * @param cancelable A cancelable object that can be used to abort the operation.
    */
  inline def convert(content: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("convert")(content.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def convert(content: String, options: Unit, hostFallback: Unit, cancelable: Cancelable): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any], cancelable.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def convert(
    content: String,
    options: Unit,
    hostFallback: typingsJapgolly.grammarkdown.distHostMod.CoreAsyncHost
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def convert(
    content: String,
    options: Unit,
    hostFallback: typingsJapgolly.grammarkdown.distHostMod.CoreAsyncHost,
    cancelable: Cancelable
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any], cancelable.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def convert(content: String, options: CompilerOptionsfilestring): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def convert(content: String, options: CompilerOptionsfilestring, hostFallback: Unit, cancelable: Cancelable): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any], cancelable.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def convert(
    content: String,
    options: CompilerOptionsfilestring,
    hostFallback: typingsJapgolly.grammarkdown.distHostMod.CoreAsyncHost
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def convert(
    content: String,
    options: CompilerOptionsfilestring,
    hostFallback: typingsJapgolly.grammarkdown.distHostMod.CoreAsyncHost,
    cancelable: Cancelable
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any], cancelable.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
}
