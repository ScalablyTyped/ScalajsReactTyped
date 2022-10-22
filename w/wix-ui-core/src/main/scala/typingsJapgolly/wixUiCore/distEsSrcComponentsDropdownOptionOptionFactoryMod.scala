package typingsJapgolly.wixUiCore

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.wixUiCore.anon.PartialDividerArgs
import typingsJapgolly.wixUiCore.anon.PartialOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsDropdownOptionOptionFactoryMod {
  
  object OptionFactory {
    
    @JSImport("wix-ui-core/dist/es/src/components/dropdown-option/OptionFactory", "OptionFactory")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(): Option = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Option]
    inline def create(option: PartialOption): Option = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(option.asInstanceOf[js.Any]).asInstanceOf[Option]
    
    inline def createDivider(): Option = ^.asInstanceOf[js.Dynamic].applyDynamic("createDivider")().asInstanceOf[Option]
    inline def createDivider(hasClassNameValue: PartialDividerArgs): Option = ^.asInstanceOf[js.Dynamic].applyDynamic("createDivider")(hasClassNameValue.asInstanceOf[js.Any]).asInstanceOf[Option]
    
    inline def createHighlighted(option: Option, highlightValue: String): Option = (^.asInstanceOf[js.Dynamic].applyDynamic("createHighlighted")(option.asInstanceOf[js.Any], highlightValue.asInstanceOf[js.Any])).asInstanceOf[Option]
  }
  
  trait DividerArgs extends StObject {
    
    var className: String
    
    var value: Node
  }
  object DividerArgs {
    
    inline def apply(className: String): DividerArgs = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], value = null)
      __obj.asInstanceOf[DividerArgs]
    }
    
    extension [Self <: DividerArgs](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setValue(value: VdomNode): Self = StObject.set(x, "value", value.rawNode.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "value", js.Array(value*))
      
      inline def setValueVdomElement(value: VdomElement): Self = StObject.set(x, "value", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  trait Option extends StObject {
    
    var id: Double | String
    
    var isDisabled: Boolean
    
    var isSelectable: Boolean
    
    def render(value: Node): Node
    
    var value: String
  }
  object Option {
    
    inline def apply(
      id: Double | String,
      isDisabled: Boolean,
      isSelectable: Boolean,
      render: Node => Node,
      value: String
    ): Option = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isDisabled = isDisabled.asInstanceOf[js.Any], isSelectable = isSelectable.asInstanceOf[js.Any], render = js.Any.fromFunction1(render), value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Option]
    }
    
    extension [Self <: Option](x: Self) {
      
      inline def setId(value: Double | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
      
      inline def setIsSelectable(value: Boolean): Self = StObject.set(x, "isSelectable", value.asInstanceOf[js.Any])
      
      inline def setRender(value: Node => Node): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
