package typingsJapgolly.cssLineBreak

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.utrie.mod.Trie
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLineBreakMod {
  
  @JSImport("css-line-break/dist/types/LineBreak", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("css-line-break/dist/types/LineBreak", "BREAK_ALLOWED")
  @js.native
  val BREAK_ALLOWED: /* "\\u00F7" */ String = js.native
  
  @JSImport("css-line-break/dist/types/LineBreak", "BREAK_MANDATORY")
  @js.native
  val BREAK_MANDATORY: /* "!" */ String = js.native
  
  @JSImport("css-line-break/dist/types/LineBreak", "BREAK_NOT_ALLOWED")
  @js.native
  val BREAK_NOT_ALLOWED: /* "\\u00D7" */ String = js.native
  
  @JSImport("css-line-break/dist/types/LineBreak", "LETTER_NUMBER_MODIFIER")
  @js.native
  val LETTER_NUMBER_MODIFIER: /* 50 */ Double = js.native
  
  inline def LineBreaker(str: String): ILineBreakIterator = ^.asInstanceOf[js.Dynamic].applyDynamic("LineBreaker")(str.asInstanceOf[js.Any]).asInstanceOf[ILineBreakIterator]
  inline def LineBreaker(str: String, options: IOptions): ILineBreakIterator = (^.asInstanceOf[js.Dynamic].applyDynamic("LineBreaker")(str.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ILineBreakIterator]
  
  @JSImport("css-line-break/dist/types/LineBreak", "UnicodeTrie")
  @js.native
  val UnicodeTrie: Trie = js.native
  
  inline def codePointsToCharacterClasses(codePoints: js.Array[Double]): js.Tuple3[js.Array[Double], js.Array[Double], js.Array[Boolean]] = ^.asInstanceOf[js.Dynamic].applyDynamic("codePointsToCharacterClasses")(codePoints.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[js.Array[Double], js.Array[Double], js.Array[Boolean]]]
  inline def codePointsToCharacterClasses(codePoints: js.Array[Double], lineBreak: String): js.Tuple3[js.Array[Double], js.Array[Double], js.Array[Boolean]] = (^.asInstanceOf[js.Dynamic].applyDynamic("codePointsToCharacterClasses")(codePoints.asInstanceOf[js.Any], lineBreak.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[js.Array[Double], js.Array[Double], js.Array[Boolean]]]
  
  inline def inlineBreakOpportunities(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("inlineBreakOpportunities")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def inlineBreakOpportunities(str: String, options: IOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("inlineBreakOpportunities")(str.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def lineBreakAtIndex(codePoints: js.Array[Double], index: Double): BREAK_OPPORTUNITIES = (^.asInstanceOf[js.Dynamic].applyDynamic("lineBreakAtIndex")(codePoints.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[BREAK_OPPORTUNITIES]
  
  type BREAK_OPPORTUNITIES = /* "\\u00D7" */ String
  
  trait Break extends StObject {
    
    /* private */ val codePoints: Any
    
    val end: Double
    
    val required: Boolean
    
    def slice(): String
    
    val start: Double
  }
  object Break {
    
    inline def apply(codePoints: Any, end: Double, required: Boolean, slice: CallbackTo[String], start: Double): Break = {
      val __obj = js.Dynamic.literal(codePoints = codePoints.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], slice = slice.toJsFn, start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[Break]
    }
    
    extension [Self <: Break](x: Self) {
      
      inline def setCodePoints(value: Any): Self = StObject.set(x, "codePoints", value.asInstanceOf[js.Any])
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setSlice(value: CallbackTo[String]): Self = StObject.set(x, "slice", value.toJsFn)
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait ILineBreakIterator extends StObject {
    
    def next(): LineBreak
  }
  object ILineBreakIterator {
    
    inline def apply(next: CallbackTo[LineBreak]): ILineBreakIterator = {
      val __obj = js.Dynamic.literal(next = next.toJsFn)
      __obj.asInstanceOf[ILineBreakIterator]
    }
    
    extension [Self <: ILineBreakIterator](x: Self) {
      
      inline def setNext(value: CallbackTo[LineBreak]): Self = StObject.set(x, "next", value.toJsFn)
    }
  }
  
  trait IOptions extends StObject {
    
    var lineBreak: js.UndefOr[LINE_BREAK] = js.undefined
    
    var wordBreak: js.UndefOr[WORD_BREAK] = js.undefined
  }
  object IOptions {
    
    inline def apply(): IOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IOptions]
    }
    
    extension [Self <: IOptions](x: Self) {
      
      inline def setLineBreak(value: LINE_BREAK): Self = StObject.set(x, "lineBreak", value.asInstanceOf[js.Any])
      
      inline def setLineBreakUndefined: Self = StObject.set(x, "lineBreak", js.undefined)
      
      inline def setWordBreak(value: WORD_BREAK): Self = StObject.set(x, "wordBreak", value.asInstanceOf[js.Any])
      
      inline def setWordBreakUndefined: Self = StObject.set(x, "wordBreak", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.cssLineBreak.cssLineBreakStrings.auto
    - typingsJapgolly.cssLineBreak.cssLineBreakStrings.normal
    - typingsJapgolly.cssLineBreak.cssLineBreakStrings.strict
  */
  trait LINE_BREAK extends StObject
  object LINE_BREAK {
    
    inline def auto: typingsJapgolly.cssLineBreak.cssLineBreakStrings.auto = "auto".asInstanceOf[typingsJapgolly.cssLineBreak.cssLineBreakStrings.auto]
    
    inline def normal: typingsJapgolly.cssLineBreak.cssLineBreakStrings.normal = "normal".asInstanceOf[typingsJapgolly.cssLineBreak.cssLineBreakStrings.normal]
    
    inline def strict: typingsJapgolly.cssLineBreak.cssLineBreakStrings.strict = "strict".asInstanceOf[typingsJapgolly.cssLineBreak.cssLineBreakStrings.strict]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.cssLineBreak.anon.Done
    - typingsJapgolly.cssLineBreak.anon.Value
  */
  trait LineBreak extends StObject
  object LineBreak {
    
    inline def Done(value: Null): typingsJapgolly.cssLineBreak.anon.Done = {
      val __obj = js.Dynamic.literal(done = true, value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.cssLineBreak.anon.Done]
    }
    
    inline def Value(value: Break): typingsJapgolly.cssLineBreak.anon.Value = {
      val __obj = js.Dynamic.literal(done = false, value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.cssLineBreak.anon.Value]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.cssLineBreak.cssLineBreakStrings.normal
    - typingsJapgolly.cssLineBreak.cssLineBreakStrings.`break-all`
    - typingsJapgolly.cssLineBreak.cssLineBreakStrings.`break-word`
    - typingsJapgolly.cssLineBreak.cssLineBreakStrings.`keep-all`
  */
  trait WORD_BREAK extends StObject
  object WORD_BREAK {
    
    inline def `break-all`: typingsJapgolly.cssLineBreak.cssLineBreakStrings.`break-all` = "break-all".asInstanceOf[typingsJapgolly.cssLineBreak.cssLineBreakStrings.`break-all`]
    
    inline def `break-word`: typingsJapgolly.cssLineBreak.cssLineBreakStrings.`break-word` = "break-word".asInstanceOf[typingsJapgolly.cssLineBreak.cssLineBreakStrings.`break-word`]
    
    inline def `keep-all`: typingsJapgolly.cssLineBreak.cssLineBreakStrings.`keep-all` = "keep-all".asInstanceOf[typingsJapgolly.cssLineBreak.cssLineBreakStrings.`keep-all`]
    
    inline def normal: typingsJapgolly.cssLineBreak.cssLineBreakStrings.normal = "normal".asInstanceOf[typingsJapgolly.cssLineBreak.cssLineBreakStrings.normal]
  }
}
