package typingsJapgolly.pino

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.node.NodeJS.Dict
import typingsJapgolly.node.workerThreadsMod.ResourceLimits_
import typingsJapgolly.node.workerThreadsMod.TransferListItem
import typingsJapgolly.pino.mod.pino.LogEvent
import typingsJapgolly.pino.mod.pino.LogFn
import typingsJapgolly.pino.mod.pino.Logger
import typingsJapgolly.pino.mod.pino.WriteFn
import typingsJapgolly.std.Parameters
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AsObject extends StObject {
    
    /**
      * The `asObject` option will create a pino-like log object instead of passing all arguments to a console
      * method. When `write` is set, `asObject` will always be true.
      *
      * @example
      * pino.info('hi') // creates and logs {msg: 'hi', level: 30, time: <ts>}
      */
    var asObject: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The serializers provided to `pino` are ignored by default in the browser, including the standard
      * serializers provided with Pino. Since the default destination for log messages is the console, values
      * such as `Error` objects are enhanced for inspection, which they otherwise wouldn't be if the Error
      * serializer was enabled. We can turn all serializers on or we can selectively enable them via an array.
      *
      * When `serialize` is `true` the standard error serializer is also enabled (see
      * {@link https://github.com/pinojs/pino/blob/master/docs/api.md#pino-stdserializers}). This is a global
      * serializer which will apply to any `Error` objects passed to the logger methods.
      *
      * If `serialize` is an array the standard error serializer is also automatically enabled, it can be
      * explicitly disabled by including a string in the serialize array: `!stdSerializers.err` (see example).
      *
      * The `serialize` array also applies to any child logger serializers (see
      * {@link https://github.com/pinojs/pino/blob/master/docs/api.md#bindingsserializers-object} for how to
      * set child-bound serializers).
      *
      * Unlike server pino the serializers apply to every object passed to the logger method, if the `asObject`
      * option is `true`, this results in the serializers applying to the first object (as in server pino).
      *
      * For more info on serializers see
      * {@link https://github.com/pinojs/pino/blob/master/docs/api.md#serializers-object}.
      *
      * @example
      * const pino = require('pino')({
      *   browser: {
      *     serialize: true
      *   }
      * })
      *
      * @example
      * const pino = require('pino')({
      *   serializers: {
      *     custom: myCustomSerializer,
      *     another: anotherSerializer
      *   },
      *   browser: {
      *     serialize: ['custom']
      *   }
      * })
      * // following will apply myCustomSerializer to the custom property,
      * // but will not apply anotherSerializer to another key
      * pino.info({custom: 'a', another: 'b'})
      *
      * @example
      * const pino = require('pino')({
      *   serializers: {
      *     custom: myCustomSerializer,
      *     another: anotherSerializer
      *   },
      *   browser: {
      *     serialize: ['!stdSerializers.err', 'custom'] //will not serialize Errors, will serialize `custom` keys
      *   }
      * })
      */
    var serialize: js.UndefOr[Boolean | js.Array[String]] = js.undefined
    
    /**
      * Options for transmission of logs.
      *
      * @example
      * const pino = require('pino')({
      *   browser: {
      *     transmit: {
      *       level: 'warn',
      *       send: function (level, logEvent) {
      *         if (level === 'warn') {
      *           // maybe send the logEvent to a separate endpoint
      *           // or maybe analyse the messages further before sending
      *         }
      *         // we could also use the `logEvent.level.value` property to determine
      *         // numerical value
      *         if (logEvent.level.value >= 50) { // covers error and fatal
      *
      *           // send the logEvent somewhere
      *         }
      *       }
      *     }
      *   }
      * })
      */
    var transmit: js.UndefOr[Level] = js.undefined
    
    /**
      * Instead of passing log messages to `console.log` they can be passed to a supplied function. If `write` is
      * set to a single function, all logging objects are passed to this function. If `write` is an object, it
      * can have methods that correspond to the levels. When a message is logged at a given level, the
      * corresponding method is called. If a method isn't present, the logging falls back to using the `console`.
      *
      * @example
      * const pino = require('pino')({
      *   browser: {
      *     write: (o) => {
      *       // do something with o
      *     }
      *   }
      * })
      *
      * @example
      * const pino = require('pino')({
      *   browser: {
      *     write: {
      *       info: function (o) {
      *         //process info log object
      *       },
      *       error: function (o) {
      *         //process error log object
      *       }
      *     }
      *   }
      * })
      */
    var write: js.UndefOr[WriteFn | DictlogLevel] = js.undefined
  }
  object AsObject {
    
    inline def apply(): AsObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AsObject]
    }
    
    extension [Self <: AsObject](x: Self) {
      
      inline def setAsObject(value: Boolean): Self = StObject.set(x, "asObject", value.asInstanceOf[js.Any])
      
      inline def setAsObjectUndefined: Self = StObject.set(x, "asObject", js.undefined)
      
      inline def setSerialize(value: Boolean | js.Array[String]): Self = StObject.set(x, "serialize", value.asInstanceOf[js.Any])
      
      inline def setSerializeUndefined: Self = StObject.set(x, "serialize", js.undefined)
      
      inline def setSerializeVarargs(value: String*): Self = StObject.set(x, "serialize", js.Array(value*))
      
      inline def setTransmit(value: Level): Self = StObject.set(x, "transmit", value.asInstanceOf[js.Any])
      
      inline def setTransmitUndefined: Self = StObject.set(x, "transmit", js.undefined)
      
      inline def setWrite(value: WriteFn | DictlogLevel): Self = StObject.set(x, "write", value.asInstanceOf[js.Any])
      
      inline def setWriteFunction1(value: /* o */ js.Object => Callback): Self = StObject.set(x, "write", js.Any.fromFunction1((t0: /* o */ js.Object) => value(t0).runNow()))
      
      inline def setWriteUndefined: Self = StObject.set(x, "write", js.undefined)
    }
  }
  
  trait Bindings extends StObject {
    
    /**
      * Changes the shape of the bindings.
      * The default shape is { pid, hostname }.
      * The function takes a single argument, the bindings object.
      * It will be called every time a child logger is created.
      */
    var bindings: js.UndefOr[js.Function1[/* bindings */ typingsJapgolly.pino.mod.pino.Bindings, js.Object]] = js.undefined
    
    /**
      * Changes the shape of the log level.
      * The default shape is { level: number }.
      * The function takes two arguments, the label of the level (e.g. 'info') and the numeric value (e.g. 30).
      */
    var level: js.UndefOr[js.Function2[/* label */ String, /* number */ Double, js.Object]] = js.undefined
    
    /**
      * Changes the shape of the log object.
      * This function will be called every time one of the log methods (such as .info) is called.
      * All arguments passed to the log method, except the message, will be pass to this function.
      * By default it does not change the shape of the log object.
      */
    var log: js.UndefOr[js.Function1[/* object */ Record[String, Any], Record[String, Any]]] = js.undefined
  }
  object Bindings {
    
    inline def apply(): Bindings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Bindings]
    }
    
    extension [Self <: Bindings](x: Self) {
      
      inline def setBindings(value: /* bindings */ typingsJapgolly.pino.mod.pino.Bindings => js.Object): Self = StObject.set(x, "bindings", js.Any.fromFunction1(value))
      
      inline def setBindingsUndefined: Self = StObject.set(x, "bindings", js.undefined)
      
      inline def setLevel(value: (/* label */ String, /* number */ Double) => js.Object): Self = StObject.set(x, "level", js.Any.fromFunction2(value))
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setLog(value: /* object */ Record[String, Any] => Record[String, Any]): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
      
      inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
    }
  }
  
  trait DictlogLevel
    extends StObject
       with /* logLevel */ StringDictionary[WriteFn] {
    
    var debug: js.UndefOr[WriteFn] = js.undefined
    
    var error: js.UndefOr[WriteFn] = js.undefined
    
    var fatal: js.UndefOr[WriteFn] = js.undefined
    
    var info: js.UndefOr[WriteFn] = js.undefined
    
    var trace: js.UndefOr[WriteFn] = js.undefined
    
    var warn: js.UndefOr[WriteFn] = js.undefined
  }
  object DictlogLevel {
    
    inline def apply(): DictlogLevel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DictlogLevel]
    }
    
    extension [Self <: DictlogLevel](x: Self) {
      
      inline def setDebug(value: /* o */ js.Object => Callback): Self = StObject.set(x, "debug", js.Any.fromFunction1((t0: /* o */ js.Object) => value(t0).runNow()))
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setError(value: /* o */ js.Object => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: /* o */ js.Object) => value(t0).runNow()))
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setFatal(value: /* o */ js.Object => Callback): Self = StObject.set(x, "fatal", js.Any.fromFunction1((t0: /* o */ js.Object) => value(t0).runNow()))
      
      inline def setFatalUndefined: Self = StObject.set(x, "fatal", js.undefined)
      
      inline def setInfo(value: /* o */ js.Object => Callback): Self = StObject.set(x, "info", js.Any.fromFunction1((t0: /* o */ js.Object) => value(t0).runNow()))
      
      inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      inline def setTrace(value: /* o */ js.Object => Callback): Self = StObject.set(x, "trace", js.Any.fromFunction1((t0: /* o */ js.Object) => value(t0).runNow()))
      
      inline def setTraceUndefined: Self = StObject.set(x, "trace", js.undefined)
      
      inline def setWarn(value: /* o */ js.Object => Callback): Self = StObject.set(x, "warn", js.Any.fromFunction1((t0: /* o */ js.Object) => value(t0).runNow()))
      
      inline def setWarnUndefined: Self = StObject.set(x, "warn", js.undefined)
    }
  }
  
  trait Label extends StObject {
    
    var label: String
    
    var value: Double
  }
  object Label {
    
    inline def apply(label: String, value: Double): Label = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Label]
    }
    
    extension [Self <: Label](x: Self) {
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Level extends StObject {
    
    /**
      * Specifies the minimum level (inclusive) of when the `send` function should be called, if not supplied
      * the `send` function will be called based on the main logging `level` (set via `options.level`,
      * defaulting to `info`).
      */
    var level: js.UndefOr[typingsJapgolly.pino.mod.pino.Level | String] = js.undefined
    
    /**
      * Remotely record log messages.
      *
      * @description Called after writing the log message.
      */
    def send(level: typingsJapgolly.pino.mod.pino.Level, logEvent: LogEvent): Unit
  }
  object Level {
    
    inline def apply(send: (typingsJapgolly.pino.mod.pino.Level, LogEvent) => Callback): Level = {
      val __obj = js.Dynamic.literal(send = js.Any.fromFunction2((t0: typingsJapgolly.pino.mod.pino.Level, t1: LogEvent) => (send(t0, t1)).runNow()))
      __obj.asInstanceOf[Level]
    }
    
    extension [Self <: Level](x: Self) {
      
      inline def setLevel(value: typingsJapgolly.pino.mod.pino.Level | String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setSend(value: (typingsJapgolly.pino.mod.pino.Level, LogEvent) => Callback): Self = StObject.set(x, "send", js.Any.fromFunction2((t0: typingsJapgolly.pino.mod.pino.Level, t1: LogEvent) => (value(t0, t1)).runNow()))
    }
  }
  
  trait Log extends StObject {
    
    var bindings: js.UndefOr[js.Function1[/* bindings */ typingsJapgolly.pino.mod.pino.Bindings, js.Object]] = js.undefined
    
    var level: js.UndefOr[js.Function2[/* label */ String, /* number */ Double, js.Object]] = js.undefined
    
    var log: js.UndefOr[js.Function1[/* object */ js.Object, js.Object]] = js.undefined
  }
  object Log {
    
    inline def apply(): Log = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Log]
    }
    
    extension [Self <: Log](x: Self) {
      
      inline def setBindings(value: /* bindings */ typingsJapgolly.pino.mod.pino.Bindings => js.Object): Self = StObject.set(x, "bindings", js.Any.fromFunction1(value))
      
      inline def setBindingsUndefined: Self = StObject.set(x, "bindings", js.undefined)
      
      inline def setLevel(value: (/* label */ String, /* number */ Double) => js.Object): Self = StObject.set(x, "level", js.Any.fromFunction2(value))
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setLog(value: /* object */ js.Object => js.Object): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
      
      inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
    }
  }
  
  trait LogMethod extends StObject {
    
    /**
      * Allows for manipulating the parameters passed to logger methods. The signature for this hook is
      * logMethod (args, method, level) {}, where args is an array of the arguments that were passed to the
      * log method and method is the log method itself, and level is the log level. This hook must invoke the method function by
      * using apply, like so: method.apply(this, newArgumentsArray).
      */
    var logMethod: js.UndefOr[
        js.ThisFunction3[
          /* this */ Logger[this.type], 
          /* args */ Parameters[LogFn], 
          /* method */ LogFn, 
          /* level */ Double, 
          Unit
        ]
      ] = js.undefined
  }
  object LogMethod {
    
    inline def apply(): LogMethod = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LogMethod]
    }
    
    extension [Self <: LogMethod](x: Self) {
      
      inline def setLogMethod(
        value: js.ThisFunction3[
              /* this */ Logger[LogMethod], 
              /* args */ Parameters[LogFn], 
              /* method */ LogFn, 
              /* level */ Double, 
              Unit
            ]
      ): Self = StObject.set(x, "logMethod", value.asInstanceOf[js.Any])
      
      inline def setLogMethodUndefined: Self = StObject.set(x, "logMethod", js.undefined)
    }
  }
  
  /* Inlined node.worker_threads.WorkerOptions & {  autoEnd :boolean | undefined} */
  trait WorkerOptionsautoEndboole extends StObject {
    
    /**
      * List of arguments which would be stringified and appended to
      * `process.argv` in the worker. This is mostly similar to the `workerData`
      * but the values will be available on the global `process.argv` as if they
      * were passed as CLI options to the script.
      */
    var argv: js.UndefOr[js.Array[Any]] = js.undefined
    
    var autoEnd: js.UndefOr[Boolean] = js.undefined
    
    var env: js.UndefOr[Dict[String] | js.Symbol] = js.undefined
    
    var eval: js.UndefOr[Boolean] = js.undefined
    
    var execArgv: js.UndefOr[js.Array[String]] = js.undefined
    
    var resourceLimits: js.UndefOr[ResourceLimits_] = js.undefined
    
    var stderr: js.UndefOr[Boolean] = js.undefined
    
    var stdin: js.UndefOr[Boolean] = js.undefined
    
    var stdout: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default true
      */
    var trackUnmanagedFds: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Additional data to send in the first worker message.
      */
    var transferList: js.UndefOr[js.Array[TransferListItem]] = js.undefined
    
    var workerData: js.UndefOr[Any] = js.undefined
  }
  object WorkerOptionsautoEndboole {
    
    inline def apply(): WorkerOptionsautoEndboole = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkerOptionsautoEndboole]
    }
    
    extension [Self <: WorkerOptionsautoEndboole](x: Self) {
      
      inline def setArgv(value: js.Array[Any]): Self = StObject.set(x, "argv", value.asInstanceOf[js.Any])
      
      inline def setArgvUndefined: Self = StObject.set(x, "argv", js.undefined)
      
      inline def setArgvVarargs(value: Any*): Self = StObject.set(x, "argv", js.Array(value*))
      
      inline def setAutoEnd(value: Boolean): Self = StObject.set(x, "autoEnd", value.asInstanceOf[js.Any])
      
      inline def setAutoEndUndefined: Self = StObject.set(x, "autoEnd", js.undefined)
      
      inline def setEnv(value: Dict[String] | js.Symbol): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setEval(value: Boolean): Self = StObject.set(x, "eval", value.asInstanceOf[js.Any])
      
      inline def setEvalUndefined: Self = StObject.set(x, "eval", js.undefined)
      
      inline def setExecArgv(value: js.Array[String]): Self = StObject.set(x, "execArgv", value.asInstanceOf[js.Any])
      
      inline def setExecArgvUndefined: Self = StObject.set(x, "execArgv", js.undefined)
      
      inline def setExecArgvVarargs(value: String*): Self = StObject.set(x, "execArgv", js.Array(value*))
      
      inline def setResourceLimits(value: ResourceLimits_): Self = StObject.set(x, "resourceLimits", value.asInstanceOf[js.Any])
      
      inline def setResourceLimitsUndefined: Self = StObject.set(x, "resourceLimits", js.undefined)
      
      inline def setStderr(value: Boolean): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
      
      inline def setStderrUndefined: Self = StObject.set(x, "stderr", js.undefined)
      
      inline def setStdin(value: Boolean): Self = StObject.set(x, "stdin", value.asInstanceOf[js.Any])
      
      inline def setStdinUndefined: Self = StObject.set(x, "stdin", js.undefined)
      
      inline def setStdout(value: Boolean): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
      
      inline def setStdoutUndefined: Self = StObject.set(x, "stdout", js.undefined)
      
      inline def setTrackUnmanagedFds(value: Boolean): Self = StObject.set(x, "trackUnmanagedFds", value.asInstanceOf[js.Any])
      
      inline def setTrackUnmanagedFdsUndefined: Self = StObject.set(x, "trackUnmanagedFds", js.undefined)
      
      inline def setTransferList(value: js.Array[TransferListItem]): Self = StObject.set(x, "transferList", value.asInstanceOf[js.Any])
      
      inline def setTransferListUndefined: Self = StObject.set(x, "transferList", js.undefined)
      
      inline def setTransferListVarargs(value: TransferListItem*): Self = StObject.set(x, "transferList", js.Array(value*))
      
      inline def setWorkerData(value: Any): Self = StObject.set(x, "workerData", value.asInstanceOf[js.Any])
      
      inline def setWorkerDataUndefined: Self = StObject.set(x, "workerData", js.undefined)
    }
  }
}
