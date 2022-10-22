package typingsJapgolly.vscodeLanguageserverProtocol.mod

import typingsJapgolly.vscodeJsonrpc.libCommonMessageWriterMod.MessageWriterOptions
import typingsJapgolly.vscodeJsonrpc.libCommonRalMod.RAL.MessageBufferEncoding
import typingsJapgolly.vscodeJsonrpc.libCommonRalMod.RAL.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver-protocol", "WriteableStreamMessageWriter")
@js.native
open class WriteableStreamMessageWriter protected ()
  extends typingsJapgolly.vscodeJsonrpc.mod.WriteableStreamMessageWriter {
  def this(writable: WritableStream) = this()
  def this(writable: WritableStream, options: MessageWriterOptions) = this()
  def this(writable: WritableStream, options: MessageBufferEncoding) = this()
}
