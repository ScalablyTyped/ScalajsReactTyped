package typingsJapgolly.titanium.Titanium.UI

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.titanium.Attribute
import typingsJapgolly.titanium.Titanium.Proxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * An attributed string proxy manages character strings and associated sets of attributes (for example,
		 * font and foregroundcolor) that apply to individual characters or ranges of characters in the string.
		 */
trait AttributedString extends Proxy {
  /**
  			 * An array of attributes to add.
  			 */
  var attributes: js.Array[Attribute]
  /**
  			 * The text applied to the attributed string.
  			 */
  var text: String
  /**
  			 * Adds an [attribute](Attribute) with the given name and value to the characters in the specified range.
  			 */
  def addAttribute(attribute: Attribute): Unit
  /**
  			 * Gets the value of the <Titanium.UI.AttributedString.attributes> property.
  			 */
  def getAttributes(): js.Array[Attribute]
  /**
  			 * Gets the value of the <Titanium.UI.AttributedString.text> property.
  			 */
  def getText(): String
  /**
  			 * Sets the value of the <Titanium.UI.AttributedString.attributes> property.
  			 */
  def setAttributes(attributes: js.Array[Attribute]): Unit
  /**
  			 * Sets the value of the <Titanium.UI.AttributedString.text> property.
  			 */
  def setText(text: String): Unit
}

object AttributedString {
  @scala.inline
  def apply(
    addAttribute: Attribute => Callback,
    addEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    apiName: String,
    applyProperties: js.Any => Callback,
    attributes: js.Array[Attribute],
    bubbleParent: Boolean,
    fireEvent: (String, js.Any) => Callback,
    getApiName: CallbackTo[String],
    getAttributes: CallbackTo[js.Array[Attribute]],
    getBubbleParent: CallbackTo[Boolean],
    getText: CallbackTo[String],
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    setAttributes: js.Array[Attribute] => Callback,
    setBubbleParent: Boolean => Callback,
    setText: String => Callback,
    text: String,
    getLifecycleContainer: js.UndefOr[CallbackTo[Window | TabGroup]] = js.undefined,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): AttributedString = {
    val __obj = js.Dynamic.literal(apiName = apiName.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], bubbleParent = bubbleParent.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("addAttribute")(js.Any.fromFunction1((t0: typingsJapgolly.titanium.Attribute) => addAttribute(t0).runNow()))
    __obj.updateDynamic("addEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => addEventListener(t0, t1).runNow()))
    __obj.updateDynamic("applyProperties")(js.Any.fromFunction1((t0: js.Any) => applyProperties(t0).runNow()))
    __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => fireEvent(t0, t1).runNow()))
    __obj.updateDynamic("getApiName")(getApiName.toJsFn)
    __obj.updateDynamic("getAttributes")(getAttributes.toJsFn)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent.toJsFn)
    __obj.updateDynamic("getText")(getText.toJsFn)
    __obj.updateDynamic("removeEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => removeEventListener(t0, t1).runNow()))
    __obj.updateDynamic("setAttributes")(js.Any.fromFunction1((t0: js.Array[typingsJapgolly.titanium.Attribute]) => setAttributes(t0).runNow()))
    __obj.updateDynamic("setBubbleParent")(js.Any.fromFunction1((t0: scala.Boolean) => setBubbleParent(t0).runNow()))
    __obj.updateDynamic("setText")(js.Any.fromFunction1((t0: java.lang.String) => setText(t0).runNow()))
    getLifecycleContainer.foreach(p => __obj.updateDynamic("getLifecycleContainer")(p.toJsFn))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributedString]
  }
}

