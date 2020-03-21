package typingsJapgolly.materialMenuSurface

import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MouseEvent
import typingsJapgolly.materialBase.foundationMod.MDCFoundation
import typingsJapgolly.materialMenuSurface.adapterMod.MDCMenuSurfaceAdapter
import typingsJapgolly.materialMenuSurface.constantsMod.Corner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/menu-surface/foundation", JSImport.Namespace)
@js.native
object foundationMod extends js.Object {
  @js.native
  class MDCMenuSurfaceFoundation () extends MDCFoundation[MDCMenuSurfaceAdapter] {
    def this(adapter: PartialMDCMenuSurfaceAdap) = this()
    /**
      * Closes the menu surface.
      */
    def close(): Unit = js.native
    def close(skipRestoreFocus: Boolean): Unit = js.native
    // Subclasses should override this method to perform de-initialization routines (de-registering events, etc.)
    /* CompleteClass */
    override def destroy(): Unit = js.native
    /** Handle clicks and close if not within menu-surface element. */
    def handleBodyClick(evt: MouseEvent): Unit = js.native
    /** Handle keys that close the surface. */
    def handleKeydown(evt: KeyboardEvent): Unit = js.native
    // Subclasses should override this method to perform initialization routines (registering events, etc.)
    /* CompleteClass */
    override def init(): Unit = js.native
    def isOpen(): Boolean = js.native
    /**
      * Open the menu surface.
      */
    def open(): Unit = js.native
    /** Sets the menu-surface position on the page. */
    def setAbsolutePosition(x: Double, y: Double): Unit = js.native
    /**
      * @param corner Default anchor corner alignment of top-left menu surface corner.
      */
    def setAnchorCorner(corner: Corner): Unit = js.native
    /**
      * @param margin Set of margin values from anchor.
      */
    def setAnchorMargin(margin: PartialMDCMenuDistance): Unit = js.native
    /** Used to set the menu-surface calculations based on a fixed position menu. */
    def setFixedPosition(isFixedPosition: Boolean): Unit = js.native
    /** Used to indicate if the menu-surface is hoisted to the body. */
    def setIsHoisted(isHoisted: Boolean): Unit = js.native
    def setQuickOpen(quickOpen: Boolean): Unit = js.native
  }
  
  @js.native
  class default () extends MDCMenuSurfaceFoundation {
    def this(adapter: PartialMDCMenuSurfaceAdap) = this()
  }
  
  /* static members */
  @js.native
  object MDCMenuSurfaceFoundation extends js.Object {
    val Corner: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Corner */ js.Any = js.native
    val cssClasses: AnonANCHOR = js.native
    /**
      * @see {@link MDCMenuSurfaceAdapter} for typing information on parameters and return types.
      */
    val defaultAdapter: MDCMenuSurfaceAdapter = js.native
    val numbers: AnonANCHORTOMENUSURFACEWIDTHRATIO = js.native
    val strings: AnonCLOSEDEVENT = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    val Corner: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Corner */ js.Any = js.native
    val cssClasses: AnonANCHOR = js.native
    /**
      * @see {@link MDCMenuSurfaceAdapter} for typing information on parameters and return types.
      */
    val defaultAdapter: MDCMenuSurfaceAdapter = js.native
    val numbers: AnonANCHORTOMENUSURFACEWIDTHRATIO = js.native
    val strings: AnonCLOSEDEVENT = js.native
  }
  
}

