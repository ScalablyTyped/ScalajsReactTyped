package typingsJapgolly.reactColor.components

import typingsJapgolly.reactColor.libComponentsBlockBlockMod.BlockPickerProps
import typingsJapgolly.reactColor.libComponentsBlockBlockMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Block {
  
  @JSImport("react-color/lib/components/block/Block", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Block.type): SharedBuilder_BlockPickerProps1686960899[default] = new SharedBuilder_BlockPickerProps1686960899[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: BlockPickerProps): SharedBuilder_BlockPickerProps1686960899[default] = new SharedBuilder_BlockPickerProps1686960899[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
