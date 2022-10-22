package typingsJapgolly.firebaseDatabase

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.firebaseDatabase.distNodeEsmSrcCoreSnapNodeMod.NamedNode
import typingsJapgolly.firebaseDatabase.distNodeEsmSrcCoreSnapNodeMod.Node
import typingsJapgolly.firebaseDatabase.distNodeEsmSrcCoreUtilImmutableTreeMod.ImmutableTree
import typingsJapgolly.firebaseDatabase.distNodeEsmSrcCoreUtilPathMod.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeEsmSrcCoreCompoundWriteMod {
  
  @JSImport("@firebase/database/dist/node-esm/src/core/CompoundWrite", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/database/dist/node-esm/src/core/CompoundWrite", "CompoundWrite")
  @js.native
  open class CompoundWrite protected () extends StObject {
    def this(writeTree_ : ImmutableTree[Node]) = this()
    
    var writeTree_ : ImmutableTree[Node] = js.native
  }
  /* static members */
  object CompoundWrite {
    
    @JSImport("@firebase/database/dist/node-esm/src/core/CompoundWrite", "CompoundWrite")
    @js.native
    val ^ : js.Any = js.native
    
    inline def empty(): CompoundWrite = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[CompoundWrite]
  }
  
  inline def compoundWriteAddWrite(compoundWrite: CompoundWrite, path: Path, node: Node): CompoundWrite = (^.asInstanceOf[js.Dynamic].applyDynamic("compoundWriteAddWrite")(compoundWrite.asInstanceOf[js.Any], path.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[CompoundWrite]
  
  inline def compoundWriteAddWrites(compoundWrite: CompoundWrite, path: Path, updates: StringDictionary[Node]): CompoundWrite = (^.asInstanceOf[js.Dynamic].applyDynamic("compoundWriteAddWrites")(compoundWrite.asInstanceOf[js.Any], path.asInstanceOf[js.Any], updates.asInstanceOf[js.Any])).asInstanceOf[CompoundWrite]
  
  inline def compoundWriteApply(compoundWrite: CompoundWrite, node: Node): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("compoundWriteApply")(compoundWrite.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Node]
  
  inline def compoundWriteChildCompoundWrite(compoundWrite: CompoundWrite, path: Path): CompoundWrite = (^.asInstanceOf[js.Dynamic].applyDynamic("compoundWriteChildCompoundWrite")(compoundWrite.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[CompoundWrite]
  
  inline def compoundWriteGetCompleteChildren(compoundWrite: CompoundWrite): js.Array[NamedNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("compoundWriteGetCompleteChildren")(compoundWrite.asInstanceOf[js.Any]).asInstanceOf[js.Array[NamedNode]]
  
  inline def compoundWriteGetCompleteNode(compoundWrite: CompoundWrite, path: Path): Node | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("compoundWriteGetCompleteNode")(compoundWrite.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Node | Null]
  
  inline def compoundWriteHasCompleteWrite(compoundWrite: CompoundWrite, path: Path): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compoundWriteHasCompleteWrite")(compoundWrite.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def compoundWriteIsEmpty(compoundWrite: CompoundWrite): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("compoundWriteIsEmpty")(compoundWrite.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def compoundWriteRemoveWrite(compoundWrite: CompoundWrite, path: Path): CompoundWrite = (^.asInstanceOf[js.Dynamic].applyDynamic("compoundWriteRemoveWrite")(compoundWrite.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[CompoundWrite]
}
