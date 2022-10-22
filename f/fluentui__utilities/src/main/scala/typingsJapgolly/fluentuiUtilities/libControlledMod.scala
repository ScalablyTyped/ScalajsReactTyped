package typingsJapgolly.fluentuiUtilities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libControlledMod {
  
  @JSImport("@fluentui/utilities/lib/controlled", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isControlled[P](props: P, valueProp: /* keyof P */ String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isControlled")(props.asInstanceOf[js.Any], valueProp.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
