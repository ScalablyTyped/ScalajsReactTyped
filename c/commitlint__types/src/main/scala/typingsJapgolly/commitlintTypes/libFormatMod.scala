package typingsJapgolly.commitlintTypes

import typingsJapgolly.commitlintTypes.commitlintTypesStrings.`body-case`
import typingsJapgolly.commitlintTypes.commitlintTypesStrings.`body-empty`
import typingsJapgolly.commitlintTypes.commitlintTypesStrings.`body-full-stop`
import typingsJapgolly.commitlintTypes.commitlintTypesStrings.`body-leading-blank`
import typingsJapgolly.commitlintTypes.commitlintTypesStrings.`body-max-length`
import typingsJapgolly.commitlintTypes.commitlintTypesStrings.`body-max-line-length`
import typingsJapgolly.commitlintTypes.commitlintTypesStrings.`body-min-length`
import typingsJapgolly.commitlintTypes.commitlintTypesStrings.`footer-empty`
import typingsJapgolly.commitlintTypes.commitlintTypesStrings.`footer-leading-blank`
import typingsJapgolly.commitlintTypes.commitlintTypesStrings.`footer-max-length`
import typingsJapgolly.commitlintTypes.commitlintTypesStrings.`footer-max-line-length`
import typingsJapgolly.commitlintTypes.commitlintTypesStrings.`footer-min-length`
import typingsJapgolly.commitlintTypes.commitlintTypesStrings.`header-case`
import typingsJapgolly.commitlintTypes.commitlintTypesStrings.`header-full-stop`
import typingsJapgolly.commitlintTypes.commitlintTypesStrings.`header-max-length`
import typingsJapgolly.commitlintTypes.commitlintTypesStrings.`header-min-length`
import typingsJapgolly.commitlintTypes.commitlintTypesStrings.`references-empty`
import typingsJapgolly.commitlintTypes.commitlintTypesStrings.`scope-case`
import typingsJapgolly.commitlintTypes.commitlintTypesStrings.`scope-empty`
import typingsJapgolly.commitlintTypes.commitlintTypesStrings.`scope-enum`
import typingsJapgolly.commitlintTypes.commitlintTypesStrings.`scope-max-length`
import typingsJapgolly.commitlintTypes.commitlintTypesStrings.`scope-min-length`
import typingsJapgolly.commitlintTypes.commitlintTypesStrings.`signed-off-by`
import typingsJapgolly.commitlintTypes.commitlintTypesStrings.`subject-case`
import typingsJapgolly.commitlintTypes.commitlintTypesStrings.`subject-empty`
import typingsJapgolly.commitlintTypes.commitlintTypesStrings.`subject-full-stop`
import typingsJapgolly.commitlintTypes.commitlintTypesStrings.`subject-max-length`
import typingsJapgolly.commitlintTypes.commitlintTypesStrings.`subject-min-length`
import typingsJapgolly.commitlintTypes.commitlintTypesStrings.`trailer-exists`
import typingsJapgolly.commitlintTypes.commitlintTypesStrings.`type-case`
import typingsJapgolly.commitlintTypes.commitlintTypesStrings.`type-empty`
import typingsJapgolly.commitlintTypes.commitlintTypesStrings.`type-enum`
import typingsJapgolly.commitlintTypes.commitlintTypesStrings.`type-max-length`
import typingsJapgolly.commitlintTypes.commitlintTypesStrings.`type-min-length`
import typingsJapgolly.commitlintTypes.libRulesMod.RuleConfigSeverity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFormatMod {
  
  type ChalkColor = /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof chalk.Color */ Any
  
  trait FormatOptions extends StObject {
    
    var color: js.UndefOr[Boolean] = js.undefined
    
    var colors: js.UndefOr[js.Tuple3[ChalkColor, ChalkColor, ChalkColor]] = js.undefined
    
    var helpUrl: js.UndefOr[String] = js.undefined
    
    var signs: js.UndefOr[js.Tuple3[String, String, String]] = js.undefined
    
    var verbose: js.UndefOr[Boolean] = js.undefined
  }
  object FormatOptions {
    
    inline def apply(): FormatOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormatOptions]
    }
    
    extension [Self <: FormatOptions](x: Self) {
      
      inline def setColor(value: Boolean): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setColors(value: js.Tuple3[ChalkColor, ChalkColor, ChalkColor]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setHelpUrl(value: String): Self = StObject.set(x, "helpUrl", value.asInstanceOf[js.Any])
      
      inline def setHelpUrlUndefined: Self = StObject.set(x, "helpUrl", js.undefined)
      
      inline def setSigns(value: js.Tuple3[String, String, String]): Self = StObject.set(x, "signs", value.asInstanceOf[js.Any])
      
      inline def setSignsUndefined: Self = StObject.set(x, "signs", js.undefined)
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
  
  trait FormattableProblem extends StObject {
    
    var level: RuleConfigSeverity
    
    var message: String
    
    var name: `signed-off-by` | `subject-min-length` | `subject-empty` | `body-max-length` | `footer-leading-blank` | `header-case` | `body-full-stop` | `scope-max-length` | `type-max-length` | `header-min-length` | `header-max-length` | `header-full-stop` | `body-max-line-length` | `type-enum` | `subject-max-length` | `body-empty` | `scope-empty` | `scope-case` | `trailer-exists` | `type-case` | `scope-min-length` | `footer-min-length` | `type-min-length` | `type-empty` | `references-empty` | `footer-empty` | `scope-enum` | `footer-max-length` | `body-case` | `body-min-length` | `body-leading-blank` | `footer-max-line-length` | `subject-case` | `subject-full-stop`
  }
  object FormattableProblem {
    
    inline def apply(
      level: RuleConfigSeverity,
      message: String,
      name: `signed-off-by` | `subject-min-length` | `subject-empty` | `body-max-length` | `footer-leading-blank` | `header-case` | `body-full-stop` | `scope-max-length` | `type-max-length` | `header-min-length` | `header-max-length` | `header-full-stop` | `body-max-line-length` | `type-enum` | `subject-max-length` | `body-empty` | `scope-empty` | `scope-case` | `trailer-exists` | `type-case` | `scope-min-length` | `footer-min-length` | `type-min-length` | `type-empty` | `references-empty` | `footer-empty` | `scope-enum` | `footer-max-length` | `body-case` | `body-min-length` | `body-leading-blank` | `footer-max-line-length` | `subject-case` | `subject-full-stop`
    ): FormattableProblem = {
      val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormattableProblem]
    }
    
    extension [Self <: FormattableProblem](x: Self) {
      
      inline def setLevel(value: RuleConfigSeverity): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setName(
        value: `signed-off-by` | `subject-min-length` | `subject-empty` | `body-max-length` | `footer-leading-blank` | `header-case` | `body-full-stop` | `scope-max-length` | `type-max-length` | `header-min-length` | `header-max-length` | `header-full-stop` | `body-max-line-length` | `type-enum` | `subject-max-length` | `body-empty` | `scope-empty` | `scope-case` | `trailer-exists` | `type-case` | `scope-min-length` | `footer-min-length` | `type-min-length` | `type-empty` | `references-empty` | `footer-empty` | `scope-enum` | `footer-max-length` | `body-case` | `body-min-length` | `body-leading-blank` | `footer-max-line-length` | `subject-case` | `subject-full-stop`
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait FormattableReport extends StObject {
    
    var results: js.UndefOr[js.Array[FormattableResult & WithInput]] = js.undefined
  }
  object FormattableReport {
    
    inline def apply(): FormattableReport = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormattableReport]
    }
    
    extension [Self <: FormattableReport](x: Self) {
      
      inline def setResults(value: js.Array[FormattableResult & WithInput]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
      
      inline def setResultsVarargs(value: (FormattableResult & WithInput)*): Self = StObject.set(x, "results", js.Array(value*))
    }
  }
  
  trait FormattableResult extends StObject {
    
    var errors: js.UndefOr[js.Array[FormattableProblem]] = js.undefined
    
    var warnings: js.UndefOr[js.Array[FormattableProblem]] = js.undefined
  }
  object FormattableResult {
    
    inline def apply(): FormattableResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormattableResult]
    }
    
    extension [Self <: FormattableResult](x: Self) {
      
      inline def setErrors(value: js.Array[FormattableProblem]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
      
      inline def setErrorsVarargs(value: FormattableProblem*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setWarnings(value: js.Array[FormattableProblem]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
      
      inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
      
      inline def setWarningsVarargs(value: FormattableProblem*): Self = StObject.set(x, "warnings", js.Array(value*))
    }
  }
  
  type Formatter = js.Function2[/* report */ FormattableReport, /* options */ FormatOptions, String]
  
  trait WithInput extends StObject {
    
    var input: js.UndefOr[String] = js.undefined
  }
  object WithInput {
    
    inline def apply(): WithInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WithInput]
    }
    
    extension [Self <: WithInput](x: Self) {
      
      inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    }
  }
}
