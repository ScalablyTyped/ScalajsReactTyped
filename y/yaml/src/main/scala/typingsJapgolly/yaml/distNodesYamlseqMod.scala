package typingsJapgolly.yaml

import typingsJapgolly.yaml.distNodesCollectionMod.Collection
import typingsJapgolly.yaml.distNodesNodeMod.ParsedNode
import typingsJapgolly.yaml.distNodesNodeMod.Range
import typingsJapgolly.yaml.distNodesNodeMod._Node
import typingsJapgolly.yaml.distNodesPairMod.Pair
import typingsJapgolly.yaml.distNodesScalarMod.Scalar
import typingsJapgolly.yaml.distNodesToJSMod.ToJSContext
import typingsJapgolly.yaml.distParseCstMod.BlockSequence
import typingsJapgolly.yaml.distParseCstMod.FlowCollection
import typingsJapgolly.yaml.distSchemaSchemaMod.Schema
import typingsJapgolly.yaml.yamlBooleans.`false`
import typingsJapgolly.yaml.yamlBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodesYamlseqMod {
  
  @JSImport("yaml/dist/nodes/YAMLSeq", "YAMLSeq")
  @js.native
  open class YAMLSeq[T] ()
    extends Collection
       with _Node[T] {
    def this(schema: Schema) = this()
    
    @JSName("get")
    def get_false(key: Any, keepScalar: `false`): js.UndefOr[T] = js.native
    /**
      * Returns item at `key`, or `undefined` if not found. By default unwraps
      * scalar values from their surrounding node; to disable set `keepScalar` to
      * `true` (collections are always returned intact).
      *
      * `key` must contain a representation of an integer for this to succeed.
      * It may be wrapped in a `Scalar`.
      */
    @JSName("get")
    def get_true(key: Any, keepScalar: `true`): js.UndefOr[Scalar[T]] = js.native
    
    @JSName("items")
    var items_YAMLSeq: js.Array[T] = js.native
    
    def toJSON(_underscore: Any): js.Array[Any] = js.native
    def toJSON(_underscore: Any, ctx: ToJSContext): js.Array[Any] = js.native
    def toJSON(_underscore: Unit, ctx: ToJSContext): js.Array[Any] = js.native
  }
  object YAMLSeq {
    
    @js.native
    trait Parsed[T /* <: ParsedNode | (Pair[ParsedNode, ParsedNode | Null]) */] extends YAMLSeq[T] {
      
      @JSName("range")
      var range_Parsed: Range = js.native
      
      @JSName("srcToken")
      var srcToken_Parsed: js.UndefOr[BlockSequence | FlowCollection] = js.native
    }
  }
}
