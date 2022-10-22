package typingsJapgolly.antd

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.antd.libPaginationPaginationMod.PaginationProps
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPaginationMod extends Shortcut {
  
  @JSImport("antd/lib/pagination", JSImport.Default)
  @js.native
  val default: FC[PaginationProps] = js.native
  
  type _To = FC[PaginationProps]
  
  /* This means you don't have to write `default`, but can instead just say `libPaginationMod.foo` */
  override def _to: FC[PaginationProps] = default
}
