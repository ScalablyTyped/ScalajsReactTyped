package typingsJapgolly.firebasePerformance

import org.scalajs.dom.Document
import org.scalajs.dom.Navigator
import org.scalajs.dom.PerformanceEntry
import org.scalajs.dom.Storage
import typingsJapgolly.firebasePerformance.anon.OnFirstInputDelay
import typingsJapgolly.firebasePerformance.anon.TypeofPerformanceObserver
import typingsJapgolly.firebasePerformance.distSrcServicesApiServiceMod.global.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcServicesApiServiceMod {
  
  @JSImport("@firebase/performance/dist/src/services/api_service", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/performance/dist/src/services/api_service", "Api")
  @js.native
  open class Api () extends StObject {
    def this(window: Window) = this()
    
    /** PreformanceObserver constructor function. */
    /* private */ val PerformanceObserver: Any = js.native
    
    val document: Document = js.native
    
    def getEntriesByName(name: String): js.Array[PerformanceEntry] = js.native
    
    def getEntriesByType(`type`: EntryType): js.Array[PerformanceEntry] = js.native
    
    def getTimeOrigin(): Double = js.native
    
    def getUrl(): String = js.native
    
    val localStorage: js.UndefOr[Storage] = js.native
    
    def mark(name: String): Unit = js.native
    
    def measure(measureName: String, mark1: String, mark2: String): Unit = js.native
    
    val navigator: Navigator = js.native
    
    val onFirstInputDelay: js.UndefOr[js.Function1[/* fn */ js.Function1[/* fid */ Double, Unit], Unit]] = js.native
    
    /* private */ val performance: Any = js.native
    
    def requiredApisAvailable(): Boolean = js.native
    
    def setupObserver(entryType: EntryType, callback: js.Function1[/* entry */ PerformanceEntry, Unit]): Unit = js.native
    
    val window: js.UndefOr[Window] = js.native
    
    /* private */ val windowLocation: Any = js.native
  }
  /* static members */
  object Api {
    
    @JSImport("@firebase/performance/dist/src/services/api_service", "Api")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getInstance(): Api = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[Api]
  }
  
  inline def setupApi(window: Window): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setupApi")(window.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.firebasePerformance.firebasePerformanceStrings.mark
    - typingsJapgolly.firebasePerformance.firebasePerformanceStrings.measure
    - typingsJapgolly.firebasePerformance.firebasePerformanceStrings.paint
    - typingsJapgolly.firebasePerformance.firebasePerformanceStrings.resource
    - typingsJapgolly.firebasePerformance.firebasePerformanceStrings.frame
    - typingsJapgolly.firebasePerformance.firebasePerformanceStrings.navigation
  */
  trait EntryType extends StObject
  object EntryType {
    
    inline def frame: typingsJapgolly.firebasePerformance.firebasePerformanceStrings.frame = "frame".asInstanceOf[typingsJapgolly.firebasePerformance.firebasePerformanceStrings.frame]
    
    inline def mark: typingsJapgolly.firebasePerformance.firebasePerformanceStrings.mark = "mark".asInstanceOf[typingsJapgolly.firebasePerformance.firebasePerformanceStrings.mark]
    
    inline def measure: typingsJapgolly.firebasePerformance.firebasePerformanceStrings.measure = "measure".asInstanceOf[typingsJapgolly.firebasePerformance.firebasePerformanceStrings.measure]
    
    inline def navigation: typingsJapgolly.firebasePerformance.firebasePerformanceStrings.navigation = "navigation".asInstanceOf[typingsJapgolly.firebasePerformance.firebasePerformanceStrings.navigation]
    
    inline def paint: typingsJapgolly.firebasePerformance.firebasePerformanceStrings.paint = "paint".asInstanceOf[typingsJapgolly.firebasePerformance.firebasePerformanceStrings.paint]
    
    inline def resource: typingsJapgolly.firebasePerformance.firebasePerformanceStrings.resource = "resource".asInstanceOf[typingsJapgolly.firebasePerformance.firebasePerformanceStrings.resource]
  }
  
  object global {
    
    trait Window extends StObject {
      
      var PerformanceObserver: TypeofPerformanceObserver
      
      var perfMetrics: js.UndefOr[OnFirstInputDelay] = js.undefined
    }
    object Window {
      
      inline def apply(PerformanceObserver: TypeofPerformanceObserver): Window = {
        val __obj = js.Dynamic.literal(PerformanceObserver = PerformanceObserver.asInstanceOf[js.Any])
        __obj.asInstanceOf[Window]
      }
      
      extension [Self <: Window](x: Self) {
        
        inline def setPerfMetrics(value: OnFirstInputDelay): Self = StObject.set(x, "perfMetrics", value.asInstanceOf[js.Any])
        
        inline def setPerfMetricsUndefined: Self = StObject.set(x, "perfMetrics", js.undefined)
        
        inline def setPerformanceObserver(value: TypeofPerformanceObserver): Self = StObject.set(x, "PerformanceObserver", value.asInstanceOf[js.Any])
      }
    }
  }
}
