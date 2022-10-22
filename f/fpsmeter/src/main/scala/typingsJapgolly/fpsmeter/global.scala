package typingsJapgolly.fpsmeter

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("FPSMeter")
  @js.native
  open class FPSMeter ()
    extends StObject
       with typingsJapgolly.fpsmeter.FPSMeter {
    def this(anchor: HTMLElement) = this()
    def this(anchor: HTMLElement, options: FPSMeterOptions) = this()
    def this(anchor: Unit, options: FPSMeterOptions) = this()
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def hide(): typingsJapgolly.fpsmeter.FPSMeter = js.native
    
    /* CompleteClass */
    var options: FPSMeterOptions = js.native
    
    /* CompleteClass */
    override def pause(): typingsJapgolly.fpsmeter.FPSMeter = js.native
    
    /* CompleteClass */
    override def resume(): typingsJapgolly.fpsmeter.FPSMeter = js.native
    
    /* CompleteClass */
    override def set(name: String, value: Any): typingsJapgolly.fpsmeter.FPSMeter = js.native
    
    /* CompleteClass */
    override def show(): typingsJapgolly.fpsmeter.FPSMeter = js.native
    
    /* CompleteClass */
    override def showDuration(): typingsJapgolly.fpsmeter.FPSMeter = js.native
    
    /* CompleteClass */
    override def showFps(): typingsJapgolly.fpsmeter.FPSMeter = js.native
    
    /* CompleteClass */
    override def tick(): Unit = js.native
    
    /* CompleteClass */
    override def tickStart(): Unit = js.native
    
    /* CompleteClass */
    override def toggle(): typingsJapgolly.fpsmeter.FPSMeter = js.native
  }
}
