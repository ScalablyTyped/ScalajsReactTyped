package typingsJapgolly.vegaTypings

import typingsJapgolly.vegaTypings.typesSpecAxisMod.Axis
import typingsJapgolly.vegaTypings.typesSpecDataMod.Data
import typingsJapgolly.vegaTypings.typesSpecLayoutMod.Layout
import typingsJapgolly.vegaTypings.typesSpecLegendMod.Legend
import typingsJapgolly.vegaTypings.typesSpecMarkMod.Mark
import typingsJapgolly.vegaTypings.typesSpecProjectionMod.Projection
import typingsJapgolly.vegaTypings.typesSpecScaleMod.Scale
import typingsJapgolly.vegaTypings.typesSpecSignalMod.Signal
import typingsJapgolly.vegaTypings.typesSpecTitleMod.Title
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSpecScopeMod {
  
  trait Scope extends StObject {
    
    var axes: js.UndefOr[js.Array[Axis]] = js.undefined
    
    var data: js.UndefOr[js.Array[Data]] = js.undefined
    
    var layout: js.UndefOr[Layout] = js.undefined
    
    var legends: js.UndefOr[js.Array[Legend]] = js.undefined
    
    var marks: js.UndefOr[js.Array[Mark]] = js.undefined
    
    var projections: js.UndefOr[js.Array[Projection]] = js.undefined
    
    var scales: js.UndefOr[js.Array[Scale]] = js.undefined
    
    var signals: js.UndefOr[js.Array[Signal]] = js.undefined
    
    var title: js.UndefOr[String | Title] = js.undefined
    
    var usermeta: js.UndefOr[js.Object] = js.undefined
  }
  object Scope {
    
    inline def apply(): Scope = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Scope]
    }
    
    extension [Self <: Scope](x: Self) {
      
      inline def setAxes(value: js.Array[Axis]): Self = StObject.set(x, "axes", value.asInstanceOf[js.Any])
      
      inline def setAxesUndefined: Self = StObject.set(x, "axes", js.undefined)
      
      inline def setAxesVarargs(value: Axis*): Self = StObject.set(x, "axes", js.Array(value*))
      
      inline def setData(value: js.Array[Data]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDataVarargs(value: Data*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setLayout(value: Layout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      inline def setLegends(value: js.Array[Legend]): Self = StObject.set(x, "legends", value.asInstanceOf[js.Any])
      
      inline def setLegendsUndefined: Self = StObject.set(x, "legends", js.undefined)
      
      inline def setLegendsVarargs(value: Legend*): Self = StObject.set(x, "legends", js.Array(value*))
      
      inline def setMarks(value: js.Array[Mark]): Self = StObject.set(x, "marks", value.asInstanceOf[js.Any])
      
      inline def setMarksUndefined: Self = StObject.set(x, "marks", js.undefined)
      
      inline def setMarksVarargs(value: Mark*): Self = StObject.set(x, "marks", js.Array(value*))
      
      inline def setProjections(value: js.Array[Projection]): Self = StObject.set(x, "projections", value.asInstanceOf[js.Any])
      
      inline def setProjectionsUndefined: Self = StObject.set(x, "projections", js.undefined)
      
      inline def setProjectionsVarargs(value: Projection*): Self = StObject.set(x, "projections", js.Array(value*))
      
      inline def setScales(value: js.Array[Scale]): Self = StObject.set(x, "scales", value.asInstanceOf[js.Any])
      
      inline def setScalesUndefined: Self = StObject.set(x, "scales", js.undefined)
      
      inline def setScalesVarargs(value: Scale*): Self = StObject.set(x, "scales", js.Array(value*))
      
      inline def setSignals(value: js.Array[Signal]): Self = StObject.set(x, "signals", value.asInstanceOf[js.Any])
      
      inline def setSignalsUndefined: Self = StObject.set(x, "signals", js.undefined)
      
      inline def setSignalsVarargs(value: Signal*): Self = StObject.set(x, "signals", js.Array(value*))
      
      inline def setTitle(value: String | Title): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setUsermeta(value: js.Object): Self = StObject.set(x, "usermeta", value.asInstanceOf[js.Any])
      
      inline def setUsermetaUndefined: Self = StObject.set(x, "usermeta", js.undefined)
    }
  }
}
