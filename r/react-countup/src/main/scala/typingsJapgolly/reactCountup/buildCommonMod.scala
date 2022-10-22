package typingsJapgolly.reactCountup

import org.scalajs.dom.HTMLElement
import typingsJapgolly.countupJs.mod.CountUp
import typingsJapgolly.reactCountup.buildTypesMod.CountUpInstanceProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildCommonMod {
  
  @JSImport("react-countup/build/common", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createCountUpInstance(el: String, props: CountUpInstanceProps): CountUp = (^.asInstanceOf[js.Dynamic].applyDynamic("createCountUpInstance")(el.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[CountUp]
  inline def createCountUpInstance(el: HTMLElement, props: CountUpInstanceProps): CountUp = (^.asInstanceOf[js.Dynamic].applyDynamic("createCountUpInstance")(el.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[CountUp]
}
