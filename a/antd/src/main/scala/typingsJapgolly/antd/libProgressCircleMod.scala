package typingsJapgolly.antd

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.antd.libProgressProgressMod.ProgressGradient
import typingsJapgolly.antd.libProgressProgressMod.ProgressProps
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libProgressCircleMod extends Shortcut {
  
  @JSImport("antd/lib/progress/Circle", JSImport.Default)
  @js.native
  val default: FC[CircleProps] = js.native
  
  trait CircleProps
    extends StObject
       with ProgressProps {
    
    @JSName("children")
    var children_CircleProps: Node
    
    @JSName("prefixCls")
    var prefixCls_CircleProps: String
    
    var progressStatus: String
    
    @JSName("strokeColor")
    var strokeColor_CircleProps: js.UndefOr[String | ProgressGradient] = js.undefined
  }
  object CircleProps {
    
    inline def apply(prefixCls: String, progressStatus: String): CircleProps = {
      val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any], progressStatus = progressStatus.asInstanceOf[js.Any], children = null)
      __obj.asInstanceOf[CircleProps]
    }
    
    extension [Self <: CircleProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setProgressStatus(value: String): Self = StObject.set(x, "progressStatus", value.asInstanceOf[js.Any])
      
      inline def setStrokeColor(value: String | ProgressGradient): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
      
      inline def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
    }
  }
  
  type _To = FC[CircleProps]
  
  /* This means you don't have to write `default`, but can instead just say `libProgressCircleMod.foo` */
  override def _to: FC[CircleProps] = default
}
