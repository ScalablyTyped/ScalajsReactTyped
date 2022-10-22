package typingsJapgolly.reactInstantsearchDom.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.reactInstantsearchDom.anon.ButtonTextComponent
import typingsJapgolly.reactInstantsearchDom.mod.RelevantSortComponentProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RelevantSort {
  
  @JSImport("react-instantsearch-dom", "RelevantSort")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactInstantsearchDom.mod.RelevantSort] {
    
    inline def buttonTextComponent(value: FunctionComponent[RelevantSortComponentProps]): this.type = set("buttonTextComponent", value.asInstanceOf[js.Any])
    
    inline def textComponent(value: FunctionComponent[RelevantSortComponentProps]): this.type = set("textComponent", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: RelevantSort.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ButtonTextComponent): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
