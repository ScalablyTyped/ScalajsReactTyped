package typingsJapgolly.rcPicker

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.dayjs.mod.Dayjs
import typingsJapgolly.rcPicker.esGenerateMod.GenerateConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esGenerateDayjsMod extends Shortcut {
  
  @JSImport("rc-picker/es/generate/dayjs", JSImport.Default)
  @js.native
  val default: GenerateConfig[Dayjs] = js.native
  
  type _To = GenerateConfig[Dayjs]
  
  /* This means you don't have to write `default`, but can instead just say `esGenerateDayjsMod.foo` */
  override def _to: GenerateConfig[Dayjs] = default
}
