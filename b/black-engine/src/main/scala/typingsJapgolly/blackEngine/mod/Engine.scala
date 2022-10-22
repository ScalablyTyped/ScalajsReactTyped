package typingsJapgolly.blackEngine.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable3
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("black-engine", "Engine")
@js.native
open class Engine protected ()
  extends typingsJapgolly.blackEngine.engineMod.Engine {
  def this(
    containerElementId: String,
    gameClass: Instantiable0[typingsJapgolly.blackEngine.coreGameObjectMod.GameObject],
    videoDriverClass: Instantiable3[
        /* arg1 */ HTMLElement, 
        /* arg2 */ Double, 
        /* arg3 */ Double, 
        typingsJapgolly.blackEngine.driversVideoNullDriverMod.VideoNullDriver
      ]
  ) = this()
  def this(
    containerElementId: String,
    gameClass: Instantiable0[typingsJapgolly.blackEngine.coreGameObjectMod.GameObject],
    videoDriverClass: Instantiable3[
        /* arg1 */ HTMLElement, 
        /* arg2 */ Double, 
        /* arg3 */ Double, 
        typingsJapgolly.blackEngine.driversVideoNullDriverMod.VideoNullDriver
      ],
    systemClasses: js.Array[Instantiable0[typingsJapgolly.blackEngine.coreSystemMod.System]]
  ) = this()
}
