package typingsJapgolly.materialTextfield

import typingsJapgolly.materialBase.foundationMod.MDCFoundation
import typingsJapgolly.materialTextfield.anon.PartialMDCTextFieldCharac
import typingsJapgolly.materialTextfield.characterCounterAdapterMod.MDCTextFieldCharacterCounterAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object characterCounterFoundationMod {
  
  @JSImport("@material/textfield/character-counter/foundation", JSImport.Default)
  @js.native
  open class default () extends MDCTextFieldCharacterCounterFoundation {
    def this(adapter: PartialMDCTextFieldCharac) = this()
  }
  
  @JSImport("@material/textfield/character-counter/foundation", "MDCTextFieldCharacterCounterFoundation")
  @js.native
  open class MDCTextFieldCharacterCounterFoundation () extends MDCFoundation[MDCTextFieldCharacterCounterAdapter] {
    def this(adapter: PartialMDCTextFieldCharac) = this()
    
    def setCounterValue(currentLength: Double, maxLength: Double): Unit = js.native
  }
}
