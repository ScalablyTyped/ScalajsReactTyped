package typingsJapgolly.vscodeLanguageserver.mod

import typingsJapgolly.vscodeJsonrpc.libCommonConnectionMod.Logger
import typingsJapgolly.vscodeJsonrpc.libCommonConnectionMod.MessageConnection
import typingsJapgolly.vscodeLanguageserver.libCommonServerMod.ClientFeature
import typingsJapgolly.vscodeLanguageserver.libCommonServerMod.ConsoleFeature
import typingsJapgolly.vscodeLanguageserver.libCommonServerMod.Features
import typingsJapgolly.vscodeLanguageserver.libCommonServerMod.LanguagesFeature
import typingsJapgolly.vscodeLanguageserver.libCommonServerMod.NotebooksFeature
import typingsJapgolly.vscodeLanguageserver.libCommonServerMod.TelemetryFeature
import typingsJapgolly.vscodeLanguageserver.libCommonServerMod.TracerFeature
import typingsJapgolly.vscodeLanguageserver.libCommonServerMod.WatchDog
import typingsJapgolly.vscodeLanguageserver.libCommonServerMod.WindowFeature
import typingsJapgolly.vscodeLanguageserver.libCommonServerMod.WorkspaceFeature
import typingsJapgolly.vscodeLanguageserver.libCommonServerMod._Connection
import typingsJapgolly.vscodeLanguageserver.mod.^
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonConnectionMod.ProtocolConnection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def EOL: js.Array[String] = ^.asInstanceOf[js.Dynamic].selectDynamic("EOL").asInstanceOf[js.Array[String]]

inline def NullLogger: Logger = ^.asInstanceOf[js.Dynamic].selectDynamic("NullLogger").asInstanceOf[Logger]

inline def combineClientFeatures[O, T](one: ClientFeature[O], two: ClientFeature[T]): ClientFeature[O & T] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineClientFeatures")(one.asInstanceOf[js.Any], two.asInstanceOf[js.Any])).asInstanceOf[ClientFeature[O & T]]

inline def combineConsoleFeatures[O, T](one: ConsoleFeature[O], two: ConsoleFeature[T]): ConsoleFeature[O & T] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineConsoleFeatures")(one.asInstanceOf[js.Any], two.asInstanceOf[js.Any])).asInstanceOf[ConsoleFeature[O & T]]

inline def combineFeatures[OConsole, OTracer, OTelemetry, OClient, OWindow, OWorkspace, OLanguages, ONotebooks, TConsole, TTracer, TTelemetry, TClient, TWindow, TWorkspace, TLanguages, TNotebooks](
  one: Features[OConsole, OTracer, OTelemetry, OClient, OWindow, OWorkspace, OLanguages, ONotebooks],
  two: Features[TConsole, TTracer, TTelemetry, TClient, TWindow, TWorkspace, TLanguages, TNotebooks]
): Features[
OConsole & TConsole, 
OTracer & TTracer, 
OTelemetry & TTelemetry, 
OClient & TClient, 
OWindow & TWindow, 
OWorkspace & TWorkspace, 
OLanguages & TLanguages, 
ONotebooks & TNotebooks] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineFeatures")(one.asInstanceOf[js.Any], two.asInstanceOf[js.Any])).asInstanceOf[Features[
OConsole & TConsole, 
OTracer & TTracer, 
OTelemetry & TTelemetry, 
OClient & TClient, 
OWindow & TWindow, 
OWorkspace & TWorkspace, 
OLanguages & TLanguages, 
ONotebooks & TNotebooks]]

inline def combineLanguagesFeatures[O, T](one: LanguagesFeature[O], two: LanguagesFeature[T]): LanguagesFeature[O & T] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLanguagesFeatures")(one.asInstanceOf[js.Any], two.asInstanceOf[js.Any])).asInstanceOf[LanguagesFeature[O & T]]

inline def combineNotebooksFeatures[O, T](one: NotebooksFeature[O], two: NotebooksFeature[T]): NotebooksFeature[O & T] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineNotebooksFeatures")(one.asInstanceOf[js.Any], two.asInstanceOf[js.Any])).asInstanceOf[NotebooksFeature[O & T]]

inline def combineTelemetryFeatures[O, T](one: TelemetryFeature[O], two: TelemetryFeature[T]): TelemetryFeature[O & T] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineTelemetryFeatures")(one.asInstanceOf[js.Any], two.asInstanceOf[js.Any])).asInstanceOf[TelemetryFeature[O & T]]

inline def combineTracerFeatures[O, T](one: TracerFeature[O], two: TracerFeature[T]): TracerFeature[O & T] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineTracerFeatures")(one.asInstanceOf[js.Any], two.asInstanceOf[js.Any])).asInstanceOf[TracerFeature[O & T]]

inline def combineWindowFeatures[O, T](one: WindowFeature[O], two: WindowFeature[T]): WindowFeature[O & T] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineWindowFeatures")(one.asInstanceOf[js.Any], two.asInstanceOf[js.Any])).asInstanceOf[WindowFeature[O & T]]

inline def combineWorkspaceFeatures[O, T](one: WorkspaceFeature[O], two: WorkspaceFeature[T]): WorkspaceFeature[O & T] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineWorkspaceFeatures")(one.asInstanceOf[js.Any], two.asInstanceOf[js.Any])).asInstanceOf[WorkspaceFeature[O & T]]

inline def createConnection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages, PNotebooks](connectionFactory: js.Function1[/* logger */ Logger, ProtocolConnection], watchDog: WatchDog): _Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages, PNotebooks] = (^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(connectionFactory.asInstanceOf[js.Any], watchDog.asInstanceOf[js.Any])).asInstanceOf[_Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages, PNotebooks]]
inline def createConnection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages, PNotebooks](
  connectionFactory: js.Function1[/* logger */ Logger, ProtocolConnection],
  watchDog: WatchDog,
  factories: Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages, PNotebooks]
): _Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages, PNotebooks] = (^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(connectionFactory.asInstanceOf[js.Any], watchDog.asInstanceOf[js.Any], factories.asInstanceOf[js.Any])).asInstanceOf[_Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages, PNotebooks]]

inline def createMessageConnection(
  messageReader: typingsJapgolly.vscodeJsonrpc.libCommonMessageReaderMod.MessageReader,
  messageWriter: typingsJapgolly.vscodeJsonrpc.libCommonMessageWriterMod.MessageWriter
): MessageConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("createMessageConnection")(messageReader.asInstanceOf[js.Any], messageWriter.asInstanceOf[js.Any])).asInstanceOf[MessageConnection]
inline def createMessageConnection(
  messageReader: typingsJapgolly.vscodeJsonrpc.libCommonMessageReaderMod.MessageReader,
  messageWriter: typingsJapgolly.vscodeJsonrpc.libCommonMessageWriterMod.MessageWriter,
  _logger: Unit,
  options: typingsJapgolly.vscodeJsonrpc.libCommonConnectionMod.ConnectionOptions
): MessageConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("createMessageConnection")(messageReader.asInstanceOf[js.Any], messageWriter.asInstanceOf[js.Any], _logger.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[MessageConnection]
inline def createMessageConnection(
  messageReader: typingsJapgolly.vscodeJsonrpc.libCommonMessageReaderMod.MessageReader,
  messageWriter: typingsJapgolly.vscodeJsonrpc.libCommonMessageWriterMod.MessageWriter,
  _logger: Logger
): MessageConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("createMessageConnection")(messageReader.asInstanceOf[js.Any], messageWriter.asInstanceOf[js.Any], _logger.asInstanceOf[js.Any])).asInstanceOf[MessageConnection]
inline def createMessageConnection(
  messageReader: typingsJapgolly.vscodeJsonrpc.libCommonMessageReaderMod.MessageReader,
  messageWriter: typingsJapgolly.vscodeJsonrpc.libCommonMessageWriterMod.MessageWriter,
  _logger: Logger,
  options: typingsJapgolly.vscodeJsonrpc.libCommonConnectionMod.ConnectionOptions
): MessageConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("createMessageConnection")(messageReader.asInstanceOf[js.Any], messageWriter.asInstanceOf[js.Any], _logger.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[MessageConnection]

inline def createProtocolConnection(
  input: typingsJapgolly.vscodeJsonrpc.libCommonMessageReaderMod.MessageReader,
  output: typingsJapgolly.vscodeJsonrpc.libCommonMessageWriterMod.MessageWriter
): ProtocolConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("createProtocolConnection")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[ProtocolConnection]
inline def createProtocolConnection(
  input: typingsJapgolly.vscodeJsonrpc.libCommonMessageReaderMod.MessageReader,
  output: typingsJapgolly.vscodeJsonrpc.libCommonMessageWriterMod.MessageWriter,
  logger: Unit,
  options: typingsJapgolly.vscodeJsonrpc.libCommonConnectionMod.ConnectionOptions
): ProtocolConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("createProtocolConnection")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ProtocolConnection]
inline def createProtocolConnection(
  input: typingsJapgolly.vscodeJsonrpc.libCommonMessageReaderMod.MessageReader,
  output: typingsJapgolly.vscodeJsonrpc.libCommonMessageWriterMod.MessageWriter,
  logger: Unit,
  options: typingsJapgolly.vscodeJsonrpc.libCommonConnectionMod.ConnectionStrategy
): ProtocolConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("createProtocolConnection")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ProtocolConnection]
inline def createProtocolConnection(
  input: typingsJapgolly.vscodeJsonrpc.libCommonMessageReaderMod.MessageReader,
  output: typingsJapgolly.vscodeJsonrpc.libCommonMessageWriterMod.MessageWriter,
  logger: Logger
): ProtocolConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("createProtocolConnection")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[ProtocolConnection]
inline def createProtocolConnection(
  input: typingsJapgolly.vscodeJsonrpc.libCommonMessageReaderMod.MessageReader,
  output: typingsJapgolly.vscodeJsonrpc.libCommonMessageWriterMod.MessageWriter,
  logger: Logger,
  options: typingsJapgolly.vscodeJsonrpc.libCommonConnectionMod.ConnectionOptions
): ProtocolConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("createProtocolConnection")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ProtocolConnection]
inline def createProtocolConnection(
  input: typingsJapgolly.vscodeJsonrpc.libCommonMessageReaderMod.MessageReader,
  output: typingsJapgolly.vscodeJsonrpc.libCommonMessageWriterMod.MessageWriter,
  logger: Logger,
  options: typingsJapgolly.vscodeJsonrpc.libCommonConnectionMod.ConnectionStrategy
): ProtocolConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("createProtocolConnection")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ProtocolConnection]
