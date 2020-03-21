package typingsJapgolly.reactMce

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type EventHandler = js.Function2[/* event */ js.Any, /* editor */ typingsJapgolly.tinymce.mod.Editor, scala.Unit]
  type TinyMCE = japgolly.scalajs.react.raw.React.Component[typingsJapgolly.reactMce.mod.ReactMCEProps with js.Object, js.Object]
}
