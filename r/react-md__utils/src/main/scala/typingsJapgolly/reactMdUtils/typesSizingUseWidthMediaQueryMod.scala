package typingsJapgolly.reactMdUtils

import typingsJapgolly.reactMdUtils.reactMdUtilsStrings.max
import typingsJapgolly.reactMdUtils.reactMdUtilsStrings.min
import typingsJapgolly.reactMdUtils.typesSizingConstantsMod.QuerySize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSizingUseWidthMediaQueryMod {
  
  @JSImport("@react-md/utils/types/sizing/useWidthMediaQuery", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toWidthPart(v: Unit, prefix: min | max): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toWidthPart")(v.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def toWidthPart(v: QuerySize, prefix: min | max): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toWidthPart")(v.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def useWidthMediaQuery(hasMinMax: WidthMediaQuery & WidthMediaQuerys): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useWidthMediaQuery")(hasMinMax.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait WidthMediaQuery extends StObject {
    
    var max: js.UndefOr[QuerySize] = js.undefined
    
    var min: js.UndefOr[QuerySize] = js.undefined
  }
  object WidthMediaQuery {
    
    inline def apply(): WidthMediaQuery = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WidthMediaQuery]
    }
    
    extension [Self <: WidthMediaQuery](x: Self) {
      
      inline def setMax(value: QuerySize): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: QuerySize): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactMdUtils.anon.Min
    - typingsJapgolly.reactMdUtils.anon.Max
    - typingsJapgolly.reactMdUtils.anon.MaxMin
  */
  trait WidthMediaQuerys extends StObject
  object WidthMediaQuerys {
    
    inline def Max(max: QuerySize): typingsJapgolly.reactMdUtils.anon.Max = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.reactMdUtils.anon.Max]
    }
    
    inline def MaxMin(max: QuerySize, min: QuerySize): typingsJapgolly.reactMdUtils.anon.MaxMin = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.reactMdUtils.anon.MaxMin]
    }
    
    inline def Min(min: QuerySize): typingsJapgolly.reactMdUtils.anon.Min = {
      val __obj = js.Dynamic.literal(min = min.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.reactMdUtils.anon.Min]
    }
  }
}
