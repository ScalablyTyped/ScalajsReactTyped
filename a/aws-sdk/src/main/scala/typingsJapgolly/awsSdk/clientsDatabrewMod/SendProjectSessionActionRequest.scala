package typingsJapgolly.awsSdk.clientsDatabrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendProjectSessionActionRequest extends StObject {
  
  /**
    * A unique identifier for an interactive session that's currently open and ready for work. The action will be performed on this session.
    */
  var ClientSessionId: js.UndefOr[typingsJapgolly.awsSdk.clientsDatabrewMod.ClientSessionId] = js.undefined
  
  /**
    * The name of the project to apply the action to.
    */
  var Name: ProjectName
  
  /**
    * If true, the result of the recipe step will be returned, but not applied.
    */
  var Preview: js.UndefOr[typingsJapgolly.awsSdk.clientsDatabrewMod.Preview] = js.undefined
  
  var RecipeStep: js.UndefOr[typingsJapgolly.awsSdk.clientsDatabrewMod.RecipeStep] = js.undefined
  
  /**
    * The index from which to preview a step. This index is used to preview the result of steps that have already been applied, so that the resulting view frame is from earlier in the view frame stack.
    */
  var StepIndex: js.UndefOr[typingsJapgolly.awsSdk.clientsDatabrewMod.StepIndex] = js.undefined
  
  var ViewFrame: js.UndefOr[typingsJapgolly.awsSdk.clientsDatabrewMod.ViewFrame] = js.undefined
}
object SendProjectSessionActionRequest {
  
  inline def apply(Name: ProjectName): SendProjectSessionActionRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendProjectSessionActionRequest]
  }
  
  extension [Self <: SendProjectSessionActionRequest](x: Self) {
    
    inline def setClientSessionId(value: ClientSessionId): Self = StObject.set(x, "ClientSessionId", value.asInstanceOf[js.Any])
    
    inline def setClientSessionIdUndefined: Self = StObject.set(x, "ClientSessionId", js.undefined)
    
    inline def setName(value: ProjectName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setPreview(value: Preview): Self = StObject.set(x, "Preview", value.asInstanceOf[js.Any])
    
    inline def setPreviewUndefined: Self = StObject.set(x, "Preview", js.undefined)
    
    inline def setRecipeStep(value: RecipeStep): Self = StObject.set(x, "RecipeStep", value.asInstanceOf[js.Any])
    
    inline def setRecipeStepUndefined: Self = StObject.set(x, "RecipeStep", js.undefined)
    
    inline def setStepIndex(value: StepIndex): Self = StObject.set(x, "StepIndex", value.asInstanceOf[js.Any])
    
    inline def setStepIndexUndefined: Self = StObject.set(x, "StepIndex", js.undefined)
    
    inline def setViewFrame(value: ViewFrame): Self = StObject.set(x, "ViewFrame", value.asInstanceOf[js.Any])
    
    inline def setViewFrameUndefined: Self = StObject.set(x, "ViewFrame", js.undefined)
  }
}
