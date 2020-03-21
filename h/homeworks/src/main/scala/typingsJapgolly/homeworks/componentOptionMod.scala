package typingsJapgolly.homeworks

import typingsJapgolly.angularCore.mod.ElementRef
import typingsJapgolly.angularCore.mod.Renderer2
import typingsJapgolly.homeworks.managerMod.HomeworksManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("homeworks/lib/ng2-homeworks/src/components/spinner/component.option", JSImport.Namespace)
@js.native
object componentOptionMod extends js.Object {
  @js.native
  class WorksOption protected () extends HomeworksManager {
    def this(renderer: Renderer2, elementRef: ElementRef[_]) = this()
    @JSName("$element")
    var $element: js.Any = js.native
    @JSName("$option")
    var $option: js.Any = js.native
    var disabled: js.Any = js.native
    var elementRef: js.Any = js.native
    var label: String = js.native
    var m_disabled: js.Any = js.native
    var m_label: js.Any = js.native
    var m_selected: js.Any = js.native
    var m_value: js.Any = js.native
    var optionChild: ElementRef[_] = js.native
    var propagateChange: js.Any = js.native
    var propagateTouch: js.Any = js.native
    var selected: js.Any = js.native
    var value: String = js.native
    def ngAfterViewInit(): Unit = js.native
    def ngOnDestroy(): Unit = js.native
    def ngOnInit(): Unit = js.native
    def render(): Unit = js.native
  }
  
}

