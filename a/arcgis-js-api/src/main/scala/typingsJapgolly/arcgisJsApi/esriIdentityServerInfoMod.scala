package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.ServerInfo
import typingsJapgolly.arcgisJsApi.esri.ServerInfoConstructor
import typingsJapgolly.arcgisJsApi.esri.ServerInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriIdentityServerInfoMod extends Shortcut {
  
  @JSImport("esri/identity/ServerInfo", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ServerInfoConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/identity/ServerInfo", JSImport.Namespace)
  @js.native
  /**
    * This class contains information about an ArcGIS Server and its token endpoint.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-ServerInfo.html)
    */
  open class Class ()
    extends StObject
       with ServerInfo {
    def this(properties: ServerInfoProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & ServerInfoConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriIdentityServerInfoMod.foo` */
  override def _to: js.Object & ServerInfoConstructor = ^
}
