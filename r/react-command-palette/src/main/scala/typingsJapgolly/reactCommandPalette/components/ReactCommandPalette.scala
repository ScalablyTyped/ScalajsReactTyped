package typingsJapgolly.reactCommandPalette.components

import typingsJapgolly.reactCommandPalette.commandPaletteMod.Command
import typingsJapgolly.reactCommandPalette.commandPaletteMod.Props
import typingsJapgolly.reactCommandPalette.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactCommandPalette {
  
  inline def apply(commands: js.Array[Command]): SharedBuilder_Props1669414831[default] = {
    val __props = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any])
    new SharedBuilder_Props1669414831[default](js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("react-command-palette", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Props): SharedBuilder_Props1669414831[default] = new SharedBuilder_Props1669414831[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
