package typingsJapgolly.reactMdUtils

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesHoverHoverModeProviderMod {
  
  @JSImport("@react-md/utils/types/hover/HoverModeProvider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def HoverModeProvider(hasChildrenDisabledDefaultVisibleInTimeDeactivateTime: HoverModeProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("HoverModeProvider")(hasChildrenDisabledDefaultVisibleInTimeDeactivateTime.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait HoverModeConfiguration extends StObject {
    
    /**
      * The amount of time (in ms) the user must not hover any element connected to
      * the hover mode.
      *
      * @defaultValue {@link DEFAULT_HOVER_MODE_DEACTIVATION_TIME}
      */
    var deactivateTime: js.UndefOr[Double] = js.undefined
    
    /**
      * The amount of time (in ms) the user must hover an element before the hover
      * mode is enabled and the visibility is set to `true`.
      *
      * @defaultValue {@link DEFAULT_HOVER_MODE_VISIBLE_IN_TIME}
      */
    var defaultVisibleInTime: js.UndefOr[Double] = js.undefined
    
    /**
      * Boolean if the hover mode functionality should be disabled.
      *
      * @defaultValue `false`
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
  }
  object HoverModeConfiguration {
    
    inline def apply(): HoverModeConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HoverModeConfiguration]
    }
    
    extension [Self <: HoverModeConfiguration](x: Self) {
      
      inline def setDeactivateTime(value: Double): Self = StObject.set(x, "deactivateTime", value.asInstanceOf[js.Any])
      
      inline def setDeactivateTimeUndefined: Self = StObject.set(x, "deactivateTime", js.undefined)
      
      inline def setDefaultVisibleInTime(value: Double): Self = StObject.set(x, "defaultVisibleInTime", value.asInstanceOf[js.Any])
      
      inline def setDefaultVisibleInTimeUndefined: Self = StObject.set(x, "defaultVisibleInTime", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    }
  }
  
  trait HoverModeProviderProps
    extends StObject
       with HoverModeConfiguration {
    
    var children: Node
  }
  object HoverModeProviderProps {
    
    inline def apply(): HoverModeProviderProps = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[HoverModeProviderProps]
    }
    
    extension [Self <: HoverModeProviderProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    }
  }
}
