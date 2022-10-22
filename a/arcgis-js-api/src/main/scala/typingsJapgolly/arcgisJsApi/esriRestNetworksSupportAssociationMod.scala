package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.Association
import typingsJapgolly.arcgisJsApi.esri.AssociationConstructor
import typingsJapgolly.arcgisJsApi.esri.AssociationProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRestNetworksSupportAssociationMod extends Shortcut {
  
  @JSImport("esri/rest/networks/support/Association", JSImport.Namespace)
  @js.native
  val ^ : js.Object & AssociationConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/rest/networks/support/Association", JSImport.Namespace)
  @js.native
  /**
    * The utility network associations model connectivity, containment and structure relations between assets.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-Association.html)
    */
  open class Class ()
    extends StObject
       with Association {
    def this(properties: AssociationProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & AssociationConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriRestNetworksSupportAssociationMod.foo` */
  override def _to: js.Object & AssociationConstructor = ^
}
