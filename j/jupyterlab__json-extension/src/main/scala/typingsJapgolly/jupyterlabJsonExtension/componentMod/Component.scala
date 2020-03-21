package typingsJapgolly.jupyterlabJsonExtension.componentMod

import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.raw.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/json-extension/lib/component", "Component")
@js.native
class Component ()
  extends typingsJapgolly.react.mod.Component[IProps, IState, js.Any] {
  var timer: Double = js.native
  def handleChange(event: ReactEventFrom[HTMLInputElement]): Unit = js.native
}

