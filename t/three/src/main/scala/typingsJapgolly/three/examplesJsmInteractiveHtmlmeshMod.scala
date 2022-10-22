package typingsJapgolly.three

import org.scalajs.dom.HTMLElement
import typingsJapgolly.three.mod.Mesh
import typingsJapgolly.three.srcCoreBufferGeometryMod.BufferGeometry
import typingsJapgolly.three.srcMaterialsMaterialMod.Material
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmInteractiveHtmlmeshMod {
  
  @JSImport("three/examples/jsm/interactive/HTMLMesh", "HTMLMesh")
  @js.native
  open class HTMLMesh protected ()
    extends Mesh[BufferGeometry, Material | js.Array[Material]] {
    def this(dom: HTMLElement) = this()
    
    def dispose(): Unit = js.native
  }
}
