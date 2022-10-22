package typingsJapgolly.csvParse

import typingsJapgolly.csvParse.mod.CsvErrorCode
import typingsJapgolly.csvParse.mod.Options
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmSyncMod {
  
  @JSImport("csv-parse/dist/esm/sync", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("csv-parse/dist/esm/sync", "CsvError")
  @js.native
  open class CsvError protected ()
    extends typingsJapgolly.csvParse.mod.CsvError {
    def this(code: CsvErrorCode, message: String, options: Unit, contexts: Any*) = this()
    def this(code: CsvErrorCode, message: String, options: Options, contexts: Any*) = this()
    def this(code: CsvErrorCode, message: js.Array[String], options: Unit, contexts: Any*) = this()
    def this(code: CsvErrorCode, message: js.Array[String], options: Options, contexts: Any*) = this()
  }
  
  inline def parse(input: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def parse(input: String, options: Options): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def parse(input: Buffer): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def parse(input: Buffer, options: Options): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
}
