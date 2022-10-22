package typingsJapgolly.minappEnv.global

import typingsJapgolly.minappEnv.Intl.Collator
import typingsJapgolly.minappEnv.Intl.CollatorOptions
import typingsJapgolly.minappEnv.Intl.DateTimeFormat
import typingsJapgolly.minappEnv.Intl.DateTimeFormatOptions
import typingsJapgolly.minappEnv.Intl.NumberFormat
import typingsJapgolly.minappEnv.Intl.NumberFormatOptions
import typingsJapgolly.minappEnv.Intl.ResolvedCollatorOptions
import typingsJapgolly.minappEnv.Intl.ResolvedNumberFormatOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/////////////////////////////
/// ECMAScript Internationalization API
/////////////////////////////
object Intl {
  
  object Collator {
    
    inline def apply(): typingsJapgolly.minappEnv.Intl.Collator = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typingsJapgolly.minappEnv.Intl.Collator]
    inline def apply(locales: java.lang.String): typingsJapgolly.minappEnv.Intl.Collator = ^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.minappEnv.Intl.Collator]
    inline def apply(locales: java.lang.String, options: CollatorOptions): typingsJapgolly.minappEnv.Intl.Collator = (^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.minappEnv.Intl.Collator]
    inline def apply(locales: Unit, options: CollatorOptions): typingsJapgolly.minappEnv.Intl.Collator = (^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.minappEnv.Intl.Collator]
    inline def apply(locales: typingsJapgolly.minappEnv.Array[java.lang.String]): typingsJapgolly.minappEnv.Intl.Collator = ^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.minappEnv.Intl.Collator]
    inline def apply(locales: typingsJapgolly.minappEnv.Array[java.lang.String], options: CollatorOptions): typingsJapgolly.minappEnv.Intl.Collator = (^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.minappEnv.Intl.Collator]
    
    @JSGlobal("Intl.Collator")
    @js.native
    val ^ : js.Any = js.native
    
    inline def supportedLocalesOf(locales: java.lang.String): typingsJapgolly.minappEnv.Array[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.minappEnv.Array[java.lang.String]]
    inline def supportedLocalesOf(locales: java.lang.String, options: CollatorOptions): typingsJapgolly.minappEnv.Array[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.minappEnv.Array[java.lang.String]]
    inline def supportedLocalesOf(locales: typingsJapgolly.minappEnv.Array[java.lang.String]): typingsJapgolly.minappEnv.Array[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.minappEnv.Array[java.lang.String]]
    inline def supportedLocalesOf(locales: typingsJapgolly.minappEnv.Array[java.lang.String], options: CollatorOptions): typingsJapgolly.minappEnv.Array[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.minappEnv.Array[java.lang.String]]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Intl.Collator")
  @js.native
  open class CollatorCls ()
    extends StObject
       with Collator {
    def this(locales: java.lang.String) = this()
    def this(locales: typingsJapgolly.minappEnv.Array[java.lang.String]) = this()
    def this(locales: java.lang.String, options: CollatorOptions) = this()
    def this(locales: Unit, options: CollatorOptions) = this()
    def this(locales: typingsJapgolly.minappEnv.Array[java.lang.String], options: CollatorOptions) = this()
    
    /* CompleteClass */
    override def compare(x: java.lang.String, y: java.lang.String): Double = js.native
    
    /* CompleteClass */
    override def resolvedOptions(): ResolvedCollatorOptions = js.native
  }
  
  object DateTimeFormat {
    
    inline def apply(): typingsJapgolly.minappEnv.Intl.DateTimeFormat = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typingsJapgolly.minappEnv.Intl.DateTimeFormat]
    inline def apply(locales: java.lang.String): typingsJapgolly.minappEnv.Intl.DateTimeFormat = ^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.minappEnv.Intl.DateTimeFormat]
    inline def apply(locales: java.lang.String, options: DateTimeFormatOptions): typingsJapgolly.minappEnv.Intl.DateTimeFormat = (^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.minappEnv.Intl.DateTimeFormat]
    inline def apply(locales: Unit, options: DateTimeFormatOptions): typingsJapgolly.minappEnv.Intl.DateTimeFormat = (^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.minappEnv.Intl.DateTimeFormat]
    inline def apply(locales: typingsJapgolly.minappEnv.Array[java.lang.String]): typingsJapgolly.minappEnv.Intl.DateTimeFormat = ^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.minappEnv.Intl.DateTimeFormat]
    inline def apply(locales: typingsJapgolly.minappEnv.Array[java.lang.String], options: DateTimeFormatOptions): typingsJapgolly.minappEnv.Intl.DateTimeFormat = (^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.minappEnv.Intl.DateTimeFormat]
    
    @JSGlobal("Intl.DateTimeFormat")
    @js.native
    val ^ : js.Any = js.native
    
    inline def supportedLocalesOf(locales: java.lang.String): typingsJapgolly.minappEnv.Array[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.minappEnv.Array[java.lang.String]]
    inline def supportedLocalesOf(locales: java.lang.String, options: DateTimeFormatOptions): typingsJapgolly.minappEnv.Array[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.minappEnv.Array[java.lang.String]]
    inline def supportedLocalesOf(locales: typingsJapgolly.minappEnv.Array[java.lang.String]): typingsJapgolly.minappEnv.Array[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.minappEnv.Array[java.lang.String]]
    inline def supportedLocalesOf(locales: typingsJapgolly.minappEnv.Array[java.lang.String], options: DateTimeFormatOptions): typingsJapgolly.minappEnv.Array[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.minappEnv.Array[java.lang.String]]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Intl.DateTimeFormat")
  @js.native
  open class DateTimeFormatCls ()
    extends StObject
       with DateTimeFormat {
    def this(locales: java.lang.String) = this()
    def this(locales: typingsJapgolly.minappEnv.Array[java.lang.String]) = this()
    def this(locales: java.lang.String, options: DateTimeFormatOptions) = this()
    def this(locales: Unit, options: DateTimeFormatOptions) = this()
    def this(locales: typingsJapgolly.minappEnv.Array[java.lang.String], options: DateTimeFormatOptions) = this()
  }
  
  object NumberFormat {
    
    inline def apply(): typingsJapgolly.minappEnv.Intl.NumberFormat = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typingsJapgolly.minappEnv.Intl.NumberFormat]
    inline def apply(locales: java.lang.String): typingsJapgolly.minappEnv.Intl.NumberFormat = ^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.minappEnv.Intl.NumberFormat]
    inline def apply(locales: java.lang.String, options: NumberFormatOptions): typingsJapgolly.minappEnv.Intl.NumberFormat = (^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.minappEnv.Intl.NumberFormat]
    inline def apply(locales: Unit, options: NumberFormatOptions): typingsJapgolly.minappEnv.Intl.NumberFormat = (^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.minappEnv.Intl.NumberFormat]
    inline def apply(locales: typingsJapgolly.minappEnv.Array[java.lang.String]): typingsJapgolly.minappEnv.Intl.NumberFormat = ^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.minappEnv.Intl.NumberFormat]
    inline def apply(locales: typingsJapgolly.minappEnv.Array[java.lang.String], options: NumberFormatOptions): typingsJapgolly.minappEnv.Intl.NumberFormat = (^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.minappEnv.Intl.NumberFormat]
    
    @JSGlobal("Intl.NumberFormat")
    @js.native
    val ^ : js.Any = js.native
    
    inline def supportedLocalesOf(locales: java.lang.String): typingsJapgolly.minappEnv.Array[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.minappEnv.Array[java.lang.String]]
    inline def supportedLocalesOf(locales: java.lang.String, options: NumberFormatOptions): typingsJapgolly.minappEnv.Array[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.minappEnv.Array[java.lang.String]]
    inline def supportedLocalesOf(locales: typingsJapgolly.minappEnv.Array[java.lang.String]): typingsJapgolly.minappEnv.Array[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.minappEnv.Array[java.lang.String]]
    inline def supportedLocalesOf(locales: typingsJapgolly.minappEnv.Array[java.lang.String], options: NumberFormatOptions): typingsJapgolly.minappEnv.Array[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.minappEnv.Array[java.lang.String]]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Intl.NumberFormat")
  @js.native
  open class NumberFormatCls ()
    extends StObject
       with NumberFormat {
    def this(locales: java.lang.String) = this()
    def this(locales: typingsJapgolly.minappEnv.Array[java.lang.String]) = this()
    def this(locales: java.lang.String, options: NumberFormatOptions) = this()
    def this(locales: Unit, options: NumberFormatOptions) = this()
    def this(locales: typingsJapgolly.minappEnv.Array[java.lang.String], options: NumberFormatOptions) = this()
    
    /* CompleteClass */
    override def format(value: Double): java.lang.String = js.native
    
    /* CompleteClass */
    override def resolvedOptions(): ResolvedNumberFormatOptions = js.native
  }
}
