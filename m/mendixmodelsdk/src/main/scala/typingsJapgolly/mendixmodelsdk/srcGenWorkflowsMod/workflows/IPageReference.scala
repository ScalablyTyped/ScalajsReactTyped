package typingsJapgolly.mendixmodelsdk.srcGenWorkflowsMod.workflows

import typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.IPage
import typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.IElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 9.12.0: added public
  * In version 9.11.0: introduced
  */
@js.native
trait IPageReference
  extends StObject
     with IElement {
  
  val containerAsUserTask: IUserTask = js.native
  
  val containerAsWorkflow: IWorkflow = js.native
  
  @JSName("model")
  val model_IPageReference: IModel = js.native
  
  /**
    * In version 9.12.0: added public
    */
  val page: IPage | Null = js.native
  
  val pageQualifiedName: String | Null = js.native
}
