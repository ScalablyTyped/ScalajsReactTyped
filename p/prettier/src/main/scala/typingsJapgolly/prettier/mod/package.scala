package typingsJapgolly.prettier.mod

import typingsJapgolly.prettier.anon._empty
import typingsJapgolly.prettier.mod.^
import typingsJapgolly.prettier.mod.doc.builders.Doc
import typingsJapgolly.std.Pick
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def check(source: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("check")(source.asInstanceOf[js.Any]).asInstanceOf[Boolean]
inline def check(source: String, options: Options): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def clearConfigCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearConfigCache")().asInstanceOf[Unit]

inline def format(source: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(source.asInstanceOf[js.Any]).asInstanceOf[String]
inline def format(source: String, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]

inline def formatWithCursor(source: String, options: CursorOptions): CursorResult = (^.asInstanceOf[js.Dynamic].applyDynamic("formatWithCursor")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CursorResult]

inline def getSupportInfo(): SupportInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("getSupportInfo")().asInstanceOf[SupportInfo]

inline def version: String = ^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[String]

type AST = Any

// A union of the properties of the given object that are arrays.
type ArrayProperties[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: std.NonNullable<T[K]> extends std.Array<any>? K : never}[keyof T] */ js.Any

type BuiltInParser = js.Function2[/* text */ String, /* options */ js.UndefOr[Any], AST]

type CallCallback[T, U] = js.Function3[/* path */ AstPath[T], /* index */ Double, /* value */ Any, U]

type CustomParser = js.Function3[/* text */ String, /* parsers */ BuiltInParsers, /* options */ Options, AST]

type Doc_ = Doc

type EachCallback[T] = js.Function3[/* path */ AstPath[ArrayElement[T]], /* index */ Double, /* value */ Any, Unit]

type FastPath[T] = AstPath[T]

type LiteralUnion[T /* <: U */, U] = T | ((Pick[U, scala.Nothing]) & _empty)

type MapCallback[T, U] = js.Function3[/* path */ AstPath[ArrayElement[T]], /* index */ Double, /* value */ Any, U]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.prettier.mod.IntSupportOption
  - typingsJapgolly.prettier.mod.IntArraySupportOption
  - typingsJapgolly.prettier.mod.BooleanSupportOption
  - typingsJapgolly.prettier.mod.BooleanArraySupportOption
  - typingsJapgolly.prettier.mod.ChoiceSupportOption[scala.Any]
  - typingsJapgolly.prettier.mod.PathSupportOption
  - typingsJapgolly.prettier.mod.PathArraySupportOption
*/
type SupportOption = _SupportOption | ChoiceSupportOption[Any]

type SupportOptions = Record[String, SupportOption]
