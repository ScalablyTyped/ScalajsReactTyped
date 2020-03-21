package typingsJapgolly.stardustUiReactComponentEventListener

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type EventHandler[T /* <: typingsJapgolly.stardustUiReactComponentEventListener.typesMod.EventTypes */] = js.Function1[
    /* import warning: importer.ImportType#apply Failed type conversion: std.DocumentEventMap[T] */ /* e */ js.Any, 
    scala.Unit
  ]
  type TargetRef = japgolly.scalajs.react.raw.React.RefHandle[org.scalajs.dom.raw.Node | typingsJapgolly.std.Window_]
}
