package typingsJapgolly.wixUiCore

import typingsJapgolly.wixUiCore.anon.CurrentPage
import typingsJapgolly.wixUiCore.anon.MaxPagesToShow
import typingsJapgolly.wixUiCore.anon.ShowFirstPage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsPaginationPageStripLayoutMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/pagination/page-strip-layout", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createResponsiveLayout(hasContainerTotalPagesCurrentPageMaxPagesToShowShowFirstPageShowLastPage: CurrentPage): PageStripLayout = ^.asInstanceOf[js.Dynamic].applyDynamic("createResponsiveLayout")(hasContainerTotalPagesCurrentPageMaxPagesToShowShowFirstPageShowLastPage.asInstanceOf[js.Any]).asInstanceOf[PageStripLayout]
  
  inline def createResponsiveLayoutTemplate(hasTotalPagesCurrentPageMaxPagesToShow: MaxPagesToShow): PageStripLayout = ^.asInstanceOf[js.Dynamic].applyDynamic("createResponsiveLayoutTemplate")(hasTotalPagesCurrentPageMaxPagesToShow.asInstanceOf[js.Any]).asInstanceOf[PageStripLayout]
  
  inline def createStaticLayout(hasTotalPagesCurrentPageMaxPagesToShowShowFirstPageShowLastPage: ShowFirstPage): PageStripLayout = ^.asInstanceOf[js.Dynamic].applyDynamic("createStaticLayout")(hasTotalPagesCurrentPageMaxPagesToShowShowFirstPageShowLastPage.asInstanceOf[js.Any]).asInstanceOf[PageStripLayout]
  
  type PageStripLayout = js.Array[Double]
}
