package typingsJapgolly.roarr

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.node.asyncHooksMod.AsyncLocalStorage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.roarr.distSrcTypesMod.NestedAsyncLocalContext
    - typingsJapgolly.roarr.distSrcTypesMod.TopLevelAsyncLocalContext
  */
  trait AsyncLocalContext extends StObject
  object AsyncLocalContext {
    
    inline def NestedAsyncLocalContext(
      messageContext: StringDictionary[JsonValue],
      sequence: Double,
      sequenceRoot: String,
      transforms: js.Array[TransformMessageFunction[StringDictionary[JsonValue]]]
    ): typingsJapgolly.roarr.distSrcTypesMod.NestedAsyncLocalContext = {
      val __obj = js.Dynamic.literal(messageContext = messageContext.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any], sequenceRoot = sequenceRoot.asInstanceOf[js.Any], transforms = transforms.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.roarr.distSrcTypesMod.NestedAsyncLocalContext]
    }
    
    inline def TopLevelAsyncLocalContext(
      messageContext: StringDictionary[JsonValue],
      transforms: js.Array[TransformMessageFunction[StringDictionary[JsonValue]]]
    ): typingsJapgolly.roarr.distSrcTypesMod.TopLevelAsyncLocalContext = {
      val __obj = js.Dynamic.literal(messageContext = messageContext.asInstanceOf[js.Any], transforms = transforms.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.roarr.distSrcTypesMod.TopLevelAsyncLocalContext]
    }
  }
  
  @js.native
  trait Child[Z] extends StObject {
    
    def apply(context: StringDictionary[JsonValue]): Logger[Z] = js.native
    def apply[T](context: TransformMessageFunction[MessageContext[T]]): Logger[T | Z] = js.native
  }
  
  trait JsonObject
    extends StObject
       with /* k */ StringDictionary[JsonValue]
  object JsonObject {
    
    inline def apply(): JsonObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JsonObject]
    }
  }
  
  type JsonValue = js.UndefOr[JsonObject | js.Array[Any] | Boolean | Double | String | Null]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.roarr.roarrStrings.trace
    - typingsJapgolly.roarr.roarrStrings.debug
    - typingsJapgolly.roarr.roarrStrings.info
    - typingsJapgolly.roarr.roarrStrings.error
    - typingsJapgolly.roarr.roarrStrings.fatal
    - typingsJapgolly.roarr.roarrStrings.warn
  */
  trait LogLevelName extends StObject
  object LogLevelName {
    
    inline def debug: typingsJapgolly.roarr.roarrStrings.debug = "debug".asInstanceOf[typingsJapgolly.roarr.roarrStrings.debug]
    
    inline def error: typingsJapgolly.roarr.roarrStrings.error = "error".asInstanceOf[typingsJapgolly.roarr.roarrStrings.error]
    
    inline def fatal: typingsJapgolly.roarr.roarrStrings.fatal = "fatal".asInstanceOf[typingsJapgolly.roarr.roarrStrings.fatal]
    
    inline def info: typingsJapgolly.roarr.roarrStrings.info = "info".asInstanceOf[typingsJapgolly.roarr.roarrStrings.info]
    
    inline def trace: typingsJapgolly.roarr.roarrStrings.trace = "trace".asInstanceOf[typingsJapgolly.roarr.roarrStrings.trace]
    
    inline def warn: typingsJapgolly.roarr.roarrStrings.warn = "warn".asInstanceOf[typingsJapgolly.roarr.roarrStrings.warn]
  }
  
  @js.native
  trait LogMethod[Z] extends StObject {
    
    def apply[T /* <: String */](
      context: T | Z,
      message: js.UndefOr[
          (/* import warning: importer.ImportType#apply Failed type conversion: T extends / * template literal string: ${string}%${string} * / string ? roarr.roarr/dist/src/types.SprintfArgument : never */ js.Any) | T
        ],
      c: js.UndefOr[
          (/* import warning: importer.ImportType#apply Failed type conversion: T extends / * template literal string: ${string}%${string} * / string ? roarr.roarr/dist/src/types.SprintfArgument : never */ js.Any) | SprintfArgument
        ],
      d: js.UndefOr[SprintfArgument],
      e: js.UndefOr[SprintfArgument],
      f: js.UndefOr[SprintfArgument],
      g: js.UndefOr[SprintfArgument],
      h: js.UndefOr[SprintfArgument],
      i: js.UndefOr[SprintfArgument],
      j: js.UndefOr[SprintfArgument]
    ): Unit = js.native
  }
  
  type LogWriter = js.Function1[/* message */ String, Unit]
  
  @js.native
  trait Logger[Z]
    extends StObject
       with LogMethod[Z] {
    
    def adopt[T](routine: js.Function0[T]): js.Promise[T] = js.native
    def adopt[T](routine: js.Function0[T], context: StringDictionary[JsonValue]): js.Promise[T] = js.native
    def adopt[T](routine: js.Function0[T], context: TransformMessageFunction[StringDictionary[JsonValue]]): js.Promise[T] = js.native
    
    def child(context: StringDictionary[JsonValue]): Logger[Z] = js.native
    def child[T](context: TransformMessageFunction[MessageContext[T]]): Logger[T | Z] = js.native
    @JSName("child")
    var child_Original: Child[Z] = js.native
    
    def debug[T /* <: String */](
      context: T | Z,
      message: js.UndefOr[
          (/* import warning: importer.ImportType#apply Failed type conversion: T extends / * template literal string: ${string}%${string} * / string ? roarr.roarr/dist/src/types.SprintfArgument : never */ js.Any) | T
        ],
      c: js.UndefOr[
          (/* import warning: importer.ImportType#apply Failed type conversion: T extends / * template literal string: ${string}%${string} * / string ? roarr.roarr/dist/src/types.SprintfArgument : never */ js.Any) | SprintfArgument
        ],
      d: js.UndefOr[SprintfArgument],
      e: js.UndefOr[SprintfArgument],
      f: js.UndefOr[SprintfArgument],
      g: js.UndefOr[SprintfArgument],
      h: js.UndefOr[SprintfArgument],
      i: js.UndefOr[SprintfArgument],
      j: js.UndefOr[SprintfArgument]
    ): Unit = js.native
    @JSName("debug")
    var debug_Original: LogMethod[Z] = js.native
    
    def error[T /* <: String */](
      context: T | Z,
      message: js.UndefOr[
          (/* import warning: importer.ImportType#apply Failed type conversion: T extends / * template literal string: ${string}%${string} * / string ? roarr.roarr/dist/src/types.SprintfArgument : never */ js.Any) | T
        ],
      c: js.UndefOr[
          (/* import warning: importer.ImportType#apply Failed type conversion: T extends / * template literal string: ${string}%${string} * / string ? roarr.roarr/dist/src/types.SprintfArgument : never */ js.Any) | SprintfArgument
        ],
      d: js.UndefOr[SprintfArgument],
      e: js.UndefOr[SprintfArgument],
      f: js.UndefOr[SprintfArgument],
      g: js.UndefOr[SprintfArgument],
      h: js.UndefOr[SprintfArgument],
      i: js.UndefOr[SprintfArgument],
      j: js.UndefOr[SprintfArgument]
    ): Unit = js.native
    @JSName("error")
    var error_Original: LogMethod[Z] = js.native
    
    def fatal[T /* <: String */](
      context: T | Z,
      message: js.UndefOr[
          (/* import warning: importer.ImportType#apply Failed type conversion: T extends / * template literal string: ${string}%${string} * / string ? roarr.roarr/dist/src/types.SprintfArgument : never */ js.Any) | T
        ],
      c: js.UndefOr[
          (/* import warning: importer.ImportType#apply Failed type conversion: T extends / * template literal string: ${string}%${string} * / string ? roarr.roarr/dist/src/types.SprintfArgument : never */ js.Any) | SprintfArgument
        ],
      d: js.UndefOr[SprintfArgument],
      e: js.UndefOr[SprintfArgument],
      f: js.UndefOr[SprintfArgument],
      g: js.UndefOr[SprintfArgument],
      h: js.UndefOr[SprintfArgument],
      i: js.UndefOr[SprintfArgument],
      j: js.UndefOr[SprintfArgument]
    ): Unit = js.native
    @JSName("fatal")
    var fatal_Original: LogMethod[Z] = js.native
    
    def getContext(): StringDictionary[JsonValue] = js.native
    
    def info[T /* <: String */](
      context: T | Z,
      message: js.UndefOr[
          (/* import warning: importer.ImportType#apply Failed type conversion: T extends / * template literal string: ${string}%${string} * / string ? roarr.roarr/dist/src/types.SprintfArgument : never */ js.Any) | T
        ],
      c: js.UndefOr[
          (/* import warning: importer.ImportType#apply Failed type conversion: T extends / * template literal string: ${string}%${string} * / string ? roarr.roarr/dist/src/types.SprintfArgument : never */ js.Any) | SprintfArgument
        ],
      d: js.UndefOr[SprintfArgument],
      e: js.UndefOr[SprintfArgument],
      f: js.UndefOr[SprintfArgument],
      g: js.UndefOr[SprintfArgument],
      h: js.UndefOr[SprintfArgument],
      i: js.UndefOr[SprintfArgument],
      j: js.UndefOr[SprintfArgument]
    ): Unit = js.native
    @JSName("info")
    var info_Original: LogMethod[Z] = js.native
    
    def trace[T /* <: String */](
      context: T | Z,
      message: js.UndefOr[
          (/* import warning: importer.ImportType#apply Failed type conversion: T extends / * template literal string: ${string}%${string} * / string ? roarr.roarr/dist/src/types.SprintfArgument : never */ js.Any) | T
        ],
      c: js.UndefOr[
          (/* import warning: importer.ImportType#apply Failed type conversion: T extends / * template literal string: ${string}%${string} * / string ? roarr.roarr/dist/src/types.SprintfArgument : never */ js.Any) | SprintfArgument
        ],
      d: js.UndefOr[SprintfArgument],
      e: js.UndefOr[SprintfArgument],
      f: js.UndefOr[SprintfArgument],
      g: js.UndefOr[SprintfArgument],
      h: js.UndefOr[SprintfArgument],
      i: js.UndefOr[SprintfArgument],
      j: js.UndefOr[SprintfArgument]
    ): Unit = js.native
    @JSName("trace")
    var trace_Original: LogMethod[Z] = js.native
    
    def warn[T /* <: String */](
      context: T | Z,
      message: js.UndefOr[
          (/* import warning: importer.ImportType#apply Failed type conversion: T extends / * template literal string: ${string}%${string} * / string ? roarr.roarr/dist/src/types.SprintfArgument : never */ js.Any) | T
        ],
      c: js.UndefOr[
          (/* import warning: importer.ImportType#apply Failed type conversion: T extends / * template literal string: ${string}%${string} * / string ? roarr.roarr/dist/src/types.SprintfArgument : never */ js.Any) | SprintfArgument
        ],
      d: js.UndefOr[SprintfArgument],
      e: js.UndefOr[SprintfArgument],
      f: js.UndefOr[SprintfArgument],
      g: js.UndefOr[SprintfArgument],
      h: js.UndefOr[SprintfArgument],
      i: js.UndefOr[SprintfArgument],
      j: js.UndefOr[SprintfArgument]
    ): Unit = js.native
    @JSName("warn")
    var warn_Original: LogMethod[Z] = js.native
  }
  
  trait Message[T] extends StObject {
    
    val context: T
    
    val message: String
    
    val sequence: String
    
    val time: Double
    
    val version: String
  }
  object Message {
    
    inline def apply[T](context: T, message: String, sequence: String, time: Double, version: String): Message[T] = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message[T]]
    }
    
    extension [Self <: Message[?], T](x: Self & Message[T]) {
      
      inline def setContext(value: T): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setSequence(value: String): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  type MessageContext[T] = JsonObject & T
  
  @js.native
  trait MessageEventHandler extends StObject {
    
    def apply(message: Message[StringDictionary[JsonValue]]): Unit = js.native
  }
  
  @js.native
  trait MessageSerializer extends StObject {
    
    def apply(message: Message[StringDictionary[JsonValue]]): String = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.roarr.distSrcTypesMod.AsyncLocalContext because Already inherited */ trait NestedAsyncLocalContext
    extends StObject
       with TopLevelAsyncLocalContext {
    
    var sequence: Double
    
    var sequenceRoot: String
  }
  object NestedAsyncLocalContext {
    
    inline def apply(
      messageContext: StringDictionary[JsonValue],
      sequence: Double,
      sequenceRoot: String,
      transforms: js.Array[TransformMessageFunction[StringDictionary[JsonValue]]]
    ): NestedAsyncLocalContext = {
      val __obj = js.Dynamic.literal(messageContext = messageContext.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any], sequenceRoot = sequenceRoot.asInstanceOf[js.Any], transforms = transforms.asInstanceOf[js.Any])
      __obj.asInstanceOf[NestedAsyncLocalContext]
    }
    
    extension [Self <: NestedAsyncLocalContext](x: Self) {
      
      inline def setSequence(value: Double): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
      
      inline def setSequenceRoot(value: String): Self = StObject.set(x, "sequenceRoot", value.asInstanceOf[js.Any])
    }
  }
  
  trait RoarrGlobalState extends StObject {
    
    var asyncLocalStorage: js.UndefOr[AsyncLocalStorage[AsyncLocalContext]] = js.undefined
    
    var sequence: Double
    
    var serializeMessage: js.UndefOr[MessageSerializer] = js.undefined
    
    var versions: js.Array[String]
    
    def write(message: String): Unit
    @JSName("write")
    var write_Original: LogWriter
  }
  object RoarrGlobalState {
    
    inline def apply(sequence: Double, versions: js.Array[String], write: /* message */ String => Callback): RoarrGlobalState = {
      val __obj = js.Dynamic.literal(sequence = sequence.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any], write = js.Any.fromFunction1((t0: /* message */ String) => write(t0).runNow()))
      __obj.asInstanceOf[RoarrGlobalState]
    }
    
    extension [Self <: RoarrGlobalState](x: Self) {
      
      inline def setAsyncLocalStorage(value: AsyncLocalStorage[AsyncLocalContext]): Self = StObject.set(x, "asyncLocalStorage", value.asInstanceOf[js.Any])
      
      inline def setAsyncLocalStorageUndefined: Self = StObject.set(x, "asyncLocalStorage", js.undefined)
      
      inline def setSequence(value: Double): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
      
      inline def setSerializeMessage(value: MessageSerializer): Self = StObject.set(x, "serializeMessage", value.asInstanceOf[js.Any])
      
      inline def setSerializeMessageUndefined: Self = StObject.set(x, "serializeMessage", js.undefined)
      
      inline def setVersions(value: js.Array[String]): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
      
      inline def setVersionsVarargs(value: String*): Self = StObject.set(x, "versions", js.Array(value*))
      
      inline def setWrite(value: /* message */ String => Callback): Self = StObject.set(x, "write", js.Any.fromFunction1((t0: /* message */ String) => value(t0).runNow()))
    }
  }
  
  type SprintfArgument = Boolean | Double | String | Null
  
  trait TopLevelAsyncLocalContext
    extends StObject
       with AsyncLocalContext {
    
    var messageContext: StringDictionary[JsonValue]
    
    var transforms: js.Array[TransformMessageFunction[StringDictionary[JsonValue]]]
  }
  object TopLevelAsyncLocalContext {
    
    inline def apply(
      messageContext: StringDictionary[JsonValue],
      transforms: js.Array[TransformMessageFunction[StringDictionary[JsonValue]]]
    ): TopLevelAsyncLocalContext = {
      val __obj = js.Dynamic.literal(messageContext = messageContext.asInstanceOf[js.Any], transforms = transforms.asInstanceOf[js.Any])
      __obj.asInstanceOf[TopLevelAsyncLocalContext]
    }
    
    extension [Self <: TopLevelAsyncLocalContext](x: Self) {
      
      inline def setMessageContext(value: StringDictionary[JsonValue]): Self = StObject.set(x, "messageContext", value.asInstanceOf[js.Any])
      
      inline def setTransforms(value: js.Array[TransformMessageFunction[StringDictionary[JsonValue]]]): Self = StObject.set(x, "transforms", value.asInstanceOf[js.Any])
      
      inline def setTransformsVarargs(value: TransformMessageFunction[StringDictionary[JsonValue]]*): Self = StObject.set(x, "transforms", js.Array(value*))
    }
  }
  
  @js.native
  trait TransformMessageFunction[T] extends StObject {
    
    def apply(message: Message[T]): Message[StringDictionary[JsonValue]] = js.native
  }
}
