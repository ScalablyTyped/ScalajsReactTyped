package typingsJapgolly.wordpressBlocks.components

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.wordpressBlocks.blockContentProviderMod.BlockContentProvider.Props
import typingsJapgolly.wordpressBlocks.mod.BlockInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BlockContentProvider {
  
  inline def apply(innerBlocks: js.Array[BlockInstance[StringDictionary[Any]]]): Default[js.Object] = {
    val __props = js.Dynamic.literal(innerBlocks = innerBlocks.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("@wordpress/blocks/block-content-provider", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Props): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
