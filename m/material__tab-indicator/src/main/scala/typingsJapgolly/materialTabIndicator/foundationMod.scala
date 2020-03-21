package typingsJapgolly.materialTabIndicator

import org.scalajs.dom.raw.ClientRect
import typingsJapgolly.materialBase.foundationMod.MDCFoundation
import typingsJapgolly.materialTabIndicator.adapterMod.MDCTabIndicatorAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/tab-indicator/foundation", JSImport.Namespace)
@js.native
object foundationMod extends js.Object {
  @js.native
  abstract class MDCTabIndicatorFoundation () extends MDCFoundation[MDCTabIndicatorAdapter] {
    def this(adapter: PartialMDCTabIndicatorAda) = this()
    def activate(): Unit = js.native
    def activate(previousIndicatorClientRect: ClientRect): Unit = js.native
    def computeContentClientRect(): ClientRect = js.native
    def deactivate(): Unit = js.native
    // Subclasses should override this method to perform de-initialization routines (de-registering events, etc.)
    /* CompleteClass */
    override def destroy(): Unit = js.native
    // Subclasses should override this method to perform initialization routines (registering events, etc.)
    /* CompleteClass */
    override def init(): Unit = js.native
  }
  
  @js.native
  abstract class default () extends MDCTabIndicatorFoundation {
    def this(adapter: PartialMDCTabIndicatorAda) = this()
  }
  
  /* static members */
  @js.native
  object MDCTabIndicatorFoundation extends js.Object {
    val cssClasses: AnonACTIVE = js.native
    val defaultAdapter: MDCTabIndicatorAdapter = js.native
    val strings: AnonCONTENTSELECTOR = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    val cssClasses: AnonACTIVE = js.native
    val defaultAdapter: MDCTabIndicatorAdapter = js.native
    val strings: AnonCONTENTSELECTOR = js.native
  }
  
}

