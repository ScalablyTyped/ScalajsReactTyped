package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.FieldsContent
import typingsJapgolly.arcgisJsApi.esri.FieldsContentConstructor
import typingsJapgolly.arcgisJsApi.esri.FieldsContentProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriPopupContentFieldsContentMod extends Shortcut {
  
  @JSImport("esri/popup/content/FieldsContent", JSImport.Namespace)
  @js.native
  val ^ : js.Object & FieldsContentConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/popup/content/FieldsContent", JSImport.Namespace)
  @js.native
  /**
    * A `FieldsContent` popup element represents the [FieldInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-FieldInfo.html) associated with a feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-FieldsContent.html)
    */
  open class Class ()
    extends StObject
       with FieldsContent {
    def this(properties: FieldsContentProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & FieldsContentConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriPopupContentFieldsContentMod.foo` */
  override def _to: js.Object & FieldsContentConstructor = ^
}
