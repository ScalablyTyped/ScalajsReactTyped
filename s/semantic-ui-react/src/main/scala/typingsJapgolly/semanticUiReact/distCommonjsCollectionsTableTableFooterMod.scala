package typingsJapgolly.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.FC
import typingsJapgolly.semanticUiReact.distCommonjsCollectionsTableTableHeaderMod.StrictTableHeaderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsCollectionsTableTableFooterMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/collections/Table/TableFooter", JSImport.Default)
  @js.native
  val default: FC[TableFooterProps] = js.native
  
  trait StrictTableFooterProps
    extends StObject
       with StrictTableHeaderProps
  object StrictTableFooterProps {
    
    inline def apply(): StrictTableFooterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictTableFooterProps]
    }
  }
  
  trait TableFooterProps
    extends StObject
       with StrictTableFooterProps
       with /* key */ StringDictionary[Any]
  object TableFooterProps {
    
    inline def apply(): TableFooterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableFooterProps]
    }
  }
  
  type _To = FC[TableFooterProps]
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsCollectionsTableTableFooterMod.foo` */
  override def _to: FC[TableFooterProps] = default
}
