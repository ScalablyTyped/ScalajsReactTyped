package typingsJapgolly.ffiNapi

import typingsJapgolly.ffiNapi.mod.PFFI_TYPE
import typingsJapgolly.refNapi.mod.Pointer
import typingsJapgolly.refNapi.mod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Alignment extends StObject {
    
    var alignment: Type[Double]
    
    var elements: Type[Pointer[PFFI_TYPE]]
    
    var size: Type[String | Double]
    
    var `type`: Type[Double]
  }
  object Alignment {
    
    inline def apply(
      alignment: Type[Double],
      elements: Type[Pointer[PFFI_TYPE]],
      size: Type[String | Double],
      `type`: Type[Double]
    ): Alignment = {
      val __obj = js.Dynamic.literal(alignment = alignment.asInstanceOf[js.Any], elements = elements.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Alignment]
    }
    
    extension [Self <: Alignment](x: Self) {
      
      inline def setAlignment(value: Type[Double]): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      inline def setElements(value: Type[Pointer[PFFI_TYPE]]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Type[String | Double]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setType(value: Type[Double]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Elements extends StObject {
    
    var elements: Type[Pointer[PFFI_TYPE]]
  }
  object Elements {
    
    inline def apply(elements: Type[Pointer[PFFI_TYPE]]): Elements = {
      val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
      __obj.asInstanceOf[Elements]
    }
    
    extension [Self <: Elements](x: Self) {
      
      inline def setElements(value: Type[Pointer[PFFI_TYPE]]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    }
  }
}
