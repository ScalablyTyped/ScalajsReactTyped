package typingsJapgolly.reactComponentBenchmark.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactComponentBenchmark.mod.BenchResultsType
import typingsJapgolly.reactComponentBenchmark.mod.BenchmarkProps
import typingsJapgolly.reactComponentBenchmark.mod.BenchmarkRef
import typingsJapgolly.reactComponentBenchmark.reactComponentBenchmarkStrings.mount
import typingsJapgolly.reactComponentBenchmark.reactComponentBenchmarkStrings.unmount
import typingsJapgolly.reactComponentBenchmark.reactComponentBenchmarkStrings.update
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactComponentBenchmark {
  
  inline def apply(component: ComponentType[Any], onComplete: BenchResultsType => Callback, samples: Double): Builder = {
    val __props = js.Dynamic.literal(component = component.asInstanceOf[js.Any], onComplete = js.Any.fromFunction1((t0: BenchResultsType) => onComplete(t0).runNow()), samples = samples.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[BenchmarkProps & RefAttributes[BenchmarkRef]]))
  }
  
  @JSImport("react-component-benchmark", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[BenchmarkRef] {
    
    inline def componentProps(value: Record[String, Any]): this.type = set("componentProps", value.asInstanceOf[js.Any])
    
    inline def includeLayout(value: Boolean): this.type = set("includeLayout", value.asInstanceOf[js.Any])
    
    inline def timeout(value: Double): this.type = set("timeout", value.asInstanceOf[js.Any])
    
    inline def `type`(value: mount | update | unmount): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: BenchmarkProps & RefAttributes[BenchmarkRef]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
