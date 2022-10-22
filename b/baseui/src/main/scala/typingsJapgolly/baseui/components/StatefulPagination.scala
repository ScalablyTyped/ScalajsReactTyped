package typingsJapgolly.baseui.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.anon.EventAny
import typingsJapgolly.baseui.anon.NextPage
import typingsJapgolly.baseui.baseuiStrings.changePage
import typingsJapgolly.baseui.paginationTypesMod.Labels
import typingsJapgolly.baseui.paginationTypesMod.PaginationOverrides
import typingsJapgolly.baseui.paginationTypesMod.Size
import typingsJapgolly.baseui.paginationTypesMod.StatefulContainerState
import typingsJapgolly.baseui.paginationTypesMod.StatefulPaginationProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StatefulPagination {
  
  inline def apply(numPages: Double): Builder = {
    val __props = js.Dynamic.literal(numPages = numPages.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[StatefulPaginationProps]))
  }
  
  @JSImport("baseui/pagination", "StatefulPagination")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def initialState(value: StatefulContainerState): this.type = set("initialState", value.asInstanceOf[js.Any])
    
    inline def labels(value: Labels): this.type = set("labels", value.asInstanceOf[js.Any])
    
    inline def onNextClick(value: /* a */ EventAny => Any): this.type = set("onNextClick", js.Any.fromFunction1(value))
    
    inline def onPageChange(value: /* a */ NextPage => Any): this.type = set("onPageChange", js.Any.fromFunction1(value))
    
    inline def onPrevClick(value: /* a */ EventAny => Any): this.type = set("onPrevClick", js.Any.fromFunction1(value))
    
    inline def overrides(value: PaginationOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    inline def size(value: Size): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def stateReducer(
      value: (changePage, /* changes */ StatefulContainerState, /* currentState */ StatefulContainerState) => StatefulContainerState
    ): this.type = set("stateReducer", js.Any.fromFunction3(value))
  }
  
  def withProps(p: StatefulPaginationProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
