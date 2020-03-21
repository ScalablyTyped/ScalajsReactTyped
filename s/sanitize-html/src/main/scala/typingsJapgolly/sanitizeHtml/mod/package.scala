package typingsJapgolly.sanitizeHtml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AllowedAttribute = java.lang.String | typingsJapgolly.sanitizeHtml.AnonMultiple
  type Attributes = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type Transformer = js.Function2[
    /* tagName */ java.lang.String, 
    /* attribs */ typingsJapgolly.sanitizeHtml.mod.Attributes, 
    typingsJapgolly.sanitizeHtml.mod.Tag
  ]
}
