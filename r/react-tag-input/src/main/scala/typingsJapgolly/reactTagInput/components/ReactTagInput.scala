package typingsJapgolly.reactTagInput.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactTagInput.anon.Id
import typingsJapgolly.reactTagInput.mod.ReactTagsProps
import typingsJapgolly.reactTagInput.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactTagInput {
  
  inline def apply(handleAddition: Id => Callback, handleDelete: Double => Callback): SharedBuilder_ReactTagsProps1929081976[default] = {
    val __props = js.Dynamic.literal(handleAddition = js.Any.fromFunction1((t0: Id) => handleAddition(t0).runNow()), handleDelete = js.Any.fromFunction1((t0: Double) => handleDelete(t0).runNow()))
    new SharedBuilder_ReactTagsProps1929081976[default](js.Array(this.component, __props.asInstanceOf[ReactTagsProps]))
  }
  
  @JSImport("react-tag-input", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ReactTagsProps): SharedBuilder_ReactTagsProps1929081976[default] = new SharedBuilder_ReactTagsProps1929081976[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
