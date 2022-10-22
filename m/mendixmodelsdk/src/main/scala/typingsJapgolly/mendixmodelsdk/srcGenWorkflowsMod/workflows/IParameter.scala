package typingsJapgolly.mendixmodelsdk.srcGenWorkflowsMod.workflows

import typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IEntity
import typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IIndirectEntityRef
import typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.IByNameReferrable
import typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.IElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 9.6.0: introduced
  */
@js.native
trait IParameter
  extends StObject
     with IElement
     with IByNameReferrable {
  
  val containerAsWorkflow: IWorkflow = js.native
  
  /**
    * In version 9.10.0: introduced
    */
  val entity: IEntity | Null = js.native
  
  val entityQualifiedName: String | Null = js.native
  
  /**
    * In version 9.10.0: deleted
    */
  val entityRef: IIndirectEntityRef | Null = js.native
  
  @JSName("model")
  val model_IParameter: IModel = js.native
  
  /**
    * In version 9.18.0: introduced
    */
  val name: String = js.native
}
