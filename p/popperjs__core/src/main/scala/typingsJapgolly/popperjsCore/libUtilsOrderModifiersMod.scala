package typingsJapgolly.popperjsCore

import typingsJapgolly.popperjsCore.libTypesMod.Modifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsOrderModifiersMod {
  
  @JSImport("@popperjs/core/lib/utils/orderModifiers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(modifiers: js.Array[Modifier[Any, Any]]): js.Array[Modifier[Any, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(modifiers.asInstanceOf[js.Any]).asInstanceOf[js.Array[Modifier[Any, Any]]]
}
