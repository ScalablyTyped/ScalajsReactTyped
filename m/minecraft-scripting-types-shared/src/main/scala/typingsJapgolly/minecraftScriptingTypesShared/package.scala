package typingsJapgolly.minecraftScriptingTypesShared

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Dimension = MinecraftDimension | String

type EntityId = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.minecraftScriptingTypesShared.IEventData[scala.Any]
  - typingsJapgolly.minecraftScriptingTypesShared.IEntity
  - typingsJapgolly.minecraftScriptingTypesShared.ILevel
  - typingsJapgolly.minecraftScriptingTypesShared.IComponent[scala.Any]
  - typingsJapgolly.minecraftScriptingTypesShared.IQuery
  - typingsJapgolly.minecraftScriptingTypesShared.IItemStack
  - typingsJapgolly.minecraftScriptingTypesShared.IBlock
  - typingsJapgolly.minecraftScriptingTypesShared.ITickingArea
*/
type IMinecraftObject = _IMinecraftObject | IEventData[Any] | IComponent[Any]

type ParticleEffect = MinecraftParticleEffect | String

type VectorArray = js.Tuple3[Double, Double, Double]
