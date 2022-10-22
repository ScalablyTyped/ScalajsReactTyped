package typingsJapgolly.vscodeLanguageclient.mod

import typingsJapgolly.vscodeJsonrpc.libCommonMessageReaderMod.MessageReaderOptions
import typingsJapgolly.vscodeJsonrpc.libCommonRalMod.RAL.MessageBufferEncoding
import typingsJapgolly.vscodeJsonrpc.libCommonRalMod.RAL.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageclient", "ReadableStreamMessageReader")
@js.native
open class ReadableStreamMessageReader protected ()
  extends typingsJapgolly.vscodeLanguageserverProtocol.mod.ReadableStreamMessageReader {
  def this(readable: ReadableStream) = this()
  def this(readable: ReadableStream, options: MessageReaderOptions) = this()
  def this(readable: ReadableStream, options: MessageBufferEncoding) = this()
}
