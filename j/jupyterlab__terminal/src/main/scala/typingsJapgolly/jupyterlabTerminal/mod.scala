package typingsJapgolly.jupyterlabTerminal

import typingsJapgolly.jupyterlabServices.terminalTerminalMod.TerminalSession.ISession
import typingsJapgolly.jupyterlabTerminal.tokensMod.ITerminal.IOptions
import typingsJapgolly.phosphorCoreutils.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/terminal", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Terminal protected ()
    extends typingsJapgolly.jupyterlabTerminal.widgetMod.Terminal {
    /**
      * Construct a new terminal widget.
      *
      * @param session - The terminal session object.
      *
      * @param options - The terminal configuration options.
      */
    def this(session: ISession) = this()
    def this(session: ISession, options: PartialIOptions) = this()
  }
  
  val ITerminalTracker: Token[typingsJapgolly.jupyterlabTerminal.tokensMod.ITerminalTracker] = js.native
  @js.native
  object ITerminal extends js.Object {
    /**
      * The default options used for creating terminals.
      */
    val defaultOptions: IOptions = js.native
  }
  
}

