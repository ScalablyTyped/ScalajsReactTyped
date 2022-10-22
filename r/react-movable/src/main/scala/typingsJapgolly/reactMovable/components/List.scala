package typingsJapgolly.reactMovable.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactMovable.libTypesMod.BeforeDragParams
import typingsJapgolly.reactMovable.libTypesMod.IProps
import typingsJapgolly.reactMovable.libTypesMod.IVoiceover
import typingsJapgolly.reactMovable.libTypesMod.OnChangeMeta
import typingsJapgolly.reactMovable.libTypesMod.RenderItemParams
import typingsJapgolly.reactMovable.libTypesMod.RenderListParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object List {
  
  inline def apply[Value](
    lockVertically: Boolean,
    onChange: OnChangeMeta => Callback,
    removableByMove: Boolean,
    renderItem: RenderItemParams[Value] => Node,
    renderList: RenderListParams => Node,
    transitionDuration: Double,
    values: js.Array[Value],
    voiceover: IVoiceover
  ): Builder[Value] = {
    val __props = js.Dynamic.literal(lockVertically = lockVertically.asInstanceOf[js.Any], onChange = js.Any.fromFunction1((t0: OnChangeMeta) => onChange(t0).runNow()), removableByMove = removableByMove.asInstanceOf[js.Any], renderItem = js.Any.fromFunction1(renderItem), renderList = js.Any.fromFunction1(renderList), transitionDuration = transitionDuration.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any], voiceover = voiceover.asInstanceOf[js.Any])
    new Builder[Value](js.Array(this.component, __props.asInstanceOf[IProps[Value]]))
  }
  
  @JSImport("react-movable", "List")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[Value] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactMovable.mod.List[Value]] {
    
    inline def beforeDrag(value: /* params */ BeforeDragParams => Callback): this.type = set("beforeDrag", js.Any.fromFunction1((t0: /* params */ BeforeDragParams) => value(t0).runNow()))
    
    inline def container(value: Element): this.type = set("container", value.asInstanceOf[js.Any])
    
    inline def containerNull: this.type = set("container", null)
  }
  
  def withProps[Value](p: IProps[Value]): Builder[Value] = new Builder[Value](js.Array(this.component, p.asInstanceOf[js.Any]))
}
