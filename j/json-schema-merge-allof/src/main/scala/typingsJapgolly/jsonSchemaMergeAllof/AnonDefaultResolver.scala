package typingsJapgolly.jsonSchemaMergeAllof

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jsonSchemaMergeAllof.mod.JSONSchema
import typingsJapgolly.jsonSchemaMergeAllof.mod.MergeSchemas
import typingsJapgolly.jsonSchemaMergeAllof.mod.Options_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefaultResolver[Schema /* <: JSONSchema */] extends js.Object {
  /**
    * ### Default resolver
    * You can set a default resolver that catches any unknown keyword.
    * Let's say you want to use the same strategy as the ones for the
    * meta keywords, to use the first value found. You can accomplish
    * that like this:
    *
    * ```js
    * mergeJsonSchema({
    *   ...
    * }, {
    *   resolvers: {
    *       defaultResolver: mergeJsonSchema.options.resolvers.title
    *   }
    * })
    * ```
    */
  var defaultResolver: js.UndefOr[
    js.Function4[
      /* values */ js.Array[_], 
      /* path */ js.Array[String], 
      /* mergeSchemas */ MergeSchemas, 
      /* options */ Options_[Schema], 
      _
    ]
  ] = js.undefined
}

object AnonDefaultResolver {
  @scala.inline
  def apply[Schema /* <: JSONSchema */](
    defaultResolver: (/* values */ js.Array[js.Any], /* path */ js.Array[String], /* mergeSchemas */ MergeSchemas, /* options */ Options_[Schema]) => CallbackTo[js.Any] = null
  ): AnonDefaultResolver[Schema] = {
    val __obj = js.Dynamic.literal()
    if (defaultResolver != null) __obj.updateDynamic("defaultResolver")(js.Any.fromFunction4((t0: /* values */ js.Array[js.Any], t1: /* path */ js.Array[java.lang.String], t2: /* mergeSchemas */ typingsJapgolly.jsonSchemaMergeAllof.mod.MergeSchemas, t3: /* options */ typingsJapgolly.jsonSchemaMergeAllof.mod.Options_[Schema]) => defaultResolver(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[AnonDefaultResolver[Schema]]
  }
}

