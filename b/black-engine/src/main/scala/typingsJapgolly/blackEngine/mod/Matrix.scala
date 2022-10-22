package typingsJapgolly.blackEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("black-engine", "Matrix")
@js.native
open class Matrix protected ()
  extends typingsJapgolly.blackEngine.geomMatrixMod.Matrix {
  def this(
    a: js.UndefOr[Double],
    b: js.UndefOr[Double],
    c: js.UndefOr[Double],
    d: js.UndefOr[Double],
    tx: js.UndefOr[Double],
    ty: js.UndefOr[Double]
  ) = this()
}
object Matrix {
  
  @JSImport("black-engine", "Matrix.__cache")
  @js.native
  val cache: typingsJapgolly.blackEngine.geomMatrixMod.Matrix = js.native
  
  @JSImport("black-engine", "Matrix.__identity")
  @js.native
  val identity: typingsJapgolly.blackEngine.geomMatrixMod.Matrix = js.native
  
  @JSImport("black-engine", "Matrix.pool")
  @js.native
  val pool: typingsJapgolly.blackEngine.utilsObjectPoolMod.ObjectPool = js.native
}
