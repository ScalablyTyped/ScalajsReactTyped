package typingsJapgolly.fnandoSparkline

import japgolly.scalajs.react.Callback
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.SVGSVGElement
import typingsJapgolly.fnandoSparkline.anon.Value
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@fnando/sparkline", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TEntry /* <: SparklineNativeEntry */](svg: SVGSVGElement, entries: js.Array[TEntry]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(svg.asInstanceOf[js.Any], entries.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def default[TEntry](
    svg: SVGSVGElement,
    entries: js.Array[TEntry],
    options: SparklineNativeOptions[TEntry] | SparklineNonNativeOptions[TEntry]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(svg.asInstanceOf[js.Any], entries.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def sparkline[TEntry /* <: SparklineNativeEntry */](svg: SVGSVGElement, entries: js.Array[TEntry]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sparkline")(svg.asInstanceOf[js.Any], entries.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def sparkline[TEntry /* <: SparklineNativeEntry */](
    svg: SVGSVGElement,
    entries: js.Array[TEntry],
    options: SparklineNativeOptions[TEntry] | SparklineNonNativeOptions[TEntry]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sparkline")(svg.asInstanceOf[js.Any], entries.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    TEntry extends number ? {  x :number,   y :number,   index :number,   value :number} : TEntry & {  x :number,   y :number,   index :number}
    }}}
    */
  @js.native
  trait SparklineDatapoint[TEntry] extends StObject
  
  type SparklineNativeEntry = Double | Value
  
  type SparklineNativeOptions[TEntry] = SparklineOptions[TEntry] | Partial[SparklineOptionsFetch[TEntry]]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.fnandoSparkline.mod.SparklineOptions[TEntry]
    - typingsJapgolly.fnandoSparkline.mod.SparklineOptionsFetch[TEntry]
  */
  trait SparklineNonNativeOptions[TEntry] extends StObject
  object SparklineNonNativeOptions {
    
    inline def SparklineOptions[TEntry](): typingsJapgolly.fnandoSparkline.mod.SparklineOptions[TEntry] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.fnandoSparkline.mod.SparklineOptions[TEntry]]
    }
    
    inline def SparklineOptionsFetch[TEntry](fetch: TEntry => Double): typingsJapgolly.fnandoSparkline.mod.SparklineOptionsFetch[TEntry] = {
      val __obj = js.Dynamic.literal(fetch = js.Any.fromFunction1(fetch))
      __obj.asInstanceOf[typingsJapgolly.fnandoSparkline.mod.SparklineOptionsFetch[TEntry]]
    }
  }
  
  trait SparklineOptions[TEntry]
    extends StObject
       with SparklineNonNativeOptions[TEntry] {
    
    /**
      * Set the cursor width. The default is 2.
      */
    var cursorwidth: js.UndefOr[Double] = js.undefined
    
    /**
      * When true, this enables the interactive mode. You don't have to set this option if you're providing a onmousemove callback.
      */
    var interactive: js.UndefOr[Boolean] = js.undefined
    
    /**
      * By setting this callback function, you'll enable the interactive mode (unless you set options.interactive to false).
      */
    var onmousemove: js.UndefOr[
        js.Function2[/* event */ MouseEvent, /* datapoint */ SparklineDatapoint[TEntry], Unit]
      ] = js.undefined
    
    /**
      * This callback function is called every time the mouse leaves the SVG area. You can use it to hide things like tooltips.
      */
    var onmouseout: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
    
    /**
      * Set the spot radius. The default is 2.
      */
    var spotRadius: js.UndefOr[Double] = js.undefined
  }
  object SparklineOptions {
    
    inline def apply[TEntry](): SparklineOptions[TEntry] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SparklineOptions[TEntry]]
    }
    
    extension [Self <: SparklineOptions[?], TEntry](x: Self & SparklineOptions[TEntry]) {
      
      inline def setCursorwidth(value: Double): Self = StObject.set(x, "cursorwidth", value.asInstanceOf[js.Any])
      
      inline def setCursorwidthUndefined: Self = StObject.set(x, "cursorwidth", js.undefined)
      
      inline def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
      
      inline def setInteractiveUndefined: Self = StObject.set(x, "interactive", js.undefined)
      
      inline def setOnmousemove(value: (/* event */ MouseEvent, /* datapoint */ SparklineDatapoint[TEntry]) => Callback): Self = StObject.set(x, "onmousemove", js.Any.fromFunction2((t0: /* event */ MouseEvent, t1: /* datapoint */ SparklineDatapoint[TEntry]) => (value(t0, t1)).runNow()))
      
      inline def setOnmousemoveUndefined: Self = StObject.set(x, "onmousemove", js.undefined)
      
      inline def setOnmouseout(value: /* event */ MouseEvent => Callback): Self = StObject.set(x, "onmouseout", js.Any.fromFunction1((t0: /* event */ MouseEvent) => value(t0).runNow()))
      
      inline def setOnmouseoutUndefined: Self = StObject.set(x, "onmouseout", js.undefined)
      
      inline def setSpotRadius(value: Double): Self = StObject.set(x, "spotRadius", value.asInstanceOf[js.Any])
      
      inline def setSpotRadiusUndefined: Self = StObject.set(x, "spotRadius", js.undefined)
    }
  }
  
  trait SparklineOptionsFetch[TEntry]
    extends StObject
       with SparklineNonNativeOptions[TEntry] {
    
    /**
      * Use this function to return the value if you have a different data structure that's not natively supported by sparkline.
      */
    def fetch(entry: TEntry): Double
  }
  object SparklineOptionsFetch {
    
    inline def apply[TEntry](fetch: TEntry => Double): SparklineOptionsFetch[TEntry] = {
      val __obj = js.Dynamic.literal(fetch = js.Any.fromFunction1(fetch))
      __obj.asInstanceOf[SparklineOptionsFetch[TEntry]]
    }
    
    extension [Self <: SparklineOptionsFetch[?], TEntry](x: Self & SparklineOptionsFetch[TEntry]) {
      
      inline def setFetch(value: TEntry => Double): Self = StObject.set(x, "fetch", js.Any.fromFunction1(value))
    }
  }
}
