package typingsJapgolly.progressbar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("progressbar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("progressbar", "Progressbar")
  @js.native
  open class Progressbar () extends StObject {
    
    def addTick(): this.type = js.native
    def addTick(steps: Double): this.type = js.native
    
    def addTotal(): this.type = js.native
    def addTotal(total: Double): this.type = js.native
    
    def finish(): this.type = js.native
    def finish(next: js.Function0[Unit]): this.type = js.native
    
    def getStep(): String = js.native
    
    def getTick(): Double = js.native
    
    def getTotal(): Double = js.native
    
    def setStep(steps: String): this.type = js.native
    
    def setTick(ticks: Double): this.type = js.native
    
    def setTotal(total: Double): this.type = js.native
    
    def step(step: String): this.type = js.native
    
    def tick(): this.type = js.native
    def tick(steps: Double): this.type = js.native
    
    def total(total: Double): this.type = js.native
  }
  
  inline def create(): Progressbar = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Progressbar]
}
