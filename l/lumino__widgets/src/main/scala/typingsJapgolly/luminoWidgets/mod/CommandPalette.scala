package typingsJapgolly.luminoWidgets.mod

import typingsJapgolly.luminoWidgets.typesCommandpaletteMod.CommandPalette.IOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lumino/widgets", "CommandPalette")
@js.native
open class CommandPalette protected ()
  extends typingsJapgolly.luminoWidgets.typesCommandpaletteMod.CommandPalette {
  /**
    * Construct a new command palette.
    *
    * @param options - The options for initializing the palette.
    */
  def this(options: IOptions) = this()
}
object CommandPalette {
  
  /**
    * The default implementation of `IRenderer`.
    */
  @JSImport("@lumino/widgets", "CommandPalette.Renderer")
  @js.native
  open class Renderer ()
    extends typingsJapgolly.luminoWidgets.typesCommandpaletteMod.CommandPalette.Renderer
  
  /**
    * The default `Renderer` instance.
    */
  @JSImport("@lumino/widgets", "CommandPalette.defaultRenderer")
  @js.native
  val defaultRenderer: typingsJapgolly.luminoWidgets.typesCommandpaletteMod.CommandPalette.Renderer = js.native
}
