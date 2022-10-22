package typingsJapgolly.reactMosaicComponent.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactMosaicComponent.libMosaicZeroStateMod.MosaicZeroStateProps
import typingsJapgolly.reactMosaicComponent.libTypesMod.CreateNode
import typingsJapgolly.reactMosaicComponent.libTypesMod.MosaicKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MosaicZeroState {
  
  inline def apply[T /* <: MosaicKey */](): Builder[T] = {
    val __props = js.Dynamic.literal()
    new Builder[T](js.Array(this.component, __props.asInstanceOf[MosaicZeroStateProps[T]]))
  }
  
  @JSImport("react-mosaic-component", "MosaicZeroState")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[T /* <: MosaicKey */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactMosaicComponent.mod.MosaicZeroState[T]] {
    
    inline def createNode(value: CreateNode[T]): this.type = set("createNode", value.asInstanceOf[js.Any])
  }
  
  implicit def make[T /* <: MosaicKey */](companion: MosaicZeroState.type): Builder[T] = new Builder[T](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps[T /* <: MosaicKey */](p: MosaicZeroStateProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
}
