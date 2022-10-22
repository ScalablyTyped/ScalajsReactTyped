package typingsJapgolly.reactMosaicComponent.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.dndCore.distInterfacesMod.DragDropManager
import typingsJapgolly.reactMosaicComponent.libTypesMod.MosaicKey
import typingsJapgolly.reactMosaicComponent.libTypesMod.MosaicNode
import typingsJapgolly.reactMosaicComponent.libTypesMod.ResizeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_MosaicProps_1816408435[R <: js.Object, T /* <: MosaicKey */] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
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
