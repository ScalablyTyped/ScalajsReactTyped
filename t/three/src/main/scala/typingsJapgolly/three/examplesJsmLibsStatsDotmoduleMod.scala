package typingsJapgolly.three

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLCanvasElement
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.three.examplesJsmLibsStatsDotmoduleMod.Stats.Panel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmLibsStatsDotmoduleMod {
  
  object default {
    
    inline def apply(): Stats = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Stats]
    
    @JSImport("three/examples/jsm/libs/stats.module", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def Panel(): typingsJapgolly.three.examplesJsmLibsStatsDotmoduleMod.Stats.Panel = ^.asInstanceOf[js.Dynamic].applyDynamic("Panel")().asInstanceOf[typingsJapgolly.three.examplesJsmLibsStatsDotmoduleMod.Stats.Panel]
    inline def Panel(name: String): typingsJapgolly.three.examplesJsmLibsStatsDotmoduleMod.Stats.Panel = ^.asInstanceOf[js.Dynamic].applyDynamic("Panel")(name.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.three.examplesJsmLibsStatsDotmoduleMod.Stats.Panel]
    inline def Panel(name: String, fg: String): typingsJapgolly.three.examplesJsmLibsStatsDotmoduleMod.Stats.Panel = (^.asInstanceOf[js.Dynamic].applyDynamic("Panel")(name.asInstanceOf[js.Any], fg.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.three.examplesJsmLibsStatsDotmoduleMod.Stats.Panel]
    inline def Panel(name: String, fg: String, bg: String): typingsJapgolly.three.examplesJsmLibsStatsDotmoduleMod.Stats.Panel = (^.asInstanceOf[js.Dynamic].applyDynamic("Panel")(name.asInstanceOf[js.Any], fg.asInstanceOf[js.Any], bg.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.three.examplesJsmLibsStatsDotmoduleMod.Stats.Panel]
    inline def Panel(name: String, fg: Unit, bg: String): typingsJapgolly.three.examplesJsmLibsStatsDotmoduleMod.Stats.Panel = (^.asInstanceOf[js.Dynamic].applyDynamic("Panel")(name.asInstanceOf[js.Any], fg.asInstanceOf[js.Any], bg.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.three.examplesJsmLibsStatsDotmoduleMod.Stats.Panel]
    inline def Panel(name: Unit, fg: String): typingsJapgolly.three.examplesJsmLibsStatsDotmoduleMod.Stats.Panel = (^.asInstanceOf[js.Dynamic].applyDynamic("Panel")(name.asInstanceOf[js.Any], fg.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.three.examplesJsmLibsStatsDotmoduleMod.Stats.Panel]
    inline def Panel(name: Unit, fg: String, bg: String): typingsJapgolly.three.examplesJsmLibsStatsDotmoduleMod.Stats.Panel = (^.asInstanceOf[js.Dynamic].applyDynamic("Panel")(name.asInstanceOf[js.Any], fg.asInstanceOf[js.Any], bg.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.three.examplesJsmLibsStatsDotmoduleMod.Stats.Panel]
    inline def Panel(name: Unit, fg: Unit, bg: String): typingsJapgolly.three.examplesJsmLibsStatsDotmoduleMod.Stats.Panel = (^.asInstanceOf[js.Dynamic].applyDynamic("Panel")(name.asInstanceOf[js.Any], fg.asInstanceOf[js.Any], bg.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.three.examplesJsmLibsStatsDotmoduleMod.Stats.Panel]
  }
  
  trait Stats extends StObject {
    
    var REVISION: Double
    
    def addPanel(panel: Panel): Panel
    
    def begin(): Unit
    
    var dom: HTMLDivElement
    
    var domElement: HTMLDivElement
    
    def end(): Double
    
    def setMode(id: Double): Unit
    
    def showPanel(id: Double): Unit
    
    def update(): Unit
  }
  object Stats {
    
    inline def apply(
      REVISION: Double,
      addPanel: Panel => Panel,
      begin: Callback,
      dom: HTMLDivElement,
      domElement: HTMLDivElement,
      end: CallbackTo[Double],
      setMode: Double => Callback,
      showPanel: Double => Callback,
      update: Callback
    ): Stats = {
      val __obj = js.Dynamic.literal(REVISION = REVISION.asInstanceOf[js.Any], addPanel = js.Any.fromFunction1(addPanel), begin = begin.toJsFn, dom = dom.asInstanceOf[js.Any], domElement = domElement.asInstanceOf[js.Any], end = end.toJsFn, setMode = js.Any.fromFunction1((t0: Double) => setMode(t0).runNow()), showPanel = js.Any.fromFunction1((t0: Double) => showPanel(t0).runNow()), update = update.toJsFn)
      __obj.asInstanceOf[Stats]
    }
    
    trait Panel extends StObject {
      
      var dom: HTMLCanvasElement
      
      def update(value: Double, maxValue: Double): Unit
    }
    object Panel {
      
      inline def apply(dom: HTMLCanvasElement, update: (Double, Double) => Callback): Panel = {
        val __obj = js.Dynamic.literal(dom = dom.asInstanceOf[js.Any], update = js.Any.fromFunction2((t0: Double, t1: Double) => (update(t0, t1)).runNow()))
        __obj.asInstanceOf[Panel]
      }
      
      extension [Self <: Panel](x: Self) {
        
        inline def setDom(value: HTMLCanvasElement): Self = StObject.set(x, "dom", value.asInstanceOf[js.Any])
        
        inline def setUpdate(value: (Double, Double) => Callback): Self = StObject.set(x, "update", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
      }
    }
    
    extension [Self <: Stats](x: Self) {
      
      inline def setAddPanel(value: Panel => Panel): Self = StObject.set(x, "addPanel", js.Any.fromFunction1(value))
      
      inline def setBegin(value: Callback): Self = StObject.set(x, "begin", value.toJsFn)
      
      inline def setDom(value: HTMLDivElement): Self = StObject.set(x, "dom", value.asInstanceOf[js.Any])
      
      inline def setDomElement(value: HTMLDivElement): Self = StObject.set(x, "domElement", value.asInstanceOf[js.Any])
      
      inline def setEnd(value: CallbackTo[Double]): Self = StObject.set(x, "end", value.toJsFn)
      
      inline def setREVISION(value: Double): Self = StObject.set(x, "REVISION", value.asInstanceOf[js.Any])
      
      inline def setSetMode(value: Double => Callback): Self = StObject.set(x, "setMode", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setShowPanel(value: Double => Callback): Self = StObject.set(x, "showPanel", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setUpdate(value: Callback): Self = StObject.set(x, "update", value.toJsFn)
    }
  }
}
