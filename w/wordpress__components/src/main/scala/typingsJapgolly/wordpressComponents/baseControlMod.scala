package typingsJapgolly.wordpressComponents

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.wordpressComponents.baseControlMod.BaseControl.Props
import typingsJapgolly.wordpressComponents.baseControlMod.BaseControl.VisualLabelProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseControlMod {
  
  object default {
    
    inline def apply(props: Props): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@wordpress/components/base-control", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def VisualLabel(props: VisualLabelProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("VisualLabel")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  }
  
  object BaseControl {
    
    trait ControlProps extends StObject {
      
      /**
        * The class that will be added with `"components-base-control"` to
        * the classes of the wrapper div. If undefined, only
        * `"components-base-control"` is used.
        */
      var className: js.UndefOr[String] = js.undefined
      
      /**
        * If this property is added, a help text will be generated using help
        * property as the content.
        */
      var help: js.UndefOr[Node] = js.undefined
      
      /**
        * If true, the label will only be visible to screen readers.
        */
      var hideLabelFromVision: js.UndefOr[Boolean] = js.undefined
      
      /**
        * If this property is added, a label will be generated using label
        * property as the content.
        */
      var label: js.UndefOr[Node] = js.undefined
    }
    object ControlProps {
      
      inline def apply(): ControlProps = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ControlProps]
      }
      
      extension [Self <: ControlProps](x: Self) {
        
        inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
        
        inline def setHelp(value: VdomNode): Self = StObject.set(x, "help", value.rawNode.asInstanceOf[js.Any])
        
        inline def setHelpNull: Self = StObject.set(x, "help", null)
        
        inline def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
        
        inline def setHelpVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "help", js.Array(value*))
        
        inline def setHelpVdomElement(value: VdomElement): Self = StObject.set(x, "help", value.rawElement.asInstanceOf[js.Any])
        
        inline def setHideLabelFromVision(value: Boolean): Self = StObject.set(x, "hideLabelFromVision", value.asInstanceOf[js.Any])
        
        inline def setHideLabelFromVisionUndefined: Self = StObject.set(x, "hideLabelFromVision", js.undefined)
        
        inline def setLabel(value: VdomNode): Self = StObject.set(x, "label", value.rawNode.asInstanceOf[js.Any])
        
        inline def setLabelNull: Self = StObject.set(x, "label", null)
        
        inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
        
        inline def setLabelVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "label", js.Array(value*))
        
        inline def setLabelVdomElement(value: VdomElement): Self = StObject.set(x, "label", value.rawElement.asInstanceOf[js.Any])
      }
    }
    
    trait Props
      extends StObject
         with ControlProps {
      
      /**
        * The content to be displayed within the BaseControl.
        */
      var children: Node
      
      /**
        * The id of the element to which labels and help text are being
        * generated. That element should be passed as a child.
        */
      var id: String
    }
    object Props {
      
      inline def apply(id: String): Props = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], children = null)
        __obj.asInstanceOf[Props]
      }
      
      extension [Self <: Props](x: Self) {
        
        inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
        
        inline def setChildrenNull: Self = StObject.set(x, "children", null)
        
        inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
        
        inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      }
    }
    
    trait VisualLabelProps extends StObject {
      
      var children: Node
      
      var className: js.UndefOr[String] = js.undefined
    }
    object VisualLabelProps {
      
      inline def apply(): VisualLabelProps = {
        val __obj = js.Dynamic.literal(children = null)
        __obj.asInstanceOf[VisualLabelProps]
      }
      
      extension [Self <: VisualLabelProps](x: Self) {
        
        inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
        
        inline def setChildrenNull: Self = StObject.set(x, "children", null)
        
        inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
        
        inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
        
        inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      }
    }
  }
}
