package typingsJapgolly.reactLeaflet.mod

import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactLeaflet.anon.ClassName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-leaflet", "Pane")
@js.native
open class Pane[P /* <: PaneProps */, S /* <: PaneState */] protected () extends Component[P, S, Any] {
  def this(props: P) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: P, context: Any) = this()
  
  def createPane(props: P): Unit = js.native
  
  def getPane(): js.UndefOr[HTMLElement | Null] = js.native
  def getPane(name: String): js.UndefOr[HTMLElement | Null] = js.native
  
  def getParentPane(): js.UndefOr[HTMLElement | Null] = js.native
  
  def removePane(): Unit = js.native
  
  def setStyle(arg: ClassName): Unit = js.native
}
