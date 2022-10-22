package typingsJapgolly.searchIndex.mod

import typingsJapgolly.searchIndex.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def apply(): js.Promise[SearchIndex] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Promise[SearchIndex]]
inline def apply(options: SearchIndexOptions): js.Promise[SearchIndex] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SearchIndex]]

type AlterToken = js.Function1[/* token */ Token, js.Promise[Token]]

type Field = String | js.Array[String]

type SplitTokenizerArgs = js.Tuple3[/* tokens */ js.Array[String], /* field */ String, /* ops */ PutOptions]

type SplitTokenizerStage = js.Function1[/* args */ TokenizerArgs, js.Promise[SplitTokenizerArgs]]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.searchIndex.mod.Field
  - typingsJapgolly.searchIndex.mod.FieldValueObject
  - typingsJapgolly.searchIndex.mod.FieldOnlyObject
  - typingsJapgolly.searchIndex.mod.QueryVerb
*/
type Token = _Token | Field

type Tokenizer = js.Function1[/* args */ TokenizerArgs, js.Promise[js.Array[String]]]

type TokenizerArgs = js.Tuple3[/* tokens */ String, /* field */ String, /* ops */ PutOptions]

type TokenizerStage = js.Function1[/* args */ SplitTokenizerArgs, js.Promise[SplitTokenizerArgs]]
