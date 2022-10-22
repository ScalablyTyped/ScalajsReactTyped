package typingsJapgolly.blackEngine.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("black-engine", "GameObject")
@js.native
open class GameObject ()
  extends typingsJapgolly.blackEngine.coreGameObjectMod.GameObject
/* static members */
object GameObject {
  
  @JSImport("black-engine", "GameObject")
  @js.native
  val ^ : js.Any = js.native
  
  inline def find(name: String): typingsJapgolly.blackEngine.coreGameObjectMod.GameObject = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(name.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.blackEngine.coreGameObjectMod.GameObject]
  inline def find(name: String, node: typingsJapgolly.blackEngine.coreGameObjectMod.GameObject): typingsJapgolly.blackEngine.coreGameObjectMod.GameObject = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(name.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.blackEngine.coreGameObjectMod.GameObject]
  
  inline def findById(id: Double): typingsJapgolly.blackEngine.coreGameObjectMod.GameObject = ^.asInstanceOf[js.Dynamic].applyDynamic("findById")(id.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.blackEngine.coreGameObjectMod.GameObject]
  inline def findById(id: Double, node: typingsJapgolly.blackEngine.coreGameObjectMod.GameObject): typingsJapgolly.blackEngine.coreGameObjectMod.GameObject = (^.asInstanceOf[js.Dynamic].applyDynamic("findById")(id.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.blackEngine.coreGameObjectMod.GameObject]
  
  inline def findComponents(
    gameObject: typingsJapgolly.blackEngine.coreGameObjectMod.GameObject,
    `type`: Instantiable0[typingsJapgolly.blackEngine.coreComponentMod.Component]
  ): js.Array[typingsJapgolly.blackEngine.coreComponentMod.Component] = (^.asInstanceOf[js.Dynamic].applyDynamic("findComponents")(gameObject.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsJapgolly.blackEngine.coreComponentMod.Component]]
  
  inline def findWithTag(tag: String): js.Array[typingsJapgolly.blackEngine.coreGameObjectMod.GameObject] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("findWithTag")(tag.asInstanceOf[js.Any]).asInstanceOf[js.Array[typingsJapgolly.blackEngine.coreGameObjectMod.GameObject] | Null]
  
  inline def forEach(
    gameObject: typingsJapgolly.blackEngine.coreGameObjectMod.GameObject,
    action: js.Function1[/* arg0 */ this.type, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(gameObject.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getBoundsWithPoints(points: js.Array[Double], worldTransformation: typingsJapgolly.blackEngine.geomMatrixMod.Matrix): typingsJapgolly.blackEngine.geomRectangleMod.Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("getBoundsWithPoints")(points.asInstanceOf[js.Any], worldTransformation.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.blackEngine.geomRectangleMod.Rectangle]
  inline def getBoundsWithPoints(
    points: js.Array[Double],
    worldTransformation: typingsJapgolly.blackEngine.geomMatrixMod.Matrix,
    outRect: typingsJapgolly.blackEngine.geomRectangleMod.Rectangle
  ): typingsJapgolly.blackEngine.geomRectangleMod.Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("getBoundsWithPoints")(points.asInstanceOf[js.Any], worldTransformation.asInstanceOf[js.Any], outRect.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.blackEngine.geomRectangleMod.Rectangle]
  
  inline def intersects(
    gameObject: typingsJapgolly.blackEngine.coreGameObjectMod.GameObject,
    point: typingsJapgolly.blackEngine.geomVectorMod.Vector
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("intersects")(gameObject.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def intersectsAt(
    gameObject: typingsJapgolly.blackEngine.coreGameObjectMod.GameObject,
    point: typingsJapgolly.blackEngine.geomVectorMod.Vector
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("intersectsAt")(gameObject.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def intersectsAt(
    gameObject: typingsJapgolly.blackEngine.coreGameObjectMod.GameObject,
    point: typingsJapgolly.blackEngine.geomVectorMod.Vector,
    outVector: typingsJapgolly.blackEngine.geomVectorMod.Vector
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("intersectsAt")(gameObject.asInstanceOf[js.Any], point.asInstanceOf[js.Any], outVector.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def intersectsWith(
    gameObject: typingsJapgolly.blackEngine.coreGameObjectMod.GameObject,
    point: typingsJapgolly.blackEngine.geomVectorMod.Vector
  ): typingsJapgolly.blackEngine.coreGameObjectMod.GameObject | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("intersectsWith")(gameObject.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.blackEngine.coreGameObjectMod.GameObject | Null]
}
