package typingsJapgolly.aframe.mod.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("aframe", "THREE.InstancedMesh")
@js.native
open class InstancedMesh[TGeometry /* <: typingsJapgolly.three.srcCoreBufferGeometryMod.BufferGeometry */, TMaterial /* <: typingsJapgolly.three.srcMaterialsMaterialMod.Material | js.Array[typingsJapgolly.three.srcMaterialsMaterialMod.Material] */] protected ()
  extends typingsJapgolly.three.mod.InstancedMesh[TGeometry, TMaterial] {
  def this(
    geometry: /* import warning: RewrittenClass.unapply cls was tparam TGeometry */ Any,
    material: /* import warning: RewrittenClass.unapply cls was tparam TMaterial */ Any,
    count: Double
  ) = this()
}
