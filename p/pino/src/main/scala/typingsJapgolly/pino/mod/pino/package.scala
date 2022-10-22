package typingsJapgolly.pino.mod.pino

import typingsJapgolly.pino.mod.CustomLevelLogger
import typingsJapgolly.pino.mod.LoggerExtras
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Bindings = Record[String, Any]

type LevelChangeEventListener = js.Function4[
/* lvl */ LevelWithSilent | String, 
/* val */ Double, 
/* prevLvl */ LevelWithSilent | String, 
/* prevVal */ Double, 
Unit]

type LogDescriptor = Record[String, Any]

type Logger[Options] = BaseLogger & LoggerExtras[Options] & CustomLevelLogger[Options]

type PrettyOptions = typingsJapgolly.pinoPretty.mod.PrettyOptions

type SerializedError = typingsJapgolly.pinoStdSerializers.mod.SerializedError

type SerializedRequest = typingsJapgolly.pinoStdSerializers.mod.SerializedRequest

type SerializedResponse = typingsJapgolly.pinoStdSerializers.mod.SerializedResponse

type SerializerFn = js.Function1[/* value */ Any, Any]

type WriteFn = js.Function1[/* o */ js.Object, Unit]
