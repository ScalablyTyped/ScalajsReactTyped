package typingsJapgolly.jupyterlabApplication

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.jupyterlabApplication.frontendMod.JupyterFrontEnd.IOptions
import typingsJapgolly.jupyterlabApplication.frontendMod.JupyterFrontEnd.IPaths
import typingsJapgolly.jupyterlabApplication.frontendMod.JupyterFrontEnd.IShell
import typingsJapgolly.phosphorCoreutils.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/application", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  abstract class JupyterFrontEnd[T /* <: IShell */] protected ()
    extends typingsJapgolly.jupyterlabApplication.frontendMod.JupyterFrontEnd[T] {
    /**
      * Construct a new JupyterFrontEnd object.
      */
    def this(options: IOptions[T, _]) = this()
  }
  
  @js.native
  /**
    * Construct a new JupyterLab object.
    */
  class JupyterLab ()
    extends typingsJapgolly.jupyterlabApplication.labMod.JupyterLab {
    def this(options: typingsJapgolly.jupyterlabApplication.labMod.JupyterLab.IOptions) = this()
  }
  
  @js.native
  /**
    * Construct a new application shell.
    */
  class LabShell ()
    extends typingsJapgolly.jupyterlabApplication.shellMod.LabShell
  
  @js.native
  class LayoutRestorer protected ()
    extends typingsJapgolly.jupyterlabApplication.layoutrestorerMod.LayoutRestorer {
    /**
      * Create a layout restorer.
      */
    def this(options: typingsJapgolly.jupyterlabApplication.layoutrestorerMod.LayoutRestorer.IOptions) = this()
  }
  
  @js.native
  class Router protected ()
    extends typingsJapgolly.jupyterlabApplication.routerMod.Router {
    /**
      * Create a URL router.
      */
    def this(options: typingsJapgolly.jupyterlabApplication.routerMod.Router.IOptions) = this()
  }
  
  val ConnectionLost: typingsJapgolly.jupyterlabApplication.tokensMod.IConnectionLost = js.native
  val IConnectionLost: Token[typingsJapgolly.jupyterlabApplication.tokensMod.IConnectionLost] = js.native
  val ILabStatus: Token[typingsJapgolly.jupyterlabApplication.statusMod.ILabStatus] = js.native
  val ILayoutRestorer: Token[typingsJapgolly.jupyterlabApplication.layoutrestorerMod.ILayoutRestorer] = js.native
  val IMimeDocumentTracker: Token[typingsJapgolly.jupyterlabApplication.mimerenderersMod.IMimeDocumentTracker] = js.native
  @js.native
  object ILabShell
    extends TopLevel[Token[typingsJapgolly.jupyterlabApplication.shellMod.ILabShell]]
  
  @js.native
  object IRouter
    extends TopLevel[Token[typingsJapgolly.jupyterlabApplication.tokensMod.IRouter]]
  
  @js.native
  object JupyterFrontEnd extends js.Object {
    /**
      * The application paths dictionary token.
      */
    val IPaths: Token[typingsJapgolly.jupyterlabApplication.frontendMod.JupyterFrontEnd.IPaths] = js.native
  }
  
  @js.native
  object JupyterLab extends js.Object {
    /**
      * The layout restorer token.
      */
    val IInfo: Token[typingsJapgolly.jupyterlabApplication.labMod.JupyterLab.IInfo] = js.native
    /**
      * The default JupyterLab application info.
      */
    val defaultInfo: typingsJapgolly.jupyterlabApplication.labMod.JupyterLab.IInfo = js.native
    /**
      * The default JupyterLab application paths.
      */
    val defaultPaths: IPaths = js.native
  }
  
}

