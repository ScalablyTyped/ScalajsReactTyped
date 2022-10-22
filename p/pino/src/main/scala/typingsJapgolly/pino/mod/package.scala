package typingsJapgolly.pino.mod

import typingsJapgolly.node.NodeJS.WritableStream
import typingsJapgolly.pino.mod.^
import typingsJapgolly.sonicBoom.mod.SonicBoom
import typingsJapgolly.sonicBoom.mod.SonicBoomOpts
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def destination: js.Function1[
/* dest */ js.UndefOr[
  String | Double | SonicBoomOpts | typingsJapgolly.pino.mod.pino.DestinationStream | WritableStream
], 
SonicBoom] = ^.asInstanceOf[js.Dynamic].selectDynamic("destination").asInstanceOf[js.Function1[
/* dest */ js.UndefOr[
  String | Double | SonicBoomOpts | typingsJapgolly.pino.mod.pino.DestinationStream | WritableStream
], 
SonicBoom]]

inline def levels: typingsJapgolly.pino.mod.pino.LevelMapping = ^.asInstanceOf[js.Dynamic].selectDynamic("levels").asInstanceOf[typingsJapgolly.pino.mod.pino.LevelMapping]

inline def multistream: js.Function2[
/* streamsArray */ (js.Array[
  typingsJapgolly.pino.mod.pino.DestinationStream | typingsJapgolly.pino.mod.pino.StreamEntry
]) | typingsJapgolly.pino.mod.pino.DestinationStream | typingsJapgolly.pino.mod.pino.StreamEntry, 
/* opts */ js.UndefOr[typingsJapgolly.pino.mod.pino.MultiStreamOptions], 
typingsJapgolly.pino.mod.pino.MultiStreamRes] = ^.asInstanceOf[js.Dynamic].selectDynamic("multistream").asInstanceOf[js.Function2[
/* streamsArray */ (js.Array[
  typingsJapgolly.pino.mod.pino.DestinationStream | typingsJapgolly.pino.mod.pino.StreamEntry
]) | typingsJapgolly.pino.mod.pino.DestinationStream | typingsJapgolly.pino.mod.pino.StreamEntry, 
/* opts */ js.UndefOr[typingsJapgolly.pino.mod.pino.MultiStreamOptions], 
typingsJapgolly.pino.mod.pino.MultiStreamRes]]

inline def transport[TransportOptions](options: typingsJapgolly.pino.mod.pino.TransportMultiOptions[TransportOptions]): ThreadStream = ^.asInstanceOf[js.Dynamic].applyDynamic("transport")(options.asInstanceOf[js.Any]).asInstanceOf[ThreadStream]
inline def transport[TransportOptions](options: typingsJapgolly.pino.mod.pino.TransportPipelineOptions[TransportOptions]): ThreadStream = ^.asInstanceOf[js.Dynamic].applyDynamic("transport")(options.asInstanceOf[js.Any]).asInstanceOf[ThreadStream]
inline def transport[TransportOptions](options: typingsJapgolly.pino.mod.pino.TransportSingleOptions[TransportOptions]): ThreadStream = ^.asInstanceOf[js.Dynamic].applyDynamic("transport")(options.asInstanceOf[js.Any]).asInstanceOf[ThreadStream]

inline def version: String = ^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[String]

type BaseLogger = typingsJapgolly.pino.mod.pino.BaseLogger

type Bindings = typingsJapgolly.pino.mod.pino.Bindings

type ChildLoggerOptions = typingsJapgolly.pino.mod.pino.ChildLoggerOptions

type DestinationStream = typingsJapgolly.pino.mod.pino.DestinationStream

type Level = typingsJapgolly.pino.mod.pino.Level

type LevelChangeEventListener = typingsJapgolly.pino.mod.pino.LevelChangeEventListener

type LevelMapping = typingsJapgolly.pino.mod.pino.LevelMapping

type LevelWithSilent = typingsJapgolly.pino.mod.pino.LevelWithSilent

type LogDescriptor = typingsJapgolly.pino.mod.pino.LogDescriptor

type LogEvent = typingsJapgolly.pino.mod.pino.LogEvent

type LogFn = typingsJapgolly.pino.mod.pino.LogFn

type Logger[Options] = typingsJapgolly.pino.mod.pino.Logger[Options]

type LoggerOptions = typingsJapgolly.pino.mod.pino.LoggerOptions

type MixinFn = js.Function2[/* mergeObject */ js.Object, /* level */ Double, js.Object]

type MixinMergeStrategyFn = js.Function2[/* mergeObject */ js.Object, /* mixinObject */ js.Object, js.Object]

type MultiStreamOptions = typingsJapgolly.pino.mod.pino.MultiStreamOptions

type MultiStreamRes = typingsJapgolly.pino.mod.pino.MultiStreamRes

/**
* A synchronous callback that will run on each creation of a new child.
* @param child: The newly created child logger instance.
*/
type OnChildCallback[Options] = js.Function1[
/* child */ typingsJapgolly.pino.mod.pino.Logger[Options & typingsJapgolly.pino.mod.pino.ChildLoggerOptions], 
Unit]

type PrettyOptions = typingsJapgolly.pino.mod.pino.PrettyOptions

type SerializedError = typingsJapgolly.pino.mod.pino.SerializedError

type SerializedRequest = typingsJapgolly.pino.mod.pino.SerializedRequest

type SerializedResponse = typingsJapgolly.pino.mod.pino.SerializedResponse

type SerializerFn = typingsJapgolly.pino.mod.pino.SerializerFn

type StreamEntry = typingsJapgolly.pino.mod.pino.StreamEntry

//// Non-exported types and interfaces
// ToDo https://github.com/pinojs/thread-stream/issues/24
type ThreadStream = Any

type TimeFn = js.Function0[String]

type TransportBaseOptions = typingsJapgolly.pino.mod.pino.TransportBaseOptions[Record[String, Any]]

type TransportMultiOptions = typingsJapgolly.pino.mod.pino.TransportMultiOptions[Record[String, Any]]

type TransportPipelineOptions = typingsJapgolly.pino.mod.pino.TransportPipelineOptions[Record[String, Any]]

type TransportSingleOptions = typingsJapgolly.pino.mod.pino.TransportSingleOptions[Record[String, Any]]

type TransportTargetOptions = typingsJapgolly.pino.mod.pino.TransportTargetOptions[Record[String, Any]]

type WriteFn = typingsJapgolly.pino.mod.pino.WriteFn
