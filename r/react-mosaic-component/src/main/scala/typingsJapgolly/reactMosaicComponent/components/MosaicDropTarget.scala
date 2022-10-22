package typingsJapgolly.reactMosaicComponent.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactMosaicComponent.libInternalTypesMod.MosaicDropTargetPosition
import typingsJapgolly.reactMosaicComponent.libMosaicDropTargetMod.MosaicDropTargetProps
import typingsJapgolly.reactMosaicComponent.libTypesMod.MosaicPath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MosaicDropTarget {
  
  inline def apply(path: MosaicPath, position: MosaicDropTargetPosition): Default[js.Object] = {
    val __props = js.Dynamic.literal(path = path.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[MosaicDropTargetProps]))
  }
  
  @JSImport("react-mosaic-component/lib/MosaicDropTarget", "MosaicDropTarget")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: MosaicDropTargetProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
