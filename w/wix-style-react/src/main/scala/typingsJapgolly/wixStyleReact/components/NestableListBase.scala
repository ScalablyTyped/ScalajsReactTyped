package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.wixStyleReact.anon.ItemObject
import typingsJapgolly.wixStyleReact.distTypesNestableListBaseMod.IRenderData
import typingsJapgolly.wixStyleReact.distTypesNestableListBaseMod.NestableItemProps
import typingsJapgolly.wixStyleReact.distTypesNestableListBaseMod.NestableListBaseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NestableListBase {
  
  @JSImport("wix-style-react", "NestableListBase")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.NestableListBase] {
    
    inline def childrenProperty(value: String): this.type = set("childrenProperty", value.asInstanceOf[js.Any])
    
    inline def childrenStyle(value: CSSProperties): this.type = set("childrenStyle", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def isRenderDraggingChildren(value: Boolean): this.type = set("isRenderDraggingChildren", value.asInstanceOf[js.Any])
    
    inline def items(value: js.Array[NestableItemProps]): this.type = set("items", value.asInstanceOf[js.Any])
    
    inline def itemsVarargs(value: NestableItemProps*): this.type = set("items", js.Array(value*))
    
    inline def maxDepth(value: Double): this.type = set("maxDepth", value.asInstanceOf[js.Any])
    
    inline def onDragEnd(value: /* itemProps */ Any => Callback): this.type = set("onDragEnd", js.Any.fromFunction1((t0: /* itemProps */ Any) => value(t0).runNow()))
    
    inline def onDragStart(value: /* itemProps */ Any => Callback): this.type = set("onDragStart", js.Any.fromFunction1((t0: /* itemProps */ Any) => value(t0).runNow()))
    
    inline def onUpdate(value: /* data */ ItemObject => Callback): this.type = set("onUpdate", js.Any.fromFunction1((t0: /* data */ ItemObject) => value(t0).runNow()))
    
    inline def readOnly(value: Boolean): this.type = set("readOnly", value.asInstanceOf[js.Any])
    
    inline def renderAction(value: /* data */ IRenderData => Node): this.type = set("renderAction", js.Any.fromFunction1(value))
    
    inline def renderItem(value: /* data */ IRenderData => Node): this.type = set("renderItem", js.Any.fromFunction1(value))
    
    inline def renderPrefix(value: /* data */ IRenderData => Node): this.type = set("renderPrefix", js.Any.fromFunction1(value))
    
    inline def threshold(value: Double): this.type = set("threshold", value.asInstanceOf[js.Any])
    
    inline def useDragHandle(value: Boolean): this.type = set("useDragHandle", value.asInstanceOf[js.Any])
    
    inline def zIndex(value: Double): this.type = set("zIndex", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: NestableListBase.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: NestableListBaseProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
