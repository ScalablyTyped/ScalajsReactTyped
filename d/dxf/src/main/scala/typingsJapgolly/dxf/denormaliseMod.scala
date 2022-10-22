package typingsJapgolly.dxf

import typingsJapgolly.dxf.handlersEntitiesMod.Entity
import typingsJapgolly.dxf.informationMod.FileInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object denormaliseMod {
  
  @JSImport("dxf/denormalise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(parsed: FileInfo): js.Array[Entity] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(parsed.asInstanceOf[js.Any]).asInstanceOf[js.Array[Entity]]
}
