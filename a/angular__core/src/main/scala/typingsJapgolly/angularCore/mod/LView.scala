package typingsJapgolly.angularCore.mod

import typingsJapgolly.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * `LView` stores all of the information needed to process the instructions as
  * they are invoked from the template. Each embedded view and component view has its
  * own `LView`. When processing a particular view, we set the `viewData` to that
  * `LView`. When that view is done processing, the `viewData` is set back to
  * whatever the original `viewData` was before (the parent `LView`).
  *
  * Keeping separate state for each view facilities view insertion / deletion, so we
  * don't have to edit the data array based on which views are present.
  */
@js.native
trait LView[T]
  extends StObject
     with Array[Any] {
  
  /**
    * Human readable representation of the `LView`.
    *
    * NOTE: This property only exists if `ngDevMode` is set to `true` and it is not present in
    * production. Its presence is purely to help debug issue in development, and should not be relied
    * on in production application.
    */
  var debug: js.UndefOr[LViewDebug[Any]] = js.native
}
