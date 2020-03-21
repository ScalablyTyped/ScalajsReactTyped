package typingsJapgolly.jestUtil

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.jestConsole.mod.BufferedConsole
import typingsJapgolly.jestConsole.typesMod.ConsoleBuffer
import typingsJapgolly.jestConsole.typesMod.LogEntry
import typingsJapgolly.jestConsole.typesMod.LogMessage
import typingsJapgolly.jestConsole.typesMod.LogType
import typingsJapgolly.jestSourceMap.typesMod.SourceMapRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofBufferedConsole
  extends Instantiable1[
      /* getSourceMaps */ js.Function0[js.UndefOr[SourceMapRegistry | Null]], 
      BufferedConsole
    ] {
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

