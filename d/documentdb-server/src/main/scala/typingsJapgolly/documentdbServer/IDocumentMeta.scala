package typingsJapgolly.documentdbServer

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDocumentMeta extends Object {
  var _attachments: js.UndefOr[String] = js.undefined
  var _etag: js.UndefOr[String] = js.undefined
  var _rid: js.UndefOr[String] = js.undefined
  var _self: String
  var _ts: String
  var id: String
}

object IDocumentMeta {
  @scala.inline
  def apply(
    _self: String,
    _ts: String,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    id: String,
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    _attachments: String = null,
    _etag: String = null,
    _rid: String = null
  ): IDocumentMeta = {
    val __obj = js.Dynamic.literal(_self = _self.asInstanceOf[js.Any], _ts = _ts.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    if (_attachments != null) __obj.updateDynamic("_attachments")(_attachments.asInstanceOf[js.Any])
    if (_etag != null) __obj.updateDynamic("_etag")(_etag.asInstanceOf[js.Any])
    if (_rid != null) __obj.updateDynamic("_rid")(_rid.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDocumentMeta]
  }
}

