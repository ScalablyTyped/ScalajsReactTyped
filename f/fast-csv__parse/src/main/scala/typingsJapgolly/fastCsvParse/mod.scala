package typingsJapgolly.fastCsvParse

import typingsJapgolly.fastCsvParse.buildSrcParserOptionsMod.ParserOptionsArgs
import typingsJapgolly.fastCsvParse.buildSrcTypesMod.Row
import typingsJapgolly.fastCsvParse.buildSrcTypesMod.RowTransformFunction
import typingsJapgolly.fastCsvParse.buildSrcTypesMod.RowValidate
import typingsJapgolly.node.NodeJS.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@fast-csv/parse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@fast-csv/parse", "CsvParserStream")
  @js.native
  open class CsvParserStream[I /* <: Row[Any] */, O /* <: Row[Any] */] protected ()
    extends typingsJapgolly.fastCsvParse.buildSrcCsvParserStreamMod.CsvParserStream[I, O] {
    def this(parserOptions: typingsJapgolly.fastCsvParse.buildSrcParserOptionsMod.ParserOptions) = this()
  }
  /* static members */
  object CsvParserStream {
    
    @JSImport("@fast-csv/parse", "CsvParserStream")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@fast-csv/parse", "CsvParserStream.wrapDoneCallback")
    @js.native
    def wrapDoneCallback: Any = js.native
    inline def wrapDoneCallback_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wrapDoneCallback")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@fast-csv/parse", "ParserOptions")
  @js.native
  open class ParserOptions ()
    extends typingsJapgolly.fastCsvParse.buildSrcParserOptionsMod.ParserOptions {
    def this(opts: ParserOptionsArgs) = this()
  }
  
  inline def isSyncTransform[I /* <: Row[Any] */, O /* <: Row[Any] */](transform: RowTransformFunction[I, O]): /* is @fast-csv/parse.@fast-csv/parse/build/src/types.SyncRowTransform<I, O> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSyncTransform")(transform.asInstanceOf[js.Any]).asInstanceOf[/* is @fast-csv/parse.@fast-csv/parse/build/src/types.SyncRowTransform<I, O> */ Boolean]
  
  inline def isSyncValidate[R /* <: Row[Any] */](validate: RowValidate[R]): /* is @fast-csv/parse.@fast-csv/parse/build/src/types.SyncRowValidate<R> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSyncValidate")(validate.asInstanceOf[js.Any]).asInstanceOf[/* is @fast-csv/parse.@fast-csv/parse/build/src/types.SyncRowValidate<R> */ Boolean]
  
  inline def parse[I /* <: Row[Any] */, O /* <: Row[Any] */](): typingsJapgolly.fastCsvParse.buildSrcCsvParserStreamMod.CsvParserStream[I, O] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")().asInstanceOf[typingsJapgolly.fastCsvParse.buildSrcCsvParserStreamMod.CsvParserStream[I, O]]
  inline def parse[I /* <: Row[Any] */, O /* <: Row[Any] */](args: ParserOptionsArgs): typingsJapgolly.fastCsvParse.buildSrcCsvParserStreamMod.CsvParserStream[I, O] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(args.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.fastCsvParse.buildSrcCsvParserStreamMod.CsvParserStream[I, O]]
  
  inline def parseFile[I /* <: Row[Any] */, O /* <: Row[Any] */](location: String): typingsJapgolly.fastCsvParse.buildSrcCsvParserStreamMod.CsvParserStream[I, O] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseFile")(location.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.fastCsvParse.buildSrcCsvParserStreamMod.CsvParserStream[I, O]]
  inline def parseFile[I /* <: Row[Any] */, O /* <: Row[Any] */](location: String, options: ParserOptionsArgs): typingsJapgolly.fastCsvParse.buildSrcCsvParserStreamMod.CsvParserStream[I, O] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFile")(location.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.fastCsvParse.buildSrcCsvParserStreamMod.CsvParserStream[I, O]]
  
  inline def parseStream[I /* <: Row[Any] */, O /* <: Row[Any] */](stream: ReadableStream): typingsJapgolly.fastCsvParse.buildSrcCsvParserStreamMod.CsvParserStream[I, O] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseStream")(stream.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.fastCsvParse.buildSrcCsvParserStreamMod.CsvParserStream[I, O]]
  inline def parseStream[I /* <: Row[Any] */, O /* <: Row[Any] */](stream: ReadableStream, options: ParserOptionsArgs): typingsJapgolly.fastCsvParse.buildSrcCsvParserStreamMod.CsvParserStream[I, O] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseStream")(stream.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.fastCsvParse.buildSrcCsvParserStreamMod.CsvParserStream[I, O]]
  
  inline def parseString[I /* <: Row[Any] */, O /* <: Row[Any] */](string: String): typingsJapgolly.fastCsvParse.buildSrcCsvParserStreamMod.CsvParserStream[I, O] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseString")(string.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.fastCsvParse.buildSrcCsvParserStreamMod.CsvParserStream[I, O]]
  inline def parseString[I /* <: Row[Any] */, O /* <: Row[Any] */](string: String, options: ParserOptionsArgs): typingsJapgolly.fastCsvParse.buildSrcCsvParserStreamMod.CsvParserStream[I, O] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseString")(string.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.fastCsvParse.buildSrcCsvParserStreamMod.CsvParserStream[I, O]]
}
