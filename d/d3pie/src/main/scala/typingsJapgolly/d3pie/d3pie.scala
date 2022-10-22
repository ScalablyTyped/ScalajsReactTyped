package typingsJapgolly.d3pie

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Instantiable2
import org.scalajs.dom.HTMLElement
import typingsJapgolly.d3pie.anon.CanvasHeight
import typingsJapgolly.d3pie.anon.CanvasPadding
import typingsJapgolly.d3pie.anon.Content
import typingsJapgolly.d3pie.anon.Formatter
import typingsJapgolly.d3pie.anon.HighlightLuminosity
import typingsJapgolly.d3pie.anon.Location
import typingsJapgolly.d3pie.anon.OnClickSegment
import typingsJapgolly.d3pie.anon.PlaceholderParser
import typingsJapgolly.d3pie.anon.locationleftundefinedID3P
import typingsJapgolly.d3pie.d3pieStrings.`label-percentage1`
import typingsJapgolly.d3pie.d3pieStrings.`label-percentage2`
import typingsJapgolly.d3pie.d3pieStrings.`label-value1`
import typingsJapgolly.d3pie.d3pieStrings.`label-value2`
import typingsJapgolly.d3pie.d3pieStrings.label
import typingsJapgolly.d3pie.d3pieStrings.percentage
import typingsJapgolly.d3pie.d3pieStrings.value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object d3pie {
  
  trait ID3PieChart extends StObject {
    
    def closeSegment(index: Unit): Unit
    
    def destroy(): Unit
    
    def getOpenSegment(): Any
    
    def openSegment(index: Double): Unit
    
    def redraw(): Unit
    
    def updateProp(propKey: String, value: Any): Unit
  }
  object ID3PieChart {
    
    inline def apply(
      closeSegment: Unit => Callback,
      destroy: Callback,
      getOpenSegment: CallbackTo[Any],
      openSegment: Double => Callback,
      redraw: Callback,
      updateProp: (String, Any) => Callback
    ): ID3PieChart = {
      val __obj = js.Dynamic.literal(closeSegment = js.Any.fromFunction1((t0: Unit) => closeSegment(t0).runNow()), destroy = destroy.toJsFn, getOpenSegment = getOpenSegment.toJsFn, openSegment = js.Any.fromFunction1((t0: Double) => openSegment(t0).runNow()), redraw = redraw.toJsFn, updateProp = js.Any.fromFunction2((t0: String, t1: Any) => (updateProp(t0, t1)).runNow()))
      __obj.asInstanceOf[ID3PieChart]
    }
    
    extension [Self <: ID3PieChart](x: Self) {
      
      inline def setCloseSegment(value: Unit => Callback): Self = StObject.set(x, "closeSegment", js.Any.fromFunction1((t0: Unit) => value(t0).runNow()))
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setGetOpenSegment(value: CallbackTo[Any]): Self = StObject.set(x, "getOpenSegment", value.toJsFn)
      
      inline def setOpenSegment(value: Double => Callback): Self = StObject.set(x, "openSegment", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setRedraw(value: Callback): Self = StObject.set(x, "redraw", value.toJsFn)
      
      inline def setUpdateProp(value: (String, Any) => Callback): Self = StObject.set(x, "updateProp", js.Any.fromFunction2((t0: String, t1: Any) => (value(t0, t1)).runNow()))
    }
  }
  
  @js.native
  trait ID3PieClass
    extends StObject
       with Instantiable2[(/* id */ HTMLElement) | (/* id */ String), /* options */ ID3PieOptions, ID3PieChart]
  
  trait ID3PieLabelsOptions extends StObject {
    
    var format: js.UndefOr[
        label | value | percentage | `label-value1` | `label-value2` | `label-percentage1` | `label-percentage2`
      ] = js.undefined
    
    var hideWhenLessThanPercentage: js.UndefOr[Double] = js.undefined
  }
  object ID3PieLabelsOptions {
    
    inline def apply(): ID3PieLabelsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ID3PieLabelsOptions]
    }
    
    extension [Self <: ID3PieLabelsOptions](x: Self) {
      
      inline def setFormat(
        value: label | value | percentage | `label-value1` | `label-value2` | `label-percentage1` | `label-percentage2`
      ): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setHideWhenLessThanPercentage(value: Double): Self = StObject.set(x, "hideWhenLessThanPercentage", value.asInstanceOf[js.Any])
      
      inline def setHideWhenLessThanPercentageUndefined: Self = StObject.set(x, "hideWhenLessThanPercentage", js.undefined)
    }
  }
  
  trait ID3PieOptions extends StObject {
    
    var callbacks: js.UndefOr[OnClickSegment] = js.undefined
    
    var data: Content
    
    var effects: js.UndefOr[HighlightLuminosity] = js.undefined
    
    var footer: js.UndefOr[locationleftundefinedID3P] = js.undefined
    
    var header: js.UndefOr[Location] = js.undefined
    
    var labels: js.UndefOr[Formatter] = js.undefined
    
    var misc: js.UndefOr[CanvasPadding] = js.undefined
    
    var size: js.UndefOr[CanvasHeight] = js.undefined
    
    var tooltips: js.UndefOr[PlaceholderParser] = js.undefined
  }
  object ID3PieOptions {
    
    inline def apply(data: Content): ID3PieOptions = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[ID3PieOptions]
    }
    
    extension [Self <: ID3PieOptions](x: Self) {
      
      inline def setCallbacks(value: OnClickSegment): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      inline def setCallbacksUndefined: Self = StObject.set(x, "callbacks", js.undefined)
      
      inline def setData(value: Content): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setEffects(value: HighlightLuminosity): Self = StObject.set(x, "effects", value.asInstanceOf[js.Any])
      
      inline def setEffectsUndefined: Self = StObject.set(x, "effects", js.undefined)
      
      inline def setFooter(value: locationleftundefinedID3P): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setHeader(value: Location): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setLabels(value: Formatter): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      inline def setMisc(value: CanvasPadding): Self = StObject.set(x, "misc", value.asInstanceOf[js.Any])
      
      inline def setMiscUndefined: Self = StObject.set(x, "misc", js.undefined)
      
      inline def setSize(value: CanvasHeight): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTooltips(value: PlaceholderParser): Self = StObject.set(x, "tooltips", value.asInstanceOf[js.Any])
      
      inline def setTooltipsUndefined: Self = StObject.set(x, "tooltips", js.undefined)
    }
  }
  
  trait ID3PieStyleOptions extends StObject {
    
    var color: js.UndefOr[String] = js.undefined
    
    var font: js.UndefOr[String] = js.undefined
    
    var fontSize: js.UndefOr[Double] = js.undefined
  }
  object ID3PieStyleOptions {
    
    inline def apply(): ID3PieStyleOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ID3PieStyleOptions]
    }
    
    extension [Self <: ID3PieStyleOptions](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    }
  }
  
  trait ID3PieTextOptions
    extends StObject
       with ID3PieStyleOptions {
    
    var text: js.UndefOr[String] = js.undefined
  }
  object ID3PieTextOptions {
    
    inline def apply(): ID3PieTextOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ID3PieTextOptions]
    }
    
    extension [Self <: ID3PieTextOptions](x: Self) {
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
