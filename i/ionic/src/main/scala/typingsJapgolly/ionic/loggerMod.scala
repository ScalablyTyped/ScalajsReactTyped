package typingsJapgolly.ionic

import typingsJapgolly.ionic.definitionsMod.ILogger
import typingsJapgolly.ionicCliFramework.loggerMod.CreateTaggedFormatterOptions
import typingsJapgolly.ionicCliFramework.loggerMod.LoggerFormatter
import typingsJapgolly.ionicCliFramework.loggerMod.LoggerLevelWeight
import typingsJapgolly.ionicCliFramework.mod.StreamHandler
import typingsJapgolly.node.NodeJS.WritableStream
import typingsJapgolly.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/utils/logger", JSImport.Namespace)
@js.native
object loggerMod extends js.Object {
  @js.native
  class Logger () extends ILogger
  
  def createDefaultLoggerHandlers(): Set[StreamHandler] = js.native
  def createDefaultLoggerHandlers(formatter: LoggerFormatter): Set[StreamHandler] = js.native
  def createFormatter(): LoggerFormatter = js.native
  def createFormatter(options: CreateTaggedFormatterOptions): LoggerFormatter = js.native
  def createPrefixedWriteStream(log: ILogger, prefix: String): WritableStream = js.native
  def createPrefixedWriteStream(log: ILogger, prefix: String, level: LoggerLevelWeight): WritableStream = js.native
}

