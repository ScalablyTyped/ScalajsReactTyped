package typingsJapgolly.chevrotainGast

import typingsJapgolly.chevrotainGast.anon.Definition
import typingsJapgolly.chevrotainGast.anon.Idx
import typingsJapgolly.chevrotainGast.anon.IgnoreAmbiguities
import typingsJapgolly.chevrotainGast.anon.Label
import typingsJapgolly.chevrotainGast.anon.MaxLookahead
import typingsJapgolly.chevrotainGast.anon.Name
import typingsJapgolly.chevrotainGast.anon.Separator
import typingsJapgolly.chevrotainTypes.mod.IProduction
import typingsJapgolly.chevrotainTypes.mod.IProductionWithOccurrence
import typingsJapgolly.chevrotainTypes.mod.ISerializedGast
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@chevrotain/gast", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@chevrotain/gast", "Alternation")
  @js.native
  open class Alternation protected ()
    extends typingsJapgolly.chevrotainGast.libSrcModelMod.Alternation {
    def this(options: Definition) = this()
  }
  
  @JSImport("@chevrotain/gast", "Alternative")
  @js.native
  open class Alternative protected ()
    extends typingsJapgolly.chevrotainGast.libSrcModelMod.Alternative {
    def this(options: IgnoreAmbiguities) = this()
  }
  
  /* note: abstract class */ @JSImport("@chevrotain/gast", "GAstVisitor")
  @js.native
  open class GAstVisitor ()
    extends typingsJapgolly.chevrotainGast.libSrcVisitorMod.GAstVisitor
  
  @JSImport("@chevrotain/gast", "NonTerminal")
  @js.native
  open class NonTerminal protected ()
    extends typingsJapgolly.chevrotainGast.libSrcModelMod.NonTerminal {
    def this(options: Idx) = this()
  }
  
  @JSImport("@chevrotain/gast", "Option")
  @js.native
  open class Option protected ()
    extends typingsJapgolly.chevrotainGast.libSrcModelMod.Option {
    def this(options: MaxLookahead) = this()
  }
  
  @JSImport("@chevrotain/gast", "Repetition")
  @js.native
  open class Repetition protected ()
    extends typingsJapgolly.chevrotainGast.libSrcModelMod.Repetition {
    def this(options: MaxLookahead) = this()
  }
  
  @JSImport("@chevrotain/gast", "RepetitionMandatory")
  @js.native
  open class RepetitionMandatory protected ()
    extends typingsJapgolly.chevrotainGast.libSrcModelMod.RepetitionMandatory {
    def this(options: MaxLookahead) = this()
  }
  
  @JSImport("@chevrotain/gast", "RepetitionMandatoryWithSeparator")
  @js.native
  open class RepetitionMandatoryWithSeparator protected ()
    extends typingsJapgolly.chevrotainGast.libSrcModelMod.RepetitionMandatoryWithSeparator {
    def this(options: Separator) = this()
  }
  
  @JSImport("@chevrotain/gast", "RepetitionWithSeparator")
  @js.native
  open class RepetitionWithSeparator protected ()
    extends typingsJapgolly.chevrotainGast.libSrcModelMod.RepetitionWithSeparator {
    def this(options: Separator) = this()
  }
  
  @JSImport("@chevrotain/gast", "Rule")
  @js.native
  open class Rule protected ()
    extends typingsJapgolly.chevrotainGast.libSrcModelMod.Rule {
    def this(options: Name) = this()
  }
  
  @JSImport("@chevrotain/gast", "Terminal")
  @js.native
  open class Terminal protected ()
    extends typingsJapgolly.chevrotainGast.libSrcModelMod.Terminal {
    def this(options: Label) = this()
  }
  
  inline def getProductionDslName(prod: IProductionWithOccurrence): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getProductionDslName")(prod.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isBranchingProd(prod: IProduction): /* is @chevrotain/gast.anon.definitionArrayIProductio */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBranchingProd")(prod.asInstanceOf[js.Any]).asInstanceOf[/* is @chevrotain/gast.anon.definitionArrayIProductio */ Boolean]
  
  inline def isOptionalProd(prod: IProduction): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOptionalProd")(prod.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isOptionalProd(
    prod: IProduction,
    alreadyVisited: js.Array[typingsJapgolly.chevrotainGast.libSrcModelMod.NonTerminal]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isOptionalProd")(prod.asInstanceOf[js.Any], alreadyVisited.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isSequenceProd(prod: IProduction): /* is @chevrotain/gast.anon.definitionArrayIProductio */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSequenceProd")(prod.asInstanceOf[js.Any]).asInstanceOf[/* is @chevrotain/gast.anon.definitionArrayIProductio */ Boolean]
  
  inline def serializeGrammar(topRules: js.Array[typingsJapgolly.chevrotainGast.libSrcModelMod.Rule]): js.Array[ISerializedGast] = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeGrammar")(topRules.asInstanceOf[js.Any]).asInstanceOf[js.Array[ISerializedGast]]
  
  inline def serializeProduction(node: IProduction): ISerializedGast = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeProduction")(node.asInstanceOf[js.Any]).asInstanceOf[ISerializedGast]
}
