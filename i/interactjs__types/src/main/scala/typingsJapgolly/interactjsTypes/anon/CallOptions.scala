package typingsJapgolly.interactjsTypes.anon

import typingsJapgolly.interactjsTypes.interactjsTypesStrings.restrictSize
import typingsJapgolly.interactjsTypes.modifiersRestrictEdgesMod.RestrictEdgesState
import typingsJapgolly.interactjsTypes.modifiersRestrictSizeMod.RestrictSizeOptions
import typingsJapgolly.interactjsTypes.modifiersTypesMod.Modifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallOptions extends StObject {
  
  def apply(): Modifier[RestrictSizeOptions, RestrictEdgesState, restrictSize, Unit] = js.native
  def apply(_options: PartialRestrictSizeOption): Modifier[RestrictSizeOptions, RestrictEdgesState, restrictSize, Unit] = js.native
  
  var _defaults: RestrictSizeOptions = js.native
  
  var _methods: SetStartStop = js.native
}
