package typingsJapgolly.jupyterlabConsole

import typingsJapgolly.jupyterlabConsole.widgetMod.CodeConsole.IContentFactory
import typingsJapgolly.jupyterlabConsole.widgetMod.CodeConsole.IModelFactoryOptions
import typingsJapgolly.jupyterlabConsole.widgetMod.CodeConsole.IOptions
import typingsJapgolly.phosphorCoreutils.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/console", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class CodeConsole protected ()
    extends typingsJapgolly.jupyterlabConsole.widgetMod.CodeConsole {
    /**
      * Construct a console widget.
      */
    def this(options: IOptions) = this()
  }
  
  @js.native
  class ConsoleHistory protected ()
    extends typingsJapgolly.jupyterlabConsole.historyMod.ConsoleHistory {
    /**
      * Construct a new console history object.
      */
    def this(options: typingsJapgolly.jupyterlabConsole.historyMod.ConsoleHistory.IOptions) = this()
  }
  
  @js.native
  class ConsolePanel protected ()
    extends typingsJapgolly.jupyterlabConsole.panelMod.ConsolePanel {
    /**
      * Construct a console panel.
      */
    def this(options: typingsJapgolly.jupyterlabConsole.panelMod.ConsolePanel.IOptions) = this()
  }
  
  @js.native
  class ForeignHandler protected ()
    extends typingsJapgolly.jupyterlabConsole.foreignMod.ForeignHandler {
    /**
      * Construct a new foreign message handler.
      */
    def this(options: typingsJapgolly.jupyterlabConsole.foreignMod.ForeignHandler.IOptions) = this()
  }
  
  val IConsoleTracker: Token[typingsJapgolly.jupyterlabConsole.tokensMod.IConsoleTracker] = js.native
  @js.native
  object CodeConsole extends js.Object {
    /**
      * Default implementation of `IContentFactory`.
      */
    @js.native
    class ContentFactory ()
      extends typingsJapgolly.jupyterlabConsole.widgetMod.CodeConsole.ContentFactory
    
    /**
      * The default implementation of an `IModelFactory`.
      */
    @js.native
    /**
      * Create a new cell model factory.
      */
    class ModelFactory ()
      extends typingsJapgolly.jupyterlabConsole.widgetMod.CodeConsole.ModelFactory {
      def this(options: IModelFactoryOptions) = this()
    }
    
    /**
      * A default content factory for the code console.
      */
    val defaultContentFactory: IContentFactory = js.native
    /**
      * The default `ModelFactory` instance.
      */
    val defaultModelFactory: typingsJapgolly.jupyterlabConsole.widgetMod.CodeConsole.ModelFactory = js.native
    /**
      * A namespace for the code console content factory.
      */
    @js.native
    object ContentFactory extends js.Object
    
  }
  
  @js.native
  object ConsolePanel extends js.Object {
    /**
      * Default implementation of `IContentFactory`.
      */
    @js.native
    class ContentFactory ()
      extends typingsJapgolly.jupyterlabConsole.panelMod.ConsolePanel.ContentFactory
    
    /**
      * The console renderer token.
      */
    val IContentFactory: Token[typingsJapgolly.jupyterlabConsole.panelMod.ConsolePanel.IContentFactory] = js.native
    /**
      * A default code console content factory.
      */
    val defaultContentFactory: typingsJapgolly.jupyterlabConsole.panelMod.ConsolePanel.IContentFactory = js.native
    /**
      * A namespace for the console panel content factory.
      */
    @js.native
    object ContentFactory extends js.Object
    
  }
  
}

