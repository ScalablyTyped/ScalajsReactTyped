package typingsJapgolly.jupyterlabApplication.shellMod.ILabShell

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The areas of the application shell where widgets can reside.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.jupyterlabApplication.jupyterlabApplicationStrings.main
  - typingsJapgolly.jupyterlabApplication.jupyterlabApplicationStrings.header
  - typingsJapgolly.jupyterlabApplication.jupyterlabApplicationStrings.top
  - typingsJapgolly.jupyterlabApplication.jupyterlabApplicationStrings.left
  - typingsJapgolly.jupyterlabApplication.jupyterlabApplicationStrings.right
  - typingsJapgolly.jupyterlabApplication.jupyterlabApplicationStrings.bottom
*/
trait Area extends js.Object

object Area {
  @scala.inline
  def bottom: typingsJapgolly.jupyterlabApplication.jupyterlabApplicationStrings.bottom = this.cast("bottom")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def header: typingsJapgolly.jupyterlabApplication.jupyterlabApplicationStrings.header = this.cast("header")
  @scala.inline
  def left: typingsJapgolly.jupyterlabApplication.jupyterlabApplicationStrings.left = this.cast("left")
  @scala.inline
  def main: typingsJapgolly.jupyterlabApplication.jupyterlabApplicationStrings.main = this.cast("main")
  @scala.inline
  def right: typingsJapgolly.jupyterlabApplication.jupyterlabApplicationStrings.right = this.cast("right")
  @scala.inline
  def top: typingsJapgolly.jupyterlabApplication.jupyterlabApplicationStrings.top = this.cast("top")
}

