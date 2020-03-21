package typingsJapgolly.htmlWebpackTemplate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Attributes = org.scalablytyped.runtime.StringDictionary[js.Any]
  /** @deprecated use Options */
  type Config = typingsJapgolly.htmlWebpackTemplate.mod.Options
  /** @deprecated use GoogleAnalyticsOptions */
  type GoogleAnalyticsConfig = typingsJapgolly.htmlWebpackTemplate.mod.GoogleAnalyticsOptions
  /**
  	 * string: value is assigned to the href attribute and the rel attribute is set to "stylesheet"
  	 * object: properties and values are used as the attribute names and values, respectively.
  	 */
  type Link = typingsJapgolly.htmlWebpackTemplate.mod.Resource
  type Resource = java.lang.String | typingsJapgolly.htmlWebpackTemplate.mod.Attributes
  /**
  	 * string: value is assigned to the src attribute and the type attribute is set to "text/javascript".
  	 * object: properties and values are used as the attribute names and values, respectively.
  	 */
  type Script = typingsJapgolly.htmlWebpackTemplate.mod.Resource
}
