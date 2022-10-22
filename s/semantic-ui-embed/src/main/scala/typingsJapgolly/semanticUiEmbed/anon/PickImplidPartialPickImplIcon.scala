package typingsJapgolly.semanticUiEmbed.anon

import typingsJapgolly.semanticUiEmbed.SemanticUI.Embed.MetadataSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-embed.SemanticUI.Embed.MetadataSettings._Impl, 'id'> & std.Partial<std.Pick<semantic-ui-embed.SemanticUI.Embed.MetadataSettings._Impl, keyof semantic-ui-embed.SemanticUI.Embed.MetadataSettings._Impl>> */
trait PickImplidPartialPickImplIcon
  extends StObject
     with Param {
  
  var icon: js.UndefOr[String] = js.undefined
  
  var id: String & js.UndefOr[String]
  
  var placeholder: js.UndefOr[String] = js.undefined
  
  var source: js.UndefOr[String] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object PickImplidPartialPickImplIcon {
  
  inline def apply(id: String & js.UndefOr[String]): PickImplidPartialPickImplIcon = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplidPartialPickImplIcon]
  }
  
  extension [Self <: PickImplidPartialPickImplIcon](x: Self) {
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setId(value: String & js.UndefOr[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
