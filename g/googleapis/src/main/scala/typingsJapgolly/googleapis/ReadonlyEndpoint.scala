package typingsJapgolly.googleapis

import japgolly.scalajs.react.Callback
import typingsJapgolly.googleapisCommon.apiMod.APIRequestContext
import typingsJapgolly.googleapisCommon.apiMod.GlobalOptions
import typingsJapgolly.googleapisCommon.endpointMod.Target
import typingsJapgolly.googleapisCommon.schemaMod.Schema
import typingsJapgolly.googleapisCommon.schemaMod.SchemaResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<googleapis-common.googleapis-common.Endpoint> */
@js.native
trait ReadonlyEndpoint extends js.Object {
  val _options: GlobalOptions = js.native
  val applyMethodsFromSchema: js.Any = js.native
  val getPathParams: js.Any = js.native
  val google: js.Any = js.native
  val makeMethod: js.Any = js.native
  def applySchema(target: Target, rootSchema: Schema, schema: SchemaResource, context: APIRequestContext): Unit = js.native
}

object ReadonlyEndpoint {
  @scala.inline
  def apply(
    _options: GlobalOptions,
    applyMethodsFromSchema: js.Any,
    applySchema: (Target, Schema, SchemaResource, APIRequestContext) => Callback,
    getPathParams: js.Any,
    google: js.Any,
    makeMethod: js.Any
  ): ReadonlyEndpoint = {
    val __obj = js.Dynamic.literal(_options = _options.asInstanceOf[js.Any], applyMethodsFromSchema = applyMethodsFromSchema.asInstanceOf[js.Any], getPathParams = getPathParams.asInstanceOf[js.Any], google = google.asInstanceOf[js.Any], makeMethod = makeMethod.asInstanceOf[js.Any])
    __obj.updateDynamic("applySchema")(js.Any.fromFunction4((t0: typingsJapgolly.googleapisCommon.endpointMod.Target, t1: typingsJapgolly.googleapisCommon.schemaMod.Schema, t2: typingsJapgolly.googleapisCommon.schemaMod.SchemaResource, t3: typingsJapgolly.googleapisCommon.apiMod.APIRequestContext) => applySchema(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[ReadonlyEndpoint]
  }
}

