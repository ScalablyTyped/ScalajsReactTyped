package typingsJapgolly.lozad

import typingsJapgolly.lozad.mod.Observer
import typingsJapgolly.lozad.mod.Options
import typingsJapgolly.lozad.mod.Selector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  inline def lozad(): Observer = js.Dynamic.global.applyDynamic("lozad")().asInstanceOf[Observer]
  inline def lozad(selector: Unit, options: Options): Observer = (js.Dynamic.global.applyDynamic("lozad")(selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Observer]
  inline def lozad(selector: Selector): Observer = js.Dynamic.global.applyDynamic("lozad")(selector.asInstanceOf[js.Any]).asInstanceOf[Observer]
  inline def lozad(selector: Selector, options: Options): Observer = (js.Dynamic.global.applyDynamic("lozad")(selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Observer]
}
