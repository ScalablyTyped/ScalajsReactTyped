package typingsJapgolly.orbitUiReactComponents

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import typingsJapgolly.orbitUiReactComponents.anon.Close
import typingsJapgolly.orbitUiReactComponents.distOverlaySrcOverlayMod.OverlayProps
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.bottom
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.end
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.invalid
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.start
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.top
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.valid
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSelectSrcUseSelectMod {
  
  @JSImport("@orbit-ui/react-components/dist/select/src/useSelect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useSelect(
    children: Node,
    hasIdOpenPropDefaultOpenSelectedKeyPropDefaultSelectedKeyValidationStateOnSelectionChangeOnOpenChangeDirectionAlignAutoFocusDisabledReadOnlyAllowFlipAllowPreventOverflowAllowResponsiveMenuWidthAriaLabelAriaLabelledByAriaDescribedByHasMenuIdHasMenuWidthMenuStyleMenuPropsRef: UseSelectProps
  ): Close = (^.asInstanceOf[js.Dynamic].applyDynamic("useSelect")(children.asInstanceOf[js.Any], hasIdOpenPropDefaultOpenSelectedKeyPropDefaultSelectedKeyValidationStateOnSelectionChangeOnOpenChangeDirectionAlignAutoFocusDisabledReadOnlyAllowFlipAllowPreventOverflowAllowResponsiveMenuWidthAriaLabelAriaLabelledByAriaDescribedByHasMenuIdHasMenuWidthMenuStyleMenuPropsRef.asInstanceOf[js.Any])).asInstanceOf[Close]
  
  trait UseSelectProps extends StObject {
    
    var align: js.UndefOr[start | end] = js.undefined
    
    var allowFlip: js.UndefOr[Boolean] = js.undefined
    
    var allowPreventOverflow: js.UndefOr[Boolean] = js.undefined
    
    var allowResponsiveMenuWidth: js.UndefOr[Boolean] = js.undefined
    
    var ariaDescribedBy: js.UndefOr[String] = js.undefined
    
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    var ariaLabelledBy: js.UndefOr[String] = js.undefined
    
    var autoFocus: js.UndefOr[Boolean | Double] = js.undefined
    
    var defaultOpen: js.UndefOr[Boolean] = js.undefined
    
    var defaultSelectedKey: js.UndefOr[String] = js.undefined
    
    var direction: bottom | top
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var onOpenChange: js.UndefOr[js.Function2[/* event */ ReactEventFrom[Element], /* isOpen */ Boolean, Unit]] = js.undefined
    
    var onSelectionChange: js.UndefOr[
        js.Function2[/* event */ ReactEventFrom[Element], /* selectedKey */ String, Unit]
      ] = js.undefined
    
    var open: js.UndefOr[Boolean | Null] = js.undefined
    
    var overlayProps: js.UndefOr[Partial[OverlayProps]] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var ref: Ref[HTMLElement]
    
    var selectedKey: js.UndefOr[String | Null] = js.undefined
    
    var validationState: js.UndefOr[valid | invalid] = js.undefined
  }
  object UseSelectProps {
    
    inline def apply(direction: bottom | top): UseSelectProps = {
      val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], ref = null)
      __obj.asInstanceOf[UseSelectProps]
    }
    
    extension [Self <: UseSelectProps](x: Self) {
      
      inline def setAlign(value: start | end): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setAllowFlip(value: Boolean): Self = StObject.set(x, "allowFlip", value.asInstanceOf[js.Any])
      
      inline def setAllowFlipUndefined: Self = StObject.set(x, "allowFlip", js.undefined)
      
      inline def setAllowPreventOverflow(value: Boolean): Self = StObject.set(x, "allowPreventOverflow", value.asInstanceOf[js.Any])
      
      inline def setAllowPreventOverflowUndefined: Self = StObject.set(x, "allowPreventOverflow", js.undefined)
      
      inline def setAllowResponsiveMenuWidth(value: Boolean): Self = StObject.set(x, "allowResponsiveMenuWidth", value.asInstanceOf[js.Any])
      
      inline def setAllowResponsiveMenuWidthUndefined: Self = StObject.set(x, "allowResponsiveMenuWidth", js.undefined)
      
      inline def setAriaDescribedBy(value: String): Self = StObject.set(x, "ariaDescribedBy", value.asInstanceOf[js.Any])
      
      inline def setAriaDescribedByUndefined: Self = StObject.set(x, "ariaDescribedBy", js.undefined)
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setAriaLabelledBy(value: String): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setAutoFocus(value: Boolean | Double): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setDefaultOpen(value: Boolean): Self = StObject.set(x, "defaultOpen", value.asInstanceOf[js.Any])
      
      inline def setDefaultOpenUndefined: Self = StObject.set(x, "defaultOpen", js.undefined)
      
      inline def setDefaultSelectedKey(value: String): Self = StObject.set(x, "defaultSelectedKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultSelectedKeyUndefined: Self = StObject.set(x, "defaultSelectedKey", js.undefined)
      
      inline def setDirection(value: bottom | top): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setOnOpenChange(value: (/* event */ ReactEventFrom[Element], /* isOpen */ Boolean) => Callback): Self = StObject.set(x, "onOpenChange", js.Any.fromFunction2((t0: /* event */ ReactEventFrom[Element], t1: /* isOpen */ Boolean) => (value(t0, t1)).runNow()))
      
      inline def setOnOpenChangeUndefined: Self = StObject.set(x, "onOpenChange", js.undefined)
      
      inline def setOnSelectionChange(value: (/* event */ ReactEventFrom[Element], /* selectedKey */ String) => Callback): Self = StObject.set(x, "onSelectionChange", js.Any.fromFunction2((t0: /* event */ ReactEventFrom[Element], t1: /* selectedKey */ String) => (value(t0, t1)).runNow()))
      
      inline def setOnSelectionChangeUndefined: Self = StObject.set(x, "onSelectionChange", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenNull: Self = StObject.set(x, "open", null)
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setOverlayProps(value: Partial[OverlayProps]): Self = StObject.set(x, "overlayProps", value.asInstanceOf[js.Any])
      
      inline def setOverlayPropsUndefined: Self = StObject.set(x, "overlayProps", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setRef(value: Ref[HTMLElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: HTMLElement | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: HTMLElement | Null) => value(t0).runNow()))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setSelectedKey(value: String): Self = StObject.set(x, "selectedKey", value.asInstanceOf[js.Any])
      
      inline def setSelectedKeyNull: Self = StObject.set(x, "selectedKey", null)
      
      inline def setSelectedKeyUndefined: Self = StObject.set(x, "selectedKey", js.undefined)
      
      inline def setValidationState(value: valid | invalid): Self = StObject.set(x, "validationState", value.asInstanceOf[js.Any])
      
      inline def setValidationStateUndefined: Self = StObject.set(x, "validationState", js.undefined)
    }
  }
}
