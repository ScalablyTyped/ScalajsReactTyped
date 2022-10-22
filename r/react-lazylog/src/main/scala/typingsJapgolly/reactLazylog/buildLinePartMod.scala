package typingsJapgolly.reactLazylog

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactLazylog.anon.PartialLinePartProps
import typingsJapgolly.reactLazylog.anon.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildLinePartMod {
  
  @JSImport("react-lazylog/build/LinePart", JSImport.Default)
  @js.native
  open class default ()
    extends Component[LinePartProps, js.Object, Any]
  /* static members */
  object default {
    
    @JSImport("react-lazylog/build/LinePart", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-lazylog/build/LinePart", "default.defaultProps")
    @js.native
    def defaultProps: PartialLinePartProps = js.native
    inline def defaultProps_=(x: PartialLinePartProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  type LinePart = japgolly.scalajs.react.facade.React.Component[LinePartProps & js.Object, js.Object]
  
  trait LinePartProps extends StObject {
    
    var format: js.UndefOr[js.Function1[/* text */ String, Node]] = js.undefined
    
    var part: Text
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object LinePartProps {
    
    inline def apply(part: Text): LinePartProps = {
      val __obj = js.Dynamic.literal(part = part.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinePartProps]
    }
    
    extension [Self <: LinePartProps](x: Self) {
      
      inline def setFormat(value: /* text */ String => Node): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setPart(value: Text): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
