package typingsJapgolly.blackEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("black-engine", "Vector")
@js.native
open class Vector ()
  extends typingsJapgolly.blackEngine.geomVectorMod.Vector {
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Unit, y: Double) = this()
}
/* static members */
object Vector {
  
  @JSImport("black-engine", "Vector")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("black-engine", "Vector.__cache")
  @js.native
  val cache: typingsJapgolly.blackEngine.geomVectorMod.Vector = js.native
  
  inline def fromAngle(angle: Double): typingsJapgolly.blackEngine.geomVectorMod.Vector = ^.asInstanceOf[js.Dynamic].applyDynamic("fromAngle")(angle.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.blackEngine.geomVectorMod.Vector]
  inline def fromAngle(angle: Double, outVector: typingsJapgolly.blackEngine.geomVectorMod.Vector): typingsJapgolly.blackEngine.geomVectorMod.Vector = (^.asInstanceOf[js.Dynamic].applyDynamic("fromAngle")(angle.asInstanceOf[js.Any], outVector.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.blackEngine.geomVectorMod.Vector]
  
  @JSImport("black-engine", "Vector.pool")
  @js.native
  val pool: typingsJapgolly.blackEngine.utilsObjectPoolMod.ObjectPool = js.native
  
  inline def randomRange(
    vectorMin: typingsJapgolly.blackEngine.geomVectorMod.Vector,
    vectorMax: typingsJapgolly.blackEngine.geomVectorMod.Vector
  ): typingsJapgolly.blackEngine.geomVectorMod.Vector = (^.asInstanceOf[js.Dynamic].applyDynamic("randomRange")(vectorMin.asInstanceOf[js.Any], vectorMax.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.blackEngine.geomVectorMod.Vector]
  inline def randomRange(
    vectorMin: typingsJapgolly.blackEngine.geomVectorMod.Vector,
    vectorMax: typingsJapgolly.blackEngine.geomVectorMod.Vector,
    outVector: typingsJapgolly.blackEngine.geomVectorMod.Vector
  ): typingsJapgolly.blackEngine.geomVectorMod.Vector = (^.asInstanceOf[js.Dynamic].applyDynamic("randomRange")(vectorMin.asInstanceOf[js.Any], vectorMax.asInstanceOf[js.Any], outVector.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.blackEngine.geomVectorMod.Vector]
}
