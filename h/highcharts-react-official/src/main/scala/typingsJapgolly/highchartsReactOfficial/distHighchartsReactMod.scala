package typingsJapgolly.highchartsReactOfficial

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.RefHandle
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.highcharts.mod.ChartCallbackFunction
import typingsJapgolly.highcharts.mod.Chart_
import typingsJapgolly.highcharts.mod.Options
import typingsJapgolly.highchartsReactOfficial.anon.TypeofHighcharts
import typingsJapgolly.highchartsReactOfficial.distHighchartsReactMod.HighchartsReact.Props
import typingsJapgolly.highchartsReactOfficial.distHighchartsReactMod.HighchartsReact.RefObject
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.PropsWithoutRef
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHighchartsReactMod {
  
  object default extends Shortcut {
    
    @JSImport("highcharts-react-official/dist/highcharts-react", JSImport.Default)
    @js.native
    val ^ : ForwardRefExoticComponent[PropsWithoutRef[Props] & RefAttributes[RefObject]] = js.native
    
    type _To = ForwardRefExoticComponent[PropsWithoutRef[Props] & RefAttributes[RefObject]]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ForwardRefExoticComponent[PropsWithoutRef[Props] & RefAttributes[RefObject]] = ^
  }
  
  object HighchartsReact {
    
    trait Props
      extends StObject
         with /* *
      *
      *  Properties
      *
      * */
    /**
      * Indexer for custom properties
      */
    /* key */ StringDictionary[Any] {
      
      /**
        * Flag for `Chart.update` call (Default: true)
        */
      var allowChartUpdate: js.UndefOr[Boolean] = js.undefined
      
      /* *
        *
        *  Functions
        *
        * */
      /**
        * Callback for the chart factory
        */
      var callback: js.UndefOr[ChartCallbackFunction] = js.undefined
      
      /**
        * Reference to the chart factory (Default: chart)
        */
      var constructorType: js.UndefOr[
            /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 86, starting with typingsJapgolly.highchartsReactOfficial.highchartsReactOfficialStrings.getMagnitude, typingsJapgolly.highchartsReactOfficial.highchartsReactOfficialStrings.attr, typingsJapgolly.highchartsReactOfficial.highchartsReactOfficialStrings.discardElement */ Any
          ] = js.undefined
      
      /**
        * Properties of the chart container
        */
      var containerProps: js.UndefOr[StringDictionary[Any]] = js.undefined
      
      /**
        * Highcharts namespace
        */
      var highcharts: js.UndefOr[TypeofHighcharts] = js.undefined
      
      /**
        * Immutably recreates the chart on receiving new props
        */
      var immutable: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Highcharts options
        */
      var options: js.UndefOr[Options] = js.undefined
      
      /**
        * Flags for `Chart.update` call: redraw, oneToOne, and animation. (Default:
        * [true, true, true])
        */
      var updateArgs: js.UndefOr[
            js.Array[Boolean] | (js.Tuple2[Boolean, Boolean]) | (js.Tuple3[Boolean, Boolean, Boolean])
          ] = js.undefined
    }
    object Props {
      
      inline def apply(): Props = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Props]
      }
      
      extension [Self <: Props](x: Self) {
        
        inline def setAllowChartUpdate(value: Boolean): Self = StObject.set(x, "allowChartUpdate", value.asInstanceOf[js.Any])
        
        inline def setAllowChartUpdateUndefined: Self = StObject.set(x, "allowChartUpdate", js.undefined)
        
        inline def setCallback(value: /* chart */ Chart_ => Callback): Self = StObject.set(x, "callback", js.Any.fromFunction1((t0: /* chart */ Chart_) => value(t0).runNow()))
        
        inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
        
        inline def setConstructorType(
          value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 86, starting with typingsJapgolly.highchartsReactOfficial.highchartsReactOfficialStrings.getMagnitude, typingsJapgolly.highchartsReactOfficial.highchartsReactOfficialStrings.attr, typingsJapgolly.highchartsReactOfficial.highchartsReactOfficialStrings.discardElement */ Any
        ): Self = StObject.set(x, "constructorType", value.asInstanceOf[js.Any])
        
        inline def setConstructorTypeUndefined: Self = StObject.set(x, "constructorType", js.undefined)
        
        inline def setContainerProps(value: StringDictionary[Any]): Self = StObject.set(x, "containerProps", value.asInstanceOf[js.Any])
        
        inline def setContainerPropsUndefined: Self = StObject.set(x, "containerProps", js.undefined)
        
        inline def setHighcharts(value: TypeofHighcharts): Self = StObject.set(x, "highcharts", value.asInstanceOf[js.Any])
        
        inline def setHighchartsUndefined: Self = StObject.set(x, "highcharts", js.undefined)
        
        inline def setImmutable(value: Boolean): Self = StObject.set(x, "immutable", value.asInstanceOf[js.Any])
        
        inline def setImmutableUndefined: Self = StObject.set(x, "immutable", js.undefined)
        
        inline def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
        
        inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
        
        inline def setUpdateArgs(value: js.Array[Boolean] | (js.Tuple2[Boolean, Boolean]) | (js.Tuple3[Boolean, Boolean, Boolean])): Self = StObject.set(x, "updateArgs", value.asInstanceOf[js.Any])
        
        inline def setUpdateArgsUndefined: Self = StObject.set(x, "updateArgs", js.undefined)
        
        inline def setUpdateArgsVarargs(value: Boolean*): Self = StObject.set(x, "updateArgs", js.Array(value*))
      }
    }
    
    /**
      * Properties for a HighchartsReact component
      */
    trait RefObject extends StObject {
      
      var chart: Chart_
      
      /**
        * React reference
        */
      var container: RefHandle[HTMLDivElement]
    }
    object RefObject {
      
      inline def apply(chart: Chart_, container: RefHandle[HTMLDivElement]): RefObject = {
        val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any])
        __obj.asInstanceOf[RefObject]
      }
      
      extension [Self <: RefObject](x: Self) {
        
        inline def setChart(value: Chart_): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
        
        inline def setContainer(value: RefHandle[HTMLDivElement]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      }
    }
  }
}
