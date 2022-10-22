package typingsJapgolly.antd

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.antd.antdStrings.circle
import typingsJapgolly.antd.antdStrings.large
import typingsJapgolly.antd.antdStrings.round
import typingsJapgolly.antd.antdStrings.small
import typingsJapgolly.antd.antdStrings.square
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSkeletonButtonMod extends Shortcut {
  
  @JSImport("antd/lib/skeleton/Button", JSImport.Default)
  @js.native
  val default: FC[SkeletonButtonProps] = js.native
  
  /* Inlined parent std.Omit<antd.antd/lib/skeleton/Element.SkeletonElementProps, 'size'> */
  trait SkeletonButtonProps extends StObject {
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var block: js.UndefOr[Boolean] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var shape: js.UndefOr[circle | square | round | typingsJapgolly.antd.antdStrings.default] = js.undefined
    
    var size: js.UndefOr[large | small | typingsJapgolly.antd.antdStrings.default] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object SkeletonButtonProps {
    
    inline def apply(): SkeletonButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SkeletonButtonProps]
    }
    
    extension [Self <: SkeletonButtonProps](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setBlock(value: Boolean): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      inline def setBlockUndefined: Self = StObject.set(x, "block", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setShape(value: circle | square | round | typingsJapgolly.antd.antdStrings.default): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      inline def setSize(value: large | small | typingsJapgolly.antd.antdStrings.default): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type _To = FC[SkeletonButtonProps]
  
  /* This means you don't have to write `default`, but can instead just say `libSkeletonButtonMod.foo` */
  override def _to: FC[SkeletonButtonProps] = default
}
