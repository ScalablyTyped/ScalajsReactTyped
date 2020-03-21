package typingsJapgolly.blueprintjsSelect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object itemRendererMod {
  type ItemRenderer[T] = js.Function2[
    /* item */ T, 
    /* itemProps */ typingsJapgolly.blueprintjsSelect.itemRendererMod.IItemRendererProps, 
    japgolly.scalajs.react.raw.React.Element | scala.Null
  ]
}
