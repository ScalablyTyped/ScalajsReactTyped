package typingsJapgolly.vegaTypings.rendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.vegaTypings.vegaTypingsStrings.canvas
  - typingsJapgolly.vegaTypings.vegaTypingsStrings.svg
  - typingsJapgolly.vegaTypings.vegaTypingsStrings.none
*/
trait Renderers extends js.Object

object Renderers {
  @scala.inline
  def canvas: typingsJapgolly.vegaTypings.vegaTypingsStrings.canvas = this.cast("canvas")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def none: typingsJapgolly.vegaTypings.vegaTypingsStrings.none = this.cast("none")
  @scala.inline
  def svg: typingsJapgolly.vegaTypings.vegaTypingsStrings.svg = this.cast("svg")
}

