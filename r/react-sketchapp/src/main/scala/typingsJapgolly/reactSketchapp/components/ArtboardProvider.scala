package typingsJapgolly.reactSketchapp.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactSketchapp.libContextMod.ArtboardProps
import typingsJapgolly.reactSketchapp.libStylesheetTypesMod.Style
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ArtboardProvider {
  
  inline def apply(children: Any): Builder = {
    val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ArtboardProps]))
  }
  
  @JSImport("react-sketchapp/lib/context", "ArtboardProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def style(value: Style): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ArtboardProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
