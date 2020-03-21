package typingsJapgolly.webprogbaseConsoleView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BasicObject[T] = org.scalablytyped.runtime.StringDictionary[T]
  type FormFields = typingsJapgolly.webprogbaseConsoleView.mod.BasicObject[
    java.lang.String | typingsJapgolly.webprogbaseConsoleView.mod.FormFieldDescriptor
  ]
  type ServerAppHandler = js.Function2[
    /* req */ typingsJapgolly.webprogbaseConsoleView.mod.Request, 
    /* res */ typingsJapgolly.webprogbaseConsoleView.mod.Response, 
    scala.Unit
  ]
  type StateLinks = typingsJapgolly.webprogbaseConsoleView.mod.BasicObject[
    java.lang.String | typingsJapgolly.webprogbaseConsoleView.mod.StateLinkDescriptor
  ]
}
