package typingsJapgolly.interactjsTypes.anon

import typingsJapgolly.interactjsTypes.interactjsTypesStrings.snap
import typingsJapgolly.interactjsTypes.modifiersSnapPointerMod.SnapOptions
import typingsJapgolly.interactjsTypes.modifiersSnapPointerMod.SnapState
import typingsJapgolly.interactjsTypes.modifiersTypesMod.Modifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultsSnapOptions extends StObject {
  
  def apply(): Modifier[SnapOptions, SnapState, snap, Delta] = js.native
  def apply(_options: PartialSnapOptions): Modifier[SnapOptions, SnapState, snap, Delta] = js.native
  
  var _defaults: SnapOptions = js.native
  
  var _methods: SetStart = js.native
}
