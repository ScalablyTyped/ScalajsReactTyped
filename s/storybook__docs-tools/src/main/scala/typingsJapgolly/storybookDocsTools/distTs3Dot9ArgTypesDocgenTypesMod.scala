package typingsJapgolly.storybookDocsTools

import typingsJapgolly.storybookDocsTools.anon.Rows
import typingsJapgolly.storybookDocsTools.distTs3Dot9ArgTypesTypesMod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9ArgTypesDocgenTypesMod {
  
  @js.native
  sealed trait TypeSystem extends StObject
  @JSImport("@storybook/docs-tools/dist/ts3.9/argTypes/docgen/types", "TypeSystem")
  @js.native
  object TypeSystem extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TypeSystem & String] = js.native
    
    @js.native
    sealed trait FLOW
      extends StObject
         with TypeSystem
    /* "Flow" */ val FLOW: typingsJapgolly.storybookDocsTools.distTs3Dot9ArgTypesDocgenTypesMod.TypeSystem.FLOW & String = js.native
    
    @js.native
    sealed trait JAVASCRIPT
      extends StObject
         with TypeSystem
    /* "JavaScript" */ val JAVASCRIPT: typingsJapgolly.storybookDocsTools.distTs3Dot9ArgTypesDocgenTypesMod.TypeSystem.JAVASCRIPT & String = js.native
    
    @js.native
    sealed trait TYPESCRIPT
      extends StObject
         with TypeSystem
    /* "TypeScript" */ val TYPESCRIPT: typingsJapgolly.storybookDocsTools.distTs3Dot9ArgTypesDocgenTypesMod.TypeSystem.TYPESCRIPT & String = js.native
    
    @js.native
    sealed trait UNKNOWN
      extends StObject
         with TypeSystem
    /* "Unknown" */ val UNKNOWN: typingsJapgolly.storybookDocsTools.distTs3Dot9ArgTypesDocgenTypesMod.TypeSystem.UNKNOWN & String = js.native
  }
  
  type ArgTypesExtractor = js.Function1[
    /* component */ Component, 
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StrictArgTypes */ Any) | Null
  ]
  
  trait DocgenFlowType
    extends StObject
       with DocgenType {
    
    var elements: js.UndefOr[js.Array[Any]] = js.undefined
    
    var raw: js.UndefOr[String] = js.undefined
    
    var signature: js.UndefOr[Any] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object DocgenFlowType {
    
    inline def apply(name: String): DocgenFlowType = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[DocgenFlowType]
    }
    
    extension [Self <: DocgenFlowType](x: Self) {
      
      inline def setElements(value: js.Array[Any]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
      
      inline def setElementsUndefined: Self = StObject.set(x, "elements", js.undefined)
      
      inline def setElementsVarargs(value: Any*): Self = StObject.set(x, "elements", js.Array(value*))
      
      inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
      
      inline def setSignature(value: Any): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
      
      inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DocgenInfo extends StObject {
    
    var defaultValue: js.UndefOr[DocgenPropDefaultValue] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var flowType: js.UndefOr[DocgenFlowType] = js.undefined
    
    var required: Boolean
    
    var tsType: js.UndefOr[DocgenTypeScriptType] = js.undefined
    
    var `type`: js.UndefOr[DocgenPropType] = js.undefined
  }
  object DocgenInfo {
    
    inline def apply(required: Boolean): DocgenInfo = {
      val __obj = js.Dynamic.literal(required = required.asInstanceOf[js.Any])
      __obj.asInstanceOf[DocgenInfo]
    }
    
    extension [Self <: DocgenInfo](x: Self) {
      
      inline def setDefaultValue(value: DocgenPropDefaultValue): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setFlowType(value: DocgenFlowType): Self = StObject.set(x, "flowType", value.asInstanceOf[js.Any])
      
      inline def setFlowTypeUndefined: Self = StObject.set(x, "flowType", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setTsType(value: DocgenTypeScriptType): Self = StObject.set(x, "tsType", value.asInstanceOf[js.Any])
      
      inline def setTsTypeUndefined: Self = StObject.set(x, "tsType", js.undefined)
      
      inline def setType(value: DocgenPropType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DocgenPropDefaultValue extends StObject {
    
    var computed: js.UndefOr[Boolean] = js.undefined
    
    var func: js.UndefOr[Boolean] = js.undefined
    
    var value: String
  }
  object DocgenPropDefaultValue {
    
    inline def apply(value: String): DocgenPropDefaultValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[DocgenPropDefaultValue]
    }
    
    extension [Self <: DocgenPropDefaultValue](x: Self) {
      
      inline def setComputed(value: Boolean): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
      
      inline def setComputedUndefined: Self = StObject.set(x, "computed", js.undefined)
      
      inline def setFunc(value: Boolean): Self = StObject.set(x, "func", value.asInstanceOf[js.Any])
      
      inline def setFuncUndefined: Self = StObject.set(x, "func", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait DocgenPropType
    extends StObject
       with DocgenType {
    
    var computed: js.UndefOr[Boolean] = js.undefined
    
    var raw: js.UndefOr[String] = js.undefined
  }
  object DocgenPropType {
    
    inline def apply(name: String): DocgenPropType = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[DocgenPropType]
    }
    
    extension [Self <: DocgenPropType](x: Self) {
      
      inline def setComputed(value: Boolean): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
      
      inline def setComputedUndefined: Self = StObject.set(x, "computed", js.undefined)
      
      inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    }
  }
  
  trait DocgenType extends StObject {
    
    var description: js.UndefOr[String] = js.undefined
    
    var name: String
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var value: js.UndefOr[Any] = js.undefined
  }
  object DocgenType {
    
    inline def apply(name: String): DocgenType = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[DocgenType]
    }
    
    extension [Self <: DocgenType](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type DocgenTypeScriptType = DocgenType
  
  type PropsExtractor = js.Function1[/* component */ Component, Rows | Null]
}
