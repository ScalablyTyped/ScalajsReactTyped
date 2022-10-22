package typingsJapgolly.koozakiRomajiConv

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * RomajiConv のインスタンスを返す
    *
    * @param someString 変換対象の文字列
    * @return のインスタンス
    */
  inline def apply(someString: String): RomajiConv = ^.asInstanceOf[js.Dynamic].apply(someString.asInstanceOf[js.Any]).asInstanceOf[RomajiConv]
  
  @JSImport("@koozaki/romaji-conv", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * 変換後のひらがなを返す
    *
    * @param someString 変換対象の文字列
    * @return 変換後のひらがな
    */
  inline def toHiragana(someString: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toHiragana")(someString.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * 変換後のカタカナを返す
    *
    * @param someString 変換対象の文字列
    * @return 変換後のカタカナ
    */
  inline def toKatakana(someString: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toKatakana")(someString.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait RomajiConv extends StObject {
    
    /**
      * 文字列の変換
      *
      * @param someString ローマ字 or ひらがな or カタカナ
      * @param mapObject マッピングオブジェクト
      * @return ひらがな or カタカナ
      */
    def convert(someString: String, mapObject: js.Object): String
    
    /**
      * 変換前の文字列を返す
      *
      * @return 変換前の文字列
      */
    def string(): String
    
    /**
      * 変換後のひらがなを返す
      *
      * @return 変換後のひらがな
      */
    def toHiragana(): String
    
    /**
      * 変換後のカタカナを返す
      *
      * @return 変換後のカタカナ
      */
    def toKatakana(): String
  }
  object RomajiConv {
    
    inline def apply(
      convert: (String, js.Object) => String,
      string: CallbackTo[String],
      toHiragana: CallbackTo[String],
      toKatakana: CallbackTo[String]
    ): RomajiConv = {
      val __obj = js.Dynamic.literal(convert = js.Any.fromFunction2(convert), string = string.toJsFn, toHiragana = toHiragana.toJsFn, toKatakana = toKatakana.toJsFn)
      __obj.asInstanceOf[RomajiConv]
    }
    
    extension [Self <: RomajiConv](x: Self) {
      
      inline def setConvert(value: (String, js.Object) => String): Self = StObject.set(x, "convert", js.Any.fromFunction2(value))
      
      inline def setString(value: CallbackTo[String]): Self = StObject.set(x, "string", value.toJsFn)
      
      inline def setToHiragana(value: CallbackTo[String]): Self = StObject.set(x, "toHiragana", value.toJsFn)
      
      inline def setToKatakana(value: CallbackTo[String]): Self = StObject.set(x, "toKatakana", value.toJsFn)
    }
  }
}
