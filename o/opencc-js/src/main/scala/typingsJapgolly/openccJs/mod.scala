package typingsJapgolly.openccJs

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("opencc-js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Converter(options: ConverterOptions): ConvertText = ^.asInstanceOf[js.Dynamic].applyDynamic("Converter")(options.asInstanceOf[js.Any]).asInstanceOf[ConvertText]
  
  inline def CustomConverter(dictionary: js.Array[js.Tuple2[String, String]]): ConvertText = ^.asInstanceOf[js.Dynamic].applyDynamic("CustomConverter")(dictionary.asInstanceOf[js.Any]).asInstanceOf[ConvertText]
  
  inline def HTMLConverter(converter: ConvertText, rootNode: Element, langAttrInitial: String, langAttrNew: String): HTMLConvertHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("HTMLConverter")(converter.asInstanceOf[js.Any], rootNode.asInstanceOf[js.Any], langAttrInitial.asInstanceOf[js.Any], langAttrNew.asInstanceOf[js.Any])).asInstanceOf[HTMLConvertHandler]
  
  type ConvertText = js.Function1[/* text */ String, String]
  
  trait ConverterOptions extends StObject {
    
    var from: js.UndefOr[Locale] = js.undefined
    
    var to: js.UndefOr[Locale] = js.undefined
  }
  object ConverterOptions {
    
    inline def apply(): ConverterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConverterOptions]
    }
    
    extension [Self <: ConverterOptions](x: Self) {
      
      inline def setFrom(value: Locale): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setTo(value: Locale): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
  
  trait HTMLConvertHandler extends StObject {
    
    def convert(): Unit
    
    def restore(): Unit
  }
  object HTMLConvertHandler {
    
    inline def apply(convert: Callback, restore: Callback): HTMLConvertHandler = {
      val __obj = js.Dynamic.literal(convert = convert.toJsFn, restore = restore.toJsFn)
      __obj.asInstanceOf[HTMLConvertHandler]
    }
    
    extension [Self <: HTMLConvertHandler](x: Self) {
      
      inline def setConvert(value: Callback): Self = StObject.set(x, "convert", value.toJsFn)
      
      inline def setRestore(value: Callback): Self = StObject.set(x, "restore", value.toJsFn)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.openccJs.openccJsStrings.cn
    - typingsJapgolly.openccJs.openccJsStrings.tw
    - typingsJapgolly.openccJs.openccJsStrings.twp
    - typingsJapgolly.openccJs.openccJsStrings.hk
    - typingsJapgolly.openccJs.openccJsStrings.jp
    - typingsJapgolly.openccJs.openccJsStrings.t
  */
  trait Locale extends StObject
  object Locale {
    
    inline def cn: typingsJapgolly.openccJs.openccJsStrings.cn = "cn".asInstanceOf[typingsJapgolly.openccJs.openccJsStrings.cn]
    
    inline def hk: typingsJapgolly.openccJs.openccJsStrings.hk = "hk".asInstanceOf[typingsJapgolly.openccJs.openccJsStrings.hk]
    
    inline def jp: typingsJapgolly.openccJs.openccJsStrings.jp = "jp".asInstanceOf[typingsJapgolly.openccJs.openccJsStrings.jp]
    
    inline def t: typingsJapgolly.openccJs.openccJsStrings.t = "t".asInstanceOf[typingsJapgolly.openccJs.openccJsStrings.t]
    
    inline def tw: typingsJapgolly.openccJs.openccJsStrings.tw = "tw".asInstanceOf[typingsJapgolly.openccJs.openccJsStrings.tw]
    
    inline def twp: typingsJapgolly.openccJs.openccJsStrings.twp = "twp".asInstanceOf[typingsJapgolly.openccJs.openccJsStrings.twp]
  }
}
