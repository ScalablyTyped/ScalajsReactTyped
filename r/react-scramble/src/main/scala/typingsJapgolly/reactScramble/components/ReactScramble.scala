package typingsJapgolly.reactScramble.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactScramble.mod.AnimationControls
import typingsJapgolly.reactScramble.mod.Props
import typingsJapgolly.reactScramble.mod.Step
import typingsJapgolly.reactScramble.reactScrambleStrings.fast
import typingsJapgolly.reactScramble.reactScrambleStrings.medium
import typingsJapgolly.reactScramble.reactScrambleStrings.pause
import typingsJapgolly.reactScramble.reactScrambleStrings.reset
import typingsJapgolly.reactScramble.reactScrambleStrings.restart
import typingsJapgolly.reactScramble.reactScrambleStrings.slow
import typingsJapgolly.reactScramble.reactScrambleStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactScramble {
  
  inline def apply(steps: js.Array[Step], text: String): Builder = {
    val __props = js.Dynamic.literal(steps = steps.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("react-scramble", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def autoStart(value: Boolean): this.type = set("autoStart", value.asInstanceOf[js.Any])
    
    inline def bindMethod(value: /* c */ AnimationControls => Callback): this.type = set("bindMethod", js.Any.fromFunction1((t0: /* c */ AnimationControls) => value(t0).runNow()))
    
    inline def mouseEnterTrigger(value: start | pause | reset | restart): this.type = set("mouseEnterTrigger", value.asInstanceOf[js.Any])
    
    inline def mouseLeaveTrigger(value: start | pause | reset | restart): this.type = set("mouseLeaveTrigger", value.asInstanceOf[js.Any])
    
    inline def noBreakSpace(value: Boolean): this.type = set("noBreakSpace", value.asInstanceOf[js.Any])
    
    inline def preScramble(value: Boolean): this.type = set("preScramble", value.asInstanceOf[js.Any])
    
    inline def speed(value: slow | medium | fast): this.type = set("speed", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
