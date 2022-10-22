package typingsJapgolly.rcPicker

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.moment.mod.Moment
import typingsJapgolly.rcPicker.esGenerateMod.GenerateConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esGenerateMomentMod extends Shortcut {
  
  @JSImport("rc-picker/es/generate/moment", JSImport.Default)
  @js.native
  val default: GenerateConfig[Moment] = js.native
  
  type _To = GenerateConfig[Moment]
  
  /* This means you don't have to write `default`, but can instead just say `esGenerateMomentMod.foo` */
  override def _to: GenerateConfig[Moment] = default
}
