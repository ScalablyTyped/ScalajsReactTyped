package typingsJapgolly.coreJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fnSetTimeoutMod {
  
  /* was `typeof core.setTimeout` */
  inline def apply(handler: Any, timeout: Any, args: Any*): Double = (^.asInstanceOf[js.Dynamic].apply((scala.List(handler.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Double]
  inline def apply(handler: Any, timeout: Unit, args: Any*): Double = (^.asInstanceOf[js.Dynamic].apply((scala.List(handler.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Double]
  
  @JSImport("core-js/fn/set-timeout", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
