package typingsJapgolly.jupyterlabApputils.sanitizerMod.ISanitizer

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to sanitize.
  */
trait IOptions extends js.Object {
  /**
    * The allowed attributes for a given tag.
    */
  var allowedAttributes: js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
  /**
    * The allowed style values for a given tag.
    */
  var allowedStyles: js.UndefOr[StringDictionary[StringDictionary[js.Array[js.RegExp]]]] = js.undefined
  /**
    * The allowed tags.
    */
  var allowedTags: js.UndefOr[js.Array[String]] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    allowedAttributes: StringDictionary[js.Array[String]] = null,
    allowedStyles: StringDictionary[StringDictionary[js.Array[js.RegExp]]] = null,
    allowedTags: js.Array[String] = null
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    if (allowedAttributes != null) __obj.updateDynamic("allowedAttributes")(allowedAttributes.asInstanceOf[js.Any])
    if (allowedStyles != null) __obj.updateDynamic("allowedStyles")(allowedStyles.asInstanceOf[js.Any])
    if (allowedTags != null) __obj.updateDynamic("allowedTags")(allowedTags.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

