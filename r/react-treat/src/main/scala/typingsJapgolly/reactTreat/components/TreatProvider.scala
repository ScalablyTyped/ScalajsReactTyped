package typingsJapgolly.reactTreat.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactTreat.distDeclarationsSrcMod.TreatProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TreatProvider {
  
  inline def apply(
    theme: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeRef */ Any
  ): Default[js.Object] = {
    val __props = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[TreatProviderProps]))
  }
  
  @JSImport("react-treat/dist/react-treat.cjs", "TreatProvider")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: TreatProviderProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
