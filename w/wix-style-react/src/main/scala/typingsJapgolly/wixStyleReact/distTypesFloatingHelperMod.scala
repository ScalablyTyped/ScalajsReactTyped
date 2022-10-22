package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.ComponentClassP
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.PureComponent
import typingsJapgolly.wixStyleReact.distTypesCommonMod.MoveByOffset
import typingsJapgolly.wixStyleReact.distTypesFloatingHelperFloatingHelperContentMod.FloatingHelperContentProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFloatingHelperMod {
  
  @JSImport("wix-style-react/dist/types/FloatingHelper", JSImport.Default)
  @js.native
  open class default () extends FloatingHelper
  /* static members */
  object default {
    
    @JSImport("wix-style-react/dist/types/FloatingHelper", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/types/FloatingHelper", "default.Content")
    @js.native
    def Content: ComponentClassP[FloatingHelperContentProps & js.Object] = js.native
    inline def Content_=(x: ComponentClassP[FloatingHelperContentProps & js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Content")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait FloatingHelper
    extends PureComponent[FloatingHelperProps, js.Object, Any] {
    
    def close(): Unit = js.native
    
    def open(): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.dark
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.light
  */
  trait FloatingHelperAppearance extends StObject
  object FloatingHelperAppearance {
    
    inline def dark: typingsJapgolly.wixStyleReact.wixStyleReactStrings.dark = "dark".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.dark]
    
    inline def light: typingsJapgolly.wixStyleReact.wixStyleReactStrings.light = "light".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.light]
  }
  
  type FloatingHelperAppendTo = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AppendTo */ Any
  
  type FloatingHelperMoveByOffset = MoveByOffset
  
  type FloatingHelperPlacement = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Placement */ Any
  
  trait FloatingHelperProps extends StObject {
    
    var appearance: js.UndefOr[FloatingHelperAppearance] = js.undefined
    
    var appendTo: js.UndefOr[FloatingHelperAppendTo] = js.undefined
    
    var content: Node
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var hideDelay: js.UndefOr[Double] = js.undefined
    
    var initiallyOpened: js.UndefOr[Boolean] = js.undefined
    
    var moveBy: js.UndefOr[FloatingHelperMoveByOffset] = js.undefined
    
    var onClose: js.UndefOr[js.Function] = js.undefined
    
    var onOpen: js.UndefOr[js.Function] = js.undefined
    
    var opened: js.UndefOr[Boolean] = js.undefined
    
    var placement: FloatingHelperPlacement
    
    var target: Node
    
    var width: js.UndefOr[String | Double] = js.undefined
    
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object FloatingHelperProps {
    
    inline def apply(placement: FloatingHelperPlacement): FloatingHelperProps = {
      val __obj = js.Dynamic.literal(placement = placement.asInstanceOf[js.Any], content = null, target = null)
      __obj.asInstanceOf[FloatingHelperProps]
    }
    
    extension [Self <: FloatingHelperProps](x: Self) {
      
      inline def setAppearance(value: FloatingHelperAppearance): Self = StObject.set(x, "appearance", value.asInstanceOf[js.Any])
      
      inline def setAppearanceUndefined: Self = StObject.set(x, "appearance", js.undefined)
      
      inline def setAppendTo(value: FloatingHelperAppendTo): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
      
      inline def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
      
      inline def setContent(value: VdomNode): Self = StObject.set(x, "content", value.rawNode.asInstanceOf[js.Any])
      
      inline def setContentNull: Self = StObject.set(x, "content", null)
      
      inline def setContentVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setContentVdomElement(value: VdomElement): Self = StObject.set(x, "content", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setHideDelay(value: Double): Self = StObject.set(x, "hideDelay", value.asInstanceOf[js.Any])
      
      inline def setHideDelayUndefined: Self = StObject.set(x, "hideDelay", js.undefined)
      
      inline def setInitiallyOpened(value: Boolean): Self = StObject.set(x, "initiallyOpened", value.asInstanceOf[js.Any])
      
      inline def setInitiallyOpenedUndefined: Self = StObject.set(x, "initiallyOpened", js.undefined)
      
      inline def setMoveBy(value: FloatingHelperMoveByOffset): Self = StObject.set(x, "moveBy", value.asInstanceOf[js.Any])
      
      inline def setMoveByUndefined: Self = StObject.set(x, "moveBy", js.undefined)
      
      inline def setOnClose(value: js.Function): Self = StObject.set(x, "onClose", value.asInstanceOf[js.Any])
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnOpen(value: js.Function): Self = StObject.set(x, "onOpen", value.asInstanceOf[js.Any])
      
      inline def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      inline def setOpened(value: Boolean): Self = StObject.set(x, "opened", value.asInstanceOf[js.Any])
      
      inline def setOpenedUndefined: Self = StObject.set(x, "opened", js.undefined)
      
      inline def setPlacement(value: FloatingHelperPlacement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: VdomNode): Self = StObject.set(x, "target", value.rawNode.asInstanceOf[js.Any])
      
      inline def setTargetNull: Self = StObject.set(x, "target", null)
      
      inline def setTargetVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "target", js.Array(value*))
      
      inline def setTargetVdomElement(value: VdomElement): Self = StObject.set(x, "target", value.rawElement.asInstanceOf[js.Any])
      
      inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
}
