package typingsJapgolly.humanObjectDiff

import typingsJapgolly.humanObjectDiff.anon.RecordTemplateTypestring
import typingsJapgolly.humanObjectDiff.anon.RequiredOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("human-object-diff", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with DiffEngine {
    def this(config: Options) = this()
    
    /* CompleteClass */
    override val config: RequiredOptions = js.native
    
    // tslint:disable-next-line:no-unnecessary-generics
    /* CompleteClass */
    override def diff[LHS, RHS](lhs: LHS, rhs: RHS): js.Array[String] = js.native
    
    /* CompleteClass */
    override val sentenceDiffs: js.Array[String] = js.native
    
    /* CompleteClass */
    override val sentences: js.Array[String] = js.native
    
    /* CompleteClass */
    override val templates: RecordTemplateTypestring = js.native
  }
  
  trait DiffEngine extends StObject {
    
    val config: RequiredOptions
    
    // tslint:disable-next-line:no-unnecessary-generics
    def diff[LHS, RHS](lhs: LHS, rhs: RHS): js.Array[String]
    
    val sentenceDiffs: js.Array[String]
    
    val sentences: js.Array[String]
    
    val templates: RecordTemplateTypestring
  }
  object DiffEngine {
    
    inline def apply(
      config: RequiredOptions,
      diff: (Any, Any) => js.Array[String],
      sentenceDiffs: js.Array[String],
      sentences: js.Array[String],
      templates: RecordTemplateTypestring
    ): DiffEngine = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], diff = js.Any.fromFunction2(diff), sentenceDiffs = sentenceDiffs.asInstanceOf[js.Any], sentences = sentences.asInstanceOf[js.Any], templates = templates.asInstanceOf[js.Any])
      __obj.asInstanceOf[DiffEngine]
    }
    
    extension [Self <: DiffEngine](x: Self) {
      
      inline def setConfig(value: RequiredOptions): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setDiff(value: (Any, Any) => js.Array[String]): Self = StObject.set(x, "diff", js.Any.fromFunction2(value))
      
      inline def setSentenceDiffs(value: js.Array[String]): Self = StObject.set(x, "sentenceDiffs", value.asInstanceOf[js.Any])
      
      inline def setSentenceDiffsVarargs(value: String*): Self = StObject.set(x, "sentenceDiffs", js.Array(value*))
      
      inline def setSentences(value: js.Array[String]): Self = StObject.set(x, "sentences", value.asInstanceOf[js.Any])
      
      inline def setSentencesVarargs(value: String*): Self = StObject.set(x, "sentences", js.Array(value*))
      
      inline def setTemplates(value: RecordTemplateTypestring): Self = StObject.set(x, "templates", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    /**
      * @default 'MM/dd/yyyy hh:mm a'
      */
    var dateFormat: js.UndefOr[String] = js.undefined
    
    /**
      * @default false
      */
    var dontHumanizePropertyNames: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default false
      */
    var ignoreArrays: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default 'Obj'
      */
    var objectName: js.UndefOr[String] = js.undefined
    
    var prefilter: js.UndefOr[js.Array[String] | PathPredicate] = js.undefined
    
    /**
      * @default []
      */
    var sensitivePaths: js.UndefOr[js.Array[String]] = js.undefined
    
    var templates: js.UndefOr[RecordTemplateTypestring] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
      
      inline def setDateFormatUndefined: Self = StObject.set(x, "dateFormat", js.undefined)
      
      inline def setDontHumanizePropertyNames(value: Boolean): Self = StObject.set(x, "dontHumanizePropertyNames", value.asInstanceOf[js.Any])
      
      inline def setDontHumanizePropertyNamesUndefined: Self = StObject.set(x, "dontHumanizePropertyNames", js.undefined)
      
      inline def setIgnoreArrays(value: Boolean): Self = StObject.set(x, "ignoreArrays", value.asInstanceOf[js.Any])
      
      inline def setIgnoreArraysUndefined: Self = StObject.set(x, "ignoreArrays", js.undefined)
      
      inline def setObjectName(value: String): Self = StObject.set(x, "objectName", value.asInstanceOf[js.Any])
      
      inline def setObjectNameUndefined: Self = StObject.set(x, "objectName", js.undefined)
      
      inline def setPrefilter(value: js.Array[String] | PathPredicate): Self = StObject.set(x, "prefilter", value.asInstanceOf[js.Any])
      
      inline def setPrefilterFunction2(value: (/* path */ js.Array[String | Double], /* key */ String | Double) => Boolean): Self = StObject.set(x, "prefilter", js.Any.fromFunction2(value))
      
      inline def setPrefilterUndefined: Self = StObject.set(x, "prefilter", js.undefined)
      
      inline def setPrefilterVarargs(value: String*): Self = StObject.set(x, "prefilter", js.Array(value*))
      
      inline def setSensitivePaths(value: js.Array[String]): Self = StObject.set(x, "sensitivePaths", value.asInstanceOf[js.Any])
      
      inline def setSensitivePathsUndefined: Self = StObject.set(x, "sensitivePaths", js.undefined)
      
      inline def setSensitivePathsVarargs(value: String*): Self = StObject.set(x, "sensitivePaths", js.Array(value*))
      
      inline def setTemplates(value: RecordTemplateTypestring): Self = StObject.set(x, "templates", value.asInstanceOf[js.Any])
      
      inline def setTemplatesUndefined: Self = StObject.set(x, "templates", js.undefined)
    }
  }
  
  type PathPredicate = js.Function2[/* path */ js.Array[String | Double], /* key */ String | Double, Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.humanObjectDiff.humanObjectDiffStrings.N
    - typingsJapgolly.humanObjectDiff.humanObjectDiffStrings.D
    - typingsJapgolly.humanObjectDiff.humanObjectDiffStrings.E
    - typingsJapgolly.humanObjectDiff.humanObjectDiffStrings.I
    - typingsJapgolly.humanObjectDiff.humanObjectDiffStrings.R
    - typingsJapgolly.humanObjectDiff.humanObjectDiffStrings.AE
    - typingsJapgolly.humanObjectDiff.humanObjectDiffStrings.NS
    - typingsJapgolly.humanObjectDiff.humanObjectDiffStrings.DS
    - typingsJapgolly.humanObjectDiff.humanObjectDiffStrings.ES
    - typingsJapgolly.humanObjectDiff.humanObjectDiffStrings.IS
    - typingsJapgolly.humanObjectDiff.humanObjectDiffStrings.RS
    - typingsJapgolly.humanObjectDiff.humanObjectDiffStrings.AES
  */
  trait TemplateType extends StObject
  object TemplateType {
    
    inline def AE: typingsJapgolly.humanObjectDiff.humanObjectDiffStrings.AE = "AE".asInstanceOf[typingsJapgolly.humanObjectDiff.humanObjectDiffStrings.AE]
    
    inline def AES: typingsJapgolly.humanObjectDiff.humanObjectDiffStrings.AES = "AES".asInstanceOf[typingsJapgolly.humanObjectDiff.humanObjectDiffStrings.AES]
    
    inline def D: typingsJapgolly.humanObjectDiff.humanObjectDiffStrings.D = "D".asInstanceOf[typingsJapgolly.humanObjectDiff.humanObjectDiffStrings.D]
    
    inline def DS: typingsJapgolly.humanObjectDiff.humanObjectDiffStrings.DS = "DS".asInstanceOf[typingsJapgolly.humanObjectDiff.humanObjectDiffStrings.DS]
    
    inline def E: typingsJapgolly.humanObjectDiff.humanObjectDiffStrings.E = "E".asInstanceOf[typingsJapgolly.humanObjectDiff.humanObjectDiffStrings.E]
    
    inline def ES: typingsJapgolly.humanObjectDiff.humanObjectDiffStrings.ES = "ES".asInstanceOf[typingsJapgolly.humanObjectDiff.humanObjectDiffStrings.ES]
    
    inline def I: typingsJapgolly.humanObjectDiff.humanObjectDiffStrings.I = "I".asInstanceOf[typingsJapgolly.humanObjectDiff.humanObjectDiffStrings.I]
    
    inline def IS: typingsJapgolly.humanObjectDiff.humanObjectDiffStrings.IS = "IS".asInstanceOf[typingsJapgolly.humanObjectDiff.humanObjectDiffStrings.IS]
    
    inline def N: typingsJapgolly.humanObjectDiff.humanObjectDiffStrings.N = "N".asInstanceOf[typingsJapgolly.humanObjectDiff.humanObjectDiffStrings.N]
    
    inline def NS: typingsJapgolly.humanObjectDiff.humanObjectDiffStrings.NS = "NS".asInstanceOf[typingsJapgolly.humanObjectDiff.humanObjectDiffStrings.NS]
    
    inline def R: typingsJapgolly.humanObjectDiff.humanObjectDiffStrings.R = "R".asInstanceOf[typingsJapgolly.humanObjectDiff.humanObjectDiffStrings.R]
    
    inline def RS: typingsJapgolly.humanObjectDiff.humanObjectDiffStrings.RS = "RS".asInstanceOf[typingsJapgolly.humanObjectDiff.humanObjectDiffStrings.RS]
  }
}
