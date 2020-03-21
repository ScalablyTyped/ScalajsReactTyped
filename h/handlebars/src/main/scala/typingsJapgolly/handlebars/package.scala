package typingsJapgolly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object handlebars {
  type CompilerInfo = js.Tuple2[scala.Double, java.lang.String]
  type CustomHelperName = java.lang.String
  // NOTE: for backward compatibility of this typing
  type HandlebarsTemplateDelegate[T] = typingsJapgolly.handlebars.Handlebars.TemplateDelegate[T]
  type HandlebarsTemplates = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.handlebars.HandlebarsTemplateDelegate[js.Any]]
  type KnownHelpers = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ name in handlebars.BuiltinHelperName | handlebars.CustomHelperName ]: boolean}
    */ typingsJapgolly.handlebars.handlebarsStrings.KnownHelpers with js.Any
  // for backward compatibility of this typing
  type RuntimeOptions = typingsJapgolly.handlebars.Handlebars.RuntimeOptions
}
