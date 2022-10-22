package typingsJapgolly.konva

import typingsJapgolly.konva.libContainerMod.Container
import typingsJapgolly.konva.libContainerMod.ContainerConfig
import typingsJapgolly.konva.libShapeMod.Shape
import typingsJapgolly.konva.libShapeMod.ShapeConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGroupMod {
  
  @JSImport("konva/lib/Group", "Group")
  @js.native
  open class Group () extends Container[Group | Shape[ShapeConfig]] {
    def this(config: ContainerConfig) = this()
  }
  
  type GroupConfig = ContainerConfig
}
