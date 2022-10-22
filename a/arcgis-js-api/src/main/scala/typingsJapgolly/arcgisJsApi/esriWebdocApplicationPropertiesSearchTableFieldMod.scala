package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.SearchTableField
import typingsJapgolly.arcgisJsApi.esri.SearchTableFieldConstructor
import typingsJapgolly.arcgisJsApi.esri.SearchTableFieldProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWebdocApplicationPropertiesSearchTableFieldMod extends Shortcut {
  
  @JSImport("esri/webdoc/applicationProperties/SearchTableField", JSImport.Namespace)
  @js.native
  val ^ : js.Object & SearchTableFieldConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/webdoc/applicationProperties/SearchTableField", JSImport.Namespace)
  @js.native
  /**
    * Represents the field of a table to use for search.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-applicationProperties-SearchTableField.html)
    */
  open class Class ()
    extends StObject
       with SearchTableField {
    def this(properties: SearchTableFieldProperties) = this()
  }
  
  type _To = js.Object & SearchTableFieldConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWebdocApplicationPropertiesSearchTableFieldMod.foo` */
  override def _to: js.Object & SearchTableFieldConstructor = ^
}
