package typingsJapgolly.aframe.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object primitives {
  
  @JSImport("aframe", "primitives")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getMeshMixin(): typingsJapgolly.aframe.anon.DefaultComponents = ^.asInstanceOf[js.Dynamic].applyDynamic("getMeshMixin")().asInstanceOf[typingsJapgolly.aframe.anon.DefaultComponents]
  
  @JSImport("aframe", "primitives.primitives")
  @js.native
  def primitives: ObjectMap[Entity[ObjectMap[Component[Any, System[Any]]]]] = js.native
  inline def primitives_=(x: ObjectMap[Entity[ObjectMap[Component[Any, System[Any]]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("primitives")(x.asInstanceOf[js.Any])
}
