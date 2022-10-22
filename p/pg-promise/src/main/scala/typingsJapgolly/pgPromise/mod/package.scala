package typingsJapgolly.pgPromise.mod

import typingsJapgolly.pgMinify.mod.IMinifyOptions
import typingsJapgolly.pgPromise.mod.^
import typingsJapgolly.pgPromise.typescriptPgSubsetMod.IClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


// Default library interface (before initialization)
// API: http://vitaly-t.github.io/pg-promise/module-pg-promise.html
inline def apply[Ext, C /* <: IClient */](): IMain[Ext, C] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[IMain[Ext, C]]
inline def apply[Ext, C /* <: IClient */](options: IInitOptions[Ext, C]): IMain[Ext, C] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[IMain[Ext, C]]

inline def as: IFormatting = ^.asInstanceOf[js.Dynamic].selectDynamic("as").asInstanceOf[IFormatting]

inline def minify(sql: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("minify")(sql.asInstanceOf[js.Any]).asInstanceOf[String]
inline def minify(sql: String, options: IMinifyOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("minify")(sql.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]

inline def utils: IUtils = ^.asInstanceOf[js.Dynamic].selectDynamic("utils").asInstanceOf[IUtils]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.pgPromise.mod.Column[T]
  - typingsJapgolly.pgPromise.mod.ColumnSet[T]
  - js.Array[
java.lang.String | typingsJapgolly.pgPromise.mod.IColumnConfig[T] | typingsJapgolly.pgPromise.mod.Column[T]]
*/
type QueryColumns[T] = _QueryColumns[T] | (js.Array[String | IColumnConfig[T] | Column[T]])

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsJapgolly.pgPromise.mod.QueryFile
  - typingsJapgolly.pgPromise.mod.IPreparedStatement
  - typingsJapgolly.pgPromise.mod.IParameterizedQuery
  - typingsJapgolly.pgPromise.mod.PreparedStatement
  - typingsJapgolly.pgPromise.mod.ParameterizedQuery
  - js.Function1[/ * values * / js.UndefOr[scala.Any], scala.Any]
*/
type QueryParam = _QueryParam | (js.Function1[/* values */ js.UndefOr[Any], Any]) | String

type ValidSchema = String | js.Array[String] | Null | Unit

type XPromise[T] = js.Promise[T]
