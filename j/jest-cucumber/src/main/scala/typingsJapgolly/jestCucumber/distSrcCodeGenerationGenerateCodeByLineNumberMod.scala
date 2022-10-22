package typingsJapgolly.jestCucumber

import typingsJapgolly.jestCucumber.distSrcModelsMod.ParsedFeature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCodeGenerationGenerateCodeByLineNumberMod {
  
  @JSImport("jest-cucumber/dist/src/code-generation/generate-code-by-line-number", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait ObjectTypeEnum extends StObject
  @JSImport("jest-cucumber/dist/src/code-generation/generate-code-by-line-number", "ObjectTypeEnum")
  @js.native
  object ObjectTypeEnum extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ObjectTypeEnum & Double] = js.native
    
    @js.native
    sealed trait scenario
      extends StObject
         with ObjectTypeEnum
    /* 0 */ val scenario: typingsJapgolly.jestCucumber.distSrcCodeGenerationGenerateCodeByLineNumberMod.ObjectTypeEnum.scenario & Double = js.native
    
    @js.native
    sealed trait scenarioOutline
      extends StObject
         with ObjectTypeEnum
    /* 1 */ val scenarioOutline: typingsJapgolly.jestCucumber.distSrcCodeGenerationGenerateCodeByLineNumberMod.ObjectTypeEnum.scenarioOutline & Double = js.native
    
    @js.native
    sealed trait step
      extends StObject
         with ObjectTypeEnum
    /* 2 */ val step: typingsJapgolly.jestCucumber.distSrcCodeGenerationGenerateCodeByLineNumberMod.ObjectTypeEnum.step & Double = js.native
  }
  
  inline def generateCodeFromFeature(feature: ParsedFeature, lineNumber: Double): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("generateCodeFromFeature")(feature.asInstanceOf[js.Any], lineNumber.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  
  inline def generateCodeWithSeparateFunctionsFromFeature(feature: ParsedFeature, lineNumber: Double): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("generateCodeWithSeparateFunctionsFromFeature")(feature.asInstanceOf[js.Any], lineNumber.asInstanceOf[js.Any])).asInstanceOf[String | Null]
}
