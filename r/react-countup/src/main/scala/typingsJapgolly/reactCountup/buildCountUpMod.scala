package typingsJapgolly.reactCountup

import japgolly.scalajs.react.facade.React.Node
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ComponentPropsWithoutRef
import typingsJapgolly.react.mod.FC
import typingsJapgolly.reactCountup.buildTypesMod.CallbackProps
import typingsJapgolly.reactCountup.buildTypesMod.CommonProps
import typingsJapgolly.reactCountup.buildTypesMod.RenderCounterProps
import typingsJapgolly.reactCountup.reactCountupStrings.span
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildCountUpMod extends Shortcut {
  
  @JSImport("react-countup/build/CountUp", JSImport.Default)
  @js.native
  val default: FC[CountUpProps] = js.native
  
  trait CountUpProps
    extends StObject
       with CommonProps
       with CallbackProps {
    
    var children: js.UndefOr[js.Function1[/* props */ RenderCounterProps, Node]] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var containerProps: js.UndefOr[ComponentPropsWithoutRef[span]] = js.undefined
    
    var preserveValue: js.UndefOr[Boolean] = js.undefined
    
    var redraw: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object CountUpProps {
    
    inline def apply(end: Double): CountUpProps = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any])
      __obj.asInstanceOf[CountUpProps]
    }
    
    extension [Self <: CountUpProps](x: Self) {
      
      inline def setChildren(value: /* props */ RenderCounterProps => Node): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContainerProps(value: ComponentPropsWithoutRef[span]): Self = StObject.set(x, "containerProps", value.asInstanceOf[js.Any])
      
      inline def setContainerPropsUndefined: Self = StObject.set(x, "containerProps", js.undefined)
      
      inline def setPreserveValue(value: Boolean): Self = StObject.set(x, "preserveValue", value.asInstanceOf[js.Any])
      
      inline def setPreserveValueUndefined: Self = StObject.set(x, "preserveValue", js.undefined)
      
      inline def setRedraw(value: Boolean): Self = StObject.set(x, "redraw", value.asInstanceOf[js.Any])
      
      inline def setRedrawUndefined: Self = StObject.set(x, "redraw", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type _To = FC[CountUpProps]
  
  /* This means you don't have to write `default`, but can instead just say `buildCountUpMod.foo` */
  override def _to: FC[CountUpProps] = default
}
