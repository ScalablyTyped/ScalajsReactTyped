package typingsJapgolly.reactMosaicComponent.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.dndCore.distInterfacesMod.DragDropManager
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactMosaicComponent.libTypesMod.MosaicBranch
import typingsJapgolly.reactMosaicComponent.libTypesMod.MosaicKey
import typingsJapgolly.reactMosaicComponent.libTypesMod.MosaicNode
import typingsJapgolly.reactMosaicComponent.libTypesMod.ResizeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MosaicWithoutDragDropContext {
  
  object MosaicControlledProps {
    
    inline def apply[T /* <: MosaicKey */](
      onChange: js.UndefOr[MosaicNode[T]] => Callback,
      renderTile: (T, /* path */ js.Array[MosaicBranch]) => Element
    ): Builder[T] = {
      val __props = js.Dynamic.literal(onChange = js.Any.fromFunction1((t0: js.UndefOr[MosaicNode[T]]) => onChange(t0).runNow()), renderTile = js.Any.fromFunction2(renderTile))
      new Builder[T](js.Array(this.component, __props.asInstanceOf[typingsJapgolly.reactMosaicComponent.libMosaicMod.MosaicControlledProps[T]]))
    }
    
    @JSImport("react-mosaic-component", "MosaicWithoutDragDropContext")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder[T /* <: MosaicKey */] (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[typingsJapgolly.reactMosaicComponent.mod.MosaicWithoutDragDropContext[T]] {
      
      inline def blueprintNamespace(value: String): this.type = set("blueprintNamespace", value.asInstanceOf[js.Any])
      
      inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      inline def dragAndDropManager(value: DragDropManager): this.type = set("dragAndDropManager", value.asInstanceOf[js.Any])
      
      inline def mosaicId(value: String): this.type = set("mosaicId", value.asInstanceOf[js.Any])
      
      inline def onRelease(value: /* newNode */ MosaicNode[T] | Null => Callback): this.type = set("onRelease", js.Any.fromFunction1((t0: /* newNode */ MosaicNode[T] | Null) => value(t0).runNow()))
      
      inline def resize(value: ResizeOptions): this.type = set("resize", value.asInstanceOf[js.Any])
      
      inline def value(value: MosaicNode[T]): this.type = set("value", value.asInstanceOf[js.Any])
      
      inline def valueNull: this.type = set("value", null)
      
      inline def zeroStateView(value: VdomElement): this.type = set("zeroStateView", value.rawElement.asInstanceOf[js.Any])
    }
    
    def withProps[T /* <: MosaicKey */](p: typingsJapgolly.reactMosaicComponent.libMosaicMod.MosaicControlledProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object MosaicUncontrolledProps {
    
    inline def apply[T /* <: MosaicKey */](renderTile: (T, /* path */ js.Array[MosaicBranch]) => Element): Builder[T] = {
      val __props = js.Dynamic.literal(renderTile = js.Any.fromFunction2(renderTile))
      new Builder[T](js.Array(this.component, __props.asInstanceOf[typingsJapgolly.reactMosaicComponent.libMosaicMod.MosaicUncontrolledProps[T]]))
    }
    
    @JSImport("react-mosaic-component", "MosaicWithoutDragDropContext")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder[T /* <: MosaicKey */] (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[typingsJapgolly.reactMosaicComponent.mod.MosaicWithoutDragDropContext[T]] {
      
      inline def blueprintNamespace(value: String): this.type = set("blueprintNamespace", value.asInstanceOf[js.Any])
      
      inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      inline def dragAndDropManager(value: DragDropManager): this.type = set("dragAndDropManager", value.asInstanceOf[js.Any])
      
      inline def initialValue(value: MosaicNode[T]): this.type = set("initialValue", value.asInstanceOf[js.Any])
      
      inline def initialValueNull: this.type = set("initialValue", null)
      
      inline def mosaicId(value: String): this.type = set("mosaicId", value.asInstanceOf[js.Any])
      
      inline def onChange(value: /* newNode */ MosaicNode[T] | Null => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* newNode */ MosaicNode[T] | Null) => value(t0).runNow()))
      
      inline def onRelease(value: /* newNode */ MosaicNode[T] | Null => Callback): this.type = set("onRelease", js.Any.fromFunction1((t0: /* newNode */ MosaicNode[T] | Null) => value(t0).runNow()))
      
      inline def resize(value: ResizeOptions): this.type = set("resize", value.asInstanceOf[js.Any])
      
      inline def zeroStateView(value: VdomElement): this.type = set("zeroStateView", value.rawElement.asInstanceOf[js.Any])
    }
    
    def withProps[T /* <: MosaicKey */](p: typingsJapgolly.reactMosaicComponent.libMosaicMod.MosaicUncontrolledProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
}
