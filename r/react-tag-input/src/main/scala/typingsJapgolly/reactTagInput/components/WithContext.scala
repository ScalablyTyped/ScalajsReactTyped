package typingsJapgolly.reactTagInput.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactTagInput.anon.Id
import typingsJapgolly.reactTagInput.mod.ReactTagsProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WithContext {
  
  inline def apply(handleAddition: Id => Callback, handleDelete: Double => Callback): SharedBuilder_ReactTagsProps1929081976[typingsJapgolly.reactTagInput.mod.WithContext] = {
    val __props = js.Dynamic.literal(handleAddition = js.Any.fromFunction1((t0: Id) => handleAddition(t0).runNow()), handleDelete = js.Any.fromFunction1((t0: Double) => handleDelete(t0).runNow()))
    new SharedBuilder_ReactTagsProps1929081976[typingsJapgolly.reactTagInput.mod.WithContext](js.Array(this.component, __props.asInstanceOf[ReactTagsProps]))
  }
  
  @JSImport("react-tag-input", "WithContext")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ReactTagsProps): SharedBuilder_ReactTagsProps1929081976[typingsJapgolly.reactTagInput.mod.WithContext] = new SharedBuilder_ReactTagsProps1929081976[typingsJapgolly.reactTagInput.mod.WithContext](js.Array(this.component, p.asInstanceOf[js.Any]))
}
