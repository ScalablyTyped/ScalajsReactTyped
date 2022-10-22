package typingsJapgolly.reactMosaicComponent.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactMosaicComponent.libMosaicRootMod.MosaicRootProps
import typingsJapgolly.reactMosaicComponent.libTypesMod.MosaicBranch
import typingsJapgolly.reactMosaicComponent.libTypesMod.MosaicKey
import typingsJapgolly.reactMosaicComponent.libTypesMod.MosaicNode
import typingsJapgolly.reactMosaicComponent.libTypesMod.ResizeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MosaicRoot {
  
  inline def apply[T /* <: MosaicKey */](renderTile: (T, /* path */ js.Array[MosaicBranch]) => Element, root: MosaicNode[T]): Builder[T] = {
    val __props = js.Dynamic.literal(renderTile = js.Any.fromFunction2(renderTile), root = root.asInstanceOf[js.Any])
    new Builder[T](js.Array(this.component, __props.asInstanceOf[MosaicRootProps[T]]))
  }
  
  @JSImport("react-mosaic-component/lib/MosaicRoot", "MosaicRoot")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[T /* <: MosaicKey */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactMosaicComponent.libMosaicRootMod.MosaicRoot[T]] {
    
    inline def resize(value: ResizeOptions): this.type = set("resize", value.asInstanceOf[js.Any])
  }
  
  def withProps[T /* <: MosaicKey */](p: MosaicRootProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
}
