package typingsJapgolly.yaml.anon

import typingsJapgolly.yaml.distDocDirectivesMod.Directives
import typingsJapgolly.yaml.distErrorsMod.YAMLError
import typingsJapgolly.yaml.distErrorsMod.YAMLWarning
import typingsJapgolly.yaml.distNodesNodeMod.NodeType
import typingsJapgolly.yaml.distNodesPairMod.Pair
import typingsJapgolly.yaml.distNodesScalarMod.Scalar
import typingsJapgolly.yaml.distNodesYamlmapMod.YAMLMap
import typingsJapgolly.yaml.distNodesYamlseqMod.YAMLSeq
import typingsJapgolly.yaml.distOptionsMod.CreateNodeOptions
import typingsJapgolly.yaml.distOptionsMod.DocumentOptions
import typingsJapgolly.yaml.distOptionsMod.ParseOptions
import typingsJapgolly.yaml.distOptionsMod.SchemaOptions
import typingsJapgolly.yaml.distOptionsMod.ToStringOptions
import typingsJapgolly.yaml.distSchemaSchemaMod.Schema
import typingsJapgolly.yaml.yamlStrings.`1Dot1`
import typingsJapgolly.yaml.yamlStrings.`1Dot2`
import typingsJapgolly.yaml.yamlStrings.next
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<yaml.yaml/dist/doc/Document.Document<yaml.yaml/dist/nodes/Node.Node<unknown>>> */
@js.native
trait ReadonlyDocumentNodeunkno extends StObject {
  
  def add(value: Any): Unit = js.native
  
  def addIn(path: js.Iterable[Any], value: Any): Unit = js.native
  
  val comment: js.UndefOr[String | Null] = js.native
  
  val commentBefore: js.UndefOr[String | Null] = js.native
  
  val contents: js.UndefOr[typingsJapgolly.yaml.distNodesNodeMod.Node[Any] | Null] = js.native
  
  def createAlias(node: Scalar[Any]): typingsJapgolly.yaml.distNodesAliasMod.Alias = js.native
  def createAlias(node: Scalar[Any], name: String): typingsJapgolly.yaml.distNodesAliasMod.Alias = js.native
  def createAlias(node: YAMLMap[Any, Any]): typingsJapgolly.yaml.distNodesAliasMod.Alias = js.native
  def createAlias(node: YAMLMap[Any, Any], name: String): typingsJapgolly.yaml.distNodesAliasMod.Alias = js.native
  def createAlias(node: YAMLSeq[Any]): typingsJapgolly.yaml.distNodesAliasMod.Alias = js.native
  def createAlias(node: YAMLSeq[Any], name: String): typingsJapgolly.yaml.distNodesAliasMod.Alias = js.native
  
  def createNode[T](value: T): NodeType[T] = js.native
  def createNode[T](value: T, options: CreateNodeOptions): NodeType[T] = js.native
  
  def createPair[K /* <: typingsJapgolly.yaml.distNodesNodeMod.Node[Any] */, V /* <: typingsJapgolly.yaml.distNodesNodeMod.Node[Any] */](key: Any, value: Any): Pair[K, V] = js.native
  def createPair[K /* <: typingsJapgolly.yaml.distNodesNodeMod.Node[Any] */, V /* <: typingsJapgolly.yaml.distNodesNodeMod.Node[Any] */](key: Any, value: Any, options: CreateNodeOptions): Pair[K, V] = js.native
  
  def delete(key: Any): Boolean = js.native
  
  def deleteIn(): Boolean = js.native
  def deleteIn(path: js.Iterable[Any]): Boolean = js.native
  
  val directives: js.UndefOr[Directives] = js.native
  
  val errors: js.Array[YAMLError] = js.native
  
  def get(key: Any): Any = js.native
  def get(key: Any, keepScalar: Boolean): Any = js.native
  
  def getIn(): Any = js.native
  def getIn(path: js.Iterable[Any]): Any = js.native
  def getIn(path: js.Iterable[Any], keepScalar: Boolean): Any = js.native
  def getIn(path: Null, keepScalar: Boolean): Any = js.native
  
  def has(key: Any): Boolean = js.native
  
  def hasIn(): Boolean = js.native
  def hasIn(path: js.Iterable[Any]): Boolean = js.native
  
  val options: RequiredOmitParseOptionsD = js.native
  
  val range: js.UndefOr[typingsJapgolly.yaml.distNodesNodeMod.Range] = js.native
  
  val schema: Schema = js.native
  
  def set(key: Any, value: Any): Unit = js.native
  
  def setIn(path: js.Iterable[Any], value: Any): Unit = js.native
  def setIn(path: Null, value: Any): Unit = js.native
  
  def setSchema(): Unit = js.native
  def setSchema(version: `1Dot1` | `1Dot2` | next): Unit = js.native
  def setSchema(version: `1Dot1` | `1Dot2` | next, options: SchemaOptions): Unit = js.native
  def setSchema(version: Null, options: SchemaOptions): Unit = js.native
  
  def toJS(): Any = js.native
  def toJS(opt: ToJSOptionsignoredstringu): Any = js.native
  
  def toJSON(): Any = js.native
  def toJSON(jsonArg: String): Any = js.native
  def toJSON(jsonArg: String, onAnchor: js.UndefOr[js.Function2[/* value */ Any, /* count */ Double, Unit]]): Any = js.native
  def toJSON(jsonArg: Null, onAnchor: js.UndefOr[js.Function2[/* value */ Any, /* count */ Double, Unit]]): Any = js.native
  def toJSON(jsonArg: Unit, onAnchor: js.UndefOr[js.Function2[/* value */ Any, /* count */ Double, Unit]]): Any = js.native
  
  def toString(options: ToStringOptions): String = js.native
  
  val warnings: js.Array[YAMLWarning] = js.native
}
