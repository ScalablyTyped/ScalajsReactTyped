package typingsJapgolly.activexLibreoffice.com_.sun.star.drawing.framework

import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The ResourceActivationMode specifies, for example for the {@link com.sun.star.drawing.framework.XConfigurationController.requestResourceActivation()}
  * , whether a requested resource is to replace an existing resource of the same class or is to be activated additionally.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
*/
trait ResourceActivationMode extends StObject
object ResourceActivationMode {
  
  /** A resource is requested in addition to already existing ones. This is used for example for panes. */
  inline def ADD: `0` = 0.asInstanceOf[`0`]
  
  /** A resource is requested to replace an already existing one of the same class. This is used for example for views. */
  inline def REPLACE: `1` = 1.asInstanceOf[`1`]
}
