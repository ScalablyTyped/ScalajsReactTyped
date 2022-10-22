package typingsJapgolly.node

import typingsJapgolly.node.NodeJS.ReadableStream
import typingsJapgolly.node.NodeJS.WritableStream
import typingsJapgolly.node.anon.AutoCommit
import typingsJapgolly.node.readlineMod.AsyncCompleter
import typingsJapgolly.node.readlineMod.Completer
import typingsJapgolly.node.readlineMod.Direction
import typingsJapgolly.node.readlineMod.ReadLineOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeColonreadlineMod {
  
  @JSImport("node:readline", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("node:readline", "Interface")
  @js.native
  open class Interface protected () extends StObject {
    /**
      * NOTE: According to the documentation:
      *
      * > Instances of the `readline.Interface` class are constructed using the
      * > `readline.createInterface()` method.
      *
      * @see https://nodejs.org/dist/latest-v10.x/docs/api/readline.html#readline_class_interface
      */
    /* protected */ def this(input: ReadableStream) = this()
    /**
      * NOTE: According to the documentation:
      *
      * > Instances of the `readline.Interface` class are constructed using the
      * > `readline.createInterface()` method.
      *
      * @see https://nodejs.org/dist/latest-v10.x/docs/api/readline.html#readline_class_interface
      */
    /* protected */ def this(options: ReadLineOptions) = this()
    /* protected */ def this(input: ReadableStream, output: WritableStream) = this()
    /* protected */ def this(input: ReadableStream, output: Unit, completer: AsyncCompleter) = this()
    /* protected */ def this(input: ReadableStream, output: Unit, completer: Completer) = this()
    /* protected */ def this(input: ReadableStream, output: WritableStream, completer: AsyncCompleter) = this()
    /* protected */ def this(input: ReadableStream, output: WritableStream, completer: Completer) = this()
    /* protected */ def this(input: ReadableStream, output: Unit, completer: Unit, terminal: Boolean) = this()
    /* protected */ def this(input: ReadableStream, output: Unit, completer: AsyncCompleter, terminal: Boolean) = this()
    /* protected */ def this(input: ReadableStream, output: Unit, completer: Completer, terminal: Boolean) = this()
    /* protected */ def this(input: ReadableStream, output: WritableStream, completer: Unit, terminal: Boolean) = this()
    /* protected */ def this(input: ReadableStream, output: WritableStream, completer: AsyncCompleter, terminal: Boolean) = this()
    /* protected */ def this(input: ReadableStream, output: WritableStream, completer: Completer, terminal: Boolean) = this()
  }
  
  inline def clearLine(stream: WritableStream, dir: Direction): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("clearLine")(stream.asInstanceOf[js.Any], dir.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def clearLine(stream: WritableStream, dir: Direction, callback: js.Function0[Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("clearLine")(stream.asInstanceOf[js.Any], dir.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def clearScreenDown(stream: WritableStream): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("clearScreenDown")(stream.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def clearScreenDown(stream: WritableStream, callback: js.Function0[Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("clearScreenDown")(stream.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def createInterface(input: ReadableStream): typingsJapgolly.node.readlineMod.Interface = ^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.node.readlineMod.Interface]
  inline def createInterface(input: ReadableStream, output: Unit, completer: Unit, terminal: Boolean): typingsJapgolly.node.readlineMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any], terminal.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.node.readlineMod.Interface]
  inline def createInterface(input: ReadableStream, output: Unit, completer: AsyncCompleter): typingsJapgolly.node.readlineMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.node.readlineMod.Interface]
  inline def createInterface(input: ReadableStream, output: Unit, completer: AsyncCompleter, terminal: Boolean): typingsJapgolly.node.readlineMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any], terminal.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.node.readlineMod.Interface]
  inline def createInterface(input: ReadableStream, output: Unit, completer: Completer): typingsJapgolly.node.readlineMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.node.readlineMod.Interface]
  inline def createInterface(input: ReadableStream, output: Unit, completer: Completer, terminal: Boolean): typingsJapgolly.node.readlineMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any], terminal.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.node.readlineMod.Interface]
  inline def createInterface(input: ReadableStream, output: WritableStream): typingsJapgolly.node.readlineMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.node.readlineMod.Interface]
  inline def createInterface(input: ReadableStream, output: WritableStream, completer: Unit, terminal: Boolean): typingsJapgolly.node.readlineMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any], terminal.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.node.readlineMod.Interface]
  inline def createInterface(input: ReadableStream, output: WritableStream, completer: AsyncCompleter): typingsJapgolly.node.readlineMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.node.readlineMod.Interface]
  inline def createInterface(input: ReadableStream, output: WritableStream, completer: AsyncCompleter, terminal: Boolean): typingsJapgolly.node.readlineMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any], terminal.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.node.readlineMod.Interface]
  inline def createInterface(input: ReadableStream, output: WritableStream, completer: Completer): typingsJapgolly.node.readlineMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.node.readlineMod.Interface]
  inline def createInterface(input: ReadableStream, output: WritableStream, completer: Completer, terminal: Boolean): typingsJapgolly.node.readlineMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any], terminal.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.node.readlineMod.Interface]
  inline def createInterface(options: ReadLineOptions): typingsJapgolly.node.readlineMod.Interface = ^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(options.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.node.readlineMod.Interface]
  
  inline def cursorTo(stream: WritableStream, x: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("cursorTo")(stream.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def cursorTo(stream: WritableStream, x: Double, y: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("cursorTo")(stream.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def cursorTo(stream: WritableStream, x: Double, y: Double, callback: js.Function0[Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("cursorTo")(stream.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def cursorTo(stream: WritableStream, x: Double, y: Unit, callback: js.Function0[Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("cursorTo")(stream.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def emitKeypressEvents(stream: ReadableStream): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("emitKeypressEvents")(stream.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def emitKeypressEvents(stream: ReadableStream, readlineInterface: typingsJapgolly.node.readlineMod.Interface): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("emitKeypressEvents")(stream.asInstanceOf[js.Any], readlineInterface.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def moveCursor(stream: WritableStream, dx: Double, dy: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("moveCursor")(stream.asInstanceOf[js.Any], dx.asInstanceOf[js.Any], dy.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def moveCursor(stream: WritableStream, dx: Double, dy: Double, callback: js.Function0[Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("moveCursor")(stream.asInstanceOf[js.Any], dx.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  object promises {
    
    @JSImport("node:readline", "promises")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("node:readline", "promises.Interface")
    @js.native
    open class Interface protected () extends StObject {
      /**
        * NOTE: According to the documentation:
        *
        * > Instances of the `readline.Interface` class are constructed using the
        * > `readline.createInterface()` method.
        *
        * @see https://nodejs.org/dist/latest-v10.x/docs/api/readline.html#readline_class_interface
        */
      /* protected */ def this(input: ReadableStream) = this()
      /**
        * NOTE: According to the documentation:
        *
        * > Instances of the `readline.Interface` class are constructed using the
        * > `readline.createInterface()` method.
        *
        * @see https://nodejs.org/dist/latest-v10.x/docs/api/readline.html#readline_class_interface
        */
      /* protected */ def this(options: ReadLineOptions) = this()
      /* protected */ def this(input: ReadableStream, output: WritableStream) = this()
      /* protected */ def this(input: ReadableStream, output: Unit, completer: AsyncCompleter) = this()
      /* protected */ def this(input: ReadableStream, output: Unit, completer: Completer) = this()
      /* protected */ def this(input: ReadableStream, output: WritableStream, completer: AsyncCompleter) = this()
      /* protected */ def this(input: ReadableStream, output: WritableStream, completer: Completer) = this()
      /* protected */ def this(input: ReadableStream, output: Unit, completer: Unit, terminal: Boolean) = this()
      /* protected */ def this(input: ReadableStream, output: Unit, completer: AsyncCompleter, terminal: Boolean) = this()
      /* protected */ def this(input: ReadableStream, output: Unit, completer: Completer, terminal: Boolean) = this()
      /* protected */ def this(input: ReadableStream, output: WritableStream, completer: Unit, terminal: Boolean) = this()
      /* protected */ def this(input: ReadableStream, output: WritableStream, completer: AsyncCompleter, terminal: Boolean) = this()
      /* protected */ def this(input: ReadableStream, output: WritableStream, completer: Completer, terminal: Boolean) = this()
    }
    
    @JSImport("node:readline", "promises.Readline")
    @js.native
    open class Readline protected ()
      extends typingsJapgolly.node.readlineMod.promises.Readline {
      /**
        * @param stream A TTY stream.
        */
      def this(stream: WritableStream) = this()
      def this(stream: WritableStream, options: AutoCommit) = this()
    }
    
    /**
      * The `readlinePromises.createInterface()` method creates a new `readlinePromises.Interface` instance.
      *
      * ```js
      * const readlinePromises = require('node:readline/promises');
      * const rl = readlinePromises.createInterface({
      *   input: process.stdin,
      *   output: process.stdout
      * });
      * ```
      *
      * Once the `readlinePromises.Interface` instance is created, the most common case is to listen for the `'line'` event:
      *
      * ```js
      * rl.on('line', (line) => {
      *   console.log(`Received: ${line}`);
      * });
      * ```
      *
      * If `terminal` is `true` for this instance then the `output` stream will get the best compatibility if it defines an `output.columns` property,
      * and emits a `'resize'` event on the `output`, if or when the columns ever change (`process.stdout` does this automatically when it is a TTY).
      *
      * ## Use of the `completer` function
      *
      * The `completer` function takes the current line entered by the user as an argument, and returns an `Array` with 2 entries:
      *
      * - An Array with matching entries for the completion.
      * - The substring that was used for the matching.
      *
      * For instance: `[[substr1, substr2, ...], originalsubstring]`.
      *
      * ```js
      * function completer(line) {
      *   const completions = '.help .error .exit .quit .q'.split(' ');
      *   const hits = completions.filter((c) => c.startsWith(line));
      *   // Show all completions if none found
      *   return [hits.length ? hits : completions, line];
      * }
      * ```
      *
      * The `completer` function can also returns a `Promise`, or be asynchronous:
      *
      * ```js
      * async function completer(linePartial) {
      *   await someAsyncWork();
      *   return [['123'], linePartial];
      * }
      * ```
      */
    inline def createInterface(input: ReadableStream): typingsJapgolly.node.readlinePromisesMod.Interface = ^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.node.readlinePromisesMod.Interface]
    inline def createInterface(input: ReadableStream, output: Unit, completer: Unit, terminal: Boolean): typingsJapgolly.node.readlinePromisesMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any], terminal.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.node.readlinePromisesMod.Interface]
    inline def createInterface(input: ReadableStream, output: Unit, completer: AsyncCompleter): typingsJapgolly.node.readlinePromisesMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.node.readlinePromisesMod.Interface]
    inline def createInterface(input: ReadableStream, output: Unit, completer: AsyncCompleter, terminal: Boolean): typingsJapgolly.node.readlinePromisesMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any], terminal.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.node.readlinePromisesMod.Interface]
    inline def createInterface(input: ReadableStream, output: Unit, completer: Completer): typingsJapgolly.node.readlinePromisesMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.node.readlinePromisesMod.Interface]
    inline def createInterface(input: ReadableStream, output: Unit, completer: Completer, terminal: Boolean): typingsJapgolly.node.readlinePromisesMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any], terminal.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.node.readlinePromisesMod.Interface]
    inline def createInterface(input: ReadableStream, output: WritableStream): typingsJapgolly.node.readlinePromisesMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.node.readlinePromisesMod.Interface]
    inline def createInterface(input: ReadableStream, output: WritableStream, completer: Unit, terminal: Boolean): typingsJapgolly.node.readlinePromisesMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any], terminal.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.node.readlinePromisesMod.Interface]
    inline def createInterface(input: ReadableStream, output: WritableStream, completer: AsyncCompleter): typingsJapgolly.node.readlinePromisesMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.node.readlinePromisesMod.Interface]
    inline def createInterface(input: ReadableStream, output: WritableStream, completer: AsyncCompleter, terminal: Boolean): typingsJapgolly.node.readlinePromisesMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any], terminal.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.node.readlinePromisesMod.Interface]
    inline def createInterface(input: ReadableStream, output: WritableStream, completer: Completer): typingsJapgolly.node.readlinePromisesMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.node.readlinePromisesMod.Interface]
    inline def createInterface(input: ReadableStream, output: WritableStream, completer: Completer, terminal: Boolean): typingsJapgolly.node.readlinePromisesMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any], terminal.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.node.readlinePromisesMod.Interface]
    inline def createInterface(options: ReadLineOptions): typingsJapgolly.node.readlinePromisesMod.Interface = ^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(options.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.node.readlinePromisesMod.Interface]
  }
}
