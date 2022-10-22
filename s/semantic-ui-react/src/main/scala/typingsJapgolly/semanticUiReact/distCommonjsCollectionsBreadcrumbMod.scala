package typingsJapgolly.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.Component
import typingsJapgolly.semanticUiReact.distCommonjsCollectionsBreadcrumbBreadcrumbMod.BreadcrumbComponent
import typingsJapgolly.semanticUiReact.distCommonjsCollectionsBreadcrumbBreadcrumbMod.BreadcrumbProps
import typingsJapgolly.semanticUiReact.distCommonjsCollectionsBreadcrumbBreadcrumbSectionMod.BreadcrumbSectionProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsCollectionsBreadcrumbMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/collections/Breadcrumb", JSImport.Default)
  @js.native
  open class default protected ()
    extends Component[BreadcrumbProps, js.Object, Any] {
    def this(props: BreadcrumbProps) = this()
    def this(props: BreadcrumbProps, context: Any) = this()
  }
  object default extends Shortcut {
    
    @JSImport("semantic-ui-react/dist/commonjs/collections/Breadcrumb", JSImport.Default)
    @js.native
    val ^ : BreadcrumbComponent = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("semantic-ui-react/dist/commonjs/collections/Breadcrumb", "default.Section")
    @js.native
    open class Section protected ()
      extends Component[BreadcrumbSectionProps, js.Object, Any] {
      def this(props: BreadcrumbSectionProps) = this()
      def this(props: BreadcrumbSectionProps, context: Any) = this()
    }
    
    type _To = BreadcrumbComponent
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: BreadcrumbComponent = ^
  }
}
