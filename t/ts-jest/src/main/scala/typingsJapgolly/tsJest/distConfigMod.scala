package typingsJapgolly.tsJest

import typingsJapgolly.tsJest.anon.Prefix
import typingsJapgolly.tsJest.distConfigPathsToModuleNameMapperMod.JestPathMapping
import typingsJapgolly.typescript.mod.MapLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distConfigMod {
  
  @JSImport("ts-jest/dist/config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def pathsToModuleNameMapper(mapping: MapLike[js.Array[String]]): JestPathMapping = ^.asInstanceOf[js.Dynamic].applyDynamic("pathsToModuleNameMapper")(mapping.asInstanceOf[js.Any]).asInstanceOf[JestPathMapping]
  inline def pathsToModuleNameMapper(mapping: MapLike[js.Array[String]], hasPrefix: Prefix): JestPathMapping = (^.asInstanceOf[js.Dynamic].applyDynamic("pathsToModuleNameMapper")(mapping.asInstanceOf[js.Any], hasPrefix.asInstanceOf[js.Any])).asInstanceOf[JestPathMapping]
}
