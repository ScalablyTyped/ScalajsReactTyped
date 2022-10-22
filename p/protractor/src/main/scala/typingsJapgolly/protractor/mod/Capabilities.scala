package typingsJapgolly.protractor.mod

import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("protractor", "Capabilities")
@js.native
// region Constructors
/**
  * @param {(Capabilities|Map<string, ?>|Object)=} other Another set of
  *     capabilities to initialize this instance from.
  */
open class Capabilities ()
  extends typingsJapgolly.seleniumWebdriver.mod.Capabilities {
  def this(other: js.Object) = this()
  def this(other: typingsJapgolly.seleniumWebdriver.libCapabilitiesMod.Capabilities) = this()
  def this(other: Map[String, Any]) = this()
}
/* static members */
object Capabilities {
  
  @JSImport("protractor", "Capabilities")
  @js.native
  val ^ : js.Any = js.native
  
  // endregion
  // region Static Methods
  /**
    * @return {!Capabilities} A basic set of capabilities for Chrome.
    */
  inline def chrome(): typingsJapgolly.seleniumWebdriver.libCapabilitiesMod.Capabilities = ^.asInstanceOf[js.Dynamic].applyDynamic("chrome")().asInstanceOf[typingsJapgolly.seleniumWebdriver.libCapabilitiesMod.Capabilities]
  
  /**
    * @return {!Capabilities} A basic set of capabilities for Microsoft Edge.
    */
  inline def edge(): typingsJapgolly.seleniumWebdriver.libCapabilitiesMod.Capabilities = ^.asInstanceOf[js.Dynamic].applyDynamic("edge")().asInstanceOf[typingsJapgolly.seleniumWebdriver.libCapabilitiesMod.Capabilities]
  
  /**
    * @return {!Capabilities} A basic set of capabilities for Firefox.
    */
  inline def firefox(): typingsJapgolly.seleniumWebdriver.libCapabilitiesMod.Capabilities = ^.asInstanceOf[js.Dynamic].applyDynamic("firefox")().asInstanceOf[typingsJapgolly.seleniumWebdriver.libCapabilitiesMod.Capabilities]
  
  /**
    * @return {!Capabilities} A basic set of capabilities for
    *     Internet Explorer.
    */
  inline def ie(): typingsJapgolly.seleniumWebdriver.libCapabilitiesMod.Capabilities = ^.asInstanceOf[js.Dynamic].applyDynamic("ie")().asInstanceOf[typingsJapgolly.seleniumWebdriver.libCapabilitiesMod.Capabilities]
  
  /**
    * @return {!Capabilities} A basic set of capabilities for Safari.
    */
  inline def safari(): typingsJapgolly.seleniumWebdriver.libCapabilitiesMod.Capabilities = ^.asInstanceOf[js.Dynamic].applyDynamic("safari")().asInstanceOf[typingsJapgolly.seleniumWebdriver.libCapabilitiesMod.Capabilities]
}
