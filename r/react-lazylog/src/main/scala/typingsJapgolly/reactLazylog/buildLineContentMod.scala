package typingsJapgolly.reactLazylog

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactLazylog.anon.PartialLineContentProps
import typingsJapgolly.reactLazylog.anon.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildLineContentMod {
  
  @JSImport("react-lazylog/build/LineContent", JSImport.Default)
  @js.native
  open class default ()
    extends Component[LineContentProps, js.Object, Any]
  /* static members */
  object default {
    
    @JSImport("react-lazylog/build/LineContent", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-lazylog/build/LineContent", "default.defaultProps")
    @js.native
    def defaultProps: PartialLineContentProps = js.native
    inline def defaultProps_=(x: PartialLineContentProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  type LineContent = japgolly.scalajs.react.facade.React.Component[LineContentProps & js.Object, js.Object]
  
  trait LineContentProps extends StObject {
    
    var data: js.Array[Text]
    
    var formatPart: js.UndefOr[js.Function1[/* text */ String, Node]] = js.undefined
    
    var number: Double
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object LineContentProps {
    
    inline def apply(data: js.Array[Text], number: Double): LineContentProps = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
      __obj.asInstanceOf[LineContentProps]
    }
    
    extension [Self <: LineContentProps](x: Self) {
      
      inline def setData(value: js.Array[Text]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: Text*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setFormatPart(value: /* text */ String => Node): Self = StObject.set(x, "formatPart", js.Any.fromFunction1(value))
      
      inline def setFormatPartUndefined: Self = StObject.set(x, "formatPart", js.undefined)
      
      inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
