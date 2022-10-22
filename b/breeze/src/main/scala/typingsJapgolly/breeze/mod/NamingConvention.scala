package typingsJapgolly.breeze.mod

import typingsJapgolly.breeze.breeze.NamingConventionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("breeze", "NamingConvention")
@js.native
open class NamingConvention protected ()
  extends StObject
     with typingsJapgolly.breeze.breeze.NamingConvention {
  def this(config: NamingConventionOptions) = this()
}
/* static members */
object NamingConvention {
  
  @JSImport("breeze", "NamingConvention")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("breeze", "NamingConvention.camelCase")
  @js.native
  def camelCase: typingsJapgolly.breeze.breeze.NamingConvention = js.native
  inline def camelCase_=(x: typingsJapgolly.breeze.breeze.NamingConvention): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("camelCase")(x.asInstanceOf[js.Any])
  
  @JSImport("breeze", "NamingConvention.defaultInstance")
  @js.native
  def defaultInstance: typingsJapgolly.breeze.breeze.NamingConvention = js.native
  inline def defaultInstance_=(x: typingsJapgolly.breeze.breeze.NamingConvention): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultInstance")(x.asInstanceOf[js.Any])
  
  @JSImport("breeze", "NamingConvention.none")
  @js.native
  def none: typingsJapgolly.breeze.breeze.NamingConvention = js.native
  inline def none_=(x: typingsJapgolly.breeze.breeze.NamingConvention): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("none")(x.asInstanceOf[js.Any])
}
