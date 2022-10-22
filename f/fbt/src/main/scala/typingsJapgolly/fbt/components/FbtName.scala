package typingsJapgolly.fbt.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.fbt.mod.FbtNameProps
import typingsJapgolly.fbt.mod.IntlVariationsGender
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FbtName {
  
  inline def apply(gender: IntlVariationsGender, name: String): Default[js.Object] = {
    val __props = js.Dynamic.literal(gender = gender.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[FbtNameProps]))
  }
  
  @JSImport("fbt", "FbtName")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: FbtNameProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
