package typingsJapgolly.bunyan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type LogLevel = typingsJapgolly.bunyan.mod.LogLevelString | scala.Double
  type Serializer = js.Function1[/* input */ js.Any, js.Any]
  type Serializers = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.bunyan.mod.Serializer]
}
