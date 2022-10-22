package typingsJapgolly.winrt.Windows.Media.PlayTo

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlayToSourceDeferral
  extends StObject
     with IPlayToSourceDeferral
object PlayToSourceDeferral {
  
  inline def apply(complete: Callback): PlayToSourceDeferral = {
    val __obj = js.Dynamic.literal(complete = complete.toJsFn)
    __obj.asInstanceOf[PlayToSourceDeferral]
  }
}
