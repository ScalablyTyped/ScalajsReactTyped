package typingsJapgolly.antvG2plot

import typingsJapgolly.antvG2.libInterfaceMod.TooltipCfg
import typingsJapgolly.antvG2plot.anon.NameValue
import typingsJapgolly.antvG2plot.antvG2plotBooleans.`false`
import typingsJapgolly.antvG2plot.libTypesAttrMod.TooltipAttr
import typingsJapgolly.antvG2plot.libTypesCommonMod.Datum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesTooltipMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.antvG2plot.antvG2plotBooleans.`false`
    - typingsJapgolly.antvG2plot.libTypesTooltipMod.TooltipOptions
  */
  trait Tooltip extends StObject
  
  trait TooltipMapping extends StObject {
    
    /**
      * @title 映射字段
      * @description 指定需要显示 tooltip 中的字段，默认是包含 x seriesFields y
      */
    val fields: js.UndefOr[js.Array[String] | `false`] = js.undefined
    
    /**
      * @title value 格式化
      */
    val formatter: js.UndefOr[TooltipAttr] = js.undefined
  }
  object TooltipMapping {
    
    inline def apply(): TooltipMapping = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipMapping]
    }
    
    extension [Self <: TooltipMapping](x: Self) {
      
      inline def setFields(value: js.Array[String] | `false`): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value*))
      
      inline def setFormatter(value: /* datum */ Datum => NameValue): Self = StObject.set(x, "formatter", js.Any.fromFunction1(value))
      
      inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
    }
  }
  
  trait TooltipOptions
    extends StObject
       with TooltipCfg
       with TooltipMapping
       with Tooltip
  object TooltipOptions {
    
    inline def apply(): TooltipOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipOptions]
    }
  }
}
