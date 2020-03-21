package typingsJapgolly.gulpHtmlReplace

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type HtmlReplace = js.Function2[
    /* tasks */ typingsJapgolly.gulpHtmlReplace.mod.Tasks, 
    /* options */ js.UndefOr[typingsJapgolly.gulpHtmlReplace.mod.Options], 
    typingsJapgolly.node.NodeJS.ReadWriteStream
  ]
  type Tasks = org.scalablytyped.runtime.StringDictionary[
    java.lang.String | js.Array[java.lang.String] | typingsJapgolly.gulpHtmlReplace.mod.AdvancedTask
  ]
}
