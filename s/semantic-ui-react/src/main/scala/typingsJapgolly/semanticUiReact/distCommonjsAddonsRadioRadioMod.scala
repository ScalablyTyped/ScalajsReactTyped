package typingsJapgolly.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.FC
import typingsJapgolly.semanticUiReact.distCommonjsModulesCheckboxCheckboxMod.StrictCheckboxProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsAddonsRadioRadioMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/addons/Radio/Radio", JSImport.Default)
  @js.native
  val default: FC[RadioProps] = js.native
  
  trait RadioProps
    extends StObject
       with StrictRadioProps
       with /* key */ StringDictionary[Any]
  object RadioProps {
    
    inline def apply(): RadioProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RadioProps]
    }
  }
  
  trait StrictRadioProps
    extends StObject
       with StrictCheckboxProps
  object StrictRadioProps {
    
    inline def apply(): StrictRadioProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictRadioProps]
    }
  }
  
  type _To = FC[RadioProps]
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsAddonsRadioRadioMod.foo` */
  override def _to: FC[RadioProps] = default
}
