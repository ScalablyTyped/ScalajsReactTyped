package typingsJapgolly.reactVirtualKeyboard

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Keyboard = japgolly.scalajs.react.raw.React.Component[typingsJapgolly.reactVirtualKeyboard.mod.KeyboardProps with js.Object, js.Object]
  type kbEvents = js.Function3[
    /* event */ js.UndefOr[java.lang.String | typingsJapgolly.std.Event_], 
    /* keyboard */ js.UndefOr[org.scalajs.dom.raw.Element], 
    /* el */ js.UndefOr[org.scalajs.dom.raw.Element], 
    scala.Unit
  ]
}
