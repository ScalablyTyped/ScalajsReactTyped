package typingsJapgolly.vscodeLanguageserverProtocol.mod

import typingsJapgolly.vscodeJsonrpc.libCommonConnectionMod.Logger
import typingsJapgolly.vscodeJsonrpc.libCommonConnectionMod.MessageConnection
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonConnectionMod.ProtocolConnection
import typingsJapgolly.vscodeLanguageserverProtocol.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def EOL: js.Array[String] = ^.asInstanceOf[js.Dynamic].selectDynamic("EOL").asInstanceOf[js.Array[String]]

type LSPErrorCodes = typingsJapgolly.vscodeLanguageserverTypes.mod.integer

inline def NullLogger: Logger = ^.asInstanceOf[js.Dynamic].selectDynamic("NullLogger").asInstanceOf[Logger]

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
