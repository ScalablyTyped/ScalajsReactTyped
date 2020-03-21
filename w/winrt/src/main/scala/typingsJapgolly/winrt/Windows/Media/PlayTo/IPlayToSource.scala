package typingsJapgolly.winrt.Windows.Media.PlayTo

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPlayToSource extends js.Object {
  var connection: PlayToConnection
  var next: PlayToSource
  def playNext(): Unit
}

object IPlayToSource {
  @scala.inline
  def apply(connection: PlayToConnection, next: PlayToSource, playNext: Callback): IPlayToSource = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any])
    __obj.updateDynamic("playNext")(playNext.toJsFn)
    __obj.asInstanceOf[IPlayToSource]
  }
}

