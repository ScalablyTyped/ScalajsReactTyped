package typingsJapgolly.reactLazylog

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLAnchorElement
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.reactLazylog.anon.PartialLineProps
import typingsJapgolly.reactLazylog.anon.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildLineMod {
  
  @JSImport("react-lazylog/build/Line", JSImport.Default)
  @js.native
  open class default ()
    extends Component[LineProps, js.Object, Any]
  /* static members */
  object default {
    
    @JSImport("react-lazylog/build/Line", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-lazylog/build/Line", "default.defaultProps")
    @js.native
    def defaultProps: PartialLineProps = js.native
    inline def defaultProps_=(x: PartialLineProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  type Line = japgolly.scalajs.react.facade.React.Component[LineProps & js.Object, js.Object]
  
  trait LineProps extends StObject {
    
    var data: js.Array[Text]
    
    var formatPart: js.UndefOr[js.Function1[/* text */ String, Node]] = js.undefined
    
    var highlight: js.UndefOr[Boolean] = js.undefined
    
    var number: Double
    
    var onLineNumberClick: js.UndefOr[MouseEventHandler[HTMLAnchorElement]] = js.undefined
    
    /**
      * This is never called
      * https://github.com/mozilla-frontend-infra/react-lazylog/issues/18
      */
    var onRowClick: js.UndefOr[js.Function0[Any]] = js.undefined
    
    var rowHeight: Double
    
    var selectable: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object LineProps {
    
    inline def apply(data: js.Array[Text], number: Double, rowHeight: Double): LineProps = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], rowHeight = rowHeight.asInstanceOf[js.Any])
      __obj.asInstanceOf[LineProps]
    }
    
    extension [Self <: LineProps](x: Self) {
      
      inline def setData(value: js.Array[Text]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: Text*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setFormatPart(value: /* text */ String => Node): Self = StObject.set(x, "formatPart", js.Any.fromFunction1(value))
      
      inline def setFormatPartUndefined: Self = StObject.set(x, "formatPart", js.undefined)
      
      inline def setHighlight(value: Boolean): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
      
      inline def setHighlightUndefined: Self = StObject.set(x, "highlight", js.undefined)
      
      inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setOnLineNumberClick(value: ReactMouseEventFrom[HTMLAnchorElement & Element] => Callback): Self = StObject.set(x, "onLineNumberClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLAnchorElement & Element]) => value(t0).runNow()))
      
      inline def setOnLineNumberClickUndefined: Self = StObject.set(x, "onLineNumberClick", js.undefined)
      
      inline def setOnRowClick(value: CallbackTo[Any]): Self = StObject.set(x, "onRowClick", value.toJsFn)
      
      inline def setOnRowClickUndefined: Self = StObject.set(x, "onRowClick", js.undefined)
      
      inline def setRowHeight(value: Double): Self = StObject.set(x, "rowHeight", value.asInstanceOf[js.Any])
      
      inline def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
