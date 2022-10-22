package typingsJapgolly.arcgisJsApi.global.esri

import typingsJapgolly.arcgisJsApi.esri.SceneModificationProperties
import typingsJapgolly.arcgisJsApi.esri.SceneModificationsProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.SceneModifications")
@js.native
/**
  * A collection of [SceneModification](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SceneModification.html) with polygons and types to apply client-side modifications.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SceneModifications.html)
  */
open class SceneModificationsCls ()
  extends StObject
     with typingsJapgolly.arcgisJsApi.esri.SceneModifications {
  def this(properties: js.Array[SceneModificationProperties]) = this()
  def this(properties: typingsJapgolly.arcgisJsApi.esri.Collection[SceneModificationProperties]) = this()
  def this(properties: SceneModificationsProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
