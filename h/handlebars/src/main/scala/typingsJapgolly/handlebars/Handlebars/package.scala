package typingsJapgolly.handlebars

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Handlebars {
  type HelperDeclareSpec = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.handlebars.Handlebars.HelperDelegate]
  type HelperDelegate = js.Function7[
    /* context */ js.UndefOr[js.Any], 
    /* arg1 */ js.UndefOr[js.Any], 
    /* arg2 */ js.UndefOr[js.Any], 
    /* arg3 */ js.UndefOr[js.Any], 
    /* arg4 */ js.UndefOr[js.Any], 
    /* arg5 */ js.UndefOr[js.Any], 
    /* options */ js.UndefOr[typingsJapgolly.handlebars.Handlebars.HelperOptions], 
    js.Any
  ]
  type TemplateDelegate[T] = js.Function2[
    /* context */ T, 
    /* options */ js.UndefOr[typingsJapgolly.handlebars.Handlebars.RuntimeOptions], 
    java.lang.String
  ]
  type Template_[T] = typingsJapgolly.handlebars.Handlebars.TemplateDelegate[T] | java.lang.String
}
