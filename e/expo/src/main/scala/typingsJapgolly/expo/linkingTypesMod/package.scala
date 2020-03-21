package typingsJapgolly.expo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object linkingTypesMod {
  type NativeURLListener = js.Function1[/* nativeEvent */ org.scalajs.dom.raw.MessageEvent, scala.Unit]
  type URLListener = js.Function1[/* event */ typingsJapgolly.expo.linkingTypesMod.EventType, scala.Unit]
}
