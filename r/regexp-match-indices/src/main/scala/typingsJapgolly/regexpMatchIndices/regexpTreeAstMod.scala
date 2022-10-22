package typingsJapgolly.regexpMatchIndices

import typingsJapgolly.regexpMatchIndices.anon.Format
import typingsJapgolly.regexpMatchIndices.anon.PartialAlternative
import typingsJapgolly.regexpMatchIndices.anon.PartialAstRegExp
import typingsJapgolly.regexpMatchIndices.anon.PartialCharacterClass
import typingsJapgolly.regexpMatchIndices.anon.PartialClassRange
import typingsJapgolly.regexpMatchIndices.anon.PartialDisjunction
import typingsJapgolly.regexpMatchIndices.anon.PartialRepetition
import typingsJapgolly.regexpMatchIndices.regexpMatchIndicesInts.`0`
import typingsJapgolly.regexpMatchIndices.regexpMatchIndicesStrings.assertion
import typingsJapgolly.regexpMatchIndices.regexpMatchIndicesStrings.body
import typingsJapgolly.regexpMatchIndices.regexpMatchIndicesStrings.expression
import typingsJapgolly.regexpMatchIndices.regexpMatchIndicesStrings.expressions
import typingsJapgolly.regexpMatchIndices.regexpMatchIndicesStrings.from
import typingsJapgolly.regexpMatchIndices.regexpMatchIndicesStrings.quantifier
import typingsJapgolly.regexpMatchIndices.regexpMatchIndicesStrings.to
import typingsJapgolly.regexpMatchIndices.regexpTreeAstMod.AstPath.Alternative
import typingsJapgolly.regexpMatchIndices.regexpTreeAstMod.AstPath.Assertion
import typingsJapgolly.regexpMatchIndices.regexpTreeAstMod.AstPath.Backreference
import typingsJapgolly.regexpMatchIndices.regexpTreeAstMod.AstPath.Char
import typingsJapgolly.regexpMatchIndices.regexpTreeAstMod.AstPath.CharacterClass
import typingsJapgolly.regexpMatchIndices.regexpTreeAstMod.AstPath.ClassRange
import typingsJapgolly.regexpMatchIndices.regexpTreeAstMod.AstPath.Disjunction
import typingsJapgolly.regexpMatchIndices.regexpTreeAstMod.AstPath.Group
import typingsJapgolly.regexpMatchIndices.regexpTreeAstMod.AstPath.Quantifier
import typingsJapgolly.regexpMatchIndices.regexpTreeAstMod.AstPath.RegExp
import typingsJapgolly.regexpMatchIndices.regexpTreeAstMod.AstPath.Repetition
import typingsJapgolly.regexpTree.astMod.AstRegExp
import typingsJapgolly.regexpTree.astMod.CapturingGroup
import typingsJapgolly.regexpTree.astMod.Expression
import typingsJapgolly.regexpTree.astMod.LookaroundAssertion
import typingsJapgolly.regexpTree.astMod.NamedBackreference
import typingsJapgolly.regexpTree.astMod.NoncapturingGroup
import typingsJapgolly.regexpTree.astMod.NumericBackreference
import typingsJapgolly.regexpTree.astMod.RangeQuantifier
import typingsJapgolly.regexpTree.astMod.SimpleAssertion
import typingsJapgolly.regexpTree.astMod.SimpleChar
import typingsJapgolly.regexpTree.astMod.SimpleQuantifier
import typingsJapgolly.regexpTree.astMod.SpecialChar
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object regexpTreeAstMod {
  
  /* Inlined regexp-match-indices.regexp-tree/ast.AstTypes[keyof regexp-match-indices.regexp-tree/ast.AstTypes] */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.regexpMatchIndices.regexpMatchIndicesStrings.kind
    - typingsJapgolly.regexpMatchIndices.regexpMatchIndicesStrings.from
    - typingsJapgolly.regexpMatchIndices.regexpMatchIndicesStrings.to
    - typingsJapgolly.regexpMatchIndices.regexpMatchIndicesStrings.quantifier
    - typingsJapgolly.regexpMatchIndices.regexpMatchIndicesStrings.expressions
    - typingsJapgolly.regexpMatchIndices.regexpMatchIndicesStrings.codePoint
    - typingsJapgolly.regexpMatchIndices.regexpMatchIndicesStrings.value
    - typingsJapgolly.regexpMatchIndices.regexpMatchIndicesStrings.escaped
    - typingsJapgolly.regexpMatchIndices.regexpMatchIndicesStrings.reference
    - typingsJapgolly.regexpMatchIndices.regexpMatchIndicesStrings.flags
    - typingsJapgolly.regexpMatchIndices.regexpMatchIndicesStrings.expression
    - typingsJapgolly.regexpMatchIndices.regexpMatchIndicesStrings.assertion
    - typingsJapgolly.regexpMatchIndices.regexpMatchIndicesStrings.body
    - typingsJapgolly.regexpMatchIndices.regexpMatchIndicesStrings.right
    - typingsJapgolly.regexpMatchIndices.regexpMatchIndicesStrings.capturing
    - typingsJapgolly.regexpMatchIndices.regexpMatchIndicesStrings.nameRaw
    - typingsJapgolly.regexpMatchIndices.regexpMatchIndicesStrings.greedy
    - typingsJapgolly.regexpMatchIndices.regexpMatchIndicesStrings.number
    - typingsJapgolly.regexpMatchIndices.regexpMatchIndicesStrings.referenceRaw
    - typingsJapgolly.regexpMatchIndices.regexpMatchIndicesStrings.left
    - typingsJapgolly.regexpMatchIndices.regexpMatchIndicesStrings.name
    - typingsJapgolly.regexpMatchIndices.regexpMatchIndicesStrings.negative
  */
  trait AstNode extends StObject
  object AstNode {
    
    inline def assertion: typingsJapgolly.regexpMatchIndices.regexpMatchIndicesStrings.assertion = "assertion".asInstanceOf[typingsJapgolly.regexpMatchIndices.regexpMatchIndicesStrings.assertion]
    
    inline def body: typingsJapgolly.regexpMatchIndices.regexpMatchIndicesStrings.body = "body".asInstanceOf[typingsJapgolly.regexpMatchIndices.regexpMatchIndicesStrings.body]
    
    inline def capturing: typingsJapgolly.regexpMatchIndices.regexpMatchIndicesStrings.capturing = "capturing".asInstanceOf[typingsJapgolly.regexpMatchIndices.regexpMatchIndicesStrings.capturing]
    
    inline def codePoint: typingsJapgolly.regexpMatchIndices.regexpMatchIndicesStrings.codePoint = "codePoint".asInstanceOf[typingsJapgolly.regexpMatchIndices.regexpMatchIndicesStrings.codePoint]
    
    inline def escaped: typingsJapgolly.regexpMatchIndices.regexpMatchIndicesStrings.escaped = "escaped".asInstanceOf[typingsJapgolly.regexpMatchIndices.regexpMatchIndicesStrings.escaped]
    
    inline def expression: typingsJapgolly.regexpMatchIndices.regexpMatchIndicesStrings.expression = "expression".asInstanceOf[typingsJapgolly.regexpMatchIndices.regexpMatchIndicesStrings.expression]
    
    inline def expressions: typingsJapgolly.regexpMatchIndices.regexpMatchIndicesStrings.expressions = "expressions".asInstanceOf[typingsJapgolly.regexpMatchIndices.regexpMatchIndicesStrings.expressions]
    
    inline def flags: typingsJapgolly.regexpMatchIndices.regexpMatchIndicesStrings.flags = "flags".asInstanceOf[typingsJapgolly.regexpMatchIndices.regexpMatchIndicesStrings.flags]
    
    inline def from: typingsJapgolly.regexpMatchIndices.regexpMatchIndicesStrings.from = "from".asInstanceOf[typingsJapgolly.regexpMatchIndices.regexpMatchIndicesStrings.from]
    
    inline def greedy: typingsJapgolly.regexpMatchIndices.regexpMatchIndicesStrings.greedy = "greedy".asInstanceOf[typingsJapgolly.regexpMatchIndices.regexpMatchIndicesStrings.greedy]
    
    inline def kind: typingsJapgolly.regexpMatchIndices.regexpMatchIndicesStrings.kind = "kind".asInstanceOf[typingsJapgolly.regexpMatchIndices.regexpMatchIndicesStrings.kind]
    
    inline def left: typingsJapgolly.regexpMatchIndices.regexpMatchIndicesStrings.left = "left".asInstanceOf[typingsJapgolly.regexpMatchIndices.regexpMatchIndicesStrings.left]
    
    inline def name: typingsJapgolly.regexpMatchIndices.regexpMatchIndicesStrings.name = "name".asInstanceOf[typingsJapgolly.regexpMatchIndices.regexpMatchIndicesStrings.name]
    
    inline def nameRaw: typingsJapgolly.regexpMatchIndices.regexpMatchIndicesStrings.nameRaw = "nameRaw".asInstanceOf[typingsJapgolly.regexpMatchIndices.regexpMatchIndicesStrings.nameRaw]
    
    inline def negative: typingsJapgolly.regexpMatchIndices.regexpMatchIndicesStrings.negative = "negative".asInstanceOf[typingsJapgolly.regexpMatchIndices.regexpMatchIndicesStrings.negative]
    
    inline def number: typingsJapgolly.regexpMatchIndices.regexpMatchIndicesStrings.number = "number".asInstanceOf[typingsJapgolly.regexpMatchIndices.regexpMatchIndicesStrings.number]
    
    inline def quantifier: typingsJapgolly.regexpMatchIndices.regexpMatchIndicesStrings.quantifier = "quantifier".asInstanceOf[typingsJapgolly.regexpMatchIndices.regexpMatchIndicesStrings.quantifier]
    
    inline def reference: typingsJapgolly.regexpMatchIndices.regexpMatchIndicesStrings.reference = "reference".asInstanceOf[typingsJapgolly.regexpMatchIndices.regexpMatchIndicesStrings.reference]
    
    inline def referenceRaw: typingsJapgolly.regexpMatchIndices.regexpMatchIndicesStrings.referenceRaw = "referenceRaw".asInstanceOf[typingsJapgolly.regexpMatchIndices.regexpMatchIndicesStrings.referenceRaw]
    
    inline def right: typingsJapgolly.regexpMatchIndices.regexpMatchIndicesStrings.right = "right".asInstanceOf[typingsJapgolly.regexpMatchIndices.regexpMatchIndicesStrings.right]
    
    inline def to: typingsJapgolly.regexpMatchIndices.regexpMatchIndicesStrings.to = "to".asInstanceOf[typingsJapgolly.regexpMatchIndices.regexpMatchIndicesStrings.to]
    
    inline def value: typingsJapgolly.regexpMatchIndices.regexpMatchIndicesStrings.value = "value".asInstanceOf[typingsJapgolly.regexpMatchIndices.regexpMatchIndicesStrings.value]
  }
  
  object AstPath {
    
    @js.native
    trait Alternative extends StObject {
      
      def appendChild(node: typingsJapgolly.regexpTree.astMod.Alternative): AstPath[typingsJapgolly.regexpTree.astMod.Alternative] = js.native
      def appendChild(node: CapturingGroup): AstPath[CapturingGroup] = js.native
      def appendChild(node: typingsJapgolly.regexpTree.astMod.CharacterClass): AstPath[typingsJapgolly.regexpTree.astMod.CharacterClass] = js.native
      def appendChild(node: typingsJapgolly.regexpTree.astMod.Disjunction): AstPath[typingsJapgolly.regexpTree.astMod.Disjunction] = js.native
      def appendChild(node: LookaroundAssertion): AstPath[LookaroundAssertion] = js.native
      def appendChild(node: NamedBackreference): AstPath[NamedBackreference] = js.native
      def appendChild(node: NoncapturingGroup): AstPath[NoncapturingGroup] = js.native
      def appendChild(node: NumericBackreference): AstPath[NumericBackreference] = js.native
      def appendChild(node: typingsJapgolly.regexpTree.astMod.Repetition): AstPath[typingsJapgolly.regexpTree.astMod.Repetition] = js.native
      def appendChild(node: SimpleAssertion): AstPath[SimpleAssertion] = js.native
      def appendChild(node: SimpleChar): AstPath[SimpleChar] = js.native
      def appendChild(node: SpecialChar): AstPath[SpecialChar] = js.native
      @JSName("appendChild")
      def appendChild_expressions(node: typingsJapgolly.regexpTree.astMod.Alternative, property: expressions): AstPath[typingsJapgolly.regexpTree.astMod.Alternative] = js.native
      @JSName("appendChild")
      def appendChild_expressions(node: CapturingGroup, property: expressions): AstPath[CapturingGroup] = js.native
      @JSName("appendChild")
      def appendChild_expressions(node: typingsJapgolly.regexpTree.astMod.CharacterClass, property: expressions): AstPath[typingsJapgolly.regexpTree.astMod.CharacterClass] = js.native
      @JSName("appendChild")
      def appendChild_expressions(node: typingsJapgolly.regexpTree.astMod.Disjunction, property: expressions): AstPath[typingsJapgolly.regexpTree.astMod.Disjunction] = js.native
      @JSName("appendChild")
      def appendChild_expressions(node: LookaroundAssertion, property: expressions): AstPath[LookaroundAssertion] = js.native
      @JSName("appendChild")
      def appendChild_expressions(node: NamedBackreference, property: expressions): AstPath[NamedBackreference] = js.native
      @JSName("appendChild")
      def appendChild_expressions(node: NoncapturingGroup, property: expressions): AstPath[NoncapturingGroup] = js.native
      @JSName("appendChild")
      def appendChild_expressions(node: NumericBackreference, property: expressions): AstPath[NumericBackreference] = js.native
      @JSName("appendChild")
      def appendChild_expressions(node: typingsJapgolly.regexpTree.astMod.Repetition, property: expressions): AstPath[typingsJapgolly.regexpTree.astMod.Repetition] = js.native
      @JSName("appendChild")
      def appendChild_expressions(node: SimpleAssertion, property: expressions): AstPath[SimpleAssertion] = js.native
      @JSName("appendChild")
      def appendChild_expressions(node: SimpleChar, property: expressions): AstPath[SimpleChar] = js.native
      @JSName("appendChild")
      def appendChild_expressions(node: SpecialChar, property: expressions): AstPath[SpecialChar] = js.native
      
      def getChild(): AstPath[Expression] = js.native
      def getChild(n: Double): AstPath[Expression] = js.native
      
      def getNextSibling(): AstPath[Expression] | Null = js.native
      
      def getParent(): (AstPath[
            AstRegExp | typingsJapgolly.regexpTree.astMod.Disjunction | typingsJapgolly.regexpTree.astMod.Alternative | typingsJapgolly.regexpTree.astMod.Assertion | typingsJapgolly.regexpTree.astMod.Group | typingsJapgolly.regexpTree.astMod.Repetition
          ]) | Null = js.native
      
      def getPreviousSibling(): AstPath[Expression] | Null = js.native
      
      def hasEqualSource(path: AstPath[AstNode]): Boolean = js.native
      
      var index: Double | Null = js.native
      
      def isRemoved(): Boolean = js.native
      
      def jsonEncode(): String = js.native
      def jsonEncode(options: Format): String = js.native
      
      var node: typingsJapgolly.regexpTree.astMod.Alternative = js.native
      
      var parent: AstRegExp | typingsJapgolly.regexpTree.astMod.Disjunction | typingsJapgolly.regexpTree.astMod.Alternative | typingsJapgolly.regexpTree.astMod.Assertion | typingsJapgolly.regexpTree.astMod.Group | typingsJapgolly.regexpTree.astMod.Repetition | Null = js.native
      
      var parentPath: (AstPath[
            AstRegExp | typingsJapgolly.regexpTree.astMod.Disjunction | typingsJapgolly.regexpTree.astMod.Alternative | typingsJapgolly.regexpTree.astMod.Assertion | typingsJapgolly.regexpTree.astMod.Group | typingsJapgolly.regexpTree.astMod.Repetition
          ]) | Null = js.native
      
      var property: String | Null = js.native
      
      def remove(): Unit = js.native
      
      def replace(node: typingsJapgolly.regexpTree.astMod.Alternative): AstPath[typingsJapgolly.regexpTree.astMod.Alternative] | Null = js.native
      def replace(node: CapturingGroup): AstPath[CapturingGroup] | Null = js.native
      def replace(node: typingsJapgolly.regexpTree.astMod.CharacterClass): AstPath[typingsJapgolly.regexpTree.astMod.CharacterClass] | Null = js.native
      def replace(node: typingsJapgolly.regexpTree.astMod.Disjunction): AstPath[typingsJapgolly.regexpTree.astMod.Disjunction] | Null = js.native
      def replace(node: LookaroundAssertion): AstPath[LookaroundAssertion] | Null = js.native
      def replace(node: NamedBackreference): AstPath[NamedBackreference] | Null = js.native
      def replace(node: NoncapturingGroup): AstPath[NoncapturingGroup] | Null = js.native
      def replace(node: NumericBackreference): AstPath[NumericBackreference] | Null = js.native
      def replace(node: typingsJapgolly.regexpTree.astMod.Repetition): AstPath[typingsJapgolly.regexpTree.astMod.Repetition] | Null = js.native
      def replace(node: SimpleAssertion): AstPath[SimpleAssertion] | Null = js.native
      def replace(node: SimpleChar): AstPath[SimpleChar] | Null = js.native
      def replace(node: SpecialChar): AstPath[SpecialChar] | Null = js.native
      
      def setChild(node: typingsJapgolly.regexpTree.astMod.Alternative, index: Double): AstPath[typingsJapgolly.regexpTree.astMod.Alternative] = js.native
      def setChild(node: CapturingGroup, index: Double): AstPath[CapturingGroup] = js.native
      def setChild(node: typingsJapgolly.regexpTree.astMod.CharacterClass, index: Double): AstPath[typingsJapgolly.regexpTree.astMod.CharacterClass] = js.native
      def setChild(node: typingsJapgolly.regexpTree.astMod.Disjunction, index: Double): AstPath[typingsJapgolly.regexpTree.astMod.Disjunction] = js.native
      def setChild(node: LookaroundAssertion, index: Double): AstPath[LookaroundAssertion] = js.native
      def setChild(node: NamedBackreference, index: Double): AstPath[NamedBackreference] = js.native
      def setChild(node: NoncapturingGroup, index: Double): AstPath[NoncapturingGroup] = js.native
      def setChild(node: NumericBackreference, index: Double): AstPath[NumericBackreference] = js.native
      def setChild(node: typingsJapgolly.regexpTree.astMod.Repetition, index: Double): AstPath[typingsJapgolly.regexpTree.astMod.Repetition] = js.native
      def setChild(node: SimpleAssertion, index: Double): AstPath[SimpleAssertion] = js.native
      def setChild(node: SimpleChar, index: Double): AstPath[SimpleChar] = js.native
      def setChild(node: SpecialChar, index: Double): AstPath[SpecialChar] = js.native
      @JSName("setChild")
      def setChild_expressions(node: typingsJapgolly.regexpTree.astMod.Alternative, index: Double, property: expressions): AstPath[typingsJapgolly.regexpTree.astMod.Alternative] = js.native
      @JSName("setChild")
      def setChild_expressions(node: CapturingGroup, index: Double, property: expressions): AstPath[CapturingGroup] = js.native
      @JSName("setChild")
      def setChild_expressions(node: typingsJapgolly.regexpTree.astMod.CharacterClass, index: Double, property: expressions): AstPath[typingsJapgolly.regexpTree.astMod.CharacterClass] = js.native
      @JSName("setChild")
      def setChild_expressions(node: typingsJapgolly.regexpTree.astMod.Disjunction, index: Double, property: expressions): AstPath[typingsJapgolly.regexpTree.astMod.Disjunction] = js.native
      @JSName("setChild")
      def setChild_expressions(node: LookaroundAssertion, index: Double, property: expressions): AstPath[LookaroundAssertion] = js.native
      @JSName("setChild")
      def setChild_expressions(node: NamedBackreference, index: Double, property: expressions): AstPath[NamedBackreference] = js.native
      @JSName("setChild")
      def setChild_expressions(node: NoncapturingGroup, index: Double, property: expressions): AstPath[NoncapturingGroup] = js.native
      @JSName("setChild")
      def setChild_expressions(node: NumericBackreference, index: Double, property: expressions): AstPath[NumericBackreference] = js.native
      @JSName("setChild")
      def setChild_expressions(node: typingsJapgolly.regexpTree.astMod.Repetition, index: Double, property: expressions): AstPath[typingsJapgolly.regexpTree.astMod.Repetition] = js.native
      @JSName("setChild")
      def setChild_expressions(node: SimpleAssertion, index: Double, property: expressions): AstPath[SimpleAssertion] = js.native
      @JSName("setChild")
      def setChild_expressions(node: SimpleChar, index: Double, property: expressions): AstPath[SimpleChar] = js.native
      @JSName("setChild")
      def setChild_expressions(node: SpecialChar, index: Double, property: expressions): AstPath[SpecialChar] = js.native
      
      def update(nodeProps: PartialAlternative): Unit = js.native
    }
    
    @js.native
    trait Assertion extends StObject {
      
      def getNextSibling(): AstPath[Expression] | Null = js.native
      
      def getParent(): (AstPath[
            AstRegExp | typingsJapgolly.regexpTree.astMod.Disjunction | typingsJapgolly.regexpTree.astMod.Alternative | typingsJapgolly.regexpTree.astMod.Assertion | typingsJapgolly.regexpTree.astMod.Group | typingsJapgolly.regexpTree.astMod.Repetition
          ]) | Null = js.native
      
      def getPreviousSibling(): AstPath[Expression] | Null = js.native
      
      def hasEqualSource(path: AstPath[AstNode]): Boolean = js.native
      
      var index: Double | Null = js.native
      
      def isRemoved(): Boolean = js.native
      
      def jsonEncode(): String = js.native
      def jsonEncode(options: Format): String = js.native
      
      var node: typingsJapgolly.regexpTree.astMod.Assertion = js.native
      
      var parent: AstRegExp | typingsJapgolly.regexpTree.astMod.Disjunction | typingsJapgolly.regexpTree.astMod.Alternative | typingsJapgolly.regexpTree.astMod.Assertion | typingsJapgolly.regexpTree.astMod.Group | typingsJapgolly.regexpTree.astMod.Repetition | Null = js.native
      
      var parentPath: (AstPath[
            AstRegExp | typingsJapgolly.regexpTree.astMod.Disjunction | typingsJapgolly.regexpTree.astMod.Alternative | typingsJapgolly.regexpTree.astMod.Assertion | typingsJapgolly.regexpTree.astMod.Group | typingsJapgolly.regexpTree.astMod.Repetition
          ]) | Null = js.native
      
      var property: String | Null = js.native
      
      def remove(): Unit = js.native
      
      def replace(node: typingsJapgolly.regexpTree.astMod.Alternative): AstPath[typingsJapgolly.regexpTree.astMod.Alternative] | Null = js.native
      def replace(node: CapturingGroup): AstPath[CapturingGroup] | Null = js.native
      def replace(node: typingsJapgolly.regexpTree.astMod.CharacterClass): AstPath[typingsJapgolly.regexpTree.astMod.CharacterClass] | Null = js.native
      def replace(node: typingsJapgolly.regexpTree.astMod.Disjunction): AstPath[typingsJapgolly.regexpTree.astMod.Disjunction] | Null = js.native
      def replace(node: LookaroundAssertion): AstPath[LookaroundAssertion] | Null = js.native
      def replace(node: NamedBackreference): AstPath[NamedBackreference] | Null = js.native
      def replace(node: NoncapturingGroup): AstPath[NoncapturingGroup] | Null = js.native
      def replace(node: NumericBackreference): AstPath[NumericBackreference] | Null = js.native
      def replace(node: typingsJapgolly.regexpTree.astMod.Repetition): AstPath[typingsJapgolly.regexpTree.astMod.Repetition] | Null = js.native
      def replace(node: SimpleAssertion): AstPath[SimpleAssertion] | Null = js.native
      def replace(node: SimpleChar): AstPath[SimpleChar] | Null = js.native
      def replace(node: SpecialChar): AstPath[SpecialChar] | Null = js.native
      
      @JSName("setChild")
      def setChild_assertion(node: Null, index: Null, property: assertion): Null = js.native
      @JSName("setChild")
      def setChild_assertion(node: Null, index: Unit, property: assertion): Null = js.native
      @JSName("setChild")
      def setChild_assertion(node: typingsJapgolly.regexpTree.astMod.Alternative, index: Null, property: assertion): AstPath[typingsJapgolly.regexpTree.astMod.Alternative] = js.native
      @JSName("setChild")
      def setChild_assertion(node: typingsJapgolly.regexpTree.astMod.Alternative, index: Unit, property: assertion): AstPath[typingsJapgolly.regexpTree.astMod.Alternative] = js.native
      @JSName("setChild")
      def setChild_assertion(node: CapturingGroup, index: Null, property: assertion): AstPath[CapturingGroup] = js.native
      @JSName("setChild")
      def setChild_assertion(node: CapturingGroup, index: Unit, property: assertion): AstPath[CapturingGroup] = js.native
      @JSName("setChild")
      def setChild_assertion(node: typingsJapgolly.regexpTree.astMod.CharacterClass, index: Null, property: assertion): AstPath[typingsJapgolly.regexpTree.astMod.CharacterClass] = js.native
      @JSName("setChild")
      def setChild_assertion(node: typingsJapgolly.regexpTree.astMod.CharacterClass, index: Unit, property: assertion): AstPath[typingsJapgolly.regexpTree.astMod.CharacterClass] = js.native
      @JSName("setChild")
      def setChild_assertion(node: typingsJapgolly.regexpTree.astMod.Disjunction, index: Null, property: assertion): AstPath[typingsJapgolly.regexpTree.astMod.Disjunction] = js.native
      @JSName("setChild")
      def setChild_assertion(node: typingsJapgolly.regexpTree.astMod.Disjunction, index: Unit, property: assertion): AstPath[typingsJapgolly.regexpTree.astMod.Disjunction] = js.native
      @JSName("setChild")
      def setChild_assertion(node: LookaroundAssertion, index: Null, property: assertion): AstPath[LookaroundAssertion] = js.native
      @JSName("setChild")
      def setChild_assertion(node: LookaroundAssertion, index: Unit, property: assertion): AstPath[LookaroundAssertion] = js.native
      @JSName("setChild")
      def setChild_assertion(node: NamedBackreference, index: Null, property: assertion): AstPath[NamedBackreference] = js.native
      @JSName("setChild")
      def setChild_assertion(node: NamedBackreference, index: Unit, property: assertion): AstPath[NamedBackreference] = js.native
      @JSName("setChild")
      def setChild_assertion(node: NoncapturingGroup, index: Null, property: assertion): AstPath[NoncapturingGroup] = js.native
      @JSName("setChild")
      def setChild_assertion(node: NoncapturingGroup, index: Unit, property: assertion): AstPath[NoncapturingGroup] = js.native
      @JSName("setChild")
      def setChild_assertion(node: NumericBackreference, index: Null, property: assertion): AstPath[NumericBackreference] = js.native
      @JSName("setChild")
      def setChild_assertion(node: NumericBackreference, index: Unit, property: assertion): AstPath[NumericBackreference] = js.native
      @JSName("setChild")
      def setChild_assertion(node: typingsJapgolly.regexpTree.astMod.Repetition, index: Null, property: assertion): AstPath[typingsJapgolly.regexpTree.astMod.Repetition] = js.native
      @JSName("setChild")
      def setChild_assertion(node: typingsJapgolly.regexpTree.astMod.Repetition, index: Unit, property: assertion): AstPath[typingsJapgolly.regexpTree.astMod.Repetition] = js.native
      @JSName("setChild")
      def setChild_assertion(node: SimpleAssertion, index: Null, property: assertion): AstPath[SimpleAssertion] = js.native
      @JSName("setChild")
      def setChild_assertion(node: SimpleAssertion, index: Unit, property: assertion): AstPath[SimpleAssertion] = js.native
      @JSName("setChild")
      def setChild_assertion(node: SimpleChar, index: Null, property: assertion): AstPath[SimpleChar] = js.native
      @JSName("setChild")
      def setChild_assertion(node: SimpleChar, index: Unit, property: assertion): AstPath[SimpleChar] = js.native
      @JSName("setChild")
      def setChild_assertion(node: SpecialChar, index: Null, property: assertion): AstPath[SpecialChar] = js.native
      @JSName("setChild")
      def setChild_assertion(node: SpecialChar, index: Unit, property: assertion): AstPath[SpecialChar] = js.native
      @JSName("setChild")
      def setChild_assertion[T /* <: Expression */](node: T, index: Null, property: assertion): AstPath[T] | Null = js.native
      @JSName("setChild")
      def setChild_assertion[T /* <: Expression */](node: T, index: Unit, property: assertion): AstPath[T] | Null = js.native
      @JSName("setChild")
      def setChild_assertion_T_Union[T /* <: Expression */](node: Null, index: Null, property: assertion): AstPath[T] | Null = js.native
      @JSName("setChild")
      def setChild_assertion_T_Union[T /* <: Expression */](node: Null, index: Unit, property: assertion): AstPath[T] | Null = js.native
      
      def update(nodeProps: Partial[typingsJapgolly.regexpTree.astMod.Assertion]): Unit = js.native
    }
    
    @js.native
    trait Backreference extends StObject {
      
      def getNextSibling(): AstPath[Expression] | Null = js.native
      
      def getParent(): (AstPath[
            AstRegExp | typingsJapgolly.regexpTree.astMod.Disjunction | typingsJapgolly.regexpTree.astMod.Alternative | typingsJapgolly.regexpTree.astMod.Assertion | typingsJapgolly.regexpTree.astMod.Group | typingsJapgolly.regexpTree.astMod.Repetition
          ]) | Null = js.native
      
      def getPreviousSibling(): AstPath[Expression] | Null = js.native
      
      def hasEqualSource(path: AstPath[AstNode]): Boolean = js.native
      
      var index: Double | Null = js.native
      
      def isRemoved(): Boolean = js.native
      
      def jsonEncode(): String = js.native
      def jsonEncode(options: Format): String = js.native
      
      var node: typingsJapgolly.regexpTree.astMod.Backreference = js.native
      
      var parent: AstRegExp | typingsJapgolly.regexpTree.astMod.Disjunction | typingsJapgolly.regexpTree.astMod.Alternative | typingsJapgolly.regexpTree.astMod.Assertion | typingsJapgolly.regexpTree.astMod.Group | typingsJapgolly.regexpTree.astMod.Repetition | Null = js.native
      
      var parentPath: (AstPath[
            AstRegExp | typingsJapgolly.regexpTree.astMod.Disjunction | typingsJapgolly.regexpTree.astMod.Alternative | typingsJapgolly.regexpTree.astMod.Assertion | typingsJapgolly.regexpTree.astMod.Group | typingsJapgolly.regexpTree.astMod.Repetition
          ]) | Null = js.native
      
      var property: String | Null = js.native
      
      def remove(): Unit = js.native
      
      def replace(node: typingsJapgolly.regexpTree.astMod.Alternative): AstPath[typingsJapgolly.regexpTree.astMod.Alternative] | Null = js.native
      def replace(node: CapturingGroup): AstPath[CapturingGroup] | Null = js.native
      def replace(node: typingsJapgolly.regexpTree.astMod.CharacterClass): AstPath[typingsJapgolly.regexpTree.astMod.CharacterClass] | Null = js.native
      def replace(node: typingsJapgolly.regexpTree.astMod.Disjunction): AstPath[typingsJapgolly.regexpTree.astMod.Disjunction] | Null = js.native
      def replace(node: LookaroundAssertion): AstPath[LookaroundAssertion] | Null = js.native
      def replace(node: NamedBackreference): AstPath[NamedBackreference] | Null = js.native
      def replace(node: NoncapturingGroup): AstPath[NoncapturingGroup] | Null = js.native
      def replace(node: NumericBackreference): AstPath[NumericBackreference] | Null = js.native
      def replace(node: typingsJapgolly.regexpTree.astMod.Repetition): AstPath[typingsJapgolly.regexpTree.astMod.Repetition] | Null = js.native
      def replace(node: SimpleAssertion): AstPath[SimpleAssertion] | Null = js.native
      def replace(node: SimpleChar): AstPath[SimpleChar] | Null = js.native
      def replace(node: SpecialChar): AstPath[SpecialChar] | Null = js.native
      
      def update(nodeProps: Partial[typingsJapgolly.regexpTree.astMod.Backreference]): Unit = js.native
    }
    
    @js.native
    trait Char extends StObject {
      
      def getNextSibling(): (AstPath[Expression | typingsJapgolly.regexpTree.astMod.ClassRange]) | Null = js.native
      
      def getParent(): (AstPath[
            AstRegExp | typingsJapgolly.regexpTree.astMod.Disjunction | typingsJapgolly.regexpTree.astMod.Alternative | typingsJapgolly.regexpTree.astMod.Assertion | typingsJapgolly.regexpTree.astMod.Group | typingsJapgolly.regexpTree.astMod.Repetition | typingsJapgolly.regexpTree.astMod.CharacterClass | typingsJapgolly.regexpTree.astMod.ClassRange
          ]) | Null = js.native
      
      def getPreviousSibling(): (AstPath[Expression | typingsJapgolly.regexpTree.astMod.ClassRange]) | Null = js.native
      
      def hasEqualSource(path: AstPath[AstNode]): Boolean = js.native
      
      var index: Double | Null = js.native
      
      def isRemoved(): Boolean = js.native
      
      def jsonEncode(): String = js.native
      def jsonEncode(options: Format): String = js.native
      
      var node: typingsJapgolly.regexpTree.astMod.Char = js.native
      
      var parent: AstRegExp | typingsJapgolly.regexpTree.astMod.Disjunction | typingsJapgolly.regexpTree.astMod.Alternative | typingsJapgolly.regexpTree.astMod.Assertion | typingsJapgolly.regexpTree.astMod.Group | typingsJapgolly.regexpTree.astMod.Repetition | typingsJapgolly.regexpTree.astMod.CharacterClass | typingsJapgolly.regexpTree.astMod.ClassRange | Null = js.native
      
      var parentPath: (AstPath[
            AstRegExp | typingsJapgolly.regexpTree.astMod.Disjunction | typingsJapgolly.regexpTree.astMod.Alternative | typingsJapgolly.regexpTree.astMod.Assertion | typingsJapgolly.regexpTree.astMod.Group | typingsJapgolly.regexpTree.astMod.Repetition | typingsJapgolly.regexpTree.astMod.CharacterClass | typingsJapgolly.regexpTree.astMod.ClassRange
          ]) | Null = js.native
      
      var property: String | Null = js.native
      
      def remove(): Unit = js.native
      
      def replace(node: typingsJapgolly.regexpTree.astMod.Alternative): AstPath[typingsJapgolly.regexpTree.astMod.Alternative] | Null = js.native
      def replace(node: CapturingGroup): AstPath[CapturingGroup] | Null = js.native
      def replace(node: typingsJapgolly.regexpTree.astMod.CharacterClass): AstPath[typingsJapgolly.regexpTree.astMod.CharacterClass] | Null = js.native
      def replace(node: typingsJapgolly.regexpTree.astMod.ClassRange): AstPath[typingsJapgolly.regexpTree.astMod.ClassRange] | Null = js.native
      def replace(node: typingsJapgolly.regexpTree.astMod.Disjunction): AstPath[typingsJapgolly.regexpTree.astMod.Disjunction] | Null = js.native
      def replace(node: LookaroundAssertion): AstPath[LookaroundAssertion] | Null = js.native
      def replace(node: NamedBackreference): AstPath[NamedBackreference] | Null = js.native
      def replace(node: NoncapturingGroup): AstPath[NoncapturingGroup] | Null = js.native
      def replace(node: NumericBackreference): AstPath[NumericBackreference] | Null = js.native
      def replace(node: typingsJapgolly.regexpTree.astMod.Repetition): AstPath[typingsJapgolly.regexpTree.astMod.Repetition] | Null = js.native
      def replace(node: SimpleAssertion): AstPath[SimpleAssertion] | Null = js.native
      def replace(node: SimpleChar): AstPath[SimpleChar] | Null = js.native
      def replace(node: SpecialChar): AstPath[SpecialChar] | Null = js.native
      
      def update(nodeProps: Partial[typingsJapgolly.regexpTree.astMod.Char]): Unit = js.native
    }
    
    @js.native
    trait CharacterClass extends StObject {
      
      def appendChild(node: typingsJapgolly.regexpTree.astMod.ClassRange): AstPath[typingsJapgolly.regexpTree.astMod.ClassRange] = js.native
      def appendChild(node: SimpleChar): AstPath[SimpleChar] = js.native
      def appendChild(node: SpecialChar): AstPath[SpecialChar] = js.native
      @JSName("appendChild")
      def appendChild_expressions(node: typingsJapgolly.regexpTree.astMod.ClassRange, property: expressions): AstPath[typingsJapgolly.regexpTree.astMod.ClassRange] = js.native
      @JSName("appendChild")
      def appendChild_expressions(node: SimpleChar, property: expressions): AstPath[SimpleChar] = js.native
      @JSName("appendChild")
      def appendChild_expressions(node: SpecialChar, property: expressions): AstPath[SpecialChar] = js.native
      
      def getChild(): AstPath[
            typingsJapgolly.regexpTree.astMod.Char | typingsJapgolly.regexpTree.astMod.ClassRange
          ] = js.native
      def getChild(n: Double): AstPath[
            typingsJapgolly.regexpTree.astMod.Char | typingsJapgolly.regexpTree.astMod.ClassRange
          ] = js.native
      
      def getNextSibling(): AstPath[Expression] | Null = js.native
      
      def getParent(): (AstPath[
            AstRegExp | typingsJapgolly.regexpTree.astMod.Disjunction | typingsJapgolly.regexpTree.astMod.Alternative | typingsJapgolly.regexpTree.astMod.Assertion | typingsJapgolly.regexpTree.astMod.Group | typingsJapgolly.regexpTree.astMod.Repetition
          ]) | Null = js.native
      
      def getPreviousSibling(): AstPath[Expression] | Null = js.native
      
      def hasEqualSource(path: AstPath[AstNode]): Boolean = js.native
      
      var index: Double | Null = js.native
      
      def insertChildAt(node: typingsJapgolly.regexpTree.astMod.ClassRange, index: Double): Unit = js.native
      def insertChildAt(node: SimpleChar, index: Double): Unit = js.native
      def insertChildAt(node: SpecialChar, index: Double): Unit = js.native
      @JSName("insertChildAt")
      def insertChildAt_expressions(node: typingsJapgolly.regexpTree.astMod.ClassRange, index: Double, property: expressions): Unit = js.native
      @JSName("insertChildAt")
      def insertChildAt_expressions(node: SimpleChar, index: Double, property: expressions): Unit = js.native
      @JSName("insertChildAt")
      def insertChildAt_expressions(node: SpecialChar, index: Double, property: expressions): Unit = js.native
      
      def isRemoved(): Boolean = js.native
      
      def jsonEncode(): String = js.native
      def jsonEncode(options: Format): String = js.native
      
      var node: typingsJapgolly.regexpTree.astMod.CharacterClass = js.native
      
      var parent: AstRegExp | typingsJapgolly.regexpTree.astMod.Disjunction | typingsJapgolly.regexpTree.astMod.Alternative | typingsJapgolly.regexpTree.astMod.Assertion | typingsJapgolly.regexpTree.astMod.Group | typingsJapgolly.regexpTree.astMod.Repetition | Null = js.native
      
      var parentPath: (AstPath[
            AstRegExp | typingsJapgolly.regexpTree.astMod.Disjunction | typingsJapgolly.regexpTree.astMod.Alternative | typingsJapgolly.regexpTree.astMod.Assertion | typingsJapgolly.regexpTree.astMod.Group | typingsJapgolly.regexpTree.astMod.Repetition
          ]) | Null = js.native
      
      var property: String | Null = js.native
      
      def remove(): Unit = js.native
      
      def replace(node: typingsJapgolly.regexpTree.astMod.Alternative): AstPath[typingsJapgolly.regexpTree.astMod.Alternative] | Null = js.native
      def replace(node: CapturingGroup): AstPath[CapturingGroup] | Null = js.native
      def replace(node: typingsJapgolly.regexpTree.astMod.CharacterClass): AstPath[typingsJapgolly.regexpTree.astMod.CharacterClass] | Null = js.native
      def replace(node: typingsJapgolly.regexpTree.astMod.Disjunction): AstPath[typingsJapgolly.regexpTree.astMod.Disjunction] | Null = js.native
      def replace(node: LookaroundAssertion): AstPath[LookaroundAssertion] | Null = js.native
      def replace(node: NamedBackreference): AstPath[NamedBackreference] | Null = js.native
      def replace(node: NoncapturingGroup): AstPath[NoncapturingGroup] | Null = js.native
      def replace(node: NumericBackreference): AstPath[NumericBackreference] | Null = js.native
      def replace(node: typingsJapgolly.regexpTree.astMod.Repetition): AstPath[typingsJapgolly.regexpTree.astMod.Repetition] | Null = js.native
      def replace(node: SimpleAssertion): AstPath[SimpleAssertion] | Null = js.native
      def replace(node: SimpleChar): AstPath[SimpleChar] | Null = js.native
      def replace(node: SpecialChar): AstPath[SpecialChar] | Null = js.native
      
      def setChild(node: typingsJapgolly.regexpTree.astMod.ClassRange, index: Double): AstPath[typingsJapgolly.regexpTree.astMod.ClassRange] = js.native
      def setChild(node: SimpleChar, index: Double): AstPath[SimpleChar] = js.native
      def setChild(node: SpecialChar, index: Double): AstPath[SpecialChar] = js.native
      @JSName("setChild")
      def setChild_expressions(node: typingsJapgolly.regexpTree.astMod.ClassRange, index: Double, property: expressions): AstPath[typingsJapgolly.regexpTree.astMod.ClassRange] = js.native
      @JSName("setChild")
      def setChild_expressions(node: SimpleChar, index: Double, property: expressions): AstPath[SimpleChar] = js.native
      @JSName("setChild")
      def setChild_expressions(node: SpecialChar, index: Double, property: expressions): AstPath[SpecialChar] = js.native
      
      def update(nodeProps: PartialCharacterClass): Unit = js.native
    }
    
    @js.native
    trait ClassRange extends StObject {
      
      def getNextSibling(): (AstPath[
            typingsJapgolly.regexpTree.astMod.Char | typingsJapgolly.regexpTree.astMod.ClassRange
          ]) | Null = js.native
      
      def getParent(): AstPath[typingsJapgolly.regexpTree.astMod.CharacterClass] | Null = js.native
      
      def getPreviousSibling(): (AstPath[
            typingsJapgolly.regexpTree.astMod.Char | typingsJapgolly.regexpTree.astMod.ClassRange
          ]) | Null = js.native
      
      def hasEqualSource(path: AstPath[AstNode]): Boolean = js.native
      
      var index: Double | Null = js.native
      
      def isRemoved(): Boolean = js.native
      
      def jsonEncode(): String = js.native
      def jsonEncode(options: Format): String = js.native
      
      var node: typingsJapgolly.regexpTree.astMod.ClassRange = js.native
      
      var parent: typingsJapgolly.regexpTree.astMod.CharacterClass | Null = js.native
      
      var parentPath: AstPath[typingsJapgolly.regexpTree.astMod.CharacterClass] | Null = js.native
      
      var property: String | Null = js.native
      
      def remove(): Unit = js.native
      
      def replace(node: typingsJapgolly.regexpTree.astMod.ClassRange): AstPath[typingsJapgolly.regexpTree.astMod.ClassRange] | Null = js.native
      def replace(node: SimpleChar): AstPath[SimpleChar] | Null = js.native
      def replace(node: SpecialChar): AstPath[SpecialChar] | Null = js.native
      
      def setChild(node: typingsJapgolly.regexpTree.astMod.Char, index: Null, property: from | to): AstPath[typingsJapgolly.regexpTree.astMod.Char] = js.native
      def setChild(node: typingsJapgolly.regexpTree.astMod.Char, index: Unit, property: from | to): AstPath[typingsJapgolly.regexpTree.astMod.Char] = js.native
      
      def update(nodeProps: PartialClassRange): Unit = js.native
    }
    
    @js.native
    trait Disjunction extends StObject {
      
      def appendChild(): Null = js.native
      def appendChild(node: typingsJapgolly.regexpTree.astMod.Alternative): AstPath[typingsJapgolly.regexpTree.astMod.Alternative] = js.native
      def appendChild(node: CapturingGroup): AstPath[CapturingGroup] = js.native
      def appendChild(node: typingsJapgolly.regexpTree.astMod.CharacterClass): AstPath[typingsJapgolly.regexpTree.astMod.CharacterClass] = js.native
      def appendChild(node: typingsJapgolly.regexpTree.astMod.Disjunction): AstPath[typingsJapgolly.regexpTree.astMod.Disjunction] = js.native
      def appendChild(node: LookaroundAssertion): AstPath[LookaroundAssertion] = js.native
      def appendChild(node: NamedBackreference): AstPath[NamedBackreference] = js.native
      def appendChild(node: NoncapturingGroup): AstPath[NoncapturingGroup] = js.native
      def appendChild(node: NumericBackreference): AstPath[NumericBackreference] = js.native
      def appendChild(node: typingsJapgolly.regexpTree.astMod.Repetition): AstPath[typingsJapgolly.regexpTree.astMod.Repetition] = js.native
      def appendChild(node: SimpleAssertion): AstPath[SimpleAssertion] = js.native
      def appendChild(node: SimpleChar): AstPath[SimpleChar] = js.native
      def appendChild(node: SpecialChar): AstPath[SpecialChar] = js.native
      def appendChild[T /* <: Expression */](node: T): AstPath[T] | Null = js.native
      @JSName("appendChild")
      def appendChild_T_Union[T /* <: Expression */](): AstPath[T] | Null = js.native
      @JSName("appendChild")
      def appendChild_expressions(node: Null, property: expressions): Null = js.native
      @JSName("appendChild")
      def appendChild_expressions(node: typingsJapgolly.regexpTree.astMod.Alternative, property: expressions): AstPath[typingsJapgolly.regexpTree.astMod.Alternative] = js.native
      @JSName("appendChild")
      def appendChild_expressions(node: CapturingGroup, property: expressions): AstPath[CapturingGroup] = js.native
      @JSName("appendChild")
      def appendChild_expressions(node: typingsJapgolly.regexpTree.astMod.CharacterClass, property: expressions): AstPath[typingsJapgolly.regexpTree.astMod.CharacterClass] = js.native
      @JSName("appendChild")
      def appendChild_expressions(node: typingsJapgolly.regexpTree.astMod.Disjunction, property: expressions): AstPath[typingsJapgolly.regexpTree.astMod.Disjunction] = js.native
      @JSName("appendChild")
      def appendChild_expressions(node: LookaroundAssertion, property: expressions): AstPath[LookaroundAssertion] = js.native
      @JSName("appendChild")
      def appendChild_expressions(node: NamedBackreference, property: expressions): AstPath[NamedBackreference] = js.native
      @JSName("appendChild")
      def appendChild_expressions(node: NoncapturingGroup, property: expressions): AstPath[NoncapturingGroup] = js.native
      @JSName("appendChild")
      def appendChild_expressions(node: NumericBackreference, property: expressions): AstPath[NumericBackreference] = js.native
      @JSName("appendChild")
      def appendChild_expressions(node: typingsJapgolly.regexpTree.astMod.Repetition, property: expressions): AstPath[typingsJapgolly.regexpTree.astMod.Repetition] = js.native
      @JSName("appendChild")
      def appendChild_expressions(node: SimpleAssertion, property: expressions): AstPath[SimpleAssertion] = js.native
      @JSName("appendChild")
      def appendChild_expressions(node: SimpleChar, property: expressions): AstPath[SimpleChar] = js.native
      @JSName("appendChild")
      def appendChild_expressions(node: SpecialChar, property: expressions): AstPath[SpecialChar] = js.native
      @JSName("appendChild")
      def appendChild_expressions[T /* <: Expression */](node: T, property: expressions): AstPath[T] | Null = js.native
      @JSName("appendChild")
      def appendChild_expressions_T_Union[T /* <: Expression */](node: Null, property: expressions): AstPath[T] | Null = js.native
      
      def getChild(): AstPath[Expression] | Null = js.native
      def getChild(n: Double): AstPath[Expression] | Null = js.native
      
      def getNextSibling(): AstPath[Expression] | Null = js.native
      
      def getParent(): (AstPath[
            AstRegExp | typingsJapgolly.regexpTree.astMod.Disjunction | typingsJapgolly.regexpTree.astMod.Alternative | typingsJapgolly.regexpTree.astMod.Assertion | typingsJapgolly.regexpTree.astMod.Group | typingsJapgolly.regexpTree.astMod.Repetition
          ]) | Null = js.native
      
      def getPreviousSibling(): AstPath[Expression] | Null = js.native
      
      def hasEqualSource(path: AstPath[AstNode]): Boolean = js.native
      
      var index: Double | Null = js.native
      
      def insertChildAt[T /* <: Expression */](node: T, index: Double): Unit = js.native
      def insertChildAt[T /* <: Expression */](node: Null, index: Double): Unit = js.native
      @JSName("insertChildAt")
      def insertChildAt_expressions[T /* <: Expression */](node: T, index: Double, property: expressions): Unit = js.native
      @JSName("insertChildAt")
      def insertChildAt_expressions[T /* <: Expression */](node: Null, index: Double, property: expressions): Unit = js.native
      
      def isRemoved(): Boolean = js.native
      
      def jsonEncode(): String = js.native
      def jsonEncode(options: Format): String = js.native
      
      var node: typingsJapgolly.regexpTree.astMod.Disjunction = js.native
      
      var parent: AstRegExp | typingsJapgolly.regexpTree.astMod.Disjunction | typingsJapgolly.regexpTree.astMod.Alternative | typingsJapgolly.regexpTree.astMod.Assertion | typingsJapgolly.regexpTree.astMod.Group | typingsJapgolly.regexpTree.astMod.Repetition | Null = js.native
      
      var parentPath: (AstPath[
            AstRegExp | typingsJapgolly.regexpTree.astMod.Disjunction | typingsJapgolly.regexpTree.astMod.Alternative | typingsJapgolly.regexpTree.astMod.Assertion | typingsJapgolly.regexpTree.astMod.Group | typingsJapgolly.regexpTree.astMod.Repetition
          ]) | Null = js.native
      
      var property: String | Null = js.native
      
      def remove(): Unit = js.native
      
      def replace(node: typingsJapgolly.regexpTree.astMod.Alternative): AstPath[typingsJapgolly.regexpTree.astMod.Alternative] | Null = js.native
      def replace(node: CapturingGroup): AstPath[CapturingGroup] | Null = js.native
      def replace(node: typingsJapgolly.regexpTree.astMod.CharacterClass): AstPath[typingsJapgolly.regexpTree.astMod.CharacterClass] | Null = js.native
      def replace(node: typingsJapgolly.regexpTree.astMod.Disjunction): AstPath[typingsJapgolly.regexpTree.astMod.Disjunction] | Null = js.native
      def replace(node: LookaroundAssertion): AstPath[LookaroundAssertion] | Null = js.native
      def replace(node: NamedBackreference): AstPath[NamedBackreference] | Null = js.native
      def replace(node: NoncapturingGroup): AstPath[NoncapturingGroup] | Null = js.native
      def replace(node: NumericBackreference): AstPath[NumericBackreference] | Null = js.native
      def replace(node: typingsJapgolly.regexpTree.astMod.Repetition): AstPath[typingsJapgolly.regexpTree.astMod.Repetition] | Null = js.native
      def replace(node: SimpleAssertion): AstPath[SimpleAssertion] | Null = js.native
      def replace(node: SimpleChar): AstPath[SimpleChar] | Null = js.native
      def replace(node: SpecialChar): AstPath[SpecialChar] | Null = js.native
      
      def setChild(node: Null, index: Double): Null = js.native
      def setChild(node: typingsJapgolly.regexpTree.astMod.Alternative, index: Double): AstPath[typingsJapgolly.regexpTree.astMod.Alternative] = js.native
      def setChild(node: CapturingGroup, index: Double): AstPath[CapturingGroup] = js.native
      def setChild(node: typingsJapgolly.regexpTree.astMod.CharacterClass, index: Double): AstPath[typingsJapgolly.regexpTree.astMod.CharacterClass] = js.native
      def setChild(node: typingsJapgolly.regexpTree.astMod.Disjunction, index: Double): AstPath[typingsJapgolly.regexpTree.astMod.Disjunction] = js.native
      def setChild(node: LookaroundAssertion, index: Double): AstPath[LookaroundAssertion] = js.native
      def setChild(node: NamedBackreference, index: Double): AstPath[NamedBackreference] = js.native
      def setChild(node: NoncapturingGroup, index: Double): AstPath[NoncapturingGroup] = js.native
      def setChild(node: NumericBackreference, index: Double): AstPath[NumericBackreference] = js.native
      def setChild(node: typingsJapgolly.regexpTree.astMod.Repetition, index: Double): AstPath[typingsJapgolly.regexpTree.astMod.Repetition] = js.native
      def setChild(node: SimpleAssertion, index: Double): AstPath[SimpleAssertion] = js.native
      def setChild(node: SimpleChar, index: Double): AstPath[SimpleChar] = js.native
      def setChild(node: SpecialChar, index: Double): AstPath[SpecialChar] = js.native
      def setChild[T /* <: Expression */](node: T, index: Double): AstPath[T] | Null = js.native
      @JSName("setChild")
      def setChild_T_Union[T /* <: Expression */](node: Null, index: Double): AstPath[T] | Null = js.native
      @JSName("setChild")
      def setChild_expressions(node: Null, index: Double, property: expressions): Null = js.native
      @JSName("setChild")
      def setChild_expressions(node: typingsJapgolly.regexpTree.astMod.Alternative, index: Double, property: expressions): AstPath[typingsJapgolly.regexpTree.astMod.Alternative] = js.native
      @JSName("setChild")
      def setChild_expressions(node: CapturingGroup, index: Double, property: expressions): AstPath[CapturingGroup] = js.native
      @JSName("setChild")
      def setChild_expressions(node: typingsJapgolly.regexpTree.astMod.CharacterClass, index: Double, property: expressions): AstPath[typingsJapgolly.regexpTree.astMod.CharacterClass] = js.native
      @JSName("setChild")
      def setChild_expressions(node: typingsJapgolly.regexpTree.astMod.Disjunction, index: Double, property: expressions): AstPath[typingsJapgolly.regexpTree.astMod.Disjunction] = js.native
      @JSName("setChild")
      def setChild_expressions(node: LookaroundAssertion, index: Double, property: expressions): AstPath[LookaroundAssertion] = js.native
      @JSName("setChild")
      def setChild_expressions(node: NamedBackreference, index: Double, property: expressions): AstPath[NamedBackreference] = js.native
      @JSName("setChild")
      def setChild_expressions(node: NoncapturingGroup, index: Double, property: expressions): AstPath[NoncapturingGroup] = js.native
      @JSName("setChild")
      def setChild_expressions(node: NumericBackreference, index: Double, property: expressions): AstPath[NumericBackreference] = js.native
      @JSName("setChild")
      def setChild_expressions(node: typingsJapgolly.regexpTree.astMod.Repetition, index: Double, property: expressions): AstPath[typingsJapgolly.regexpTree.astMod.Repetition] = js.native
      @JSName("setChild")
      def setChild_expressions(node: SimpleAssertion, index: Double, property: expressions): AstPath[SimpleAssertion] = js.native
      @JSName("setChild")
      def setChild_expressions(node: SimpleChar, index: Double, property: expressions): AstPath[SimpleChar] = js.native
      @JSName("setChild")
      def setChild_expressions(node: SpecialChar, index: Double, property: expressions): AstPath[SpecialChar] = js.native
      @JSName("setChild")
      def setChild_expressions[T /* <: Expression */](node: T, index: Double, property: expressions): AstPath[T] | Null = js.native
      @JSName("setChild")
      def setChild_expressions_T_Union[T /* <: Expression */](node: Null, index: Double, property: expressions): AstPath[T] | Null = js.native
      
      def update(nodeProps: PartialDisjunction): Unit = js.native
    }
    
    @js.native
    trait Group extends StObject {
      
      def getChild(): AstPath[Expression] | Null = js.native
      @JSName("getChild")
      def getChild_0(n: `0`): AstPath[Expression] | Null = js.native
      
      def getNextSibling(): AstPath[Expression] | Null = js.native
      
      def getParent(): (AstPath[
            AstRegExp | typingsJapgolly.regexpTree.astMod.Disjunction | typingsJapgolly.regexpTree.astMod.Alternative | typingsJapgolly.regexpTree.astMod.Assertion | typingsJapgolly.regexpTree.astMod.Group | typingsJapgolly.regexpTree.astMod.Repetition
          ]) | Null = js.native
      
      def getPreviousSibling(): AstPath[Expression] | Null = js.native
      
      def hasEqualSource(path: AstPath[AstNode]): Boolean = js.native
      
      var index: Double | Null = js.native
      
      def isRemoved(): Boolean = js.native
      
      def jsonEncode(): String = js.native
      def jsonEncode(options: Format): String = js.native
      
      var node: typingsJapgolly.regexpTree.astMod.Group = js.native
      
      var parent: AstRegExp | typingsJapgolly.regexpTree.astMod.Disjunction | typingsJapgolly.regexpTree.astMod.Alternative | typingsJapgolly.regexpTree.astMod.Assertion | typingsJapgolly.regexpTree.astMod.Group | typingsJapgolly.regexpTree.astMod.Repetition | Null = js.native
      
      var parentPath: (AstPath[
            AstRegExp | typingsJapgolly.regexpTree.astMod.Disjunction | typingsJapgolly.regexpTree.astMod.Alternative | typingsJapgolly.regexpTree.astMod.Assertion | typingsJapgolly.regexpTree.astMod.Group | typingsJapgolly.regexpTree.astMod.Repetition
          ]) | Null = js.native
      
      var property: String | Null = js.native
      
      def remove(): Unit = js.native
      
      def replace(node: typingsJapgolly.regexpTree.astMod.Alternative): AstPath[typingsJapgolly.regexpTree.astMod.Alternative] | Null = js.native
      def replace(node: CapturingGroup): AstPath[CapturingGroup] | Null = js.native
      def replace(node: typingsJapgolly.regexpTree.astMod.CharacterClass): AstPath[typingsJapgolly.regexpTree.astMod.CharacterClass] | Null = js.native
      def replace(node: typingsJapgolly.regexpTree.astMod.Disjunction): AstPath[typingsJapgolly.regexpTree.astMod.Disjunction] | Null = js.native
      def replace(node: LookaroundAssertion): AstPath[LookaroundAssertion] | Null = js.native
      def replace(node: NamedBackreference): AstPath[NamedBackreference] | Null = js.native
      def replace(node: NoncapturingGroup): AstPath[NoncapturingGroup] | Null = js.native
      def replace(node: NumericBackreference): AstPath[NumericBackreference] | Null = js.native
      def replace(node: typingsJapgolly.regexpTree.astMod.Repetition): AstPath[typingsJapgolly.regexpTree.astMod.Repetition] | Null = js.native
      def replace(node: SimpleAssertion): AstPath[SimpleAssertion] | Null = js.native
      def replace(node: SimpleChar): AstPath[SimpleChar] | Null = js.native
      def replace(node: SpecialChar): AstPath[SpecialChar] | Null = js.native
      
      def setChild(): Null = js.native
      def setChild(node: typingsJapgolly.regexpTree.astMod.Alternative): AstPath[typingsJapgolly.regexpTree.astMod.Alternative] = js.native
      def setChild(node: CapturingGroup): AstPath[CapturingGroup] = js.native
      def setChild(node: typingsJapgolly.regexpTree.astMod.CharacterClass): AstPath[typingsJapgolly.regexpTree.astMod.CharacterClass] = js.native
      def setChild(node: typingsJapgolly.regexpTree.astMod.Disjunction): AstPath[typingsJapgolly.regexpTree.astMod.Disjunction] = js.native
      def setChild(node: LookaroundAssertion): AstPath[LookaroundAssertion] = js.native
      def setChild(node: NamedBackreference): AstPath[NamedBackreference] = js.native
      def setChild(node: NoncapturingGroup): AstPath[NoncapturingGroup] = js.native
      def setChild(node: NumericBackreference): AstPath[NumericBackreference] = js.native
      def setChild(node: typingsJapgolly.regexpTree.astMod.Repetition): AstPath[typingsJapgolly.regexpTree.astMod.Repetition] = js.native
      def setChild(node: SimpleAssertion): AstPath[SimpleAssertion] = js.native
      def setChild(node: SimpleChar): AstPath[SimpleChar] = js.native
      def setChild(node: SpecialChar): AstPath[SpecialChar] = js.native
      def setChild[T /* <: Expression */](node: T): AstPath[T] | Null = js.native
      @JSName("setChild")
      def setChild_T_Union[T /* <: Expression */](): AstPath[T] | Null = js.native
      @JSName("setChild")
      def setChild_expression(node: Null, index: Null, property: expression): Null = js.native
      @JSName("setChild")
      def setChild_expression(node: Null, index: Unit, property: expression): Null = js.native
      @JSName("setChild")
      def setChild_expression(node: typingsJapgolly.regexpTree.astMod.Alternative, index: Null, property: expression): AstPath[typingsJapgolly.regexpTree.astMod.Alternative] = js.native
      @JSName("setChild")
      def setChild_expression(node: typingsJapgolly.regexpTree.astMod.Alternative, index: Unit, property: expression): AstPath[typingsJapgolly.regexpTree.astMod.Alternative] = js.native
      @JSName("setChild")
      def setChild_expression(node: CapturingGroup, index: Null, property: expression): AstPath[CapturingGroup] = js.native
      @JSName("setChild")
      def setChild_expression(node: CapturingGroup, index: Unit, property: expression): AstPath[CapturingGroup] = js.native
      @JSName("setChild")
      def setChild_expression(node: typingsJapgolly.regexpTree.astMod.CharacterClass, index: Null, property: expression): AstPath[typingsJapgolly.regexpTree.astMod.CharacterClass] = js.native
      @JSName("setChild")
      def setChild_expression(node: typingsJapgolly.regexpTree.astMod.CharacterClass, index: Unit, property: expression): AstPath[typingsJapgolly.regexpTree.astMod.CharacterClass] = js.native
      @JSName("setChild")
      def setChild_expression(node: typingsJapgolly.regexpTree.astMod.Disjunction, index: Null, property: expression): AstPath[typingsJapgolly.regexpTree.astMod.Disjunction] = js.native
      @JSName("setChild")
      def setChild_expression(node: typingsJapgolly.regexpTree.astMod.Disjunction, index: Unit, property: expression): AstPath[typingsJapgolly.regexpTree.astMod.Disjunction] = js.native
      @JSName("setChild")
      def setChild_expression(node: LookaroundAssertion, index: Null, property: expression): AstPath[LookaroundAssertion] = js.native
      @JSName("setChild")
      def setChild_expression(node: LookaroundAssertion, index: Unit, property: expression): AstPath[LookaroundAssertion] = js.native
      @JSName("setChild")
      def setChild_expression(node: NamedBackreference, index: Null, property: expression): AstPath[NamedBackreference] = js.native
      @JSName("setChild")
      def setChild_expression(node: NamedBackreference, index: Unit, property: expression): AstPath[NamedBackreference] = js.native
      @JSName("setChild")
      def setChild_expression(node: NoncapturingGroup, index: Null, property: expression): AstPath[NoncapturingGroup] = js.native
      @JSName("setChild")
      def setChild_expression(node: NoncapturingGroup, index: Unit, property: expression): AstPath[NoncapturingGroup] = js.native
      @JSName("setChild")
      def setChild_expression(node: NumericBackreference, index: Null, property: expression): AstPath[NumericBackreference] = js.native
      @JSName("setChild")
      def setChild_expression(node: NumericBackreference, index: Unit, property: expression): AstPath[NumericBackreference] = js.native
      @JSName("setChild")
      def setChild_expression(node: typingsJapgolly.regexpTree.astMod.Repetition, index: Null, property: expression): AstPath[typingsJapgolly.regexpTree.astMod.Repetition] = js.native
      @JSName("setChild")
      def setChild_expression(node: typingsJapgolly.regexpTree.astMod.Repetition, index: Unit, property: expression): AstPath[typingsJapgolly.regexpTree.astMod.Repetition] = js.native
      @JSName("setChild")
      def setChild_expression(node: SimpleAssertion, index: Null, property: expression): AstPath[SimpleAssertion] = js.native
      @JSName("setChild")
      def setChild_expression(node: SimpleAssertion, index: Unit, property: expression): AstPath[SimpleAssertion] = js.native
      @JSName("setChild")
      def setChild_expression(node: SimpleChar, index: Null, property: expression): AstPath[SimpleChar] = js.native
      @JSName("setChild")
      def setChild_expression(node: SimpleChar, index: Unit, property: expression): AstPath[SimpleChar] = js.native
      @JSName("setChild")
      def setChild_expression(node: SpecialChar, index: Null, property: expression): AstPath[SpecialChar] = js.native
      @JSName("setChild")
      def setChild_expression(node: SpecialChar, index: Unit, property: expression): AstPath[SpecialChar] = js.native
      @JSName("setChild")
      def setChild_expression[T /* <: Expression */](node: T, index: Null, property: expression): AstPath[T] | Null = js.native
      @JSName("setChild")
      def setChild_expression[T /* <: Expression */](node: T, index: Unit, property: expression): AstPath[T] | Null = js.native
      @JSName("setChild")
      def setChild_expression_T_Union[T /* <: Expression */](node: Null, index: Null, property: expression): AstPath[T] | Null = js.native
      @JSName("setChild")
      def setChild_expression_T_Union[T /* <: Expression */](node: Null, index: Unit, property: expression): AstPath[T] | Null = js.native
      
      def update(nodeProps: Partial[typingsJapgolly.regexpTree.astMod.Group]): Unit = js.native
    }
    
    @js.native
    trait Quantifier extends StObject {
      
      def getNextSibling(): Null = js.native
      
      def getParent(): AstPath[typingsJapgolly.regexpTree.astMod.Repetition] | Null = js.native
      
      def getPreviousSibling(): Null = js.native
      
      def hasEqualSource(path: AstPath[AstNode]): Boolean = js.native
      
      var index: Double | Null = js.native
      
      def isRemoved(): Boolean = js.native
      
      def jsonEncode(): String = js.native
      def jsonEncode(options: Format): String = js.native
      
      var node: typingsJapgolly.regexpTree.astMod.Quantifier = js.native
      
      var parent: typingsJapgolly.regexpTree.astMod.Repetition | Null = js.native
      
      var parentPath: AstPath[typingsJapgolly.regexpTree.astMod.Repetition] | Null = js.native
      
      var property: String | Null = js.native
      
      def remove(): Unit = js.native
      
      def replace(node: RangeQuantifier): AstPath[RangeQuantifier] | Null = js.native
      def replace(node: SimpleQuantifier): AstPath[SimpleQuantifier] | Null = js.native
      
      def update(nodeProps: Partial[typingsJapgolly.regexpTree.astMod.Quantifier]): Unit = js.native
    }
    
    @js.native
    trait RegExp extends StObject {
      
      def getChild(): AstPath[Expression] | Null = js.native
      def getChild(n: Double): AstPath[Expression] | Null = js.native
      
      def getNextSibling(): Null = js.native
      
      def getParent(): Null = js.native
      
      def getPreviousSibling(): Null = js.native
      
      def hasEqualSource(path: AstPath[AstNode]): Boolean = js.native
      
      var index: Null = js.native
      
      def isRemoved(): Boolean = js.native
      
      def jsonEncode(): String = js.native
      def jsonEncode(options: Format): String = js.native
      
      var node: AstRegExp = js.native
      
      var parent: Null = js.native
      
      var parentPath: Null = js.native
      
      var property: Null = js.native
      
      def remove(): Unit = js.native
      
      @JSName("setChild")
      def setChild_body(node: Null, index: Null, property: body): Null = js.native
      @JSName("setChild")
      def setChild_body(node: Null, index: Unit, property: body): Null = js.native
      @JSName("setChild")
      def setChild_body(node: typingsJapgolly.regexpTree.astMod.Alternative, index: Null, property: body): AstPath[typingsJapgolly.regexpTree.astMod.Alternative] = js.native
      @JSName("setChild")
      def setChild_body(node: typingsJapgolly.regexpTree.astMod.Alternative, index: Unit, property: body): AstPath[typingsJapgolly.regexpTree.astMod.Alternative] = js.native
      @JSName("setChild")
      def setChild_body(node: CapturingGroup, index: Null, property: body): AstPath[CapturingGroup] = js.native
      @JSName("setChild")
      def setChild_body(node: CapturingGroup, index: Unit, property: body): AstPath[CapturingGroup] = js.native
      @JSName("setChild")
      def setChild_body(node: typingsJapgolly.regexpTree.astMod.CharacterClass, index: Null, property: body): AstPath[typingsJapgolly.regexpTree.astMod.CharacterClass] = js.native
      @JSName("setChild")
      def setChild_body(node: typingsJapgolly.regexpTree.astMod.CharacterClass, index: Unit, property: body): AstPath[typingsJapgolly.regexpTree.astMod.CharacterClass] = js.native
      @JSName("setChild")
      def setChild_body(node: typingsJapgolly.regexpTree.astMod.Disjunction, index: Null, property: body): AstPath[typingsJapgolly.regexpTree.astMod.Disjunction] = js.native
      @JSName("setChild")
      def setChild_body(node: typingsJapgolly.regexpTree.astMod.Disjunction, index: Unit, property: body): AstPath[typingsJapgolly.regexpTree.astMod.Disjunction] = js.native
      @JSName("setChild")
      def setChild_body(node: LookaroundAssertion, index: Null, property: body): AstPath[LookaroundAssertion] = js.native
      @JSName("setChild")
      def setChild_body(node: LookaroundAssertion, index: Unit, property: body): AstPath[LookaroundAssertion] = js.native
      @JSName("setChild")
      def setChild_body(node: NamedBackreference, index: Null, property: body): AstPath[NamedBackreference] = js.native
      @JSName("setChild")
      def setChild_body(node: NamedBackreference, index: Unit, property: body): AstPath[NamedBackreference] = js.native
      @JSName("setChild")
      def setChild_body(node: NoncapturingGroup, index: Null, property: body): AstPath[NoncapturingGroup] = js.native
      @JSName("setChild")
      def setChild_body(node: NoncapturingGroup, index: Unit, property: body): AstPath[NoncapturingGroup] = js.native
      @JSName("setChild")
      def setChild_body(node: NumericBackreference, index: Null, property: body): AstPath[NumericBackreference] = js.native
      @JSName("setChild")
      def setChild_body(node: NumericBackreference, index: Unit, property: body): AstPath[NumericBackreference] = js.native
      @JSName("setChild")
      def setChild_body(node: typingsJapgolly.regexpTree.astMod.Repetition, index: Null, property: body): AstPath[typingsJapgolly.regexpTree.astMod.Repetition] = js.native
      @JSName("setChild")
      def setChild_body(node: typingsJapgolly.regexpTree.astMod.Repetition, index: Unit, property: body): AstPath[typingsJapgolly.regexpTree.astMod.Repetition] = js.native
      @JSName("setChild")
      def setChild_body(node: SimpleAssertion, index: Null, property: body): AstPath[SimpleAssertion] = js.native
      @JSName("setChild")
      def setChild_body(node: SimpleAssertion, index: Unit, property: body): AstPath[SimpleAssertion] = js.native
      @JSName("setChild")
      def setChild_body(node: SimpleChar, index: Null, property: body): AstPath[SimpleChar] = js.native
      @JSName("setChild")
      def setChild_body(node: SimpleChar, index: Unit, property: body): AstPath[SimpleChar] = js.native
      @JSName("setChild")
      def setChild_body(node: SpecialChar, index: Null, property: body): AstPath[SpecialChar] = js.native
      @JSName("setChild")
      def setChild_body(node: SpecialChar, index: Unit, property: body): AstPath[SpecialChar] = js.native
      @JSName("setChild")
      def setChild_body[T /* <: Expression */](node: T, index: Null, property: body): AstPath[T] | Null = js.native
      @JSName("setChild")
      def setChild_body[T /* <: Expression */](node: T, index: Unit, property: body): AstPath[T] | Null = js.native
      @JSName("setChild")
      def setChild_body_T_Union[T /* <: Expression */](node: Null, index: Null, property: body): AstPath[T] | Null = js.native
      @JSName("setChild")
      def setChild_body_T_Union[T /* <: Expression */](node: Null, index: Unit, property: body): AstPath[T] | Null = js.native
      
      def update(nodeProps: PartialAstRegExp): Unit = js.native
    }
    
    @js.native
    trait Repetition extends StObject {
      
      def getChild(): AstPath[Expression] | Null = js.native
      @JSName("getChild")
      def getChild_0(n: `0`): AstPath[Expression] | Null = js.native
      
      def getNextSibling(): AstPath[Expression] | Null = js.native
      
      def getParent(): (AstPath[
            AstRegExp | typingsJapgolly.regexpTree.astMod.Disjunction | typingsJapgolly.regexpTree.astMod.Alternative | typingsJapgolly.regexpTree.astMod.Assertion | typingsJapgolly.regexpTree.astMod.Group | typingsJapgolly.regexpTree.astMod.Repetition
          ]) | Null = js.native
      
      def getPreviousSibling(): AstPath[Expression] | Null = js.native
      
      def hasEqualSource(path: AstPath[AstNode]): Boolean = js.native
      
      var index: Double | Null = js.native
      
      def isRemoved(): Boolean = js.native
      
      def jsonEncode(): String = js.native
      def jsonEncode(options: Format): String = js.native
      
      var node: typingsJapgolly.regexpTree.astMod.Repetition = js.native
      
      var parent: AstRegExp | typingsJapgolly.regexpTree.astMod.Disjunction | typingsJapgolly.regexpTree.astMod.Alternative | typingsJapgolly.regexpTree.astMod.Assertion | typingsJapgolly.regexpTree.astMod.Group | typingsJapgolly.regexpTree.astMod.Repetition | Null = js.native
      
      var parentPath: (AstPath[
            AstRegExp | typingsJapgolly.regexpTree.astMod.Disjunction | typingsJapgolly.regexpTree.astMod.Alternative | typingsJapgolly.regexpTree.astMod.Assertion | typingsJapgolly.regexpTree.astMod.Group | typingsJapgolly.regexpTree.astMod.Repetition
          ]) | Null = js.native
      
      var property: String | Null = js.native
      
      def remove(): Unit = js.native
      
      def replace(node: typingsJapgolly.regexpTree.astMod.Alternative): AstPath[typingsJapgolly.regexpTree.astMod.Alternative] | Null = js.native
      def replace(node: CapturingGroup): AstPath[CapturingGroup] | Null = js.native
      def replace(node: typingsJapgolly.regexpTree.astMod.CharacterClass): AstPath[typingsJapgolly.regexpTree.astMod.CharacterClass] | Null = js.native
      def replace(node: typingsJapgolly.regexpTree.astMod.Disjunction): AstPath[typingsJapgolly.regexpTree.astMod.Disjunction] | Null = js.native
      def replace(node: LookaroundAssertion): AstPath[LookaroundAssertion] | Null = js.native
      def replace(node: NamedBackreference): AstPath[NamedBackreference] | Null = js.native
      def replace(node: NoncapturingGroup): AstPath[NoncapturingGroup] | Null = js.native
      def replace(node: NumericBackreference): AstPath[NumericBackreference] | Null = js.native
      def replace(node: typingsJapgolly.regexpTree.astMod.Repetition): AstPath[typingsJapgolly.regexpTree.astMod.Repetition] | Null = js.native
      def replace(node: SimpleAssertion): AstPath[SimpleAssertion] | Null = js.native
      def replace(node: SimpleChar): AstPath[SimpleChar] | Null = js.native
      def replace(node: SpecialChar): AstPath[SpecialChar] | Null = js.native
      
      def setChild(node: typingsJapgolly.regexpTree.astMod.Alternative): AstPath[typingsJapgolly.regexpTree.astMod.Alternative] = js.native
      def setChild(node: CapturingGroup): AstPath[CapturingGroup] = js.native
      def setChild(node: typingsJapgolly.regexpTree.astMod.CharacterClass): AstPath[typingsJapgolly.regexpTree.astMod.CharacterClass] = js.native
      def setChild(node: typingsJapgolly.regexpTree.astMod.Disjunction): AstPath[typingsJapgolly.regexpTree.astMod.Disjunction] = js.native
      def setChild(node: LookaroundAssertion): AstPath[LookaroundAssertion] = js.native
      def setChild(node: NamedBackreference): AstPath[NamedBackreference] = js.native
      def setChild(node: NoncapturingGroup): AstPath[NoncapturingGroup] = js.native
      def setChild(node: NumericBackreference): AstPath[NumericBackreference] = js.native
      def setChild(node: typingsJapgolly.regexpTree.astMod.Repetition): AstPath[typingsJapgolly.regexpTree.astMod.Repetition] = js.native
      def setChild(node: SimpleAssertion): AstPath[SimpleAssertion] = js.native
      def setChild(node: SimpleChar): AstPath[SimpleChar] = js.native
      def setChild(node: SpecialChar): AstPath[SpecialChar] = js.native
      @JSName("setChild")
      def setChild_expression(node: typingsJapgolly.regexpTree.astMod.Alternative, index: Null, property: expression): AstPath[typingsJapgolly.regexpTree.astMod.Alternative] = js.native
      @JSName("setChild")
      def setChild_expression(node: typingsJapgolly.regexpTree.astMod.Alternative, index: Unit, property: expression): AstPath[typingsJapgolly.regexpTree.astMod.Alternative] = js.native
      @JSName("setChild")
      def setChild_expression(node: CapturingGroup, index: Null, property: expression): AstPath[CapturingGroup] = js.native
      @JSName("setChild")
      def setChild_expression(node: CapturingGroup, index: Unit, property: expression): AstPath[CapturingGroup] = js.native
      @JSName("setChild")
      def setChild_expression(node: typingsJapgolly.regexpTree.astMod.CharacterClass, index: Null, property: expression): AstPath[typingsJapgolly.regexpTree.astMod.CharacterClass] = js.native
      @JSName("setChild")
      def setChild_expression(node: typingsJapgolly.regexpTree.astMod.CharacterClass, index: Unit, property: expression): AstPath[typingsJapgolly.regexpTree.astMod.CharacterClass] = js.native
      @JSName("setChild")
      def setChild_expression(node: typingsJapgolly.regexpTree.astMod.Disjunction, index: Null, property: expression): AstPath[typingsJapgolly.regexpTree.astMod.Disjunction] = js.native
      @JSName("setChild")
      def setChild_expression(node: typingsJapgolly.regexpTree.astMod.Disjunction, index: Unit, property: expression): AstPath[typingsJapgolly.regexpTree.astMod.Disjunction] = js.native
      @JSName("setChild")
      def setChild_expression(node: LookaroundAssertion, index: Null, property: expression): AstPath[LookaroundAssertion] = js.native
      @JSName("setChild")
      def setChild_expression(node: LookaroundAssertion, index: Unit, property: expression): AstPath[LookaroundAssertion] = js.native
      @JSName("setChild")
      def setChild_expression(node: NamedBackreference, index: Null, property: expression): AstPath[NamedBackreference] = js.native
      @JSName("setChild")
      def setChild_expression(node: NamedBackreference, index: Unit, property: expression): AstPath[NamedBackreference] = js.native
      @JSName("setChild")
      def setChild_expression(node: NoncapturingGroup, index: Null, property: expression): AstPath[NoncapturingGroup] = js.native
      @JSName("setChild")
      def setChild_expression(node: NoncapturingGroup, index: Unit, property: expression): AstPath[NoncapturingGroup] = js.native
      @JSName("setChild")
      def setChild_expression(node: NumericBackreference, index: Null, property: expression): AstPath[NumericBackreference] = js.native
      @JSName("setChild")
      def setChild_expression(node: NumericBackreference, index: Unit, property: expression): AstPath[NumericBackreference] = js.native
      @JSName("setChild")
      def setChild_expression(node: typingsJapgolly.regexpTree.astMod.Repetition, index: Null, property: expression): AstPath[typingsJapgolly.regexpTree.astMod.Repetition] = js.native
      @JSName("setChild")
      def setChild_expression(node: typingsJapgolly.regexpTree.astMod.Repetition, index: Unit, property: expression): AstPath[typingsJapgolly.regexpTree.astMod.Repetition] = js.native
      @JSName("setChild")
      def setChild_expression(node: SimpleAssertion, index: Null, property: expression): AstPath[SimpleAssertion] = js.native
      @JSName("setChild")
      def setChild_expression(node: SimpleAssertion, index: Unit, property: expression): AstPath[SimpleAssertion] = js.native
      @JSName("setChild")
      def setChild_expression(node: SimpleChar, index: Null, property: expression): AstPath[SimpleChar] = js.native
      @JSName("setChild")
      def setChild_expression(node: SimpleChar, index: Unit, property: expression): AstPath[SimpleChar] = js.native
      @JSName("setChild")
      def setChild_expression(node: SpecialChar, index: Null, property: expression): AstPath[SpecialChar] = js.native
      @JSName("setChild")
      def setChild_expression(node: SpecialChar, index: Unit, property: expression): AstPath[SpecialChar] = js.native
      @JSName("setChild")
      def setChild_quantifier(node: RangeQuantifier, index: Null, property: quantifier): AstPath[RangeQuantifier] = js.native
      @JSName("setChild")
      def setChild_quantifier(node: RangeQuantifier, index: Unit, property: quantifier): AstPath[RangeQuantifier] = js.native
      @JSName("setChild")
      def setChild_quantifier(node: SimpleQuantifier, index: Null, property: quantifier): AstPath[SimpleQuantifier] = js.native
      @JSName("setChild")
      def setChild_quantifier(node: SimpleQuantifier, index: Unit, property: quantifier): AstPath[SimpleQuantifier] = js.native
      
      def update(nodeProps: PartialRepetition): Unit = js.native
    }
  }
  type AstPath[T /* <: AstNode */] = /* import warning: importer.ImportType#apply Failed type conversion: regexp-match-indices.regexp-tree/ast.AstPathTypes[T['type']] */ js.Any
  
  trait AstPathTypes extends StObject {
    
    var Alternative: typingsJapgolly.regexpMatchIndices.regexpTreeAstMod.AstPath.Alternative
    
    var Assertion: typingsJapgolly.regexpMatchIndices.regexpTreeAstMod.AstPath.Assertion
    
    var Backreference: typingsJapgolly.regexpMatchIndices.regexpTreeAstMod.AstPath.Backreference
    
    var Char: typingsJapgolly.regexpMatchIndices.regexpTreeAstMod.AstPath.Char
    
    var CharacterClass: typingsJapgolly.regexpMatchIndices.regexpTreeAstMod.AstPath.CharacterClass
    
    var ClassRange: typingsJapgolly.regexpMatchIndices.regexpTreeAstMod.AstPath.ClassRange
    
    var Disjunction: typingsJapgolly.regexpMatchIndices.regexpTreeAstMod.AstPath.Disjunction
    
    var Group: typingsJapgolly.regexpMatchIndices.regexpTreeAstMod.AstPath.Group
    
    var Quantifier: typingsJapgolly.regexpMatchIndices.regexpTreeAstMod.AstPath.Quantifier
    
    var RegExp: typingsJapgolly.regexpMatchIndices.regexpTreeAstMod.AstPath.RegExp
    
    var Repetition: typingsJapgolly.regexpMatchIndices.regexpTreeAstMod.AstPath.Repetition
  }
  object AstPathTypes {
    
    inline def apply(
      Alternative: Alternative,
      Assertion: Assertion,
      Backreference: Backreference,
      Char: Char,
      CharacterClass: CharacterClass,
      ClassRange: ClassRange,
      Disjunction: Disjunction,
      Group: Group,
      Quantifier: Quantifier,
      RegExp: RegExp,
      Repetition: Repetition
    ): AstPathTypes = {
      val __obj = js.Dynamic.literal(Alternative = Alternative.asInstanceOf[js.Any], Assertion = Assertion.asInstanceOf[js.Any], Backreference = Backreference.asInstanceOf[js.Any], Char = Char.asInstanceOf[js.Any], CharacterClass = CharacterClass.asInstanceOf[js.Any], ClassRange = ClassRange.asInstanceOf[js.Any], Disjunction = Disjunction.asInstanceOf[js.Any], Group = Group.asInstanceOf[js.Any], Quantifier = Quantifier.asInstanceOf[js.Any], RegExp = RegExp.asInstanceOf[js.Any], Repetition = Repetition.asInstanceOf[js.Any])
      __obj.asInstanceOf[AstPathTypes]
    }
    
    extension [Self <: AstPathTypes](x: Self) {
      
      inline def setAlternative(value: Alternative): Self = StObject.set(x, "Alternative", value.asInstanceOf[js.Any])
      
      inline def setAssertion(value: Assertion): Self = StObject.set(x, "Assertion", value.asInstanceOf[js.Any])
      
      inline def setBackreference(value: Backreference): Self = StObject.set(x, "Backreference", value.asInstanceOf[js.Any])
      
      inline def setChar(value: Char): Self = StObject.set(x, "Char", value.asInstanceOf[js.Any])
      
      inline def setCharacterClass(value: CharacterClass): Self = StObject.set(x, "CharacterClass", value.asInstanceOf[js.Any])
      
      inline def setClassRange(value: ClassRange): Self = StObject.set(x, "ClassRange", value.asInstanceOf[js.Any])
      
      inline def setDisjunction(value: Disjunction): Self = StObject.set(x, "Disjunction", value.asInstanceOf[js.Any])
      
      inline def setGroup(value: Group): Self = StObject.set(x, "Group", value.asInstanceOf[js.Any])
      
      inline def setQuantifier(value: Quantifier): Self = StObject.set(x, "Quantifier", value.asInstanceOf[js.Any])
      
      inline def setRegExp(value: RegExp): Self = StObject.set(x, "RegExp", value.asInstanceOf[js.Any])
      
      inline def setRepetition(value: Repetition): Self = StObject.set(x, "Repetition", value.asInstanceOf[js.Any])
    }
  }
  
  trait AstTypes extends StObject {
    
    var Alternative: typingsJapgolly.regexpTree.astMod.Alternative
    
    var Assertion: typingsJapgolly.regexpTree.astMod.Assertion
    
    var Backreference: typingsJapgolly.regexpTree.astMod.Backreference
    
    var Char: typingsJapgolly.regexpTree.astMod.Char
    
    var CharacterClass: typingsJapgolly.regexpTree.astMod.CharacterClass
    
    var ClassRange: typingsJapgolly.regexpTree.astMod.ClassRange
    
    var Disjunction: typingsJapgolly.regexpTree.astMod.Disjunction
    
    var Group: typingsJapgolly.regexpTree.astMod.Group
    
    var Quantifier: typingsJapgolly.regexpTree.astMod.Quantifier
    
    var RegExp: AstRegExp
    
    var Repetition: typingsJapgolly.regexpTree.astMod.Repetition
  }
  object AstTypes {
    
    inline def apply(
      Alternative: typingsJapgolly.regexpTree.astMod.Alternative,
      Assertion: typingsJapgolly.regexpTree.astMod.Assertion,
      Backreference: typingsJapgolly.regexpTree.astMod.Backreference,
      Char: typingsJapgolly.regexpTree.astMod.Char,
      CharacterClass: typingsJapgolly.regexpTree.astMod.CharacterClass,
      ClassRange: typingsJapgolly.regexpTree.astMod.ClassRange,
      Disjunction: typingsJapgolly.regexpTree.astMod.Disjunction,
      Group: typingsJapgolly.regexpTree.astMod.Group,
      Quantifier: typingsJapgolly.regexpTree.astMod.Quantifier,
      RegExp: AstRegExp,
      Repetition: typingsJapgolly.regexpTree.astMod.Repetition
    ): AstTypes = {
      val __obj = js.Dynamic.literal(Alternative = Alternative.asInstanceOf[js.Any], Assertion = Assertion.asInstanceOf[js.Any], Backreference = Backreference.asInstanceOf[js.Any], Char = Char.asInstanceOf[js.Any], CharacterClass = CharacterClass.asInstanceOf[js.Any], ClassRange = ClassRange.asInstanceOf[js.Any], Disjunction = Disjunction.asInstanceOf[js.Any], Group = Group.asInstanceOf[js.Any], Quantifier = Quantifier.asInstanceOf[js.Any], RegExp = RegExp.asInstanceOf[js.Any], Repetition = Repetition.asInstanceOf[js.Any])
      __obj.asInstanceOf[AstTypes]
    }
    
    extension [Self <: AstTypes](x: Self) {
      
      inline def setAlternative(value: typingsJapgolly.regexpTree.astMod.Alternative): Self = StObject.set(x, "Alternative", value.asInstanceOf[js.Any])
      
      inline def setAssertion(value: typingsJapgolly.regexpTree.astMod.Assertion): Self = StObject.set(x, "Assertion", value.asInstanceOf[js.Any])
      
      inline def setBackreference(value: typingsJapgolly.regexpTree.astMod.Backreference): Self = StObject.set(x, "Backreference", value.asInstanceOf[js.Any])
      
      inline def setChar(value: typingsJapgolly.regexpTree.astMod.Char): Self = StObject.set(x, "Char", value.asInstanceOf[js.Any])
      
      inline def setCharacterClass(value: typingsJapgolly.regexpTree.astMod.CharacterClass): Self = StObject.set(x, "CharacterClass", value.asInstanceOf[js.Any])
      
      inline def setClassRange(value: typingsJapgolly.regexpTree.astMod.ClassRange): Self = StObject.set(x, "ClassRange", value.asInstanceOf[js.Any])
      
      inline def setDisjunction(value: typingsJapgolly.regexpTree.astMod.Disjunction): Self = StObject.set(x, "Disjunction", value.asInstanceOf[js.Any])
      
      inline def setGroup(value: typingsJapgolly.regexpTree.astMod.Group): Self = StObject.set(x, "Group", value.asInstanceOf[js.Any])
      
      inline def setQuantifier(value: typingsJapgolly.regexpTree.astMod.Quantifier): Self = StObject.set(x, "Quantifier", value.asInstanceOf[js.Any])
      
      inline def setRegExp(value: AstRegExp): Self = StObject.set(x, "RegExp", value.asInstanceOf[js.Any])
      
      inline def setRepetition(value: typingsJapgolly.regexpTree.astMod.Repetition): Self = StObject.set(x, "Repetition", value.asInstanceOf[js.Any])
    }
  }
}
