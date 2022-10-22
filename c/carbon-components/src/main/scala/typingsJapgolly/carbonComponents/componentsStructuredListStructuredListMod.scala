package typingsJapgolly.carbonComponents

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Element
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import typingsJapgolly.carbonComponents.anon.PartialStructuredListOpti
import typingsJapgolly.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsStructuredListStructuredListMod {
  
  @JSImport("carbon-components/components/structured-list/structured-list", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with StructuredList {
    def this(element: HTMLElement) = this()
    def this(element: HTMLElement, options: PartialStructuredListOpti) = this()
    
    /* CompleteClass */
    override def _direction(evt: Event): Double = js.native
    
    /* CompleteClass */
    override def _getInput(index: Double): HTMLElement = js.native
    
    /* CompleteClass */
    override def _handleClick(evt: MouseEvent): Unit = js.native
    
    /* CompleteClass */
    override def _handleInputChecked(index: Double): Unit = js.native
    
    /* CompleteClass */
    override def _handleKeydownArrow(evt: KeyboardEvent): Unit = js.native
    
    /* CompleteClass */
    override def _handleKeydownChecked(evt: KeyboardEvent): Unit = js.native
    
    /* CompleteClass */
    override def _nextIndex(array: js.Array[Element], arrayItem: Element, direction: Double): Double = js.native
  }
  object default {
    
    @JSImport("carbon-components/components/structured-list/structured-list", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("carbon-components/components/structured-list/structured-list", "default.components")
    @js.native
    def components: WeakMap[js.Object, Any] = js.native
    inline def components_=(x: WeakMap[js.Object, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ trait StructuredList extends StObject {
    
    def _direction(evt: Event): Double
    
    def _getInput(index: Double): HTMLElement
    
    def _handleClick(evt: MouseEvent): Unit
    
    def _handleInputChecked(index: Double): Unit
    
    def _handleKeydownArrow(evt: KeyboardEvent): Unit
    
    def _handleKeydownChecked(evt: KeyboardEvent): Unit
    
    def _nextIndex(array: js.Array[Element], arrayItem: Element, direction: Double): Double
  }
  object StructuredList {
    
    inline def apply(
      _direction: Event => Double,
      _getInput: Double => HTMLElement,
      _handleClick: MouseEvent => Callback,
      _handleInputChecked: Double => Callback,
      _handleKeydownArrow: KeyboardEvent => Callback,
      _handleKeydownChecked: KeyboardEvent => Callback,
      _nextIndex: (js.Array[Element], Element, Double) => Double
    ): StructuredList = {
      val __obj = js.Dynamic.literal(_direction = js.Any.fromFunction1(_direction), _getInput = js.Any.fromFunction1(_getInput), _handleClick = js.Any.fromFunction1((t0: MouseEvent) => _handleClick(t0).runNow()), _handleInputChecked = js.Any.fromFunction1((t0: Double) => _handleInputChecked(t0).runNow()), _handleKeydownArrow = js.Any.fromFunction1((t0: KeyboardEvent) => _handleKeydownArrow(t0).runNow()), _handleKeydownChecked = js.Any.fromFunction1((t0: KeyboardEvent) => _handleKeydownChecked(t0).runNow()), _nextIndex = js.Any.fromFunction3(_nextIndex))
      __obj.asInstanceOf[StructuredList]
    }
    
    extension [Self <: StructuredList](x: Self) {
      
      inline def set_direction(value: Event => Double): Self = StObject.set(x, "_direction", js.Any.fromFunction1(value))
      
      inline def set_getInput(value: Double => HTMLElement): Self = StObject.set(x, "_getInput", js.Any.fromFunction1(value))
      
      inline def set_handleClick(value: MouseEvent => Callback): Self = StObject.set(x, "_handleClick", js.Any.fromFunction1((t0: MouseEvent) => value(t0).runNow()))
      
      inline def set_handleInputChecked(value: Double => Callback): Self = StObject.set(x, "_handleInputChecked", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def set_handleKeydownArrow(value: KeyboardEvent => Callback): Self = StObject.set(x, "_handleKeydownArrow", js.Any.fromFunction1((t0: KeyboardEvent) => value(t0).runNow()))
      
      inline def set_handleKeydownChecked(value: KeyboardEvent => Callback): Self = StObject.set(x, "_handleKeydownChecked", js.Any.fromFunction1((t0: KeyboardEvent) => value(t0).runNow()))
      
      inline def set_nextIndex(value: (js.Array[Element], Element, Double) => Double): Self = StObject.set(x, "_nextIndex", js.Any.fromFunction3(value))
    }
  }
  
  trait StructuredListOptions extends StObject {
    
    var classActive: String
    
    var selectorInit: String
    
    def selectorListInput(id: String): String
    
    var selectorRow: String
  }
  object StructuredListOptions {
    
    inline def apply(
      classActive: String,
      selectorInit: String,
      selectorListInput: String => String,
      selectorRow: String
    ): StructuredListOptions = {
      val __obj = js.Dynamic.literal(classActive = classActive.asInstanceOf[js.Any], selectorInit = selectorInit.asInstanceOf[js.Any], selectorListInput = js.Any.fromFunction1(selectorListInput), selectorRow = selectorRow.asInstanceOf[js.Any])
      __obj.asInstanceOf[StructuredListOptions]
    }
    
    extension [Self <: StructuredListOptions](x: Self) {
      
      inline def setClassActive(value: String): Self = StObject.set(x, "classActive", value.asInstanceOf[js.Any])
      
      inline def setSelectorInit(value: String): Self = StObject.set(x, "selectorInit", value.asInstanceOf[js.Any])
      
      inline def setSelectorListInput(value: String => String): Self = StObject.set(x, "selectorListInput", js.Any.fromFunction1(value))
      
      inline def setSelectorRow(value: String): Self = StObject.set(x, "selectorRow", value.asInstanceOf[js.Any])
    }
  }
}
