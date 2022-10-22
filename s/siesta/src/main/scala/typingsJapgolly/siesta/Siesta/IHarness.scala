package typingsJapgolly.siesta.Siesta

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @abstract
  */
trait IHarness extends StObject {
  
  var alsoPreload: js.Array[Any]
  
  var autoCheckGlobals: Boolean
  
  var cachePreload: Boolean
  
  def configure(config: Any): Unit
  
  var defaultTimeout: Boolean
  
  var disableColoring: Boolean
  
  var expectedGlobals: js.Array[String]
  
  var isReadyTimeout: Double
  
  var keepNLastResults: Double
  
  var keepResults: Boolean
  
  var listenters: StringDictionary[js.Function2[/* event */ Event, /* repeated */ Any, Unit]]
  
  var maxThreads: Double
  
  var needDone: Boolean
  
  var overrideSetTimeout: Boolean
  
  var pauseBetweenTests: Double
  
  var preload: js.Array[Any]
  
  var runCore: String
  
  def start(descriptors: Any*): Unit
  
  var subTestTimeout: Double
  
  var testClass: ITest
  
  var title: String
  
  var transparentEx: Boolean
  
  var waitForTimeout: Double
}
object IHarness {
  
  inline def apply(
    alsoPreload: js.Array[Any],
    autoCheckGlobals: Boolean,
    cachePreload: Boolean,
    configure: Any => Callback,
    defaultTimeout: Boolean,
    disableColoring: Boolean,
    expectedGlobals: js.Array[String],
    isReadyTimeout: Double,
    keepNLastResults: Double,
    keepResults: Boolean,
    listenters: StringDictionary[js.Function2[/* event */ Event, /* repeated */ Any, Unit]],
    maxThreads: Double,
    needDone: Boolean,
    overrideSetTimeout: Boolean,
    pauseBetweenTests: Double,
    preload: js.Array[Any],
    runCore: String,
    start: /* repeated */ Any => Callback,
    subTestTimeout: Double,
    testClass: ITest,
    title: String,
    transparentEx: Boolean,
    waitForTimeout: Double
  ): IHarness = {
    val __obj = js.Dynamic.literal(alsoPreload = alsoPreload.asInstanceOf[js.Any], autoCheckGlobals = autoCheckGlobals.asInstanceOf[js.Any], cachePreload = cachePreload.asInstanceOf[js.Any], configure = js.Any.fromFunction1((t0: Any) => configure(t0).runNow()), defaultTimeout = defaultTimeout.asInstanceOf[js.Any], disableColoring = disableColoring.asInstanceOf[js.Any], expectedGlobals = expectedGlobals.asInstanceOf[js.Any], isReadyTimeout = isReadyTimeout.asInstanceOf[js.Any], keepNLastResults = keepNLastResults.asInstanceOf[js.Any], keepResults = keepResults.asInstanceOf[js.Any], listenters = listenters.asInstanceOf[js.Any], maxThreads = maxThreads.asInstanceOf[js.Any], needDone = needDone.asInstanceOf[js.Any], overrideSetTimeout = overrideSetTimeout.asInstanceOf[js.Any], pauseBetweenTests = pauseBetweenTests.asInstanceOf[js.Any], preload = preload.asInstanceOf[js.Any], runCore = runCore.asInstanceOf[js.Any], start = js.Any.fromFunction1((t0: /* repeated */ Any) => start(t0).runNow()), subTestTimeout = subTestTimeout.asInstanceOf[js.Any], testClass = testClass.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], transparentEx = transparentEx.asInstanceOf[js.Any], waitForTimeout = waitForTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHarness]
  }
  
  extension [Self <: IHarness](x: Self) {
    
    inline def setAlsoPreload(value: js.Array[Any]): Self = StObject.set(x, "alsoPreload", value.asInstanceOf[js.Any])
    
    inline def setAlsoPreloadVarargs(value: Any*): Self = StObject.set(x, "alsoPreload", js.Array(value*))
    
    inline def setAutoCheckGlobals(value: Boolean): Self = StObject.set(x, "autoCheckGlobals", value.asInstanceOf[js.Any])
    
    inline def setCachePreload(value: Boolean): Self = StObject.set(x, "cachePreload", value.asInstanceOf[js.Any])
    
    inline def setConfigure(value: Any => Callback): Self = StObject.set(x, "configure", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setDefaultTimeout(value: Boolean): Self = StObject.set(x, "defaultTimeout", value.asInstanceOf[js.Any])
    
    inline def setDisableColoring(value: Boolean): Self = StObject.set(x, "disableColoring", value.asInstanceOf[js.Any])
    
    inline def setExpectedGlobals(value: js.Array[String]): Self = StObject.set(x, "expectedGlobals", value.asInstanceOf[js.Any])
    
    inline def setExpectedGlobalsVarargs(value: String*): Self = StObject.set(x, "expectedGlobals", js.Array(value*))
    
    inline def setIsReadyTimeout(value: Double): Self = StObject.set(x, "isReadyTimeout", value.asInstanceOf[js.Any])
    
    inline def setKeepNLastResults(value: Double): Self = StObject.set(x, "keepNLastResults", value.asInstanceOf[js.Any])
    
    inline def setKeepResults(value: Boolean): Self = StObject.set(x, "keepResults", value.asInstanceOf[js.Any])
    
    inline def setListenters(value: StringDictionary[js.Function2[/* event */ Event, /* repeated */ Any, Unit]]): Self = StObject.set(x, "listenters", value.asInstanceOf[js.Any])
    
    inline def setMaxThreads(value: Double): Self = StObject.set(x, "maxThreads", value.asInstanceOf[js.Any])
    
    inline def setNeedDone(value: Boolean): Self = StObject.set(x, "needDone", value.asInstanceOf[js.Any])
    
    inline def setOverrideSetTimeout(value: Boolean): Self = StObject.set(x, "overrideSetTimeout", value.asInstanceOf[js.Any])
    
    inline def setPauseBetweenTests(value: Double): Self = StObject.set(x, "pauseBetweenTests", value.asInstanceOf[js.Any])
    
    inline def setPreload(value: js.Array[Any]): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
    
    inline def setPreloadVarargs(value: Any*): Self = StObject.set(x, "preload", js.Array(value*))
    
    inline def setRunCore(value: String): Self = StObject.set(x, "runCore", value.asInstanceOf[js.Any])
    
    inline def setStart(value: /* repeated */ Any => Callback): Self = StObject.set(x, "start", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
    
    inline def setSubTestTimeout(value: Double): Self = StObject.set(x, "subTestTimeout", value.asInstanceOf[js.Any])
    
    inline def setTestClass(value: ITest): Self = StObject.set(x, "testClass", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTransparentEx(value: Boolean): Self = StObject.set(x, "transparentEx", value.asInstanceOf[js.Any])
    
    inline def setWaitForTimeout(value: Double): Self = StObject.set(x, "waitForTimeout", value.asInstanceOf[js.Any])
  }
}
