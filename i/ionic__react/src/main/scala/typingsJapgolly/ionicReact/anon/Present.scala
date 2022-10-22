package typingsJapgolly.ionicReact.anon

import typingsJapgolly.ionicReact.distTypesHooksHookOverlayOptionsMod.HookOverlayOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Present[OptionsType] extends StObject {
  
  def dismiss(): js.Promise[Unit] = js.native
  def dismiss(data: Any): js.Promise[Unit] = js.native
  def dismiss(data: Any, role: String): js.Promise[Unit] = js.native
  def dismiss(data: Unit, role: String): js.Promise[Unit] = js.native
  
  def present(options: OptionsType & HookOverlayOptions): js.Promise[Unit] = js.native
}
