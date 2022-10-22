package typingsJapgolly.pluralsCldr

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Gets the CLDR cardinal plural forms for numbers in different locales.
  */
/* Inlined plurals-cldr.plurals-cldr.Plural & {  ordinal :plurals-cldr.plurals-cldr.Plural} */
object mod {
  
  inline def apply(locale: String, number: String): Form | Null = (^.asInstanceOf[js.Dynamic].apply(locale.asInstanceOf[js.Any], number.asInstanceOf[js.Any])).asInstanceOf[Form | Null]
  /**
    * Returns the form name for a given number. If the locale is not
    * supported, returns `null`.
    *
    * @param locale The locale code.
    * @param number The number to check. May be passed as a string to keep
    *     trailing zeroes.
    */
  inline def apply(locale: String, number: Double): Form | Null = (^.asInstanceOf[js.Dynamic].apply(locale.asInstanceOf[js.Any], number.asInstanceOf[js.Any])).asInstanceOf[Form | Null]
  
  @JSImport("plurals-cldr", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns an array of available forms for the given locale. If the
    * locale is not supported, returns `null`.
    *
    * @param locale The locale code.
    */
  inline def forms(locale: String): js.Array[Form] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("forms")(locale.asInstanceOf[js.Any]).asInstanceOf[js.Array[Form] | Null]
  
  inline def indexOf(locale: String, number: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(locale.asInstanceOf[js.Any], number.asInstanceOf[js.Any])).asInstanceOf[Double]
  /**
    * Returns the index of the form for a given number. If the locale is
    * not supported, returns `-1`.
    *
    * This is convenient for implementing a lookup from a compact, ordered
    * list. The order of forms for all locales is `zero`, `one`, `two`,
    * `few`, `many`, `other`. Remove the forms not used by a locale to get
    * the indices of each.
    *
    * @param locale The locale code.
    * @param number The number to check. May be passed as a string to keep
    *     trailing zeroes.
    */
  inline def indexOf(locale: String, number: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(locale.asInstanceOf[js.Any], number.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Gets the CLDR ordinal plural forms for numbers in different locales.
    */
  @JSImport("plurals-cldr", "ordinal")
  @js.native
  def ordinal: Plural = js.native
  inline def ordinal(locale: String, number: String): Form | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("ordinal")(locale.asInstanceOf[js.Any], number.asInstanceOf[js.Any])).asInstanceOf[Form | Null]
  /**
    * Returns the form name for a given number. If the locale is not
    * supported, returns `null`.
    *
    * @param locale The locale code.
    * @param number The number to check. May be passed as a string to keep
    *     trailing zeroes.
    */
  /**
    * Gets the CLDR ordinal plural forms for numbers in different locales.
    */
  inline def ordinal(locale: String, number: Double): Form | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("ordinal")(locale.asInstanceOf[js.Any], number.asInstanceOf[js.Any])).asInstanceOf[Form | Null]
  inline def ordinal_=(x: Plural): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ordinal")(x.asInstanceOf[js.Any])
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.pluralsCldr.pluralsCldrStrings.zero
    - typingsJapgolly.pluralsCldr.pluralsCldrStrings.one
    - typingsJapgolly.pluralsCldr.pluralsCldrStrings.two
    - typingsJapgolly.pluralsCldr.pluralsCldrStrings.few
    - typingsJapgolly.pluralsCldr.pluralsCldrStrings.many
    - typingsJapgolly.pluralsCldr.pluralsCldrStrings.other
  */
  trait Form extends StObject
  object Form {
    
    inline def few: typingsJapgolly.pluralsCldr.pluralsCldrStrings.few = "few".asInstanceOf[typingsJapgolly.pluralsCldr.pluralsCldrStrings.few]
    
    inline def many: typingsJapgolly.pluralsCldr.pluralsCldrStrings.many = "many".asInstanceOf[typingsJapgolly.pluralsCldr.pluralsCldrStrings.many]
    
    inline def one: typingsJapgolly.pluralsCldr.pluralsCldrStrings.one = "one".asInstanceOf[typingsJapgolly.pluralsCldr.pluralsCldrStrings.one]
    
    inline def other: typingsJapgolly.pluralsCldr.pluralsCldrStrings.other = "other".asInstanceOf[typingsJapgolly.pluralsCldr.pluralsCldrStrings.other]
    
    inline def two: typingsJapgolly.pluralsCldr.pluralsCldrStrings.two = "two".asInstanceOf[typingsJapgolly.pluralsCldr.pluralsCldrStrings.two]
    
    inline def zero: typingsJapgolly.pluralsCldr.pluralsCldrStrings.zero = "zero".asInstanceOf[typingsJapgolly.pluralsCldr.pluralsCldrStrings.zero]
  }
  
  @js.native
  trait Plural extends StObject {
    
    def apply(locale: String, number: String): Form | Null = js.native
    /**
      * Returns the form name for a given number. If the locale is not
      * supported, returns `null`.
      *
      * @param locale The locale code.
      * @param number The number to check. May be passed as a string to keep
      *     trailing zeroes.
      */
    def apply(locale: String, number: Double): Form | Null = js.native
    
    /**
      * Returns an array of available forms for the given locale. If the
      * locale is not supported, returns `null`.
      *
      * @param locale The locale code.
      */
    def forms(locale: String): js.Array[Form] | Null = js.native
    
    def indexOf(locale: String, number: String): Double = js.native
    /**
      * Returns the index of the form for a given number. If the locale is
      * not supported, returns `-1`.
      *
      * This is convenient for implementing a lookup from a compact, ordered
      * list. The order of forms for all locales is `zero`, `one`, `two`,
      * `few`, `many`, `other`. Remove the forms not used by a locale to get
      * the indices of each.
      *
      * @param locale The locale code.
      * @param number The number to check. May be passed as a string to keep
      *     trailing zeroes.
      */
    def indexOf(locale: String, number: Double): Double = js.native
  }
}
