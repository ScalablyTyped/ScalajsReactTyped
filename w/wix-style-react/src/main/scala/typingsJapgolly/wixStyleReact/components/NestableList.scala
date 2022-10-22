package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.anon.ItemItems
import typingsJapgolly.wixStyleReact.distTypesNestableListMod.Action
import typingsJapgolly.wixStyleReact.distTypesNestableListMod.NestableListItem
import typingsJapgolly.wixStyleReact.distTypesNestableListMod.NestableListProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NestableList {
  
  inline def apply(items: js.Array[NestableListItem]): Builder = {
    val __props = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[NestableListProps]))
  }
  
  @JSImport("wix-style-react", "NestableList")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.NestableList] {
    
    inline def actions(value: js.Array[Action]): this.type = set("actions", value.asInstanceOf[js.Any])
    
    inline def actionsVarargs(value: Action*): this.type = set("actions", js.Array(value*))
    
    inline def addItemLabel(value: String): this.type = set("addItemLabel", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def maxDepth(value: Double): this.type = set("maxDepth", value.asInstanceOf[js.Any])
    
    inline def onAddItem(value: /* item */ NestableListItem => Callback): this.type = set("onAddItem", js.Any.fromFunction1((t0: /* item */ NestableListItem) => value(t0).runNow()))
    
    inline def onChange(value: /* data */ ItemItems => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* data */ ItemItems) => value(t0).runNow()))
    
    inline def preventChangeDepth(value: Boolean): this.type = set("preventChangeDepth", value.asInstanceOf[js.Any])
    
    inline def readOnly(value: Boolean): this.type = set("readOnly", value.asInstanceOf[js.Any])
    
    inline def withBottomBorder(value: Boolean): this.type = set("withBottomBorder", value.asInstanceOf[js.Any])
    
    inline def zIndex(value: Double): this.type = set("zIndex", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: NestableListProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
