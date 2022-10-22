package typingsJapgolly.antDesignPro.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.bizcharts.libComponentsEffectsMod.IEffectsProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for typingsJapgolly.bizcharts.libComponentsEffectsMod.IEffectsProps because: IArray(Could't extract props from scala.Any because couldn't resolve ClassTree.) */
object Effects {
  
  def apply(p: IEffectsProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("ant-design-pro/lib/Charts/bizcharts", "Effects")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Effects.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
}
