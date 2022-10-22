package typingsJapgolly.baseui

import typingsJapgolly.baseui.baseuiStrings.auto
import typingsJapgolly.baseui.layerLayersManagerMod.default
import typingsJapgolly.baseui.layerTypesMod.LayerProps
import typingsJapgolly.baseui.layerTypesMod.LayersContextProps
import typingsJapgolly.baseui.layerTypesMod.LayersManagerProps
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layerMod {
  
  @JSImport("baseui/layer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Layer(props: LayerProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Layer")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("baseui/layer", "LayersContext")
  @js.native
  val LayersContext: Context[LayersContextProps] = js.native
  
  @JSImport("baseui/layer", "LayersManager")
  @js.native
  open class LayersManager protected () extends default {
    def this(props: LayersManagerProps) = this()
  }
  
  object TETHER_PLACEMENT {
    
    @JSImport("baseui/layer", "TETHER_PLACEMENT.auto")
    @js.native
    val auto: typingsJapgolly.baseui.baseuiStrings.auto = js.native
    
    @JSImport("baseui/layer", "TETHER_PLACEMENT.bottom")
    @js.native
    val bottom: typingsJapgolly.baseui.baseuiStrings.bottom = js.native
    
    @JSImport("baseui/layer", "TETHER_PLACEMENT.bottomLeft")
    @js.native
    val bottomLeft: typingsJapgolly.baseui.baseuiStrings.bottomLeft = js.native
    
    @JSImport("baseui/layer", "TETHER_PLACEMENT.bottomRight")
    @js.native
    val bottomRight: typingsJapgolly.baseui.baseuiStrings.bottomRight = js.native
    
    @JSImport("baseui/layer", "TETHER_PLACEMENT.left")
    @js.native
    val left: typingsJapgolly.baseui.baseuiStrings.left = js.native
    
    @JSImport("baseui/layer", "TETHER_PLACEMENT.leftBottom")
    @js.native
    val leftBottom: typingsJapgolly.baseui.baseuiStrings.leftBottom = js.native
    
    @JSImport("baseui/layer", "TETHER_PLACEMENT.leftTop")
    @js.native
    val leftTop: typingsJapgolly.baseui.baseuiStrings.leftTop = js.native
    
    @JSImport("baseui/layer", "TETHER_PLACEMENT.right")
    @js.native
    val right: typingsJapgolly.baseui.baseuiStrings.right = js.native
    
    @JSImport("baseui/layer", "TETHER_PLACEMENT.rightBottom")
    @js.native
    val rightBottom: typingsJapgolly.baseui.baseuiStrings.rightBottom = js.native
    
    @JSImport("baseui/layer", "TETHER_PLACEMENT.rightTop")
    @js.native
    val rightTop: typingsJapgolly.baseui.baseuiStrings.rightTop = js.native
    
    @JSImport("baseui/layer", "TETHER_PLACEMENT.top")
    @js.native
    val top: typingsJapgolly.baseui.baseuiStrings.top = js.native
    
    @JSImport("baseui/layer", "TETHER_PLACEMENT.topLeft")
    @js.native
    val topLeft: typingsJapgolly.baseui.baseuiStrings.topLeft = js.native
    
    @JSImport("baseui/layer", "TETHER_PLACEMENT.topRight")
    @js.native
    val topRight: typingsJapgolly.baseui.baseuiStrings.topRight = js.native
  }
  
  @JSImport("baseui/layer", "TetherBehavior")
  @js.native
  open class TetherBehavior ()
    extends typingsJapgolly.baseui.layerTetherMod.default
  object TetherBehavior {
    
    /* static member */
    object defaultProps {
      
      @JSImport("baseui/layer", "TetherBehavior.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("baseui/layer", "TetherBehavior.defaultProps.anchorRef")
      @js.native
      def anchorRef: Any = js.native
      inline def anchorRef_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("anchorRef")(x.asInstanceOf[js.Any])
      
      inline def onPopperUpdate(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("onPopperUpdate")().asInstanceOf[Any]
      
      @JSImport("baseui/layer", "TetherBehavior.defaultProps.placement")
      @js.native
      def placement: auto = js.native
      inline def placement_=(x: auto): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("placement")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/layer", "TetherBehavior.defaultProps.popperRef")
      @js.native
      def popperRef: Any = js.native
      inline def popperRef_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("popperRef")(x.asInstanceOf[js.Any])
    }
  }
}
