package typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels

import typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.IByNameReferrable
import typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.IElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/attributes relevant section in reference guide}
  */
@js.native
trait IAttribute
  extends StObject
     with IElement
     with IByNameReferrable {
  
  /**
    * This property is required and cannot be set to null.
    *
    * In version 9.0.1: deleted
    * In version 8.13.0: introduced
    */
  val capabilities: IAttributeCapabilities = js.native
  
  val containerAsEntity: IEntity = js.native
  
  /**
    * In version 9.10.0: added public
    */
  val documentation: String = js.native
  
  @JSName("model")
  val model_IAttribute: IModel = js.native
  
  val name: String = js.native
  
  /**
    * This property is required and cannot be set to null.
    */
  val `type`: IAttributeType = js.native
  
  /**
    * This property is required and cannot be set to null.
    *
    * In version 6.6.0: added public
    */
  val value: IValueType = js.native
}
