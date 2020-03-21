package typingsJapgolly.jupyterlabExtensionmanager.widgetMod

import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.jupyterlabExtensionmanager.widgetMod.SearchBar.IProperties
import typingsJapgolly.jupyterlabExtensionmanager.widgetMod.SearchBar.IState
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/extensionmanager/lib/widget", "SearchBar")
@js.native
class SearchBar_ protected ()
  extends Component[IProperties, IState, js.Any] {
  def this(props: IProperties) = this()
  /**
    * Handler for search input changes.
    */
  def handleChange(e: ReactEventFrom[HTMLElement]): Unit = js.native
}

