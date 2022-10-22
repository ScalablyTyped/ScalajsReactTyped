package typingsJapgolly.lezerCommon

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.lezerCommon.anon.Deserialize
import typingsJapgolly.lezerCommon.anon.Error
import typingsJapgolly.lezerCommon.anon.From
import typingsJapgolly.lezerCommon.distMixMod.NestedParse
import typingsJapgolly.lezerCommon.distParseMod.ChangedRange
import typingsJapgolly.lezerCommon.distParseMod.Input
import typingsJapgolly.lezerCommon.distParseMod.ParseWrapper
import typingsJapgolly.lezerCommon.distTreeMod.BuildData
import typingsJapgolly.lezerCommon.distTreeMod.SyntaxNodeRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@lezer/common", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@lezer/common", "DefaultBufferLength")
  @js.native
  val DefaultBufferLength: /* 1024 */ Double = js.native
  
  @JSImport("@lezer/common", "IterMode")
  @js.native
  object IterMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.lezerCommon.distTreeMod.IterMode & Double] = js.native
    
    /* 1 */ val ExcludeBuffers: typingsJapgolly.lezerCommon.distTreeMod.IterMode.ExcludeBuffers & Double = js.native
    
    /* 4 */ val IgnoreMounts: typingsJapgolly.lezerCommon.distTreeMod.IterMode.IgnoreMounts & Double = js.native
    
    /* 8 */ val IgnoreOverlays: typingsJapgolly.lezerCommon.distTreeMod.IterMode.IgnoreOverlays & Double = js.native
    
    /* 2 */ val IncludeAnonymous: typingsJapgolly.lezerCommon.distTreeMod.IterMode.IncludeAnonymous & Double = js.native
  }
  
  @JSImport("@lezer/common", "MountedTree")
  @js.native
  open class MountedTree protected ()
    extends typingsJapgolly.lezerCommon.distTreeMod.MountedTree {
    def this(
      tree: typingsJapgolly.lezerCommon.distTreeMod.Tree,
      overlay: js.Array[From],
      parser: typingsJapgolly.lezerCommon.distParseMod.Parser
    ) = this()
    def this(
      tree: typingsJapgolly.lezerCommon.distTreeMod.Tree,
      overlay: Null,
      parser: typingsJapgolly.lezerCommon.distParseMod.Parser
    ) = this()
  }
  
  @JSImport("@lezer/common", "NodeProp")
  @js.native
  open class NodeProp[T] ()
    extends typingsJapgolly.lezerCommon.distTreeMod.NodeProp[T] {
    def this(config: Deserialize[T]) = this()
  }
  /* static members */
  object NodeProp {
    
    @JSImport("@lezer/common", "NodeProp")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@lezer/common", "NodeProp.closedBy")
    @js.native
    def closedBy: typingsJapgolly.lezerCommon.distTreeMod.NodeProp[js.Array[String]] = js.native
    inline def closedBy_=(x: typingsJapgolly.lezerCommon.distTreeMod.NodeProp[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("closedBy")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/common", "NodeProp.contextHash")
    @js.native
    def contextHash: typingsJapgolly.lezerCommon.distTreeMod.NodeProp[Double] = js.native
    inline def contextHash_=(x: typingsJapgolly.lezerCommon.distTreeMod.NodeProp[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextHash")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/common", "NodeProp.group")
    @js.native
    def group: typingsJapgolly.lezerCommon.distTreeMod.NodeProp[js.Array[String]] = js.native
    inline def group_=(x: typingsJapgolly.lezerCommon.distTreeMod.NodeProp[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("group")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/common", "NodeProp.lookAhead")
    @js.native
    def lookAhead: typingsJapgolly.lezerCommon.distTreeMod.NodeProp[Double] = js.native
    inline def lookAhead_=(x: typingsJapgolly.lezerCommon.distTreeMod.NodeProp[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lookAhead")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/common", "NodeProp.mounted")
    @js.native
    def mounted: typingsJapgolly.lezerCommon.distTreeMod.NodeProp[typingsJapgolly.lezerCommon.distTreeMod.MountedTree] = js.native
    inline def mounted_=(
      x: typingsJapgolly.lezerCommon.distTreeMod.NodeProp[typingsJapgolly.lezerCommon.distTreeMod.MountedTree]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mounted")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/common", "NodeProp.openedBy")
    @js.native
    def openedBy: typingsJapgolly.lezerCommon.distTreeMod.NodeProp[js.Array[String]] = js.native
    inline def openedBy_=(x: typingsJapgolly.lezerCommon.distTreeMod.NodeProp[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("openedBy")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@lezer/common", "NodeSet")
  @js.native
  open class NodeSet protected ()
    extends typingsJapgolly.lezerCommon.distTreeMod.NodeSet {
    def this(types: js.Array[typingsJapgolly.lezerCommon.distTreeMod.NodeType]) = this()
  }
  
  @JSImport("@lezer/common", "NodeType")
  @js.native
  open class NodeType ()
    extends typingsJapgolly.lezerCommon.distTreeMod.NodeType
  /* static members */
  object NodeType {
    
    @JSImport("@lezer/common", "NodeType")
    @js.native
    val ^ : js.Any = js.native
    
    inline def define(spec: Error): typingsJapgolly.lezerCommon.distTreeMod.NodeType = ^.asInstanceOf[js.Dynamic].applyDynamic("define")(spec.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.lezerCommon.distTreeMod.NodeType]
    
    inline def `match`[T](map: StringDictionary[T]): js.Function1[/* node */ this.type, js.UndefOr[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("match")(map.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* node */ this.type, js.UndefOr[T]]]
    
    @JSImport("@lezer/common", "NodeType.none")
    @js.native
    def none: typingsJapgolly.lezerCommon.distTreeMod.NodeType = js.native
    inline def none_=(x: typingsJapgolly.lezerCommon.distTreeMod.NodeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("none")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@lezer/common", "NodeWeakMap")
  @js.native
  open class NodeWeakMap[T] ()
    extends typingsJapgolly.lezerCommon.distTreeMod.NodeWeakMap[T]
  
  /* note: abstract class */ @JSImport("@lezer/common", "Parser")
  @js.native
  open class Parser ()
    extends typingsJapgolly.lezerCommon.distParseMod.Parser
  
  @JSImport("@lezer/common", "Tree")
  @js.native
  open class Tree protected ()
    extends typingsJapgolly.lezerCommon.distTreeMod.Tree {
    def this(
      `type`: typingsJapgolly.lezerCommon.distTreeMod.NodeType,
      children: js.Array[
            typingsJapgolly.lezerCommon.distTreeMod.Tree | typingsJapgolly.lezerCommon.distTreeMod.TreeBuffer
          ],
      positions: js.Array[Double],
      length: Double
    ) = this()
    def this(
      `type`: typingsJapgolly.lezerCommon.distTreeMod.NodeType,
      children: js.Array[
            typingsJapgolly.lezerCommon.distTreeMod.Tree | typingsJapgolly.lezerCommon.distTreeMod.TreeBuffer
          ],
      positions: js.Array[Double],
      length: Double,
      props: js.Array[js.Tuple2[typingsJapgolly.lezerCommon.distTreeMod.NodeProp[Any] | Double, Any]]
    ) = this()
  }
  /* static members */
  object Tree {
    
    @JSImport("@lezer/common", "Tree")
    @js.native
    val ^ : js.Any = js.native
    
    inline def build(data: BuildData): typingsJapgolly.lezerCommon.distTreeMod.Tree = ^.asInstanceOf[js.Dynamic].applyDynamic("build")(data.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.lezerCommon.distTreeMod.Tree]
    
    @JSImport("@lezer/common", "Tree.empty")
    @js.native
    def empty: typingsJapgolly.lezerCommon.distTreeMod.Tree = js.native
    inline def empty_=(x: typingsJapgolly.lezerCommon.distTreeMod.Tree): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("empty")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@lezer/common", "TreeBuffer")
  @js.native
  open class TreeBuffer protected ()
    extends typingsJapgolly.lezerCommon.distTreeMod.TreeBuffer {
    def this(
      buffer: js.typedarray.Uint16Array,
      length: Double,
      set: typingsJapgolly.lezerCommon.distTreeMod.NodeSet
    ) = this()
  }
  
  @JSImport("@lezer/common", "TreeCursor")
  @js.native
  open class TreeCursor ()
    extends typingsJapgolly.lezerCommon.distTreeMod.TreeCursor
  
  @JSImport("@lezer/common", "TreeFragment")
  @js.native
  open class TreeFragment protected ()
    extends typingsJapgolly.lezerCommon.distParseMod.TreeFragment {
    def this(from: Double, to: Double, tree: typingsJapgolly.lezerCommon.distTreeMod.Tree, offset: Double) = this()
    def this(
      from: Double,
      to: Double,
      tree: typingsJapgolly.lezerCommon.distTreeMod.Tree,
      offset: Double,
      openStart: Boolean
    ) = this()
    def this(
      from: Double,
      to: Double,
      tree: typingsJapgolly.lezerCommon.distTreeMod.Tree,
      offset: Double,
      openStart: Boolean,
      openEnd: Boolean
    ) = this()
    def this(
      from: Double,
      to: Double,
      tree: typingsJapgolly.lezerCommon.distTreeMod.Tree,
      offset: Double,
      openStart: Unit,
      openEnd: Boolean
    ) = this()
  }
  /* static members */
  object TreeFragment {
    
    @JSImport("@lezer/common", "TreeFragment")
    @js.native
    val ^ : js.Any = js.native
    
    inline def addTree(tree: typingsJapgolly.lezerCommon.distTreeMod.Tree): js.Array[typingsJapgolly.lezerCommon.distParseMod.TreeFragment] = ^.asInstanceOf[js.Dynamic].applyDynamic("addTree")(tree.asInstanceOf[js.Any]).asInstanceOf[js.Array[typingsJapgolly.lezerCommon.distParseMod.TreeFragment]]
    inline def addTree(
      tree: typingsJapgolly.lezerCommon.distTreeMod.Tree,
      fragments: js.Array[typingsJapgolly.lezerCommon.distParseMod.TreeFragment]
    ): js.Array[typingsJapgolly.lezerCommon.distParseMod.TreeFragment] = (^.asInstanceOf[js.Dynamic].applyDynamic("addTree")(tree.asInstanceOf[js.Any], fragments.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsJapgolly.lezerCommon.distParseMod.TreeFragment]]
    inline def addTree(
      tree: typingsJapgolly.lezerCommon.distTreeMod.Tree,
      fragments: js.Array[typingsJapgolly.lezerCommon.distParseMod.TreeFragment],
      partial: Boolean
    ): js.Array[typingsJapgolly.lezerCommon.distParseMod.TreeFragment] = (^.asInstanceOf[js.Dynamic].applyDynamic("addTree")(tree.asInstanceOf[js.Any], fragments.asInstanceOf[js.Any], partial.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsJapgolly.lezerCommon.distParseMod.TreeFragment]]
    inline def addTree(tree: typingsJapgolly.lezerCommon.distTreeMod.Tree, fragments: Unit, partial: Boolean): js.Array[typingsJapgolly.lezerCommon.distParseMod.TreeFragment] = (^.asInstanceOf[js.Dynamic].applyDynamic("addTree")(tree.asInstanceOf[js.Any], fragments.asInstanceOf[js.Any], partial.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsJapgolly.lezerCommon.distParseMod.TreeFragment]]
    
    inline def applyChanges(
      fragments: js.Array[typingsJapgolly.lezerCommon.distParseMod.TreeFragment],
      changes: js.Array[ChangedRange]
    ): js.Array[typingsJapgolly.lezerCommon.distParseMod.TreeFragment] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyChanges")(fragments.asInstanceOf[js.Any], changes.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsJapgolly.lezerCommon.distParseMod.TreeFragment]]
    inline def applyChanges(
      fragments: js.Array[typingsJapgolly.lezerCommon.distParseMod.TreeFragment],
      changes: js.Array[ChangedRange],
      minGap: Double
    ): js.Array[typingsJapgolly.lezerCommon.distParseMod.TreeFragment] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyChanges")(fragments.asInstanceOf[js.Any], changes.asInstanceOf[js.Any], minGap.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsJapgolly.lezerCommon.distParseMod.TreeFragment]]
  }
  
  inline def parseMixed(nest: js.Function2[/* node */ SyntaxNodeRef, /* input */ Input, NestedParse | Null]): ParseWrapper = ^.asInstanceOf[js.Dynamic].applyDynamic("parseMixed")(nest.asInstanceOf[js.Any]).asInstanceOf[ParseWrapper]
}
