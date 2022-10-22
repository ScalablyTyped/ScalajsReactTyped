package typingsJapgolly.yaml

import typingsJapgolly.yaml.distNodesNodeMod.NodeBase
import typingsJapgolly.yaml.distNodesNodeMod.Range
import typingsJapgolly.yaml.distNodesNodeMod._Node
import typingsJapgolly.yaml.distNodesNodeMod._ParsedNode
import typingsJapgolly.yaml.distNodesScalarMod.Scalar.Type
import typingsJapgolly.yaml.distNodesToJSMod.ToJSContext
import typingsJapgolly.yaml.distParseCstMod.BlockScalar
import typingsJapgolly.yaml.distParseCstMod.FlowScalar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodesScalarMod {
  
  @JSImport("yaml/dist/nodes/Scalar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("yaml/dist/nodes/Scalar", "Scalar")
  @js.native
  open class Scalar[T] protected ()
    extends NodeBase
       with _Node[T] {
    def this(value: T) = this()
    
    /** An optional anchor on this node. Used by alias nodes. */
    var anchor: js.UndefOr[String] = js.native
    
    /**
      * By default (undefined), numbers use decimal notation.
      * The YAML 1.2 core schema only supports 'HEX' and 'OCT'.
      * The YAML 1.1 schema also supports 'BIN' and 'TIME'
      */
    var format: js.UndefOr[String] = js.native
    
    /** If `value` is a number, use this value when stringifying this node. */
    var minFractionDigits: js.UndefOr[Double] = js.native
    
    /** Set during parsing to the source string value */
    var source: js.UndefOr[String] = js.native
    
    def toJSON(arg: Any): Any = js.native
    def toJSON(arg: Any, ctx: ToJSContext): Any = js.native
    def toJSON(arg: Unit, ctx: ToJSContext): Any = js.native
    
    /** The scalar style used for the node's string representation */
    var `type`: js.UndefOr[Type] = js.native
    
    var value: T = js.native
  }
  /* static members */
  object Scalar {
    
    @JSImport("yaml/dist/nodes/Scalar", "Scalar.BLOCK_FOLDED")
    @js.native
    val BLOCK_FOLDED: /* "BLOCK_FOLDED" */ String = js.native
    type BLOCK_FOLDED = typingsJapgolly.yaml.yamlStrings.BLOCK_FOLDED
    
    @JSImport("yaml/dist/nodes/Scalar", "Scalar.BLOCK_LITERAL")
    @js.native
    val BLOCK_LITERAL: /* "BLOCK_LITERAL" */ String = js.native
    type BLOCK_LITERAL = typingsJapgolly.yaml.yamlStrings.BLOCK_LITERAL
    
    @JSImport("yaml/dist/nodes/Scalar", "Scalar.PLAIN")
    @js.native
    val PLAIN: /* "PLAIN" */ String = js.native
    type PLAIN = typingsJapgolly.yaml.yamlStrings.PLAIN
    
    @JSImport("yaml/dist/nodes/Scalar", "Scalar.QUOTE_DOUBLE")
    @js.native
    val QUOTE_DOUBLE: /* "QUOTE_DOUBLE" */ String = js.native
    type QUOTE_DOUBLE = typingsJapgolly.yaml.yamlStrings.QUOTE_DOUBLE
    
    @JSImport("yaml/dist/nodes/Scalar", "Scalar.QUOTE_SINGLE")
    @js.native
    val QUOTE_SINGLE: /* "QUOTE_SINGLE" */ String = js.native
    type QUOTE_SINGLE = typingsJapgolly.yaml.yamlStrings.QUOTE_SINGLE
    
    @js.native
    trait Parsed
      extends Scalar[Any]
         with _ParsedNode {
      
      @JSName("range")
      var range_Parsed: Range = js.native
      
      @JSName("source")
      var source_Parsed: String = js.native
      
      @JSName("srcToken")
      var srcToken_Parsed: js.UndefOr[FlowScalar | BlockScalar] = js.native
    }
    
    type Type = typingsJapgolly.yaml.distNodesScalarMod.Scalar.BLOCK_FOLDED | typingsJapgolly.yaml.distNodesScalarMod.Scalar.BLOCK_LITERAL | typingsJapgolly.yaml.distNodesScalarMod.Scalar.PLAIN | typingsJapgolly.yaml.distNodesScalarMod.Scalar.QUOTE_DOUBLE | typingsJapgolly.yaml.distNodesScalarMod.Scalar.QUOTE_SINGLE
  }
  
  inline def isScalarValue(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isScalarValue")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
