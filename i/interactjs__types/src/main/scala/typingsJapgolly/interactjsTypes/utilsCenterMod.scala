package typingsJapgolly.interactjsTypes

import typingsJapgolly.interactjsTypes.anon.X
import typingsJapgolly.interactjsTypes.coreTypesMod.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsCenterMod {
  
  @JSImport("@interactjs/utils/center", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(rect: Rect): X = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(rect.asInstanceOf[js.Any]).asInstanceOf[X]
}
