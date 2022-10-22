package typingsJapgolly.reservedWords

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reservedWords.reservedWordsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("reserved-words", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("reserved-words", "KEYWORDS")
  @js.native
  val KEYWORDS_ : Keywords = js.native
  
  inline def check(word: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("check")(word.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def check(word: String, dialect: Unit, strict: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(word.asInstanceOf[js.Any], dialect.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def check(word: String, dialect: Dialect): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(word.asInstanceOf[js.Any], dialect.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def check(word: String, dialect: Dialect, strict: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(word.asInstanceOf[js.Any], dialect.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reservedWords.reservedWordsInts.`3`
    - typingsJapgolly.reservedWords.reservedWordsInts.`5`
    - typingsJapgolly.reservedWords.reservedWordsInts.`6`
    - typingsJapgolly.reservedWords.reservedWordsInts.`7`
    - typingsJapgolly.reservedWords.reservedWordsStrings.es3
    - typingsJapgolly.reservedWords.reservedWordsStrings.es5
    - typingsJapgolly.reservedWords.reservedWordsStrings.es2015
    - typingsJapgolly.reservedWords.reservedWordsStrings.es7
    - typingsJapgolly.reservedWords.reservedWordsStrings.es6
    - typingsJapgolly.reservedWords.reservedWordsStrings.next
  */
  trait Dialect extends StObject
  object Dialect {
    
    inline def `3`: typingsJapgolly.reservedWords.reservedWordsInts.`3` = 3.asInstanceOf[typingsJapgolly.reservedWords.reservedWordsInts.`3`]
    
    inline def `5`: typingsJapgolly.reservedWords.reservedWordsInts.`5` = 5.asInstanceOf[typingsJapgolly.reservedWords.reservedWordsInts.`5`]
    
    inline def `6`: typingsJapgolly.reservedWords.reservedWordsInts.`6` = 6.asInstanceOf[typingsJapgolly.reservedWords.reservedWordsInts.`6`]
    
    inline def `7`: typingsJapgolly.reservedWords.reservedWordsInts.`7` = 7.asInstanceOf[typingsJapgolly.reservedWords.reservedWordsInts.`7`]
    
    inline def es2015: typingsJapgolly.reservedWords.reservedWordsStrings.es2015 = "es2015".asInstanceOf[typingsJapgolly.reservedWords.reservedWordsStrings.es2015]
    
    inline def es3: typingsJapgolly.reservedWords.reservedWordsStrings.es3 = "es3".asInstanceOf[typingsJapgolly.reservedWords.reservedWordsStrings.es3]
    
    inline def es5: typingsJapgolly.reservedWords.reservedWordsStrings.es5 = "es5".asInstanceOf[typingsJapgolly.reservedWords.reservedWordsStrings.es5]
    
    inline def es6: typingsJapgolly.reservedWords.reservedWordsStrings.es6 = "es6".asInstanceOf[typingsJapgolly.reservedWords.reservedWordsStrings.es6]
    
    inline def es7: typingsJapgolly.reservedWords.reservedWordsStrings.es7 = "es7".asInstanceOf[typingsJapgolly.reservedWords.reservedWordsStrings.es7]
    
    inline def next: typingsJapgolly.reservedWords.reservedWordsStrings.next = "next".asInstanceOf[typingsJapgolly.reservedWords.reservedWordsStrings.next]
  }
  
  type Keywords = StringDictionary[StringDictionary[`true`]]
}
