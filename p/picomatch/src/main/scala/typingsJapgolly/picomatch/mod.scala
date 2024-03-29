package typingsJapgolly.picomatch

import typingsJapgolly.picomatch.anon.Close
import typingsJapgolly.picomatch.anon.IsMatch
import typingsJapgolly.picomatch.anon.MaxLength
import typingsJapgolly.picomatch.anon.STAR
import typingsJapgolly.picomatch.anon._empty
import typingsJapgolly.picomatch.libParseMod.ParseState
import typingsJapgolly.picomatch.libPicomatchMod.Glob
import typingsJapgolly.picomatch.libPicomatchMod.PicomatchOptions
import typingsJapgolly.picomatch.libPicomatchMod.ToRegexOptions
import typingsJapgolly.picomatch.libScanMod.Options
import typingsJapgolly.picomatch.libScanMod.State
import typingsJapgolly.picomatch.picomatchBooleans.`false`
import typingsJapgolly.picomatch.picomatchBooleans.`true`
import typingsJapgolly.std.Record
import typingsJapgolly.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Creates a matcher function from one or more glob patterns. The
    * returned function takes a string to match as its first argument,
    * and returns true if the string is a match. The returned matcher
    * function also takes a boolean as the second argument that, when true,
    * returns an object with additional information.
    *
    * ```js
    * const picomatch = require('picomatch');
    * // picomatch(glob[, options]);
    *
    * const isMatch = picomatch('*.!(*a)');
    * console.log(isMatch('a.a')); //=> false
    * console.log(isMatch('a.b')); //=> true
    * ```
    * @param glob One or more glob patterns.
    * @return Returns a matcher function.
    * @api public
    */
  inline def apply[T /* <: `true` | `false` */](glob: Glob): /* import warning: importer.ImportType#apply Failed type conversion: T extends true ? picomatch.picomatch/lib/picomatch.MatcherWithState : picomatch.picomatch/lib/picomatch.Matcher */ js.Any = ^.asInstanceOf[js.Dynamic].apply(glob.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends true ? picomatch.picomatch/lib/picomatch.MatcherWithState : picomatch.picomatch/lib/picomatch.Matcher */ js.Any]
  inline def apply[T /* <: `true` | `false` */](glob: Glob, options: Unit, returnState: T): /* import warning: importer.ImportType#apply Failed type conversion: T extends true ? picomatch.picomatch/lib/picomatch.MatcherWithState : picomatch.picomatch/lib/picomatch.Matcher */ js.Any = (^.asInstanceOf[js.Dynamic].apply(glob.asInstanceOf[js.Any], options.asInstanceOf[js.Any], returnState.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends true ? picomatch.picomatch/lib/picomatch.MatcherWithState : picomatch.picomatch/lib/picomatch.Matcher */ js.Any]
  inline def apply[T /* <: `true` | `false` */](glob: Glob, options: PicomatchOptions): /* import warning: importer.ImportType#apply Failed type conversion: T extends true ? picomatch.picomatch/lib/picomatch.MatcherWithState : picomatch.picomatch/lib/picomatch.Matcher */ js.Any = (^.asInstanceOf[js.Dynamic].apply(glob.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends true ? picomatch.picomatch/lib/picomatch.MatcherWithState : picomatch.picomatch/lib/picomatch.Matcher */ js.Any]
  inline def apply[T /* <: `true` | `false` */](glob: Glob, options: PicomatchOptions, returnState: T): /* import warning: importer.ImportType#apply Failed type conversion: T extends true ? picomatch.picomatch/lib/picomatch.MatcherWithState : picomatch.picomatch/lib/picomatch.Matcher */ js.Any = (^.asInstanceOf[js.Dynamic].apply(glob.asInstanceOf[js.Any], options.asInstanceOf[js.Any], returnState.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends true ? picomatch.picomatch/lib/picomatch.MatcherWithState : picomatch.picomatch/lib/picomatch.Matcher */ js.Any]
  
  @JSImport("picomatch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compileRe(state: ParseState): js.RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("compileRe")(state.asInstanceOf[js.Any]).asInstanceOf[js.RegExp]
  inline def compileRe(state: ParseState, options: Unit, returnOutput: Boolean): js.RegExp = (^.asInstanceOf[js.Dynamic].applyDynamic("compileRe")(state.asInstanceOf[js.Any], options.asInstanceOf[js.Any], returnOutput.asInstanceOf[js.Any])).asInstanceOf[js.RegExp]
  inline def compileRe(state: ParseState, options: Unit, returnOutput: Boolean, returnState: Boolean): js.RegExp = (^.asInstanceOf[js.Dynamic].applyDynamic("compileRe")(state.asInstanceOf[js.Any], options.asInstanceOf[js.Any], returnOutput.asInstanceOf[js.Any], returnState.asInstanceOf[js.Any])).asInstanceOf[js.RegExp]
  inline def compileRe(state: ParseState, options: Unit, returnOutput: Unit, returnState: Boolean): js.RegExp = (^.asInstanceOf[js.Dynamic].applyDynamic("compileRe")(state.asInstanceOf[js.Any], options.asInstanceOf[js.Any], returnOutput.asInstanceOf[js.Any], returnState.asInstanceOf[js.Any])).asInstanceOf[js.RegExp]
  inline def compileRe(state: ParseState, options: PicomatchOptions): js.RegExp = (^.asInstanceOf[js.Dynamic].applyDynamic("compileRe")(state.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.RegExp]
  inline def compileRe(state: ParseState, options: PicomatchOptions, returnOutput: Boolean): js.RegExp = (^.asInstanceOf[js.Dynamic].applyDynamic("compileRe")(state.asInstanceOf[js.Any], options.asInstanceOf[js.Any], returnOutput.asInstanceOf[js.Any])).asInstanceOf[js.RegExp]
  inline def compileRe(state: ParseState, options: PicomatchOptions, returnOutput: Boolean, returnState: Boolean): js.RegExp = (^.asInstanceOf[js.Dynamic].applyDynamic("compileRe")(state.asInstanceOf[js.Any], options.asInstanceOf[js.Any], returnOutput.asInstanceOf[js.Any], returnState.asInstanceOf[js.Any])).asInstanceOf[js.RegExp]
  inline def compileRe(state: ParseState, options: PicomatchOptions, returnOutput: Unit, returnState: Boolean): js.RegExp = (^.asInstanceOf[js.Dynamic].applyDynamic("compileRe")(state.asInstanceOf[js.Any], options.asInstanceOf[js.Any], returnOutput.asInstanceOf[js.Any], returnState.asInstanceOf[js.Any])).asInstanceOf[js.RegExp]
  
  object constants {
    
    @JSImport("picomatch", "constants")
    @js.native
    val ^ : js.Any = js.native
    
    // Digits
    @JSImport("picomatch", "constants.CHAR_0")
    @js.native
    def CHAR_0: Double = js.native
    inline def CHAR_0_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_0")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch", "constants.CHAR_9")
    @js.native
    def CHAR_9: Double = js.native
    inline def CHAR_9_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_9")(x.asInstanceOf[js.Any])
    
    // Non-alphabetic chars.
    @JSImport("picomatch", "constants.CHAR_AMPERSAND")
    @js.native
    def CHAR_AMPERSAND: Double = js.native
    inline def CHAR_AMPERSAND_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_AMPERSAND")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch", "constants.CHAR_ASTERISK")
    @js.native
    def CHAR_ASTERISK: Double = js.native
    inline def CHAR_ASTERISK_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_ASTERISK")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch", "constants.CHAR_AT")
    @js.native
    def CHAR_AT: Double = js.native
    inline def CHAR_AT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_AT")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch", "constants.CHAR_BACKWARD_SLASH")
    @js.native
    def CHAR_BACKWARD_SLASH: Double = js.native
    inline def CHAR_BACKWARD_SLASH_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_BACKWARD_SLASH")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch", "constants.CHAR_CARRIAGE_RETURN")
    @js.native
    def CHAR_CARRIAGE_RETURN: Double = js.native
    inline def CHAR_CARRIAGE_RETURN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_CARRIAGE_RETURN")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch", "constants.CHAR_CIRCUMFLEX_ACCENT")
    @js.native
    def CHAR_CIRCUMFLEX_ACCENT: Double = js.native
    inline def CHAR_CIRCUMFLEX_ACCENT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_CIRCUMFLEX_ACCENT")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch", "constants.CHAR_COLON")
    @js.native
    def CHAR_COLON: Double = js.native
    inline def CHAR_COLON_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_COLON")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch", "constants.CHAR_COMMA")
    @js.native
    def CHAR_COMMA: Double = js.native
    inline def CHAR_COMMA_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_COMMA")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch", "constants.CHAR_DOT")
    @js.native
    def CHAR_DOT: Double = js.native
    inline def CHAR_DOT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_DOT")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch", "constants.CHAR_DOUBLE_QUOTE")
    @js.native
    def CHAR_DOUBLE_QUOTE: Double = js.native
    inline def CHAR_DOUBLE_QUOTE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_DOUBLE_QUOTE")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch", "constants.CHAR_EQUAL")
    @js.native
    def CHAR_EQUAL: Double = js.native
    inline def CHAR_EQUAL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_EQUAL")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch", "constants.CHAR_EXCLAMATION_MARK")
    @js.native
    def CHAR_EXCLAMATION_MARK: Double = js.native
    inline def CHAR_EXCLAMATION_MARK_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_EXCLAMATION_MARK")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch", "constants.CHAR_FORM_FEED")
    @js.native
    def CHAR_FORM_FEED: Double = js.native
    inline def CHAR_FORM_FEED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_FORM_FEED")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch", "constants.CHAR_FORWARD_SLASH")
    @js.native
    def CHAR_FORWARD_SLASH: Double = js.native
    inline def CHAR_FORWARD_SLASH_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_FORWARD_SLASH")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch", "constants.CHAR_GRAVE_ACCENT")
    @js.native
    def CHAR_GRAVE_ACCENT: Double = js.native
    inline def CHAR_GRAVE_ACCENT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_GRAVE_ACCENT")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch", "constants.CHAR_HASH")
    @js.native
    def CHAR_HASH: Double = js.native
    inline def CHAR_HASH_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_HASH")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch", "constants.CHAR_HYPHEN_MINUS")
    @js.native
    def CHAR_HYPHEN_MINUS: Double = js.native
    inline def CHAR_HYPHEN_MINUS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_HYPHEN_MINUS")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch", "constants.CHAR_LEFT_ANGLE_BRACKET")
    @js.native
    def CHAR_LEFT_ANGLE_BRACKET: Double = js.native
    inline def CHAR_LEFT_ANGLE_BRACKET_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_LEFT_ANGLE_BRACKET")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch", "constants.CHAR_LEFT_CURLY_BRACE")
    @js.native
    def CHAR_LEFT_CURLY_BRACE: Double = js.native
    inline def CHAR_LEFT_CURLY_BRACE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_LEFT_CURLY_BRACE")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch", "constants.CHAR_LEFT_PARENTHESES")
    @js.native
    def CHAR_LEFT_PARENTHESES: Double = js.native
    inline def CHAR_LEFT_PARENTHESES_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_LEFT_PARENTHESES")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch", "constants.CHAR_LEFT_SQUARE_BRACKET")
    @js.native
    def CHAR_LEFT_SQUARE_BRACKET: Double = js.native
    inline def CHAR_LEFT_SQUARE_BRACKET_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_LEFT_SQUARE_BRACKET")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch", "constants.CHAR_LINE_FEED")
    @js.native
    def CHAR_LINE_FEED: Double = js.native
    inline def CHAR_LINE_FEED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_LINE_FEED")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch", "constants.CHAR_LOWERCASE_A")
    @js.native
    def CHAR_LOWERCASE_A: Double = js.native
    inline def CHAR_LOWERCASE_A_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_LOWERCASE_A")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch", "constants.CHAR_LOWERCASE_Z")
    @js.native
    def CHAR_LOWERCASE_Z: Double = js.native
    inline def CHAR_LOWERCASE_Z_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_LOWERCASE_Z")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch", "constants.CHAR_NO_BREAK_SPACE")
    @js.native
    def CHAR_NO_BREAK_SPACE: Double = js.native
    inline def CHAR_NO_BREAK_SPACE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_NO_BREAK_SPACE")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch", "constants.CHAR_PERCENT")
    @js.native
    def CHAR_PERCENT: Double = js.native
    inline def CHAR_PERCENT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_PERCENT")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch", "constants.CHAR_PLUS")
    @js.native
    def CHAR_PLUS: Double = js.native
    inline def CHAR_PLUS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_PLUS")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch", "constants.CHAR_QUESTION_MARK")
    @js.native
    def CHAR_QUESTION_MARK: Double = js.native
    inline def CHAR_QUESTION_MARK_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_QUESTION_MARK")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch", "constants.CHAR_RIGHT_ANGLE_BRACKET")
    @js.native
    def CHAR_RIGHT_ANGLE_BRACKET: Double = js.native
    inline def CHAR_RIGHT_ANGLE_BRACKET_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_RIGHT_ANGLE_BRACKET")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch", "constants.CHAR_RIGHT_CURLY_BRACE")
    @js.native
    def CHAR_RIGHT_CURLY_BRACE: Double = js.native
    inline def CHAR_RIGHT_CURLY_BRACE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_RIGHT_CURLY_BRACE")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch", "constants.CHAR_RIGHT_PARENTHESES")
    @js.native
    def CHAR_RIGHT_PARENTHESES: Double = js.native
    inline def CHAR_RIGHT_PARENTHESES_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_RIGHT_PARENTHESES")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch", "constants.CHAR_RIGHT_SQUARE_BRACKET")
    @js.native
    def CHAR_RIGHT_SQUARE_BRACKET: Double = js.native
    inline def CHAR_RIGHT_SQUARE_BRACKET_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_RIGHT_SQUARE_BRACKET")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch", "constants.CHAR_SEMICOLON")
    @js.native
    def CHAR_SEMICOLON: Double = js.native
    inline def CHAR_SEMICOLON_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_SEMICOLON")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch", "constants.CHAR_SINGLE_QUOTE")
    @js.native
    def CHAR_SINGLE_QUOTE: Double = js.native
    inline def CHAR_SINGLE_QUOTE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_SINGLE_QUOTE")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch", "constants.CHAR_SPACE")
    @js.native
    def CHAR_SPACE: Double = js.native
    inline def CHAR_SPACE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_SPACE")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch", "constants.CHAR_TAB")
    @js.native
    def CHAR_TAB: Double = js.native
    inline def CHAR_TAB_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_TAB")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch", "constants.CHAR_UNDERSCORE")
    @js.native
    def CHAR_UNDERSCORE: Double = js.native
    inline def CHAR_UNDERSCORE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_UNDERSCORE")(x.asInstanceOf[js.Any])
    
    // Alphabet chars.
    @JSImport("picomatch", "constants.CHAR_UPPERCASE_A")
    @js.native
    def CHAR_UPPERCASE_A: Double = js.native
    inline def CHAR_UPPERCASE_A_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_UPPERCASE_A")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch", "constants.CHAR_UPPERCASE_Z")
    @js.native
    def CHAR_UPPERCASE_Z: Double = js.native
    inline def CHAR_UPPERCASE_Z_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_UPPERCASE_Z")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch", "constants.CHAR_VERTICAL_LINE")
    @js.native
    def CHAR_VERTICAL_LINE: Double = js.native
    inline def CHAR_VERTICAL_LINE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_VERTICAL_LINE")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch", "constants.CHAR_ZERO_WIDTH_NOBREAK_SPACE")
    @js.native
    def CHAR_ZERO_WIDTH_NOBREAK_SPACE: Double = js.native
    inline def CHAR_ZERO_WIDTH_NOBREAK_SPACE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_ZERO_WIDTH_NOBREAK_SPACE")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch", "constants.MAX_LENGTH")
    @js.native
    def MAX_LENGTH: Double = js.native
    inline def MAX_LENGTH_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_LENGTH")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch", "constants.POSIX_REGEX_SOURCE")
    @js.native
    def POSIX_REGEX_SOURCE: /* import warning: importer.ImportType#apply Failed type conversion: typeof POSIX_REGEX_SOURCE */ js.Any = js.native
    inline def POSIX_REGEX_SOURCE_=(
      x: /* import warning: importer.ImportType#apply Failed type conversion: typeof POSIX_REGEX_SOURCE */ js.Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("POSIX_REGEX_SOURCE")(x.asInstanceOf[js.Any])
    
    // regular expressions
    @JSImport("picomatch", "constants.REGEX_BACKSLASH")
    @js.native
    def REGEX_BACKSLASH: js.RegExp = js.native
    inline def REGEX_BACKSLASH_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REGEX_BACKSLASH")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch", "constants.REGEX_NON_SPECIAL_CHARS")
    @js.native
    def REGEX_NON_SPECIAL_CHARS: js.RegExp = js.native
    inline def REGEX_NON_SPECIAL_CHARS_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REGEX_NON_SPECIAL_CHARS")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch", "constants.REGEX_REMOVE_BACKSLASH")
    @js.native
    def REGEX_REMOVE_BACKSLASH: js.RegExp = js.native
    inline def REGEX_REMOVE_BACKSLASH_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REGEX_REMOVE_BACKSLASH")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch", "constants.REGEX_SPECIAL_CHARS")
    @js.native
    def REGEX_SPECIAL_CHARS: js.RegExp = js.native
    inline def REGEX_SPECIAL_CHARS_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REGEX_SPECIAL_CHARS")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch", "constants.REGEX_SPECIAL_CHARS_BACKREF")
    @js.native
    def REGEX_SPECIAL_CHARS_BACKREF: js.RegExp = js.native
    inline def REGEX_SPECIAL_CHARS_BACKREF_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REGEX_SPECIAL_CHARS_BACKREF")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch", "constants.REGEX_SPECIAL_CHARS_GLOBAL")
    @js.native
    def REGEX_SPECIAL_CHARS_GLOBAL: js.RegExp = js.native
    inline def REGEX_SPECIAL_CHARS_GLOBAL_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REGEX_SPECIAL_CHARS_GLOBAL")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch", "constants.REPLACEMENTS")
    @js.native
    def REPLACEMENTS: _empty = js.native
    inline def REPLACEMENTS_=(x: _empty): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REPLACEMENTS")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch", "constants.SEP")
    @js.native
    def SEP: String = js.native
    inline def SEP_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SEP")(x.asInstanceOf[js.Any])
    
    inline def extGlobChars(chars: STAR): Record[String, Close] = ^.asInstanceOf[js.Dynamic].applyDynamic("extGlobChars")(chars.asInstanceOf[js.Any]).asInstanceOf[Record[String, Close]]
    
    inline def globChars[T /* <: Boolean */](win32: T): /* import warning: importer.ImportType#apply Failed type conversion: T extends true ? typeof WINDOWS_CHARS : typeof POSIX_CHARS */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("globChars")(win32.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends true ? typeof WINDOWS_CHARS : typeof POSIX_CHARS */ js.Any]
  }
  
  inline def isMatch(str: String, patterns: Glob): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMatch")(str.asInstanceOf[js.Any], patterns.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isMatch(str: String, patterns: Glob, options: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMatch")(str.asInstanceOf[js.Any], patterns.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isMatch(str: js.Array[String], patterns: Glob): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMatch")(str.asInstanceOf[js.Any], patterns.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isMatch(str: js.Array[String], patterns: Glob, options: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMatch")(str.asInstanceOf[js.Any], patterns.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def makeRe(input: String): ReturnType[
    js.Function4[
      /* state */ ParseState, 
      /* options */ js.UndefOr[PicomatchOptions], 
      /* returnOutput */ js.UndefOr[Boolean], 
      /* returnState */ js.UndefOr[Boolean], 
      js.RegExp
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeRe")(input.asInstanceOf[js.Any]).asInstanceOf[ReturnType[
    js.Function4[
      /* state */ ParseState, 
      /* options */ js.UndefOr[PicomatchOptions], 
      /* returnOutput */ js.UndefOr[Boolean], 
      /* returnState */ js.UndefOr[Boolean], 
      js.RegExp
    ]
  ]]
  inline def makeRe(input: String, options: Unit, returnOutput: Boolean): ReturnType[
    js.Function4[
      /* state */ ParseState, 
      /* options */ js.UndefOr[PicomatchOptions], 
      /* returnOutput */ js.UndefOr[Boolean], 
      /* returnState */ js.UndefOr[Boolean], 
      js.RegExp
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeRe")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], returnOutput.asInstanceOf[js.Any])).asInstanceOf[ReturnType[
    js.Function4[
      /* state */ ParseState, 
      /* options */ js.UndefOr[PicomatchOptions], 
      /* returnOutput */ js.UndefOr[Boolean], 
      /* returnState */ js.UndefOr[Boolean], 
      js.RegExp
    ]
  ]]
  inline def makeRe(input: String, options: Unit, returnOutput: Boolean, returnState: Boolean): ReturnType[
    js.Function4[
      /* state */ ParseState, 
      /* options */ js.UndefOr[PicomatchOptions], 
      /* returnOutput */ js.UndefOr[Boolean], 
      /* returnState */ js.UndefOr[Boolean], 
      js.RegExp
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeRe")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], returnOutput.asInstanceOf[js.Any], returnState.asInstanceOf[js.Any])).asInstanceOf[ReturnType[
    js.Function4[
      /* state */ ParseState, 
      /* options */ js.UndefOr[PicomatchOptions], 
      /* returnOutput */ js.UndefOr[Boolean], 
      /* returnState */ js.UndefOr[Boolean], 
      js.RegExp
    ]
  ]]
  inline def makeRe(input: String, options: Unit, returnOutput: Unit, returnState: Boolean): ReturnType[
    js.Function4[
      /* state */ ParseState, 
      /* options */ js.UndefOr[PicomatchOptions], 
      /* returnOutput */ js.UndefOr[Boolean], 
      /* returnState */ js.UndefOr[Boolean], 
      js.RegExp
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeRe")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], returnOutput.asInstanceOf[js.Any], returnState.asInstanceOf[js.Any])).asInstanceOf[ReturnType[
    js.Function4[
      /* state */ ParseState, 
      /* options */ js.UndefOr[PicomatchOptions], 
      /* returnOutput */ js.UndefOr[Boolean], 
      /* returnState */ js.UndefOr[Boolean], 
      js.RegExp
    ]
  ]]
  inline def makeRe(input: String, options: PicomatchOptions): ReturnType[
    js.Function4[
      /* state */ ParseState, 
      /* options */ js.UndefOr[PicomatchOptions], 
      /* returnOutput */ js.UndefOr[Boolean], 
      /* returnState */ js.UndefOr[Boolean], 
      js.RegExp
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeRe")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReturnType[
    js.Function4[
      /* state */ ParseState, 
      /* options */ js.UndefOr[PicomatchOptions], 
      /* returnOutput */ js.UndefOr[Boolean], 
      /* returnState */ js.UndefOr[Boolean], 
      js.RegExp
    ]
  ]]
  inline def makeRe(input: String, options: PicomatchOptions, returnOutput: Boolean): ReturnType[
    js.Function4[
      /* state */ ParseState, 
      /* options */ js.UndefOr[PicomatchOptions], 
      /* returnOutput */ js.UndefOr[Boolean], 
      /* returnState */ js.UndefOr[Boolean], 
      js.RegExp
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeRe")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], returnOutput.asInstanceOf[js.Any])).asInstanceOf[ReturnType[
    js.Function4[
      /* state */ ParseState, 
      /* options */ js.UndefOr[PicomatchOptions], 
      /* returnOutput */ js.UndefOr[Boolean], 
      /* returnState */ js.UndefOr[Boolean], 
      js.RegExp
    ]
  ]]
  inline def makeRe(input: String, options: PicomatchOptions, returnOutput: Boolean, returnState: Boolean): ReturnType[
    js.Function4[
      /* state */ ParseState, 
      /* options */ js.UndefOr[PicomatchOptions], 
      /* returnOutput */ js.UndefOr[Boolean], 
      /* returnState */ js.UndefOr[Boolean], 
      js.RegExp
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeRe")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], returnOutput.asInstanceOf[js.Any], returnState.asInstanceOf[js.Any])).asInstanceOf[ReturnType[
    js.Function4[
      /* state */ ParseState, 
      /* options */ js.UndefOr[PicomatchOptions], 
      /* returnOutput */ js.UndefOr[Boolean], 
      /* returnState */ js.UndefOr[Boolean], 
      js.RegExp
    ]
  ]]
  inline def makeRe(input: String, options: PicomatchOptions, returnOutput: Unit, returnState: Boolean): ReturnType[
    js.Function4[
      /* state */ ParseState, 
      /* options */ js.UndefOr[PicomatchOptions], 
      /* returnOutput */ js.UndefOr[Boolean], 
      /* returnState */ js.UndefOr[Boolean], 
      js.RegExp
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeRe")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], returnOutput.asInstanceOf[js.Any], returnState.asInstanceOf[js.Any])).asInstanceOf[ReturnType[
    js.Function4[
      /* state */ ParseState, 
      /* options */ js.UndefOr[PicomatchOptions], 
      /* returnOutput */ js.UndefOr[Boolean], 
      /* returnState */ js.UndefOr[Boolean], 
      js.RegExp
    ]
  ]]
  
  inline def matchBase(input: String, glob: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchBase")(input.asInstanceOf[js.Any], glob.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def matchBase(input: String, glob: String, options: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchBase")(input.asInstanceOf[js.Any], glob.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def matchBase(input: String, glob: String, options: js.Object, posix: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchBase")(input.asInstanceOf[js.Any], glob.asInstanceOf[js.Any], options.asInstanceOf[js.Any], posix.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def matchBase(input: String, glob: String, options: Unit, posix: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchBase")(input.asInstanceOf[js.Any], glob.asInstanceOf[js.Any], options.asInstanceOf[js.Any], posix.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def matchBase(input: String, glob: js.RegExp): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchBase")(input.asInstanceOf[js.Any], glob.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def matchBase(input: String, glob: js.RegExp, options: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchBase")(input.asInstanceOf[js.Any], glob.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def matchBase(input: String, glob: js.RegExp, options: js.Object, posix: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchBase")(input.asInstanceOf[js.Any], glob.asInstanceOf[js.Any], options.asInstanceOf[js.Any], posix.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def matchBase(input: String, glob: js.RegExp, options: Unit, posix: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchBase")(input.asInstanceOf[js.Any], glob.asInstanceOf[js.Any], options.asInstanceOf[js.Any], posix.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def parse(pattern: String): ParseState = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(pattern.asInstanceOf[js.Any]).asInstanceOf[ParseState]
  inline def parse(pattern: String, options: MaxLength): ParseState = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ParseState]
  inline def parse(pattern: js.Array[String]): js.Array[ParseState] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(pattern.asInstanceOf[js.Any]).asInstanceOf[js.Array[ParseState]]
  inline def parse(pattern: js.Array[String], options: MaxLength): js.Array[ParseState] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[ParseState]]
  inline def parse(pattern: Glob): ParseState | js.Array[ParseState] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(pattern.asInstanceOf[js.Any]).asInstanceOf[ParseState | js.Array[ParseState]]
  inline def parse(pattern: Glob, options: MaxLength): ParseState | js.Array[ParseState] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ParseState | js.Array[ParseState]]
  
  @JSImport("picomatch", "scan")
  @js.native
  val scan: js.Function2[/* input */ String, /* options */ js.UndefOr[Options], State] = js.native
  
  inline def test(input: String, regex: js.RegExp): IsMatch = (^.asInstanceOf[js.Dynamic].applyDynamic("test")(input.asInstanceOf[js.Any], regex.asInstanceOf[js.Any])).asInstanceOf[IsMatch]
  inline def test(input: String, regex: js.RegExp, options: Unit, test: js.Object): IsMatch = (^.asInstanceOf[js.Dynamic].applyDynamic("test")(input.asInstanceOf[js.Any], regex.asInstanceOf[js.Any], options.asInstanceOf[js.Any], test.asInstanceOf[js.Any])).asInstanceOf[IsMatch]
  inline def test(input: String, regex: js.RegExp, options: PicomatchOptions): IsMatch = (^.asInstanceOf[js.Dynamic].applyDynamic("test")(input.asInstanceOf[js.Any], regex.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IsMatch]
  inline def test(input: String, regex: js.RegExp, options: PicomatchOptions, test: js.Object): IsMatch = (^.asInstanceOf[js.Dynamic].applyDynamic("test")(input.asInstanceOf[js.Any], regex.asInstanceOf[js.Any], options.asInstanceOf[js.Any], test.asInstanceOf[js.Any])).asInstanceOf[IsMatch]
  
  inline def toRegex(source: String): js.RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("toRegex")(source.asInstanceOf[js.Any]).asInstanceOf[js.RegExp]
  inline def toRegex(source: String, options: ToRegexOptions): js.RegExp = (^.asInstanceOf[js.Dynamic].applyDynamic("toRegex")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.RegExp]
  inline def toRegex(source: js.RegExp): js.RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("toRegex")(source.asInstanceOf[js.Any]).asInstanceOf[js.RegExp]
  inline def toRegex(source: js.RegExp, options: ToRegexOptions): js.RegExp = (^.asInstanceOf[js.Dynamic].applyDynamic("toRegex")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.RegExp]
}
