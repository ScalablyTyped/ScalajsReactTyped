package typingsJapgolly.ipldDagPb

import typingsJapgolly.multiformats.cidMod.CID
import typingsJapgolly.multiformats.distTypesSrcLinkInterfaceMod.Version
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcUtilMod {
  
  @JSImport("@ipld/dag-pb/types/src/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createLink(name: String, size: Double, cid: CID[Any, Double, Double, Version]): PBLink = (^.asInstanceOf[js.Dynamic].applyDynamic("createLink")(name.asInstanceOf[js.Any], size.asInstanceOf[js.Any], cid.asInstanceOf[js.Any])).asInstanceOf[PBLink]
  
  inline def createNode(data: js.typedarray.Uint8Array): PBNode = ^.asInstanceOf[js.Dynamic].applyDynamic("createNode")(data.asInstanceOf[js.Any]).asInstanceOf[PBNode]
  inline def createNode(
    data: js.typedarray.Uint8Array,
    links: js.Array[typingsJapgolly.ipldDagPb.typesSrcInterfaceMod.PBLink]
  ): PBNode = (^.asInstanceOf[js.Dynamic].applyDynamic("createNode")(data.asInstanceOf[js.Any], links.asInstanceOf[js.Any])).asInstanceOf[PBNode]
  
  inline def prepare(node: Any): PBNode = ^.asInstanceOf[js.Dynamic].applyDynamic("prepare")(node.asInstanceOf[js.Any]).asInstanceOf[PBNode]
  
  inline def validate(node: PBNode): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validate")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type PBLink = typingsJapgolly.ipldDagPb.typesSrcInterfaceMod.PBLink
  
  type PBNode = typingsJapgolly.ipldDagPb.typesSrcInterfaceMod.PBNode
}
