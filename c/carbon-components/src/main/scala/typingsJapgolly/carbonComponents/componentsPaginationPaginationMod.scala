package typingsJapgolly.carbonComponents

import japgolly.scalajs.react.Callback
import typingsJapgolly.carbonComponents.anon.PartialPaginationOptions
import typingsJapgolly.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsPaginationPaginationMod {
  
  @JSImport("carbon-components/components/pagination/pagination", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Pagination {
    def this(element: Any) = this()
    def this(element: Any, options: PartialPaginationOptions) = this()
    
    /* CompleteClass */
    override def _emitEvent(evtName: String, detail: js.Object): Unit = js.native
  }
  object default {
    
    @JSImport("carbon-components/components/pagination/pagination", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("carbon-components/components/pagination/pagination", "default.components")
    @js.native
    def components: WeakMap[js.Object, Any] = js.native
    inline def components_=(x: WeakMap[js.Object, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("carbon-components/components/pagination/pagination", "default.options")
    @js.native
    def options: PaginationOptions = js.native
    inline def options_=(x: PaginationOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ trait Pagination extends StObject {
    
    def _emitEvent(evtName: String, detail: js.Object): Unit
  }
  object Pagination {
    
    inline def apply(_emitEvent: (String, js.Object) => Callback): Pagination = {
      val __obj = js.Dynamic.literal(_emitEvent = js.Any.fromFunction2((t0: String, t1: js.Object) => (_emitEvent(t0, t1)).runNow()))
      __obj.asInstanceOf[Pagination]
    }
    
    extension [Self <: Pagination](x: Self) {
      
      inline def set_emitEvent(value: (String, js.Object) => Callback): Self = StObject.set(x, "_emitEvent", js.Any.fromFunction2((t0: String, t1: js.Object) => (value(t0, t1)).runNow()))
    }
  }
  
  trait PaginationOptions extends StObject {
    
    var eventItemsPerPage: String
    
    var eventPageChange: String
    
    var eventPageNumber: String
    
    var selectorInit: String
    
    var selectorItemsPerPageInput: String
    
    var selectorPageBackward: String
    
    var selectorPageForward: String
    
    var selectorPageNumberInput: String
  }
  object PaginationOptions {
    
    inline def apply(
      eventItemsPerPage: String,
      eventPageChange: String,
      eventPageNumber: String,
      selectorInit: String,
      selectorItemsPerPageInput: String,
      selectorPageBackward: String,
      selectorPageForward: String,
      selectorPageNumberInput: String
    ): PaginationOptions = {
      val __obj = js.Dynamic.literal(eventItemsPerPage = eventItemsPerPage.asInstanceOf[js.Any], eventPageChange = eventPageChange.asInstanceOf[js.Any], eventPageNumber = eventPageNumber.asInstanceOf[js.Any], selectorInit = selectorInit.asInstanceOf[js.Any], selectorItemsPerPageInput = selectorItemsPerPageInput.asInstanceOf[js.Any], selectorPageBackward = selectorPageBackward.asInstanceOf[js.Any], selectorPageForward = selectorPageForward.asInstanceOf[js.Any], selectorPageNumberInput = selectorPageNumberInput.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaginationOptions]
    }
    
    extension [Self <: PaginationOptions](x: Self) {
      
      inline def setEventItemsPerPage(value: String): Self = StObject.set(x, "eventItemsPerPage", value.asInstanceOf[js.Any])
      
      inline def setEventPageChange(value: String): Self = StObject.set(x, "eventPageChange", value.asInstanceOf[js.Any])
      
      inline def setEventPageNumber(value: String): Self = StObject.set(x, "eventPageNumber", value.asInstanceOf[js.Any])
      
      inline def setSelectorInit(value: String): Self = StObject.set(x, "selectorInit", value.asInstanceOf[js.Any])
      
      inline def setSelectorItemsPerPageInput(value: String): Self = StObject.set(x, "selectorItemsPerPageInput", value.asInstanceOf[js.Any])
      
      inline def setSelectorPageBackward(value: String): Self = StObject.set(x, "selectorPageBackward", value.asInstanceOf[js.Any])
      
      inline def setSelectorPageForward(value: String): Self = StObject.set(x, "selectorPageForward", value.asInstanceOf[js.Any])
      
      inline def setSelectorPageNumberInput(value: String): Self = StObject.set(x, "selectorPageNumberInput", value.asInstanceOf[js.Any])
    }
  }
}
