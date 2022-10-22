package typingsJapgolly.cannon.CANNON

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Vec3Pool
  extends StObject
     with Pool
object Vec3Pool {
  
  inline def apply(
    constructObject: CallbackTo[Any],
    get: CallbackTo[Any],
    objects: js.Array[Any],
    release: CallbackTo[Any],
    `type`: js.Array[Any]
  ): Vec3Pool = {
    val __obj = js.Dynamic.literal(constructObject = constructObject.toJsFn, get = get.toJsFn, objects = objects.asInstanceOf[js.Any], release = release.toJsFn)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vec3Pool]
  }
}
