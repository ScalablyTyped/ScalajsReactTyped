package typingsJapgolly.reactCountup.components

import typingsJapgolly.reactCountup.buildCountUpMod.CountUpProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CountUp {
  
  inline def apply(end: Double): SharedBuilder_CountUpProps_1889893989 = {
    val __props = js.Dynamic.literal(end = end.asInstanceOf[js.Any])
    new SharedBuilder_CountUpProps_1889893989(js.Array(this.component, __props.asInstanceOf[CountUpProps]))
  }
  
  @JSImport("react-countup/build/CountUp", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: CountUpProps): SharedBuilder_CountUpProps_1889893989 = new SharedBuilder_CountUpProps_1889893989(js.Array(this.component, p.asInstanceOf[js.Any]))
}
