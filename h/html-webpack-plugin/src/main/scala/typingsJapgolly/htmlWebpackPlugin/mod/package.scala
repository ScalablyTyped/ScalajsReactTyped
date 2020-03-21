package typingsJapgolly.htmlWebpackPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /** @deprecated use Options */
  type Config = typingsJapgolly.htmlWebpackPlugin.mod.Options
  /** @deprecated use MinifyOptions */
  type MinifyConfig = typingsJapgolly.htmlWebpackPlugin.mod.MinifyOptions
  type MinifyOptions = typingsJapgolly.htmlMinifier.mod.Options
  type TemplateFunction = js.Function1[/* param */ js.Object, java.lang.String]
}
