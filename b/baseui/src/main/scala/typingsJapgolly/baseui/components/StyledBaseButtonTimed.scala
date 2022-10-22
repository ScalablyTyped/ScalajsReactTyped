package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.baseui.anon.initialTimenumbertimeElap
import typingsJapgolly.styletronReact.anon.As
import typingsJapgolly.styletronReact.libTypesMod.OverrideProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StyledBaseButtonTimed {
  
  inline def apply[C /* <: ElementType */]($initialTime: Double, $timeElapsed: Double): SharedBuilder_AsOverrideProps32780377[C] = {
    val __props = js.Dynamic.literal($initialTime = $initialTime.asInstanceOf[js.Any], $timeElapsed = $timeElapsed.asInstanceOf[js.Any])
    new SharedBuilder_AsOverrideProps32780377[C](js.Array(this.component, __props.asInstanceOf[As[C] & (OverrideProps[C, initialTimenumbertimeElap])]))
  }
  
  @JSImport("baseui/button-timed", "StyledBaseButtonTimed")
  @js.native
  val component: js.Object = js.native
  
  def withProps[C /* <: ElementType */](p: As[C] & (OverrideProps[C, initialTimenumbertimeElap])): SharedBuilder_AsOverrideProps32780377[C] = new SharedBuilder_AsOverrideProps32780377[C](js.Array(this.component, p.asInstanceOf[js.Any]))
}
