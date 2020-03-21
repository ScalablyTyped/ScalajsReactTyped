package typingsJapgolly.angularFormly.AngularFormly

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * see http://docs.angular-formly.com/docs/formlyvalidationmessages#addtemplateoptionvaluemessage
	 */
trait IValidationMessages extends js.Object {
  var messages: StringDictionary[
    js.Function3[/* $viewValue */ js.Any, /* $modelValue */ js.Any, /* scope */ ITemplateScope, String]
  ]
  def addStringMessage(name: String, string: String): Unit
  def addTemplateOptionValueMessage(name: String, prop: String, prefix: String, suffix: String, alternate: String): Unit
}

object IValidationMessages {
  @scala.inline
  def apply(
    addStringMessage: (String, String) => Callback,
    addTemplateOptionValueMessage: (String, String, String, String, String) => Callback,
    messages: StringDictionary[
      js.Function3[/* $viewValue */ js.Any, /* $modelValue */ js.Any, /* scope */ ITemplateScope, String]
    ]
  ): IValidationMessages = {
    val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any])
    __obj.updateDynamic("addStringMessage")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => addStringMessage(t0, t1).runNow()))
    __obj.updateDynamic("addTemplateOptionValueMessage")(js.Any.fromFunction5((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String, t3: java.lang.String, t4: java.lang.String) => addTemplateOptionValueMessage(t0, t1, t2, t3, t4).runNow()))
    __obj.asInstanceOf[IValidationMessages]
  }
}

