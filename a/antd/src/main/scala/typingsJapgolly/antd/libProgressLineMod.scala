package typingsJapgolly.antd

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antd.anon.BackgroundImage
import typingsJapgolly.antd.libConfigProviderContextMod.DirectionType
import typingsJapgolly.antd.libProgressProgressMod.ProgressGradient
import typingsJapgolly.antd.libProgressProgressMod.ProgressProps
import typingsJapgolly.antd.libProgressProgressMod.StringGradients
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libProgressLineMod {
  
  @JSImport("antd/lib/progress/Line", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("antd/lib/progress/Line", JSImport.Default)
  @js.native
  val default: FC[LineProps] = js.native
  
  inline def handleGradient(strokeColor: ProgressGradient): BackgroundImage = ^.asInstanceOf[js.Dynamic].applyDynamic("handleGradient")(strokeColor.asInstanceOf[js.Any]).asInstanceOf[BackgroundImage]
  inline def handleGradient(strokeColor: ProgressGradient, directionConfig: DirectionType): BackgroundImage = (^.asInstanceOf[js.Dynamic].applyDynamic("handleGradient")(strokeColor.asInstanceOf[js.Any], directionConfig.asInstanceOf[js.Any])).asInstanceOf[BackgroundImage]
  
  inline def sortGradient(gradients: StringGradients): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sortGradient")(gradients.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait LineProps
    extends StObject
       with ProgressProps {
    
    @JSName("children")
    var children_LineProps: Node
    
    var direction: js.UndefOr[DirectionType] = js.undefined
    
    @JSName("prefixCls")
    var prefixCls_LineProps: String
    
    @JSName("strokeColor")
    var strokeColor_LineProps: js.UndefOr[String | ProgressGradient] = js.undefined
  }
  object LineProps {
    
    inline def apply(prefixCls: String): LineProps = {
      val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any], children = null)
      __obj.asInstanceOf[LineProps]
    }
    
    extension [Self <: LineProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDirection(value: DirectionType): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setStrokeColor(value: String | ProgressGradient): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
      
      inline def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
    }
  }
}
