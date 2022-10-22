package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesCopyClipboardMod.CopyClipboardChildrenProps
import typingsJapgolly.wixStyleReact.distTypesCopyClipboardMod.CopyClipboardProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CopyClipboard {
  
  inline def apply(children: CopyClipboardChildrenProps => Node, value: String): Builder = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children), value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[CopyClipboardProps]))
  }
  
  @JSImport("wix-style-react", "CopyClipboard")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.CopyClipboard] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def onCopy(value: js.Function): this.type = set("onCopy", value.asInstanceOf[js.Any])
    
    inline def resetTimeout(value: Double): this.type = set("resetTimeout", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CopyClipboardProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
