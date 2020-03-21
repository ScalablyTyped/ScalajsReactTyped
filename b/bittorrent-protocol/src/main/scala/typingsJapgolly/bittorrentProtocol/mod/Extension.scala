package typingsJapgolly.bittorrentProtocol.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Extension extends js.Object {
  var name: String
  var onExtendedHandshake: js.UndefOr[js.Function1[/* handshake */ StringDictionary[js.Any], Unit]] = js.undefined
  var onHandshake: js.UndefOr[
    js.Function3[
      /* infoHash */ String, 
      /* peerId */ String, 
      /* extensions */ StringDictionary[Boolean], 
      Unit
    ]
  ] = js.undefined
  var onMessage: js.UndefOr[js.Function1[/* buf */ Buffer, Unit]] = js.undefined
}

object Extension {
  @scala.inline
  def apply(
    name: String,
    onExtendedHandshake: /* handshake */ StringDictionary[js.Any] => Callback = null,
    onHandshake: (/* infoHash */ String, /* peerId */ String, /* extensions */ StringDictionary[Boolean]) => Callback = null,
    onMessage: /* buf */ Buffer => Callback = null
  ): Extension = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (onExtendedHandshake != null) __obj.updateDynamic("onExtendedHandshake")(js.Any.fromFunction1((t0: /* handshake */ org.scalablytyped.runtime.StringDictionary[js.Any]) => onExtendedHandshake(t0).runNow()))
    if (onHandshake != null) __obj.updateDynamic("onHandshake")(js.Any.fromFunction3((t0: /* infoHash */ java.lang.String, t1: /* peerId */ java.lang.String, t2: /* extensions */ org.scalablytyped.runtime.StringDictionary[scala.Boolean]) => onHandshake(t0, t1, t2).runNow()))
    if (onMessage != null) __obj.updateDynamic("onMessage")(js.Any.fromFunction1((t0: /* buf */ typingsJapgolly.node.Buffer) => onMessage(t0).runNow()))
    __obj.asInstanceOf[Extension]
  }
}

