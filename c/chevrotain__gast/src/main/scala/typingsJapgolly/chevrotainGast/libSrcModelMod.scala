package typingsJapgolly.chevrotainGast

import typingsJapgolly.chevrotainGast.anon.Definition
import typingsJapgolly.chevrotainGast.anon.Idx
import typingsJapgolly.chevrotainGast.anon.IgnoreAmbiguities
import typingsJapgolly.chevrotainGast.anon.Label
import typingsJapgolly.chevrotainGast.anon.MaxLookahead
import typingsJapgolly.chevrotainGast.anon.Name
import typingsJapgolly.chevrotainGast.anon.Separator
import typingsJapgolly.chevrotainTypes.mod.IGASTVisitor
import typingsJapgolly.chevrotainTypes.mod.IProduction
import typingsJapgolly.chevrotainTypes.mod.IProductionWithOccurrence
import typingsJapgolly.chevrotainTypes.mod.ISerializedGast
import typingsJapgolly.chevrotainTypes.mod.TokenType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSrcModelMod {
  
  @JSImport("@chevrotain/gast/lib/src/model", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* note: abstract class */ @JSImport("@chevrotain/gast/lib/src/model", "AbstractProduction")
  @js.native
  open class AbstractProduction[T /* <: IProduction */] protected ()
    extends StObject
       with IProduction {
    def this(_definition: js.Array[T]) = this()
    
    /* protected */ var _definition: js.Array[T] = js.native
    
    /* CompleteClass */
    override def accept(visitor: IGASTVisitor): Unit = js.native
    
    def definition: js.Array[T] = js.native
    def definition_=(value: js.Array[T]): Unit = js.native
  }
  
  @JSImport("@chevrotain/gast/lib/src/model", "Alternation")
  @js.native
  open class Alternation protected ()
    extends AbstractProduction[Alternative]
       with IProductionWithOccurrence {
    def this(options: Definition) = this()
    
    /* CompleteClass */
    override def accept(visitor: IGASTVisitor): Unit = js.native
    
    var hasPredicates: Boolean = js.native
    
    /* CompleteClass */
    var idx: Double = js.native
    
    var ignoreAmbiguities: Boolean = js.native
    
    var maxLookahead: js.UndefOr[Double] = js.native
  }
  
  @JSImport("@chevrotain/gast/lib/src/model", "Alternative")
  @js.native
  open class Alternative protected () extends AbstractProduction[IProduction] {
    def this(options: IgnoreAmbiguities) = this()
    
    var ignoreAmbiguities: Boolean = js.native
  }
  
  @JSImport("@chevrotain/gast/lib/src/model", "NonTerminal")
  @js.native
  open class NonTerminal protected ()
    extends AbstractProduction[IProduction]
       with IProductionWithOccurrence {
    def this(options: Idx) = this()
    
    /* CompleteClass */
    override def accept(visitor: IGASTVisitor): Unit = js.native
    
    /* CompleteClass */
    var idx: Double = js.native
    
    var label: js.UndefOr[String] = js.native
    
    var nonTerminalName: String = js.native
    
    var referencedRule: Rule = js.native
  }
  
  @JSImport("@chevrotain/gast/lib/src/model", "Option")
  @js.native
  open class Option protected ()
    extends AbstractProduction[IProduction]
       with IProductionWithOccurrence {
    def this(options: MaxLookahead) = this()
    
    /* CompleteClass */
    override def accept(visitor: IGASTVisitor): Unit = js.native
    
    /* CompleteClass */
    var idx: Double = js.native
    
    var maxLookahead: js.UndefOr[Double] = js.native
  }
  
  @JSImport("@chevrotain/gast/lib/src/model", "Repetition")
  @js.native
  open class Repetition protected ()
    extends AbstractProduction[IProduction]
       with IProductionWithOccurrence {
    def this(options: MaxLookahead) = this()
    
    /* CompleteClass */
    override def accept(visitor: IGASTVisitor): Unit = js.native
    
    /* CompleteClass */
    var idx: Double = js.native
    
    var maxLookahead: js.UndefOr[Double] = js.native
    
    var separator: TokenType = js.native
  }
  
  @JSImport("@chevrotain/gast/lib/src/model", "RepetitionMandatory")
  @js.native
  open class RepetitionMandatory protected ()
    extends AbstractProduction[IProduction]
       with IProductionWithOccurrence {
    def this(options: MaxLookahead) = this()
    
    /* CompleteClass */
    override def accept(visitor: IGASTVisitor): Unit = js.native
    
    /* CompleteClass */
    var idx: Double = js.native
    
    var maxLookahead: js.UndefOr[Double] = js.native
  }
  
  @JSImport("@chevrotain/gast/lib/src/model", "RepetitionMandatoryWithSeparator")
  @js.native
  open class RepetitionMandatoryWithSeparator protected ()
    extends AbstractProduction[IProduction]
       with IProductionWithOccurrence {
    def this(options: Separator) = this()
    
    /* CompleteClass */
    override def accept(visitor: IGASTVisitor): Unit = js.native
    
    /* CompleteClass */
    var idx: Double = js.native
    
    var maxLookahead: js.UndefOr[Double] = js.native
    
    var separator: TokenType = js.native
  }
  
  @JSImport("@chevrotain/gast/lib/src/model", "RepetitionWithSeparator")
  @js.native
  open class RepetitionWithSeparator protected ()
    extends AbstractProduction[IProduction]
       with IProductionWithOccurrence {
    def this(options: Separator) = this()
    
    /* CompleteClass */
    override def accept(visitor: IGASTVisitor): Unit = js.native
    
    /* CompleteClass */
    var idx: Double = js.native
    
    var maxLookahead: js.UndefOr[Double] = js.native
    
    var separator: TokenType = js.native
  }
  
  @JSImport("@chevrotain/gast/lib/src/model", "Rule")
  @js.native
  open class Rule protected () extends AbstractProduction[IProduction] {
    def this(options: Name) = this()
    
    var name: String = js.native
    
    var orgText: String = js.native
  }
  
  @JSImport("@chevrotain/gast/lib/src/model", "Terminal")
  @js.native
  open class Terminal protected ()
    extends StObject
       with IProductionWithOccurrence {
    def this(options: Label) = this()
    
    /* CompleteClass */
    override def accept(visitor: IGASTVisitor): Unit = js.native
    
    /* CompleteClass */
    var idx: Double = js.native
    
    var label: js.UndefOr[String] = js.native
    
    var terminalType: TokenType = js.native
  }
  
  inline def serializeGrammar(topRules: js.Array[Rule]): js.Array[ISerializedGast] = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeGrammar")(topRules.asInstanceOf[js.Any]).asInstanceOf[js.Array[ISerializedGast]]
  
  inline def serializeProduction(node: IProduction): ISerializedGast = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeProduction")(node.asInstanceOf[js.Any]).asInstanceOf[ISerializedGast]
  
  trait ISerializedBasic
    extends StObject
       with ISerializedGast
       with ISerializedGastAny {
    
    var idx: js.UndefOr[Double] = js.undefined
    
    @JSName("type")
    var type_ISerializedBasic: typingsJapgolly.chevrotainGast.chevrotainGastStrings.Alternative | typingsJapgolly.chevrotainGast.chevrotainGastStrings.Option | typingsJapgolly.chevrotainGast.chevrotainGastStrings.RepetitionMandatory | typingsJapgolly.chevrotainGast.chevrotainGastStrings.Repetition | typingsJapgolly.chevrotainGast.chevrotainGastStrings.Alternation
  }
  object ISerializedBasic {
    
    inline def apply(
      `type`: typingsJapgolly.chevrotainGast.chevrotainGastStrings.Alternative | typingsJapgolly.chevrotainGast.chevrotainGastStrings.Option | typingsJapgolly.chevrotainGast.chevrotainGastStrings.RepetitionMandatory | typingsJapgolly.chevrotainGast.chevrotainGastStrings.Repetition | typingsJapgolly.chevrotainGast.chevrotainGastStrings.Alternation
    ): ISerializedBasic = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISerializedBasic]
    }
    
    extension [Self <: ISerializedBasic](x: Self) {
      
      inline def setIdx(value: Double): Self = StObject.set(x, "idx", value.asInstanceOf[js.Any])
      
      inline def setIdxUndefined: Self = StObject.set(x, "idx", js.undefined)
      
      inline def setType(
        value: typingsJapgolly.chevrotainGast.chevrotainGastStrings.Alternative | typingsJapgolly.chevrotainGast.chevrotainGastStrings.Option | typingsJapgolly.chevrotainGast.chevrotainGastStrings.RepetitionMandatory | typingsJapgolly.chevrotainGast.chevrotainGastStrings.Repetition | typingsJapgolly.chevrotainGast.chevrotainGastStrings.Alternation
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.chevrotainGast.libSrcModelMod.ISerializedBasic
    - typingsJapgolly.chevrotainGast.libSrcModelMod.ISerializedGastRule
    - typingsJapgolly.chevrotainGast.libSrcModelMod.ISerializedNonTerminal
    - typingsJapgolly.chevrotainGast.libSrcModelMod.ISerializedTerminal
    - typingsJapgolly.chevrotainGast.libSrcModelMod.ISerializedTerminalWithSeparator
  */
  trait ISerializedGastAny extends StObject
  object ISerializedGastAny {
    
    inline def ISerializedBasic(
      `type`: typingsJapgolly.chevrotainGast.chevrotainGastStrings.Alternative | typingsJapgolly.chevrotainGast.chevrotainGastStrings.Option | typingsJapgolly.chevrotainGast.chevrotainGastStrings.RepetitionMandatory | typingsJapgolly.chevrotainGast.chevrotainGastStrings.Repetition | typingsJapgolly.chevrotainGast.chevrotainGastStrings.Alternation
    ): typingsJapgolly.chevrotainGast.libSrcModelMod.ISerializedBasic = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.chevrotainGast.libSrcModelMod.ISerializedBasic]
    }
    
    inline def ISerializedGastRule(name: String, orgText: String): typingsJapgolly.chevrotainGast.libSrcModelMod.ISerializedGastRule = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], orgText = orgText.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Rule")
      __obj.asInstanceOf[typingsJapgolly.chevrotainGast.libSrcModelMod.ISerializedGastRule]
    }
    
    inline def ISerializedNonTerminal(idx: Double, name: String): typingsJapgolly.chevrotainGast.libSrcModelMod.ISerializedNonTerminal = {
      val __obj = js.Dynamic.literal(idx = idx.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("NonTerminal")
      __obj.asInstanceOf[typingsJapgolly.chevrotainGast.libSrcModelMod.ISerializedNonTerminal]
    }
    
    inline def ISerializedTerminal(idx: Double, name: String): typingsJapgolly.chevrotainGast.libSrcModelMod.ISerializedTerminal = {
      val __obj = js.Dynamic.literal(idx = idx.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Terminal")
      __obj.asInstanceOf[typingsJapgolly.chevrotainGast.libSrcModelMod.ISerializedTerminal]
    }
    
    inline def ISerializedTerminalWithSeparator(
      idx: Double,
      separator: ISerializedTerminal,
      `type`: typingsJapgolly.chevrotainGast.chevrotainGastStrings.RepetitionMandatoryWithSeparator | typingsJapgolly.chevrotainGast.chevrotainGastStrings.RepetitionWithSeparator
    ): typingsJapgolly.chevrotainGast.libSrcModelMod.ISerializedTerminalWithSeparator = {
      val __obj = js.Dynamic.literal(idx = idx.asInstanceOf[js.Any], separator = separator.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.chevrotainGast.libSrcModelMod.ISerializedTerminalWithSeparator]
    }
  }
  
  trait ISerializedGastRule
    extends StObject
       with ISerializedGast
       with ISerializedGastAny {
    
    var name: String
    
    var orgText: String
    
    @JSName("type")
    var type_ISerializedGastRule: typingsJapgolly.chevrotainGast.chevrotainGastStrings.Rule
  }
  object ISerializedGastRule {
    
    inline def apply(name: String, orgText: String): ISerializedGastRule = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], orgText = orgText.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Rule")
      __obj.asInstanceOf[ISerializedGastRule]
    }
    
    extension [Self <: ISerializedGastRule](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOrgText(value: String): Self = StObject.set(x, "orgText", value.asInstanceOf[js.Any])
      
      inline def setType(value: typingsJapgolly.chevrotainGast.chevrotainGastStrings.Rule): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ISerializedNonTerminal
    extends StObject
       with ISerializedGast
       with ISerializedGastAny {
    
    var idx: Double
    
    var label: js.UndefOr[String] = js.undefined
    
    var name: String
    
    @JSName("type")
    var type_ISerializedNonTerminal: typingsJapgolly.chevrotainGast.chevrotainGastStrings.NonTerminal
  }
  object ISerializedNonTerminal {
    
    inline def apply(idx: Double, name: String): ISerializedNonTerminal = {
      val __obj = js.Dynamic.literal(idx = idx.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("NonTerminal")
      __obj.asInstanceOf[ISerializedNonTerminal]
    }
    
    extension [Self <: ISerializedNonTerminal](x: Self) {
      
      inline def setIdx(value: Double): Self = StObject.set(x, "idx", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: typingsJapgolly.chevrotainGast.chevrotainGastStrings.NonTerminal): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ISerializedTerminal
    extends StObject
       with ISerializedGast
       with ISerializedGastAny {
    
    var idx: Double
    
    var label: js.UndefOr[String] = js.undefined
    
    var name: String
    
    var pattern: js.UndefOr[String] = js.undefined
    
    var terminalLabel: js.UndefOr[String] = js.undefined
    
    @JSName("type")
    var type_ISerializedTerminal: typingsJapgolly.chevrotainGast.chevrotainGastStrings.Terminal
  }
  object ISerializedTerminal {
    
    inline def apply(idx: Double, name: String): ISerializedTerminal = {
      val __obj = js.Dynamic.literal(idx = idx.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Terminal")
      __obj.asInstanceOf[ISerializedTerminal]
    }
    
    extension [Self <: ISerializedTerminal](x: Self) {
      
      inline def setIdx(value: Double): Self = StObject.set(x, "idx", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      inline def setTerminalLabel(value: String): Self = StObject.set(x, "terminalLabel", value.asInstanceOf[js.Any])
      
      inline def setTerminalLabelUndefined: Self = StObject.set(x, "terminalLabel", js.undefined)
      
      inline def setType(value: typingsJapgolly.chevrotainGast.chevrotainGastStrings.Terminal): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ISerializedTerminalWithSeparator
    extends StObject
       with ISerializedGast
       with ISerializedGastAny {
    
    var idx: Double
    
    var separator: ISerializedTerminal
    
    @JSName("type")
    var type_ISerializedTerminalWithSeparator: typingsJapgolly.chevrotainGast.chevrotainGastStrings.RepetitionMandatoryWithSeparator | typingsJapgolly.chevrotainGast.chevrotainGastStrings.RepetitionWithSeparator
  }
  object ISerializedTerminalWithSeparator {
    
    inline def apply(
      idx: Double,
      separator: ISerializedTerminal,
      `type`: typingsJapgolly.chevrotainGast.chevrotainGastStrings.RepetitionMandatoryWithSeparator | typingsJapgolly.chevrotainGast.chevrotainGastStrings.RepetitionWithSeparator
    ): ISerializedTerminalWithSeparator = {
      val __obj = js.Dynamic.literal(idx = idx.asInstanceOf[js.Any], separator = separator.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISerializedTerminalWithSeparator]
    }
    
    extension [Self <: ISerializedTerminalWithSeparator](x: Self) {
      
      inline def setIdx(value: Double): Self = StObject.set(x, "idx", value.asInstanceOf[js.Any])
      
      inline def setSeparator(value: ISerializedTerminal): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setType(
        value: typingsJapgolly.chevrotainGast.chevrotainGastStrings.RepetitionMandatoryWithSeparator | typingsJapgolly.chevrotainGast.chevrotainGastStrings.RepetitionWithSeparator
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
