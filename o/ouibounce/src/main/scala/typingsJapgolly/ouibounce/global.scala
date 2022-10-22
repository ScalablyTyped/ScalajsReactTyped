package typingsJapgolly.ouibounce

import org.scalajs.dom.Element
import typingsJapgolly.ouibounce.mod.Ouibounce
import typingsJapgolly.ouibounce.mod.OuibounceConfig
import typingsJapgolly.ouibounce.ouibounceBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  inline def ouibounce(): Ouibounce = js.Dynamic.global.applyDynamic("ouibounce")().asInstanceOf[Ouibounce]
  inline def ouibounce(el: Element): Ouibounce = js.Dynamic.global.applyDynamic("ouibounce")(el.asInstanceOf[js.Any]).asInstanceOf[Ouibounce]
  inline def ouibounce(el: Element, custom_config: OuibounceConfig): Ouibounce = (js.Dynamic.global.applyDynamic("ouibounce")(el.asInstanceOf[js.Any], custom_config.asInstanceOf[js.Any])).asInstanceOf[Ouibounce]
  inline def ouibounce(el: Null, custom_config: OuibounceConfig): Ouibounce = (js.Dynamic.global.applyDynamic("ouibounce")(el.asInstanceOf[js.Any], custom_config.asInstanceOf[js.Any])).asInstanceOf[Ouibounce]
  inline def ouibounce(el: `false`): Ouibounce = js.Dynamic.global.applyDynamic("ouibounce")(el.asInstanceOf[js.Any]).asInstanceOf[Ouibounce]
  inline def ouibounce(el: `false`, custom_config: OuibounceConfig): Ouibounce = (js.Dynamic.global.applyDynamic("ouibounce")(el.asInstanceOf[js.Any], custom_config.asInstanceOf[js.Any])).asInstanceOf[Ouibounce]
}
