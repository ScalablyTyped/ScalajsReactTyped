package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.SearchLayerField
import typingsJapgolly.arcgisJsApi.esri.SearchLayerFieldConstructor
import typingsJapgolly.arcgisJsApi.esri.SearchLayerFieldProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWebdocApplicationPropertiesSearchLayerFieldMod extends Shortcut {
  
  @JSImport("esri/webdoc/applicationProperties/SearchLayerField", JSImport.Namespace)
  @js.native
  val ^ : js.Object & SearchLayerFieldConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/webdoc/applicationProperties/SearchLayerField", JSImport.Namespace)
  @js.native
  /**
    * Represents the field of a layer to use for search.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-applicationProperties-SearchLayerField.html)
    */
  open class Class ()
    extends StObject
       with SearchLayerField {
    def this(properties: SearchLayerFieldProperties) = this()
  }
  
  type _To = js.Object & SearchLayerFieldConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWebdocApplicationPropertiesSearchLayerFieldMod.foo` */
  override def _to: js.Object & SearchLayerFieldConstructor = ^
}
