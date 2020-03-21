package typingsJapgolly.neffosJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Events = typingsJapgolly.std.Map[java.lang.String, typingsJapgolly.neffosJs.mod.MessageHandlerFunc]
  type Headers = org.scalablytyped.runtime.StringDictionary[js.Any]
  type MessageHandlerFunc = js.Function2[
    /* c */ typingsJapgolly.neffosJs.mod.NSConn, 
    /* msg */ typingsJapgolly.neffosJs.mod.Message, 
    js.Error
  ]
  type Namespaces = typingsJapgolly.std.Map[java.lang.String, typingsJapgolly.neffosJs.mod.Events]
  type WSData = java.lang.String
}
