package typingsJapgolly.angularOdataResources.OData

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProviderCallback[T] extends StObject {
  
  def apply(queryString: String, success: js.Function0[Any], error: js.Function0[Any]): T = js.native
  def apply(
    queryString: String,
    success: js.Function0[Any],
    error: js.Function0[Any],
    isSingleElement: Boolean
  ): T = js.native
  def apply(
    queryString: String,
    success: js.Function0[Any],
    error: js.Function0[Any],
    isSingleElement: Boolean,
    forceSingleElement: Boolean
  ): T = js.native
  def apply(
    queryString: String,
    success: js.Function0[Any],
    error: js.Function0[Any],
    isSingleElement: Unit,
    forceSingleElement: Boolean
  ): T = js.native
}
