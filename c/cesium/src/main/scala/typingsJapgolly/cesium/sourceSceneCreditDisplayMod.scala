package typingsJapgolly.cesium

import org.scalajs.dom.HTMLElement
import typingsJapgolly.cesium.mod.Credit
import typingsJapgolly.cesium.mod.CreditDisplay
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceSceneCreditDisplayMod {
  
  @JSImport("cesium/Source/Scene/CreditDisplay", JSImport.Default)
  @js.native
  open class default protected () extends CreditDisplay {
    def this(container: HTMLElement) = this()
    def this(container: HTMLElement, delimiter: String) = this()
    def this(container: HTMLElement, delimiter: String, viewport: HTMLElement) = this()
    def this(container: HTMLElement, delimiter: Unit, viewport: HTMLElement) = this()
  }
  /* static members */
  object default {
    
    @JSImport("cesium/Source/Scene/CreditDisplay", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Gets or sets the Cesium logo credit.
      */
    @JSImport("cesium/Source/Scene/CreditDisplay", "default.cesiumCredit")
    @js.native
    def cesiumCredit: Credit = js.native
    inline def cesiumCredit_=(x: Credit): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cesiumCredit")(x.asInstanceOf[js.Any])
  }
}
