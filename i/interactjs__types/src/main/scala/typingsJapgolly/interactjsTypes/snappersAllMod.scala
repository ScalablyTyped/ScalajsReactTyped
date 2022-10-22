package typingsJapgolly.interactjsTypes

import typingsJapgolly.interactjsTypes.anon.CoordFields
import typingsJapgolly.interactjsTypes.modifiersSnapPointerMod.SnapFunction
import typingsJapgolly.interactjsTypes.snappersGridMod.GridOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object snappersAllMod {
  
  @JSImport("@interactjs/snappers/all", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def edgeTarget(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("edgeTarget")().asInstanceOf[Unit]
  
  inline def elements(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("elements")().asInstanceOf[Unit]
  
  inline def grid(grid: GridOptions): SnapFunction & CoordFields = ^.asInstanceOf[js.Dynamic].applyDynamic("grid")(grid.asInstanceOf[js.Any]).asInstanceOf[SnapFunction & CoordFields]
}
