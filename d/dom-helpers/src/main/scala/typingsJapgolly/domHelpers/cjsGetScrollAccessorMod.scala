package typingsJapgolly.domHelpers

import typingsJapgolly.domHelpers.anon.FnCall
import typingsJapgolly.domHelpers.domHelpersStrings.pageXOffset
import typingsJapgolly.domHelpers.domHelpersStrings.pageYOffset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsGetScrollAccessorMod {
  
  @JSImport("dom-helpers/cjs/getScrollAccessor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(offset: pageXOffset | pageYOffset): FnCall = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(offset.asInstanceOf[js.Any]).asInstanceOf[FnCall]
}
