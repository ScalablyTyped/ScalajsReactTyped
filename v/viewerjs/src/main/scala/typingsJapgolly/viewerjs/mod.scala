package typingsJapgolly.viewerjs

import org.scalajs.dom.raw.Element
import typingsJapgolly.viewerjs.Viewer.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("viewerjs", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class default protected () extends Viewer {
    def this(element: Element) = this()
    def this(element: Element, options: Options) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    def noConflict(): Viewer = js.native
    def setDefaults(options: Options): Unit = js.native
    @js.native
    object ToolbarButtonSize extends js.Object {
      /* "large" */ val Large: typingsJapgolly.viewerjs.Viewer.ToolbarButtonSize.Large with String = js.native
      /* "medium" */ val Medium: typingsJapgolly.viewerjs.Viewer.ToolbarButtonSize.Medium with String = js.native
      /* "small" */ val Small: typingsJapgolly.viewerjs.Viewer.ToolbarButtonSize.Small with String = js.native
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsJapgolly.viewerjs.Viewer.ToolbarButtonSize with String] = js.native
    }
    
    @js.native
    object Visibility extends js.Object {
      /* 0 */ val Hidden: typingsJapgolly.viewerjs.Viewer.Visibility.Hidden with Double = js.native
      /* 1 */ val Visible: typingsJapgolly.viewerjs.Viewer.Visibility.Visible with Double = js.native
      /* 4 */ val VisibleOnExtraLargeOrWiderScreen: typingsJapgolly.viewerjs.Viewer.Visibility.VisibleOnExtraLargeOrWiderScreen with Double = js.native
      /* 3 */ val VisibleOnLargeOrWiderScreen: typingsJapgolly.viewerjs.Viewer.Visibility.VisibleOnLargeOrWiderScreen with Double = js.native
      /* 2 */ val VisibleOnMediumOrWiderScreen: typingsJapgolly.viewerjs.Viewer.Visibility.VisibleOnMediumOrWiderScreen with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.viewerjs.Viewer.Visibility with Double] = js.native
    }
    
  }
  
}

