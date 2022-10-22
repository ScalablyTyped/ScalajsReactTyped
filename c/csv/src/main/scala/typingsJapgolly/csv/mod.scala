package typingsJapgolly.csv

import typingsJapgolly.csvGenerate.mod.Callback
import typingsJapgolly.csvGenerate.mod.Generator
import typingsJapgolly.csvGenerate.mod.Options
import typingsJapgolly.csvParse.mod.CsvErrorCode
import typingsJapgolly.csvParse.mod.Parser
import typingsJapgolly.csvStringify.mod.Input
import typingsJapgolly.csvStringify.mod.Stringifier
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("csv", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generate(): Generator = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")().asInstanceOf[Generator]
  inline def generate(callback: Callback): Generator = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(callback.asInstanceOf[js.Any]).asInstanceOf[Generator]
  inline def generate(options: Unit, callback: Callback): Generator = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Generator]
  inline def generate(options: Options): Generator = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(options.asInstanceOf[js.Any]).asInstanceOf[Generator]
  inline def generate(options: Options, callback: Callback): Generator = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Generator]
  
  object generator {
    
    @JSImport("csv", "generator")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("csv", "generator.Generator")
    @js.native
    open class Generator ()
      extends typingsJapgolly.csvGenerate.mod.Generator {
      def this(options: Options) = this()
    }
    
    inline def generate(): typingsJapgolly.csvGenerate.mod.Generator = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")().asInstanceOf[typingsJapgolly.csvGenerate.mod.Generator]
    inline def generate(callback: Callback): typingsJapgolly.csvGenerate.mod.Generator = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(callback.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.csvGenerate.mod.Generator]
    inline def generate(options: Unit, callback: Callback): typingsJapgolly.csvGenerate.mod.Generator = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.csvGenerate.mod.Generator]
    inline def generate(options: Options): typingsJapgolly.csvGenerate.mod.Generator = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(options.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.csvGenerate.mod.Generator]
    inline def generate(options: Options, callback: Callback): typingsJapgolly.csvGenerate.mod.Generator = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.csvGenerate.mod.Generator]
  }
  
  inline def parse(): Parser = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")().asInstanceOf[Parser]
  inline def parse(callback: typingsJapgolly.csvParse.mod.Callback): Parser = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(callback.asInstanceOf[js.Any]).asInstanceOf[Parser]
  inline def parse(input: String): Parser = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[Parser]
  inline def parse(input: String, callback: typingsJapgolly.csvParse.mod.Callback): Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Parser]
  inline def parse(input: String, options: Unit, callback: typingsJapgolly.csvParse.mod.Callback): Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Parser]
  inline def parse(input: String, options: typingsJapgolly.csvParse.mod.Options): Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Parser]
  inline def parse(
    input: String,
    options: typingsJapgolly.csvParse.mod.Options,
    callback: typingsJapgolly.csvParse.mod.Callback
  ): Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Parser]
  inline def parse(input: Buffer): Parser = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[Parser]
  inline def parse(input: Buffer, callback: typingsJapgolly.csvParse.mod.Callback): Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Parser]
  inline def parse(input: Buffer, options: Unit, callback: typingsJapgolly.csvParse.mod.Callback): Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Parser]
  inline def parse(input: Buffer, options: typingsJapgolly.csvParse.mod.Options): Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Parser]
  inline def parse(
    input: Buffer,
    options: typingsJapgolly.csvParse.mod.Options,
    callback: typingsJapgolly.csvParse.mod.Callback
  ): Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Parser]
  inline def parse(options: Unit, callback: typingsJapgolly.csvParse.mod.Callback): Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Parser]
  inline def parse(options: typingsJapgolly.csvParse.mod.Options): Parser = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(options.asInstanceOf[js.Any]).asInstanceOf[Parser]
  inline def parse(options: typingsJapgolly.csvParse.mod.Options, callback: typingsJapgolly.csvParse.mod.Callback): Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Parser]
  
  object parser {
    
    @JSImport("csv", "parser")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("csv", "parser.CsvError")
    @js.native
    open class CsvError protected ()
      extends typingsJapgolly.csvParse.mod.CsvError {
      def this(code: CsvErrorCode, message: String, options: Unit, contexts: Any*) = this()
      def this(code: CsvErrorCode, message: String, options: typingsJapgolly.csvParse.mod.Options, contexts: Any*) = this()
      def this(code: CsvErrorCode, message: js.Array[String], options: Unit, contexts: Any*) = this()
      def this(
        code: CsvErrorCode,
        message: js.Array[String],
        options: typingsJapgolly.csvParse.mod.Options,
        contexts: Any*
      ) = this()
    }
    
    @JSImport("csv", "parser.Parser")
    @js.native
    open class Parser protected ()
      extends typingsJapgolly.csvParse.mod.Parser {
      def this(options: typingsJapgolly.csvParse.mod.Options) = this()
    }
    
    inline def parse(): typingsJapgolly.csvParse.mod.Parser = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")().asInstanceOf[typingsJapgolly.csvParse.mod.Parser]
    inline def parse(callback: typingsJapgolly.csvParse.mod.Callback): typingsJapgolly.csvParse.mod.Parser = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(callback.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.csvParse.mod.Parser]
    inline def parse(input: String): typingsJapgolly.csvParse.mod.Parser = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.csvParse.mod.Parser]
    inline def parse(input: String, callback: typingsJapgolly.csvParse.mod.Callback): typingsJapgolly.csvParse.mod.Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.csvParse.mod.Parser]
    inline def parse(input: String, options: Unit, callback: typingsJapgolly.csvParse.mod.Callback): typingsJapgolly.csvParse.mod.Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.csvParse.mod.Parser]
    inline def parse(input: String, options: typingsJapgolly.csvParse.mod.Options): typingsJapgolly.csvParse.mod.Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.csvParse.mod.Parser]
    inline def parse(
      input: String,
      options: typingsJapgolly.csvParse.mod.Options,
      callback: typingsJapgolly.csvParse.mod.Callback
    ): typingsJapgolly.csvParse.mod.Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.csvParse.mod.Parser]
    inline def parse(input: Buffer): typingsJapgolly.csvParse.mod.Parser = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.csvParse.mod.Parser]
    inline def parse(input: Buffer, callback: typingsJapgolly.csvParse.mod.Callback): typingsJapgolly.csvParse.mod.Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.csvParse.mod.Parser]
    inline def parse(input: Buffer, options: Unit, callback: typingsJapgolly.csvParse.mod.Callback): typingsJapgolly.csvParse.mod.Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.csvParse.mod.Parser]
    inline def parse(input: Buffer, options: typingsJapgolly.csvParse.mod.Options): typingsJapgolly.csvParse.mod.Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.csvParse.mod.Parser]
    inline def parse(
      input: Buffer,
      options: typingsJapgolly.csvParse.mod.Options,
      callback: typingsJapgolly.csvParse.mod.Callback
    ): typingsJapgolly.csvParse.mod.Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.csvParse.mod.Parser]
    inline def parse(options: Unit, callback: typingsJapgolly.csvParse.mod.Callback): typingsJapgolly.csvParse.mod.Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.csvParse.mod.Parser]
    inline def parse(options: typingsJapgolly.csvParse.mod.Options): typingsJapgolly.csvParse.mod.Parser = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(options.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.csvParse.mod.Parser]
    inline def parse(options: typingsJapgolly.csvParse.mod.Options, callback: typingsJapgolly.csvParse.mod.Callback): typingsJapgolly.csvParse.mod.Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.csvParse.mod.Parser]
  }
  
  object stringifier {
    
    @JSImport("csv", "stringifier")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("csv", "stringifier.Stringifier")
    @js.native
    open class Stringifier protected ()
      extends typingsJapgolly.csvStringify.mod.Stringifier {
      def this(options: typingsJapgolly.csvStringify.mod.Options) = this()
    }
    
    inline def stringify(): typingsJapgolly.csvStringify.mod.Stringifier = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")().asInstanceOf[typingsJapgolly.csvStringify.mod.Stringifier]
    inline def stringify(callback: typingsJapgolly.csvStringify.mod.Callback): typingsJapgolly.csvStringify.mod.Stringifier = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(callback.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.csvStringify.mod.Stringifier]
    inline def stringify(input: Input): typingsJapgolly.csvStringify.mod.Stringifier = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(input.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.csvStringify.mod.Stringifier]
    inline def stringify(input: Input, callback: typingsJapgolly.csvStringify.mod.Callback): typingsJapgolly.csvStringify.mod.Stringifier = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(input.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.csvStringify.mod.Stringifier]
    inline def stringify(input: Input, options: Unit, callback: typingsJapgolly.csvStringify.mod.Callback): typingsJapgolly.csvStringify.mod.Stringifier = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.csvStringify.mod.Stringifier]
    inline def stringify(input: Input, options: typingsJapgolly.csvStringify.mod.Options): typingsJapgolly.csvStringify.mod.Stringifier = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.csvStringify.mod.Stringifier]
    inline def stringify(
      input: Input,
      options: typingsJapgolly.csvStringify.mod.Options,
      callback: typingsJapgolly.csvStringify.mod.Callback
    ): typingsJapgolly.csvStringify.mod.Stringifier = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.csvStringify.mod.Stringifier]
    inline def stringify(options: typingsJapgolly.csvStringify.mod.Options): typingsJapgolly.csvStringify.mod.Stringifier = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(options.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.csvStringify.mod.Stringifier]
    inline def stringify(
      options: typingsJapgolly.csvStringify.mod.Options,
      callback: typingsJapgolly.csvStringify.mod.Callback
    ): typingsJapgolly.csvStringify.mod.Stringifier = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.csvStringify.mod.Stringifier]
  }
  
  inline def stringify(): Stringifier = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")().asInstanceOf[Stringifier]
  inline def stringify(callback: typingsJapgolly.csvStringify.mod.Callback): Stringifier = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(callback.asInstanceOf[js.Any]).asInstanceOf[Stringifier]
  inline def stringify(input: Input): Stringifier = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(input.asInstanceOf[js.Any]).asInstanceOf[Stringifier]
  inline def stringify(input: Input, callback: typingsJapgolly.csvStringify.mod.Callback): Stringifier = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(input.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Stringifier]
  inline def stringify(input: Input, options: Unit, callback: typingsJapgolly.csvStringify.mod.Callback): Stringifier = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Stringifier]
  inline def stringify(input: Input, options: typingsJapgolly.csvStringify.mod.Options): Stringifier = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Stringifier]
  inline def stringify(
    input: Input,
    options: typingsJapgolly.csvStringify.mod.Options,
    callback: typingsJapgolly.csvStringify.mod.Callback
  ): Stringifier = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Stringifier]
  inline def stringify(options: typingsJapgolly.csvStringify.mod.Options): Stringifier = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(options.asInstanceOf[js.Any]).asInstanceOf[Stringifier]
  inline def stringify(
    options: typingsJapgolly.csvStringify.mod.Options,
    callback: typingsJapgolly.csvStringify.mod.Callback
  ): Stringifier = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Stringifier]
}
