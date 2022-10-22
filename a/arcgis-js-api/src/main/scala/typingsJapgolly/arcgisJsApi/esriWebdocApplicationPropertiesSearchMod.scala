package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.Search
import typingsJapgolly.arcgisJsApi.esri.SearchConstructor
import typingsJapgolly.arcgisJsApi.esri.SearchProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWebdocApplicationPropertiesSearchMod extends Shortcut {
  
  @JSImport("esri/webdoc/applicationProperties/Search", JSImport.Namespace)
  @js.native
  val ^ : js.Object & SearchConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/webdoc/applicationProperties/Search", JSImport.Namespace)
  @js.native
  /**
    * Represents the search parameters set within the web scene or the web map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-applicationProperties-Search.html)
    */
  open class Class ()
    extends StObject
       with Search {
    def this(properties: SearchProperties) = this()
  }
  
  type _To = js.Object & SearchConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWebdocApplicationPropertiesSearchMod.foo` */
  override def _to: js.Object & SearchConstructor = ^
}
