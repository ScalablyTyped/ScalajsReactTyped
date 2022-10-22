package typingsJapgolly.fbt.components

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.fbt.mod.FbtEnumProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FbtEnum {
  
  inline def apply(`enum-range`: js.Array[String] | StringDictionary[String], value: String): Default[js.Object] = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __props.updateDynamic("enum-range")(`enum-range`.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[FbtEnumProps]))
  }
  
  @JSImport("fbt", "FbtEnum")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: FbtEnumProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
