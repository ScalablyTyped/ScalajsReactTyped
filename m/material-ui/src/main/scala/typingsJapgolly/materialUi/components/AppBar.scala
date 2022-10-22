package typingsJapgolly.materialUi.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.materialUi.MaterialUI.AppBarProps
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AppBar {
  
  @JSImport("material-ui", "AppBar")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.materialUi.mod.AppBar] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def iconClassNameLeft(value: String): this.type = set("iconClassNameLeft", value.asInstanceOf[js.Any])
    
    inline def iconClassNameRight(value: String): this.type = set("iconClassNameRight", value.asInstanceOf[js.Any])
    
    inline def iconElementLeft(value: VdomElement): this.type = set("iconElementLeft", value.rawElement.asInstanceOf[js.Any])
    
    inline def iconElementRight(value: VdomElement): this.type = set("iconElementRight", value.rawElement.asInstanceOf[js.Any])
    
    inline def iconStyleLeft(value: CSSProperties): this.type = set("iconStyleLeft", value.asInstanceOf[js.Any])
    
    inline def iconStyleRight(value: CSSProperties): this.type = set("iconStyleRight", value.asInstanceOf[js.Any])
    
    inline def onLeftIconButtonClick(value: ReactMouseEventFrom[js.Object & Element] => Callback): this.type = set("onLeftIconButtonClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[js.Object & Element]) => value(t0).runNow()))
    
    inline def onRightIconButtonClick(value: ReactMouseEventFrom[js.Object & Element] => Callback): this.type = set("onRightIconButtonClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[js.Object & Element]) => value(t0).runNow()))
    
    inline def onTitleClick(value: ReactMouseEventFrom[js.Object & Element] => Callback): this.type = set("onTitleClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[js.Object & Element]) => value(t0).runNow()))
    
    inline def showMenuIconButton(value: Boolean): this.type = set("showMenuIconButton", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def title(value: VdomNode): this.type = set("title", value.rawNode.asInstanceOf[js.Any])
    
    inline def titleNull: this.type = set("title", null)
    
    inline def titleStyle(value: CSSProperties): this.type = set("titleStyle", value.asInstanceOf[js.Any])
    
    inline def titleVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): this.type = set("title", js.Array(value*))
    
    inline def titleVdomElement(value: VdomElement): this.type = set("title", value.rawElement.asInstanceOf[js.Any])
    
    inline def zDepth(value: Double): this.type = set("zDepth", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: AppBar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: AppBarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
