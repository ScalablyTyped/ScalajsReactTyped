package typingsJapgolly.winrt.Windows.Storage

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetVersionDeferral
  extends StObject
     with ISetVersionDeferral
object SetVersionDeferral {
  
  inline def apply(complete: Callback): SetVersionDeferral = {
    val __obj = js.Dynamic.literal(complete = complete.toJsFn)
    __obj.asInstanceOf[SetVersionDeferral]
  }
}
