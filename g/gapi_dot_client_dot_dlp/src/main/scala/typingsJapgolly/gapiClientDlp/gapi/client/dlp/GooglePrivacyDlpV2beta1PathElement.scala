package typingsJapgolly.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1PathElement extends js.Object {
  /**
    * The auto-allocated ID of the entity.
    * Never equal to zero. Values less than zero are discouraged and may not
    * be supported in the future.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * The kind of the entity.
    * A kind matching regex `__.&#42;__` is reserved/read-only.
    * A kind must not contain more than 1500 bytes when UTF-8 encoded.
    * Cannot be `""`.
    */
  var kind: js.UndefOr[String] = js.undefined
  /**
    * The name of the entity.
    * A name matching regex `__.&#42;__` is reserved/read-only.
    * A name must not be more than 1500 bytes when UTF-8 encoded.
    * Cannot be `""`.
    */
  var name: js.UndefOr[String] = js.undefined
}

object GooglePrivacyDlpV2beta1PathElement {
  @scala.inline
  def apply(id: String = null, kind: String = null, name: String = null): GooglePrivacyDlpV2beta1PathElement = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1PathElement]
  }
}

