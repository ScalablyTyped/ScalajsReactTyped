package typingsJapgolly.jsnox.mod

import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.react.mod.ComponentClass
import typingsJapgolly.react.mod.ComponentState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  * JSnoX requires an object with a createElement method.
  * This will normally be the React object but could be something else
  */
@js.native
trait ReactLikeObject extends js.Object {
  def createElement[P](`type`: String, props: P, children: Node): Element = js.native
  def createElement[P](`type`: ComponentClass[P, ComponentState], props: P, children: Node): Element = js.native
}

