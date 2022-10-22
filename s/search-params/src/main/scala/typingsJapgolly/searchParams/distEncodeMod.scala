package typingsJapgolly.searchParams

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEncodeMod {
  
  @JSImport("search-params/dist/encode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decode(value: Any, opts: IFinalOptions): String | Boolean | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(value.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String | Boolean | Null]
  
  inline def decodeValue(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeValue")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def encode(name: String, value: Any, opts: IFinalOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def encodeArray(name: String, arr: js.Array[Any], opts: IFinalOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeArray")(name.asInstanceOf[js.Any], arr.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def makeOptions(): IFinalOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("makeOptions")().asInstanceOf[IFinalOptions]
  inline def makeOptions(opts: IOptions): IFinalOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("makeOptions")(opts.asInstanceOf[js.Any]).asInstanceOf[IFinalOptions]
  
  trait IFinalOptions extends StObject {
    
    var arrayFormat: typingsJapgolly.searchParams.distEncodeMod.arrayFormat
    
    var booleanFormat: typingsJapgolly.searchParams.distEncodeMod.booleanFormat
    
    var nullFormat: typingsJapgolly.searchParams.distEncodeMod.nullFormat
  }
  object IFinalOptions {
    
    inline def apply(arrayFormat: arrayFormat, booleanFormat: booleanFormat, nullFormat: nullFormat): IFinalOptions = {
      val __obj = js.Dynamic.literal(arrayFormat = arrayFormat.asInstanceOf[js.Any], booleanFormat = booleanFormat.asInstanceOf[js.Any], nullFormat = nullFormat.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFinalOptions]
    }
    
    extension [Self <: IFinalOptions](x: Self) {
      
      inline def setArrayFormat(value: arrayFormat): Self = StObject.set(x, "arrayFormat", value.asInstanceOf[js.Any])
      
      inline def setBooleanFormat(value: booleanFormat): Self = StObject.set(x, "booleanFormat", value.asInstanceOf[js.Any])
      
      inline def setNullFormat(value: nullFormat): Self = StObject.set(x, "nullFormat", value.asInstanceOf[js.Any])
    }
  }
  
  trait IOptions extends StObject {
    
    var arrayFormat: js.UndefOr[typingsJapgolly.searchParams.distEncodeMod.arrayFormat] = js.undefined
    
    var booleanFormat: js.UndefOr[typingsJapgolly.searchParams.distEncodeMod.booleanFormat] = js.undefined
    
    var nullFormat: js.UndefOr[typingsJapgolly.searchParams.distEncodeMod.nullFormat] = js.undefined
  }
  object IOptions {
    
    inline def apply(): IOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IOptions]
    }
    
    extension [Self <: IOptions](x: Self) {
      
      inline def setArrayFormat(value: arrayFormat): Self = StObject.set(x, "arrayFormat", value.asInstanceOf[js.Any])
      
      inline def setArrayFormatUndefined: Self = StObject.set(x, "arrayFormat", js.undefined)
      
      inline def setBooleanFormat(value: booleanFormat): Self = StObject.set(x, "booleanFormat", value.asInstanceOf[js.Any])
      
      inline def setBooleanFormatUndefined: Self = StObject.set(x, "booleanFormat", js.undefined)
      
      inline def setNullFormat(value: nullFormat): Self = StObject.set(x, "nullFormat", value.asInstanceOf[js.Any])
      
      inline def setNullFormatUndefined: Self = StObject.set(x, "nullFormat", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.searchParams.searchParamsStrings.none
    - typingsJapgolly.searchParams.searchParamsStrings.brackets
    - typingsJapgolly.searchParams.searchParamsStrings.index
  */
  trait arrayFormat extends StObject
  object arrayFormat {
    
    inline def brackets: typingsJapgolly.searchParams.searchParamsStrings.brackets = "brackets".asInstanceOf[typingsJapgolly.searchParams.searchParamsStrings.brackets]
    
    inline def index: typingsJapgolly.searchParams.searchParamsStrings.index = "index".asInstanceOf[typingsJapgolly.searchParams.searchParamsStrings.index]
    
    inline def none: typingsJapgolly.searchParams.searchParamsStrings.none = "none".asInstanceOf[typingsJapgolly.searchParams.searchParamsStrings.none]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.searchParams.searchParamsStrings.none
    - typingsJapgolly.searchParams.searchParamsStrings.string
    - typingsJapgolly.searchParams.searchParamsStrings.unicode
    - typingsJapgolly.searchParams.searchParamsStrings.`empty-true`
  */
  trait booleanFormat extends StObject
  object booleanFormat {
    
    inline def `empty-true`: typingsJapgolly.searchParams.searchParamsStrings.`empty-true` = "empty-true".asInstanceOf[typingsJapgolly.searchParams.searchParamsStrings.`empty-true`]
    
    inline def none: typingsJapgolly.searchParams.searchParamsStrings.none = "none".asInstanceOf[typingsJapgolly.searchParams.searchParamsStrings.none]
    
    inline def string: typingsJapgolly.searchParams.searchParamsStrings.string = "string".asInstanceOf[typingsJapgolly.searchParams.searchParamsStrings.string]
    
    inline def unicode: typingsJapgolly.searchParams.searchParamsStrings.unicode = "unicode".asInstanceOf[typingsJapgolly.searchParams.searchParamsStrings.unicode]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.searchParams.searchParamsStrings.default
    - typingsJapgolly.searchParams.searchParamsStrings.string
    - typingsJapgolly.searchParams.searchParamsStrings.hidden
  */
  trait nullFormat extends StObject
  object nullFormat {
    
    inline def default: typingsJapgolly.searchParams.searchParamsStrings.default = "default".asInstanceOf[typingsJapgolly.searchParams.searchParamsStrings.default]
    
    inline def hidden: typingsJapgolly.searchParams.searchParamsStrings.hidden = "hidden".asInstanceOf[typingsJapgolly.searchParams.searchParamsStrings.hidden]
    
    inline def string: typingsJapgolly.searchParams.searchParamsStrings.string = "string".asInstanceOf[typingsJapgolly.searchParams.searchParamsStrings.string]
  }
}
