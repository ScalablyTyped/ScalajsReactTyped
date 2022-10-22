package typingsJapgolly.tslint

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.tslint.libRulesCompletedDocsRuleMod.DocType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRulesCompletedDocsExclusionDescriptorsMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.tslint.libRulesCompletedDocsBlockExclusionMod.IBlockExclusionDescriptor
    - typingsJapgolly.tslint.libRulesCompletedDocsClassExclusionMod.IClassExclusionDescriptor
    - typingsJapgolly.tslint.libRulesCompletedDocsTagExclusionMod.ITagExclusionDescriptor
  */
  trait ExclusionDescriptor extends StObject
  object ExclusionDescriptor {
    
    inline def IBlockExclusionDescriptor(): typingsJapgolly.tslint.libRulesCompletedDocsBlockExclusionMod.IBlockExclusionDescriptor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.tslint.libRulesCompletedDocsBlockExclusionMod.IBlockExclusionDescriptor]
    }
    
    inline def IClassExclusionDescriptor(): typingsJapgolly.tslint.libRulesCompletedDocsClassExclusionMod.IClassExclusionDescriptor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.tslint.libRulesCompletedDocsClassExclusionMod.IClassExclusionDescriptor]
    }
    
    inline def ITagExclusionDescriptor(): typingsJapgolly.tslint.libRulesCompletedDocsTagExclusionMod.ITagExclusionDescriptor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.tslint.libRulesCompletedDocsTagExclusionMod.ITagExclusionDescriptor]
    }
  }
  
  type IExclusionDescriptors = StringDictionary[ExclusionDescriptor]
  
  type IInputExclusionDescriptors = DocType | StringDictionary[InputExclusionDescriptor]
  
  type InputExclusionDescriptor = Boolean | ExclusionDescriptor
}
