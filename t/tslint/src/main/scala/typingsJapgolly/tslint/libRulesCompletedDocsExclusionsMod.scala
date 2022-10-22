package typingsJapgolly.tslint

import typingsJapgolly.std.Map
import typingsJapgolly.tslint.libRulesCompletedDocsExclusionDescriptorsMod.IInputExclusionDescriptors
import typingsJapgolly.tslint.libRulesCompletedDocsExclusionMod.Exclusion
import typingsJapgolly.tslint.libRulesCompletedDocsRuleMod.DocType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRulesCompletedDocsExclusionsMod {
  
  @JSImport("tslint/lib/rules/completed-docs/exclusions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def constructExclusionsMap(ruleArguments: js.Array[IInputExclusionDescriptors]): ExclusionsMap = ^.asInstanceOf[js.Dynamic].applyDynamic("constructExclusionsMap")(ruleArguments.asInstanceOf[js.Any]).asInstanceOf[ExclusionsMap]
  
  trait DocTypeExclusions extends StObject {
    
    var overloadsSeparateDocs: js.UndefOr[Boolean] = js.undefined
    
    var requirements: js.Array[Exclusion[Any]]
  }
  object DocTypeExclusions {
    
    inline def apply(requirements: js.Array[Exclusion[Any]]): DocTypeExclusions = {
      val __obj = js.Dynamic.literal(requirements = requirements.asInstanceOf[js.Any])
      __obj.asInstanceOf[DocTypeExclusions]
    }
    
    extension [Self <: DocTypeExclusions](x: Self) {
      
      inline def setOverloadsSeparateDocs(value: Boolean): Self = StObject.set(x, "overloadsSeparateDocs", value.asInstanceOf[js.Any])
      
      inline def setOverloadsSeparateDocsUndefined: Self = StObject.set(x, "overloadsSeparateDocs", js.undefined)
      
      inline def setRequirements(value: js.Array[Exclusion[Any]]): Self = StObject.set(x, "requirements", value.asInstanceOf[js.Any])
      
      inline def setRequirementsVarargs(value: Exclusion[Any]*): Self = StObject.set(x, "requirements", js.Array(value*))
    }
  }
  
  type ExclusionsMap = Map[DocType, DocTypeExclusions]
}
