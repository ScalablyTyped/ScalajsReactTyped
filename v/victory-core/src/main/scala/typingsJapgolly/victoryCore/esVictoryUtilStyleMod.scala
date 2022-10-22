package typingsJapgolly.victoryCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esVictoryUtilStyleMod {
  
  @JSImport("victory-core/es/victory-util/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getColorScale(name: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getColorScale")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def toTransformString(obj: Any, more: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toTransformString")(scala.List(obj.asInstanceOf[js.Any]).`++`(more.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
}
