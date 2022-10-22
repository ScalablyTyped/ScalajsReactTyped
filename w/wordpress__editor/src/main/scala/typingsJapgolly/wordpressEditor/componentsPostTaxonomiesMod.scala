package typingsJapgolly.wordpressEditor

import japgolly.scalajs.react.facade.React.Node
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.wordpressCoreData.schemaMod.Schema.Taxonomy
import typingsJapgolly.wordpressEditor.componentsPostTaxonomiesMod.PostTaxonomies.Props
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.edit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsPostTaxonomiesMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/editor/components/post-taxonomies", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object PostTaxonomies {
    
    trait Props extends StObject {
      
      var children: js.UndefOr[scala.Nothing] = js.undefined
      
      var taxonomyWrapper: js.UndefOr[js.Function2[/* content */ Node, /* taxonomy */ Taxonomy[edit], Element]] = js.undefined
    }
    object Props {
      
      inline def apply(): Props = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Props]
      }
      
      extension [Self <: Props](x: Self) {
        
        inline def setTaxonomyWrapper(value: (/* content */ Node, /* taxonomy */ Taxonomy[edit]) => Element): Self = StObject.set(x, "taxonomyWrapper", js.Any.fromFunction2(value))
        
        inline def setTaxonomyWrapperUndefined: Self = StObject.set(x, "taxonomyWrapper", js.undefined)
      }
    }
  }
}
