package typingsJapgolly.xmlcreate.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDeclarationOptions extends js.Object {
  /**
    * The XML encoding to be included in the declaration. This value must be a
    * valid encoding. If left undefined, no encoding is included.
    */
  var encoding: js.UndefOr[String] = js.undefined
  /**
    * The XML standalone attribute to be included. This value must be "yes" or
    * "no". If left undefined, no standalone attribute is included.
    */
  var standalone: js.UndefOr[String] = js.undefined
  /**
    * The XML version to be included in the declaration. This value must be a
    * valid XML version number. If left undefined, the default version is
    * "1.0".
    */
  var version: js.UndefOr[String] = js.undefined
}

object IDeclarationOptions {
  @scala.inline
  def apply(encoding: String = null, standalone: String = null, version: String = null): IDeclarationOptions = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (standalone != null) __obj.updateDynamic("standalone")(standalone.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDeclarationOptions]
  }
}

