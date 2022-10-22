package typingsJapgolly.rxjsCompat.anon

import typingsJapgolly.rxjs.distTypesInternalTypesMod.ObservableInput
import typingsJapgolly.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallThisSelector extends StObject {
  
  def apply[T, R](selector: js.Function2[/* err */ Any, /* caught */ Observable_[T], ObservableInput[R]]): Observable_[T | R] = js.native
}
