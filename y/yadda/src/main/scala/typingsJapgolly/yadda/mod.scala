package typingsJapgolly.yadda

import org.scalablytyped.runtime.Shortcut
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

object mod {
  
  @JSImport("yadda", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("yadda", "Context")
  @js.native
  open class Context protected ()
    extends typingsJapgolly.yadda.libMod.Context {
    def this(properties: Properties) = this()
  }
  
  @JSImport("yadda", "Dictionary")
  @js.native
  open class Dictionary ()
    extends typingsJapgolly.yadda.libMod.Dictionary {
    def this(prefix: String) = this()
  }
  
  object EventBus {
    
    @JSImport("yadda", "EventBus")
    @js.native
    val ^ : js.Any = js.native
    @JSImport("yadda", "EventBus.EventBus")
    @js.native
    open class EventBus ()
      extends typingsJapgolly.yadda.libMod.EventBus.EventBus
    
    @JSImport("yadda", "EventBus.ON_DEFINE")
    @js.native
    val ON_DEFINE: __ON_DEFINE__ = js.native
    
    @JSImport("yadda", "EventBus.ON_EXECUTE")
    @js.native
    val ON_EXECUTE: __ON_EXECUTE__ = js.native
    
    @JSImport("yadda", "EventBus.ON_SCENARIO")
    @js.native
    val ON_SCENARIO: __ON_SCENARIO__ = js.native
    
    @JSImport("yadda", "EventBus.ON_STEP")
    @js.native
    val ON_STEP: __ON_STEP__ = js.native
    
    inline def instance(): typingsJapgolly.yadda.libEventBusMod.EventBus = ^.asInstanceOf[js.Dynamic].applyDynamic("instance")().asInstanceOf[typingsJapgolly.yadda.libEventBusMod.EventBus]
  }
  
  @JSImport("yadda", "FeatureFileSearch")
  @js.native
  open class FeatureFileSearch protected ()
    extends typingsJapgolly.yadda.libMod.FeatureFileSearch {
    def this(directories: String) = this()
  }
  
  @JSImport("yadda", "FileSearch")
  @js.native
  open class FileSearch protected ()
    extends typingsJapgolly.yadda.libMod.FileSearch {
    def this(directories: String) = this()
    def this(directories: String, patterns: js.RegExp) = this()
  }
  
  @JSImport("yadda", "Interpreter")
  @js.native
  open class Interpreter protected ()
    extends typingsJapgolly.yadda.libMod.Interpreter {
    def this(libraries: js.Array[typingsJapgolly.yadda.libLibraryMod.^]) = this()
    def this(libraries: typingsJapgolly.yadda.libLibraryMod.^) = this()
  }
  
  @JSImport("yadda", "Library")
  @js.native
  open class Library ()
    extends typingsJapgolly.yadda.libMod.Library {
    def this(dictionary: typingsJapgolly.yadda.libDictionaryMod.^) = this()
  }
  
  @JSImport("yadda", "Platform")
  @js.native
  open class Platform ()
    extends typingsJapgolly.yadda.libMod.Platform
  
  @JSImport("yadda", "Yadda")
  @js.native
  open class Yadda protected ()
    extends typingsJapgolly.yadda.libMod.Yadda {
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
    
    @JSImport("yadda", "converters")
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
    
    @JSImport("yadda", "localisation.default")
    @js.native
    val default: typingsJapgolly.yadda.libLocalisationLanguageMod.^[typingsJapgolly.yadda.libLocalisationEnglishMod.Library] = js.native
    
    @JSImport("yadda", "localisation.Chinese")
    @js.native
    val Chinese: typingsJapgolly.yadda.libLocalisationLanguageMod.^[typingsJapgolly.yadda.libLocalisationChineseMod.Library] = js.native
    
    @JSImport("yadda", "localisation.Dutch")
    @js.native
    val Dutch: typingsJapgolly.yadda.libLocalisationLanguageMod.^[typingsJapgolly.yadda.libLocalisationDutchMod.Library] = js.native
    
    @JSImport("yadda", "localisation.English")
    @js.native
    val English: typingsJapgolly.yadda.libLocalisationLanguageMod.^[typingsJapgolly.yadda.libLocalisationEnglishMod.Library] = js.native
    
    @JSImport("yadda", "localisation.French")
    @js.native
    val French: typingsJapgolly.yadda.libLocalisationLanguageMod.^[typingsJapgolly.yadda.libLocalisationFrenchMod.Library] = js.native
    
    @JSImport("yadda", "localisation.German")
    @js.native
    val German: typingsJapgolly.yadda.libLocalisationLanguageMod.^[typingsJapgolly.yadda.libLocalisationGermanMod.Library] = js.native
    
    @JSImport("yadda", "localisation.Language")
    @js.native
    open class Language[TLibrary /* <: typingsJapgolly.yadda.libLocalisationLanguageMod.Library */] protected ()
      extends typingsJapgolly.yadda.libMod.localisation.Language[TLibrary] {
      def this(name: String, vocabulary: Vocabulary) = this()
    }
    
    @JSImport("yadda", "localisation.Norwegian")
    @js.native
    val Norwegian: typingsJapgolly.yadda.libLocalisationLanguageMod.^[typingsJapgolly.yadda.libLocalisationNorwegianMod.Library] = js.native
    
    @JSImport("yadda", "localisation.Pirate")
    @js.native
    val Pirate: typingsJapgolly.yadda.libLocalisationLanguageMod.^[typingsJapgolly.yadda.libLocalisationPirateMod.Library] = js.native
    
    @JSImport("yadda", "localisation.Polish")
    @js.native
    val Polish: typingsJapgolly.yadda.libLocalisationLanguageMod.^[typingsJapgolly.yadda.libLocalisationPolishMod.Library] = js.native
    
    @JSImport("yadda", "localisation.Portuguese")
    @js.native
    val Portuguese: typingsJapgolly.yadda.libLocalisationLanguageMod.^[typingsJapgolly.yadda.libLocalisationPortugueseMod.Library] = js.native
    
    @JSImport("yadda", "localisation.Russian")
    @js.native
    val Russian: typingsJapgolly.yadda.libLocalisationLanguageMod.^[typingsJapgolly.yadda.libLocalisationRussianMod.Library] = js.native
    
    @JSImport("yadda", "localisation.Spanish")
    @js.native
    val Spanish: typingsJapgolly.yadda.libLocalisationLanguageMod.^[typingsJapgolly.yadda.libLocalisationSpanishMod.Library] = js.native
    
    @JSImport("yadda", "localisation.Ukrainian")
    @js.native
    val Ukrainian: typingsJapgolly.yadda.libLocalisationLanguageMod.^[typingsJapgolly.yadda.libLocalisationUkrainianMod.Library] = js.native
    
    type _To = typingsJapgolly.yadda.libLocalisationLanguageMod.^[typingsJapgolly.yadda.libLocalisationEnglishMod.Library]
    
    /* This means you don't have to write `default`, but can instead just say `localisation.foo` */
    override def _to: typingsJapgolly.yadda.libLocalisationLanguageMod.^[typingsJapgolly.yadda.libLocalisationEnglishMod.Library] = default
  }
  
  object parsers {
    
    @JSImport("yadda", "parsers.FeatureFileParser")
    @js.native
    open class FeatureFileParser ()
      extends typingsJapgolly.yadda.libMod.parsers.FeatureFileParser {
      def this(language: typingsJapgolly.yadda.libLocalisationLanguageMod.^[typingsJapgolly.yadda.libLocalisationLanguageMod.Library]) = this()
      def this(options: Options) = this()
    }
    
    @JSImport("yadda", "parsers.FeatureParser")
    @js.native
    open class FeatureParser ()
      extends typingsJapgolly.yadda.libMod.parsers.FeatureParser {
      def this(language: typingsJapgolly.yadda.libLocalisationLanguageMod.^[typingsJapgolly.yadda.libLocalisationLanguageMod.Library]) = this()
      def this(options: Options) = this()
    }
    
    @JSImport("yadda", "parsers.StepParser")
    @js.native
    open class StepParser ()
      extends typingsJapgolly.yadda.libMod.parsers.StepParser
  }
  
  object plugins {
    
    @JSImport("yadda", "plugins")
    @js.native
    val ^ : js.Any = js.native
    
    inline def casper(yadda: typingsJapgolly.yadda.libYaddaMod.^, casper: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("casper")(yadda.asInstanceOf[js.Any], casper.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("yadda", "plugins.jasmine")
    @js.native
    val jasmine: MochaPlugin = js.native
    
    @JSImport("yadda", "plugins.mocha")
    @js.native
    val mocha: MochaPlugin = js.native
  }
}
