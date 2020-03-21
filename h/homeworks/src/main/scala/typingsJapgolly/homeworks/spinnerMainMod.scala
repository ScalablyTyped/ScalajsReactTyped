package typingsJapgolly.homeworks

import typingsJapgolly.angularCore.mod.ElementRef
import typingsJapgolly.angularCore.mod.Renderer2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("homeworks/lib/ng2-homeworks/src/components/spinner/main", JSImport.Namespace)
@js.native
object spinnerMainMod extends js.Object {
  @js.native
  class WorksOption protected ()
    extends typingsJapgolly.homeworks.componentOptionMod.WorksOption {
    def this(renderer: Renderer2, elementRef: ElementRef[_]) = this()
  }
  
  @js.native
  class WorksSpinner protected ()
    extends typingsJapgolly.homeworks.componentSpinnerMod.WorksSpinner {
    def this(renderer: Renderer2, elementRef: ElementRef[_]) = this()
  }
  
}

