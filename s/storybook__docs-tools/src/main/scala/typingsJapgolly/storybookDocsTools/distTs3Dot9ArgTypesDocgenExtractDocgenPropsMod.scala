package typingsJapgolly.storybookDocsTools

import typingsJapgolly.storybookDocsTools.distTs3Dot9ArgTypesDocgenPropDefMod.PropDef
import typingsJapgolly.storybookDocsTools.distTs3Dot9ArgTypesDocgenTypesMod.DocgenInfo
import typingsJapgolly.storybookDocsTools.distTs3Dot9ArgTypesDocgenTypesMod.TypeSystem
import typingsJapgolly.storybookDocsTools.distTs3Dot9ArgTypesJsdocParserMod.ExtractedJsDoc
import typingsJapgolly.storybookDocsTools.distTs3Dot9ArgTypesTypesMod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9ArgTypesDocgenExtractDocgenPropsMod {
  
  @JSImport("@storybook/docs-tools/dist/ts3.9/argTypes/docgen/extractDocgenProps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def extractComponentDescription(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("extractComponentDescription")().asInstanceOf[String]
  inline def extractComponentDescription(component: Component): String = ^.asInstanceOf[js.Dynamic].applyDynamic("extractComponentDescription")(component.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@storybook/docs-tools/dist/ts3.9/argTypes/docgen/extractDocgenProps", "extractComponentProps")
  @js.native
  val extractComponentProps: ExtractProps = js.native
  
  inline def extractComponentSectionArray(docgenSection: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("extractComponentSectionArray")(docgenSection.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def extractComponentSectionObject(docgenSection: Any): js.Array[ExtractedProp] = ^.asInstanceOf[js.Dynamic].applyDynamic("extractComponentSectionObject")(docgenSection.asInstanceOf[js.Any]).asInstanceOf[js.Array[ExtractedProp]]
  
  type ExtractProps = js.Function2[/* component */ Component, /* section */ String, js.Array[ExtractedProp]]
  
  trait ExtractedProp extends StObject {
    
    var docgenInfo: DocgenInfo
    
    var jsDocTags: ExtractedJsDoc
    
    var propDef: PropDef
    
    var typeSystem: TypeSystem
  }
  object ExtractedProp {
    
    inline def apply(docgenInfo: DocgenInfo, jsDocTags: ExtractedJsDoc, propDef: PropDef, typeSystem: TypeSystem): ExtractedProp = {
      val __obj = js.Dynamic.literal(docgenInfo = docgenInfo.asInstanceOf[js.Any], jsDocTags = jsDocTags.asInstanceOf[js.Any], propDef = propDef.asInstanceOf[js.Any], typeSystem = typeSystem.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExtractedProp]
    }
    
    extension [Self <: ExtractedProp](x: Self) {
      
      inline def setDocgenInfo(value: DocgenInfo): Self = StObject.set(x, "docgenInfo", value.asInstanceOf[js.Any])
      
      inline def setJsDocTags(value: ExtractedJsDoc): Self = StObject.set(x, "jsDocTags", value.asInstanceOf[js.Any])
      
      inline def setPropDef(value: PropDef): Self = StObject.set(x, "propDef", value.asInstanceOf[js.Any])
      
      inline def setTypeSystem(value: TypeSystem): Self = StObject.set(x, "typeSystem", value.asInstanceOf[js.Any])
    }
  }
}
