package typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels

import typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.srcGenWorkflowsMod.workflows.IParameter
import typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.IElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 9.6.0: added public
  * In version 7.11.0: introduced
  */
@js.native
trait IEntityRef
  extends StObject
     with IElement {
  
  val containerAsMemberRef: IMemberRef = js.native
  
  val containerAsParameter: IParameter = js.native
  
  @JSName("model")
  val model_IEntityRef: IModel = js.native
}
