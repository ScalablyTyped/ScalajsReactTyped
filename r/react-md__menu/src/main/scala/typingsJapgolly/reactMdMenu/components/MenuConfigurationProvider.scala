package typingsJapgolly.reactMdMenu.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactMdMenu.typesMenuConfigurationProviderMod.MenuConfigurationProviderProps
import typingsJapgolly.reactMdMenu.typesTypesMod.RenderMenuAsSheet
import typingsJapgolly.reactMdSheet.typesSheetMod.SheetPosition
import typingsJapgolly.reactMdSheet.typesSheetMod.SheetVerticalSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MenuConfigurationProvider {
  
  @JSImport("@react-md/menu", "MenuConfigurationProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def horizontal(value: Boolean): this.type = set("horizontal", value.asInstanceOf[js.Any])
    
    inline def renderAsSheet(value: RenderMenuAsSheet): this.type = set("renderAsSheet", value.asInstanceOf[js.Any])
    
    inline def sheetFooter(value: VdomNode): this.type = set("sheetFooter", value.rawNode.asInstanceOf[js.Any])
    
    inline def sheetFooterNull: this.type = set("sheetFooter", null)
    
    inline def sheetFooterVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("sheetFooter", js.Array(value*))
    
    inline def sheetFooterVdomElement(value: VdomElement): this.type = set("sheetFooter", value.rawElement.asInstanceOf[js.Any])
    
    inline def sheetHeader(value: VdomNode): this.type = set("sheetHeader", value.rawNode.asInstanceOf[js.Any])
    
    inline def sheetHeaderNull: this.type = set("sheetHeader", null)
    
    inline def sheetHeaderVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("sheetHeader", js.Array(value*))
    
    inline def sheetHeaderVdomElement(value: VdomElement): this.type = set("sheetHeader", value.rawElement.asInstanceOf[js.Any])
    
    inline def sheetPosition(value: SheetPosition): this.type = set("sheetPosition", value.asInstanceOf[js.Any])
    
    inline def sheetVerticalSize(value: SheetVerticalSize): this.type = set("sheetVerticalSize", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: MenuConfigurationProvider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MenuConfigurationProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
