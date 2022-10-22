package typingsJapgolly.dndCore

import typingsJapgolly.dndCore.distInterfacesMod.Identifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsMatchesTypeMod {
  
  @JSImport("dnd-core/dist/utils/matchesType", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def matchesType(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("matchesType")().asInstanceOf[Boolean]
  inline def matchesType(targetType: js.Array[Identifier]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("matchesType")(targetType.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def matchesType(targetType: js.Array[Identifier], draggedItemType: Identifier): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchesType")(targetType.asInstanceOf[js.Any], draggedItemType.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def matchesType(targetType: Null, draggedItemType: Identifier): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchesType")(targetType.asInstanceOf[js.Any], draggedItemType.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def matchesType(targetType: Identifier): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("matchesType")(targetType.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def matchesType(targetType: Identifier, draggedItemType: Identifier): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchesType")(targetType.asInstanceOf[js.Any], draggedItemType.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
