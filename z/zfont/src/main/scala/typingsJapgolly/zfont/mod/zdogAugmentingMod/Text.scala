package typingsJapgolly.zfont.mod.zdogAugmentingMod

import typingsJapgolly.zdog.mod.Shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object used for rendering text.
  * @see {@link https://github.com/jaames/zfont#zdogtext Zfont API}
  */
@JSImport("zdog", "Text")
@js.native
class Text[T /* <: MultilineText */] protected () extends Shape {
  def this(options: TextOptions[T]) = this()
  /** @see {@link TextOptions#font} */
  var font: Font = js.native
  /** @see {@link TextOptions#fontSize} */
  var fontSize: Double = js.native
  /** @see {@link TextOptions#textAlign} */
  var textAlign: TextAlign = js.native
  /** @see {@link TextOptions#textBaseline} */
  var textBaseline: TextBaseline = js.native
  /** @see {@link TextOptions#value} */
  var value: MultilineText = js.native
}

