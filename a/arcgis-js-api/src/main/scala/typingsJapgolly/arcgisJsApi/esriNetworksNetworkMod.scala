package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.Network
import typingsJapgolly.arcgisJsApi.esri.NetworkConstructor
import typingsJapgolly.arcgisJsApi.esri.NetworkProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriNetworksNetworkMod extends Shortcut {
  
  @JSImport("esri/networks/Network", JSImport.Namespace)
  @js.native
  val ^ : js.Object & NetworkConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/networks/Network", JSImport.Namespace)
  @js.native
  /**
    * Class defining high level properties that describes utility networks and trace networks.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-Network.html)
    */
  open class Class ()
    extends StObject
       with Network {
    def this(properties: NetworkProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & NetworkConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriNetworksNetworkMod.foo` */
  override def _to: js.Object & NetworkConstructor = ^
}
