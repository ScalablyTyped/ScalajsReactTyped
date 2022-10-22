package typingsJapgolly.wixUiCore

import org.scalajs.dom.HTMLElement
import typingsJapgolly.wixUiCore.distEsSrcComponentsPaginationPaginationMod.PaginationMode
import typingsJapgolly.wixUiCore.wixUiCoreStrings.compact
import typingsJapgolly.wixUiCore.wixUiCoreStrings.input
import typingsJapgolly.wixUiCore.wixUiCoreStrings.pages
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsPaginationRootMinWidthMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/pagination/root-min-width", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def measureAndSetRootMinWidth(compNode: HTMLElement, paginationMode: PaginationMode | compact | input | pages): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("measureAndSetRootMinWidth")(compNode.asInstanceOf[js.Any], paginationMode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def measureAndSetRootMinWidth(compNode: HTMLElement, paginationMode: PaginationMode | compact | input | pages, idPrefix: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("measureAndSetRootMinWidth")(compNode.asInstanceOf[js.Any], paginationMode.asInstanceOf[js.Any], idPrefix.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
