package typingsJapgolly.rcTable

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libContextPerfContextMod extends Shortcut {
  
  @JSImport("rc-table/lib/context/PerfContext", JSImport.Default)
  @js.native
  val default: Context[PerfRecord] = js.native
  
  trait PerfRecord extends StObject {
    
    var renderWithProps: Boolean
  }
  object PerfRecord {
    
    inline def apply(renderWithProps: Boolean): PerfRecord = {
      val __obj = js.Dynamic.literal(renderWithProps = renderWithProps.asInstanceOf[js.Any])
      __obj.asInstanceOf[PerfRecord]
    }
    
    extension [Self <: PerfRecord](x: Self) {
      
      inline def setRenderWithProps(value: Boolean): Self = StObject.set(x, "renderWithProps", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Context[PerfRecord]
  
  /* This means you don't have to write `default`, but can instead just say `libContextPerfContextMod.foo` */
  override def _to: Context[PerfRecord] = default
}
