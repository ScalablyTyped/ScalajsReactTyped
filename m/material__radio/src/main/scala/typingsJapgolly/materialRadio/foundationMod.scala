package typingsJapgolly.materialRadio

import typingsJapgolly.materialBase.foundationMod.MDCFoundation
import typingsJapgolly.materialRadio.adapterMod.MDCRadioAdapter
import typingsJapgolly.materialRadio.anon.PartialMDCRadioAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object foundationMod {
  
  @JSImport("@material/radio/foundation", JSImport.Default)
  @js.native
  open class default () extends MDCRadioFoundation {
    def this(adapter: PartialMDCRadioAdapter) = this()
  }
  
  @JSImport("@material/radio/foundation", "MDCRadioFoundation")
  @js.native
  open class MDCRadioFoundation () extends MDCFoundation[MDCRadioAdapter] {
    def this(adapter: PartialMDCRadioAdapter) = this()
    
    def setDisabled(disabled: Boolean): Unit = js.native
  }
}
