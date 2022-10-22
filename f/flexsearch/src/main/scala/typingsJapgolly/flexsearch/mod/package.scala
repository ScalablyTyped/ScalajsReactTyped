package typingsJapgolly.flexsearch.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.flexsearch.flexsearchBooleans.`false`
import typingsJapgolly.flexsearch.flexsearchBooleans.`true`
import typingsJapgolly.flexsearch.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def create_false(options: IndexOptions[String, `false`]): Index = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[Index]

inline def registerCharset(name: String, charset: CharsetOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerCharset")(name.asInstanceOf[js.Any], charset.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def registerLanguage(name: String, language: LanguageOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerLanguage")(name.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[Unit]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.flexsearch.flexsearchBooleans.`false`
  - typingsJapgolly.flexsearch.flexsearchStrings.default
  - typingsJapgolly.flexsearch.flexsearchStrings.simple
  - typingsJapgolly.flexsearch.flexsearchStrings.balance
  - typingsJapgolly.flexsearch.flexsearchStrings.advanced
  - typingsJapgolly.flexsearch.flexsearchStrings.extra
  - js.Function1[/ * x * / java.lang.String, js.Array[java.lang.String]]
*/
type Encoders = _Encoders | (js.Function1[/* x */ String, js.Array[String]])

type EnrichStoreOption = `true` | String | js.Array[String]

type ExportHandler[T] = js.Function2[/* id */ String | Double, /* value */ T, Unit]

type FilterArray = js.Array[String]

type FilterFunction = js.Function1[/* x */ String, Boolean]

type Id = Double | String

type IndexSearchResult = js.Array[Id]

type Limit = Double

type Matcher = StringDictionary[String]

type Stemmer = StringDictionary[String]

type StoreOption = Boolean | String | js.Array[String]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.flexsearch.flexsearchStrings.strict
  - typingsJapgolly.flexsearch.flexsearchStrings.forward
  - typingsJapgolly.flexsearch.flexsearchStrings.reverse
  - typingsJapgolly.flexsearch.flexsearchStrings.full
  - js.Function1[/ * x * / java.lang.String, js.Array[java.lang.String]]
*/
type Tokenizer = _Tokenizer | (js.Function1[/* x */ String, js.Array[String]])
