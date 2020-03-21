package typingsJapgolly.blocks

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelPrototype
  extends /* propertyName */ StringDictionary[String | Boolean | js.Object | Validator] {
  /**
  	 * Extracts the raw(non observable) dataItem object values from the Model
  	 */
  var dataItem: js.UndefOr[js.Function0[js.Object]] = js.undefined
  /**
  	 * Override the init method to perform actions on creation for each Model instance
  	 */
  var init: js.UndefOr[js.Function] = js.undefined
  /**
  	 * Determines whether the instance is new. If true when syncing the item will send for insertion instead of updating it.
  	 * The check is determined by the idAttr value specified in the options. If idAttr is not specified the item will always be considered new.
  	 * 
  	 */
  var isNew: js.UndefOr[js.Function0[Boolean]] = js.undefined
  var options: js.UndefOr[AnonBaseUrl] = js.undefined
  /**
  	 * Applies new properties to the Model by providing an Object
  	 * 
  	 * @param dataItem The object from which the new values will be applied
  	 */
  var reset: js.UndefOr[js.Function1[/* dataItem */ this.type, this.type]] = js.undefined
  /**
  	 * Validates all observable properties that have validation and returns true if all values are valid otherwise returns false
  	 */
  var validate: js.UndefOr[js.Function0[Boolean]] = js.undefined
}

object ModelPrototype {
  @scala.inline
  def apply(
    StringDictionary: /* propertyName */ StringDictionary[String | Boolean | js.Object | Validator] = null,
    dataItem: js.UndefOr[CallbackTo[js.Object]] = js.undefined,
    init: js.Function = null,
    isNew: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    options: AnonBaseUrl = null,
    reset: ModelPrototype => CallbackTo[ModelPrototype] = null,
    validate: js.UndefOr[CallbackTo[Boolean]] = js.undefined
  ): ModelPrototype = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    dataItem.foreach(p => __obj.updateDynamic("dataItem")(p.toJsFn))
    if (init != null) __obj.updateDynamic("init")(init.asInstanceOf[js.Any])
    isNew.foreach(p => __obj.updateDynamic("isNew")(p.toJsFn))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (reset != null) __obj.updateDynamic("reset")(js.Any.fromFunction1((t0: typingsJapgolly.blocks.ModelPrototype) => reset(t0).runNow()))
    validate.foreach(p => __obj.updateDynamic("validate")(p.toJsFn))
    __obj.asInstanceOf[ModelPrototype]
  }
}

