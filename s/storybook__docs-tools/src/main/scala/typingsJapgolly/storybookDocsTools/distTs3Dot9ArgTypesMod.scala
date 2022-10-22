package typingsJapgolly.storybookDocsTools

import typingsJapgolly.storybookAddons.distTs3Dot9TypesMod.Parameters
import typingsJapgolly.storybookDocsTools.distTs3Dot9ArgTypesDocgenExtractDocgenPropsMod.ExtractProps
import typingsJapgolly.storybookDocsTools.distTs3Dot9ArgTypesDocgenExtractDocgenPropsMod.ExtractedProp
import typingsJapgolly.storybookDocsTools.distTs3Dot9ArgTypesDocgenPropDefMod.PropSummaryValue
import typingsJapgolly.storybookDocsTools.distTs3Dot9ArgTypesDocgenTypesMod.DocgenInfo
import typingsJapgolly.storybookDocsTools.distTs3Dot9ArgTypesJsdocParserMod.ParseJsDoc_
import typingsJapgolly.storybookDocsTools.distTs3Dot9ArgTypesTypesMod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9ArgTypesMod {
  
  @JSImport("@storybook/docs-tools/dist/ts3.9/argTypes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@storybook/docs-tools/dist/ts3.9/argTypes", "MAX_DEFAULT_VALUE_SUMMARY_LENGTH")
  @js.native
  val MAX_DEFAULT_VALUE_SUMMARY_LENGTH: /* 50 */ Double = js.native
  
  @JSImport("@storybook/docs-tools/dist/ts3.9/argTypes", "MAX_TYPE_SUMMARY_LENGTH")
  @js.native
  val MAX_TYPE_SUMMARY_LENGTH: /* 90 */ Double = js.native
  
  @JSImport("@storybook/docs-tools/dist/ts3.9/argTypes", "TypeSystem")
  @js.native
  object TypeSystem extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsJapgolly.storybookDocsTools.distTs3Dot9ArgTypesDocgenTypesMod.TypeSystem & String
      ] = js.native
    
    /* "Flow" */ val FLOW: typingsJapgolly.storybookDocsTools.distTs3Dot9ArgTypesDocgenTypesMod.TypeSystem.FLOW & String = js.native
    
    /* "JavaScript" */ val JAVASCRIPT: typingsJapgolly.storybookDocsTools.distTs3Dot9ArgTypesDocgenTypesMod.TypeSystem.JAVASCRIPT & String = js.native
    
    /* "TypeScript" */ val TYPESCRIPT: typingsJapgolly.storybookDocsTools.distTs3Dot9ArgTypesDocgenTypesMod.TypeSystem.TYPESCRIPT & String = js.native
    
    /* "Unknown" */ val UNKNOWN: typingsJapgolly.storybookDocsTools.distTs3Dot9ArgTypesDocgenTypesMod.TypeSystem.UNKNOWN & String = js.native
  }
  
  inline def convert(docgenInfo: DocgenInfo): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("convert")(docgenInfo.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def createSummaryValue(summary: String): PropSummaryValue = ^.asInstanceOf[js.Dynamic].applyDynamic("createSummaryValue")(summary.asInstanceOf[js.Any]).asInstanceOf[PropSummaryValue]
  inline def createSummaryValue(summary: String, detail: String): PropSummaryValue = (^.asInstanceOf[js.Dynamic].applyDynamic("createSummaryValue")(summary.asInstanceOf[js.Any], detail.asInstanceOf[js.Any])).asInstanceOf[PropSummaryValue]
  
  inline def enhanceArgTypes[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](
    context: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryContextForEnhancers<TFramework, imported_csf.Args> */ Any
  ): (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_csf.StrictArgTypes<imported_csf.Args> */ Any) | Parameters = ^.asInstanceOf[js.Dynamic].applyDynamic("enhanceArgTypes")(context.asInstanceOf[js.Any]).asInstanceOf[(/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_csf.StrictArgTypes<imported_csf.Args> */ Any) | Parameters]
  
  inline def extractComponentDescription(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("extractComponentDescription")().asInstanceOf[String]
  inline def extractComponentDescription(component: Component): String = ^.asInstanceOf[js.Dynamic].applyDynamic("extractComponentDescription")(component.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@storybook/docs-tools/dist/ts3.9/argTypes", "extractComponentProps")
  @js.native
  val extractComponentProps: ExtractProps = js.native
  
  inline def extractComponentSectionArray(docgenSection: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("extractComponentSectionArray")(docgenSection.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def extractComponentSectionObject(docgenSection: Any): js.Array[ExtractedProp] = ^.asInstanceOf[js.Dynamic].applyDynamic("extractComponentSectionObject")(docgenSection.asInstanceOf[js.Any]).asInstanceOf[js.Array[ExtractedProp]]
  
  inline def getDocgenDescription(component: Component): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocgenDescription")(component.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getDocgenSection(component: Component, section: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getDocgenSection")(component.asInstanceOf[js.Any], section.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def hasDocgen(component: Component): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasDocgen")(component.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isDefaultValueBlacklisted(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDefaultValueBlacklisted")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isTooLongForDefaultValueSummary(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTooLongForDefaultValueSummary")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isTooLongForTypeSummary(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTooLongForTypeSummary")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValidDocgenSection(docgenSection: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidDocgenSection")(docgenSection.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def normalizeNewlines(string: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeNewlines")(string.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@storybook/docs-tools/dist/ts3.9/argTypes", "parseJsDoc")
  @js.native
  val parseJsDoc: ParseJsDoc_ = js.native
  
  inline def str(obj: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("str")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
}
