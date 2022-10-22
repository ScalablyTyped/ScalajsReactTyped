package typingsJapgolly.victoryArea.components

import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.victoryArea.esAreaMod.AreaProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Area {
  
  @JSImport("victory-area/es", "Area")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def groupComponent(value: VdomElement): this.type = set("groupComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def horizontal(
      value: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryCommonThemeProps * / any['horizontal'] */ js.Any
    ): this.type = set("horizontal", value.asInstanceOf[js.Any])
    
    inline def interpolation(value: String | js.Function): this.type = set("interpolation", value.asInstanceOf[js.Any])
    
    inline def pathComponent(value: VdomElement): this.type = set("pathComponent", value.rawElement.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Area.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: AreaProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
