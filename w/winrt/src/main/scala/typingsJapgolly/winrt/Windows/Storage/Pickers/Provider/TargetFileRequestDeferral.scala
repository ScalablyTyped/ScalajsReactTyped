package typingsJapgolly.winrt.Windows.Storage.Pickers.Provider

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetFileRequestDeferral
  extends StObject
     with ITargetFileRequestDeferral
object TargetFileRequestDeferral {
  
  inline def apply(complete: Callback): TargetFileRequestDeferral = {
    val __obj = js.Dynamic.literal(complete = complete.toJsFn)
    __obj.asInstanceOf[TargetFileRequestDeferral]
  }
}
