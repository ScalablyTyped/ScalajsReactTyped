package typingsJapgolly.jestHasteMap

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.jestHasteMap.moduleMapMod.ModuleMap
import typingsJapgolly.jestHasteMap.moduleMapMod.SerializableModuleMap
import typingsJapgolly.jestHasteMap.moduleMapMod.default
import typingsJapgolly.jestHasteMap.typesMod.RawModuleMap
import typingsJapgolly.jestTypes.configMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofHasteModuleMap extends Instantiable1[/* raw */ RawModuleMap, default] {
  var mapFromArrayRecursive: js.Any = js.native
  var mapToArrayRecursive: js.Any = js.native
  def create(rootDir: Path): ModuleMap = js.native
  def fromJSON(serializableModuleMap: SerializableModuleMap): ModuleMap = js.native
}

