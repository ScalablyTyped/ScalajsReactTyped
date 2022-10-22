package typingsJapgolly.reactQuery.components

import org.scalajs.dom.HTMLButtonElement
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.ButtonHTMLAttributes
import typingsJapgolly.react.mod.DetailedHTMLProps
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.reactQuery.reactQueryStrings.`bottom-left`
import typingsJapgolly.reactQuery.reactQueryStrings.`bottom-right`
import typingsJapgolly.reactQuery.reactQueryStrings.`top-left`
import typingsJapgolly.reactQuery.reactQueryStrings.`top-right`
import typingsJapgolly.reactQuery.typesDevtoolsDevtoolsMod.DevtoolsOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactQueryDevtools {
  
  @JSImport("react-query/types/devtools", "ReactQueryDevtools")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def closeButtonProps(value: DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement]): this.type = set("closeButtonProps", value.asInstanceOf[js.Any])
    
    inline def containerElement(value: String | Any): this.type = set("containerElement", value.asInstanceOf[js.Any])
    
    inline def initialIsOpen(value: Boolean): this.type = set("initialIsOpen", value.asInstanceOf[js.Any])
    
    inline def panelProps(value: DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]): this.type = set("panelProps", value.asInstanceOf[js.Any])
    
    inline def position(value: `top-left` | `top-right` | `bottom-left` | `bottom-right`): this.type = set("position", value.asInstanceOf[js.Any])
    
    inline def styleNonce(value: String): this.type = set("styleNonce", value.asInstanceOf[js.Any])
    
    inline def toggleButtonProps(value: DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement]): this.type = set("toggleButtonProps", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactQueryDevtools.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DevtoolsOptions): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
