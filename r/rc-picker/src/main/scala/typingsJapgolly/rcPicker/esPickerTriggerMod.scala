package typingsJapgolly.rcPicker

import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.rcPicker.rcPickerStrings.ltr
import typingsJapgolly.rcPicker.rcPickerStrings.rtl
import typingsJapgolly.rcTrigger.esInterfaceMod.AlignType
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esPickerTriggerMod {
  
  @JSImport("rc-picker/es/PickerTrigger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    hasPrefixClsPopupElementPopupStyleVisibleDropdownClassNameDropdownAlignTransitionNameGetPopupContainerChildrenRangePopupPlacementDirection: PickerTriggerProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasPrefixClsPopupElementPopupStyleVisibleDropdownClassNameDropdownAlignTransitionNameGetPopupContainerChildrenRangePopupPlacementDirection.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait PickerTriggerProps extends StObject {
    
    var children: japgolly.scalajs.react.facade.React.Element
    
    var direction: js.UndefOr[ltr | rtl] = js.undefined
    
    var dropdownAlign: js.UndefOr[AlignType] = js.undefined
    
    var dropdownClassName: js.UndefOr[String] = js.undefined
    
    var getPopupContainer: js.UndefOr[js.Function1[/* node */ HTMLElement, HTMLElement]] = js.undefined
    
    var popupElement: japgolly.scalajs.react.facade.React.Element
    
    var popupPlacement: js.UndefOr[Placement] = js.undefined
    
    var popupStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var prefixCls: String
    
    var range: js.UndefOr[Boolean] = js.undefined
    
    var transitionName: js.UndefOr[String] = js.undefined
    
    var visible: Boolean
  }
  object PickerTriggerProps {
    
    inline def apply(children: VdomElement, popupElement: VdomElement, prefixCls: String, visible: Boolean): PickerTriggerProps = {
      val __obj = js.Dynamic.literal(children = children.rawElement.asInstanceOf[js.Any], popupElement = popupElement.rawElement.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickerTriggerProps]
    }
    
    extension [Self <: PickerTriggerProps](x: Self) {
      
      inline def setChildren(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDirection(value: ltr | rtl): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setDropdownAlign(value: AlignType): Self = StObject.set(x, "dropdownAlign", value.asInstanceOf[js.Any])
      
      inline def setDropdownAlignUndefined: Self = StObject.set(x, "dropdownAlign", js.undefined)
      
      inline def setDropdownClassName(value: String): Self = StObject.set(x, "dropdownClassName", value.asInstanceOf[js.Any])
      
      inline def setDropdownClassNameUndefined: Self = StObject.set(x, "dropdownClassName", js.undefined)
      
      inline def setGetPopupContainer(value: /* node */ HTMLElement => HTMLElement): Self = StObject.set(x, "getPopupContainer", js.Any.fromFunction1(value))
      
      inline def setGetPopupContainerUndefined: Self = StObject.set(x, "getPopupContainer", js.undefined)
      
      inline def setPopupElement(value: VdomElement): Self = StObject.set(x, "popupElement", value.rawElement.asInstanceOf[js.Any])
      
      inline def setPopupPlacement(value: Placement): Self = StObject.set(x, "popupPlacement", value.asInstanceOf[js.Any])
      
      inline def setPopupPlacementUndefined: Self = StObject.set(x, "popupPlacement", js.undefined)
      
      inline def setPopupStyle(value: CSSProperties): Self = StObject.set(x, "popupStyle", value.asInstanceOf[js.Any])
      
      inline def setPopupStyleUndefined: Self = StObject.set(x, "popupStyle", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setRange(value: Boolean): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      inline def setTransitionName(value: String): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
      
      inline def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.rcPicker.rcPickerStrings.bottomLeft
    - typingsJapgolly.rcPicker.rcPickerStrings.bottomRight
    - typingsJapgolly.rcPicker.rcPickerStrings.topLeft
    - typingsJapgolly.rcPicker.rcPickerStrings.topRight
  */
  trait Placement extends StObject
  object Placement {
    
    inline def bottomLeft: typingsJapgolly.rcPicker.rcPickerStrings.bottomLeft = "bottomLeft".asInstanceOf[typingsJapgolly.rcPicker.rcPickerStrings.bottomLeft]
    
    inline def bottomRight: typingsJapgolly.rcPicker.rcPickerStrings.bottomRight = "bottomRight".asInstanceOf[typingsJapgolly.rcPicker.rcPickerStrings.bottomRight]
    
    inline def topLeft: typingsJapgolly.rcPicker.rcPickerStrings.topLeft = "topLeft".asInstanceOf[typingsJapgolly.rcPicker.rcPickerStrings.topLeft]
    
    inline def topRight: typingsJapgolly.rcPicker.rcPickerStrings.topRight = "topRight".asInstanceOf[typingsJapgolly.rcPicker.rcPickerStrings.topRight]
  }
}
