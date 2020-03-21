package typingsJapgolly.typedoc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/utils/options", JSImport.Namespace)
@js.native
object optionsMod extends js.Object {
  @js.native
  class Options ()
    extends typingsJapgolly.typedoc.optionsOptionsMod.Options
  
  @js.native
  object OptionsReadMode extends js.Object {
    /* 1 */ val Fetch: typingsJapgolly.typedoc.optionsOptionsMod.OptionsReadMode.Fetch with Double = js.native
    /* 0 */ val Prefetch: typingsJapgolly.typedoc.optionsOptionsMod.OptionsReadMode.Prefetch with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.typedoc.optionsOptionsMod.OptionsReadMode with Double] = js.native
  }
  
}

