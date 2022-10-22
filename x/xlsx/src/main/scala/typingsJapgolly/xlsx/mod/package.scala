package typingsJapgolly.xlsx.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.xlsx.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def CFB: Any = ^.asInstanceOf[js.Dynamic].selectDynamic("CFB").asInstanceOf[Any]

inline def SSF: Any = ^.asInstanceOf[js.Dynamic].selectDynamic("SSF").asInstanceOf[Any]

inline def read(data: Any): WorkBook = ^.asInstanceOf[js.Dynamic].applyDynamic("read")(data.asInstanceOf[js.Any]).asInstanceOf[WorkBook]
inline def read(data: Any, opts: ParsingOptions): WorkBook = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[WorkBook]

inline def readFile(filename: String): WorkBook = ^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(filename.asInstanceOf[js.Any]).asInstanceOf[WorkBook]
inline def readFile(filename: String, opts: ParsingOptions): WorkBook = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(filename.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[WorkBook]

inline def setCptable(cptable: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("set_cptable")(cptable.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def setFs(fs: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("set_fs")(fs.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def stream: StreamUtils = ^.asInstanceOf[js.Dynamic].selectDynamic("stream").asInstanceOf[StreamUtils]

inline def utils: XLSXUtils = ^.asInstanceOf[js.Dynamic].selectDynamic("utils").asInstanceOf[XLSXUtils]

inline def version: String = ^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[String]

inline def write(data: WorkBook, opts: WritingOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def writeFile(data: WorkBook, filename: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(data.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[Any]
inline def writeFile(data: WorkBook, filename: String, opts: WritingOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(data.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def writeFileAsync(filename: String, data: WorkBook, opts: CBFunc): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFileAsync")(filename.asInstanceOf[js.Any], data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Any]
inline def writeFileAsync(filename: String, data: WorkBook, opts: CBFunc, cb: CBFunc): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFileAsync")(filename.asInstanceOf[js.Any], data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Any]
inline def writeFileAsync(filename: String, data: WorkBook, opts: WritingOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFileAsync")(filename.asInstanceOf[js.Any], data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Any]
inline def writeFileAsync(filename: String, data: WorkBook, opts: WritingOptions, cb: CBFunc): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFileAsync")(filename.asInstanceOf[js.Any], data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def writeFileXLSX(data: WorkBook, filename: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFileXLSX")(data.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[Any]
inline def writeFileXLSX(data: WorkBook, filename: String, opts: WritingOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFileXLSX")(data.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def writeXLSX(data: WorkBook, opts: WritingOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("writeXLSX")(data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Any]

/** Attempts to write or download workbook data to file asynchronously */
type CBFunc = js.Function0[Unit]

type NumberFormat = String | Double

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsJapgolly.xlsx.mod.Range
  - typingsJapgolly.xlsx.mod.CellAddress
*/
type RangeSpec = _RangeSpec | String

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsJapgolly.xlsx.mod.MarginInfo
  - typingsJapgolly.xlsx.mod.SheetType
*/
type SheetKeys = _SheetKeys | String

type StrictWS = StringDictionary[CellObject]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.xlsx.mod.SheetKeys
  - js.Array[
typingsJapgolly.xlsx.mod.ColInfo | typingsJapgolly.xlsx.mod.Range | typingsJapgolly.xlsx.mod.RowInfo]
  - typingsJapgolly.xlsx.mod.ProtectInfo
  - typingsJapgolly.xlsx.mod.AutoFilterInfo
*/
type WSKeys = _WSKeys | (js.Array[ColInfo | Range | RowInfo]) | String

type WSSpec = String | Double | WorkSheet
