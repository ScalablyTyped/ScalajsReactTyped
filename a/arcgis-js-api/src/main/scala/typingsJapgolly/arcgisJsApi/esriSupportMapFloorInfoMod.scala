package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.MapFloorInfo
import typingsJapgolly.arcgisJsApi.esri.MapFloorInfoConstructor
import typingsJapgolly.arcgisJsApi.esri.MapFloorInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriSupportMapFloorInfoMod extends Shortcut {
  
  @JSImport("esri/support/MapFloorInfo", JSImport.Namespace)
  @js.native
  val ^ : js.Object & MapFloorInfoConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/support/MapFloorInfo", JSImport.Namespace)
  @js.native
  /**
    * Floor-aware maps facilitate visualizing, editing, and analyzing indoor data and they allow for fast navigation of buildings in maps and scenes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-MapFloorInfo.html)
    */
  open class Class ()
    extends StObject
       with MapFloorInfo {
    def this(properties: MapFloorInfoProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & MapFloorInfoConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriSupportMapFloorInfoMod.foo` */
  override def _to: js.Object & MapFloorInfoConstructor = ^
}
