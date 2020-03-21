package typingsJapgolly.jestConsole

import typingsJapgolly.jestConsole.bufferedConsoleMod.default
import typingsJapgolly.jestConsole.customConsoleMod.Formatter
import typingsJapgolly.jestConsole.typesMod.ConsoleBuffer
import typingsJapgolly.jestConsole.typesMod.LogEntry
import typingsJapgolly.jestConsole.typesMod.LogMessage
import typingsJapgolly.jestConsole.typesMod.LogType
import typingsJapgolly.jestSourceMap.typesMod.SourceMapRegistry
import typingsJapgolly.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/console", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class BufferedConsole protected () extends default {
    def this(getSourceMaps: js.Function0[js.UndefOr[SourceMapRegistry | Null]]) = this()
  }
  
  @js.native
  class CustomConsole protected ()
    extends typingsJapgolly.jestConsole.customConsoleMod.default {
    def this(stdout: WritableStream, stderr: WritableStream) = this()
    def this(stdout: WritableStream, stderr: WritableStream, formatBuffer: Formatter) = this()
  }
  
  @js.native
  class NullConsole ()
    extends typingsJapgolly.jestConsole.nullConsoleMod.NullConsole
  
  def getConsoleOutput(root: String, verbose: Boolean, buffer: js.Array[LogEntry]): String = js.native
  /* static members */
  @js.native
  object BufferedConsole extends js.Object {
    def write(buffer: ConsoleBuffer, `type`: LogType, message: LogMessage): js.Array[LogEntry] = js.native
    def write(buffer: ConsoleBuffer, `type`: LogType, message: LogMessage, level: Double): js.Array[LogEntry] = js.native
    def write(
      buffer: ConsoleBuffer,
      `type`: LogType,
      message: LogMessage,
      level: Double,
      sourceMaps: SourceMapRegistry
    ): js.Array[LogEntry] = js.native
    def write(
      buffer: ConsoleBuffer,
      `type`: LogType,
      message: LogMessage,
      level: Null,
      sourceMaps: SourceMapRegistry
    ): js.Array[LogEntry] = js.native
  }
  
}

