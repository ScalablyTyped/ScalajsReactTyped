package typingsJapgolly.wixStyleReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesFeatureListMod.FeatureListProps
import typingsJapgolly.wixStyleReact.distTypesFeatureListMod.FeatureType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FeatureList {
  
  @JSImport("wix-style-react", "FeatureList")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.FeatureList] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def cols(value: Double): this.type = set("cols", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def features(value: js.Array[FeatureType]): this.type = set("features", value.asInstanceOf[js.Any])
    
    inline def featuresVarargs(value: FeatureType*): this.type = set("features", js.Array(value*))
  }
  
  implicit def make(companion: FeatureList.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: FeatureListProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
