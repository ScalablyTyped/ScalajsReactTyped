package typingsJapgolly.yadda

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.yadda.libContextMod.Properties
import typingsJapgolly.yadda.libLocalisationLanguageMod.Vocabulary
import typingsJapgolly.yadda.libParsersFeatureParserMod.Options
import typingsJapgolly.yadda.libPluginsMod.MochaPlugin
import typingsJapgolly.yadda.yaddaStrings.__ON_DEFINE__
import typingsJapgolly.yadda.yaddaStrings.__ON_EXECUTE__
import typingsJapgolly.yadda.yaddaStrings.__ON_SCENARIO__
import typingsJapgolly.yadda.yaddaStrings.__ON_STEP__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("yadda/lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("yadda/lib", "Context")
  @js.native
  open class Context protected ()
    extends typingsJapgolly.yadda.libContextMod.^ {
    def this(properties: Properties) = this()
  }
  
  @JSImport("yadda/lib", "Dictionary")
  @js.native
  open class Dictionary ()
    extends typingsJapgolly.yadda.libDictionaryMod.^ {
    def this(prefix: String) = this()
  }
  
  object EventBus {
    
    @JSImport("yadda/lib", "EventBus")
    @js.native
    val ^ : js.Any = js.native
    @JSImport("yadda/lib", "EventBus.EventBus")
    @js.native
    open class EventBus ()
      extends typingsJapgolly.yadda.libEventBusMod.EventBus
    
    @JSImport("yadda/lib", "EventBus.ON_DEFINE")
    @js.native
    val ON_DEFINE: __ON_DEFINE__ = js.native
    
    @JSImport("yadda/lib", "EventBus.ON_EXECUTE")
    @js.native
    val ON_EXECUTE: __ON_EXECUTE__ = js.native
    
    @JSImport("yadda/lib", "EventBus.ON_SCENARIO")
    @js.native
    val ON_SCENARIO: __ON_SCENARIO__ = js.native
    
    @JSImport("yadda/lib", "EventBus.ON_STEP")
    @js.native
    val ON_STEP: __ON_STEP__ = js.native
    
    inline def instance(): typingsJapgolly.yadda.libEventBusMod.EventBus = ^.asInstanceOf[js.Dynamic].applyDynamic("instance")().asInstanceOf[typingsJapgolly.yadda.libEventBusMod.EventBus]
  }
  
  @JSImport("yadda/lib", "FeatureFileSearch")
  @js.native
  open class FeatureFileSearch protected ()
    extends typingsJapgolly.yadda.libFeatureFileSearchMod.^ {
    def this(directories: String) = this()
  }
  
  @JSImport("yadda/lib", "FileSearch")
  @js.native
  open class FileSearch protected ()
    extends typingsJapgolly.yadda.libFileSearchMod.^ {
    def this(directories: String) = this()
    def this(directories: String, patterns: js.RegExp) = this()
  }
  
  @JSImport("yadda/lib", "Interpreter")
  @js.native
  open class Interpreter protected ()
    extends typingsJapgolly.yadda.libInterpreterMod.^ {
    def this(libraries: js.Array[typingsJapgolly.yadda.libLibraryMod.^]) = this()
    def this(libraries: typingsJapgolly.yadda.libLibraryMod.^) = this()
  }
  
  @JSImport("yadda/lib", "Library")
  @js.native
  open class Library ()
    extends typingsJapgolly.yadda.libLibraryMod.^ {
    def this(dictionary: typingsJapgolly.yadda.libDictionaryMod.^) = this()
  }
  
  @JSImport("yadda/lib", "Platform")
  @js.native
  open class Platform ()
    extends typingsJapgolly.yadda.libPlatformMod.^
  
  @JSImport("yadda/lib", "Yadda")
  @js.native
  open class Yadda protected ()
    extends typingsJapgolly.yadda.libYaddaMod.^ {
    def this(libraries: js.Array[typingsJapgolly.yadda.libLibraryMod.^]) = this()
    def this(libraries: typingsJapgolly.yadda.libLibraryMod.^) = this()
    def this(libraries: js.Array[typingsJapgolly.yadda.libLibraryMod.^], interpreter_context: Properties) = this()
    def this(
      libraries: js.Array[typingsJapgolly.yadda.libLibraryMod.^],
      interpreter_context: typingsJapgolly.yadda.libContextMod.^
    ) = this()
    def this(libraries: typingsJapgolly.yadda.libLibraryMod.^, interpreter_context: Properties) = this()
    def this(
      libraries: typingsJapgolly.yadda.libLibraryMod.^,
      interpreter_context: typingsJapgolly.yadda.libContextMod.^
    ) = this()
  }
  
  object converters {
    
    @JSImport("yadda/lib", "converters")
    @js.native
    val ^ : js.Any = js.native
    
    inline def date(value: String, next: js.Function2[/* err */ js.Error | Null, /* value */ js.Date, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("date")(value.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def float(value: String, next: js.Function2[/* err */ js.Error | Null, /* value */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("float")(value.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def integer(value: String, next: js.Function2[/* err */ js.Error | Null, /* value */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("integer")(value.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def list(value: String, next: js.Function2[/* err */ js.Error | Null, /* value */ js.Array[String], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(value.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def passThrough(value: String, next: js.Function2[/* err */ js.Error | Null, /* value */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pass_through")(value.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def table(value: String, next: js.Function2[/* err */ js.Error | Null, /* value */ js.Array[String], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("table")(value.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  inline def createInstance(): typingsJapgolly.yadda.libYaddaMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")().asInstanceOf[typingsJapgolly.yadda.libYaddaMod.^]
  inline def createInstance(libraries: js.Array[typingsJapgolly.yadda.libLocalisationLanguageMod.Library]): typingsJapgolly.yadda.libYaddaMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")(libraries.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.yadda.libYaddaMod.^]
  inline def createInstance(libraries: js.Array[typingsJapgolly.yadda.libLocalisationLanguageMod.Library], context: Properties): typingsJapgolly.yadda.libYaddaMod.^ = (^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")(libraries.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.yadda.libYaddaMod.^]
  inline def createInstance(libraries: Unit, context: Properties): typingsJapgolly.yadda.libYaddaMod.^ = (^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")(libraries.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.yadda.libYaddaMod.^]
  inline def createInstance(libraries: typingsJapgolly.yadda.libLocalisationLanguageMod.Library): typingsJapgolly.yadda.libYaddaMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")(libraries.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.yadda.libYaddaMod.^]
  inline def createInstance(libraries: typingsJapgolly.yadda.libLocalisationLanguageMod.Library, context: Properties): typingsJapgolly.yadda.libYaddaMod.^ = (^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")(libraries.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.yadda.libYaddaMod.^]
  
  object localisation extends Shortcut {
    
    @JSImport("yadda/lib", "localisation.default")
    @js.native
    val default: typingsJapgolly.yadda.libLocalisationLanguageMod.^[typingsJapgolly.yadda.libLocalisationEnglishMod.Library] = js.native
    
    @JSImport("yadda/lib", "localisation.Chinese")
    @js.native
    val Chinese: typingsJapgolly.yadda.libLocalisationLanguageMod.^[typingsJapgolly.yadda.libLocalisationChineseMod.Library] = js.native
    
    @JSImport("yadda/lib", "localisation.Dutch")
    @js.native
    val Dutch: typingsJapgolly.yadda.libLocalisationLanguageMod.^[typingsJapgolly.yadda.libLocalisationDutchMod.Library] = js.native
    
    @JSImport("yadda/lib", "localisation.English")
    @js.native
    val English: typingsJapgolly.yadda.libLocalisationLanguageMod.^[typingsJapgolly.yadda.libLocalisationEnglishMod.Library] = js.native
    
    @JSImport("yadda/lib", "localisation.French")
    @js.native
    val French: typingsJapgolly.yadda.libLocalisationLanguageMod.^[typingsJapgolly.yadda.libLocalisationFrenchMod.Library] = js.native
    
    @JSImport("yadda/lib", "localisation.German")
    @js.native
    val German: typingsJapgolly.yadda.libLocalisationLanguageMod.^[typingsJapgolly.yadda.libLocalisationGermanMod.Library] = js.native
    
    @JSImport("yadda/lib", "localisation.Language")
    @js.native
    open class Language[TLibrary /* <: typingsJapgolly.yadda.libLocalisationLanguageMod.Library */] protected ()
      extends typingsJapgolly.yadda.libLocalisationMod.Language[TLibrary] {
      def this(name: String, vocabulary: Vocabulary) = this()
    }
    
    @JSImport("yadda/lib", "localisation.Norwegian")
    @js.native
    val Norwegian: typingsJapgolly.yadda.libLocalisationLanguageMod.^[typingsJapgolly.yadda.libLocalisationNorwegianMod.Library] = js.native
    
    @JSImport("yadda/lib", "localisation.Pirate")
    @js.native
    val Pirate: typingsJapgolly.yadda.libLocalisationLanguageMod.^[typingsJapgolly.yadda.libLocalisationPirateMod.Library] = js.native
    
    @JSImport("yadda/lib", "localisation.Polish")
    @js.native
    val Polish: typingsJapgolly.yadda.libLocalisationLanguageMod.^[typingsJapgolly.yadda.libLocalisationPolishMod.Library] = js.native
    
    @JSImport("yadda/lib", "localisation.Portuguese")
    @js.native
    val Portuguese: typingsJapgolly.yadda.libLocalisationLanguageMod.^[typingsJapgolly.yadda.libLocalisationPortugueseMod.Library] = js.native
    
    @JSImport("yadda/lib", "localisation.Russian")
    @js.native
    val Russian: typingsJapgolly.yadda.libLocalisationLanguageMod.^[typingsJapgolly.yadda.libLocalisationRussianMod.Library] = js.native
    
    @JSImport("yadda/lib", "localisation.Spanish")
    @js.native
    val Spanish: typingsJapgolly.yadda.libLocalisationLanguageMod.^[typingsJapgolly.yadda.libLocalisationSpanishMod.Library] = js.native
    
    @JSImport("yadda/lib", "localisation.Ukrainian")
    @js.native
    val Ukrainian: typingsJapgolly.yadda.libLocalisationLanguageMod.^[typingsJapgolly.yadda.libLocalisationUkrainianMod.Library] = js.native
    
    type _To = typingsJapgolly.yadda.libLocalisationLanguageMod.^[typingsJapgolly.yadda.libLocalisationEnglishMod.Library]
    
    /* This means you don't have to write `default`, but can instead just say `localisation.foo` */
    override def _to: typingsJapgolly.yadda.libLocalisationLanguageMod.^[typingsJapgolly.yadda.libLocalisationEnglishMod.Library] = default
  }
  
  object parsers {
    
    @JSImport("yadda/lib", "parsers.FeatureFileParser")
    @js.native
    open class FeatureFileParser ()
      extends typingsJapgolly.yadda.libParsersMod.FeatureFileParser {
      def this(language: typingsJapgolly.yadda.libLocalisationLanguageMod.^[typingsJapgolly.yadda.libLocalisationLanguageMod.Library]) = this()
      def this(options: Options) = this()
    }
    
    @JSImport("yadda/lib", "parsers.FeatureParser")
    @js.native
    open class FeatureParser ()
      extends typingsJapgolly.yadda.libParsersMod.FeatureParser {
      def this(language: typingsJapgolly.yadda.libLocalisationLanguageMod.^[typingsJapgolly.yadda.libLocalisationLanguageMod.Library]) = this()
      def this(options: Options) = this()
    }
    
    @JSImport("yadda/lib", "parsers.StepParser")
    @js.native
    open class StepParser ()
      extends typingsJapgolly.yadda.libParsersMod.StepParser
  }
  
  object plugins {
    
    @JSImport("yadda/lib", "plugins")
    @js.native
    val ^ : js.Any = js.native
    
    inline def casper(yadda: typingsJapgolly.yadda.libYaddaMod.^, casper: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("casper")(yadda.asInstanceOf[js.Any], casper.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("yadda/lib", "plugins.jasmine")
    @js.native
    val jasmine: MochaPlugin = js.native
    
    @JSImport("yadda/lib", "plugins.mocha")
    @js.native
    val mocha: MochaPlugin = js.native
  }
  
  type Annotations = StringDictionary[String]
  
  type Converter = (js.Function2[
    /* arg1 */ String, 
    /* next */ js.Function2[/* err */ js.Error | Null, /* value */ Any, Unit], 
    Unit
  ]) | (js.Function3[
    /* arg1 */ String, 
    /* arg2 */ String, 
    /* next */ js.Function2[/* err */ js.Error | Null, /* value */ Any, Unit], 
    Unit
  ]) | (js.Function4[
    /* arg1 */ String, 
    /* arg2 */ String, 
    /* arg3 */ String, 
    /* next */ js.Function2[/* err */ js.Error | Null, /* value */ Any, Unit], 
    Unit
  ]) | (js.Function5[
    /* arg1 */ String, 
    /* arg2 */ String, 
    /* arg3 */ String, 
    /* arg4 */ String, 
    /* next */ js.Function2[/* err */ js.Error | Null, /* value */ Any, Unit], 
    Unit
  ]) | (js.Function6[
    /* arg1 */ String, 
    /* arg2 */ String, 
    /* arg3 */ String, 
    /* arg4 */ String, 
    /* arg5 */ String, 
    /* next */ js.Function2[/* err */ js.Error | Null, /* value */ Any, Unit], 
    Unit
  ]) | (js.Function7[
    /* arg1 */ String, 
    /* arg2 */ String, 
    /* arg3 */ String, 
    /* arg4 */ String, 
    /* arg5 */ String, 
    /* arg6 */ String, 
    /* next */ js.Function2[/* err */ js.Error | Null, /* value */ Any, Unit], 
    Unit
  ])
  
  trait Feature extends StObject {
    
    var annotations: Annotations
    
    var description: js.Array[String]
    
    var scenarios: js.Array[Scenario]
    
    var title: String
  }
  object Feature {
    
    inline def apply(
      annotations: Annotations,
      description: js.Array[String],
      scenarios: js.Array[Scenario],
      title: String
    ): Feature = {
      val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], scenarios = scenarios.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Feature]
    }
    
    extension [Self <: Feature](x: Self) {
      
      inline def setAnnotations(value: Annotations): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: js.Array[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionVarargs(value: String*): Self = StObject.set(x, "description", js.Array(value*))
      
      inline def setScenarios(value: js.Array[Scenario]): Self = StObject.set(x, "scenarios", value.asInstanceOf[js.Any])
      
      inline def setScenariosVarargs(value: Scenario*): Self = StObject.set(x, "scenarios", js.Array(value*))
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait Scenario extends StObject {
    
    var annotations: Annotations
    
    var description: js.Array[String]
    
    var steps: js.Array[Step]
    
    var title: String
  }
  object Scenario {
    
    inline def apply(annotations: Annotations, description: js.Array[String], steps: js.Array[Step], title: String): Scenario = {
      val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Scenario]
    }
    
    extension [Self <: Scenario](x: Self) {
      
      inline def setAnnotations(value: Annotations): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: js.Array[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionVarargs(value: String*): Self = StObject.set(x, "description", js.Array(value*))
      
      inline def setSteps(value: js.Array[Step]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      inline def setStepsVarargs(value: Step*): Self = StObject.set(x, "steps", js.Array(value*))
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  type Step = String
  
  trait StepFn extends StObject {
    
    var ctx: Properties
    
    var step: String
  }
  object StepFn {
    
    inline def apply(ctx: Properties, step: String): StepFn = {
      val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
      __obj.asInstanceOf[StepFn]
    }
    
    extension [Self <: StepFn](x: Self) {
      
      inline def setCtx(value: Properties): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      inline def setStep(value: String): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    }
  }
}
