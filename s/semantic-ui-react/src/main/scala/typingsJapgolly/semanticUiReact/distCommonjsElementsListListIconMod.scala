package typingsJapgolly.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.FC
import typingsJapgolly.semanticUiReact.distCommonjsElementsIconIconMod.StrictIconProps
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticVERTICALALIGNMENTS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsElementsListListIconMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/elements/List/ListIcon", JSImport.Default)
  @js.native
  val default: FC[ListIconProps] = js.native
  
  trait ListIconProps
    extends StObject
       with StrictListIconProps
       with /* key */ StringDictionary[Any]
  object ListIconProps {
    
    inline def apply(): ListIconProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListIconProps]
    }
  }
  
  trait StrictListIconProps
    extends StObject
       with StrictIconProps {
    
    /** An element inside a list can be vertically aligned. */
    var verticalAlign: js.UndefOr[SemanticVERTICALALIGNMENTS] = js.undefined
  }
  object StrictListIconProps {
    
    inline def apply(): StrictListIconProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictListIconProps]
    }
    
    extension [Self <: StrictListIconProps](x: Self) {
      
      inline def setVerticalAlign(value: SemanticVERTICALALIGNMENTS): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
      
      inline def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
    }
  }
  
  type _To = FC[ListIconProps]
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsElementsListListIconMod.foo` */
  override def _to: FC[ListIconProps] = default
}
