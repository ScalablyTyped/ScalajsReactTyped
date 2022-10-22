package typingsJapgolly.lesgo

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsDbMod extends Shortcut {
  
  @JSImport("lesgo/utils/db", JSImport.Default)
  @js.native
  val default: typingsJapgolly.lesgo.servicesAuroraDbServiceMod.default | typingsJapgolly.lesgo.servicesAuroraDbRDSProxyServiceMod.default = js.native
  
  type _To = typingsJapgolly.lesgo.servicesAuroraDbServiceMod.default | typingsJapgolly.lesgo.servicesAuroraDbRDSProxyServiceMod.default
  
  /* This means you don't have to write `default`, but can instead just say `utilsDbMod.foo` */
  override def _to: typingsJapgolly.lesgo.servicesAuroraDbServiceMod.default | typingsJapgolly.lesgo.servicesAuroraDbRDSProxyServiceMod.default = default
}
