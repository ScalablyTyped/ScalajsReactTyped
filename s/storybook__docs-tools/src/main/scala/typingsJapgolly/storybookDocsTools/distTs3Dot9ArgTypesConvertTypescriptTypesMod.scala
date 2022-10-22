package typingsJapgolly.storybookDocsTools

import typingsJapgolly.storybookDocsTools.anon.PropertiesArray
import typingsJapgolly.storybookDocsTools.anon.Return
import typingsJapgolly.storybookDocsTools.storybookDocsToolsStrings.Array
import typingsJapgolly.storybookDocsTools.storybookDocsToolsStrings.`object`
import typingsJapgolly.storybookDocsTools.storybookDocsToolsStrings.any
import typingsJapgolly.storybookDocsTools.storybookDocsToolsStrings.boolean
import typingsJapgolly.storybookDocsTools.storybookDocsToolsStrings.function
import typingsJapgolly.storybookDocsTools.storybookDocsToolsStrings.intersection
import typingsJapgolly.storybookDocsTools.storybookDocsToolsStrings.number
import typingsJapgolly.storybookDocsTools.storybookDocsToolsStrings.signature
import typingsJapgolly.storybookDocsTools.storybookDocsToolsStrings.string
import typingsJapgolly.storybookDocsTools.storybookDocsToolsStrings.symbol
import typingsJapgolly.storybookDocsTools.storybookDocsToolsStrings.union
import typingsJapgolly.storybookDocsTools.storybookDocsToolsStrings.void
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9ArgTypesConvertTypescriptTypesMod {
  
  type TSArgType = TSType
  
  trait TSArrayType
    extends StObject
       with TSBaseType
       with TSType {
    
    var elements: js.Array[TSType]
    
    @JSName("name")
    var name_TSArrayType: Array
  }
  object TSArrayType {
    
    inline def apply(elements: js.Array[TSType]): TSArrayType = {
      val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], name = "Array")
      __obj.asInstanceOf[TSArrayType]
    }
    
    extension [Self <: TSArrayType](x: Self) {
      
      inline def setElements(value: js.Array[TSType]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
      
      inline def setElementsVarargs(value: TSType*): Self = StObject.set(x, "elements", js.Array(value*))
      
      inline def setName(value: Array): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait TSBaseType extends StObject {
    
    var name: String
    
    var raw: js.UndefOr[String] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object TSBaseType {
    
    inline def apply(name: String): TSBaseType = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[TSBaseType]
    }
    
    extension [Self <: TSBaseType](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait TSCombinationType
    extends StObject
       with TSBaseType
       with TSType {
    
    var elements: js.Array[TSType]
    
    @JSName("name")
    var name_TSCombinationType: union | intersection
  }
  object TSCombinationType {
    
    inline def apply(elements: js.Array[TSType], name: union | intersection): TSCombinationType = {
      val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[TSCombinationType]
    }
    
    extension [Self <: TSCombinationType](x: Self) {
      
      inline def setElements(value: js.Array[TSType]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
      
      inline def setElementsVarargs(value: TSType*): Self = StObject.set(x, "elements", js.Array(value*))
      
      inline def setName(value: union | intersection): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait TSFuncSigType
    extends StObject
       with TSBaseType
       with TSSigType {
    
    @JSName("name")
    var name_TSFuncSigType: signature
    
    var signature: Return
    
    @JSName("type")
    var type_TSFuncSigType: function
  }
  object TSFuncSigType {
    
    inline def apply(signature: Return): TSFuncSigType = {
      val __obj = js.Dynamic.literal(name = "signature", signature = signature.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("function")
      __obj.asInstanceOf[TSFuncSigType]
    }
    
    extension [Self <: TSFuncSigType](x: Self) {
      
      inline def setName(value: signature): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSignature(value: Return): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
      
      inline def setType(value: function): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait TSObjectSigType
    extends StObject
       with TSBaseType
       with TSSigType {
    
    @JSName("name")
    var name_TSObjectSigType: signature
    
    var signature: PropertiesArray
    
    @JSName("type")
    var type_TSObjectSigType: `object`
  }
  object TSObjectSigType {
    
    inline def apply(signature: PropertiesArray): TSObjectSigType = {
      val __obj = js.Dynamic.literal(name = "signature", signature = signature.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("object")
      __obj.asInstanceOf[TSObjectSigType]
    }
    
    extension [Self <: TSObjectSigType](x: Self) {
      
      inline def setName(value: signature): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSignature(value: PropertiesArray): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
      
      inline def setType(value: `object`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait TSScalarType
    extends StObject
       with TSBaseType
       with TSType {
    
    @JSName("name")
    var name_TSScalarType: any | boolean | number | void | string | symbol
  }
  object TSScalarType {
    
    inline def apply(name: any | boolean | number | void | string | symbol): TSScalarType = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[TSScalarType]
    }
    
    extension [Self <: TSScalarType](x: Self) {
      
      inline def setName(value: any | boolean | number | void | string | symbol): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.storybookDocsTools.distTs3Dot9ArgTypesConvertTypescriptTypesMod.TSObjectSigType
    - typingsJapgolly.storybookDocsTools.distTs3Dot9ArgTypesConvertTypescriptTypesMod.TSFuncSigType
  */
  trait TSSigType
    extends StObject
       with TSType
  object TSSigType {
    
    inline def TSFuncSigType(signature: Return): typingsJapgolly.storybookDocsTools.distTs3Dot9ArgTypesConvertTypescriptTypesMod.TSFuncSigType = {
      val __obj = js.Dynamic.literal(name = "signature", signature = signature.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("function")
      __obj.asInstanceOf[typingsJapgolly.storybookDocsTools.distTs3Dot9ArgTypesConvertTypescriptTypesMod.TSFuncSigType]
    }
    
    inline def TSObjectSigType(signature: PropertiesArray): typingsJapgolly.storybookDocsTools.distTs3Dot9ArgTypesConvertTypescriptTypesMod.TSObjectSigType = {
      val __obj = js.Dynamic.literal(name = "signature", signature = signature.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("object")
      __obj.asInstanceOf[typingsJapgolly.storybookDocsTools.distTs3Dot9ArgTypesConvertTypescriptTypesMod.TSObjectSigType]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.storybookDocsTools.distTs3Dot9ArgTypesConvertTypescriptTypesMod.TSScalarType
    - typingsJapgolly.storybookDocsTools.distTs3Dot9ArgTypesConvertTypescriptTypesMod.TSCombinationType
    - typingsJapgolly.storybookDocsTools.distTs3Dot9ArgTypesConvertTypescriptTypesMod.TSSigType
    - typingsJapgolly.storybookDocsTools.distTs3Dot9ArgTypesConvertTypescriptTypesMod.TSArrayType
  */
  trait TSType extends StObject
  object TSType {
    
    inline def TSArrayType(elements: js.Array[TSType]): typingsJapgolly.storybookDocsTools.distTs3Dot9ArgTypesConvertTypescriptTypesMod.TSArrayType = {
      val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], name = "Array")
      __obj.asInstanceOf[typingsJapgolly.storybookDocsTools.distTs3Dot9ArgTypesConvertTypescriptTypesMod.TSArrayType]
    }
    
    inline def TSCombinationType(elements: js.Array[TSType], name: union | intersection): typingsJapgolly.storybookDocsTools.distTs3Dot9ArgTypesConvertTypescriptTypesMod.TSCombinationType = {
      val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.storybookDocsTools.distTs3Dot9ArgTypesConvertTypescriptTypesMod.TSCombinationType]
    }
    
    inline def TSFuncSigType(signature: Return): typingsJapgolly.storybookDocsTools.distTs3Dot9ArgTypesConvertTypescriptTypesMod.TSFuncSigType = {
      val __obj = js.Dynamic.literal(name = "signature", signature = signature.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("function")
      __obj.asInstanceOf[typingsJapgolly.storybookDocsTools.distTs3Dot9ArgTypesConvertTypescriptTypesMod.TSFuncSigType]
    }
    
    inline def TSObjectSigType(signature: PropertiesArray): typingsJapgolly.storybookDocsTools.distTs3Dot9ArgTypesConvertTypescriptTypesMod.TSObjectSigType = {
      val __obj = js.Dynamic.literal(name = "signature", signature = signature.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("object")
      __obj.asInstanceOf[typingsJapgolly.storybookDocsTools.distTs3Dot9ArgTypesConvertTypescriptTypesMod.TSObjectSigType]
    }
    
    inline def TSScalarType(name: any | boolean | number | void | string | symbol): typingsJapgolly.storybookDocsTools.distTs3Dot9ArgTypesConvertTypescriptTypesMod.TSScalarType = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.storybookDocsTools.distTs3Dot9ArgTypesConvertTypescriptTypesMod.TSScalarType]
    }
  }
}
