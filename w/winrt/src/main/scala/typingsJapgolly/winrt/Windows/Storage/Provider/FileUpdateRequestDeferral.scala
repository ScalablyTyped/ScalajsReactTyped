package typingsJapgolly.winrt.Windows.Storage.Provider

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileUpdateRequestDeferral
  extends StObject
     with IFileUpdateRequestDeferral
object FileUpdateRequestDeferral {
  
  inline def apply(complete: Callback): FileUpdateRequestDeferral = {
    val __obj = js.Dynamic.literal(complete = complete.toJsFn)
    __obj.asInstanceOf[FileUpdateRequestDeferral]
  }
}
