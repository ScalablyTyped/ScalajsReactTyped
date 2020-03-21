package typingsJapgolly.select2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type JQueryAjaxSettingsBase = typingsJapgolly.std.Pick[
    typingsJapgolly.jquery.JQueryAjaxSettings, 
    typingsJapgolly.select2.mod.Sub[java.lang.String, typingsJapgolly.select2.select2Strings.url]
  ]
  type JQueryEventHandlerBase[TContext, T] = js.ThisFunction2[
    /* this */ TContext, 
    /* t */ T, 
    /* repeated */ js.Any, 
    scala.Unit | typingsJapgolly.select2.select2Booleans.`false`
  ]
  type PlainObject[T] = org.scalablytyped.runtime.StringDictionary[T]
  type Sub[O /* <: java.lang.String */, D /* <: java.lang.String */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in O ]: std.Record<D, never> & std.Record<string, K>[K]}[O] */ js.Any
}
