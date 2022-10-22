package typingsJapgolly.antd

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.antd.anon.HorizontalSize
import typingsJapgolly.antd.antdStrings.baseline
import typingsJapgolly.antd.antdStrings.center
import typingsJapgolly.antd.antdStrings.end
import typingsJapgolly.antd.antdStrings.horizontal
import typingsJapgolly.antd.antdStrings.start
import typingsJapgolly.antd.antdStrings.vertical
import typingsJapgolly.antd.libConfigProviderSizeContextMod.SizeType
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.HTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSpaceMod extends Shortcut {
  
  @JSImport("antd/lib/space", JSImport.Default)
  @js.native
  val default: FC[SpaceProps] = js.native
  
  @JSImport("antd/lib/space", "SpaceContext")
  @js.native
  val SpaceContext: Context[HorizontalSize] = js.native
  
  trait SpaceProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    var align: js.UndefOr[start | end | center | baseline] = js.undefined
    
    var direction: js.UndefOr[horizontal | vertical] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[SpaceSize | (js.Tuple2[SpaceSize, SpaceSize])] = js.undefined
    
    var split: js.UndefOr[Node] = js.undefined
    
    var wrap: js.UndefOr[Boolean] = js.undefined
  }
  object SpaceProps {
    
    inline def apply(): SpaceProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpaceProps]
    }
    
    extension [Self <: SpaceProps](x: Self) {
      
      inline def setAlign(value: start | end | center | baseline): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setDirection(value: horizontal | vertical): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setSize(value: SpaceSize | (js.Tuple2[SpaceSize, SpaceSize])): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSplit(value: VdomNode): Self = StObject.set(x, "split", value.rawNode.asInstanceOf[js.Any])
      
      inline def setSplitNull: Self = StObject.set(x, "split", null)
      
      inline def setSplitUndefined: Self = StObject.set(x, "split", js.undefined)
      
      inline def setSplitVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "split", js.Array(value*))
      
      inline def setSplitVdomElement(value: VdomElement): Self = StObject.set(x, "split", value.rawElement.asInstanceOf[js.Any])
      
      inline def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
  
  type SpaceSize = SizeType | Double
  
  type _To = FC[SpaceProps]
  
  /* This means you don't have to write `default`, but can instead just say `libSpaceMod.foo` */
  override def _to: FC[SpaceProps] = default
}
