package typingsJapgolly.angularCore.mod

import typingsJapgolly.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Stores a list of nodes which need to be removed.
  *
  * Numbers are indexes into the `LView`
  * - index > 0: `removeRNode(lView[0])`
  * - index < 0: `removeICU(~lView[0])`
  */
@js.native
trait I18nRemoveOpCodes
  extends StObject
     with Array[Double] {
  
  var __brand__ : typingsJapgolly.angularCore.angularCoreStrings.I18nRemoveOpCodes = js.native
}
