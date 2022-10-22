package typingsJapgolly.charm

import typingsJapgolly.charm.charmStrings.blink
import typingsJapgolly.charm.charmStrings.bright
import typingsJapgolly.charm.charmStrings.char
import typingsJapgolly.charm.charmStrings.dim
import typingsJapgolly.charm.charmStrings.down
import typingsJapgolly.charm.charmStrings.end
import typingsJapgolly.charm.charmStrings.hidden
import typingsJapgolly.charm.charmStrings.line
import typingsJapgolly.charm.charmStrings.reset
import typingsJapgolly.charm.charmStrings.reverse
import typingsJapgolly.charm.charmStrings.screen
import typingsJapgolly.charm.charmStrings.start
import typingsJapgolly.charm.charmStrings.underscore
import typingsJapgolly.charm.charmStrings.up
import typingsJapgolly.node.NodeJS.ReadableStream
import typingsJapgolly.node.NodeJS.WritableStream
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.processMod.global.NodeJS.Process
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Create a new readable/writable charm stream.
    *
    * You can pass in readable or writable streams as parameters
    * and they will be piped to or from accordingly.
    * You can also pass `process` in which case
    * `process.stdin` and `process.stdout` will be used.
    */
  inline def apply(): CharmInstance = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[CharmInstance]
  inline def apply(param: CharmAnyStream): CharmInstance = ^.asInstanceOf[js.Dynamic].apply(param.asInstanceOf[js.Any]).asInstanceOf[CharmInstance]
  
  @JSImport("charm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type CharmAnyStream = WritableStream | ReadableStream | Process
  
  type CharmColor = CharmColorName | CharmColorHex
  
  type CharmColorHex = Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.charm.charmStrings.red
    - typingsJapgolly.charm.charmStrings.yellow
    - typingsJapgolly.charm.charmStrings.green
    - typingsJapgolly.charm.charmStrings.blue
    - typingsJapgolly.charm.charmStrings.cyan
    - typingsJapgolly.charm.charmStrings.magenta
    - typingsJapgolly.charm.charmStrings.black
    - typingsJapgolly.charm.charmStrings.white
  */
  trait CharmColorName extends StObject
  object CharmColorName {
    
    inline def black: typingsJapgolly.charm.charmStrings.black = "black".asInstanceOf[typingsJapgolly.charm.charmStrings.black]
    
    inline def blue: typingsJapgolly.charm.charmStrings.blue = "blue".asInstanceOf[typingsJapgolly.charm.charmStrings.blue]
    
    inline def cyan: typingsJapgolly.charm.charmStrings.cyan = "cyan".asInstanceOf[typingsJapgolly.charm.charmStrings.cyan]
    
    inline def green: typingsJapgolly.charm.charmStrings.green = "green".asInstanceOf[typingsJapgolly.charm.charmStrings.green]
    
    inline def magenta: typingsJapgolly.charm.charmStrings.magenta = "magenta".asInstanceOf[typingsJapgolly.charm.charmStrings.magenta]
    
    inline def red: typingsJapgolly.charm.charmStrings.red = "red".asInstanceOf[typingsJapgolly.charm.charmStrings.red]
    
    inline def white: typingsJapgolly.charm.charmStrings.white = "white".asInstanceOf[typingsJapgolly.charm.charmStrings.white]
    
    inline def yellow: typingsJapgolly.charm.charmStrings.yellow = "yellow".asInstanceOf[typingsJapgolly.charm.charmStrings.yellow]
  }
  
  @js.native
  trait CharmInstance
    extends StObject
       with WritableStream {
    
    /**
      * Set the background color with the string `color`, which can be:
      *
      *  - red
      *  - yellow
      *  - green
      *  - blue
      *  - cyan
      *  - magenta
      *  - black
      *  - white
      *  - or `color` can be an integer from 0 to 255, inclusive.
      */
    def background(color: CharmColor): this.type = js.native
    
    /** Set the cursor visibility with a boolean `visible`. */
    def cursor(visible: Boolean): Any = js.native
    
    /**
      * Delete `'line'` or `'char'`s. delete differs from erase because it does not write over
      * the deleted characters with whitesapce, but instead removes the deleted space.
      *
      * mode can be `'line'` or `'char'`. `n` is the number of items to be deleted.
      * `n` must be a positive integer.
      *
      * The cursor position is not updated.
      */
    def delete(mode: line | char): this.type = js.native
    def delete(mode: line | char, n: Double): this.type = js.native
    
    /** Emit an "end" event downstream. */
    def destroy(): Any = js.native
    
    /**
      * Set the display mode with the string `attr.`
      *
      * `attr` can be:
      *
      *  - reset
      *  - bright
      *  - dim
      *  - underscore
      *  - blink
      *  - reverse
      *  - hidden
      */
    def display(attr: reset | bright | dim | underscore | blink | reverse | hidden): this.type = js.native
    
    /** Move the cursor down by `y` rows. */
    def down(y: Double): this.type = js.native
    
    /**
      * Erase a region defined by the string `s`.
      *
      * `s` can be:
      *
      *  - end - erase from the cursor to the end of the line
      *  - start - erase from the cursor to the start of the line
      *  - line - erase the current line
      *  - down - erase everything below the current line
      *  - up - erase everything above the current line
      *  - screen - erase the entire screen
      */
    def erase(s: end | start | line | down | up | screen): this.type = js.native
    
    /**
      * Set the foreground color with the string `color`, which can be:
      *
      *  - red
      *  - yellow
      *  - green
      *  - blue
      *  - cyan
      *  - magenta
      *  - black
      *  - white
      *  - or `color` can be an integer from 0 to 255, inclusive.
      */
    def foreground(color: CharmColor): this.type = js.native
    
    /**
      * Insert space into the terminal. `insert` is the opposite of `delete`,
      *
      * mode can be `'line'` or `'char'`. `n` is the number of items to be deleted.
      * `n` must be a positive integer.
      */
    def insert(mode: line | char, n: Double): this.type = js.native
    
    /** Move the cursor left by `x` columns. */
    def left(x: Double): this.type = js.native
    
    /** Move the cursor position by the relative coordinates `x`, `y`. */
    def move(x: Double, y: Double): this.type = js.native
    
    /** Pipes the output of Charm to a writeable stream `stream` */
    def pipe(stream: WritableStream): Unit = js.native
    
    /** Pop the cursor state and optionally the attribute state. */
    def pop(): this.type = js.native
    def pop(withAttributes: Boolean): this.type = js.native
    
    /**
      * Query the absolute cursor position from the input stream through the output stream
      * (the shell does this automatically) and get the response back as `cb(x, y)`.
      */
    def position(callback: js.Function2[/* x */ Double, /* y */ Double, Unit]): Unit = js.native
    /** Set the cursor position to the absolute coordinates `x`, `y`. */
    def position(x: Double, y: Double): Unit = js.native
    
    /** Push the cursor state and optionally the attribute state. */
    def push(): this.type = js.native
    def push(withAttributes: Boolean): this.type = js.native
    
    /** Reset the entire screen, like the /usr/bin/reset command. */
    def reset(): Unit = js.native
    
    /** Move the cursor right by `x` columns. */
    def right(x: Double): this.type = js.native
    
    /** Move the cursor up by `y` rows. */
    def up(y: Double): this.type = js.native
    
    def write(msg: String, cb: js.Function): Boolean = js.native
    def write(msgs: String, encoding: String): Boolean = js.native
    def write(msgs: String, encoding: String, cb: js.Function): Boolean = js.native
    def write(msgs: String, encoding: Unit, cb: js.Function): Boolean = js.native
    def write(msgs: Buffer, encoding: String): Boolean = js.native
    def write(msgs: Buffer, encoding: String, cb: js.Function): Boolean = js.native
    def write(msgs: Buffer, encoding: Unit, cb: js.Function): Boolean = js.native
    def write(msg: Buffer): Boolean = js.native
    def write(msg: Buffer, cb: js.Function): Boolean = js.native
  }
}
