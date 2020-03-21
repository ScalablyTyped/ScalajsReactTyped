package typingsJapgolly.testingLibraryDom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object eventsMod {
  type FireFunction = js.Function2[
    /* element */ typingsJapgolly.std.Document_ | org.scalajs.dom.raw.Element | typingsJapgolly.std.Window_ | org.scalajs.dom.raw.Node, 
    /* event */ typingsJapgolly.std.Event_, 
    scala.Boolean
  ]
}
