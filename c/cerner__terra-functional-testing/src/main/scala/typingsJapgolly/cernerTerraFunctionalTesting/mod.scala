package typingsJapgolly.cernerTerraFunctionalTesting

import typingsJapgolly.axeCore.mod.RuleObject
import typingsJapgolly.axeCore.mod.RunOptions
import typingsJapgolly.cernerTerraFunctionalTesting.anon.Colorcontrast
import typingsJapgolly.cernerTerraFunctionalTesting.anon.OmitValidationOptionsrule
import typingsJapgolly.cernerTerraFunctionalTesting.cernerTerraFunctionalTestingStrings.`[data-terra-test-content] AsteriskColonfirst-child`
import typingsJapgolly.mocha.mod.Suite_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object global {
    
    object Terra {
      
      @JSGlobal("Terra")
      @js.native
      val ^ : js.Any = js.native
      
      object axe {
        
        @JSGlobal("Terra.axe")
        @js.native
        val ^ : js.Any = js.native
        
        @JSGlobal("Terra.axe.rules")
        @js.native
        def rules: Colorcontrast = js.native
        inline def rules_=(x: Colorcontrast): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rules")(x.asInstanceOf[js.Any])
      }
      
      inline def describeTests(title: String, options: Unit, fn: MochaTestFn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("describeTests")(title.asInstanceOf[js.Any], options.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
      /**
        * Mocha describe block to filter tests based on form factors, locales, and themes.
        * The block of tests will only execute if the form factor, locale, and theme in the current configuration match what is defined in the options.
        * If any option is not defined, then the block of tests will not be filtered based on that particular option.
        *
        * @param title - The `describe` block title.
        * @param options - An object containing arrays of formFactors, locales, and themes that the block of tests will only qualify to execute in.
        * @param fn - The block of tests to execute based on the defined form factor, locale, and theme.
        */
      inline def describeTests(title: String, options: DescribeTestsOptions, fn: MochaTestFn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("describeTests")(title.asInstanceOf[js.Any], options.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      /**
        * Mocha `describe` block to run tests through a defined list of viewports.
        * This is intended to be used as an alias replacement for the root-level Mocha `describe`.
        * Note: If a FORM_FACTOR has been specified for the test run only that form factor will be run.
        *
        * @param title - The `describe` block title
        * @param formFactors - A list of form factors.
        * @param fn - The block of tests to execute against each viewport.
        */
      inline def describeViewports(title: String, formFactors: js.Array[FormFactor], fn: MochaTestFn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("describeViewports")(title.asInstanceOf[js.Any], formFactors.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      /**
        * Hides the blinking input caret that appears within editable text areas to prevent inconsistent test failures.
        *
        * @param selector - The target element selector.
        */
      inline def hideInputCaret(selector: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hideInputCaret")(selector.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      object serviceOptions {
        
        @JSGlobal("Terra.serviceOptions")
        @js.native
        val ^ : js.Any = js.native
        
        @JSGlobal("Terra.serviceOptions.formFactor")
        @js.native
        def formFactor: FormFactor = js.native
        inline def formFactor_=(x: FormFactor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formFactor")(x.asInstanceOf[js.Any])
        
        @JSGlobal("Terra.serviceOptions.ignoreScreenshotMismatch")
        @js.native
        def ignoreScreenshotMismatch: js.UndefOr[Boolean] = js.native
        inline def ignoreScreenshotMismatch_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ignoreScreenshotMismatch")(x.asInstanceOf[js.Any])
        
        @JSGlobal("Terra.serviceOptions.locale")
        @js.native
        def locale: Locale = js.native
        inline def locale_=(x: Locale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("locale")(x.asInstanceOf[js.Any])
        
        @JSGlobal("Terra.serviceOptions.selector")
        @js.native
        def selector: `[data-terra-test-content] AsteriskColonfirst-child` = js.native
        inline def selector_=(x: `[data-terra-test-content] AsteriskColonfirst-child`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selector")(x.asInstanceOf[js.Any])
        
        @JSGlobal("Terra.serviceOptions.theme")
        @js.native
        def theme: Theme = js.native
        inline def theme_=(x: Theme): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("theme")(x.asInstanceOf[js.Any])
      }
      
      /**
        * Updates terra-application's locale via custom event
        *
        * @param locale - name of locale to update to
        */
      inline def setApplicationLocale(locale: Locale): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setApplicationLocale")(locale.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      object validates {
        
        @JSGlobal("Terra.validates")
        @js.native
        val ^ : js.Any = js.native
        
        /**
          * Analyzes the current documentation for accessibility violations.
          *
          * @param options - Optional axe configuration overrides.
          */
        inline def accessibility(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("accessibility")().asInstanceOf[Unit]
        inline def accessibility(options: AxeOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("accessibility")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
        
        /**
          * An assertion method to assert the page is accessible and the screenshot comparison result is within
          * the mismatch tolerance.
          *
          * This should be used within a Mocha `it` block.
          *
          * @param testName - The required test case name.
          * @param options - The test options
          */
        inline def element(testName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("element")(testName.asInstanceOf[js.Any]).asInstanceOf[Unit]
        inline def element(testName: String, options: ValidationOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("element")(testName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
        
        /**
          * The screenshot comparisons.  It will capture screenshots of a specified element
          * and assert the screenshot comparison results are within the mismatch tolerance or are an exact match
          *
          * This should be used within an `it` block.
          *
          * @param testName - The required test case name.
          * @param options - The visual regression test options. Options include mismatchTolerance and selector
          */
        inline def screenshot(testName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("screenshot")(testName.asInstanceOf[js.Any]).asInstanceOf[Unit]
        inline def screenshot(testName: String, options: OmitValidationOptionsrule): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("screenshot")(testName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
      }
      
      /**
        * Returns an array of viewport dimensions.
        *
        * @param sizes - A list of Terra viewport sizes.
        * @return An array of viewports. Returns all viewports if sizes are not provided.
        */
      inline def viewports(sizes: FormFactor*): js.Array[FormFactorDimensions] = ^.asInstanceOf[js.Dynamic].applyDynamic("viewports")(sizes.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Array[FormFactorDimensions]]
      
      trait DescribeTestsOptions extends StObject {
        
        /**
          * The form factors that the block of tests only execute in.
          */
        var formFactors: js.UndefOr[js.Array[FormFactor]] = js.undefined
        
        /**
          * The language locales that the block of tests only execute in.
          */
        var locales: js.UndefOr[js.Array[Locale]] = js.undefined
        
        /**
          * The themes that the block of tests only execute in.
          */
        var themes: js.UndefOr[js.Array[Theme]] = js.undefined
      }
      object DescribeTestsOptions {
        
        inline def apply(): DescribeTestsOptions = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[DescribeTestsOptions]
        }
        
        extension [Self <: DescribeTestsOptions](x: Self) {
          
          inline def setFormFactors(value: js.Array[FormFactor]): Self = StObject.set(x, "formFactors", value.asInstanceOf[js.Any])
          
          inline def setFormFactorsUndefined: Self = StObject.set(x, "formFactors", js.undefined)
          
          inline def setFormFactorsVarargs(value: FormFactor*): Self = StObject.set(x, "formFactors", js.Array(value*))
          
          inline def setLocales(value: js.Array[Locale]): Self = StObject.set(x, "locales", value.asInstanceOf[js.Any])
          
          inline def setLocalesUndefined: Self = StObject.set(x, "locales", js.undefined)
          
          inline def setLocalesVarargs(value: Locale*): Self = StObject.set(x, "locales", js.Array(value*))
          
          inline def setThemes(value: js.Array[Theme]): Self = StObject.set(x, "themes", value.asInstanceOf[js.Any])
          
          inline def setThemesUndefined: Self = StObject.set(x, "themes", js.undefined)
          
          inline def setThemesVarargs(value: Theme*): Self = StObject.set(x, "themes", js.Array(value*))
        }
      }
      
      /* Rewritten from type alias, can be one of: 
        - typingsJapgolly.cernerTerraFunctionalTesting.cernerTerraFunctionalTestingStrings.tiny
        - typingsJapgolly.cernerTerraFunctionalTesting.cernerTerraFunctionalTestingStrings.small
        - typingsJapgolly.cernerTerraFunctionalTesting.cernerTerraFunctionalTestingStrings.medium
        - typingsJapgolly.cernerTerraFunctionalTesting.cernerTerraFunctionalTestingStrings.large
        - typingsJapgolly.cernerTerraFunctionalTesting.cernerTerraFunctionalTestingStrings.huge
        - typingsJapgolly.cernerTerraFunctionalTesting.cernerTerraFunctionalTestingStrings.enormous
      */
      trait FormFactor extends StObject
      object FormFactor {
        
        inline def enormous: typingsJapgolly.cernerTerraFunctionalTesting.cernerTerraFunctionalTestingStrings.enormous = "enormous".asInstanceOf[typingsJapgolly.cernerTerraFunctionalTesting.cernerTerraFunctionalTestingStrings.enormous]
        
        inline def huge: typingsJapgolly.cernerTerraFunctionalTesting.cernerTerraFunctionalTestingStrings.huge = "huge".asInstanceOf[typingsJapgolly.cernerTerraFunctionalTesting.cernerTerraFunctionalTestingStrings.huge]
        
        inline def large: typingsJapgolly.cernerTerraFunctionalTesting.cernerTerraFunctionalTestingStrings.large = "large".asInstanceOf[typingsJapgolly.cernerTerraFunctionalTesting.cernerTerraFunctionalTestingStrings.large]
        
        inline def medium: typingsJapgolly.cernerTerraFunctionalTesting.cernerTerraFunctionalTestingStrings.medium = "medium".asInstanceOf[typingsJapgolly.cernerTerraFunctionalTesting.cernerTerraFunctionalTestingStrings.medium]
        
        inline def small: typingsJapgolly.cernerTerraFunctionalTesting.cernerTerraFunctionalTestingStrings.small = "small".asInstanceOf[typingsJapgolly.cernerTerraFunctionalTesting.cernerTerraFunctionalTestingStrings.small]
        
        inline def tiny: typingsJapgolly.cernerTerraFunctionalTesting.cernerTerraFunctionalTestingStrings.tiny = "tiny".asInstanceOf[typingsJapgolly.cernerTerraFunctionalTesting.cernerTerraFunctionalTestingStrings.tiny]
      }
      
      trait FormFactorDimensions extends StObject {
        
        var height: Double
        
        var name: FormFactor
        
        var width: Double
      }
      object FormFactorDimensions {
        
        inline def apply(height: Double, name: FormFactor, width: Double): FormFactorDimensions = {
          val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
          __obj.asInstanceOf[FormFactorDimensions]
        }
        
        extension [Self <: FormFactorDimensions](x: Self) {
          
          inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
          
          inline def setName(value: FormFactor): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
          
          inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        }
      }
      
      /* Rewritten from type alias, can be one of: 
        - typingsJapgolly.cernerTerraFunctionalTesting.cernerTerraFunctionalTestingStrings.en
        - typingsJapgolly.cernerTerraFunctionalTesting.cernerTerraFunctionalTestingStrings.`en-AU`
        - typingsJapgolly.cernerTerraFunctionalTesting.cernerTerraFunctionalTestingStrings.`en-CA`
        - typingsJapgolly.cernerTerraFunctionalTesting.cernerTerraFunctionalTestingStrings.`en-US`
        - typingsJapgolly.cernerTerraFunctionalTesting.cernerTerraFunctionalTestingStrings.`en-GB`
        - typingsJapgolly.cernerTerraFunctionalTesting.cernerTerraFunctionalTestingStrings.es
        - typingsJapgolly.cernerTerraFunctionalTesting.cernerTerraFunctionalTestingStrings.`es-US`
        - typingsJapgolly.cernerTerraFunctionalTesting.cernerTerraFunctionalTestingStrings.`es-ES`
        - typingsJapgolly.cernerTerraFunctionalTesting.cernerTerraFunctionalTestingStrings.de
        - typingsJapgolly.cernerTerraFunctionalTesting.cernerTerraFunctionalTestingStrings.fr
        - typingsJapgolly.cernerTerraFunctionalTesting.cernerTerraFunctionalTestingStrings.`fr-FR`
        - typingsJapgolly.cernerTerraFunctionalTesting.cernerTerraFunctionalTestingStrings.nl
        - typingsJapgolly.cernerTerraFunctionalTesting.cernerTerraFunctionalTestingStrings.`nl-BE`
        - typingsJapgolly.cernerTerraFunctionalTesting.cernerTerraFunctionalTestingStrings.pt
        - typingsJapgolly.cernerTerraFunctionalTesting.cernerTerraFunctionalTestingStrings.`pt-BR`
        - typingsJapgolly.cernerTerraFunctionalTesting.cernerTerraFunctionalTestingStrings.sv
        - typingsJapgolly.cernerTerraFunctionalTesting.cernerTerraFunctionalTestingStrings.`sv-SE`
      */
      trait Locale extends StObject
      object Locale {
        
        inline def de: typingsJapgolly.cernerTerraFunctionalTesting.cernerTerraFunctionalTestingStrings.de = "de".asInstanceOf[typingsJapgolly.cernerTerraFunctionalTesting.cernerTerraFunctionalTestingStrings.de]
        
        inline def en: typingsJapgolly.cernerTerraFunctionalTesting.cernerTerraFunctionalTestingStrings.en = "en".asInstanceOf[typingsJapgolly.cernerTerraFunctionalTesting.cernerTerraFunctionalTestingStrings.en]
        
        inline def `en-AU`: typingsJapgolly.cernerTerraFunctionalTesting.cernerTerraFunctionalTestingStrings.`en-AU` = "en-AU".asInstanceOf[typingsJapgolly.cernerTerraFunctionalTesting.cernerTerraFunctionalTestingStrings.`en-AU`]
        
        inline def `en-CA`: typingsJapgolly.cernerTerraFunctionalTesting.cernerTerraFunctionalTestingStrings.`en-CA` = "en-CA".asInstanceOf[typingsJapgolly.cernerTerraFunctionalTesting.cernerTerraFunctionalTestingStrings.`en-CA`]
        
        inline def `en-GB`: typingsJapgolly.cernerTerraFunctionalTesting.cernerTerraFunctionalTestingStrings.`en-GB` = "en-GB".asInstanceOf[typingsJapgolly.cernerTerraFunctionalTesting.cernerTerraFunctionalTestingStrings.`en-GB`]
        
        inline def `en-US`: typingsJapgolly.cernerTerraFunctionalTesting.cernerTerraFunctionalTestingStrings.`en-US` = "en-US".asInstanceOf[typingsJapgolly.cernerTerraFunctionalTesting.cernerTerraFunctionalTestingStrings.`en-US`]
        
        inline def es: typingsJapgolly.cernerTerraFunctionalTesting.cernerTerraFunctionalTestingStrings.es = "es".asInstanceOf[typingsJapgolly.cernerTerraFunctionalTesting.cernerTerraFunctionalTestingStrings.es]
        
        inline def `es-ES`: typingsJapgolly.cernerTerraFunctionalTesting.cernerTerraFunctionalTestingStrings.`es-ES` = "es-ES".asInstanceOf[typingsJapgolly.cernerTerraFunctionalTesting.cernerTerraFunctionalTestingStrings.`es-ES`]
        
        inline def `es-US`: typingsJapgolly.cernerTerraFunctionalTesting.cernerTerraFunctionalTestingStrings.`es-US` = "es-US".asInstanceOf[typingsJapgolly.cernerTerraFunctionalTesting.cernerTerraFunctionalTestingStrings.`es-US`]
        
        inline def fr: typingsJapgolly.cernerTerraFunctionalTesting.cernerTerraFunctionalTestingStrings.fr = "fr".asInstanceOf[typingsJapgolly.cernerTerraFunctionalTesting.cernerTerraFunctionalTestingStrings.fr]
        
        inline def `fr-FR`: typingsJapgolly.cernerTerraFunctionalTesting.cernerTerraFunctionalTestingStrings.`fr-FR` = "fr-FR".asInstanceOf[typingsJapgolly.cernerTerraFunctionalTesting.cernerTerraFunctionalTestingStrings.`fr-FR`]
        
        inline def nl: typingsJapgolly.cernerTerraFunctionalTesting.cernerTerraFunctionalTestingStrings.nl = "nl".asInstanceOf[typingsJapgolly.cernerTerraFunctionalTesting.cernerTerraFunctionalTestingStrings.nl]
        
        inline def `nl-BE`: typingsJapgolly.cernerTerraFunctionalTesting.cernerTerraFunctionalTestingStrings.`nl-BE` = "nl-BE".asInstanceOf[typingsJapgolly.cernerTerraFunctionalTesting.cernerTerraFunctionalTestingStrings.`nl-BE`]
        
        inline def pt: typingsJapgolly.cernerTerraFunctionalTesting.cernerTerraFunctionalTestingStrings.pt = "pt".asInstanceOf[typingsJapgolly.cernerTerraFunctionalTesting.cernerTerraFunctionalTestingStrings.pt]
        
        inline def `pt-BR`: typingsJapgolly.cernerTerraFunctionalTesting.cernerTerraFunctionalTestingStrings.`pt-BR` = "pt-BR".asInstanceOf[typingsJapgolly.cernerTerraFunctionalTesting.cernerTerraFunctionalTestingStrings.`pt-BR`]
        
        inline def sv: typingsJapgolly.cernerTerraFunctionalTesting.cernerTerraFunctionalTestingStrings.sv = "sv".asInstanceOf[typingsJapgolly.cernerTerraFunctionalTesting.cernerTerraFunctionalTestingStrings.sv]
        
        inline def `sv-SE`: typingsJapgolly.cernerTerraFunctionalTesting.cernerTerraFunctionalTestingStrings.`sv-SE` = "sv-SE".asInstanceOf[typingsJapgolly.cernerTerraFunctionalTesting.cernerTerraFunctionalTestingStrings.`sv-SE`]
      }
      
      /* Rewritten from type alias, can be one of: 
        - typingsJapgolly.cernerTerraFunctionalTesting.cernerTerraFunctionalTestingStrings.`terra-default-theme`
        - typingsJapgolly.cernerTerraFunctionalTesting.cernerTerraFunctionalTestingStrings.`orion-fusion-theme`
        - typingsJapgolly.cernerTerraFunctionalTesting.cernerTerraFunctionalTestingStrings.`clinical-lowlight-theme`
      */
      trait Theme extends StObject
      object Theme {
        
        inline def `clinical-lowlight-theme`: typingsJapgolly.cernerTerraFunctionalTesting.cernerTerraFunctionalTestingStrings.`clinical-lowlight-theme` = "clinical-lowlight-theme".asInstanceOf[typingsJapgolly.cernerTerraFunctionalTesting.cernerTerraFunctionalTestingStrings.`clinical-lowlight-theme`]
        
        inline def `orion-fusion-theme`: typingsJapgolly.cernerTerraFunctionalTesting.cernerTerraFunctionalTestingStrings.`orion-fusion-theme` = "orion-fusion-theme".asInstanceOf[typingsJapgolly.cernerTerraFunctionalTesting.cernerTerraFunctionalTestingStrings.`orion-fusion-theme`]
        
        inline def `terra-default-theme`: typingsJapgolly.cernerTerraFunctionalTesting.cernerTerraFunctionalTestingStrings.`terra-default-theme` = "terra-default-theme".asInstanceOf[typingsJapgolly.cernerTerraFunctionalTesting.cernerTerraFunctionalTestingStrings.`terra-default-theme`]
      }
      
      trait ValidationOptions extends StObject {
        
        /**
          * The mismatch tolerance for the screenshot comparison
          */
        var mismatchTolerance: js.UndefOr[Double] = js.undefined
        
        /**
          * The axe rules to use to assert accessibility
          */
        var rules: js.UndefOr[RuleObject] = js.undefined
        
        /**
          * The element selector to use for the screenshot comparison
          */
        var selector: js.UndefOr[String] = js.undefined
      }
      object ValidationOptions {
        
        inline def apply(): ValidationOptions = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[ValidationOptions]
        }
        
        extension [Self <: ValidationOptions](x: Self) {
          
          inline def setMismatchTolerance(value: Double): Self = StObject.set(x, "mismatchTolerance", value.asInstanceOf[js.Any])
          
          inline def setMismatchToleranceUndefined: Self = StObject.set(x, "mismatchTolerance", js.undefined)
          
          inline def setRules(value: RuleObject): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
          
          inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
          
          inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
          
          inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
        }
      }
    }
  }
  
  type AxeOptions = RunOptions
  
  type MochaTestFn = js.ThisFunction0[/* this */ Suite_, Unit]
}
