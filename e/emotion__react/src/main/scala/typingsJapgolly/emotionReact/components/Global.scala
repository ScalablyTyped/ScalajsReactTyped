package typingsJapgolly.emotionReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.emotionReact.mod.GlobalProps
import typingsJapgolly.emotionReact.mod.Theme
import typingsJapgolly.emotionSerialize.mod.Interpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Global {
  
  @JSImport("@emotion/react", "Global")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def styles(value: Interpolation[Theme]): this.type = set("styles", value.asInstanceOf[js.Any])
    
    inline def stylesNull: this.type = set("styles", null)
  }
  
  implicit def make(companion: Global.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: GlobalProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
