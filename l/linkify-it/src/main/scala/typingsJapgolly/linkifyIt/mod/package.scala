package typingsJapgolly.linkifyIt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Rule = java.lang.String | typingsJapgolly.linkifyIt.mod.FullRule
  type SchemaRules = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.linkifyIt.mod.Rule]
  type Validate = js.Function3[
    /* text */ java.lang.String, 
    /* pos */ scala.Double, 
    /* self */ typingsJapgolly.linkifyIt.mod.LinkifyIt, 
    scala.Double | scala.Boolean
  ]
}
