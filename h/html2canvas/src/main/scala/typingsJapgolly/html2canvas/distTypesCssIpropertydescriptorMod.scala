package typingsJapgolly.html2canvas

import typingsJapgolly.html2canvas.distTypesCoreContextMod.Context
import typingsJapgolly.html2canvas.distTypesCssSyntaxParserMod.CSSValue
import typingsJapgolly.html2canvas.distTypesCssTypesMod.CSSTypes
import typingsJapgolly.html2canvas.html2canvasInts.`0`
import typingsJapgolly.html2canvas.html2canvasInts.`1`
import typingsJapgolly.html2canvas.html2canvasInts.`2`
import typingsJapgolly.html2canvas.html2canvasInts.`3`
import typingsJapgolly.html2canvas.html2canvasInts.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCssIpropertydescriptorMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.html2canvas.distTypesCssIpropertydescriptorMod.IPropertyValueDescriptor[T]
    - typingsJapgolly.html2canvas.distTypesCssIpropertydescriptorMod.IPropertyListDescriptor[T]
    - typingsJapgolly.html2canvas.distTypesCssIpropertydescriptorMod.IPropertyIdentValueDescriptor[T]
    - typingsJapgolly.html2canvas.distTypesCssIpropertydescriptorMod.IPropertyTypeValueDescriptor
    - typingsJapgolly.html2canvas.distTypesCssIpropertydescriptorMod.IPropertyTokenValueDescriptor
  */
  trait CSSPropertyDescriptor[T] extends StObject
  object CSSPropertyDescriptor {
    
    inline def IPropertyIdentValueDescriptor[T](initialValue: String, name: String, parse: (Context, String) => T, prefix: Boolean): typingsJapgolly.html2canvas.distTypesCssIpropertydescriptorMod.IPropertyIdentValueDescriptor[T] = {
      val __obj = js.Dynamic.literal(initialValue = initialValue.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parse = js.Any.fromFunction2(parse), prefix = prefix.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(2)
      __obj.asInstanceOf[typingsJapgolly.html2canvas.distTypesCssIpropertydescriptorMod.IPropertyIdentValueDescriptor[T]]
    }
    
    inline def IPropertyListDescriptor[T](initialValue: String, name: String, parse: (Context, js.Array[CSSValue]) => T, prefix: Boolean): typingsJapgolly.html2canvas.distTypesCssIpropertydescriptorMod.IPropertyListDescriptor[T] = {
      val __obj = js.Dynamic.literal(initialValue = initialValue.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parse = js.Any.fromFunction2(parse), prefix = prefix.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(1)
      __obj.asInstanceOf[typingsJapgolly.html2canvas.distTypesCssIpropertydescriptorMod.IPropertyListDescriptor[T]]
    }
    
    inline def IPropertyTokenValueDescriptor(initialValue: String, name: String, prefix: Boolean): typingsJapgolly.html2canvas.distTypesCssIpropertydescriptorMod.IPropertyTokenValueDescriptor = {
      val __obj = js.Dynamic.literal(initialValue = initialValue.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(4)
      __obj.asInstanceOf[typingsJapgolly.html2canvas.distTypesCssIpropertydescriptorMod.IPropertyTokenValueDescriptor]
    }
    
    inline def IPropertyTypeValueDescriptor(format: CSSTypes, initialValue: String, name: String, prefix: Boolean): typingsJapgolly.html2canvas.distTypesCssIpropertydescriptorMod.IPropertyTypeValueDescriptor = {
      val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], initialValue = initialValue.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(3)
      __obj.asInstanceOf[typingsJapgolly.html2canvas.distTypesCssIpropertydescriptorMod.IPropertyTypeValueDescriptor]
    }
    
    inline def IPropertyValueDescriptor[T](initialValue: String, name: String, parse: (Context, CSSValue) => T, prefix: Boolean): typingsJapgolly.html2canvas.distTypesCssIpropertydescriptorMod.IPropertyValueDescriptor[T] = {
      val __obj = js.Dynamic.literal(initialValue = initialValue.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parse = js.Any.fromFunction2(parse), prefix = prefix.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(0)
      __obj.asInstanceOf[typingsJapgolly.html2canvas.distTypesCssIpropertydescriptorMod.IPropertyValueDescriptor[T]]
    }
  }
  
  trait IPropertyDescriptor extends StObject {
    
    var initialValue: String
    
    var name: String
    
    var prefix: Boolean
    
    var `type`: PropertyDescriptorParsingType
  }
  object IPropertyDescriptor {
    
    inline def apply(initialValue: String, name: String, prefix: Boolean, `type`: PropertyDescriptorParsingType): IPropertyDescriptor = {
      val __obj = js.Dynamic.literal(initialValue = initialValue.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPropertyDescriptor]
    }
    
    extension [Self <: IPropertyDescriptor](x: Self) {
      
      inline def setInitialValue(value: String): Self = StObject.set(x, "initialValue", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: Boolean): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setType(value: PropertyDescriptorParsingType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait IPropertyIdentValueDescriptor[T]
    extends StObject
       with IPropertyDescriptor
       with CSSPropertyDescriptor[T] {
    
    def parse(context: Context, token: String): T
    
    @JSName("type")
    var type_IPropertyIdentValueDescriptor: `2`
  }
  object IPropertyIdentValueDescriptor {
    
    inline def apply[T](initialValue: String, name: String, parse: (Context, String) => T, prefix: Boolean): IPropertyIdentValueDescriptor[T] = {
      val __obj = js.Dynamic.literal(initialValue = initialValue.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parse = js.Any.fromFunction2(parse), prefix = prefix.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(2)
      __obj.asInstanceOf[IPropertyIdentValueDescriptor[T]]
    }
    
    extension [Self <: IPropertyIdentValueDescriptor[?], T](x: Self & IPropertyIdentValueDescriptor[T]) {
      
      inline def setParse(value: (Context, String) => T): Self = StObject.set(x, "parse", js.Any.fromFunction2(value))
      
      inline def setType(value: `2`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait IPropertyListDescriptor[T]
    extends StObject
       with IPropertyDescriptor
       with CSSPropertyDescriptor[T] {
    
    def parse(context: Context, tokens: js.Array[CSSValue]): T
    
    @JSName("type")
    var type_IPropertyListDescriptor: `1`
  }
  object IPropertyListDescriptor {
    
    inline def apply[T](initialValue: String, name: String, parse: (Context, js.Array[CSSValue]) => T, prefix: Boolean): IPropertyListDescriptor[T] = {
      val __obj = js.Dynamic.literal(initialValue = initialValue.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parse = js.Any.fromFunction2(parse), prefix = prefix.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(1)
      __obj.asInstanceOf[IPropertyListDescriptor[T]]
    }
    
    extension [Self <: IPropertyListDescriptor[?], T](x: Self & IPropertyListDescriptor[T]) {
      
      inline def setParse(value: (Context, js.Array[CSSValue]) => T): Self = StObject.set(x, "parse", js.Any.fromFunction2(value))
      
      inline def setType(value: `1`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait IPropertyTokenValueDescriptor
    extends StObject
       with IPropertyDescriptor
       with CSSPropertyDescriptor[Any] {
    
    @JSName("type")
    var type_IPropertyTokenValueDescriptor: `4`
  }
  object IPropertyTokenValueDescriptor {
    
    inline def apply(initialValue: String, name: String, prefix: Boolean): IPropertyTokenValueDescriptor = {
      val __obj = js.Dynamic.literal(initialValue = initialValue.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(4)
      __obj.asInstanceOf[IPropertyTokenValueDescriptor]
    }
    
    extension [Self <: IPropertyTokenValueDescriptor](x: Self) {
      
      inline def setType(value: `4`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait IPropertyTypeValueDescriptor
    extends StObject
       with IPropertyDescriptor
       with CSSPropertyDescriptor[Any] {
    
    var format: CSSTypes
    
    @JSName("type")
    var type_IPropertyTypeValueDescriptor: `3`
  }
  object IPropertyTypeValueDescriptor {
    
    inline def apply(format: CSSTypes, initialValue: String, name: String, prefix: Boolean): IPropertyTypeValueDescriptor = {
      val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], initialValue = initialValue.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(3)
      __obj.asInstanceOf[IPropertyTypeValueDescriptor]
    }
    
    extension [Self <: IPropertyTypeValueDescriptor](x: Self) {
      
      inline def setFormat(value: CSSTypes): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setType(value: `3`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait IPropertyValueDescriptor[T]
    extends StObject
       with IPropertyDescriptor
       with CSSPropertyDescriptor[T] {
    
    def parse(context: Context, token: CSSValue): T
    
    @JSName("type")
    var type_IPropertyValueDescriptor: `0`
  }
  object IPropertyValueDescriptor {
    
    inline def apply[T](initialValue: String, name: String, parse: (Context, CSSValue) => T, prefix: Boolean): IPropertyValueDescriptor[T] = {
      val __obj = js.Dynamic.literal(initialValue = initialValue.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parse = js.Any.fromFunction2(parse), prefix = prefix.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(0)
      __obj.asInstanceOf[IPropertyValueDescriptor[T]]
    }
    
    extension [Self <: IPropertyValueDescriptor[?], T](x: Self & IPropertyValueDescriptor[T]) {
      
      inline def setParse(value: (Context, CSSValue) => T): Self = StObject.set(x, "parse", js.Any.fromFunction2(value))
      
      inline def setType(value: `0`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.html2canvas.html2canvasInts.`0`
    - typingsJapgolly.html2canvas.html2canvasInts.`1`
    - typingsJapgolly.html2canvas.html2canvasInts.`2`
    - typingsJapgolly.html2canvas.html2canvasInts.`3`
    - typingsJapgolly.html2canvas.html2canvasInts.`4`
  */
  trait PropertyDescriptorParsingType extends StObject
  object PropertyDescriptorParsingType {
    
    inline def IDENT_VALUE: `2` = 2.asInstanceOf[`2`]
    
    inline def LIST: `1` = 1.asInstanceOf[`1`]
    
    inline def TOKEN_VALUE: `4` = 4.asInstanceOf[`4`]
    
    inline def TYPE_VALUE: `3` = 3.asInstanceOf[`3`]
    
    inline def VALUE: `0` = 0.asInstanceOf[`0`]
  }
}
