package typingsJapgolly.ipldDagPb

import typingsJapgolly.ipldDagPb.ipldDagPbInts.`112`
import typingsJapgolly.ipldDagPb.ipldDagPbStrings.`dag-pb`
import typingsJapgolly.multiformats.cidMod.CID
import typingsJapgolly.multiformats.distTypesSrcLinkInterfaceMod.Version
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ipld/dag-pb", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ipld/dag-pb", "code")
  @js.native
  val code: `112` = js.native
  
  inline def createLink(name: String, size: Double, cid: CID[Any, Double, Double, Version]): typingsJapgolly.ipldDagPb.typesSrcUtilMod.PBLink = (^.asInstanceOf[js.Dynamic].applyDynamic("createLink")(name.asInstanceOf[js.Any], size.asInstanceOf[js.Any], cid.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ipldDagPb.typesSrcUtilMod.PBLink]
  
  inline def createNode(data: js.typedarray.Uint8Array): typingsJapgolly.ipldDagPb.typesSrcUtilMod.PBNode = ^.asInstanceOf[js.Dynamic].applyDynamic("createNode")(data.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ipldDagPb.typesSrcUtilMod.PBNode]
  inline def createNode(
    data: js.typedarray.Uint8Array,
    links: js.Array[typingsJapgolly.ipldDagPb.typesSrcInterfaceMod.PBLink]
  ): typingsJapgolly.ipldDagPb.typesSrcUtilMod.PBNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createNode")(data.asInstanceOf[js.Any], links.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ipldDagPb.typesSrcUtilMod.PBNode]
  
  inline def decode(bytes: ByteView[PBNode]): PBNode = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(bytes.asInstanceOf[js.Any]).asInstanceOf[PBNode]
  
  inline def encode(node: PBNode): ByteView[PBNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(node.asInstanceOf[js.Any]).asInstanceOf[ByteView[PBNode]]
  
  @JSImport("@ipld/dag-pb", "name")
  @js.native
  val name: `dag-pb` = js.native
  
  inline def prepare(node: Any): typingsJapgolly.ipldDagPb.typesSrcUtilMod.PBNode = ^.asInstanceOf[js.Dynamic].applyDynamic("prepare")(node.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ipldDagPb.typesSrcUtilMod.PBNode]
  
  inline def validate(node: typingsJapgolly.ipldDagPb.typesSrcUtilMod.PBNode): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validate")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type ByteView[T] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_interface.ByteView<T> */ Any
  
  type PBLink = typingsJapgolly.ipldDagPb.typesSrcInterfaceMod.PBLink
  
  type PBNode = typingsJapgolly.ipldDagPb.typesSrcInterfaceMod.PBNode
}
