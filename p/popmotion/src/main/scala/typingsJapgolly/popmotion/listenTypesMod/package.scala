package typingsJapgolly.popmotion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object listenTypesMod {
  type EventListener = js.Function3[
    /* type */ java.lang.String, 
    /* listener */ js.Function, 
    /* options */ js.UndefOr[typingsJapgolly.popmotion.listenTypesMod.EventListenerOptions | scala.Boolean], 
    scala.Unit
  ]
  type ListenFactory = js.Function3[
    /* element */ org.scalajs.dom.raw.Element | typingsJapgolly.std.Document_ | typingsJapgolly.std.Window_, 
    /* events */ java.lang.String, 
    /* options */ js.UndefOr[typingsJapgolly.popmotion.listenTypesMod.EventListenerOptions | scala.Boolean], 
    typingsJapgolly.popmotion.actionMod.Action
  ]
}
