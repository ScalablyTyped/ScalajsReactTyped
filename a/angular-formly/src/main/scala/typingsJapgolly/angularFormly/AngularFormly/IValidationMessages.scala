package typingsJapgolly.angularFormly.AngularFormly

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * see http://docs.angular-formly.com/docs/formlyvalidationmessages#addtemplateoptionvaluemessage
  */
trait IValidationMessages extends StObject {
  
  def addStringMessage(name: String, string: String): Unit
  
  def addTemplateOptionValueMessage(name: String, prop: String, prefix: String, suffix: String, alternate: String): Unit
  
  var messages: StringDictionary[
    js.Function3[/* $viewValue */ Any, /* $modelValue */ Any, /* scope */ ITemplateScope, String]
  ]
}
object IValidationMessages {
  
  inline def apply(
    addStringMessage: (String, String) => Callback,
    addTemplateOptionValueMessage: (String, String, String, String, String) => Callback,
    messages: StringDictionary[
      js.Function3[/* $viewValue */ Any, /* $modelValue */ Any, /* scope */ ITemplateScope, String]
    ]
  ): IValidationMessages = {
    val __obj = js.Dynamic.literal(addStringMessage = js.Any.fromFunction2((t0: String, t1: String) => (addStringMessage(t0, t1)).runNow()), addTemplateOptionValueMessage = js.Any.fromFunction5((t0: String, t1: String, t2: String, t3: String, t4: String) => (addTemplateOptionValueMessage(t0, t1, t2, t3, t4)).runNow()), messages = messages.asInstanceOf[js.Any])
    __obj.asInstanceOf[IValidationMessages]
  }
  
  extension [Self <: IValidationMessages](x: Self) {
    
    inline def setAddStringMessage(value: (String, String) => Callback): Self = StObject.set(x, "addStringMessage", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setAddTemplateOptionValueMessage(value: (String, String, String, String, String) => Callback): Self = StObject.set(x, "addTemplateOptionValueMessage", js.Any.fromFunction5((t0: String, t1: String, t2: String, t3: String, t4: String) => (value(t0, t1, t2, t3, t4)).runNow()))
    
    inline def setMessages(
      value: StringDictionary[
          js.Function3[/* $viewValue */ Any, /* $modelValue */ Any, /* scope */ ITemplateScope, String]
        ]
    ): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
  }
}
