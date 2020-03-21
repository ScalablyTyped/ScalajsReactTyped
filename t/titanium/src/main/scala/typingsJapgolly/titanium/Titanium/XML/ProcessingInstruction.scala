package typingsJapgolly.titanium.Titanium.XML

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.titanium.Titanium.Proxy
import typingsJapgolly.titanium.Titanium.UI.TabGroup
import typingsJapgolly.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * A way to keep processor-specific information in the text of the document. Implements the [DOM Level 2 API](https://www.w3.org/TR/DOM-Level-2-Core/core.html#ID-1004215813) on Android and iOS.
		 */
trait ProcessingInstruction extends Proxy {
  /**
  			 * Retrieve the content of this processing instruction. This from the first non white space character after the target to the character immediatly preceding the ?>. When setting a processing instruction, a DOMException may be thrown on an invalid instruction.
  			 */
  var data: String
  /**
  			 * Retrieve the target of this processing instruction. XML defines this as being the first token following the markup that begins the processing instruction.
  			 */
  val target: String
  /**
  			 * Gets the value of the <Titanium.XML.ProcessingInstruction.data> property.
  			 */
  def getData(): String
  /**
  			 * Gets the value of the <Titanium.XML.ProcessingInstruction.target> property.
  			 */
  def getTarget(): String
  /**
  			 * Sets the value of the <Titanium.XML.ProcessingInstruction.data> property.
  			 */
  def setData(data: String): Unit
}

object ProcessingInstruction {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    apiName: String,
    applyProperties: js.Any => Callback,
    bubbleParent: Boolean,
    data: String,
    fireEvent: (String, js.Any) => Callback,
    getApiName: CallbackTo[String],
    getBubbleParent: CallbackTo[Boolean],
    getData: CallbackTo[String],
    getTarget: CallbackTo[String],
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    setBubbleParent: Boolean => Callback,
    setData: String => Callback,
    target: String,
    getLifecycleContainer: js.UndefOr[CallbackTo[Window | TabGroup]] = js.undefined,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): ProcessingInstruction = {
    val __obj = js.Dynamic.literal(apiName = apiName.asInstanceOf[js.Any], bubbleParent = bubbleParent.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("addEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => addEventListener(t0, t1).runNow()))
    __obj.updateDynamic("applyProperties")(js.Any.fromFunction1((t0: js.Any) => applyProperties(t0).runNow()))
    __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => fireEvent(t0, t1).runNow()))
    __obj.updateDynamic("getApiName")(getApiName.toJsFn)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent.toJsFn)
    __obj.updateDynamic("getData")(getData.toJsFn)
    __obj.updateDynamic("getTarget")(getTarget.toJsFn)
    __obj.updateDynamic("removeEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => removeEventListener(t0, t1).runNow()))
    __obj.updateDynamic("setBubbleParent")(js.Any.fromFunction1((t0: scala.Boolean) => setBubbleParent(t0).runNow()))
    __obj.updateDynamic("setData")(js.Any.fromFunction1((t0: java.lang.String) => setData(t0).runNow()))
    getLifecycleContainer.foreach(p => __obj.updateDynamic("getLifecycleContainer")(p.toJsFn))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessingInstruction]
  }
}

