package typingsJapgolly.fluentBundle

import typingsJapgolly.fluentBundle.anon.TypeofDateTimeFormat
import typingsJapgolly.fluentBundle.anon.TypeofNumberFormat
import typingsJapgolly.fluentBundle.anon.TypeofPluralRules
import typingsJapgolly.fluentBundle.esmAstMod.ComplexPattern
import typingsJapgolly.fluentBundle.esmBundleMod.FluentBundle
import typingsJapgolly.fluentBundle.esmBundleMod.FluentVariable
import typingsJapgolly.std.Intl.DateTimeFormat
import typingsJapgolly.std.Intl.DateTimeFormatOptions
import typingsJapgolly.std.Intl.NumberFormat
import typingsJapgolly.std.Intl.NumberFormatOptions
import typingsJapgolly.std.Intl.PluralRules
import typingsJapgolly.std.Intl.PluralRulesOptions
import typingsJapgolly.std.Record
import typingsJapgolly.std.WeakSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmScopeMod {
  
  @JSImport("@fluent/bundle/esm/scope", "Scope")
  @js.native
  open class Scope protected () extends StObject {
    def this(bundle: FluentBundle) = this()
    def this(bundle: FluentBundle, errors: js.Array[js.Error]) = this()
    def this(bundle: FluentBundle, errors: js.Array[js.Error], args: Record[String, FluentVariable]) = this()
    def this(bundle: FluentBundle, errors: Null, args: Record[String, FluentVariable]) = this()
    
    /** A dict of developer-provided variables. */
    var args: (Record[String, FluentVariable]) | Null = js.native
    
    /** The bundle for which the given resolution is happening. */
    var bundle: FluentBundle = js.native
    
    /** The Set of patterns already encountered during this resolution.
      * Used to detect and prevent cyclic resolutions. */
    var dirty: WeakSet[ComplexPattern] = js.native
    
    /** The list of errors collected while resolving. */
    var errors: js.Array[js.Error] | Null = js.native
    
    def memoizeIntlObject(ctor: TypeofDateTimeFormat, opts: DateTimeFormatOptions): DateTimeFormat = js.native
    def memoizeIntlObject(ctor: TypeofNumberFormat, opts: NumberFormatOptions): NumberFormat = js.native
    def memoizeIntlObject(ctor: TypeofPluralRules, opts: PluralRulesOptions): PluralRules = js.native
    
    /** A dict of parameters passed to a TermReference. */
    var params: (Record[String, FluentVariable]) | Null = js.native
    
    /** The running count of placeables resolved so far. Used to detect the
      * Billion Laughs and Quadratic Blowup attacks. */
    var placeables: Double = js.native
    
    def reportError(error: Any): Unit = js.native
  }
}
