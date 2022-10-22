package typingsJapgolly.mochaPhantomjs

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MochaPhantomJS extends StObject {
  
  var columns: Double
  
  def customizeMocha(options: MochaPhantomJSOptions): Unit
  
  var mochaStartWait: Double
  
  var output: Any
  
  def run(): Unit
  
  var startTime: js.Date
  
  var url: String
}
object MochaPhantomJS {
  
  inline def apply(
    columns: Double,
    customizeMocha: MochaPhantomJSOptions => Callback,
    mochaStartWait: Double,
    output: Any,
    run: Callback,
    startTime: js.Date,
    url: String
  ): MochaPhantomJS = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], customizeMocha = js.Any.fromFunction1((t0: MochaPhantomJSOptions) => customizeMocha(t0).runNow()), mochaStartWait = mochaStartWait.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], run = run.toJsFn, startTime = startTime.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[MochaPhantomJS]
  }
  
  extension [Self <: MochaPhantomJS](x: Self) {
    
    inline def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setCustomizeMocha(value: MochaPhantomJSOptions => Callback): Self = StObject.set(x, "customizeMocha", js.Any.fromFunction1((t0: MochaPhantomJSOptions) => value(t0).runNow()))
    
    inline def setMochaStartWait(value: Double): Self = StObject.set(x, "mochaStartWait", value.asInstanceOf[js.Any])
    
    inline def setOutput(value: Any): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setRun(value: Callback): Self = StObject.set(x, "run", value.toJsFn)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
