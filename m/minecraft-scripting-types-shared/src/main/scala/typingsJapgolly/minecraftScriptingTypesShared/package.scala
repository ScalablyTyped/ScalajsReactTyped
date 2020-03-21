package typingsJapgolly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object minecraftScriptingTypesShared {
  type Dimension = typingsJapgolly.minecraftScriptingTypesShared.MinecraftDimension | java.lang.String
  type EntityId = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.minecraftScriptingTypesShared.IEventData[js.Any]
    - typingsJapgolly.minecraftScriptingTypesShared.IEntity
    - typingsJapgolly.minecraftScriptingTypesShared.ILevel
    - typingsJapgolly.minecraftScriptingTypesShared.IComponent[js.Any]
    - typingsJapgolly.minecraftScriptingTypesShared.IQuery
    - typingsJapgolly.minecraftScriptingTypesShared.IItemStack
    - typingsJapgolly.minecraftScriptingTypesShared.IBlock
    - typingsJapgolly.minecraftScriptingTypesShared.ITickingArea
  */
  type IMinecraftObject = typingsJapgolly.minecraftScriptingTypesShared._IMinecraftObject | typingsJapgolly.minecraftScriptingTypesShared.IEventData[js.Any] | typingsJapgolly.minecraftScriptingTypesShared.IComponent[js.Any]
  type ParticleEffect = typingsJapgolly.minecraftScriptingTypesShared.MinecraftParticleEffect | java.lang.String
  type VectorArray = js.Tuple3[scala.Double, scala.Double, scala.Double]
}
