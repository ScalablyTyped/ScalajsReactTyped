package typingsJapgolly.terraActionFooter

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.HTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBlockActionFooterMod extends Shortcut {
  
  @JSImport("terra-action-footer/lib/BlockActionFooter", JSImport.Default)
  @js.native
  val default: FC[BlockActionFooterProps] = js.native
  
  type BlockActionFooterProps = HTMLAttributes[HTMLDivElement]
  
  type _To = FC[BlockActionFooterProps]
  
  /* This means you don't have to write `default`, but can instead just say `libBlockActionFooterMod.foo` */
  override def _to: FC[BlockActionFooterProps] = default
}
