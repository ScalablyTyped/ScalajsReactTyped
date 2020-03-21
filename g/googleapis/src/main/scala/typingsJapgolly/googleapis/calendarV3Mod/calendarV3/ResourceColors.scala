package typingsJapgolly.googleapis.calendarV3Mod.calendarV3

import typingsJapgolly.gaxios.commonMod.GaxiosPromise
import typingsJapgolly.googleapisCommon.apiMod.APIRequestContext
import typingsJapgolly.googleapisCommon.apiMod.BodyResponseCallback
import typingsJapgolly.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/calendar/v3", "calendar_v3.Resource$Colors")
@js.native
class ResourceColors protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * calendar.colors.get
    * @desc Returns the color definitions for calendars and events.
    * @alias calendar.colors.get
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaColors] = js.native
  def get(callback: BodyResponseCallback[SchemaColors]): Unit = js.native
  def get(params: ParamsResourceColorsGet): GaxiosPromise[SchemaColors] = js.native
  def get(params: ParamsResourceColorsGet, callback: BodyResponseCallback[SchemaColors]): Unit = js.native
  def get(
    params: ParamsResourceColorsGet,
    options: BodyResponseCallback[SchemaColors],
    callback: BodyResponseCallback[SchemaColors]
  ): Unit = js.native
  def get(params: ParamsResourceColorsGet, options: MethodOptions): GaxiosPromise[SchemaColors] = js.native
  def get(
    params: ParamsResourceColorsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaColors]
  ): Unit = js.native
}

