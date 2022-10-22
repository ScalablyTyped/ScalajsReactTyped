package typingsJapgolly.winrt.Windows.UI.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CharacterReceivedEventArgs
  extends StObject
     with ICharacterReceivedEventArgs
object CharacterReceivedEventArgs {
  
  inline def apply(handled: Boolean, keyCode: Double, keyStatus: CorePhysicalKeyStatus): CharacterReceivedEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any], keyCode = keyCode.asInstanceOf[js.Any], keyStatus = keyStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[CharacterReceivedEventArgs]
  }
}
