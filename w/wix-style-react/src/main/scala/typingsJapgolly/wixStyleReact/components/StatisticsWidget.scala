package typingsJapgolly.wixStyleReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesStatisticsWidgetMod.StatisticsWidgetItem
import typingsJapgolly.wixStyleReact.distTypesStatisticsWidgetMod.StatisticsWidgetProps
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.center
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.end
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.large
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.start
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.tiny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StatisticsWidget {
  
  @JSImport("wix-style-react", "StatisticsWidget")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.StatisticsWidget] {
    
    inline def alignItems(value: center | start | end): this.type = set("alignItems", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def isLoading(value: Boolean): this.type = set("isLoading", value.asInstanceOf[js.Any])
    
    inline def items(value: js.Array[StatisticsWidgetItem]): this.type = set("items", value.asInstanceOf[js.Any])
    
    inline def itemsVarargs(value: StatisticsWidgetItem*): this.type = set("items", js.Array(value*))
    
    inline def size(value: large | tiny): this.type = set("size", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: StatisticsWidget.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: StatisticsWidgetProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
