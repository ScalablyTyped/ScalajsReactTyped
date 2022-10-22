package typingsJapgolly.dndCore

import typingsJapgolly.dndCore.distInterfacesMod.XYCoord
import typingsJapgolly.dndCore.distReducersDragOffsetMod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsCoordsMod {
  
  @JSImport("dnd-core/dist/utils/coords", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def add(a: XYCoord, b: XYCoord): XYCoord = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[XYCoord]
  
  inline def getDifferenceFromInitialOffset(state: State): XYCoord | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getDifferenceFromInitialOffset")(state.asInstanceOf[js.Any]).asInstanceOf[XYCoord | Null]
  
  inline def getSourceClientOffset(state: State): XYCoord | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getSourceClientOffset")(state.asInstanceOf[js.Any]).asInstanceOf[XYCoord | Null]
  
  inline def subtract(a: XYCoord, b: XYCoord): XYCoord = (^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[XYCoord]
}
