package typingsJapgolly.dxf

import typingsJapgolly.dxf.informationMod.FileInfo
import typingsJapgolly.dxf.informationMod.Polyline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toPolylinesMod {
  
  @JSImport("dxf/toPolylines", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(parsed: FileInfo): js.Array[Polyline] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(parsed.asInstanceOf[js.Any]).asInstanceOf[js.Array[Polyline]]
}
