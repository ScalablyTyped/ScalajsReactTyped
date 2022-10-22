package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.SearchResultRenderer
import typingsJapgolly.arcgisJsApi.esri.SearchResultRendererConstructor
import typingsJapgolly.arcgisJsApi.esri.SearchResultRendererProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsSearchSearchResultRendererMod extends Shortcut {
  
  @JSImport("esri/widgets/Search/SearchResultRenderer", JSImport.Namespace)
  @js.native
  val ^ : js.Object & SearchResultRendererConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Search/SearchResultRenderer", JSImport.Namespace)
  @js.native
  /**
    * The `SearchResultRenderer` renders the [Search](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html) widget results and allows expanding a DOM element to show alternative matches.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchResultRenderer.html)
    */
  open class Class ()
    extends StObject
       with SearchResultRenderer {
    def this(properties: SearchResultRendererProperties) = this()
  }
  
  type _To = js.Object & SearchResultRendererConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsSearchSearchResultRendererMod.foo` */
  override def _to: js.Object & SearchResultRendererConstructor = ^
}
