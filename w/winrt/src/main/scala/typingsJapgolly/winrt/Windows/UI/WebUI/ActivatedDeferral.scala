package typingsJapgolly.winrt.Windows.UI.WebUI

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivatedDeferral
  extends StObject
     with IActivatedDeferral
object ActivatedDeferral {
  
  inline def apply(complete: Callback): ActivatedDeferral = {
    val __obj = js.Dynamic.literal(complete = complete.toJsFn)
    __obj.asInstanceOf[ActivatedDeferral]
  }
}
