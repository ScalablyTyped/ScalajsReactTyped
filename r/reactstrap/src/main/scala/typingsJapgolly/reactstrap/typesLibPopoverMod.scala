package typingsJapgolly.reactstrap

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.facade.React.RefHandle
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.reactstrap.anon.Hide
import typingsJapgolly.reactstrap.typesLibUtilsMod.CSSModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLibPopoverMod {
  
  @JSImport("reactstrap/types/lib/Popover", JSImport.Default)
  @js.native
  open class default ()
    extends Component[PopoverProps, js.Object, Any]
  
  type Popover = japgolly.scalajs.react.facade.React.Component[PopoverProps & js.Object, js.Object]
  
  type PopoverChildren = Node
  
  trait PopoverProps
    extends StObject
       with HTMLAttributes[HTMLElement]
       with /* key */ StringDictionary[Any] {
    
    var boundariesElement: js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Boundary */ Any) | Element
      ] = js.undefined
    
    @JSName("children")
    var children_PopoverProps: js.UndefOr[PopoverChildren] = js.undefined
    
    var container: js.UndefOr[String | HTMLElement | RefHandle[HTMLElement]] = js.undefined
    
    var cssModule: js.UndefOr[CSSModule] = js.undefined
    
    var delay: js.UndefOr[Double | Hide] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var fade: js.UndefOr[Boolean] = js.undefined
    
    var flip: js.UndefOr[Boolean] = js.undefined
    
    var hideArrow: js.UndefOr[Boolean] = js.undefined
    
    var innerClassName: js.UndefOr[String] = js.undefined
    
    var isOpen: js.UndefOr[Boolean] = js.undefined
    
    var modifiers: js.UndefOr[
        js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Modifier<string, any> */ Any
        ]
      ] = js.undefined
    
    var placement: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Placement */ Any
      ] = js.undefined
    
    var placementPrefix: js.UndefOr[String] = js.undefined
    
    var popperClassName: js.UndefOr[String] = js.undefined
    
    var strategy: js.UndefOr[String] = js.undefined
    
    var target: String | HTMLElement | RefHandle[HTMLElement]
    
    var toggle: js.UndefOr[MouseEventHandler[Any] | js.Function0[Unit]] = js.undefined
  }
  object PopoverProps {
    
    inline def apply(target: String | HTMLElement | RefHandle[HTMLElement]): PopoverProps = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopoverProps]
    }
    
    extension [Self <: PopoverProps](x: Self) {
      
      inline def setBoundariesElement(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Boundary */ Any) | Element
      ): Self = StObject.set(x, "boundariesElement", value.asInstanceOf[js.Any])
      
      inline def setBoundariesElementUndefined: Self = StObject.set(x, "boundariesElement", js.undefined)
      
      inline def setChildren(value: PopoverChildren): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setContainer(value: String | HTMLElement | RefHandle[HTMLElement]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      inline def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      inline def setDelay(value: Double | Hide): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFade(value: Boolean): Self = StObject.set(x, "fade", value.asInstanceOf[js.Any])
      
      inline def setFadeUndefined: Self = StObject.set(x, "fade", js.undefined)
      
      inline def setFlip(value: Boolean): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
      
      inline def setFlipUndefined: Self = StObject.set(x, "flip", js.undefined)
      
      inline def setHideArrow(value: Boolean): Self = StObject.set(x, "hideArrow", value.asInstanceOf[js.Any])
      
      inline def setHideArrowUndefined: Self = StObject.set(x, "hideArrow", js.undefined)
      
      inline def setInnerClassName(value: String): Self = StObject.set(x, "innerClassName", value.asInstanceOf[js.Any])
      
      inline def setInnerClassNameUndefined: Self = StObject.set(x, "innerClassName", js.undefined)
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
      
      inline def setModifiers(
        value: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Modifier<string, any> */ Any
            ]
      ): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
      
      inline def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
      
      inline def setModifiersVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Modifier<string, any> */ Any)*
      ): Self = StObject.set(x, "modifiers", js.Array(value*))
      
      inline def setPlacement(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Placement */ Any
      ): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementPrefix(value: String): Self = StObject.set(x, "placementPrefix", value.asInstanceOf[js.Any])
      
      inline def setPlacementPrefixUndefined: Self = StObject.set(x, "placementPrefix", js.undefined)
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setPopperClassName(value: String): Self = StObject.set(x, "popperClassName", value.asInstanceOf[js.Any])
      
      inline def setPopperClassNameUndefined: Self = StObject.set(x, "popperClassName", js.undefined)
      
      inline def setStrategy(value: String): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
      
      inline def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
      
      inline def setTarget(value: String | HTMLElement | RefHandle[HTMLElement]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setToggle(value: MouseEventHandler[Any] | js.Function0[Unit]): Self = StObject.set(x, "toggle", value.asInstanceOf[js.Any])
      
      inline def setToggleCallback(value: Callback): Self = StObject.set(x, "toggle", value.toJsFn)
      
      inline def setToggleFunction1(value: ReactMouseEventFrom[Any & Element] => Callback): Self = StObject.set(x, "toggle", js.Any.fromFunction1((t0: ReactMouseEventFrom[Any & Element]) => value(t0).runNow()))
      
      inline def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
    }
  }
  
  trait UncontrolledPopoverProps
    extends StObject
       with PopoverProps {
    
    var defaultOpen: js.UndefOr[Boolean] = js.undefined
  }
  object UncontrolledPopoverProps {
    
    inline def apply(target: String | HTMLElement | RefHandle[HTMLElement]): UncontrolledPopoverProps = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[UncontrolledPopoverProps]
    }
    
    extension [Self <: UncontrolledPopoverProps](x: Self) {
      
      inline def setDefaultOpen(value: Boolean): Self = StObject.set(x, "defaultOpen", value.asInstanceOf[js.Any])
      
      inline def setDefaultOpenUndefined: Self = StObject.set(x, "defaultOpen", js.undefined)
    }
  }
}
