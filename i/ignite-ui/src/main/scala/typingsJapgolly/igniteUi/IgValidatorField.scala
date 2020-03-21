package typingsJapgolly.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgValidatorField
  extends /**
	 * Option for IgValidatorField
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Gets the target element (input or control target) to be validated. This field setting is required.
  	 *
  	 *
  	 * Valid values:
  	 * "string" A valid jQuery selector for the element
  	 * "object" A reference to a jQuery object
  	 */
  var selector: js.UndefOr[String | js.Object] = js.undefined
}

object IgValidatorField {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgValidatorField
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    selector: String | js.Object = null
  ): IgValidatorField = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgValidatorField]
  }
}

