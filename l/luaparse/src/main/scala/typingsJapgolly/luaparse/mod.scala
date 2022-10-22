package typingsJapgolly.luaparse

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.luaparse.anon.PartialOptions
import typingsJapgolly.luaparse.anon.PartialOptionswaittrue
import typingsJapgolly.luaparse.libAstMod.Chunk
import typingsJapgolly.luaparse.libAstMod.Identifier
import typingsJapgolly.luaparse.libAstMod.Node
import typingsJapgolly.luaparse.luaparseBooleans.`false`
import typingsJapgolly.luaparse.luaparseStrings.LuaJIT
import typingsJapgolly.luaparse.luaparseStrings.`5Dot1`
import typingsJapgolly.luaparse.luaparseStrings.`5Dot2`
import typingsJapgolly.luaparse.luaparseStrings.`5Dot3`
import typingsJapgolly.luaparse.luaparseStrings.`pseudo-latin1`
import typingsJapgolly.luaparse.luaparseStrings.`x-user-defined`
import typingsJapgolly.luaparse.luaparseStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("luaparse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(): Parser = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")().asInstanceOf[Parser]
  inline def parse(code: String): Chunk = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(code.asInstanceOf[js.Any]).asInstanceOf[Chunk]
  inline def parse(code: String, options: PartialOptions): Chunk = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(code.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Chunk]
  inline def parse(code: String, options: PartialOptionswaittrue): Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(code.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Parser]
  inline def parse(options: PartialOptions): Parser = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(options.asInstanceOf[js.Any]).asInstanceOf[Parser]
  
  trait Options extends StObject {
    
    /** Store comments as an array in the chunk object. */
    var comments: Boolean
    
    /**
      * Defines the relation between code points ≥ U+0080 appearing in parser input and raw bytes in source code,
      * and how Lua escape sequences in JavaScript strings should be interpreted.
      * See the Encoding modes section https://github.com/fstirlitz/luaparse#encoding-modes for more information.
      */
    var encodingMode: `pseudo-latin1` | `x-user-defined` | none
    
    /**
      * Whether to allow code points ≥ U+0080 in identifiers, like LuaJIT does.
      * See 'Note on character encodings' below if you wish to use this option.
      * Note: setting luaVersion: 'LuaJIT' currently does not enable this option; this may change in the future.
      */
    var extendedIdentifiers: `false`
    
    /** Store location information on each syntax node. */
    var locations: Boolean
    
    /** The version of Lua the parser will target; supported values are '5.1', '5.2', '5.3' and 'LuaJIT'. */
    var luaVersion: `5Dot1` | `5Dot2` | `5Dot3` | LuaJIT
    
    /**
      * A callback which will be invoked when a syntax node has been completed.
      * The node which has been created will be passed as the only parameter.
      */
    def onCreateNode(node: Node): Unit
    
    /** A callback which will be invoked when a new scope is created. */
    def onCreateScope(): Unit
    
    /** A callback which will be invoked when the current scope is destroyed. */
    def onDestroyScope(): Unit
    
    /**
      * A callback which will be invoked when a local variable is declared.
      * The identifier will be passed as the only parameter.
      */
    def onLocalDeclaration(identifier: Identifier): Unit
    
    /** Store the start and end character locations on each syntax node. */
    var ranges: Boolean
    
    /** Track identifier scopes. */
    var scope: Boolean
    
    /** Explicitly tell the parser when the input ends. */
    @JSName("wait")
    var wait_FOptions: Boolean
  }
  object Options {
    
    inline def apply(
      comments: Boolean,
      encodingMode: `pseudo-latin1` | `x-user-defined` | none,
      locations: Boolean,
      luaVersion: `5Dot1` | `5Dot2` | `5Dot3` | LuaJIT,
      onCreateNode: Node => Callback,
      onCreateScope: Callback,
      onDestroyScope: Callback,
      onLocalDeclaration: Identifier => Callback,
      ranges: Boolean,
      scope: Boolean,
      wait_ : Boolean
    ): Options = {
      val __obj = js.Dynamic.literal(comments = comments.asInstanceOf[js.Any], encodingMode = encodingMode.asInstanceOf[js.Any], extendedIdentifiers = false, locations = locations.asInstanceOf[js.Any], luaVersion = luaVersion.asInstanceOf[js.Any], onCreateNode = js.Any.fromFunction1((t0: Node) => onCreateNode(t0).runNow()), onCreateScope = onCreateScope.toJsFn, onDestroyScope = onDestroyScope.toJsFn, onLocalDeclaration = js.Any.fromFunction1((t0: Identifier) => onLocalDeclaration(t0).runNow()), ranges = ranges.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
      __obj.updateDynamic("wait")(wait_.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setComments(value: Boolean): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
      
      inline def setEncodingMode(value: `pseudo-latin1` | `x-user-defined` | none): Self = StObject.set(x, "encodingMode", value.asInstanceOf[js.Any])
      
      inline def setExtendedIdentifiers(value: `false`): Self = StObject.set(x, "extendedIdentifiers", value.asInstanceOf[js.Any])
      
      inline def setLocations(value: Boolean): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
      
      inline def setLuaVersion(value: `5Dot1` | `5Dot2` | `5Dot3` | LuaJIT): Self = StObject.set(x, "luaVersion", value.asInstanceOf[js.Any])
      
      inline def setOnCreateNode(value: Node => Callback): Self = StObject.set(x, "onCreateNode", js.Any.fromFunction1((t0: Node) => value(t0).runNow()))
      
      inline def setOnCreateScope(value: Callback): Self = StObject.set(x, "onCreateScope", value.toJsFn)
      
      inline def setOnDestroyScope(value: Callback): Self = StObject.set(x, "onDestroyScope", value.toJsFn)
      
      inline def setOnLocalDeclaration(value: Identifier => Callback): Self = StObject.set(x, "onLocalDeclaration", js.Any.fromFunction1((t0: Identifier) => value(t0).runNow()))
      
      inline def setRanges(value: Boolean): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
      
      inline def setScope(value: Boolean): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setWait_(value: Boolean): Self = StObject.set(x, "wait", value.asInstanceOf[js.Any])
    }
  }
  
  trait Parser extends StObject {
    
    def end(segment: String): Chunk
    
    def lex(): Token
    
    def write(segment: String): Unit
  }
  object Parser {
    
    inline def apply(end: String => Chunk, lex: CallbackTo[Token], write: String => Callback): Parser = {
      val __obj = js.Dynamic.literal(end = js.Any.fromFunction1(end), lex = lex.toJsFn, write = js.Any.fromFunction1((t0: String) => write(t0).runNow()))
      __obj.asInstanceOf[Parser]
    }
    
    extension [Self <: Parser](x: Self) {
      
      inline def setEnd(value: String => Chunk): Self = StObject.set(x, "end", js.Any.fromFunction1(value))
      
      inline def setLex(value: CallbackTo[Token]): Self = StObject.set(x, "lex", value.toJsFn)
      
      inline def setWrite(value: String => Callback): Self = StObject.set(x, "write", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    }
  }
  
  trait Token extends StObject {
    
    var line: Double
    
    var lineStart: Double
    
    var range: js.Tuple2[Double, Double]
    
    var `type`: Double
    
    var value: String
  }
  object Token {
    
    inline def apply(line: Double, lineStart: Double, range: js.Tuple2[Double, Double], `type`: Double, value: String): Token = {
      val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any], lineStart = lineStart.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Token]
    }
    
    extension [Self <: Token](x: Self) {
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setLineStart(value: Double): Self = StObject.set(x, "lineStart", value.asInstanceOf[js.Any])
      
      inline def setRange(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
