package typingsJapgolly.extenso

import typingsJapgolly.extenso.extensoStrings.BRL
import typingsJapgolly.extenso.extensoStrings.EUR
import typingsJapgolly.extenso.extensoStrings.f
import typingsJapgolly.extenso.extensoStrings.formal
import typingsJapgolly.extenso.extensoStrings.informal
import typingsJapgolly.extenso.extensoStrings.m
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Decimal extends StObject {
    
    var decimal: js.UndefOr[formal | informal] = js.undefined
    
    var gender: js.UndefOr[m | f] = js.undefined
  }
  object Decimal {
    
    inline def apply(): Decimal = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Decimal]
    }
    
    extension [Self <: Decimal](x: Self) {
      
      inline def setDecimal(value: formal | informal): Self = StObject.set(x, "decimal", value.asInstanceOf[js.Any])
      
      inline def setDecimalUndefined: Self = StObject.set(x, "decimal", js.undefined)
      
      inline def setGender(value: m | f): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
      
      inline def setGenderUndefined: Self = StObject.set(x, "gender", js.undefined)
    }
  }
  
  trait Type extends StObject {
    
    var `type`: js.UndefOr[BRL | EUR] = js.undefined
  }
  object Type {
    
    inline def apply(): Type = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Type]
    }
    
    extension [Self <: Type](x: Self) {
      
      inline def setType(value: BRL | EUR): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
