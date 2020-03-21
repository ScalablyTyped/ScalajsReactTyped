package typingsJapgolly.w3cCssTypedObjectModelLevel1

import org.scalablytyped.runtime.NumberDictionary
import typingsJapgolly.std.DOMMatrix
import typingsJapgolly.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CSSTransformValue")
@js.native
class CSSTransformValue protected ()
  extends CSSStyleValue
     with /* index */ NumberDictionary[CSSTransformComponent] {
  def this(transforms: js.Array[CSSTransformComponent]) = this()
  val is2D: Boolean = js.native
  @JSName(scala.scalajs.js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[CSSTransformComponent]] = js.native
  val length: Double = js.native
  def toMatrix(): DOMMatrix = js.native
}

