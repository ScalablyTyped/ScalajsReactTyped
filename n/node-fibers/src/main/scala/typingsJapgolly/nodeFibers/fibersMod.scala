package typingsJapgolly.nodeFibers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fibersMod {
  
  inline def apply(fn: js.Function): Fiber = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[Fiber]
  
  @JSImport("fibers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fibers", "current")
  @js.native
  def current: Fiber = js.native
  inline def current_=(x: Fiber): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("current")(x.asInstanceOf[js.Any])
  
  inline def `yield`(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("yield")().asInstanceOf[Any]
  inline def `yield`(value: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("yield")(value.asInstanceOf[js.Any]).asInstanceOf[Any]
}
