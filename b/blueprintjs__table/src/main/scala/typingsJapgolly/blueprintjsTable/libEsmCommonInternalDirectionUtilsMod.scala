package typingsJapgolly.blueprintjsTable

import typingsJapgolly.blueprintjsTable.libEsmCommonDirectionMod.Direction
import typingsJapgolly.blueprintjsTable.libEsmCommonMovementDeltaMod.IMovementDelta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmCommonInternalDirectionUtilsMod {
  
  @JSImport("@blueprintjs/table/lib/esm/common/internal/directionUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def directionToDelta(direction: Direction): IMovementDelta = ^.asInstanceOf[js.Dynamic].applyDynamic("directionToDelta")(direction.asInstanceOf[js.Any]).asInstanceOf[IMovementDelta]
}
