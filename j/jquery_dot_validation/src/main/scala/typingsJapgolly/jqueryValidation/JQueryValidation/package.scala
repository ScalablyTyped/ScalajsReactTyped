package typingsJapgolly.jqueryValidation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object JQueryValidation {
  type ErrorDictionary = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type RulesDictionary = org.scalablytyped.runtime.StringDictionary[js.Any]
  type ShouldValidatePredicate = scala.Boolean | typingsJapgolly.jqueryValidation.JQueryValidation.ValidatePredicate
  type ValidatePredicate = js.Function2[
    /* element */ org.scalajs.dom.raw.HTMLElement, 
    /* event */ typingsJapgolly.jquery.JQueryEventObject, 
    scala.Unit
  ]
}
