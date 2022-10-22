package typingsJapgolly.maximMazurokGapiClientWebfonts

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientWebfonts.anon.Accesstoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gapi {
  
  object client {
    
    object webfonts {
      
      trait Webfont extends StObject {
        
        /** The category of the font. */
        var category: js.UndefOr[String] = js.undefined
        
        /** The name of the font. */
        var family: js.UndefOr[String] = js.undefined
        
        /** The font files (with all supported scripts) for each one of the available variants, as a key : value map. */
        var files: js.UndefOr[
                /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
              ] = js.undefined
        
        /** This kind represents a webfont object in the webfonts service. */
        var kind: js.UndefOr[String] = js.undefined
        
        /** The date (format "yyyy-MM-dd") the font was modified for the last time. */
        var lastModified: js.UndefOr[String] = js.undefined
        
        /** The scripts supported by the font. */
        var subsets: js.UndefOr[js.Array[String]] = js.undefined
        
        /** The available variants for the font. */
        var variants: js.UndefOr[js.Array[String]] = js.undefined
        
        /** The font version. */
        var version: js.UndefOr[String] = js.undefined
      }
      object Webfont {
        
        inline def apply(): Webfont = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[Webfont]
        }
        
        extension [Self <: Webfont](x: Self) {
          
          inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
          
          inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
          
          inline def setFamily(value: String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
          
          inline def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
          
          inline def setFiles(
            value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
          ): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
          
          inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
          
          inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
          
          inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
          
          inline def setLastModified(value: String): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
          
          inline def setLastModifiedUndefined: Self = StObject.set(x, "lastModified", js.undefined)
          
          inline def setSubsets(value: js.Array[String]): Self = StObject.set(x, "subsets", value.asInstanceOf[js.Any])
          
          inline def setSubsetsUndefined: Self = StObject.set(x, "subsets", js.undefined)
          
          inline def setSubsetsVarargs(value: String*): Self = StObject.set(x, "subsets", js.Array(value*))
          
          inline def setVariants(value: js.Array[String]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
          
          inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
          
          inline def setVariantsVarargs(value: String*): Self = StObject.set(x, "variants", js.Array(value*))
          
          inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
          
          inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
        }
      }
      
      trait WebfontList extends StObject {
        
        /** The list of fonts currently served by the Google Fonts API. */
        var items: js.UndefOr[js.Array[Webfont]] = js.undefined
        
        /** This kind represents a list of webfont objects in the webfonts service. */
        var kind: js.UndefOr[String] = js.undefined
      }
      object WebfontList {
        
        inline def apply(): WebfontList = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[WebfontList]
        }
        
        extension [Self <: WebfontList](x: Self) {
          
          inline def setItems(value: js.Array[Webfont]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
          
          inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
          
          inline def setItemsVarargs(value: Webfont*): Self = StObject.set(x, "items", js.Array(value*))
          
          inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
          
          inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        }
      }
      
      @js.native
      trait WebfontsResource extends StObject {
        
        /** Retrieves the list of fonts currently served by the Google Fonts Developer API. */
        def list(): Request[WebfontList] = js.native
        def list(request: Accesstoken): Request[WebfontList] = js.native
      }
    }
  }
}
