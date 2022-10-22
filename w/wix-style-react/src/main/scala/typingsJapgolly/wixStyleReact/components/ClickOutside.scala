package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.std.AddEventListenerOptions
import typingsJapgolly.wixStyleReact.distTypesPopoverPopoverCoreUtilsClickOutsideMod.ClickOutsideProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ClickOutside {
  
  inline def apply(rootRef: RefHandle[HTMLElement]): Builder = {
    val __props = js.Dynamic.literal(rootRef = rootRef.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ClickOutsideProps]))
  }
  
  @JSImport("wix-style-react/dist/types/Popover/PopoverCore/utils/ClickOutside", "ClickOutside")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[
          typingsJapgolly.wixStyleReact.distTypesPopoverPopoverCoreUtilsClickOutsideMod.ClickOutside
        ] {
    
    inline def excludeClass(value: String | js.Array[String]): this.type = set("excludeClass", value.asInstanceOf[js.Any])
    
    inline def excludeClassVarargs(value: String*): this.type = set("excludeClass", js.Array(value*))
    
    inline def onClickOutside(value: js.Function): this.type = set("onClickOutside", value.asInstanceOf[js.Any])
    
    inline def options(value: Boolean | AddEventListenerOptions): this.type = set("options", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ClickOutsideProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
