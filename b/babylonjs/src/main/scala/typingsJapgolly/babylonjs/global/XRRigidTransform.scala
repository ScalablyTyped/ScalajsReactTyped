package typingsJapgolly.babylonjs.global

import typingsJapgolly.std.DOMPointInit
import typingsJapgolly.std.DOMPointReadOnly
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A transform described by a position and orientation. When interpreting an
  * XRRigidTransform the orientation is always applied prior to the position.
  *
  * ref: https://immersive-web.github.io/webxr/#xrrigidtransform-interface
  */
@JSGlobal("XRRigidTransform")
@js.native
open class XRRigidTransform ()
  extends StObject
     with typingsJapgolly.babylonjs.XRRigidTransform {
  def this(position: DOMPointInit) = this()
  def this(position: Unit, direction: DOMPointInit) = this()
  def this(position: DOMPointInit, direction: DOMPointInit) = this()
  
  /* CompleteClass */
  override val inverse: typingsJapgolly.babylonjs.XRRigidTransform = js.native
  
  /* CompleteClass */
  override val matrix: js.typedarray.Float32Array = js.native
  
  /* CompleteClass */
  override val orientation: DOMPointReadOnly = js.native
  
  /* CompleteClass */
  override val position: DOMPointReadOnly = js.native
}
