package typingsJapgolly.baseui.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.anon.EventAny
import typingsJapgolly.baseui.anon.NextPage
import typingsJapgolly.baseui.paginationTypesMod.Labels
import typingsJapgolly.baseui.paginationTypesMod.PaginationOverrides
import typingsJapgolly.baseui.paginationTypesMod.PaginationProps
import typingsJapgolly.baseui.paginationTypesMod.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Pagination {
  
  inline def apply(currentPage: Double, numPages: Double): Builder = {
    val __props = js.Dynamic.literal(currentPage = currentPage.asInstanceOf[js.Any], numPages = numPages.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PaginationProps]))
  }
  
  @JSImport("baseui/pagination", "Pagination")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.baseui.paginationMod.Pagination] {
    
    inline def labels(value: Labels): this.type = set("labels", value.asInstanceOf[js.Any])
    
    inline def onNextClick(value: /* a */ EventAny => Any): this.type = set("onNextClick", js.Any.fromFunction1(value))
    
    inline def onPageChange(value: /* a */ NextPage => Any): this.type = set("onPageChange", js.Any.fromFunction1(value))
    
    inline def onPrevClick(value: /* a */ EventAny => Any): this.type = set("onPrevClick", js.Any.fromFunction1(value))
    
    inline def overrides(value: PaginationOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    inline def size(value: Size): this.type = set("size", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PaginationProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
