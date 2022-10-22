package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.DirectionPoint
import typingsJapgolly.arcgisJsApi.esri.DirectionPointConstructor
import typingsJapgolly.arcgisJsApi.esri.DirectionPointProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRestSupportDirectionPointMod extends Shortcut {
  
  @JSImport("esri/rest/support/DirectionPoint", JSImport.Namespace)
  @js.native
  val ^ : js.Object & DirectionPointConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/rest/support/DirectionPoint", JSImport.Namespace)
  @js.native
  /**
    * The DirectionPoint represents direction items as points with various display information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionPoint.html)
    */
  open class Class ()
    extends StObject
       with DirectionPoint {
    def this(properties: DirectionPointProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & DirectionPointConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriRestSupportDirectionPointMod.foo` */
  override def _to: js.Object & DirectionPointConstructor = ^
}
