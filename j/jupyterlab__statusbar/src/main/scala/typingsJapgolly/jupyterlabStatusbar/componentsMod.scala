package typingsJapgolly.jupyterlabStatusbar

import japgolly.scalajs.react.raw.React.Element
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLSpanElement
import typingsJapgolly.jupyterlabStatusbar.groupMod.GroupItem.IProps
import typingsJapgolly.jupyterlabStatusbar.hoverMod.Popup.IOptions
import typingsJapgolly.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/statusbar/lib/components", JSImport.Namespace)
@js.native
object componentsMod extends js.Object {
  @js.native
  class Popup protected ()
    extends typingsJapgolly.jupyterlabStatusbar.hoverMod.Popup {
    /**
      * Construct a new Popup.
      */
    def this(options: IOptions) = this()
  }
  
  def showPopup(options: IOptions): typingsJapgolly.jupyterlabStatusbar.hoverMod.Popup = js.native
  @js.native
  object GroupItem extends js.Object {
    def apply(props: IProps with HTMLAttributes[HTMLDivElement]): Element = js.native
  }
  
  @js.native
  object ProgressBar extends js.Object {
    def apply(props: typingsJapgolly.jupyterlabStatusbar.progressBarMod.ProgressBar.IProps): Element = js.native
  }
  
  @js.native
  object TextItem extends js.Object {
    def apply(
      props: typingsJapgolly.jupyterlabStatusbar.textMod.TextItem.IProps with HTMLAttributes[HTMLSpanElement]
    ): Element = js.native
  }
  
}

