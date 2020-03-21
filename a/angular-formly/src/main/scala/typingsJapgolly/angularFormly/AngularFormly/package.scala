package typingsJapgolly.angularFormly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object AngularFormly {
  /**
  	 * see http://docs.angular-formly.com/docs/formly-expressions#expressionproperties-validators--messages
  	 */
  type IExpressionFunction = js.Function3[
    /* $viewValue */ js.Any, 
    /* $modelValue */ js.Any, 
    /* scope */ typingsJapgolly.angularFormly.AngularFormly.ITemplateScope, 
    js.Any
  ]
  type IFieldArray = js.Array[
    typingsJapgolly.angularFormly.AngularFormly.IFieldConfigurationObject | typingsJapgolly.angularFormly.AngularFormly.IFieldGroup
  ]
  type ITemplateManipulator = js.Function3[
    /* template */ java.lang.String | org.scalajs.dom.raw.HTMLElement, 
    /* options */ js.Object, 
    /* scope */ typingsJapgolly.angularFormly.AngularFormly.ITemplateScope, 
    java.lang.String | org.scalajs.dom.raw.HTMLElement
  ]
}
