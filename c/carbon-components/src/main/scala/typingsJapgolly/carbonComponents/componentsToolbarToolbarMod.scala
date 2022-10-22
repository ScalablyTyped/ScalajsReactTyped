package typingsJapgolly.carbonComponents

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import typingsJapgolly.carbonComponents.anon.PartialToolbarOptions
import typingsJapgolly.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsToolbarToolbarMod {
  
  @JSImport("carbon-components/components/toolbar/toolbar", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Toolbar {
    def this(element: HTMLElement) = this()
    def this(element: HTMLElement, options: PartialToolbarOptions) = this()
    
    /* CompleteClass */
    override def _handleDocumentClick(event: MouseEvent): Unit = js.native
    
    /* CompleteClass */
    override def _handleKeyDown(event: KeyboardEvent): Unit = js.native
    
    /* CompleteClass */
    override def _handleRowHeightChange(event: MouseEvent, boundTable: HTMLElement): Unit = js.native
  }
  object default {
    
    @JSImport("carbon-components/components/toolbar/toolbar", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("carbon-components/components/toolbar/toolbar", "default.components")
    @js.native
    def components: WeakMap[js.Object, Any] = js.native
    inline def components_=(x: WeakMap[js.Object, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ trait Toolbar extends StObject {
    
    def _handleDocumentClick(event: MouseEvent): Unit
    
    def _handleKeyDown(event: KeyboardEvent): Unit
    
    def _handleRowHeightChange(event: MouseEvent, boundTable: HTMLElement): Unit
  }
  object Toolbar {
    
    inline def apply(
      _handleDocumentClick: MouseEvent => Callback,
      _handleKeyDown: KeyboardEvent => Callback,
      _handleRowHeightChange: (MouseEvent, HTMLElement) => Callback
    ): Toolbar = {
      val __obj = js.Dynamic.literal(_handleDocumentClick = js.Any.fromFunction1((t0: MouseEvent) => _handleDocumentClick(t0).runNow()), _handleKeyDown = js.Any.fromFunction1((t0: KeyboardEvent) => _handleKeyDown(t0).runNow()), _handleRowHeightChange = js.Any.fromFunction2((t0: MouseEvent, t1: HTMLElement) => (_handleRowHeightChange(t0, t1)).runNow()))
      __obj.asInstanceOf[Toolbar]
    }
    
    extension [Self <: Toolbar](x: Self) {
      
      inline def set_handleDocumentClick(value: MouseEvent => Callback): Self = StObject.set(x, "_handleDocumentClick", js.Any.fromFunction1((t0: MouseEvent) => value(t0).runNow()))
      
      inline def set_handleKeyDown(value: KeyboardEvent => Callback): Self = StObject.set(x, "_handleKeyDown", js.Any.fromFunction1((t0: KeyboardEvent) => value(t0).runNow()))
      
      inline def set_handleRowHeightChange(value: (MouseEvent, HTMLElement) => Callback): Self = StObject.set(x, "_handleRowHeightChange", js.Any.fromFunction2((t0: MouseEvent, t1: HTMLElement) => (value(t0, t1)).runNow()))
    }
  }
  
  trait ToolbarOptions extends StObject {
    
    var classSearchActive: String
    
    var classTallRows: String
    
    var selectorInit: String
    
    var selectorRowHeight: String
    
    var selectorSearch: String
  }
  object ToolbarOptions {
    
    inline def apply(
      classSearchActive: String,
      classTallRows: String,
      selectorInit: String,
      selectorRowHeight: String,
      selectorSearch: String
    ): ToolbarOptions = {
      val __obj = js.Dynamic.literal(classSearchActive = classSearchActive.asInstanceOf[js.Any], classTallRows = classTallRows.asInstanceOf[js.Any], selectorInit = selectorInit.asInstanceOf[js.Any], selectorRowHeight = selectorRowHeight.asInstanceOf[js.Any], selectorSearch = selectorSearch.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToolbarOptions]
    }
    
    extension [Self <: ToolbarOptions](x: Self) {
      
      inline def setClassSearchActive(value: String): Self = StObject.set(x, "classSearchActive", value.asInstanceOf[js.Any])
      
      inline def setClassTallRows(value: String): Self = StObject.set(x, "classTallRows", value.asInstanceOf[js.Any])
      
      inline def setSelectorInit(value: String): Self = StObject.set(x, "selectorInit", value.asInstanceOf[js.Any])
      
      inline def setSelectorRowHeight(value: String): Self = StObject.set(x, "selectorRowHeight", value.asInstanceOf[js.Any])
      
      inline def setSelectorSearch(value: String): Self = StObject.set(x, "selectorSearch", value.asInstanceOf[js.Any])
    }
  }
}
